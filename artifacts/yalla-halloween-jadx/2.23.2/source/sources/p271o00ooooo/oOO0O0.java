package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzjz;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f40701OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f40702OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f40703OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzik f40704OooO0oO;

    public oOO0O0(zzik zzikVar, AtomicReference atomicReference, String str, String str2) {
        this.f40704OooO0oO = zzikVar;
        this.f40701OooO0Oo = atomicReference;
        this.f40703OooO0o0 = str;
        this.f40702OooO0o = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVarZzt = this.f40704OooO0oO.f40788OooO00o.zzt();
        AtomicReference atomicReference = this.f40701OooO0Oo;
        String str = this.f40703OooO0o0;
        String str2 = this.f40702OooO0o;
        zzjzVarZzt.zzg();
        zzjzVarZzt.zza();
        zzjzVarZzt.OooOO0(new n(zzjzVarZzt, atomicReference, str, str2, zzjzVarZzt.OooO0oO(false)));
    }
}
