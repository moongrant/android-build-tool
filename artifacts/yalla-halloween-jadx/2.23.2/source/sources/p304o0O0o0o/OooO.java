package p304o0O0o0o;

import androidx.annotation.GuardedBy;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p302o0O0o0OO.o000Oo0;
import p565o0oOo0O0.o00oO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f41759OooO0Oo = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final long f41760OooO0o0 = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000Oo0 f41761OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public long f41762OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public int f41763OooO0OO;

    public OooO() {
        if (o00oO0o.f56391OooO00o == null) {
            Pattern pattern = o000Oo0.f41756OooO0OO;
            o00oO0o.f56391OooO00o = new o00oO0o();
        }
        o00oO0o o00oo0o2 = o00oO0o.f56391OooO00o;
        if (o000Oo0.f41757OooO0Oo == null) {
            o000Oo0.f41757OooO0Oo = new o000Oo0(o00oo0o2);
        }
        this.f41761OooO00o = o000Oo0.f41757OooO0Oo;
    }

    public final synchronized long OooO00o(int i) {
        try {
            if (!(i == 429 || (i >= 500 && i < 600))) {
                return f41759OooO0Oo;
            }
            double dPow = Math.pow(2.0d, this.f41763OooO0OO);
            this.f41761OooO00o.getClass();
            return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f41760OooO0o0);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    public final synchronized boolean OooO0O0() {
        boolean z;
        if (this.f41763OooO0OO != 0) {
            this.f41761OooO00o.f41758OooO00o.getClass();
            if (System.currentTimeMillis() > this.f41762OooO0O0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return z;
    }

    public final synchronized void OooO0OO() {
        this.f41763OooO0OO = 0;
    }

    public final synchronized void OooO0Oo(int i) {
        try {
            if ((i >= 200 && i < 300) || i == 401 || i == 404) {
                OooO0OO();
                return;
            }
            this.f41763OooO0OO++;
            long jOooO00o = OooO00o(i);
            this.f41761OooO00o.f41758OooO00o.getClass();
            this.f41762OooO0O0 = System.currentTimeMillis() + jOooO00o;
        } catch (Throwable th) {
            throw th;
        }
    }
}
