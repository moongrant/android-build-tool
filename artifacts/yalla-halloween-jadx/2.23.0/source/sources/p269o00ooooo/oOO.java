package p269o00ooooo;

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
public final class oOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public long f41416OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @VisibleForTesting
    public long f41417OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ooooO0O0 f41418OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzkp f41419OooO0Oo;

    public oOO(zzkp zzkpVar) {
        this.f41419OooO0Oo = zzkpVar;
        this.f41418OooO0OO = new ooooO0O0(this, zzkpVar.f41276OooO00o);
        long jElapsedRealtime = zzkpVar.f41276OooO00o.zzax().elapsedRealtime();
        this.f41416OooO00o = jElapsedRealtime;
        this.f41417OooO0O0 = jElapsedRealtime;
    }

    @WorkerThread
    public final boolean OooO00o(long j, boolean z, boolean z2) {
        zzkp zzkpVar = this.f41419OooO0Oo;
        zzkpVar.zzg();
        zzkpVar.zza();
        zzph.zzc();
        zzgd zzgdVar = zzkpVar.f41276OooO00o;
        if (!zzgdVar.zzf().zzs(null, zzeg.zzaf) || zzgdVar.zzJ()) {
            zzgdVar.zzm().f41218OooOOO.zzb(zzgdVar.zzax().currentTimeMillis());
        }
        long j2 = j - this.f41416OooO00o;
        if (!z && j2 < 1000) {
            zzgdVar.zzaA().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.f41417OooO0O0;
            this.f41417OooO0O0 = j;
        }
        zzgdVar.zzaA().zzj().zzb("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        zzlp.zzK(zzgdVar.zzs().zzj(!zzgdVar.zzf().zzu()), bundle, true);
        if (!z2) {
            zzgdVar.zzq().OooO0OO(bundle, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_e");
        }
        this.f41416OooO00o = j;
        ooooO0O0 ooooo0o0 = this.f41418OooO0OO;
        ooooo0o0.OooO00o();
        ooooo0o0.OooO0OO(3600000L);
        return true;
    }
}
