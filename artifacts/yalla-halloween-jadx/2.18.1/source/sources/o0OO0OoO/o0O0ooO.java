package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.measurement.internal.zzjs;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0ooO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f37806Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f37807Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzid f37808Oooo0oo;

    public o0O0ooO(zzid zzidVar, AtomicReference atomicReference, boolean z) {
        this.f37808Oooo0oo = zzidVar;
        this.f37806Oooo0o = atomicReference;
        this.f37807Oooo0oO = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVarZzt = this.f37808Oooo0oo.f37615OooO00o.zzt();
        AtomicReference atomicReference = this.f37806Oooo0o;
        boolean z = this.f37807Oooo0oO;
        zzjsVarZzt.zzg();
        zzjsVarZzt.zza();
        zzjsVarZzt.OooOO0(new o00OOO0O(zzjsVarZzt, atomicReference, zzjsVarZzt.OooO0oO(false), z));
    }
}
