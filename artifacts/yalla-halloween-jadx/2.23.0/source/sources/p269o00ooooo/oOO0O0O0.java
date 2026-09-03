package p269o00ooooo;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzjz;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0O0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzcf f41457OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f41458OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f41459OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f41460OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f41461OooO0oo;

    public oOO0O0O0(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2, boolean z) {
        this.f41461OooO0oo = appMeasurementDynamiteService;
        this.f41457OooO0Oo = zzcfVar;
        this.f41459OooO0o0 = str;
        this.f41458OooO0o = str2;
        this.f41460OooO0oO = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVarZzt = this.f41461OooO0oo.f15870OooO0Oo.zzt();
        zzcf zzcfVar = this.f41457OooO0Oo;
        String str = this.f41459OooO0o0;
        String str2 = this.f41458OooO0o;
        boolean z = this.f41460OooO0oO;
        zzjzVarZzt.zzg();
        zzjzVarZzt.zza();
        zzjzVarZzt.OooOO0(new oO0O0Oo0(zzjzVarZzt, str, str2, zzjzVarZzt.OooO0oO(false), z, zzcfVar));
    }
}
