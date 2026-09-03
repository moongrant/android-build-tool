package com.jeremyliao.liveeventbus.core;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ExternalLiveData;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.ipc.consts.IpcConst;
import com.jeremyliao.liveeventbus.ipc.core.ProcessorManager;
import com.jeremyliao.liveeventbus.ipc.receiver.LebIpcReceiver;
import com.jeremyliao.liveeventbus.logger.DefaultLogger;
import com.jeremyliao.liveeventbus.logger.Logger;
import com.jeremyliao.liveeventbus.logger.LoggerManager;
import com.jeremyliao.liveeventbus.utils.AppUtils;
import com.jeremyliao.liveeventbus.utils.ThreadUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveEventBusCore {
    private boolean autoClear;
    private final Map<String, LiveEvent<Object>> bus;
    private final Config config;
    final InnerConsole console;
    private boolean isRegisterReceiver;
    private boolean lifecycleObserverAlwaysActive;
    private LoggerManager logger;
    private final Map<String, ObservableConfig> observableConfigs;
    private LebIpcReceiver receiver;

    public class InnerConsole {
        public InnerConsole() {
        }

        private int getActiveCount(LiveData liveData) {
            try {
                Field declaredField = LiveData.class.getDeclaredField("mActiveCount");
                declaredField.setAccessible(true);
                return ((Integer) declaredField.get(liveData)).intValue();
            } catch (Exception unused) {
                return -1;
            }
        }

        private int getObserverCount(LiveData liveData) {
            try {
                Field declaredField = LiveData.class.getDeclaredField("mObservers");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(liveData);
                Method declaredMethod = obj.getClass().getDeclaredMethod("size", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Integer) declaredMethod.invoke(obj, new Object[0])).intValue();
            } catch (Exception unused) {
                return -1;
            }
        }

        private String getObserverInfo(LiveData liveData) {
            try {
                Field declaredField = LiveData.class.getDeclaredField("mObservers");
                declaredField.setAccessible(true);
                return declaredField.get(liveData).toString();
            } catch (Exception unused) {
                return "";
            }
        }

        public String getBaseInfo() {
            return "lifecycleObserverAlwaysActive: " + LiveEventBusCore.this.lifecycleObserverAlwaysActive + "\nautoClear: " + LiveEventBusCore.this.autoClear + "\nlogger enable: " + LiveEventBusCore.this.logger.isEnable() + "\nlogger: " + LiveEventBusCore.this.logger.getLogger() + "\nReceiver register: " + LiveEventBusCore.this.isRegisterReceiver + "\nApplication: " + AppUtils.getApp() + "\n";
        }

        public String getBusInfo() {
            StringBuilder sb = new StringBuilder();
            for (String str : LiveEventBusCore.this.bus.keySet()) {
                sb.append("Event name: " + str);
                sb.append("\n");
                LiveEvent.LifecycleLiveData lifecycleLiveData = ((LiveEvent) LiveEventBusCore.this.bus.get(str)).liveData;
                sb.append("\tversion: " + lifecycleLiveData.getVersion());
                sb.append("\n");
                sb.append("\thasActiveObservers: " + lifecycleLiveData.hasActiveObservers());
                sb.append("\n");
                sb.append("\thasObservers: " + lifecycleLiveData.hasObservers());
                sb.append("\n");
                sb.append("\tActiveCount: " + getActiveCount(lifecycleLiveData));
                sb.append("\n");
                sb.append("\tObserverCount: " + getObserverCount(lifecycleLiveData));
                sb.append("\n\tObservers: \n");
                sb.append("\t\t" + getObserverInfo(lifecycleLiveData));
                sb.append("\n");
            }
            return sb.toString();
        }

        public String getConsoleInfo() {
            return "*********Base info*********\n" + getBaseInfo() + "*********Event info*********\n" + getBusInfo();
        }
    }

    public class LiveEvent<T> implements Observable<T> {

        @NonNull
        private final String key;
        private final LiveEvent<T>.LifecycleLiveData<T> liveData;
        private final Map<Observer, ObserverWrapper<T>> observerMap = new HashMap();
        private final Handler mainHandler = new Handler(Looper.getMainLooper());

        public class LifecycleLiveData<T> extends ExternalLiveData<T> {
            private final String key;

            public LifecycleLiveData(String str) {
                this.key = str;
            }

            private boolean autoClear() {
                Boolean bool;
                return (!LiveEventBusCore.this.observableConfigs.containsKey(this.key) || (bool = ((ObservableConfig) LiveEventBusCore.this.observableConfigs.get(this.key)).autoClear) == null) ? LiveEventBusCore.this.autoClear : bool.booleanValue();
            }

            private boolean lifecycleObserverAlwaysActive() {
                Boolean bool;
                return (!LiveEventBusCore.this.observableConfigs.containsKey(this.key) || (bool = ((ObservableConfig) LiveEventBusCore.this.observableConfigs.get(this.key)).lifecycleObserverAlwaysActive) == null) ? LiveEventBusCore.this.lifecycleObserverAlwaysActive : bool.booleanValue();
            }

            @Override // androidx.lifecycle.ExternalLiveData
            public Lifecycle.State observerActiveLevel() {
                return lifecycleObserverAlwaysActive() ? Lifecycle.State.CREATED : Lifecycle.State.STARTED;
            }

            @Override // androidx.lifecycle.LiveData
            public void removeObserver(@NonNull Observer<? super T> observer) {
                super.removeObserver(observer);
                if (autoClear() && !LiveEvent.this.liveData.hasObservers()) {
                    LiveEventBusCore.get().bus.remove(this.key);
                }
                LiveEventBusCore.this.logger.log(Level.INFO, "observer removed: " + observer);
            }
        }

        public class PostLifeValueTask implements Runnable {
            private Object newValue;
            private LifecycleOwner owner;

            public PostLifeValueTask(@Nullable Object obj, LifecycleOwner lifecycleOwner) {
                this.newValue = obj;
                this.owner = lifecycleOwner;
            }

            @Override // java.lang.Runnable
            public void run() {
                LifecycleOwner lifecycleOwner = this.owner;
                if (lifecycleOwner == null || !lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    return;
                }
                LiveEvent.this.postInternal(this.newValue);
            }
        }

        public class PostValueTask implements Runnable {
            private Object newValue;

            public PostValueTask(Object obj) {
                this.newValue = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                LiveEvent.this.postInternal(this.newValue);
            }
        }

        public LiveEvent(String str) {
            this.key = str;
            this.liveData = new LifecycleLiveData<>(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void broadcastInternal(T t, boolean z, boolean z2) {
            LiveEventBusCore.this.logger.log(Level.INFO, "broadcast: " + t + " foreground: " + z + " with key: " + this.key);
            Application app = AppUtils.getApp();
            if (app == null) {
                LiveEventBusCore.this.logger.log(Level.WARNING, "application is null, you can try setContext() when config");
                return;
            }
            Intent intent = new Intent(IpcConst.ACTION);
            if (z) {
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            }
            if (z2) {
                intent.setPackage(app.getPackageName());
            }
            intent.putExtra(IpcConst.KEY, this.key);
            if (ProcessorManager.getManager().writeTo(intent, t)) {
                try {
                    app.sendBroadcast(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void observeForeverInternal(@NonNull Observer<T> observer) {
            ObserverWrapper<T> observerWrapper = LiveEventBusCore.this.new ObserverWrapper<>(observer);
            ((ObserverWrapper) observerWrapper).preventNextEvent = this.liveData.getVersion() > -1;
            this.observerMap.put(observer, observerWrapper);
            this.liveData.observeForever(observerWrapper);
            LiveEventBusCore.this.logger.log(Level.INFO, "observe forever observer: " + observerWrapper + "(" + observer + ") with key: " + this.key);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void observeInternal(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<T> observer) {
            ObserverWrapper observerWrapper = LiveEventBusCore.this.new ObserverWrapper(observer);
            observerWrapper.preventNextEvent = this.liveData.getVersion() > -1;
            this.liveData.observe(lifecycleOwner, observerWrapper);
            LiveEventBusCore.this.logger.log(Level.INFO, "observe observer: " + observerWrapper + "(" + observer + ") on owner: " + lifecycleOwner + " with key: " + this.key);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void observeStickyForeverInternal(@NonNull Observer<T> observer) {
            ObserverWrapper<T> observerWrapper = LiveEventBusCore.this.new ObserverWrapper<>(observer);
            this.observerMap.put(observer, observerWrapper);
            this.liveData.observeForever(observerWrapper);
            LiveEventBusCore.this.logger.log(Level.INFO, "observe sticky forever observer: " + observerWrapper + "(" + observer + ") with key: " + this.key);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void observeStickyInternal(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<T> observer) {
            ObserverWrapper observerWrapper = LiveEventBusCore.this.new ObserverWrapper(observer);
            this.liveData.observe(lifecycleOwner, observerWrapper);
            LiveEventBusCore.this.logger.log(Level.INFO, "observe sticky observer: " + observerWrapper + "(" + observer + ") on owner: " + lifecycleOwner + " with key: " + this.key);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void postInternal(T t) {
            LiveEventBusCore.this.logger.log(Level.INFO, "post: " + t + " with key: " + this.key);
            this.liveData.setValue(t);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void removeObserverInternal(@NonNull Observer<T> observer) {
            if (this.observerMap.containsKey(observer)) {
                observer = this.observerMap.remove(observer);
            }
            this.liveData.removeObserver(observer);
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        @Deprecated
        public void broadcast(T t) {
            broadcast(t, false, false);
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void observe(@NonNull final LifecycleOwner lifecycleOwner, @NonNull final Observer<T> observer) {
            if (ThreadUtils.isMainThread()) {
                observeInternal(lifecycleOwner, observer);
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.jeremyliao.liveeventbus.core.LiveEventBusCore.LiveEvent.2
                    @Override // java.lang.Runnable
                    public void run() {
                        LiveEvent.this.observeInternal(lifecycleOwner, observer);
                    }
                });
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void observeForever(@NonNull final Observer<T> observer) {
            if (ThreadUtils.isMainThread()) {
                observeForeverInternal(observer);
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.jeremyliao.liveeventbus.core.LiveEventBusCore.LiveEvent.4
                    @Override // java.lang.Runnable
                    public void run() {
                        LiveEvent.this.observeForeverInternal(observer);
                    }
                });
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void observeSticky(@NonNull final LifecycleOwner lifecycleOwner, @NonNull final Observer<T> observer) {
            if (ThreadUtils.isMainThread()) {
                observeStickyInternal(lifecycleOwner, observer);
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.jeremyliao.liveeventbus.core.LiveEventBusCore.LiveEvent.3
                    @Override // java.lang.Runnable
                    public void run() {
                        LiveEvent.this.observeStickyInternal(lifecycleOwner, observer);
                    }
                });
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void observeStickyForever(@NonNull final Observer<T> observer) {
            if (ThreadUtils.isMainThread()) {
                observeStickyForeverInternal(observer);
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.jeremyliao.liveeventbus.core.LiveEventBusCore.LiveEvent.5
                    @Override // java.lang.Runnable
                    public void run() {
                        LiveEvent.this.observeStickyForeverInternal(observer);
                    }
                });
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void post(T t) {
            if (ThreadUtils.isMainThread()) {
                postInternal(t);
            } else {
                this.mainHandler.post(new PostValueTask(t));
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postAcrossApp(T t) {
            broadcast(t, false, false);
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postAcrossProcess(T t) {
            broadcast(t, false, true);
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postDelay(T t, long j) {
            this.mainHandler.postDelayed(new PostValueTask(t), j);
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postOrderly(T t) {
            this.mainHandler.post(new PostValueTask(t));
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void removeObserver(@NonNull final Observer<T> observer) {
            if (ThreadUtils.isMainThread()) {
                removeObserverInternal(observer);
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.jeremyliao.liveeventbus.core.LiveEventBusCore.LiveEvent.6
                    @Override // java.lang.Runnable
                    public void run() {
                        LiveEvent.this.removeObserverInternal(observer);
                    }
                });
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void broadcast(final T t, final boolean z, final boolean z2) {
            if (AppUtils.getApp() == null) {
                post(t);
            } else if (ThreadUtils.isMainThread()) {
                broadcastInternal(t, z, z2);
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.jeremyliao.liveeventbus.core.LiveEventBusCore.LiveEvent.1
                    @Override // java.lang.Runnable
                    public void run() {
                        LiveEvent.this.broadcastInternal(t, z, z2);
                    }
                });
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postDelay(LifecycleOwner lifecycleOwner, T t, long j) {
            this.mainHandler.postDelayed(new PostLifeValueTask(t, lifecycleOwner), j);
        }
    }

    public class ObserverWrapper<T> implements Observer<T> {

        @NonNull
        private final Observer<T> observer;
        private boolean preventNextEvent = false;

        public ObserverWrapper(Observer<T> observer) {
            this.observer = observer;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable T t) {
            if (this.preventNextEvent) {
                this.preventNextEvent = false;
                return;
            }
            LiveEventBusCore.this.logger.log(Level.INFO, "message received: " + t);
            try {
                this.observer.onChanged(t);
            } catch (ClassCastException e) {
                LiveEventBusCore.this.logger.log(Level.WARNING, "class cast error on message received: " + t, e);
            } catch (Exception e2) {
                LiveEventBusCore.this.logger.log(Level.WARNING, "error on message received: " + t, e2);
            }
        }
    }

    public static class SingletonHolder {
        private static final LiveEventBusCore DEFAULT_BUS = new LiveEventBusCore();

        private SingletonHolder() {
        }
    }

    public static LiveEventBusCore get() {
        return SingletonHolder.DEFAULT_BUS;
    }

    public Config config() {
        return this.config;
    }

    public void enableLogger(boolean z) {
        this.logger.setEnable(z);
    }

    public void registerReceiver() {
        Application app;
        if (this.isRegisterReceiver || (app = AppUtils.getApp()) == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(IpcConst.ACTION);
        app.registerReceiver(this.receiver, intentFilter);
        this.isRegisterReceiver = true;
    }

    public void setAutoClear(boolean z) {
        this.autoClear = z;
    }

    public void setLifecycleObserverAlwaysActive(boolean z) {
        this.lifecycleObserverAlwaysActive = z;
    }

    public void setLogger(@NonNull Logger logger) {
        this.logger.setLogger(logger);
    }

    public synchronized <T> Observable<T> with(String str, Class<T> cls) {
        if (!this.bus.containsKey(str)) {
            this.bus.put(str, new LiveEvent<>(str));
        }
        return this.bus.get(str);
    }

    private LiveEventBusCore() {
        this.config = new Config();
        this.isRegisterReceiver = false;
        this.console = new InnerConsole();
        this.bus = new HashMap();
        this.observableConfigs = new HashMap();
        this.lifecycleObserverAlwaysActive = true;
        this.autoClear = false;
        this.logger = new LoggerManager(new DefaultLogger());
        this.receiver = new LebIpcReceiver();
        registerReceiver();
    }

    public ObservableConfig config(String str) {
        if (!this.observableConfigs.containsKey(str)) {
            this.observableConfigs.put(str, new ObservableConfig());
        }
        return this.observableConfigs.get(str);
    }
}
