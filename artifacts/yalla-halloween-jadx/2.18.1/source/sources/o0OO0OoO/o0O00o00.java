package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzki;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00o00 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ long f37758Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzki f37759Oooo0oO;

    public o0O00o00(zzki zzkiVar, long j) {
        this.f37759Oooo0oO = zzkiVar;
        this.f37758Oooo0o = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzki zzkiVar = this.f37759Oooo0oO;
        long j = this.f37758Oooo0o;
        zzkiVar.zzg();
        zzkiVar.OooO0OO();
        zzkiVar.f37615OooO00o.zzay().zzj().zzb("Activity resumed, time", Long.valueOf(j));
        if (zzkiVar.f37615OooO00o.zzf().zzu() || zzkiVar.f37615OooO00o.zzm().f37776OooOOOo.zzb()) {
            o0O0O0Oo o0o0o0oo = zzkiVar.f16278OooO0o0;
            o0o0o0oo.f37789OooO0Oo.zzg();
            o0o0o0oo.f37788OooO0OO.OooO00o();
            o0o0o0oo.f37786OooO00o = j;
            o0o0o0oo.f37787OooO0O0 = j;
        }
        o0oO0O0o o0oo0o0o2 = zzkiVar.f16277OooO0o;
        o0oo0o0o2.f37867OooO0O0.zzg();
        o0O0O0O o0o0o0o = o0oo0o0o2.f37866OooO00o;
        if (o0o0o0o != null) {
            o0oo0o0o2.f37867OooO0O0.f16275OooO0OO.removeCallbacks(o0o0o0o);
        }
        o0oo0o0o2.f37867OooO0O0.f37615OooO00o.zzm().f37776OooOOOo.zza(false);
        o0O0O0o0 o0o0o0o0 = zzkiVar.f16276OooO0Oo;
        o0o0o0o0.f37790OooO00o.zzg();
        if (o0o0o0o0.f37790OooO00o.f37615OooO00o.zzJ()) {
            o0o0o0o0.OooO0O0(o0o0o0o0.f37790OooO00o.f37615OooO00o.zzav().currentTimeMillis(), false);
        }
    }
}
