package com.android.billingclient.api;

import com.google.android.gms.common.api.internal.zaaw;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000OOo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9748OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9749OooO0o0;

    public /* synthetic */ o000OOo0(Object obj, int i) {
        this.f9748OooO0Oo = i;
        this.f9749OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9748OooO0Oo;
        Object obj = this.f9749OooO0o0;
        switch (i) {
            case 0:
                ((OooO0OO) obj).OooO00o(o0000O0O.f9712OooOOO0);
                break;
            default:
                zaaw zaawVar = (zaaw) obj;
                zaawVar.f14821OooO0Oo.cancelAvailabilityErrorNotifications(zaawVar.f14820OooO0OO);
                break;
        }
    }
}
