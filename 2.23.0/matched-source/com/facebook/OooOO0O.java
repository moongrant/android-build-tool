package com.facebook;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f10573OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f10574OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f10575OooO0o0;

    public /* synthetic */ OooOO0O(int i, Object obj, Object obj2) {
        this.f10573OooO0Oo = i;
        this.f10575OooO0o0 = obj;
        this.f10574OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10573OooO0Oo;
        Object obj = this.f10574OooO0o;
        Object obj2 = this.f10575OooO0o0;
        switch (i) {
            case 0:
                FacebookSdk.m4038publishInstallAsync$lambda15((Context) obj2, (String) obj);
                break;
            default:
                ((com.google.firebase.messaging.o0OoOo0) obj2).getClass();
                com.google.firebase.messaging.o0OoOo0.OooO00o((Intent) obj);
                break;
        }
    }
}
