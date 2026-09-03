package p269o00ooooo;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzjz;

/* JADX INFO: loaded from: classes3.dex */
public final class Oo0000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzcf f41109OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f41110OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f41111OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f41112OooO0oO;

    public Oo0000(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2) {
        this.f41112OooO0oO = appMeasurementDynamiteService;
        this.f41109OooO0Oo = zzcfVar;
        this.f41111OooO0o0 = str;
        this.f41110OooO0o = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVarZzt = this.f41112OooO0oO.f15870OooO0Oo.zzt();
        zzcf zzcfVar = this.f41109OooO0Oo;
        String str = this.f41111OooO0o0;
        String str2 = this.f41110OooO0o;
        zzjzVarZzt.zzg();
        zzjzVarZzt.zza();
        zzjzVarZzt.OooOO0(new oOO00O0(zzjzVarZzt, str, str2, zzjzVarZzt.OooO0oO(false), zzcfVar));
    }
}
