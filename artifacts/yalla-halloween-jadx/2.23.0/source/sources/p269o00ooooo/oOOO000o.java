package p269o00ooooo;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzkp;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOO000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zzkp f41475OooO00o;

    public oOOO000o(zzkp zzkpVar) {
        this.f41475OooO00o = zzkpVar;
    }

    @WorkerThread
    public final void OooO00o() {
        zzkp zzkpVar = this.f41475OooO00o;
        zzkpVar.zzg();
        zzgd zzgdVar = zzkpVar.f41276OooO00o;
        if (zzgdVar.zzm().OooO(zzgdVar.zzax().currentTimeMillis())) {
            zzgdVar.zzm().f41216OooOO0O.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                zzgdVar.zzaA().zzj().zza("Detected application was in foreground");
                OooO0OO(zzgdVar.zzax().currentTimeMillis(), false);
            }
        }
    }

    @WorkerThread
    public final void OooO0O0(long j, boolean z) {
        zzkp zzkpVar = this.f41475OooO00o;
        zzkpVar.zzg();
        zzkpVar.OooO0OO();
        zzgd zzgdVar = zzkpVar.f41276OooO00o;
        if (zzgdVar.zzm().OooO(j)) {
            zzgdVar.zzm().f41216OooOO0O.zza(true);
            zzqu.zzc();
            if (zzgdVar.zzf().zzs(null, zzeg.zzan)) {
                zzgdVar.zzh().OooO0OO();
            }
        }
        zzgdVar.zzm().f41218OooOOO.zzb(j);
        if (zzgdVar.zzm().f41216OooOO0O.zzb()) {
            OooO0OO(j, z);
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void OooO0OO(long j, boolean z) {
        zzkp zzkpVar = this.f41475OooO00o;
        zzkpVar.zzg();
        if (zzkpVar.f41276OooO00o.zzJ()) {
            zzkpVar.f41276OooO00o.zzm().f41218OooOOO.zzb(j);
            zzkpVar.f41276OooO00o.zzaA().zzj().zzb("Session started, time", Long.valueOf(zzkpVar.f41276OooO00o.zzax().elapsedRealtime()));
            Long lValueOf = Long.valueOf(j / 1000);
            zzkpVar.f41276OooO00o.zzq().OooO0oo(j, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", lValueOf);
            zzkpVar.f41276OooO00o.zzm().f41220OooOOOO.zzb(lValueOf.longValue());
            zzkpVar.f41276OooO00o.zzm().f41216OooOO0O.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", lValueOf.longValue());
            if (zzkpVar.f41276OooO00o.zzf().zzs(null, zzeg.zzab) && z) {
                bundle.putLong("_aib", 1L);
            }
            zzkpVar.f41276OooO00o.zzq().OooO0Oo(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_s", bundle, j);
            zzos.zzc();
            if (zzkpVar.f41276OooO00o.zzf().zzs(null, zzeg.zzae)) {
                String strZza = zzkpVar.f41276OooO00o.zzm().f41226OooOo00.zza();
                if (TextUtils.isEmpty(strZza)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strZza);
                zzkpVar.f41276OooO00o.zzq().OooO0Oo(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ssr", bundle2, j);
            }
        }
    }
}
