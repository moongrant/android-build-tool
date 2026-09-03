package p674o0oooo0;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class o0o0Oo extends o0oO0O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final long f52083OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final long f52084OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static o0o0Oo f52085OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final OooO00o f52086OooOO0O = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o0o0Oo f52087OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f52088OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f52089OooO0oO;

    public static final class OooO00o {
        @Nullable
        public final o0o0Oo OooO00o() throws InterruptedException {
            o0o0Oo o0o0oo = o0o0Oo.f52085OooOO0;
            Intrinsics.checkNotNull(o0o0oo);
            o0o0Oo o0o0oo2 = o0o0oo.f52087OooO0o;
            if (o0o0oo2 == null) {
                long jNanoTime = System.nanoTime();
                o0o0Oo.class.wait(o0o0Oo.f52084OooO0oo);
                o0o0Oo o0o0oo3 = o0o0Oo.f52085OooOO0;
                Intrinsics.checkNotNull(o0o0oo3);
                if (o0o0oo3.f52087OooO0o != null || System.nanoTime() - jNanoTime < o0o0Oo.f52083OooO) {
                    return null;
                }
                return o0o0Oo.f52085OooOO0;
            }
            long jNanoTime2 = o0o0oo2.f52089OooO0oO - System.nanoTime();
            if (jNanoTime2 > 0) {
                long j = jNanoTime2 / 1000000;
                o0o0Oo.class.wait(j, (int) (jNanoTime2 - (1000000 * j)));
                return null;
            }
            o0o0Oo o0o0oo4 = o0o0Oo.f52085OooOO0;
            Intrinsics.checkNotNull(o0o0oo4);
            o0o0oo4.f52087OooO0o = o0o0oo2.f52087OooO0o;
            o0o0oo2.f52087OooO0o = null;
            return o0o0oo2;
        }
    }

    public static final class OooO0O0 extends Thread {
        public OooO0O0() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            o0o0Oo o0o0ooOooO00o;
            while (true) {
                try {
                    synchronized (o0o0Oo.class) {
                        o0o0ooOooO00o = o0o0Oo.f52086OooOO0O.OooO00o();
                        if (o0o0ooOooO00o == o0o0Oo.f52085OooOO0) {
                            o0o0Oo.f52085OooOO0 = null;
                            return;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    if (o0o0ooOooO00o != null) {
                        o0o0ooOooO00o.OooOO0o();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f52084OooO0oo = millis;
        f52083OooO = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void OooO() {
        long j = this.f52093OooO0OO;
        boolean z = this.f52091OooO00o;
        if (j != 0 || z) {
            synchronized (o0o0Oo.class) {
                if (!(!this.f52088OooO0o0)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.f52088OooO0o0 = true;
                if (f52085OooOO0 == null) {
                    f52085OooOO0 = new o0o0Oo();
                    new OooO0O0().start();
                }
                long jNanoTime = System.nanoTime();
                if (j != 0 && z) {
                    this.f52089OooO0oO = Math.min(j, OooO0OO() - jNanoTime) + jNanoTime;
                } else if (j != 0) {
                    this.f52089OooO0oO = j + jNanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.f52089OooO0oO = OooO0OO();
                }
                long j2 = this.f52089OooO0oO - jNanoTime;
                o0o0Oo o0o0oo = f52085OooOO0;
                Intrinsics.checkNotNull(o0o0oo);
                while (true) {
                    o0o0Oo o0o0oo2 = o0o0oo.f52087OooO0o;
                    if (o0o0oo2 == null) {
                        break;
                    }
                    Intrinsics.checkNotNull(o0o0oo2);
                    if (j2 < o0o0oo2.f52089OooO0oO - jNanoTime) {
                        break;
                    }
                    o0o0oo = o0o0oo.f52087OooO0o;
                    Intrinsics.checkNotNull(o0o0oo);
                }
                this.f52087OooO0o = o0o0oo.f52087OooO0o;
                o0o0oo.f52087OooO0o = this;
                if (o0o0oo == f52085OooOO0) {
                    o0o0Oo.class.notify();
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final boolean OooOO0() {
        boolean z;
        synchronized (o0o0Oo.class) {
            z = false;
            if (this.f52088OooO0o0) {
                this.f52088OooO0o0 = false;
                o0o0Oo o0o0oo = f52085OooOO0;
                while (o0o0oo != null) {
                    o0o0Oo o0o0oo2 = o0o0oo.f52087OooO0o;
                    if (o0o0oo2 == this) {
                        o0o0oo.f52087OooO0o = this.f52087OooO0o;
                        this.f52087OooO0o = null;
                    } else {
                        o0o0oo = o0o0oo2;
                    }
                }
                z = true;
            }
        }
        return z;
    }

    @NotNull
    public IOException OooOO0O(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void OooOO0o() {
    }
}
