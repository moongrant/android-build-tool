package p269o00ooooo;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00o00O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzcf f41315OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f41316OooO0o0;

    public oO00o00O(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar) {
        this.f41316OooO0o0 = appMeasurementDynamiteService;
        this.f41315OooO0Oo = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41316OooO0o0.f15870OooO0Oo.zzt().zzt(this.f41315OooO0Oo);
    }
}
