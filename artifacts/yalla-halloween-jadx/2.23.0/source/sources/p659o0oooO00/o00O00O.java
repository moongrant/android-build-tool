package p659o0oooO00;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class o00O00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final OooO00o f60237OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f60238OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f60239OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f60240OooO0OO;

    public static final class OooO00o extends o00O00O {
        @Override // p659o0oooO00.o00O00O
        @NotNull
        public final o00O00O OooO0Oo(long j) {
            return this;
        }

        @Override // p659o0oooO00.o00O00O
        public final void OooO0o() {
        }

        @Override // p659o0oooO00.o00O00O
        @NotNull
        public final o00O00O OooO0oO(long j, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }
    }

    @NotNull
    public o00O00O OooO00o() {
        this.f60238OooO00o = false;
        return this;
    }

    @NotNull
    public o00O00O OooO0O0() {
        this.f60240OooO0OO = 0L;
        return this;
    }

    public long OooO0OO() {
        if (this.f60238OooO00o) {
            return this.f60239OooO0O0;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    @NotNull
    public o00O00O OooO0Oo(long j) {
        this.f60238OooO00o = true;
        this.f60239OooO0O0 = j;
        return this;
    }

    public void OooO0o() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f60238OooO00o && this.f60239OooO0O0 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public boolean OooO0o0() {
        return this.f60238OooO00o;
    }

    @NotNull
    public o00O00O OooO0oO(long j, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("timeout < 0: ", j).toString());
        }
        this.f60240OooO0OO = unit.toNanos(j);
        return this;
    }

    public long OooO0oo() {
        return this.f60240OooO0OO;
    }
}
