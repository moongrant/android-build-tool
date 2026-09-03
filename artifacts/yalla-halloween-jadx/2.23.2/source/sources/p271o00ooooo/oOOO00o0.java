package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzik;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOO00o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f40738OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzik f40739OooO0o0;

    public oOOO00o0(zzik zzikVar, boolean z) {
        this.f40739OooO0o0 = zzikVar;
        this.f40738OooO0Oo = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zZzJ = this.f40739OooO0o0.f40788OooO00o.zzJ();
        boolean zZzI = this.f40739OooO0o0.f40788OooO00o.zzI();
        this.f40739OooO0o0.f40788OooO00o.f15538OooOoOO = Boolean.valueOf(this.f40738OooO0Oo);
        if (zZzI == this.f40738OooO0Oo) {
            this.f40739OooO0o0.f40788OooO00o.zzaA().zzj().zzb("Default data collection state already set to", Boolean.valueOf(this.f40738OooO0Oo));
        }
        if (this.f40739OooO0o0.f40788OooO00o.zzJ() == zZzJ || this.f40739OooO0o0.f40788OooO00o.zzJ() != this.f40739OooO0o0.f40788OooO00o.zzI()) {
            this.f40739OooO0o0.f40788OooO00o.zzaA().zzl().zzc("Default data collection is different than actual status", Boolean.valueOf(this.f40738OooO0Oo), Boolean.valueOf(zZzJ));
        }
        this.f40739OooO0o0.OooOO0();
    }
}
