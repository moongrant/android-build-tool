package p659o0oooO00;

import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o00 implements o0000Ooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final o00O000 f60162OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    public boolean f60163OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public final o00000O f60164OooO0o0;

    public o00(@NotNull o00O000 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f60162OooO0Oo = sink;
        this.f60164OooO0o0 = new o00000O();
    }

    @Override // p659o0oooO00.o0000Ooo
    @NotNull
    public final o00000O OooO0O0() {
        return this.f60164OooO0o0;
    }

    @Override // p659o0oooO00.o0000Ooo
    @NotNull
    public final o00000O OooO0Oo() {
        return this.f60164OooO0o0;
    }

    @Override // p659o0oooO00.o0000Ooo
    @NotNull
    public final o0000Ooo OooOO0o() throws IOException {
        if (!(!this.f60163OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        o00000O o00000o = this.f60164OooO0o0;
        long j = o00000o.f60177OooO0o0;
        if (j > 0) {
            this.f60162OooO0Oo.write(o00000o, j);
        }
        return this;
    }

    @Override // p659o0oooO00.o0000Ooo
    @NotNull
    public final o0000Ooo OooOOO(int i) throws IOException {
        if (!(!this.f60163OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f60164OooO0o0.o0ooOOo(i);
        OooOoO();
        return this;
    }

    @Override // p659o0oooO00.o0000Ooo
    @NotNull
    public final o0000Ooo OooOOOo(long j) throws IOException {
        if (!(!this.f60163OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        o00000O o00000o = this.f60164OooO0o0;
        o00000o.getClass();
        o00000o.o0OOO0o(oo00o.OooO0Oo(j));
        OooOoO();
        return this;
    }

    @Override // p659o0oooO00.o0000Ooo
    @NotNull
    public final o0000Ooo OooOoO() throws IOException {
        if (!(!this.f60163OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        o00000O o00000o = this.f60164OooO0o0;
        long jOooOo00 = o00000o.OooOo00();
        if (jOooOo00 > 0) {
            this.f60162OooO0Oo.write(o00000o, jOooOo00);
        }
        return this;
    }

    @Override // p659o0oooO00.o0000Ooo
    @NotNull
    public final o0000Ooo OooOooo(@NotNull String string) throws IOException {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(!this.f60163OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f60164OooO0o0.o00000O(string);
        OooOoO();
        return this;
    }

    @Override // p659o0oooO00.o0000Ooo
    public final long Oooo000(@NotNull o00O00 source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long jO0000OO0 = source.o0000OO0(this.f60164OooO0o0, 8192L);
            if (jO0000OO0 == -1) {
                return j;
            }
            j += jO0000OO0;
            OooOoO();
        }
    }

    @Override // p659o0oooO00.o0000Ooo
    @NotNull
    public final o0000Ooo Ooooo00(long j) {
        if (!(!this.f60163OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f60164OooO0o0.Ooooo00(j);
        return OooOoO();
    }

    @Override // p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        o00O000 o00o001 = this.f60162OooO0Oo;
        if (this.f60163OooO0o) {
            return;
        }
        o00000O o00000o = this.f60164OooO0o0;
        long j = o00000o.f60177OooO0o0;
        if (j > 0) {
            o00o001.write(o00000o, j);
        }
        th = null;
        try {
            o00o001.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f60163OooO0o = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p659o0oooO00.o0000Ooo, p659o0oooO00.o00O000, java.io.Flushable
    public final void flush() throws IOException {
        if (!(!this.f60163OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        o00000O o00000o = this.f60164OooO0o0;
        long j = o00000o.f60177OooO0o0;
        o00O000 o00o001 = this.f60162OooO0Oo;
        if (j > 0) {
            o00o001.write(o00000o, j);
        }
        o00o001.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f60163OooO0o;
    }

    @Override // p659o0oooO00.o0000Ooo
    @NotNull
    public final o0000Ooo o00000O0(long j) throws IOException {
        if (!(!this.f60163OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f60164OooO0o0.o00ooo(j);
        OooOoO();
        return this;
    }

    @Override // p659o0oooO00.o0000Ooo
    @NotNull
    public final o0000Ooo o0000O00(@NotNull ByteString byteString) throws IOException {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!(!this.f60163OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f60164OooO0o0.OoooooO(byteString);
        OooOoO();
        return this;
    }

    @Override // p659o0oooO00.o0000Ooo
    @NotNull
    public final o0000Ooo o000OO(int i, int i2, @NotNull byte[] source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.f60163OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f60164OooO0o0.Oooooo(i, i2, source);
        OooOoO();
        return this;
    }

    @Override // p659o0oooO00.o0000Ooo
    @NotNull
    public final o0000Ooo o00o0O(int i) throws IOException {
        if (!(!this.f60163OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        o00000O o00000o = this.f60164OooO0o0;
        o00000o.getClass();
        o00000O.OooO00o oooO00o = oo00o.f60256OooO00o;
        o00000o.o0ooOOo(((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
        OooOoO();
        return this;
    }

    @Override // p659o0oooO00.o0000Ooo
    @NotNull
    public final o0000Ooo o00oO0o(int i) throws IOException {
        if (!(!this.f60163OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f60164OooO0o0.o00O0O(i);
        OooOoO();
        return this;
    }

    @Override // p659o0oooO00.o0000Ooo
    @NotNull
    public final o0000Ooo o0OoOo0(int i) throws IOException {
        if (!(!this.f60163OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f60164OooO0o0.oo0o0Oo(i);
        OooOoO();
        return this;
    }

    @Override // p659o0oooO00.o00O000
    @NotNull
    public final o00O00O timeout() {
        return this.f60162OooO0Oo.timeout();
    }

    @NotNull
    public final String toString() {
        return "buffer(" + this.f60162OooO0Oo + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(@NotNull ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.f60163OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f60164OooO0o0.write(source);
        OooOoO();
        return iWrite;
    }

    @Override // p659o0oooO00.o00O000
    public final void write(@NotNull o00000O source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f60163OooO0o) {
            this.f60164OooO0o0.write(source, j);
            OooOoO();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p659o0oooO00.o0000Ooo
    @NotNull
    public final o0000Ooo write(@NotNull byte[] source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f60163OooO0o) {
            this.f60164OooO0o0.ooOO(source);
            OooOoO();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
