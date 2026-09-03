package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzis;
import com.google.android.gms.measurement.internal.zzjs;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzik f37678Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f37679Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzis f37680Oooo0oo;

    public o00OO(zzis zzisVar, zzik zzikVar, long j) {
        this.f37680Oooo0oo = zzisVar;
        this.f37678Oooo0o = zzikVar;
        this.f37679Oooo0oO = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37680Oooo0oo.OooO0Oo(this.f37678Oooo0o, false, this.f37679Oooo0oO);
        zzis zzisVar = this.f37680Oooo0oo;
        zzisVar.f16257OooO0o0 = null;
        zzjs zzjsVarZzt = zzisVar.f37615OooO00o.zzt();
        zzjsVarZzt.zzg();
        zzjsVarZzt.zza();
        zzjsVarZzt.OooOO0(new o0O00o0(zzjsVarZzt, null));
    }
}
