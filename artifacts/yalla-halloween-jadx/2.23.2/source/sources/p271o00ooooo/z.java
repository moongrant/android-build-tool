package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzer;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzkp;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f40870OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzkp f40871OooO0o0;

    public z(zzkp zzkpVar, long j) {
        this.f40871OooO0o0 = zzkpVar;
        this.f40870OooO0Oo = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar = this.f40871OooO0o0;
        zzkpVar.zzg();
        zzkpVar.OooO0OO();
        zzgd zzgdVar = zzkpVar.f40788OooO00o;
        zzer zzerVarZzj = zzgdVar.zzaA().zzj();
        long j = this.f40870OooO0Oo;
        zzerVarZzj.zzb("Activity resumed, time", Long.valueOf(j));
        boolean zZzs = zzgdVar.zzf().zzs(null, zzeg.zzaG);
        e0 e0Var = zzkpVar.f15597OooO0o;
        if (zZzs) {
            if (zzgdVar.zzf().zzu() || zzkpVar.f15596OooO0Oo) {
                e0Var.f40493OooO0Oo.zzg();
                e0Var.f40492OooO0OO.OooO00o();
                e0Var.f40490OooO00o = j;
                e0Var.f40491OooO0O0 = j;
            }
        } else if (zzgdVar.zzf().zzu() || zzgdVar.zzm().f40779OooOOo0.zzb()) {
            e0Var.f40493OooO0Oo.zzg();
            e0Var.f40492OooO0OO.OooO00o();
            e0Var.f40490OooO00o = j;
            e0Var.f40491OooO0O0 = j;
        }
        c0 c0Var = zzkpVar.f15599OooO0oO;
        zzkp zzkpVar2 = c0Var.f40476OooO0O0;
        zzkpVar2.zzg();
        b0 b0Var = c0Var.f40475OooO00o;
        if (b0Var != null) {
            zzkpVar2.f15595OooO0OO.removeCallbacks(b0Var);
        }
        zzkpVar2.f40788OooO00o.zzm().f40779OooOOo0.zza(false);
        zzkpVar2.zzg();
        zzkpVar2.f15596OooO0Oo = false;
        f0 f0Var = zzkpVar.f15598OooO0o0;
        f0Var.f40499OooO00o.zzg();
        zzkp zzkpVar3 = f0Var.f40499OooO00o;
        if (zzkpVar3.f40788OooO00o.zzJ()) {
            f0Var.OooO0O0(zzkpVar3.f40788OooO00o.zzax().currentTimeMillis(), false);
        }
    }
}
