package com.android.billingclient.api;

import com.google.android.gms.common.api.internal.zaaw;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000O0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f12842OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f12843OooO0o0;

    public /* synthetic */ o000O0o(Object obj, int i) {
        this.f12842OooO0Oo = i;
        this.f12843OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f12842OooO0Oo;
        Object obj = this.f12843OooO0o0;
        switch (i) {
            case 0:
                ((OooOO0O) ((o000oOoO) obj)).OooO00o(o0000.f12803OooOOO0, new ArrayList());
                break;
            default:
                zaaw zaawVar = (zaaw) obj;
                zaawVar.f14352OooO0Oo.cancelAvailabilityErrorNotifications(zaawVar.f14351OooO0OO);
                break;
        }
    }
}
