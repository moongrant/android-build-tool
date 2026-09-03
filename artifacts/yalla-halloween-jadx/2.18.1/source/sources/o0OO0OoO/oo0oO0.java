package o0OO0OoO;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0oO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OO0 f37903Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f37904Oooo0oO;

    public oo0oO0(AppMeasurementDynamiteService appMeasurementDynamiteService, o0OO0 o0oo1) {
        this.f37904Oooo0oO = appMeasurementDynamiteService;
        this.f37903Oooo0o = o0oo1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37904Oooo0oO.f16073OooO00o.zzq().zzT(this.f37903Oooo0o);
    }
}
