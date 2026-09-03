package p659o0oooO00;

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
import p658o0oooO0.o00O0OOO;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0000 implements o0000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final o00O00 f60232OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    public boolean f60233OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public final o00000O f60234OooO0o0;

    public o00O0000(@NotNull o00O00 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f60232OooO0Oo = source;
        this.f60234OooO0o0 = new o00000O();
    }

    public final long OooO00o(byte b, long j, long j2) {
        if (!(!this.f60233OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        if (!(0 <= j2)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("fromIndex=0 toIndex=", j2).toString());
        }
        while (jMax < j2) {
            long jOooo00o = this.f60234OooO0o0.Oooo00o(b, jMax, j2);
            if (jOooo00o != -1) {
                return jOooo00o;
            }
            o00000O o00000o = this.f60234OooO0o0;
            long j3 = o00000o.f60177OooO0o0;
            if (j3 >= j2 || this.f60232OooO0Oo.o0000OO0(o00000o, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j3);
        }
        return -1L;
    }

    @Override // p659o0oooO00.o0000, p659o0oooO00.o0000Ooo
    @NotNull
    public final o00000O OooO0O0() {
        return this.f60234OooO0o0;
    }

    public final long OooO0OO() throws EOFException {
        o00000O o00000o;
        OoooOoO(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            boolean zRequest = request(j2);
            o00000o = this.f60234OooO0o0;
            if (!zRequest) {
                break;
            }
            byte bOooOo = o00000o.OooOo(j);
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
        return o00000o.Oooo0o();
    }

    @Override // p659o0oooO00.o0000, p659o0oooO00.o0000Ooo
    @NotNull
    public final o00000O OooO0Oo() {
        return this.f60234OooO0o0;
    }

    public final short OooO0oO() throws EOFException {
        OoooOoO(2L);
        return this.f60234OooO0o0.Oooo();
    }

    @Override // p659o0oooO00.o0000
    public final long OooOoO0(@NotNull ByteString targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (!(!this.f60233OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        while (true) {
            o00000O o00000o = this.f60234OooO0o0;
            long jOooo0 = o00000o.Oooo0(jMax, targetBytes);
            if (jOooo0 != -1) {
                return jOooo0;
            }
            long j = o00000o.f60177OooO0o0;
            if (this.f60232OooO0Oo.o0000OO0(o00000o, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // p659o0oooO00.o0000
    public final int OooOoo(@NotNull o000O0O0 options) throws EOFException {
        o00000O o00000o;
        Intrinsics.checkNotNullParameter(options, "options");
        if (!(!this.f60233OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            o00000o = this.f60234OooO0o0;
            int iOooO0O0 = o00O0OOO.OooO0O0(o00000o, options, true);
            if (iOooO0O0 != -2) {
                if (iOooO0O0 == -1) {
                    break;
                }
                o00000o.skip(options.f60214OooO0Oo[iOooO0O0].OooO0o0());
                return iOooO0O0;
            }
        } while (this.f60232OooO0Oo.o0000OO0(o00000o, 8192L) != -1);
        return -1;
    }

    @Override // p659o0oooO00.o0000
    @NotNull
    public final String OooOoo0(long j) throws EOFException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("limit < 0: ", j).toString());
        }
        long j2 = j == LongCompanionObject.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        byte b = (byte) 10;
        long jOooO00o = OooO00o(b, 0L, j2);
        o00000O o00000o = this.f60234OooO0o0;
        if (jOooO00o != -1) {
            return o00O0OOO.OooO00o(o00000o, jOooO00o);
        }
        if (j2 < LongCompanionObject.MAX_VALUE && request(j2) && o00000o.OooOo(j2 - 1) == ((byte) 13) && request(1 + j2) && o00000o.OooOo(j2) == b) {
            return o00O0OOO.OooO00o(o00000o, j2);
        }
        o00000O o00000o2 = new o00000O();
        o00000o.OooOo0(0L, Math.min(32, o00000o.f60177OooO0o0), o00000o2);
        throw new EOFException("\\n not found: limit=" + Math.min(o00000o.f60177OooO0o0, j) + " content=" + o00000o2.Oooo0o0().OooO0o() + Typography.ellipsis);
    }

    @Override // p659o0oooO00.o0000
    public final boolean Oooo00O(long j, @NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int length = bytes.data.length;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(!this.f60233OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j >= 0 && length >= 0 && bytes.data.length - 0 >= length) {
            for (int i = 0; i < length; i++) {
                long j2 = ((long) i) + j;
                if (request(1 + j2)) {
                    if (this.f60234OooO0o0.OooOo(j2) == bytes.data[0 + i]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p659o0oooO00.o0000
    @NotNull
    public final String OoooO0() {
        return OooOoo0(LongCompanionObject.MAX_VALUE);
    }

    @Override // p659o0oooO00.o0000
    public final void OoooOoO(long j) throws EOFException {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // p659o0oooO00.o0000
    @NotNull
    public final String OooooO0(long j) throws EOFException {
        OoooOoO(j);
        return this.f60234OooO0o0.OooooO0(j);
    }

    @Override // p659o0oooO00.o0000
    @NotNull
    public final ByteString Oooooo0(long j) {
        OoooOoO(j);
        return this.f60234OooO0o0.Oooooo0(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f60233OooO0o) {
            return;
        }
        this.f60233OooO0o = true;
        this.f60232OooO0Oo.close();
        this.f60234OooO0o0.OooO0oO();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f60233OooO0o;
    }

    @Override // p659o0oooO00.o0000
    @NotNull
    public final String o000000(@NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        o00O00 o00o01 = this.f60232OooO0Oo;
        o00000O o00000o = this.f60234OooO0o0;
        o00000o.Oooo000(o00o01);
        return o00000o.o000000(charset);
    }

    @Override // p659o0oooO00.o00O00
    public final long o0000OO0(@NotNull o00000O sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        if (!(!this.f60233OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        o00000O o00000o = this.f60234OooO0o0;
        if (o00000o.f60177OooO0o0 == 0 && this.f60232OooO0Oo.o0000OO0(o00000o, 8192L) == -1) {
            return -1L;
        }
        return o00000o.o0000OO0(sink, Math.min(j, o00000o.f60177OooO0o0));
    }

    @Override // p659o0oooO00.o0000
    public final long o0000Oo0() throws EOFException {
        o00000O o00000o;
        OoooOoO(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zRequest = request(i2);
            o00000o = this.f60234OooO0o0;
            if (!zRequest) {
                break;
            }
            byte bOooOo = o00000o.OooOo(i);
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
        return o00000o.o0000Oo0();
    }

    @Override // p659o0oooO00.o0000
    @NotNull
    public final InputStream o0000OoO() {
        return new OooO00o();
    }

    @Override // p659o0oooO00.o0000
    public final int o0000Ooo() throws EOFException {
        OoooOoO(4L);
        return this.f60234OooO0o0.o0000Ooo();
    }

    @Override // p659o0oooO00.o0000
    public final long o000oOoO() throws EOFException {
        OoooOoO(8L);
        return this.f60234OooO0o0.o000oOoO();
    }

    @Override // p659o0oooO00.o0000
    @NotNull
    public final byte[] o00Ooo() throws IOException {
        o00O00 o00o01 = this.f60232OooO0Oo;
        o00000O o00000o = this.f60234OooO0o0;
        o00000o.Oooo000(o00o01);
        return o00000o.o00Ooo();
    }

    @Override // p659o0oooO00.o0000
    public final long o00oO0O(@NotNull o0000Ooo sink) throws IOException {
        o00000O o00000o;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = 0;
        while (true) {
            o00O00 o00o01 = this.f60232OooO0Oo;
            o00000o = this.f60234OooO0o0;
            if (o00o01.o0000OO0(o00000o, 8192L) == -1) {
                break;
            }
            long jOooOo00 = o00000o.OooOo00();
            if (jOooOo00 > 0) {
                j += jOooOo00;
                sink.write(o00000o, jOooOo00);
            }
        }
        long j2 = o00000o.f60177OooO0o0;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        sink.write(o00000o, j2);
        return j3;
    }

    @Override // p659o0oooO00.o0000
    public final void o0ooOoO(@NotNull o00000O sink, long j) throws IOException {
        o00000O o00000o = this.f60234OooO0o0;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            OoooOoO(j);
            o00000o.o0ooOoO(sink, j);
        } catch (EOFException e) {
            sink.Oooo000(o00000o);
            throw e;
        }
    }

    @Override // p659o0oooO00.o0000
    public final boolean oo000o() {
        if (!(!this.f60233OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        o00000O o00000o = this.f60234OooO0o0;
        return o00000o.oo000o() && this.f60232OooO0Oo.o0000OO0(o00000o, 8192L) == -1;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(@NotNull ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        o00000O o00000o = this.f60234OooO0o0;
        if (o00000o.f60177OooO0o0 == 0 && this.f60232OooO0Oo.o0000OO0(o00000o, 8192L) == -1) {
            return -1;
        }
        return o00000o.read(sink);
    }

    @Override // p659o0oooO00.o0000
    public final byte readByte() throws EOFException {
        OoooOoO(1L);
        return this.f60234OooO0o0.readByte();
    }

    @Override // p659o0oooO00.o0000
    public final void readFully(@NotNull byte[] sink) throws EOFException {
        o00000O o00000o = this.f60234OooO0o0;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            OoooOoO(sink.length);
            o00000o.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = o00000o.f60177OooO0o0;
                if (j <= 0) {
                    throw e;
                }
                int i2 = o00000o.read(sink, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // p659o0oooO00.o0000
    public final int readInt() {
        OoooOoO(4L);
        return this.f60234OooO0o0.readInt();
    }

    @Override // p659o0oooO00.o0000
    public final long readLong() throws EOFException {
        OoooOoO(8L);
        return this.f60234OooO0o0.readLong();
    }

    @Override // p659o0oooO00.o0000
    public final short readShort() throws EOFException {
        OoooOoO(2L);
        return this.f60234OooO0o0.readShort();
    }

    @Override // p659o0oooO00.o0000
    public final boolean request(long j) {
        o00000O o00000o;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        if (!(!this.f60233OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            o00000o = this.f60234OooO0o0;
            if (o00000o.f60177OooO0o0 >= j) {
                return true;
            }
        } while (this.f60232OooO0Oo.o0000OO0(o00000o, 8192L) != -1);
        return false;
    }

    @Override // p659o0oooO00.o0000
    public final void skip(long j) throws EOFException {
        if (!(!this.f60233OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            o00000O o00000o = this.f60234OooO0o0;
            if (o00000o.f60177OooO0o0 == 0 && this.f60232OooO0Oo.o0000OO0(o00000o, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, o00000o.f60177OooO0o0);
            o00000o.skip(jMin);
            j -= jMin;
        }
    }

    @Override // p659o0oooO00.o00O00
    @NotNull
    public final o00O00O timeout() {
        return this.f60232OooO0Oo.timeout();
    }

    @NotNull
    public final String toString() {
        return "buffer(" + this.f60232OooO0Oo + ')';
    }

    public static final class OooO00o extends InputStream {
        public OooO00o() {
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            o00O0000 o00o0001 = o00O0000.this;
            if (o00o0001.f60233OooO0o) {
                throw new IOException("closed");
            }
            return (int) Math.min(o00o0001.f60234OooO0o0.f60177OooO0o0, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            o00O0000.this.close();
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            o00O0000 o00o0001 = o00O0000.this;
            if (o00o0001.f60233OooO0o) {
                throw new IOException("closed");
            }
            o00000O o00000o = o00o0001.f60234OooO0o0;
            if (o00000o.f60177OooO0o0 == 0 && o00o0001.f60232OooO0Oo.o0000OO0(o00000o, 8192L) == -1) {
                return -1;
            }
            return o00o0001.f60234OooO0o0.readByte() & UByte.MAX_VALUE;
        }

        @NotNull
        public final String toString() {
            return o00O0000.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(@NotNull byte[] data, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            o00O0000 o00o0001 = o00O0000.this;
            if (!o00o0001.f60233OooO0o) {
                oo00o.OooO0O0(data.length, i, i2);
                o00000O o00000o = o00o0001.f60234OooO0o0;
                if (o00000o.f60177OooO0o0 == 0 && o00o0001.f60232OooO0Oo.o0000OO0(o00000o, 8192L) == -1) {
                    return -1;
                }
                return o00o0001.f60234OooO0o0.read(data, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
