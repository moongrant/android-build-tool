package p662o0oooO0O;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class oO00000o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final OooO00o f59811OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f59812OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f59813OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f59814OooO0OO;

    public static final class OooO00o extends oO00000o {
        @Override // p662o0oooO0O.oO00000o
        @NotNull
        public final oO00000o OooO0Oo(long j) {
            return this;
        }

        @Override // p662o0oooO0O.oO00000o
        public final void OooO0o() {
        }

        @Override // p662o0oooO0O.oO00000o
        @NotNull
        public final oO00000o OooO0oO(long j, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }
    }

    @NotNull
    public oO00000o OooO00o() {
        this.f59812OooO00o = false;
        return this;
    }

    @NotNull
    public oO00000o OooO0O0() {
        this.f59814OooO0OO = 0L;
        return this;
    }

    public long OooO0OO() {
        if (this.f59812OooO00o) {
            return this.f59813OooO0O0;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    @NotNull
    public oO00000o OooO0Oo(long j) {
        this.f59812OooO00o = true;
        this.f59813OooO0O0 = j;
        return this;
    }

    public void OooO0o() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f59812OooO00o && this.f59813OooO0O0 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public boolean OooO0o0() {
        return this.f59812OooO00o;
    }

    @NotNull
    public oO00000o OooO0oO(long j, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("timeout < 0: ", j).toString());
        }
        this.f59814OooO0OO = unit.toNanos(j);
        return this;
    }

    public long OooO0oo() {
        return this.f59814OooO0OO;
    }
}
