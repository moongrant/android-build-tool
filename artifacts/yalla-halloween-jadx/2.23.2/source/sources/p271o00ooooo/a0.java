package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzkp;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f40452OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzkp f40453OooO0o0;

    public a0(zzkp zzkpVar, long j) {
        this.f40453OooO0o0 = zzkpVar;
        this.f40452OooO0Oo = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.f40452OooO0Oo;
        zzkp zzkpVar = this.f40453OooO0o0;
        zzkpVar.zzg();
        zzkpVar.OooO0OO();
        zzgd zzgdVar = zzkpVar.f40788OooO00o;
        zzgdVar.zzaA().zzj().zzb("Activity paused, time", Long.valueOf(j));
        c0 c0Var = zzkpVar.f15599OooO0oO;
        zzkp zzkpVar2 = c0Var.f40476OooO0O0;
        b0 b0Var = new b0(c0Var, zzkpVar2.f40788OooO00o.zzax().currentTimeMillis(), j);
        c0Var.f40475OooO00o = b0Var;
        zzkpVar2.f15595OooO0OO.postDelayed(b0Var, 2000L);
        if (zzgdVar.zzf().zzu()) {
            zzkpVar.f15597OooO0o.f40492OooO0OO.OooO00o();
        }
    }
}
