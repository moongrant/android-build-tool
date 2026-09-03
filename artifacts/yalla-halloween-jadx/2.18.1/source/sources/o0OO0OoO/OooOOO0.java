package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzab;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O0O0 f37501Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooOOO f37502Oooo0oO;

    public OooOOO0(OooOOO oooOOO, o000O0O0 o000o0o1) {
        this.f37502Oooo0oO = oooOOO;
        this.f37501Oooo0o = o000o0o1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37501Oooo0o.zzaw();
        if (zzab.zza()) {
            this.f37501Oooo0o.zzaz().zzp(this);
            return;
        }
        boolean z = this.f37502Oooo0oO.f37500OooO0OO != 0;
        this.f37502Oooo0oO.f37500OooO0OO = 0L;
        if (z) {
            this.f37502Oooo0oO.OooO0O0();
        }
    }
}
