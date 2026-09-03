package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzir;
import com.google.android.gms.measurement.internal.zziz;
import com.google.android.gms.measurement.internal.zzjz;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzir f40800OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zziz f40801OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f40802OooO0o0;

    public oo000000(zziz zzizVar, zzir zzirVar, long j) {
        this.f40801OooO0o = zzizVar;
        this.f40800OooO0Oo = zzirVar;
        this.f40802OooO0o0 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzir zzirVar = this.f40800OooO0Oo;
        long j = this.f40802OooO0o0;
        zziz zzizVar = this.f40801OooO0o;
        zzizVar.OooO0Oo(zzirVar, false, j);
        zzizVar.f15577OooO0o0 = null;
        zzjz zzjzVarZzt = zzizVar.f40788OooO00o.zzt();
        zzjzVarZzt.zzg();
        zzjzVarZzt.zza();
        zzjzVarZzt.OooOO0(new e(zzjzVarZzt, null));
    }
}
