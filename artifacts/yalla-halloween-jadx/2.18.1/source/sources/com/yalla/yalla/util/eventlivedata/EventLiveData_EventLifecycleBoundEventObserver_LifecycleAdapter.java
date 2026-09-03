package com.yalla.yalla.util.eventlivedata;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

/* JADX INFO: loaded from: classes3.dex */
public class EventLiveData_EventLifecycleBoundEventObserver_LifecycleAdapter implements GeneratedAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EventLiveData.EventLifecycleBoundEventObserver f26273OooO00o;

    public EventLiveData_EventLifecycleBoundEventObserver_LifecycleAdapter(EventLiveData.EventLifecycleBoundEventObserver eventLifecycleBoundEventObserver) {
        this.f26273OooO00o = eventLifecycleBoundEventObserver;
    }

    @Override // androidx.lifecycle.GeneratedAdapter
    public final void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (z) {
            if (!z2 || methodCallsLogger.approveCall("onStateChanged", 4)) {
                this.f26273OooO00o.onStateChanged(lifecycleOwner, event);
            }
        }
    }
}
