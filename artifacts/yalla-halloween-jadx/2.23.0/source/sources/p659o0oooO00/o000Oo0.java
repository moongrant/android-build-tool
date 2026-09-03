package p659o0oooO00;

import androidx.compose.ui.input.key.OooO00o;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o000Oo0 implements o00O00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final InputStream f60230OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00O00O f60231OooO0o0;

    public o000Oo0(@NotNull InputStream input, @NotNull o00O00O timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f60230OooO0Oo = input;
        this.f60231OooO0o0 = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f60230OooO0Oo.close();
    }

    @Override // p659o0oooO00.o00O00
    public final long o0000OO0(@NotNull o00000O sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j == 0) {
            return 0L;
        }
        if (!(j >= 0)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        try {
            this.f60231OooO0o0.OooO0o();
            o0O0ooO o0o0oooOooooOo = sink.OooooOo(1);
            int i = this.f60230OooO0Oo.read(o0o0oooOooooOo.f60249OooO00o, o0o0oooOooooOo.f60251OooO0OO, (int) Math.min(j, 8192 - o0o0oooOooooOo.f60251OooO0OO));
            if (i != -1) {
                o0o0oooOooooOo.f60251OooO0OO += i;
                long j2 = i;
                sink.f60177OooO0o0 += j2;
                return j2;
            }
            if (o0o0oooOooooOo.f60250OooO0O0 != o0o0oooOooooOo.f60251OooO0OO) {
                return -1L;
            }
            sink.f60176OooO0Oo = o0o0oooOooooOo.OooO00o();
            o00oOoo.OooO00o(o0o0oooOooooOo);
            return -1L;
        } catch (AssertionError e) {
            if (o000O0Oo.OooO0OO(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // p659o0oooO00.o00O00
    @NotNull
    public final o00O00O timeout() {
        return this.f60231OooO0o0;
    }

    @NotNull
    public final String toString() {
        return "source(" + this.f60230OooO0Oo + ')';
    }
}
