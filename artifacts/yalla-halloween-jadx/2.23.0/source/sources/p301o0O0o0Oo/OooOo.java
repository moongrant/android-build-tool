package p301o0O0o0Oo;

import androidx.annotation.GuardedBy;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p303o0O0o0o0.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f42401OooO0Oo = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final long f42402OooO0o0 = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0o0.OooOo f42403OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public long f42404OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public int f42405OooO0OO;

    public OooOo() {
        if (OooO0O0.f42408OooO00o == null) {
            Pattern pattern = o0O0o0.OooOo.f42387OooO0OO;
            OooO0O0.f42408OooO00o = new OooO0O0();
        }
        OooO0O0 oooO0O0 = OooO0O0.f42408OooO00o;
        if (o0O0o0.OooOo.f42388OooO0Oo == null) {
            o0O0o0.OooOo.f42388OooO0Oo = new o0O0o0.OooOo(oooO0O0);
        }
        this.f42403OooO00o = o0O0o0.OooOo.f42388OooO0Oo;
    }

    public final synchronized long OooO00o(int i) {
        try {
            if (!(i == 429 || (i >= 500 && i < 600))) {
                return f42401OooO0Oo;
            }
            double dPow = Math.pow(2.0d, this.f42405OooO0OO);
            this.f42403OooO00o.getClass();
            return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f42402OooO0o0);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    public final synchronized boolean OooO0O0() {
        boolean z;
        if (this.f42405OooO0OO != 0) {
            this.f42403OooO00o.f42389OooO00o.getClass();
            if (System.currentTimeMillis() > this.f42404OooO0O0) {
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
        this.f42405OooO0OO = 0;
    }

    public final synchronized void OooO0Oo(int i) {
        try {
            if ((i >= 200 && i < 300) || i == 401 || i == 404) {
                OooO0OO();
                return;
            }
            this.f42405OooO0OO++;
            long jOooO00o = OooO00o(i);
            this.f42403OooO00o.f42389OooO00o.getClass();
            this.f42404OooO0O0 = System.currentTimeMillis() + jOooO00o;
        } catch (Throwable th) {
            throw th;
        }
    }
}
