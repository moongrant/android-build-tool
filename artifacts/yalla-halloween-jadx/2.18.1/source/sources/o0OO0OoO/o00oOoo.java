package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzid;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oOoo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ long f37721Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzid f37722Oooo0oO;

    public o00oOoo(zzid zzidVar, long j) {
        this.f37722Oooo0oO = zzidVar;
        this.f37721Oooo0o = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37722Oooo0oO.OooO0o(this.f37721Oooo0o, true);
        this.f37722Oooo0oO.f37615OooO00o.zzt().zzu(new AtomicReference());
    }
}
