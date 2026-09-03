package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f16898OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f16899OooO0o0;

    public OooOOOO(OooOo00 oooOo00, int i) {
        this.f16899OooO0o0 = oooOo00;
        this.f16898OooO0Oo = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16899OooO0o0.f16910OooOOO0.smoothScrollToPosition(this.f16898OooO0Oo);
    }
}
