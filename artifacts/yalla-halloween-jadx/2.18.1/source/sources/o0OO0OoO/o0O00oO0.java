package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzki;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00oO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ long f37760Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzki f37761Oooo0oO;

    public o0O00oO0(zzki zzkiVar, long j) {
        this.f37761Oooo0oO = zzkiVar;
        this.f37760Oooo0o = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzki zzkiVar = this.f37761Oooo0oO;
        long j = this.f37760Oooo0o;
        zzkiVar.zzg();
        zzkiVar.OooO0OO();
        zzkiVar.f37615OooO00o.zzay().zzj().zzb("Activity paused, time", Long.valueOf(j));
        o0oO0O0o o0oo0o0o2 = zzkiVar.f16277OooO0o;
        o0O0O0O o0o0o0o = new o0O0O0O(o0oo0o0o2, o0oo0o0o2.f37867OooO0O0.f37615OooO00o.zzav().currentTimeMillis(), j);
        o0oo0o0o2.f37866OooO00o = o0o0o0o;
        o0oo0o0o2.f37867OooO0O0.f16275OooO0OO.postDelayed(o0o0o0o, 2000L);
        if (zzkiVar.f37615OooO00o.zzf().zzu()) {
            zzkiVar.f16278OooO0o0.f37788OooO0OO.OooO00o();
        }
    }
}
