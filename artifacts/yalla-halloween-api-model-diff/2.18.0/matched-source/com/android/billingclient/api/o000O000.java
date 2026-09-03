package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzu;
import com.google.android.gms.measurement.internal.zzis;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O000 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f11304Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f11305OoooO00;

    public /* synthetic */ o000O000(Object obj, int i) {
        this.f11304Oooo = i;
        this.f11305OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11304Oooo) {
            case 0:
                ((OooO) ((OooOo00) this.f11305OoooO00)).OooO00o(o000OOo.f11323OooOOO0, zzu.zzh());
                break;
            default:
                ((zzis) this.f11305OoooO00).f16278OooOO0 = null;
                break;
        }
    }
}
