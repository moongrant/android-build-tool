package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzjz;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0O0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f40709OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f40710OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f40711OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f40712OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzik f40713OooO0oo;

    public oOO0O0O(zzik zzikVar, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.f40713OooO0oo = zzikVar;
        this.f40709OooO0Oo = atomicReference;
        this.f40711OooO0o0 = str;
        this.f40710OooO0o = str2;
        this.f40712OooO0oO = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVarZzt = this.f40713OooO0oo.f40788OooO00o.zzt();
        AtomicReference atomicReference = this.f40709OooO0Oo;
        String str = this.f40711OooO0o0;
        String str2 = this.f40710OooO0o;
        boolean z = this.f40712OooO0oO;
        zzjzVarZzt.zzg();
        zzjzVarZzt.zza();
        zzjzVarZzt.OooOO0(new q(zzjzVarZzt, atomicReference, str, str2, zzjzVarZzt.OooO0oO(false), z));
    }
}
