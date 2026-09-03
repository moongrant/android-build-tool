package p271o00ooooo;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ y0 f40532OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f40533OooO0o0;

    public n0(AppMeasurementDynamiteService appMeasurementDynamiteService, y0 y0Var) {
        this.f40533OooO0o0 = appMeasurementDynamiteService;
        this.f40532OooO0Oo = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40533OooO0o0.f15394OooO0Oo.zzq().zzT(this.f40532OooO0Oo);
    }
}
