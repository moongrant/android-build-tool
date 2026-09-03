package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzid;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f37900Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzid f37901Oooo0oO;

    public oo0o0O0(zzid zzidVar, boolean z) {
        this.f37901Oooo0oO = zzidVar;
        this.f37900Oooo0o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zZzJ = this.f37901Oooo0oO.f37615OooO00o.zzJ();
        boolean zZzI = this.f37901Oooo0oO.f37615OooO00o.zzI();
        this.f37901Oooo0oO.f37615OooO00o.f16218OooOoOO = Boolean.valueOf(this.f37900Oooo0o);
        if (zZzI == this.f37900Oooo0o) {
            this.f37901Oooo0oO.f37615OooO00o.zzay().zzj().zzb("Default data collection state already set to", Boolean.valueOf(this.f37900Oooo0o));
        }
        if (this.f37901Oooo0oO.f37615OooO00o.zzJ() == zZzJ || this.f37901Oooo0oO.f37615OooO00o.zzJ() != this.f37901Oooo0oO.f37615OooO00o.zzI()) {
            this.f37901Oooo0oO.f37615OooO00o.zzay().zzl().zzc("Default data collection is different than actual status", Boolean.valueOf(this.f37900Oooo0o), Boolean.valueOf(zZzJ));
        }
        this.f37901Oooo0oO.OooOOO0();
    }
}
