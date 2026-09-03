package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzjr;
import com.google.android.gms.measurement.internal.zzjs;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoO00O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzee f37856Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzjr f37857Oooo0oO;

    public o0OoO00O(zzjr zzjrVar, zzee zzeeVar) {
        this.f37857Oooo0oO = zzjrVar;
        this.f37856Oooo0o = zzeeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f37857Oooo0oO) {
            this.f37857Oooo0oO.f16263OooO00o = false;
            if (!this.f37857Oooo0oO.f16265OooO0OO.zzL()) {
                this.f37857Oooo0oO.f16265OooO0OO.f37615OooO00o.zzay().zzc().zza("Connected to remote service");
                zzjs zzjsVar = this.f37857Oooo0oO.f16265OooO0OO;
                zzee zzeeVar = this.f37856Oooo0o;
                zzjsVar.zzg();
                Preconditions.checkNotNull(zzeeVar);
                zzjsVar.f16268OooO0Oo = zzeeVar;
                zzjsVar.OooO();
                zzjsVar.OooO0oo();
            }
        }
    }
}
