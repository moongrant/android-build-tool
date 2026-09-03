package o0OO0OoO;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzcf f37665Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f37666Oooo0oO;

    public o00O0OO(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar) {
        this.f37666Oooo0oO = appMeasurementDynamiteService;
        this.f37665Oooo0o = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37666Oooo0oO.f16073OooO00o.zzt().zzt(this.f37665Oooo0o);
    }
}
