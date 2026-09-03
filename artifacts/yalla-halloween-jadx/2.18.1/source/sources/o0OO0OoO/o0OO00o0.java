package o0OO0OoO;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzjs;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00o0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f37823Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzcf f37824Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f37825Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f37826Oooo0oo;

    public o0OO00o0(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2) {
        this.f37823Oooo = appMeasurementDynamiteService;
        this.f37824Oooo0o = zzcfVar;
        this.f37825Oooo0oO = str;
        this.f37826Oooo0oo = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVarZzt = this.f37823Oooo.f16073OooO00o.zzt();
        zzcf zzcfVar = this.f37824Oooo0o;
        String str = this.f37825Oooo0oO;
        String str2 = this.f37826Oooo0oo;
        zzjsVarZzt.zzg();
        zzjsVarZzt.zza();
        zzjsVarZzt.OooOO0(new o0O000Oo(zzjsVarZzt, str, str2, zzjsVarZzt.OooO0oO(false), zzcfVar));
    }
}
