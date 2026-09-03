package p659o0oooO00;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O implements o00O000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OutputStream f60205OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00O00O f60206OooO0o0;

    public o000O(@NotNull OutputStream out, @NotNull o00O00O timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f60205OooO0Oo = out;
        this.f60206OooO0o0 = timeout;
    }

    @Override // p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f60205OooO0Oo.close();
    }

    @Override // p659o0oooO00.o00O000, java.io.Flushable
    public final void flush() throws IOException {
        this.f60205OooO0Oo.flush();
    }

    @Override // p659o0oooO00.o00O000
    @NotNull
    public final o00O00O timeout() {
        return this.f60206OooO0o0;
    }

    @NotNull
    public final String toString() {
        return "sink(" + this.f60205OooO0Oo + ')';
    }

    @Override // p659o0oooO00.o00O000
    public final void write(@NotNull o00000O source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        oo00o.OooO0O0(source.f60177OooO0o0, 0L, j);
        while (j > 0) {
            this.f60206OooO0o0.OooO0o();
            o0O0ooO o0o0ooo = source.f60176OooO0Oo;
            Intrinsics.checkNotNull(o0o0ooo);
            int iMin = (int) Math.min(j, o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0);
            this.f60205OooO0Oo.write(o0o0ooo.f60249OooO00o, o0o0ooo.f60250OooO0O0, iMin);
            int i = o0o0ooo.f60250OooO0O0 + iMin;
            o0o0ooo.f60250OooO0O0 = i;
            long j2 = iMin;
            j -= j2;
            source.f60177OooO0o0 -= j2;
            if (i == o0o0ooo.f60251OooO0OO) {
                source.f60176OooO0Oo = o0o0ooo.OooO00o();
                o00oOoo.OooO00o(o0o0ooo);
            }
        }
    }
}
