package o0OO0OoO;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzoz;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzki;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zzki f37790OooO00o;

    public o0O0O0o0(zzki zzkiVar) {
        this.f37790OooO00o = zzkiVar;
    }

    @WorkerThread
    public final void OooO00o() {
        this.f37790OooO00o.zzg();
        if (this.f37790OooO00o.f37615OooO00o.zzm().OooOO0(this.f37790OooO00o.f37615OooO00o.zzav().currentTimeMillis())) {
            this.f37790OooO00o.f37615OooO00o.zzm().f37771OooOO0O.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                Oooo0.OooO00o(this.f37790OooO00o.f37615OooO00o, "Detected application was in foreground");
                OooO0OO(this.f37790OooO00o.f37615OooO00o.zzav().currentTimeMillis(), false);
            }
        }
    }

    @WorkerThread
    public final void OooO0O0(long j, boolean z) {
        this.f37790OooO00o.zzg();
        this.f37790OooO00o.OooO0OO();
        if (this.f37790OooO00o.f37615OooO00o.zzm().OooOO0(j)) {
            this.f37790OooO00o.f37615OooO00o.zzm().f37771OooOO0O.zza(true);
            zzoz.zzc();
            if (this.f37790OooO00o.f37615OooO00o.zzf().zzs(null, zzeb.zzas)) {
                this.f37790OooO00o.f37615OooO00o.zzh().OooO0OO();
            }
        }
        this.f37790OooO00o.f37615OooO00o.zzm().f37773OooOOO.zzb(j);
        if (this.f37790OooO00o.f37615OooO00o.zzm().f37771OooOO0O.zzb()) {
            OooO0OO(j, z);
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void OooO0OO(long j, boolean z) {
        this.f37790OooO00o.zzg();
        if (this.f37790OooO00o.f37615OooO00o.zzJ()) {
            this.f37790OooO00o.f37615OooO00o.zzm().f37773OooOOO.zzb(j);
            this.f37790OooO00o.f37615OooO00o.zzay().zzj().zzb("Session started, time", Long.valueOf(this.f37790OooO00o.f37615OooO00o.zzav().elapsedRealtime()));
            Long lValueOf = Long.valueOf(j / 1000);
            this.f37790OooO00o.f37615OooO00o.zzq().OooOO0O(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", lValueOf, j);
            this.f37790OooO00o.f37615OooO00o.zzm().f37771OooOO0O.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", lValueOf.longValue());
            if (this.f37790OooO00o.f37615OooO00o.zzf().zzs(null, zzeb.zzZ) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.f37790OooO00o.f37615OooO00o.zzq().OooO0Oo(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_s", j, bundle);
            zznv.zzc();
            if (this.f37790OooO00o.f37615OooO00o.zzf().zzs(null, zzeb.zzac)) {
                String strZza = this.f37790OooO00o.f37615OooO00o.zzm().f37779OooOOoo.zza();
                if (TextUtils.isEmpty(strZza)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strZza);
                this.f37790OooO00o.f37615OooO00o.zzq().OooO0Oo(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ssr", j, bundle2);
            }
        }
    }
}
