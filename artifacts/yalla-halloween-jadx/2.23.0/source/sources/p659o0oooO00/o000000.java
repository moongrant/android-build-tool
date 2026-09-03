package p659o0oooO00;

import androidx.compose.animation.core.AnimationKt;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class o000000 extends o00O00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final long f60168OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final long f60169OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public static o000000 f60170OooOO0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o000000 f60171OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f60172OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f60173OooO0oO;

    public static final class OooO00o {
        @Nullable
        public static o000000 OooO00o() throws InterruptedException {
            o000000 o000000Var = o000000.f60170OooOO0;
            Intrinsics.checkNotNull(o000000Var);
            o000000 o000000Var2 = o000000Var.f60171OooO0o;
            if (o000000Var2 == null) {
                long jNanoTime = System.nanoTime();
                o000000.class.wait(o000000.f60169OooO0oo);
                o000000 o000000Var3 = o000000.f60170OooOO0;
                Intrinsics.checkNotNull(o000000Var3);
                if (o000000Var3.f60171OooO0o != null || System.nanoTime() - jNanoTime < o000000.f60168OooO) {
                    return null;
                }
                return o000000.f60170OooOO0;
            }
            long jNanoTime2 = o000000Var2.f60173OooO0oO - System.nanoTime();
            if (jNanoTime2 > 0) {
                long j = jNanoTime2 / AnimationKt.MillisToNanos;
                o000000.class.wait(j, (int) (jNanoTime2 - (AnimationKt.MillisToNanos * j)));
                return null;
            }
            o000000 o000000Var4 = o000000.f60170OooOO0;
            Intrinsics.checkNotNull(o000000Var4);
            o000000Var4.f60171OooO0o = o000000Var2.f60171OooO0o;
            o000000Var2.f60171OooO0o = null;
            return o000000Var2;
        }
    }

    public static final class OooO0O0 extends Thread {
        public OooO0O0() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            o000000 o000000VarOooO00o;
            while (true) {
                try {
                    synchronized (o000000.class) {
                        o000000 o000000Var = o000000.f60170OooOO0;
                        o000000VarOooO00o = OooO00o.OooO00o();
                        if (o000000VarOooO00o == o000000.f60170OooOO0) {
                            o000000.f60170OooOO0 = null;
                            return;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    if (o000000VarOooO00o != null) {
                        o000000VarOooO00o.OooOO0o();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f60169OooO0oo = millis;
        f60168OooO = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void OooO() {
        long j = this.f60240OooO0OO;
        boolean z = this.f60238OooO00o;
        if (j != 0 || z) {
            synchronized (o000000.class) {
                if (!(!this.f60172OooO0o0)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.f60172OooO0o0 = true;
                if (f60170OooOO0 == null) {
                    f60170OooOO0 = new o000000();
                    new OooO0O0().start();
                }
                long jNanoTime = System.nanoTime();
                if (j != 0 && z) {
                    this.f60173OooO0oO = Math.min(j, OooO0OO() - jNanoTime) + jNanoTime;
                } else if (j != 0) {
                    this.f60173OooO0oO = j + jNanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.f60173OooO0oO = OooO0OO();
                }
                long j2 = this.f60173OooO0oO - jNanoTime;
                o000000 o000000Var = f60170OooOO0;
                Intrinsics.checkNotNull(o000000Var);
                while (true) {
                    o000000 o000000Var2 = o000000Var.f60171OooO0o;
                    if (o000000Var2 == null) {
                        break;
                    }
                    Intrinsics.checkNotNull(o000000Var2);
                    if (j2 < o000000Var2.f60173OooO0oO - jNanoTime) {
                        break;
                    }
                    o000000Var = o000000Var.f60171OooO0o;
                    Intrinsics.checkNotNull(o000000Var);
                }
                this.f60171OooO0o = o000000Var.f60171OooO0o;
                o000000Var.f60171OooO0o = this;
                if (o000000Var == f60170OooOO0) {
                    o000000.class.notify();
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final boolean OooOO0() {
        synchronized (o000000.class) {
            if (!this.f60172OooO0o0) {
                return false;
            }
            this.f60172OooO0o0 = false;
            o000000 o000000Var = f60170OooOO0;
            while (o000000Var != null) {
                o000000 o000000Var2 = o000000Var.f60171OooO0o;
                if (o000000Var2 == this) {
                    o000000Var.f60171OooO0o = this.f60171OooO0o;
                    this.f60171OooO0o = null;
                    return false;
                }
                o000000Var = o000000Var2;
            }
            return true;
        }
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
