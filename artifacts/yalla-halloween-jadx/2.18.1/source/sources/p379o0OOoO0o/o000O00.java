package p379o0OOoO0o;

import androidx.annotation.GuardedBy;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p377o0OOoO00.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f38709OooO0Oo = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final long f38710OooO0o0 = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0 f38711OooO00o = o0OoOo0.OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public long f38712OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public int f38713OooO0OO;

    public final synchronized boolean OooO00o() {
        return this.f38713OooO0OO == 0 || this.f38711OooO00o.OooO00o() > this.f38712OooO0O0;
    }

    public final synchronized void OooO0O0(int i) {
        long jMin;
        boolean z = false;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.f38713OooO0OO = 0;
            }
            return;
        }
        this.f38713OooO0OO++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                z = true;
            }
            try {
                if (z) {
                    double dPow = Math.pow(2.0d, this.f38713OooO0OO);
                    Objects.requireNonNull(this.f38711OooO00o);
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f38710OooO0o0);
                } else {
                    jMin = f38709OooO0Oo;
                }
                this.f38712OooO0O0 = this.f38711OooO00o.OooO00o() + jMin;
            } catch (Throwable th) {
                throw th;
            }
        }
        return;
        throw th;
    }
}
