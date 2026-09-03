package com.common.support.applifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.common.support.applifecycle.log.LoggerKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\tJ\b\u0010\n\u001a\u00020\u0007H\u0003J\b\u0010\u000b\u001a\u00020\u0007H\u0003J\b\u0010\f\u001a\u00020\u0007H\u0003J\b\u0010\r\u001a\u00020\u0007H\u0003J\b\u0010\u000e\u001a\u00020\u0007H\u0003J\b\u0010\u000f\u001a\u00020\u0007H\u0003J\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0011R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/common/support/applifecycle/AppLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "lifecycleListeners", "", "Lcom/common/support/applifecycle/AppLifecycleListener;", "addAppLifecycleListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addAppLifecycleListener$lib_applifecycle_release", "onBackground", "onCreate", "onDestroy", "onForeground", "onPause", "onResume", "removeAppLifecycleListener", "removeAppLifecycleListener$lib_applifecycle_release", "lib_applifecycle_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AppLifecycleObserver implements LifecycleObserver {

    @NotNull
    private final List<AppLifecycleListener> lifecycleListeners = new ArrayList();

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private final void onBackground() {
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.applifecycle.AppLifecycleObserver.onBackground.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "App onBackground()";
            }
        }, 1, null);
        Iterator<T> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            ((AppLifecycleListener) it.next()).onBackground();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private final void onCreate() {
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.applifecycle.AppLifecycleObserver.onCreate.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "App onCreate()";
            }
        }, 1, null);
        Iterator<T> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            ((AppLifecycleListener) it.next()).onCreate();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.applifecycle.AppLifecycleObserver.onDestroy.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "App onDestroy()";
            }
        }, 1, null);
        Iterator<T> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            ((AppLifecycleListener) it.next()).onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private final void onForeground() {
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.applifecycle.AppLifecycleObserver.onForeground.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "App onForeground()";
            }
        }, 1, null);
        Iterator<T> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            ((AppLifecycleListener) it.next()).onForeground();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private final void onPause() {
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.applifecycle.AppLifecycleObserver.onPause.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "App onPause()";
            }
        }, 1, null);
        Iterator<T> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            ((AppLifecycleListener) it.next()).onPause();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private final void onResume() {
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.applifecycle.AppLifecycleObserver.onResume.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "App onResume()";
            }
        }, 1, null);
        Iterator<T> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            ((AppLifecycleListener) it.next()).onResume();
        }
    }

    public final void addAppLifecycleListener$lib_applifecycle_release(@NotNull AppLifecycleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.lifecycleListeners.contains(listener)) {
            return;
        }
        this.lifecycleListeners.add(listener);
    }

    public final void removeAppLifecycleListener$lib_applifecycle_release(@NotNull AppLifecycleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.lifecycleListeners.remove(listener);
    }
}
