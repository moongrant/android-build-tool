package p662o0oooO0O;

import androidx.compose.animation.core.AnimationKt;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class o0O0O0o0 extends oO00000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final long f59751OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final long f59752OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public static o0O0O0o0 f59753OooOO0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o0O0O0o0 f59754OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f59755OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f59756OooO0oO;

    public static final class OooO00o {
        @Nullable
        public static o0O0O0o0 OooO00o() throws InterruptedException {
            o0O0O0o0 o0o0o0o0 = o0O0O0o0.f59753OooOO0;
            Intrinsics.checkNotNull(o0o0o0o0);
            o0O0O0o0 o0o0o0o1 = o0o0o0o0.f59754OooO0o;
            if (o0o0o0o1 == null) {
                long jNanoTime = System.nanoTime();
                o0O0O0o0.class.wait(o0O0O0o0.f59752OooO0oo);
                o0O0O0o0 o0o0o0o2 = o0O0O0o0.f59753OooOO0;
                Intrinsics.checkNotNull(o0o0o0o2);
                if (o0o0o0o2.f59754OooO0o != null || System.nanoTime() - jNanoTime < o0O0O0o0.f59751OooO) {
                    return null;
                }
                return o0O0O0o0.f59753OooOO0;
            }
            long jNanoTime2 = o0o0o0o1.f59756OooO0oO - System.nanoTime();
            if (jNanoTime2 > 0) {
                long j = jNanoTime2 / AnimationKt.MillisToNanos;
                o0O0O0o0.class.wait(j, (int) (jNanoTime2 - (AnimationKt.MillisToNanos * j)));
                return null;
            }
            o0O0O0o0 o0o0o0o3 = o0O0O0o0.f59753OooOO0;
            Intrinsics.checkNotNull(o0o0o0o3);
            o0o0o0o3.f59754OooO0o = o0o0o0o1.f59754OooO0o;
            o0o0o0o1.f59754OooO0o = null;
            return o0o0o0o1;
        }
    }

    public static final class OooO0O0 extends Thread {
        public OooO0O0() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            o0O0O0o0 o0o0o0o0OooO00o;
            while (true) {
                try {
                    synchronized (o0O0O0o0.class) {
                        o0O0O0o0 o0o0o0o0 = o0O0O0o0.f59753OooOO0;
                        o0o0o0o0OooO00o = OooO00o.OooO00o();
                        if (o0o0o0o0OooO00o == o0O0O0o0.f59753OooOO0) {
                            o0O0O0o0.f59753OooOO0 = null;
                            return;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    if (o0o0o0o0OooO00o != null) {
                        o0o0o0o0OooO00o.OooOO0o();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f59752OooO0oo = millis;
        f59751OooO = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void OooO() {
        long j = this.f59814OooO0OO;
        boolean z = this.f59812OooO00o;
        if (j != 0 || z) {
            synchronized (o0O0O0o0.class) {
                if (!(!this.f59755OooO0o0)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.f59755OooO0o0 = true;
                if (f59753OooOO0 == null) {
                    f59753OooOO0 = new o0O0O0o0();
                    new OooO0O0().start();
                }
                long jNanoTime = System.nanoTime();
                if (j != 0 && z) {
                    this.f59756OooO0oO = Math.min(j, OooO0OO() - jNanoTime) + jNanoTime;
                } else if (j != 0) {
                    this.f59756OooO0oO = j + jNanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.f59756OooO0oO = OooO0OO();
                }
                long j2 = this.f59756OooO0oO - jNanoTime;
                o0O0O0o0 o0o0o0o0 = f59753OooOO0;
                Intrinsics.checkNotNull(o0o0o0o0);
                while (true) {
                    o0O0O0o0 o0o0o0o1 = o0o0o0o0.f59754OooO0o;
                    if (o0o0o0o1 == null) {
                        break;
                    }
                    Intrinsics.checkNotNull(o0o0o0o1);
                    if (j2 < o0o0o0o1.f59756OooO0oO - jNanoTime) {
                        break;
                    }
                    o0o0o0o0 = o0o0o0o0.f59754OooO0o;
                    Intrinsics.checkNotNull(o0o0o0o0);
                }
                this.f59754OooO0o = o0o0o0o0.f59754OooO0o;
                o0o0o0o0.f59754OooO0o = this;
                if (o0o0o0o0 == f59753OooOO0) {
                    o0O0O0o0.class.notify();
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final boolean OooOO0() {
        synchronized (o0O0O0o0.class) {
            if (!this.f59755OooO0o0) {
                return false;
            }
            this.f59755OooO0o0 = false;
            o0O0O0o0 o0o0o0o0 = f59753OooOO0;
            while (o0o0o0o0 != null) {
                o0O0O0o0 o0o0o0o1 = o0o0o0o0.f59754OooO0o;
                if (o0o0o0o1 == this) {
                    o0o0o0o0.f59754OooO0o = this.f59754OooO0o;
                    this.f59754OooO0o = null;
                    return false;
                }
                o0o0o0o0 = o0o0o0o1;
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
