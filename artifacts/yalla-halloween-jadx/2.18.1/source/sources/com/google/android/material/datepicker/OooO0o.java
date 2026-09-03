package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ long f16942Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f16943Oooo0oO;

    public OooO0o(OooO0OO oooO0OO, long j) {
        this.f16943Oooo0oO = oooO0OO;
        this.f16942Oooo0o = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooO0OO oooO0OO = this.f16943Oooo0oO;
        oooO0OO.f16935Oooo0o.setError(String.format(oooO0OO.f16934Oooo, OooO.OooO00o(this.f16942Oooo0o)));
        this.f16943Oooo0oO.OooO00o();
    }
}
