package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzkp;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0OOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f41466OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzkp f41467OooO0o0;

    public oOO0OOO(zzkp zzkpVar, long j) {
        this.f41467OooO0o0 = zzkpVar;
        this.f41466OooO0Oo = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.f41466OooO0Oo;
        zzkp zzkpVar = this.f41467OooO0o0;
        zzkpVar.zzg();
        zzkpVar.OooO0OO();
        zzgd zzgdVar = zzkpVar.f41276OooO00o;
        zzgdVar.zzaA().zzj().zzb("Activity paused, time", Long.valueOf(j));
        oOO0OoO0 ooo0ooo0 = zzkpVar.f16075OooO0oO;
        zzkp zzkpVar2 = ooo0ooo0.f41472OooO0O0;
        oOO0Oo00 ooo0oo00 = new oOO0Oo00(ooo0ooo0, zzkpVar2.f41276OooO00o.zzax().currentTimeMillis(), j);
        ooo0ooo0.f41471OooO00o = ooo0oo00;
        zzkpVar2.f16071OooO0OO.postDelayed(ooo0oo00, 2000L);
        if (zzgdVar.zzf().zzu()) {
            zzkpVar.f16073OooO0o.f41418OooO0OO.OooO00o();
        }
    }
}
