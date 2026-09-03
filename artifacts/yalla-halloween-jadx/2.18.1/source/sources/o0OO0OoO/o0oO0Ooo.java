package o0OO0OoO;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzjs;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oO0Ooo implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f37868Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzcf f37869Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f37870Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f37871Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f37872OoooO00;

    public o0oO0Ooo(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2, boolean z) {
        this.f37872OoooO00 = appMeasurementDynamiteService;
        this.f37869Oooo0o = zzcfVar;
        this.f37870Oooo0oO = str;
        this.f37871Oooo0oo = str2;
        this.f37868Oooo = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVarZzt = this.f37872OoooO00.f16073OooO00o.zzt();
        zzcf zzcfVar = this.f37869Oooo0o;
        String str = this.f37870Oooo0oO;
        String str2 = this.f37871Oooo0oo;
        boolean z = this.f37868Oooo;
        zzjsVarZzt.zzg();
        zzjsVarZzt.zza();
        zzjsVarZzt.OooOO0(new o00OOO00(zzjsVarZzt, str, str2, zzjsVarZzt.OooO0oO(false), z, zzcfVar));
    }
}
