package p662o0oooO0O;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.UByte;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.CharsKt;
import kotlin.text.Typography;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p659o0oooO.o00;

/* JADX INFO: loaded from: classes5.dex */
public final class o0o0000 implements o0O0o0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final oO00000 f59799OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    public boolean f59800OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public final oo0OOoo f59801OooO0o0;

    public o0o0000(@NotNull oO00000 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f59799OooO0Oo = source;
        this.f59801OooO0o0 = new oo0OOoo();
    }

    public final long OooO00o(byte b, long j, long j2) {
        if (!(!this.f59800OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        if (!(0 <= j2)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("fromIndex=0 toIndex=", j2).toString());
        }
        while (jMax < j2) {
            long jOooo00o = this.f59801OooO0o0.Oooo00o(b, jMax, j2);
            if (jOooo00o != -1) {
                return jOooo00o;
            }
            oo0OOoo oo0oooo = this.f59801OooO0o0;
            long j3 = oo0oooo.f59828OooO0o0;
            if (j3 >= j2 || this.f59799OooO0Oo.OooOO0O(oo0oooo, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j3);
        }
        return -1L;
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final oo0OOoo OooO0O0() {
        return this.f59801OooO0o0;
    }

    public final long OooO0OO() throws EOFException {
        oo0OOoo oo0oooo;
        OoooOoO(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            boolean zRequest = request(j2);
            oo0oooo = this.f59801OooO0o0;
            if (!zRequest) {
                break;
            }
            byte bOooOo = oo0oooo.OooOo(j);
            if ((bOooOo < ((byte) 48) || bOooOo > ((byte) 57)) && !(j == 0 && bOooOo == ((byte) 45))) {
                if (j != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bOooOo, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            j = j2;
        }
        return oo0oooo.Oooo0oO();
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final oo0OOoo OooO0Oo() {
        return this.f59801OooO0o0;
    }

    public final short OooO0oO() throws EOFException {
        OoooOoO(2L);
        return this.f59801OooO0o0.OoooO00();
    }

    @Override // p662o0oooO0O.oO00000
    public final long OooOO0O(@NotNull oo0OOoo sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        if (!(!this.f59800OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        oo0OOoo oo0oooo = this.f59801OooO0o0;
        if (oo0oooo.f59828OooO0o0 == 0 && this.f59799OooO0Oo.OooOO0O(oo0oooo, 8192L) == -1) {
            return -1L;
        }
        return oo0oooo.OooOO0O(sink, Math.min(j, oo0oooo.f59828OooO0o0));
    }

    @Override // p662o0oooO0O.o0O0o0
    public final long OooOoO0(@NotNull ByteString targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (!(!this.f59800OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        while (true) {
            oo0OOoo oo0oooo = this.f59801OooO0o0;
            long jOooo0 = oo0oooo.Oooo0(jMax, targetBytes);
            if (jOooo0 != -1) {
                return jOooo0;
            }
            long j = oo0oooo.f59828OooO0o0;
            if (this.f59799OooO0Oo.OooOO0O(oo0oooo, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final String OooOooO(long j) throws EOFException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("limit < 0: ", j).toString());
        }
        long j2 = j == LongCompanionObject.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        byte b = (byte) 10;
        long jOooO00o = OooO00o(b, 0L, j2);
        oo0OOoo oo0oooo = this.f59801OooO0o0;
        if (jOooO00o != -1) {
            return o00.OooO00o(oo0oooo, jOooO00o);
        }
        if (j2 < LongCompanionObject.MAX_VALUE && request(j2) && oo0oooo.OooOo(j2 - 1) == ((byte) 13) && request(1 + j2) && oo0oooo.OooOo(j2) == b) {
            return o00.OooO00o(oo0oooo, j2);
        }
        oo0OOoo oo0oooo2 = new oo0OOoo();
        oo0oooo.OooOo0(0L, Math.min(32, oo0oooo.f59828OooO0o0), oo0oooo2);
        throw new EOFException("\\n not found: limit=" + Math.min(oo0oooo.f59828OooO0o0, j) + " content=" + oo0oooo2.Oooo0o0().OooO0o() + Typography.ellipsis);
    }

    @Override // p662o0oooO0O.o0O0o0
    public final boolean Oooo00O(long j, @NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int length = bytes.data.length;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(!this.f59800OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j >= 0 && length >= 0 && bytes.data.length - 0 >= length) {
            for (int i = 0; i < length; i++) {
                long j2 = ((long) i) + j;
                if (request(1 + j2)) {
                    if (this.f59801OooO0o0.OooOo(j2) == bytes.data[0 + i]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p662o0oooO0O.o0O0o0
    public final void Oooo0o(@NotNull oo0OOoo sink, long j) throws IOException {
        oo0OOoo oo0oooo = this.f59801OooO0o0;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            OoooOoO(j);
            oo0oooo.Oooo0o(sink, j);
        } catch (EOFException e) {
            sink.o00Oo0(oo0oooo);
            throw e;
        }
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final String OoooO0O() {
        return OooOooO(LongCompanionObject.MAX_VALUE);
    }

    @Override // p662o0oooO0O.o0O0o0
    public final void OoooOoO(long j) throws EOFException {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // p662o0oooO0O.o0O0o0
    public final int Ooooo0o(@NotNull o0OOO0 options) throws EOFException {
        oo0OOoo oo0oooo;
        Intrinsics.checkNotNullParameter(options, "options");
        if (!(!this.f59800OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            oo0oooo = this.f59801OooO0o0;
            int iOooO0O0 = o00.OooO0O0(oo0oooo, options, true);
            if (iOooO0O0 != -2) {
                if (iOooO0O0 == -1) {
                    break;
                }
                oo0oooo.skip(options.f59782OooO0Oo[iOooO0O0].OooO0o0());
                return iOooO0O0;
            }
        } while (this.f59799OooO0Oo.OooOO0O(oo0oooo, 8192L) != -1);
        return -1;
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final String OooooOO(long j) throws EOFException {
        OoooOoO(j);
        return this.f59801OooO0o0.OooooOO(j);
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final ByteString Oooooo0(long j) {
        OoooOoO(j);
        return this.f59801OooO0o0.Oooooo0(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f59800OooO0o) {
            return;
        }
        this.f59800OooO0o = true;
        this.f59799OooO0Oo.close();
        this.f59801OooO0o0.OooO0oO();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f59800OooO0o;
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final String o000000o(@NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        oO00000 oo00000 = this.f59799OooO0Oo;
        oo0OOoo oo0oooo = this.f59801OooO0o0;
        oo0oooo.o00Oo0(oo00000);
        return oo0oooo.o000000o(charset);
    }

    @Override // p662o0oooO0O.o0O0o0
    public final long o00000oo(@NotNull o0O0o00O sink) throws IOException {
        oo0OOoo oo0oooo;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = 0;
        while (true) {
            oO00000 oo00000 = this.f59799OooO0Oo;
            oo0oooo = this.f59801OooO0o0;
            if (oo00000.OooOO0O(oo0oooo, 8192L) == -1) {
                break;
            }
            long jOooOo00 = oo0oooo.OooOo00();
            if (jOooOo00 > 0) {
                j += jOooOo00;
                sink.write(oo0oooo, jOooOo00);
            }
        }
        long j2 = oo0oooo.f59828OooO0o0;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        sink.write(oo0oooo, j2);
        return j3;
    }

    @Override // p662o0oooO0O.o0O0o0
    public final long o0000Oo0() throws EOFException {
        oo0OOoo oo0oooo;
        OoooOoO(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zRequest = request(i2);
            oo0oooo = this.f59801OooO0o0;
            if (!zRequest) {
                break;
            }
            byte bOooOo = oo0oooo.OooOo(i);
            if ((bOooOo < ((byte) 48) || bOooOo > ((byte) 57)) && ((bOooOo < ((byte) 97) || bOooOo > ((byte) 102)) && (bOooOo < ((byte) 65) || bOooOo > ((byte) 70)))) {
                if (i != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bOooOo, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            i = i2;
        }
        return oo0oooo.o0000Oo0();
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final InputStream o0000OoO() {
        return new OooO00o();
    }

    @Override // p662o0oooO0O.o0O0o0
    public final int o0000Ooo() throws EOFException {
        OoooOoO(4L);
        return this.f59801OooO0o0.o0000Ooo();
    }

    @Override // p662o0oooO0O.o0O0o0
    public final long o000oOoO() throws EOFException {
        OoooOoO(8L);
        return this.f59801OooO0o0.o000oOoO();
    }

    @Override // p662o0oooO0O.o0O0o0
    public final boolean o00oO0O() {
        if (!(!this.f59800OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        oo0OOoo oo0oooo = this.f59801OooO0o0;
        return oo0oooo.o00oO0O() && this.f59799OooO0Oo.OooOO0O(oo0oooo, 8192L) == -1;
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final byte[] o00ooo() throws IOException {
        oO00000 oo00000 = this.f59799OooO0Oo;
        oo0OOoo oo0oooo = this.f59801OooO0o0;
        oo0oooo.o00Oo0(oo00000);
        return oo0oooo.o00ooo();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(@NotNull ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        oo0OOoo oo0oooo = this.f59801OooO0o0;
        if (oo0oooo.f59828OooO0o0 == 0 && this.f59799OooO0Oo.OooOO0O(oo0oooo, 8192L) == -1) {
            return -1;
        }
        return oo0oooo.read(sink);
    }

    @Override // p662o0oooO0O.o0O0o0
    public final byte readByte() throws EOFException {
        OoooOoO(1L);
        return this.f59801OooO0o0.readByte();
    }

    @Override // p662o0oooO0O.o0O0o0
    public final void readFully(@NotNull byte[] sink) throws EOFException {
        oo0OOoo oo0oooo = this.f59801OooO0o0;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            OoooOoO(sink.length);
            oo0oooo.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = oo0oooo.f59828OooO0o0;
                if (j <= 0) {
                    throw e;
                }
                int i2 = oo0oooo.read(sink, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // p662o0oooO0O.o0O0o0
    public final int readInt() {
        OoooOoO(4L);
        return this.f59801OooO0o0.readInt();
    }

    @Override // p662o0oooO0O.o0O0o0
    public final long readLong() throws EOFException {
        OoooOoO(8L);
        return this.f59801OooO0o0.readLong();
    }

    @Override // p662o0oooO0O.o0O0o0
    public final short readShort() throws EOFException {
        OoooOoO(2L);
        return this.f59801OooO0o0.readShort();
    }

    @Override // p662o0oooO0O.o0O0o0
    public final boolean request(long j) {
        oo0OOoo oo0oooo;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        if (!(!this.f59800OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            oo0oooo = this.f59801OooO0o0;
            if (oo0oooo.f59828OooO0o0 >= j) {
                return true;
            }
        } while (this.f59799OooO0Oo.OooOO0O(oo0oooo, 8192L) != -1);
        return false;
    }

    @Override // p662o0oooO0O.o0O0o0
    public final void skip(long j) throws EOFException {
        if (!(!this.f59800OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            oo0OOoo oo0oooo = this.f59801OooO0o0;
            if (oo0oooo.f59828OooO0o0 == 0 && this.f59799OooO0Oo.OooOO0O(oo0oooo, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, oo0oooo.f59828OooO0o0);
            oo0oooo.skip(jMin);
            j -= jMin;
        }
    }

    @Override // p662o0oooO0O.oO00000
    @NotNull
    public final oO00000o timeout() {
        return this.f59799OooO0Oo.timeout();
    }

    @NotNull
    public final String toString() {
        return "buffer(" + this.f59799OooO0Oo + ')';
    }

    public static final class OooO00o extends InputStream {
        public OooO00o() {
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            o0o0000 o0o0000Var = o0o0000.this;
            if (o0o0000Var.f59800OooO0o) {
                throw new IOException("closed");
            }
            return (int) Math.min(o0o0000Var.f59801OooO0o0.f59828OooO0o0, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            o0o0000.this.close();
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            o0o0000 o0o0000Var = o0o0000.this;
            if (o0o0000Var.f59800OooO0o) {
                throw new IOException("closed");
            }
            oo0OOoo oo0oooo = o0o0000Var.f59801OooO0o0;
            if (oo0oooo.f59828OooO0o0 == 0 && o0o0000Var.f59799OooO0Oo.OooOO0O(oo0oooo, 8192L) == -1) {
                return -1;
            }
            return o0o0000Var.f59801OooO0o0.readByte() & UByte.MAX_VALUE;
        }

        @NotNull
        public final String toString() {
            return o0o0000.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(@NotNull byte[] data, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            o0o0000 o0o0000Var = o0o0000.this;
            if (!o0o0000Var.f59800OooO0o) {
                oO000.OooO0O0(data.length, i, i2);
                oo0OOoo oo0oooo = o0o0000Var.f59801OooO0o0;
                if (oo0oooo.f59828OooO0o0 == 0 && o0o0000Var.f59799OooO0Oo.OooOO0O(oo0oooo, 8192L) == -1) {
                    return -1;
                }
                return o0o0000Var.f59801OooO0o0.read(data, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
