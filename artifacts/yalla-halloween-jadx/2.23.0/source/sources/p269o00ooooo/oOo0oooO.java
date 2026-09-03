package p269o00ooooo;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzau;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo0oooO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzcf f41520OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f41521OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzau f41522OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f41523OooO0oO;

    public oOo0oooO(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, zzau zzauVar, String str) {
        this.f41523OooO0oO = appMeasurementDynamiteService;
        this.f41520OooO0Oo = zzcfVar;
        this.f41522OooO0o0 = zzauVar;
        this.f41521OooO0o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41523OooO0oO.f15870OooO0Oo.zzt().zzB(this.f41520OooO0Oo, this.f41522OooO0o0, this.f41521OooO0o);
    }
}
