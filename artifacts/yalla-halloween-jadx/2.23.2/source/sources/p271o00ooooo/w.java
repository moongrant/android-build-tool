package p271o00ooooo;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzjz;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzcf f40852OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f40853OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f40854OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f40855OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f40856OooO0oo;

    public w(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2, boolean z) {
        this.f40856OooO0oo = appMeasurementDynamiteService;
        this.f40852OooO0Oo = zzcfVar;
        this.f40854OooO0o0 = str;
        this.f40853OooO0o = str2;
        this.f40855OooO0oO = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVarZzt = this.f40856OooO0oo.f15394OooO0Oo.zzt();
        zzcf zzcfVar = this.f40852OooO0Oo;
        String str = this.f40854OooO0o0;
        String str2 = this.f40853OooO0o;
        boolean z = this.f40855OooO0oO;
        zzjzVarZzt.zzg();
        zzjzVarZzt.zza();
        zzjzVarZzt.OooOO0(new O0O0(zzjzVarZzt, str, str2, zzjzVarZzt.OooO0oO(false), z, zzcfVar));
    }
}
