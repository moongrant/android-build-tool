package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzjz;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00OOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f41293OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzik f41294OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f41295OooO0o0;

    public oO00OOO(zzik zzikVar, AtomicReference atomicReference, boolean z) {
        this.f41294OooO0o = zzikVar;
        this.f41293OooO0Oo = atomicReference;
        this.f41295OooO0o0 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVarZzt = this.f41294OooO0o.f41276OooO00o.zzt();
        zzjzVarZzt.zzg();
        zzjzVarZzt.zza();
        zzjzVarZzt.OooOO0(new oOo0o0oO(zzjzVarZzt, this.f41293OooO0Oo, zzjzVarZzt.OooO0oO(false), this.f41295OooO0o0));
    }
}
