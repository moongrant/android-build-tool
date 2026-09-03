package o0OO0OoO;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzki;
import com.google.android.gms.measurement.internal.zzlh;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public long f37786OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @VisibleForTesting
    public long f37787OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0oo0o f37788OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzki f37789OooO0Oo;

    public o0O0O0Oo(zzki zzkiVar) {
        this.f37789OooO0Oo = zzkiVar;
        this.f37788OooO0OO = new o0O0oo0o(this, zzkiVar.f37615OooO00o);
        long jElapsedRealtime = zzkiVar.f37615OooO00o.zzav().elapsedRealtime();
        this.f37786OooO00o = jElapsedRealtime;
        this.f37787OooO0O0 = jElapsedRealtime;
    }

    @WorkerThread
    public final boolean OooO00o(boolean z, boolean z2, long j) {
        this.f37789OooO0Oo.zzg();
        this.f37789OooO0Oo.zza();
        zzoe.zzc();
        if (!this.f37789OooO0Oo.f37615OooO00o.zzf().zzs(null, zzeb.zzad) || this.f37789OooO0Oo.f37615OooO00o.zzJ()) {
            this.f37789OooO0Oo.f37615OooO00o.zzm().f37773OooOOO.zzb(this.f37789OooO0Oo.f37615OooO00o.zzav().currentTimeMillis());
        }
        long j2 = j - this.f37786OooO00o;
        if (!z && j2 < 1000) {
            this.f37789OooO0Oo.f37615OooO00o.zzay().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.f37787OooO0O0;
            this.f37787OooO0O0 = j;
        }
        this.f37789OooO0Oo.f37615OooO00o.zzay().zzj().zzb("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        zzlh.zzK(this.f37789OooO0Oo.f37615OooO00o.zzs().zzj(!this.f37789OooO0Oo.f37615OooO00o.zzf().zzu()), bundle, true);
        if (!z2) {
            this.f37789OooO0Oo.f37615OooO00o.zzq().OooO0OO(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_e", bundle);
        }
        this.f37786OooO00o = j;
        this.f37788OooO0OO.OooO00o();
        this.f37788OooO0OO.OooO0OO(3600000L);
        return true;
    }
}
