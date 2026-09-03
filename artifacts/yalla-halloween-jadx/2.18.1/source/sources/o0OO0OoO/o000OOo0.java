package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzid;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ long f37623Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzid f37624Oooo0oO;

    public o000OOo0(zzid zzidVar, long j) {
        this.f37624Oooo0oO = zzidVar;
        this.f37623Oooo0o = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37624Oooo0oO.f37615OooO00o.zzm().f37770OooOO0.zzb(this.f37623Oooo0o);
        this.f37624Oooo0oO.f37615OooO00o.zzay().zzc().zzb("Session timeout duration set", Long.valueOf(this.f37623Oooo0o));
    }
}
