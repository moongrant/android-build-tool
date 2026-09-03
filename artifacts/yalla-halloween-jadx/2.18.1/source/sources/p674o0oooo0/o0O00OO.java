package p674o0oooo0;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.UByte;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p676o0oooo0O.oOo0000O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00OO implements o0oOOo {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public final o0oOO f52063Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @JvmField
    public boolean f52064Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final o0O0O0O f52065Oooo0oo;

    public o0O00OO(@NotNull o0O0O0O source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f52065Oooo0oo = source;
        this.f52063Oooo0o = new o0oOO();
    }

    public final long OooO00o(byte b, long j, long j2) {
        if (!(!this.f52064Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j2).toString());
        }
        while (jMax < j2) {
            long jOooOo0O = this.f52063Oooo0o.OooOo0O(b, jMax, j2);
            if (jOooOo0O != -1) {
                return jOooOo0O;
            }
            o0oOO o0ooo2 = this.f52063Oooo0o;
            long j3 = o0ooo2.f52099Oooo0oO;
            if (j3 >= j2 || this.f52065Oooo0oo.Oooo0O0(o0ooo2, 8192) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j3);
        }
        return -1L;
    }

    @NotNull
    public final o0oOOo OooO0O0() {
        return o0O000Oo.OooO0OO(new o0O00O0o(this));
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final o0oOO OooO0OO() {
        return this.f52063Oooo0o;
    }

    public final long OooO0Oo() {
        o0000oo(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!request(j2)) {
                break;
            }
            byte bOooOOoo = this.f52063Oooo0o.OooOOoo(j);
            if ((bOooOOoo < ((byte) 48) || bOooOOoo > ((byte) 57)) && !(j == 0 && bOooOOoo == ((byte) 45))) {
                if (j != 0) {
                    break;
                }
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected leading [0-9] or '-' character but was 0x");
                String string = Integer.toString(bOooOOoo, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                Intrinsics.checkNotNullExpressionValue(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                sbOooO0o0.append(string);
                throw new NumberFormatException(sbOooO0o0.toString());
            }
            j = j2;
        }
        return this.f52063Oooo0o.Oooo00o();
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final o0oOO OooO0o0() {
        return this.f52063Oooo0o;
    }

    @Override // p674o0oooo0.o0oOOo
    public final long OooOO0O(@NotNull o0O00o00 sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = 0;
        while (this.f52065Oooo0oo.Oooo0O0(this.f52063Oooo0o, 8192) != -1) {
            long jOooOOO = this.f52063Oooo0o.OooOOO();
            if (jOooOOO > 0) {
                j += jOooOOO;
                sink.write(this.f52063Oooo0o, jOooOOO);
            }
        }
        o0oOO o0ooo2 = this.f52063Oooo0o;
        long j2 = o0ooo2.f52099Oooo0oO;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        sink.write(o0ooo2, j2);
        return j3;
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final String OooOOO0(long j) throws EOFException {
        o0000oo(j);
        return this.f52063Oooo0o.OooOOO0(j);
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final ByteString OooOOOo(long j) throws EOFException {
        o0000oo(j);
        return this.f52063Oooo0o.OooOOOo(j);
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final byte[] OooOoo0() throws IOException {
        this.f52063Oooo0o.o0ooOOo(this.f52065Oooo0oo);
        return this.f52063Oooo0o.OooOoo0();
    }

    @Override // p674o0oooo0.o0oOOo
    public final boolean OooOooo() {
        if (!this.f52064Oooo0oO) {
            return this.f52063Oooo0o.OooOooo() && this.f52065Oooo0oo.Oooo0O0(this.f52063Oooo0o, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p674o0oooo0.o0O0O0O
    public final long Oooo0O0(@NotNull o0oOO sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        if (!(!this.f52064Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        o0oOO o0ooo2 = this.f52063Oooo0o;
        if (o0ooo2.f52099Oooo0oO == 0 && this.f52065Oooo0oo.Oooo0O0(o0ooo2, 8192) == -1) {
            return -1L;
        }
        return this.f52063Oooo0o.Oooo0O0(sink, Math.min(j, this.f52063Oooo0o.f52099Oooo0oO));
    }

    @Override // p674o0oooo0.o0oOOo
    public final long Oooo0oO(@NotNull ByteString targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (!(!this.f52064Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        while (true) {
            long jOooOoO = this.f52063Oooo0o.OooOoO(targetBytes, jMax);
            if (jOooOoO != -1) {
                return jOooOoO;
            }
            o0oOO o0ooo2 = this.f52063Oooo0o;
            long j = o0ooo2.f52099Oooo0oO;
            if (this.f52065Oooo0oo.Oooo0O0(o0ooo2, 8192) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final String OoooO(long j) throws EOFException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("limit < 0: ", j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        byte b = (byte) 10;
        long jOooO00o = OooO00o(b, 0L, j2);
        if (jOooO00o != -1) {
            return oOo0000O.OooO00o(this.f52063Oooo0o, jOooO00o);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && this.f52063Oooo0o.OooOOoo(j2 - 1) == ((byte) 13) && request(1 + j2) && this.f52063Oooo0o.OooOOoo(j2) == b) {
            return oOo0000O.OooO00o(this.f52063Oooo0o, j2);
        }
        o0oOO o0ooo2 = new o0oOO();
        o0oOO o0ooo3 = this.f52063Oooo0o;
        o0ooo3.OooOOo(o0ooo2, 0L, Math.min(32, o0ooo3.f52099Oooo0oO));
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("\\n not found: limit=");
        sbOooO0o0.append(Math.min(this.f52063Oooo0o.f52099Oooo0oO, j));
        sbOooO0o0.append(" content=");
        sbOooO0o0.append(o0ooo2.OooOoo().OooO0o());
        sbOooO0o0.append("…");
        throw new EOFException(sbOooO0o0.toString());
    }

    @Override // p674o0oooo0.o0oOOo
    public final boolean Ooooo00(long j, @NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int length = bytes.data.length;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(!this.f52064Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j >= 0 && length >= 0 && bytes.data.length - 0 >= length) {
            for (int i = 0; i < length; i++) {
                long j2 = ((long) i) + j;
                if (request(1 + j2)) {
                    if (this.f52063Oooo0o.OooOOoo(j2) == bytes.data[0 + i]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final String OooooO0(@NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f52063Oooo0o.o0ooOOo(this.f52065Oooo0oo);
        return this.f52063Oooo0o.OooooO0(charset);
    }

    @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f52064Oooo0oO) {
            return;
        }
        this.f52064Oooo0oO = true;
        this.f52065Oooo0oo.close();
        this.f52063Oooo0o.OooO0Oo();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f52064Oooo0oO;
    }

    @Override // p674o0oooo0.o0oOOo
    public final long o00000O0() throws EOFException {
        o0000oo(8L);
        return o00OOO0O.OooO0Oo(this.f52063Oooo0o.readLong());
    }

    @Override // p674o0oooo0.o0oOOo
    public final int o00000OO(@NotNull o0O00 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        if (!(!this.f52064Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iOooO0O0 = oOo0000O.OooO0O0(this.f52063Oooo0o, options, true);
            if (iOooO0O0 != -2) {
                if (iOooO0O0 == -1) {
                    break;
                }
                this.f52063Oooo0o.skip(options.f52040Oooo0o[iOooO0O0].OooO0o0());
                return iOooO0O0;
            }
        } while (this.f52065Oooo0oo.Oooo0O0(this.f52063Oooo0o, 8192) != -1);
        return -1;
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final InputStream o0000OO0() {
        return new OooO00o();
    }

    @Override // p674o0oooo0.o0oOOo
    public final void o0000oo(long j) throws EOFException {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // p674o0oooo0.o0oOOo
    public final long o000OO() throws EOFException {
        o0000oo(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request(i2)) {
                break;
            }
            byte bOooOOoo = this.f52063Oooo0o.OooOOoo(i);
            if ((bOooOOoo < ((byte) 48) || bOooOOoo > ((byte) 57)) && ((bOooOOoo < ((byte) 97) || bOooOOoo > ((byte) 102)) && (bOooOOoo < ((byte) 65) || bOooOOoo > ((byte) 70)))) {
                if (i != 0) {
                    break;
                }
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bOooOOoo, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                Intrinsics.checkNotNullExpressionValue(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                sbOooO0o0.append(string);
                throw new NumberFormatException(sbOooO0o0.toString());
            }
            i = i2;
        }
        return this.f52063Oooo0o.o000OO();
    }

    @Override // p674o0oooo0.o0oOOo
    public final void o0O0O00(@NotNull o0oOO sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            o0000oo(j);
            this.f52063Oooo0o.o0O0O00(sink, j);
        } catch (EOFException e) {
            sink.o0ooOOo(this.f52063Oooo0o);
            throw e;
        }
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final byte[] o0OO00O(long j) throws EOFException {
        o0000oo(j);
        return this.f52063Oooo0o.o0OO00O(j);
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final String o0ooOO0() {
        return OoooO(Long.MAX_VALUE);
    }

    @Override // p674o0oooo0.o0oOOo
    public final int o0ooOoO() throws EOFException {
        o0000oo(4L);
        return o00OOO0O.OooO0OO(this.f52063Oooo0o.readInt());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(@NotNull ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        o0oOO o0ooo2 = this.f52063Oooo0o;
        if (o0ooo2.f52099Oooo0oO == 0 && this.f52065Oooo0oo.Oooo0O0(o0ooo2, 8192) == -1) {
            return -1;
        }
        return this.f52063Oooo0o.read(sink);
    }

    @Override // p674o0oooo0.o0oOOo
    public final byte readByte() throws EOFException {
        o0000oo(1L);
        return this.f52063Oooo0o.readByte();
    }

    @Override // p674o0oooo0.o0oOOo
    public final void readFully(@NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            o0000oo(sink.length);
            this.f52063Oooo0o.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                o0oOO o0ooo2 = this.f52063Oooo0o;
                long j = o0ooo2.f52099Oooo0oO;
                if (j <= 0) {
                    throw e;
                }
                int i2 = o0ooo2.read(sink, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // p674o0oooo0.o0oOOo
    public final int readInt() throws EOFException {
        o0000oo(4L);
        return this.f52063Oooo0o.readInt();
    }

    @Override // p674o0oooo0.o0oOOo
    public final long readLong() throws EOFException {
        o0000oo(8L);
        return this.f52063Oooo0o.readLong();
    }

    @Override // p674o0oooo0.o0oOOo
    public final short readShort() throws EOFException {
        o0000oo(2L);
        return this.f52063Oooo0o.readShort();
    }

    @Override // p674o0oooo0.o0oOOo
    public final boolean request(long j) {
        o0oOO o0ooo2;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        if (!(!this.f52064Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            o0ooo2 = this.f52063Oooo0o;
            if (o0ooo2.f52099Oooo0oO >= j) {
                return true;
            }
        } while (this.f52065Oooo0oo.Oooo0O0(o0ooo2, 8192) != -1);
        return false;
    }

    @Override // p674o0oooo0.o0oOOo
    public final void skip(long j) throws EOFException {
        if (!(!this.f52064Oooo0oO)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            o0oOO o0ooo2 = this.f52063Oooo0o;
            if (o0ooo2.f52099Oooo0oO == 0 && this.f52065Oooo0oo.Oooo0O0(o0ooo2, 8192) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.f52063Oooo0o.f52099Oooo0oO);
            this.f52063Oooo0o.skip(jMin);
            j -= jMin;
        }
    }

    @Override // p674o0oooo0.o0O0O0O
    @NotNull
    public final o0oO0O0o timeout() {
        return this.f52065Oooo0oo.timeout();
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("buffer(");
        sbOooO0o0.append(this.f52065Oooo0oo);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public static final class OooO00o extends InputStream {
        public OooO00o() {
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            o0O00OO o0o00oo2 = o0O00OO.this;
            if (o0o00oo2.f52064Oooo0oO) {
                throw new IOException("closed");
            }
            return (int) Math.min(o0o00oo2.f52063Oooo0o.f52099Oooo0oO, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            o0O00OO.this.close();
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            o0O00OO o0o00oo2 = o0O00OO.this;
            if (o0o00oo2.f52064Oooo0oO) {
                throw new IOException("closed");
            }
            o0oOO o0ooo2 = o0o00oo2.f52063Oooo0o;
            if (o0ooo2.f52099Oooo0oO == 0 && o0o00oo2.f52065Oooo0oo.Oooo0O0(o0ooo2, 8192) == -1) {
                return -1;
            }
            return o0O00OO.this.f52063Oooo0o.readByte() & UByte.MAX_VALUE;
        }

        @NotNull
        public final String toString() {
            return o0O00OO.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(@NotNull byte[] data, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!o0O00OO.this.f52064Oooo0oO) {
                o00OOO0O.OooO0O0(data.length, i, i2);
                o0O00OO o0o00oo2 = o0O00OO.this;
                o0oOO o0ooo2 = o0o00oo2.f52063Oooo0o;
                if (o0ooo2.f52099Oooo0oO == 0 && o0o00oo2.f52065Oooo0oo.Oooo0O0(o0ooo2, 8192) == -1) {
                    return -1;
                }
                return o0O00OO.this.f52063Oooo0o.read(data, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
