package p271o00ooooo;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzkp;
import com.google.android.gms.measurement.internal.zzlp;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public long f40490OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @VisibleForTesting
    public long f40491OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final d0 f40492OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzkp f40493OooO0Oo;

    public e0(zzkp zzkpVar) {
        this.f40493OooO0Oo = zzkpVar;
        this.f40492OooO0OO = new d0(this, zzkpVar.f40788OooO00o);
        long jElapsedRealtime = zzkpVar.f40788OooO00o.zzax().elapsedRealtime();
        this.f40490OooO00o = jElapsedRealtime;
        this.f40491OooO0O0 = jElapsedRealtime;
    }

    @WorkerThread
    public final boolean OooO00o(long j, boolean z, boolean z2) {
        zzkp zzkpVar = this.f40493OooO0Oo;
        zzkpVar.zzg();
        zzkpVar.zza();
        zzph.zzc();
        zzgd zzgdVar = zzkpVar.f40788OooO00o;
        if (!zzgdVar.zzf().zzs(null, zzeg.zzaf) || zzgdVar.zzJ()) {
            zzgdVar.zzm().f40774OooOOO.zzb(zzgdVar.zzax().currentTimeMillis());
        }
        long j2 = j - this.f40490OooO00o;
        if (!z && j2 < 1000) {
            zzgdVar.zzaA().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.f40491OooO0O0;
            this.f40491OooO0O0 = j;
        }
        zzgdVar.zzaA().zzj().zzb("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        zzlp.zzK(zzgdVar.zzs().zzj(!zzgdVar.zzf().zzu()), bundle, true);
        if (!z2) {
            zzgdVar.zzq().OooO0OO(bundle, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_e");
        }
        this.f40490OooO00o = j;
        d0 d0Var = this.f40492OooO0OO;
        d0Var.OooO00o();
        d0Var.OooO0OO(3600000L);
        return true;
    }
}
