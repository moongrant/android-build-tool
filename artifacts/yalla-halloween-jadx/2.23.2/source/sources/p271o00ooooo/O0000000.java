package p271o00ooooo;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzau;

/* JADX INFO: loaded from: classes3.dex */
public final class O0000000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzcf f40432OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f40433OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzau f40434OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f40435OooO0oO;

    public O0000000(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, zzau zzauVar, String str) {
        this.f40435OooO0oO = appMeasurementDynamiteService;
        this.f40432OooO0Oo = zzcfVar;
        this.f40434OooO0o0 = zzauVar;
        this.f40433OooO0o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40435OooO0oO.f15394OooO0Oo.zzt().zzB(this.f40432OooO0Oo, this.f40434OooO0o0, this.f40433OooO0o);
    }
}
