package p271o00ooooo;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzcf f40864OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f40865OooO0o0;

    public x0(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar) {
        this.f40865OooO0o0 = appMeasurementDynamiteService;
        this.f40864OooO0Oo = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f40865OooO0o0;
        appMeasurementDynamiteService.f15394OooO0Oo.zzv().zzQ(this.f40864OooO0Oo, appMeasurementDynamiteService.f15394OooO0Oo.zzI());
    }
}
