package com.yalla.yalla.other;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;
import p654o0ooo.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public class DestoryLifecycle_LifecycleAdapter implements GeneratedAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O0O f21661OooO00o;

    public DestoryLifecycle_LifecycleAdapter(o00O0O o00o0o2) {
        this.f21661OooO00o = o00o0o2;
    }

    @Override // androidx.lifecycle.GeneratedAdapter
    public final void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (!z && event == Lifecycle.Event.ON_DESTROY) {
            if (!z2 || methodCallsLogger.approveCall("onDestory", 1)) {
                this.f21661OooO00o.onDestory();
            }
        }
    }
}
