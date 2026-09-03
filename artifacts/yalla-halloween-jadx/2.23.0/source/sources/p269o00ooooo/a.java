package p269o00ooooo;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzcf f41113OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f41114OooO0o0;

    public a(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar) {
        this.f41114OooO0o0 = appMeasurementDynamiteService;
        this.f41113OooO0Oo = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f41114OooO0o0;
        appMeasurementDynamiteService.f15870OooO0Oo.zzv().zzQ(this.f41113OooO0Oo, appMeasurementDynamiteService.f15870OooO0Oo.zzI());
    }
}
