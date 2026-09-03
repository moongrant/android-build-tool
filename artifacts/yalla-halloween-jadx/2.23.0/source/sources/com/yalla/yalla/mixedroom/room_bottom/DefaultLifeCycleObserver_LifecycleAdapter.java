package com.yalla.yalla.mixedroom.room_bottom;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultLifeCycleObserver_LifecycleAdapter implements GeneratedAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final DefaultLifeCycleObserver f23543OooO00o;

    public DefaultLifeCycleObserver_LifecycleAdapter(DefaultLifeCycleObserver defaultLifeCycleObserver) {
        this.f23543OooO00o = defaultLifeCycleObserver;
    }

    @Override // androidx.lifecycle.GeneratedAdapter
    public final void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (z) {
            return;
        }
        Lifecycle.Event event2 = Lifecycle.Event.ON_CREATE;
        DefaultLifeCycleObserver defaultLifeCycleObserver = this.f23543OooO00o;
        if (event == event2) {
            if (!z2 || methodCallsLogger.approveCall("onCreate", 1)) {
                defaultLifeCycleObserver.onCreate();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            if (!z2 || methodCallsLogger.approveCall("onStart", 1)) {
                defaultLifeCycleObserver.onStart();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            if (!z2 || methodCallsLogger.approveCall("onResume", 1)) {
                defaultLifeCycleObserver.onResume();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            if (!z2 || methodCallsLogger.approveCall("onPause", 1)) {
                defaultLifeCycleObserver.onPause();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_STOP) {
            if (!z2 || methodCallsLogger.approveCall("onStop", 1)) {
                defaultLifeCycleObserver.onStop();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (!z2 || methodCallsLogger.approveCall("onDestroy", 1)) {
                defaultLifeCycleObserver.onDestroy();
            }
        }
    }
}
