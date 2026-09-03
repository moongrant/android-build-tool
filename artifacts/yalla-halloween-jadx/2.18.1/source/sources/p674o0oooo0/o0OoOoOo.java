package p674o0oooo0;

import androidx.viewpager2.adapter.OooO00o;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOoOo implements o0O0O0O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final InputStream f52081Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o0oO0O0o f52082Oooo0oO;

    public o0OoOoOo(@NotNull InputStream input, @NotNull o0oO0O0o timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f52081Oooo0o = input;
        this.f52082Oooo0oO = timeout;
    }

    @Override // p674o0oooo0.o0O0O0O
    public final long Oooo0O0(@NotNull o0oOO sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j == 0) {
            return 0L;
        }
        if (!(j >= 0)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        try {
            this.f52082Oooo0oO.OooO0o();
            o0O00OOO o0o00oooO000oOoO = sink.o000oOoO(1);
            int i = this.f52081Oooo0o.read(o0o00oooO000oOoO.f52067OooO00o, o0o00oooO000oOoO.f52069OooO0OO, (int) Math.min(j, 8192 - o0o00oooO000oOoO.f52069OooO0OO));
            if (i != -1) {
                o0o00oooO000oOoO.f52069OooO0OO += i;
                long j2 = i;
                sink.f52099Oooo0oO += j2;
                return j2;
            }
            if (o0o00oooO000oOoO.f52068OooO0O0 != o0o00oooO000oOoO.f52069OooO0OO) {
                return -1L;
            }
            sink.f52098Oooo0o = o0o00oooO000oOoO.OooO00o();
            o0oO0Ooo.OooO0O0(o0o00oooO000oOoO);
            return -1L;
        } catch (AssertionError e) {
            if (o0O000Oo.OooO0Oo(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f52081Oooo0o.close();
    }

    @Override // p674o0oooo0.o0O0O0O
    @NotNull
    public final o0oO0O0o timeout() {
        return this.f52082Oooo0oO;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("source(");
        sbOooO0o0.append(this.f52081Oooo0o);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
