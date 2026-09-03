package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzjz;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00o000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f41310OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f41311OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f41312OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f41313OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzik f41314OooO0oo;

    public oO00o000(zzik zzikVar, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.f41314OooO0oo = zzikVar;
        this.f41310OooO0Oo = atomicReference;
        this.f41312OooO0o0 = str;
        this.f41311OooO0o = str2;
        this.f41313OooO0oO = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVarZzt = this.f41314OooO0oo.f41276OooO00o.zzt();
        AtomicReference atomicReference = this.f41310OooO0Oo;
        String str = this.f41312OooO0o0;
        String str2 = this.f41311OooO0o;
        boolean z = this.f41313OooO0oO;
        zzjzVarZzt.zzg();
        zzjzVarZzt.zza();
        zzjzVarZzt.OooOO0(new oOO00OO(zzjzVarZzt, atomicReference, str, str2, zzjzVarZzt.OooO0oO(false), z));
    }
}
