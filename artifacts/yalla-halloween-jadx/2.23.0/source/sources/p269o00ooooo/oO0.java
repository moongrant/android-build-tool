package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzik;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f41247OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzik f41248OooO0o0;

    public oO0(zzik zzikVar, boolean z) {
        this.f41248OooO0o0 = zzikVar;
        this.f41247OooO0Oo = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zZzJ = this.f41248OooO0o0.f41276OooO00o.zzJ();
        boolean zZzI = this.f41248OooO0o0.f41276OooO00o.zzI();
        this.f41248OooO0o0.f41276OooO00o.f16014OooOoOO = Boolean.valueOf(this.f41247OooO0Oo);
        if (zZzI == this.f41247OooO0Oo) {
            this.f41248OooO0o0.f41276OooO00o.zzaA().zzj().zzb("Default data collection state already set to", Boolean.valueOf(this.f41247OooO0Oo));
        }
        if (this.f41248OooO0o0.f41276OooO00o.zzJ() == zZzJ || this.f41248OooO0o0.f41276OooO00o.zzJ() != this.f41248OooO0o0.f41276OooO00o.zzI()) {
            this.f41248OooO0o0.f41276OooO00o.zzaA().zzl().zzc("Default data collection is different than actual status", Boolean.valueOf(this.f41247OooO0Oo), Boolean.valueOf(zZzJ));
        }
        this.f41248OooO0o0.OooOO0();
    }
}
