package com.yalla.yalla.util.eventlivedata;

import android.os.Build;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p058o0000OoO.OooO;
import p130o00O0oo.o00oOoo;

/* JADX INFO: loaded from: classes3.dex */
public class EventLiveData<T> extends LiveData<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap<Observer<? super T>, EventLiveData<T>.OooO0OO> f26262OooO00o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f26264OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Observer<T> f26263OooO0O0 = new OooO00o();

    public class EventLifecycleBoundEventObserver extends EventLiveData<T>.OooO0OO implements LifecycleObserver {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @NonNull
        public final LifecycleOwner f26265Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public Lifecycle.Event f26266OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public Lifecycle.State f26267OoooO00;

        public EventLifecycleBoundEventObserver(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
            super(observer);
            this.f26267OoooO00 = Lifecycle.State.STARTED;
            this.f26266OoooO0 = null;
            this.f26265Oooo = lifecycleOwner;
        }

        @Override // com.yalla.yalla.util.eventlivedata.EventLiveData.OooO0OO
        public final boolean OooO0O0(LifecycleOwner lifecycleOwner) {
            return this.f26265Oooo == lifecycleOwner;
        }

        @Override // com.yalla.yalla.util.eventlivedata.EventLiveData.OooO0OO
        public final boolean OooO0OO() {
            return this.f26265Oooo.getLifecycle().getCurrentState().isAtLeast(this.f26267OoooO00);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.Event event2;
            if (this.f26265Oooo.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || ((event2 = this.f26266OoooO0) != null && event2 == event)) {
                EventLiveData.this.removeObserver(this.f26270Oooo0o);
            } else {
                OooO00o(this.f26265Oooo.getLifecycle().getCurrentState().isAtLeast(this.f26267OoooO00));
            }
        }
    }

    public class OooO00o implements Observer<T> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(T t) {
            Iterator<Map.Entry<Observer<? super T>, EventLiveData<T>.OooO0OO>> it = EventLiveData.this.f26262OooO00o.entrySet().iterator();
            while (it.hasNext()) {
                EventLiveData<T>.OooO0OO value = it.next().getValue();
                if (value.OooO0OO()) {
                    value.f26270Oooo0o.onChanged(t);
                }
            }
        }
    }

    public class OooO0O0 extends EventLiveData<T>.OooO0OO {
        public OooO0O0(EventLiveData eventLiveData, Observer<? super T> observer) {
            super(observer);
        }

        @Override // com.yalla.yalla.util.eventlivedata.EventLiveData.OooO0OO
        public final boolean OooO0OO() {
            return true;
        }
    }

    public abstract class OooO0OO {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Observer<? super T> f26270Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public boolean f26271Oooo0oO;

        public OooO0OO(Observer<? super T> observer) {
            this.f26270Oooo0o = observer;
        }

        public final void OooO00o(boolean z) {
            if (z == this.f26271Oooo0oO) {
                return;
            }
            this.f26271Oooo0oO = z;
            EventLiveData eventLiveData = EventLiveData.this;
            int i = eventLiveData.f26264OooO0OO;
            boolean z2 = i == 0;
            eventLiveData.f26264OooO0OO = i + (z ? 1 : -1);
            if (z2 && z) {
                Objects.requireNonNull(eventLiveData);
            }
            EventLiveData eventLiveData2 = EventLiveData.this;
            if (eventLiveData2.f26264OooO0OO != 0 || this.f26271Oooo0oO) {
                return;
            }
            Objects.requireNonNull(eventLiveData2);
        }

        boolean OooO0O0(LifecycleOwner lifecycleOwner) {
            return false;
        }

        abstract boolean OooO0OO();
    }

    private void assertMainThread(String str) {
        boolean zIsCurrentThread;
        if (Build.VERSION.SDK_INT >= 23) {
            zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        } else {
            zIsCurrentThread = Thread.currentThread() == Looper.getMainLooper().getThread();
        }
        if (!zIsCurrentThread) {
            throw new IllegalStateException(OooO0o.OooO0OO.OooO00o("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void OooO00o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        StringBuilder sbOooO00o = o00oOoo.OooO00o("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbOooO00o.append(str);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sbOooO00o.toString());
        OooO0O0(illegalArgumentException);
        throw illegalArgumentException;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Throwable;>(TT;)TT; */
    public final Throwable OooO0O0(Throwable th) {
        String name = getClass().getName();
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (name.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return th;
    }

    @Override // androidx.lifecycle.LiveData
    public final boolean hasActiveObservers() {
        return this.f26264OooO0OO > 0;
    }

    @Override // androidx.lifecycle.LiveData
    public final boolean hasObservers() {
        return this.f26262OooO00o.size() > 0;
    }

    @Override // androidx.lifecycle.LiveData
    @MainThread
    public final void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer observer) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        assertMainThread("observe");
        OooO00o(lifecycleOwner, "owner");
        OooO00o(observer, "observer");
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state == state2) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            StringBuilder sb = new StringBuilder();
            sb.append("State can not be equal to ");
            sb.append(state);
            sb.append("method ");
            sb.append(className);
            sb.append(".");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(OooO.OooO00o(sb, methodName, ", parameter   minimumStateForSendingEvent"));
            OooO0O0(illegalArgumentException);
            throw illegalArgumentException;
        }
        if (Lifecycle.Event.ON_START == null || Lifecycle.Event.ON_CREATE == null || Lifecycle.Event.ON_RESUME == null) {
            StackTraceElement stackTraceElement2 = Thread.currentThread().getStackTrace()[3];
            String className2 = stackTraceElement2.getClassName();
            String methodName2 = stackTraceElement2.getMethodName();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("State can not be equal to ");
            sb2.append((Object) null);
            sb2.append("method ");
            sb2.append(className2);
            sb2.append(".");
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(OooO.OooO00o(sb2, methodName2, ", parameter  maximumEventForRemovingEvent"));
            OooO0O0(illegalArgumentException2);
            throw illegalArgumentException2;
        }
        if (state == state2) {
            StackTraceElement stackTraceElement3 = Thread.currentThread().getStackTrace()[3];
            StringBuilder sbOooO00o = o00oOoo.OooO00o("State can not be equal to DESTROYED! : method ", stackTraceElement3.getClassName(), ".", stackTraceElement3.getMethodName(), ", parameter ");
            sbOooO00o.append(state);
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException(sbOooO00o.toString());
            OooO0O0(illegalArgumentException3);
            throw illegalArgumentException3;
        }
        if (lifecycleOwner.getLifecycle().getCurrentState() == state2) {
            return;
        }
        EventLifecycleBoundEventObserver eventLifecycleBoundEventObserver = new EventLifecycleBoundEventObserver(lifecycleOwner, observer);
        eventLifecycleBoundEventObserver.f26267OoooO00 = state;
        eventLifecycleBoundEventObserver.f26266OoooO0 = null;
        EventLiveData<T>.OooO0OO oooO0OOPut = !this.f26262OooO00o.containsKey(observer) ? this.f26262OooO00o.put(observer, eventLifecycleBoundEventObserver) : eventLifecycleBoundEventObserver;
        if (oooO0OOPut != null && !oooO0OOPut.OooO0O0(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (oooO0OOPut != null) {
            return;
        }
        lifecycleOwner.getLifecycle().addObserver(eventLifecycleBoundEventObserver);
        if (super.hasObservers()) {
            return;
        }
        super.observeForever(this.f26263OooO0O0);
    }

    @Override // androidx.lifecycle.LiveData
    @MainThread
    public final void observeForever(@NonNull Observer observer) {
        assertMainThread("observeForever");
        OooO00o(observer, "observer");
        OooO0O0 oooO0O0 = new OooO0O0(this, observer);
        EventLiveData<T>.OooO0OO oooO0OOPut = !this.f26262OooO00o.containsKey(observer) ? this.f26262OooO00o.put(observer, oooO0O0) : oooO0O0;
        if (oooO0OOPut != null && (oooO0OOPut instanceof EventLifecycleBoundEventObserver)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (oooO0OOPut != null) {
            return;
        }
        if (!super.hasObservers()) {
            super.observeForever(this.f26263OooO0O0);
        }
        oooO0O0.OooO00o(true);
    }

    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
    }

    @Override // androidx.lifecycle.LiveData
    public final void onInactive() {
    }

    @Override // androidx.lifecycle.LiveData
    public final void removeObserver(@NonNull Observer observer) {
        assertMainThread("removeObserver");
        OooO00o(observer, "observer");
        this.f26262OooO00o.remove(observer);
    }

    @Override // androidx.lifecycle.LiveData
    public final void removeObservers(@NonNull LifecycleOwner lifecycleOwner) {
        assertMainThread("removeObservers");
        OooO00o(lifecycleOwner, "owner");
        for (Map.Entry<Observer<? super T>, EventLiveData<T>.OooO0OO> entry : this.f26262OooO00o.entrySet()) {
            if (entry.getValue() instanceof EventLifecycleBoundEventObserver) {
                if (((EventLifecycleBoundEventObserver) entry.getValue()).f26265Oooo == lifecycleOwner) {
                    this.f26262OooO00o.remove(entry.getKey());
                }
            }
        }
    }
}
