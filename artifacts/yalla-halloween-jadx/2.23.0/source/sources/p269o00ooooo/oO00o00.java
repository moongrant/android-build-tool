package p269o00ooooo;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzkp;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00o00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzcf f41308OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzik f41309OooO0o0;

    public oO00o00(zzik zzikVar, zzcf zzcfVar) {
        this.f41309OooO0o0 = zzikVar;
        this.f41308OooO0Oo = zzcfVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007e  */
    /* JADX WARN: Code duplicated, block: B:24:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Long lValueOf;
        zzcf zzcfVar;
        zzik zzikVar = this.f41309OooO0o0;
        zzkp zzkpVarZzu = zzikVar.f41276OooO00o.zzu();
        zzqr.zzc();
        boolean zZzs = zzkpVarZzu.f41276OooO00o.zzf().zzs(null, zzeg.zzau);
        zzgd zzgdVar = zzkpVarZzu.f41276OooO00o;
        if (!zZzs) {
            zzgdVar.zzaA().zzl().zza("getSessionId has been disabled.");
        } else {
            if (zzgdVar.zzm().OooO0o0().zzj(zzha.ANALYTICS_STORAGE)) {
                if (!zzgdVar.zzm().OooO(zzgdVar.zzax().currentTimeMillis()) && zzgdVar.zzm().f41220OooOOOO.zza() != 0) {
                    lValueOf = Long.valueOf(zzgdVar.zzm().f41220OooOOOO.zza());
                }
                zzcfVar = this.f41308OooO0Oo;
                if (lValueOf != null) {
                    zzikVar.f41276OooO00o.zzv().zzV(zzcfVar, lValueOf.longValue());
                }
                try {
                    zzcfVar.zze(null);
                } catch (RemoteException e) {
                    zzikVar.f41276OooO00o.zzaA().zzd().zzb("getSessionId failed with exception", e);
                    return;
                }
            }
            zzgdVar.zzaA().zzl().zza("Analytics storage consent denied; will not get session id");
        }
        lValueOf = null;
        zzcfVar = this.f41308OooO0Oo;
        if (lValueOf != null) {
            zzikVar.f41276OooO00o.zzv().zzV(zzcfVar, lValueOf.longValue());
        } else {
            zzcfVar.zze(null);
        }
    }
}
