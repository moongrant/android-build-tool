package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzjz;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00Oo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f41300OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f41301OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f41302OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzik f41303OooO0oO;

    public oO00Oo0(zzik zzikVar, AtomicReference atomicReference, String str, String str2) {
        this.f41303OooO0oO = zzikVar;
        this.f41300OooO0Oo = atomicReference;
        this.f41302OooO0o0 = str;
        this.f41301OooO0o = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVarZzt = this.f41303OooO0oO.f41276OooO00o.zzt();
        AtomicReference atomicReference = this.f41300OooO0Oo;
        String str = this.f41302OooO0o0;
        String str2 = this.f41301OooO0o;
        zzjzVarZzt.zzg();
        zzjzVarZzt.zza();
        zzjzVarZzt.OooOO0(new oOO00(zzjzVarZzt, atomicReference, str, str2, zzjzVarZzt.OooO0oO(false)));
    }
}
