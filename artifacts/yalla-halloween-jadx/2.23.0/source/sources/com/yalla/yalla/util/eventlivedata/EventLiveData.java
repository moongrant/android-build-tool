package com.yalla.yalla.util.eventlivedata;

import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.compose.compiler.plugins.kotlin.OooO0o;
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
import p004OooO0oO.o000oOoO;
import p023Oooo00o.oO00Oo00;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes5.dex */
public class EventLiveData<T> extends LiveData<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap<Observer<? super T>, EventLiveData<T>.OooO0OO> f32849OooO00o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f32851OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f32850OooO0O0 = new OooO00o();

    public class EventLifecycleBoundEventObserver extends EventLiveData<T>.OooO0OO implements LifecycleObserver {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Lifecycle.Event f32852OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NonNull
        public final LifecycleOwner f32853OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Lifecycle.State f32854OooO0oo;

        public EventLifecycleBoundEventObserver(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
            super(observer);
            this.f32854OooO0oo = Lifecycle.State.STARTED;
            this.f32852OooO = null;
            this.f32853OooO0oO = lifecycleOwner;
        }

        @Override // com.yalla.yalla.util.eventlivedata.EventLiveData.OooO0OO
        public final boolean OooO0O0(LifecycleOwner lifecycleOwner) {
            return this.f32853OooO0oO == lifecycleOwner;
        }

        @Override // com.yalla.yalla.util.eventlivedata.EventLiveData.OooO0OO
        public final boolean OooO0OO() {
            return this.f32853OooO0oO.getLifecycle().getCurrentState().isAtLeast(this.f32854OooO0oo);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.Event event2;
            if (this.f32853OooO0oO.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || ((event2 = this.f32852OooO) != null && event2 == event)) {
                EventLiveData.this.removeObserver(this.f32857OooO0Oo);
            } else {
                OooO00o(OooO0OO());
            }
        }
    }

    public class OooO00o implements Observer<T> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(T t) {
            Iterator<Map.Entry<Observer<? super T>, EventLiveData<T>.OooO0OO>> it = EventLiveData.this.f32849OooO00o.entrySet().iterator();
            while (it.hasNext()) {
                EventLiveData<T>.OooO0OO value = it.next().getValue();
                if (value.OooO0OO()) {
                    value.f32857OooO0Oo.onChanged(t);
                }
            }
        }
    }

    public class OooO0O0 extends EventLiveData<T>.OooO0OO {
        @Override // com.yalla.yalla.util.eventlivedata.EventLiveData.OooO0OO
        public final boolean OooO0OO() {
            return true;
        }
    }

    public abstract class OooO0OO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Observer<? super T> f32857OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f32859OooO0o0;

        public OooO0OO(Observer<? super T> observer) {
            this.f32857OooO0Oo = observer;
        }

        public final void OooO00o(boolean z) {
            if (z == this.f32859OooO0o0) {
                return;
            }
            this.f32859OooO0o0 = z;
            EventLiveData eventLiveData = EventLiveData.this;
            int i = eventLiveData.f32851OooO0OO;
            boolean z2 = i == 0;
            eventLiveData.f32851OooO0OO = i + (z ? 1 : -1);
            if (z2 && z) {
                eventLiveData.getClass();
            }
            if (eventLiveData.f32851OooO0OO != 0 || this.f32859OooO0o0) {
                return;
            }
            eventLiveData.getClass();
        }

        boolean OooO0O0(LifecycleOwner lifecycleOwner) {
            return false;
        }

        abstract boolean OooO0OO();
    }

    private static void OooO00o(String str) {
        if (!Looper.getMainLooper().isCurrentThread()) {
            throw new IllegalStateException(o000oOoO.OooO00o("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void OooO0O0(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        StringBuilder sbOooO0OO = OooO0o.OooO0OO("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbOooO0OO.append(str);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sbOooO0OO.toString());
        OooO0OO(illegalArgumentException);
        throw illegalArgumentException;
    }

    public final void OooO0OO(IllegalArgumentException illegalArgumentException) {
        String name = getClass().getName();
        StackTraceElement[] stackTrace = illegalArgumentException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (name.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        illegalArgumentException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    @Override // androidx.lifecycle.LiveData
    public final boolean hasActiveObservers() {
        return this.f32851OooO0OO > 0;
    }

    @Override // androidx.lifecycle.LiveData
    public final boolean hasObservers() {
        return this.f32849OooO00o.size() > 0;
    }

    @Override // androidx.lifecycle.LiveData
    @MainThread
    public final void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer observer) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        OooO00o("observe");
        OooO0O0(lifecycleOwner, "owner");
        OooO0O0(observer, "observer");
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state == state2) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            StringBuilder sb = new StringBuilder("State can not be equal to ");
            sb.append(state);
            sb.append("method ");
            sb.append(className);
            sb.append(".");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(o0O00o0.OooO0O0(sb, methodName, ", parameter   minimumStateForSendingEvent"));
            OooO0OO(illegalArgumentException);
            throw illegalArgumentException;
        }
        if (Lifecycle.Event.ON_START == null || Lifecycle.Event.ON_CREATE == null || Lifecycle.Event.ON_RESUME == null) {
            StackTraceElement stackTraceElement2 = Thread.currentThread().getStackTrace()[3];
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(oO00Oo00.OooO00o("State can not be equal to nullmethod ", stackTraceElement2.getClassName(), ".", stackTraceElement2.getMethodName(), ", parameter  maximumEventForRemovingEvent"));
            OooO0OO(illegalArgumentException2);
            throw illegalArgumentException2;
        }
        if (state == state2) {
            StackTraceElement stackTraceElement3 = Thread.currentThread().getStackTrace()[3];
            StringBuilder sbOooO0OO = OooO0o.OooO0OO("State can not be equal to DESTROYED! : method ", stackTraceElement3.getClassName(), ".", stackTraceElement3.getMethodName(), ", parameter ");
            sbOooO0OO.append(state);
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException(sbOooO0OO.toString());
            OooO0OO(illegalArgumentException3);
            throw illegalArgumentException3;
        }
        if (lifecycleOwner.getLifecycle().getCurrentState() == state2) {
            return;
        }
        EventLifecycleBoundEventObserver eventLifecycleBoundEventObserver = new EventLifecycleBoundEventObserver(lifecycleOwner, observer);
        eventLifecycleBoundEventObserver.f32854OooO0oo = state;
        eventLifecycleBoundEventObserver.f32852OooO = null;
        HashMap<Observer<? super T>, EventLiveData<T>.OooO0OO> map = this.f32849OooO00o;
        EventLiveData<T>.OooO0OO oooO0OOPut = !map.containsKey(observer) ? map.put(observer, eventLifecycleBoundEventObserver) : eventLifecycleBoundEventObserver;
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
        super.observeForever(this.f32850OooO0O0);
    }

    @Override // androidx.lifecycle.LiveData
    @MainThread
    public final void observeForever(@NonNull Observer observer) {
        OooO00o("observeForever");
        OooO0O0(observer, "observer");
        OooO0O0 oooO0O0 = new OooO0O0(observer);
        HashMap<Observer<? super T>, EventLiveData<T>.OooO0OO> map = this.f32849OooO00o;
        EventLiveData<T>.OooO0OO oooO0OOPut = !map.containsKey(observer) ? map.put(observer, oooO0O0) : oooO0O0;
        if (oooO0OOPut != null && (oooO0OOPut instanceof EventLifecycleBoundEventObserver)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (oooO0OOPut != null) {
            return;
        }
        if (!super.hasObservers()) {
            super.observeForever(this.f32850OooO0O0);
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
        OooO00o("removeObserver");
        OooO0O0(observer, "observer");
        this.f32849OooO00o.remove(observer);
    }

    @Override // androidx.lifecycle.LiveData
    public final void removeObservers(@NonNull LifecycleOwner lifecycleOwner) {
        OooO00o("removeObservers");
        OooO0O0(lifecycleOwner, "owner");
        HashMap<Observer<? super T>, EventLiveData<T>.OooO0OO> map = this.f32849OooO00o;
        for (Map.Entry<Observer<? super T>, EventLiveData<T>.OooO0OO> entry : map.entrySet()) {
            if ((entry.getValue() instanceof EventLifecycleBoundEventObserver) && ((EventLifecycleBoundEventObserver) entry.getValue()).OooO0O0(lifecycleOwner)) {
                map.remove(entry.getKey());
            }
        }
    }
}
