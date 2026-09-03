package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000O implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ zzjs f37734Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzq f37735Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f37736Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzac f37737Oooo0oo;

    public o0O000O(zzjs zzjsVar, zzq zzqVar, boolean z, zzac zzacVar) {
        this.f37734Oooo = zzjsVar;
        this.f37735Oooo0o = zzqVar;
        this.f37736Oooo0oO = z;
        this.f37737Oooo0oo = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.f37734Oooo;
        zzee zzeeVar = zzjsVar.f16268OooO0Oo;
        if (zzeeVar == null) {
            p167o00Ooo.OooOO0.OooO0O0(zzjsVar.f37615OooO00o, "Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.f37735Oooo0o);
        this.f37734Oooo.OooO0OO(zzeeVar, this.f37736Oooo0oO ? null : this.f37737Oooo0oo, this.f37735Oooo0o);
        this.f37734Oooo.OooO();
    }
}
