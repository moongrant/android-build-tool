package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzer;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzkp;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f41462OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzkp f41463OooO0o0;

    public oOO0OO(zzkp zzkpVar, long j) {
        this.f41463OooO0o0 = zzkpVar;
        this.f41462OooO0Oo = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar = this.f41463OooO0o0;
        zzkpVar.zzg();
        zzkpVar.OooO0OO();
        zzgd zzgdVar = zzkpVar.f41276OooO00o;
        zzer zzerVarZzj = zzgdVar.zzaA().zzj();
        long j = this.f41462OooO0Oo;
        zzerVarZzj.zzb("Activity resumed, time", Long.valueOf(j));
        boolean zZzs = zzgdVar.zzf().zzs(null, zzeg.zzaG);
        oOO ooo = zzkpVar.f16073OooO0o;
        if (zZzs) {
            if (zzgdVar.zzf().zzu() || zzkpVar.f16072OooO0Oo) {
                ooo.f41419OooO0Oo.zzg();
                ooo.f41418OooO0OO.OooO00o();
                ooo.f41416OooO00o = j;
                ooo.f41417OooO0O0 = j;
            }
        } else if (zzgdVar.zzf().zzu() || zzgdVar.zzm().f41223OooOOo0.zzb()) {
            ooo.f41419OooO0Oo.zzg();
            ooo.f41418OooO0OO.OooO00o();
            ooo.f41416OooO00o = j;
            ooo.f41417OooO0O0 = j;
        }
        oOO0OoO0 ooo0ooo0 = zzkpVar.f16075OooO0oO;
        zzkp zzkpVar2 = ooo0ooo0.f41472OooO0O0;
        zzkpVar2.zzg();
        oOO0Oo00 ooo0oo00 = ooo0ooo0.f41471OooO00o;
        if (ooo0oo00 != null) {
            zzkpVar2.f16071OooO0OO.removeCallbacks(ooo0oo00);
        }
        zzkpVar2.f41276OooO00o.zzm().f41223OooOOo0.zza(false);
        zzkpVar2.zzg();
        zzkpVar2.f16072OooO0Oo = false;
        oOOO000o oooo000o = zzkpVar.f16074OooO0o0;
        oooo000o.f41475OooO00o.zzg();
        zzkp zzkpVar3 = oooo000o.f41475OooO00o;
        if (zzkpVar3.f41276OooO00o.zzJ()) {
            oooo000o.OooO0O0(zzkpVar3.f41276OooO00o.zzax().currentTimeMillis(), false);
        }
    }
}
