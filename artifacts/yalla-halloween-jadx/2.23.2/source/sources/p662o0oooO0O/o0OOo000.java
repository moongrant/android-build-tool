package p662o0oooO0O;

import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OOo000 implements o0O0o00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final ooo0Oo0 f59795OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    public boolean f59796OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public final oo0OOoo f59797OooO0o0;

    public o0OOo000(@NotNull ooo0Oo0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f59795OooO0Oo = sink;
        this.f59797OooO0o0 = new oo0OOoo();
    }

    @Override // p662o0oooO0O.o0O0o00O
    @NotNull
    public final oo0OOoo OooO0O0() {
        return this.f59797OooO0o0;
    }

    @Override // p662o0oooO0O.o0O0o00O
    @NotNull
    public final oo0OOoo OooO0Oo() {
        return this.f59797OooO0o0;
    }

    @Override // p662o0oooO0O.o0O0o00O
    @NotNull
    public final o0O0o00O OooOOO0() throws IOException {
        if (!(!this.f59796OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        oo0OOoo oo0oooo = this.f59797OooO0o0;
        long j = oo0oooo.f59828OooO0o0;
        if (j > 0) {
            this.f59795OooO0Oo.write(oo0oooo, j);
        }
        return this;
    }

    @Override // p662o0oooO0O.o0O0o00O
    @NotNull
    public final o0O0o00O OooOOOO(int i) throws IOException {
        if (!(!this.f59796OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f59797OooO0o0.oo0o0Oo(i);
        OooOoO();
        return this;
    }

    @Override // p662o0oooO0O.o0O0o00O
    @NotNull
    public final o0O0o00O OooOOo0(long j) throws IOException {
        if (!(!this.f59796OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        oo0OOoo oo0oooo = this.f59797OooO0o0;
        oo0oooo.getClass();
        oo0oooo.o0O0O00(oO000.OooO0Oo(j));
        OooOoO();
        return this;
    }

    @Override // p662o0oooO0O.o0O0o00O
    @NotNull
    public final o0O0o00O OooOoO() throws IOException {
        if (!(!this.f59796OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        oo0OOoo oo0oooo = this.f59797OooO0o0;
        long jOooOo00 = oo0oooo.OooOo00();
        if (jOooOo00 > 0) {
            this.f59795OooO0Oo.write(oo0oooo, jOooOo00);
        }
        return this;
    }

    @Override // p662o0oooO0O.o0O0o00O
    @NotNull
    public final o0O0o00O Oooo000(@NotNull String string) throws IOException {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(!this.f59796OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f59797OooO0o0.o00000OO(string);
        OooOoO();
        return this;
    }

    @Override // p662o0oooO0O.o0O0o00O
    @NotNull
    public final o0O0o00O Ooooo00(long j) {
        if (!(!this.f59796OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f59797OooO0o0.Ooooo00(j);
        return OooOoO();
    }

    @Override // p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        ooo0Oo0 ooo0oo0 = this.f59795OooO0Oo;
        if (this.f59796OooO0o) {
            return;
        }
        oo0OOoo oo0oooo = this.f59797OooO0o0;
        long j = oo0oooo.f59828OooO0o0;
        if (j > 0) {
            ooo0oo0.write(oo0oooo, j);
        }
        th = null;
        try {
            ooo0oo0.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f59796OooO0o = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p662o0oooO0O.o0O0o00O, p662o0oooO0O.ooo0Oo0, java.io.Flushable
    public final void flush() throws IOException {
        if (!(!this.f59796OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        oo0OOoo oo0oooo = this.f59797OooO0o0;
        long j = oo0oooo.f59828OooO0o0;
        ooo0Oo0 ooo0oo0 = this.f59795OooO0Oo;
        if (j > 0) {
            ooo0oo0.write(oo0oooo, j);
        }
        ooo0oo0.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f59796OooO0o;
    }

    @Override // p662o0oooO0O.o0O0o00O
    @NotNull
    public final o0O0o00O o00000O(long j) throws IOException {
        if (!(!this.f59796OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f59797OooO0o0.o0ooOoO(j);
        OooOoO();
        return this;
    }

    @Override // p662o0oooO0O.o0O0o00O
    @NotNull
    public final o0O0o00O o0000oo(@NotNull ByteString byteString) throws IOException {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!(!this.f59796OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f59797OooO0o0.o00O0O(byteString);
        OooOoO();
        return this;
    }

    @Override // p662o0oooO0O.o0O0o00O
    @NotNull
    public final o0O0o00O o000OO(int i, int i2, @NotNull byte[] source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.f59796OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f59797OooO0o0.OoooooO(i, i2, source);
        OooOoO();
        return this;
    }

    @Override // p662o0oooO0O.o0O0o00O
    public final long o00Oo0(@NotNull oO00000 source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long jOooOO0O = source.OooOO0O(this.f59797OooO0o0, 8192L);
            if (jOooOO0O == -1) {
                return j;
            }
            j += jOooOO0O;
            OooOoO();
        }
    }

    @Override // p662o0oooO0O.o0O0o00O
    @NotNull
    public final o0O0o00O o0OoOo0(int i) throws IOException {
        if (!(!this.f59796OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f59797OooO0o0.o000OOo(i);
        OooOoO();
        return this;
    }

    @Override // p662o0oooO0O.o0O0o00O
    @NotNull
    public final o0O0o00O o0ooOO0(int i) throws IOException {
        if (!(!this.f59796OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f59797OooO0o0.o00o0O(i);
        OooOoO();
        return this;
    }

    @Override // p662o0oooO0O.o0O0o00O
    @NotNull
    public final o0O0o00O oo000o(int i) throws IOException {
        if (!(!this.f59796OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        oo0OOoo oo0oooo = this.f59797OooO0o0;
        oo0oooo.getClass();
        oo0OOoo.OooO00o oooO00o = oO000.f59809OooO00o;
        oo0oooo.oo0o0Oo(((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
        OooOoO();
        return this;
    }

    @Override // p662o0oooO0O.ooo0Oo0
    @NotNull
    public final oO00000o timeout() {
        return this.f59795OooO0Oo.timeout();
    }

    @NotNull
    public final String toString() {
        return "buffer(" + this.f59795OooO0Oo + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(@NotNull ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.f59796OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f59797OooO0o0.write(source);
        OooOoO();
        return iWrite;
    }

    @Override // p662o0oooO0O.ooo0Oo0
    public final void write(@NotNull oo0OOoo source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f59796OooO0o) {
            this.f59797OooO0o0.write(source, j);
            OooOoO();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p662o0oooO0O.o0O0o00O
    @NotNull
    public final o0O0o00O write(@NotNull byte[] source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f59796OooO0o) {
            this.f59797OooO0o0.o00Ooo(source);
            OooOoO();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
