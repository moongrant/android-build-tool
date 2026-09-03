package p674o0oooo0;

import OooO00o.OooO00o;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00O implements oo00oO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public final o0oOO f52054Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @JvmField
    public boolean f52055Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final o0O00o00 f52056Oooo0oo;

    public o0O00O(@NotNull o0O00o00 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f52056Oooo0oo = sink;
        this.f52054Oooo0o = new o0oOO();
    }

    @Override // p674o0oooo0.oo00oO
    @NotNull
    public final o0oOO OooO0OO() {
        return this.f52054Oooo0o;
    }

    @Override // p674o0oooo0.oo00oO
    @NotNull
    public final o0oOO OooO0o0() {
        return this.f52054Oooo0o;
    }

    @Override // p674o0oooo0.oo00oO
    @NotNull
    public final oo00oO OooOO0(@NotNull byte[] source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.f52055Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f52054Oooo0o.OoooOOo(source);
        Oooo0oo();
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    @NotNull
    public final oo00oO OooOo0(int i) throws IOException {
        if (!(!this.f52055Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f52054Oooo0o.o00Oo0(i);
        Oooo0oo();
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    @NotNull
    public final oo00oO OooOo00() {
        if (!(!this.f52055Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        o0oOO o0ooo2 = this.f52054Oooo0o;
        long j = o0ooo2.f52099Oooo0oO;
        if (j > 0) {
            this.f52056Oooo0oo.write(o0ooo2, j);
        }
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    @NotNull
    public final oo00oO OooOo0o(int i) throws IOException {
        if (!(!this.f52055Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f52054Oooo0o.o0OoOo0(i);
        Oooo0oo();
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    @NotNull
    public final oo00oO OooOoO0(long j) throws IOException {
        if (!(!this.f52055Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f52054Oooo0o.ooOO(o00OOO0O.OooO0Oo(j));
        Oooo0oo();
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    @NotNull
    public final oo00oO OooOooO(int i) throws IOException {
        if (!(!this.f52055Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f52054Oooo0o.o0OoOo0(o00OOO0O.OooO0OO(i));
        Oooo0oo();
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    @NotNull
    public final oo00oO Oooo000(int i) {
        if (!(!this.f52055Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f52054Oooo0o.Ooooo0o(i);
        Oooo0oo();
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    @NotNull
    public final oo00oO Oooo0oo() throws IOException {
        if (!(!this.f52055Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        long jOooOOO = this.f52054Oooo0o.OooOOO();
        if (jOooOOO > 0) {
            this.f52056Oooo0oo.write(this.f52054Oooo0o, jOooOOO);
        }
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    @NotNull
    public final oo00oO OoooOoo(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(!this.f52055Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f52054Oooo0o.o00oO0o(string);
        Oooo0oo();
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    @NotNull
    public final oo00oO Oooooo0(@NotNull byte[] source, int i, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.f52055Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f52054Oooo0o.OoooOoO(source, i, i2);
        Oooo0oo();
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    @NotNull
    public final oo00oO Ooooooo(long j) throws IOException {
        if (!(!this.f52055Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f52054Oooo0o.Ooooooo(j);
        Oooo0oo();
        return this;
    }

    @Override // p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f52055Oooo0oO) {
            return;
        }
        Throwable th = null;
        try {
            o0oOO o0ooo2 = this.f52054Oooo0o;
            long j = o0ooo2.f52099Oooo0oO;
            if (j > 0) {
                this.f52056Oooo0oo.write(o0ooo2, j);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f52056Oooo0oo.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f52055Oooo0oO = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p674o0oooo0.oo00oO, p674o0oooo0.o0O00o00, java.io.Flushable
    public final void flush() {
        if (!(!this.f52055Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        o0oOO o0ooo2 = this.f52054Oooo0o;
        long j = o0ooo2.f52099Oooo0oO;
        if (j > 0) {
            this.f52056Oooo0oo.write(o0ooo2, j);
        }
        this.f52056Oooo0oo.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f52055Oooo0oO;
    }

    @Override // p674o0oooo0.oo00oO
    @NotNull
    public final oo00oO o000000(@NotNull ByteString byteString) throws IOException {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!(!this.f52055Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f52054Oooo0o.OoooOOO(byteString);
        Oooo0oo();
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    @NotNull
    public final oo00oO o0000O0(long j) {
        if (!(!this.f52055Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f52054Oooo0o.o0000O0(j);
        Oooo0oo();
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    public final long o0ooOOo(@NotNull o0O0O0O source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long jOooo0O0 = source.Oooo0O0(this.f52054Oooo0o, 8192);
            if (jOooo0O0 == -1) {
                return j;
            }
            j += jOooo0O0;
            Oooo0oo();
        }
    }

    @Override // p674o0oooo0.o0O00o00
    @NotNull
    public final o0oO0O0o timeout() {
        return this.f52056Oooo0oo.timeout();
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("buffer(");
        sbOooO0o0.append(this.f52056Oooo0oo);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(@NotNull ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.f52055Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f52054Oooo0o.write(source);
        Oooo0oo();
        return iWrite;
    }

    @Override // p674o0oooo0.o0O00o00
    public final void write(@NotNull o0oOO source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f52055Oooo0oO) {
            this.f52054Oooo0o.write(source, j);
            Oooo0oo();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}
