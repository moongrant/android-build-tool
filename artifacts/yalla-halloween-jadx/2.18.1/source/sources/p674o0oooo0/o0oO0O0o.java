package p674o0oooo0;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class o0oO0O0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final OooO00o f52090OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f52091OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f52092OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f52093OooO0OO;

    public static final class OooO00o extends o0oO0O0o {
        @Override // p674o0oooo0.o0oO0O0o
        @NotNull
        public final o0oO0O0o OooO0Oo(long j) {
            return this;
        }

        @Override // p674o0oooo0.o0oO0O0o
        public final void OooO0o() {
        }

        @Override // p674o0oooo0.o0oO0O0o
        @NotNull
        public final o0oO0O0o OooO0oO(long j, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }
    }

    @NotNull
    public o0oO0O0o OooO00o() {
        this.f52091OooO00o = false;
        return this;
    }

    @NotNull
    public o0oO0O0o OooO0O0() {
        this.f52093OooO0OO = 0L;
        return this;
    }

    public long OooO0OO() {
        if (this.f52091OooO00o) {
            return this.f52092OooO0O0;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    @NotNull
    public o0oO0O0o OooO0Oo(long j) {
        this.f52091OooO00o = true;
        this.f52092OooO0O0 = j;
        return this;
    }

    public void OooO0o() throws IOException {
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        if (threadCurrentThread.isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f52091OooO00o && this.f52092OooO0O0 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public boolean OooO0o0() {
        return this.f52091OooO00o;
    }

    @NotNull
    public o0oO0O0o OooO0oO(long j, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("timeout < 0: ", j).toString());
        }
        this.f52093OooO0OO = unit.toNanos(j);
        return this;
    }

    public long OooO0oo() {
        return this.f52093OooO0OO;
    }
}
