package com.app.base.mixedroom.room_bottom;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

/* JADX INFO: loaded from: classes.dex */
public class DefaultLifeCycleObserver_LifecycleAdapter implements GeneratedAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final DefaultLifeCycleObserver f11843OooO00o;

    public DefaultLifeCycleObserver_LifecycleAdapter(DefaultLifeCycleObserver defaultLifeCycleObserver) {
        this.f11843OooO00o = defaultLifeCycleObserver;
    }

    @Override // androidx.lifecycle.GeneratedAdapter
    public final void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (z) {
            return;
        }
        if (event == Lifecycle.Event.ON_CREATE) {
            if (!z2 || methodCallsLogger.approveCall("onCreate", 1)) {
                this.f11843OooO00o.onCreate();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            if (!z2 || methodCallsLogger.approveCall("onStart", 1)) {
                this.f11843OooO00o.onStart();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            if (!z2 || methodCallsLogger.approveCall("onResume", 1)) {
                this.f11843OooO00o.onResume();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            if (!z2 || methodCallsLogger.approveCall("onPause", 1)) {
                this.f11843OooO00o.onPause();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_STOP) {
            if (!z2 || methodCallsLogger.approveCall("onStop", 1)) {
                this.f11843OooO00o.onStop();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (!z2 || methodCallsLogger.approveCall("onDestroy", 1)) {
                this.f11843OooO00o.onDestroy();
            }
        }
    }
}
