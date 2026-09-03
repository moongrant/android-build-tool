package p674o0oooo0;

import OooO00o.OooO00o;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoO00O implements o0O00o00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OutputStream f52079Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o0oO0O0o f52080Oooo0oO;

    public o0OoO00O(@NotNull OutputStream out, @NotNull o0oO0O0o timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f52079Oooo0o = out;
        this.f52080Oooo0oO = timeout;
    }

    @Override // p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f52079Oooo0o.close();
    }

    @Override // p674o0oooo0.o0O00o00, java.io.Flushable
    public final void flush() throws IOException {
        this.f52079Oooo0o.flush();
    }

    @Override // p674o0oooo0.o0O00o00
    @NotNull
    public final o0oO0O0o timeout() {
        return this.f52080Oooo0oO;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("sink(");
        sbOooO0o0.append(this.f52079Oooo0o);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    @Override // p674o0oooo0.o0O00o00
    public final void write(@NotNull o0oOO source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        o00OOO0O.OooO0O0(source.f52099Oooo0oO, 0L, j);
        while (j > 0) {
            this.f52080Oooo0oO.OooO0o();
            o0O00OOO o0o00ooo2 = source.f52098Oooo0o;
            Intrinsics.checkNotNull(o0o00ooo2);
            int iMin = (int) Math.min(j, o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0);
            this.f52079Oooo0o.write(o0o00ooo2.f52067OooO00o, o0o00ooo2.f52068OooO0O0, iMin);
            int i = o0o00ooo2.f52068OooO0O0 + iMin;
            o0o00ooo2.f52068OooO0O0 = i;
            long j2 = iMin;
            j -= j2;
            source.f52099Oooo0oO -= j2;
            if (i == o0o00ooo2.f52069OooO0OO) {
                source.f52098Oooo0o = o0o00ooo2.OooO00o();
                o0oO0Ooo.OooO0O0(o0o00ooo2);
            }
        }
    }
}
