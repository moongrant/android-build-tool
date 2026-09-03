package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzjz;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ooooO000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f40810OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzik f40811OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f40812OooO0o0;

    public ooooO000(zzik zzikVar, AtomicReference atomicReference, boolean z) {
        this.f40811OooO0o = zzikVar;
        this.f40810OooO0Oo = atomicReference;
        this.f40812OooO0o0 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVarZzt = this.f40811OooO0o.f40788OooO00o.zzt();
        zzjzVarZzt.zzg();
        zzjzVarZzt.zza();
        zzjzVarZzt.OooOO0(new O0OO00(zzjzVarZzt, this.f40810OooO0Oo, zzjzVarZzt.OooO0oO(false), this.f40812OooO0o0));
    }
}
