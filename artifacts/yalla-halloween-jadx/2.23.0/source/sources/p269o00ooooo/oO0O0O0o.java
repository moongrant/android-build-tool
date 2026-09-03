package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzir;
import com.google.android.gms.measurement.internal.zziz;
import com.google.android.gms.measurement.internal.zzjz;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O0O0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzir f41339OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zziz f41340OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f41341OooO0o0;

    public oO0O0O0o(zziz zzizVar, zzir zzirVar, long j) {
        this.f41340OooO0o = zzizVar;
        this.f41339OooO0Oo = zzirVar;
        this.f41341OooO0o0 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzir zzirVar = this.f41339OooO0Oo;
        long j = this.f41341OooO0o0;
        zziz zzizVar = this.f41340OooO0o;
        zzizVar.OooO0Oo(zzirVar, false, j);
        zzizVar.f16053OooO0o0 = null;
        zzjz zzjzVarZzt = zzizVar.f41276OooO00o.zzt();
        zzjzVarZzt.zzg();
        zzjzVarZzt.zza();
        zzjzVarZzt.OooOO0(new oO0Oo0o0(zzjzVarZzt, null));
    }
}
