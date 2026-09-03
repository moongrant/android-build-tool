package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzlc;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ zzjs f37692Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzq f37693Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f37694Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzlc f37695Oooo0oo;

    public o00OOO0(zzjs zzjsVar, zzq zzqVar, boolean z, zzlc zzlcVar) {
        this.f37692Oooo = zzjsVar;
        this.f37693Oooo0o = zzqVar;
        this.f37694Oooo0oO = z;
        this.f37695Oooo0oo = zzlcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.f37692Oooo;
        zzee zzeeVar = zzjsVar.f16268OooO0Oo;
        if (zzeeVar == null) {
            p167o00Ooo.OooOO0.OooO0O0(zzjsVar.f37615OooO00o, "Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.f37693Oooo0o);
        this.f37692Oooo.OooO0OO(zzeeVar, this.f37694Oooo0oO ? null : this.f37695Oooo0oo, this.f37693Oooo0o);
        this.f37692Oooo.OooO();
    }
}
