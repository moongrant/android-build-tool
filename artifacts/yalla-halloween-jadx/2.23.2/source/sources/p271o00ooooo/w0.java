package p271o00ooooo;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzjz;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzcf f40857OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f40858OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f40859OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f40860OooO0oO;

    public w0(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2) {
        this.f40860OooO0oO = appMeasurementDynamiteService;
        this.f40857OooO0Oo = zzcfVar;
        this.f40859OooO0o0 = str;
        this.f40858OooO0o = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVarZzt = this.f40860OooO0oO.f15394OooO0Oo.zzt();
        zzcf zzcfVar = this.f40857OooO0Oo;
        String str = this.f40859OooO0o0;
        String str2 = this.f40858OooO0o;
        zzjzVarZzt.zzg();
        zzjzVarZzt.zza();
        zzjzVarZzt.OooOO0(new p(zzjzVarZzt, str, str2, zzjzVarZzt.OooO0oO(false), zzcfVar));
    }
}
