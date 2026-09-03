package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzu;
import com.google.android.gms.measurement.internal.zzis;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O000 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f11288Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f11289Oooo0oO;

    public /* synthetic */ o000O000(Object obj, int i) {
        this.f11288Oooo0o = i;
        this.f11289Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11288Oooo0o) {
            case 0:
                ((OooO) ((OooOo00) this.f11289Oooo0oO)).OooO00o(o000OOo.f11307OooOOO0, zzu.zzh());
                break;
            default:
                ((zzis) this.f11289Oooo0oO).f16260OooOO0 = null;
                break;
        }
    }
}
