package com.yalla.yalla.other;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;
import p473o0OoooOo.o0OOOO00;

/* JADX INFO: loaded from: classes4.dex */
public class DestoryLifecycle_LifecycleAdapter implements GeneratedAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOOO00 f24281OooO00o;

    public DestoryLifecycle_LifecycleAdapter(o0OOOO00 o0oooo01) {
        this.f24281OooO00o = o0oooo01;
    }

    @Override // androidx.lifecycle.GeneratedAdapter
    public final void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (!z && event == Lifecycle.Event.ON_DESTROY) {
            if (!z2 || methodCallsLogger.approveCall("onDestory", 1)) {
                this.f24281OooO00o.onDestory();
            }
        }
    }
}
