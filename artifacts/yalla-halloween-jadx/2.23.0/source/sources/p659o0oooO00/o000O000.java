package p659o0oooO00;

import OooO0O0.OooO0O0;
import androidx.compose.ui.input.key.OooO00o;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O000 implements o00O00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public byte f60208OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Inflater f60209OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00O0000 f60210OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o000O0o f60211OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final CRC32 f60212OooO0oo;

    public o000O000(@NotNull o00O00 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        o00O0000 o00o0001 = new o00O0000(source);
        this.f60210OooO0o0 = o00o0001;
        Inflater inflater = new Inflater(true);
        this.f60209OooO0o = inflater;
        this.f60211OooO0oO = new o000O0o(o00o0001, inflater);
        this.f60212OooO0oo = new CRC32();
    }

    public static void OooO00o(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(OooO0O0.OooO00o(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3, "%s: actual 0x%08x != expected 0x%08x", "format(this, *args)"));
        }
    }

    public final void OooO0OO(long j, long j2, o00000O o00000o) {
        o0O0ooO o0o0ooo = o00000o.f60176OooO0Oo;
        Intrinsics.checkNotNull(o0o0ooo);
        while (true) {
            int i = o0o0ooo.f60251OooO0OO;
            int i2 = o0o0ooo.f60250OooO0O0;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            o0o0ooo = o0o0ooo.f60253OooO0o;
            Intrinsics.checkNotNull(o0o0ooo);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) o0o0ooo.f60250OooO0O0) + j);
            int iMin = (int) Math.min(o0o0ooo.f60251OooO0OO - i3, j2);
            this.f60212OooO0oo.update(o0o0ooo.f60249OooO00o, i3, iMin);
            j2 -= (long) iMin;
            o0o0ooo = o0o0ooo.f60253OooO0o;
            Intrinsics.checkNotNull(o0o0ooo);
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f60211OooO0oO.close();
    }

    @Override // p659o0oooO00.o00O00
    public final long o0000OO0(@NotNull o00000O sink, long j) throws IOException {
        o00O0000 o00o0001;
        long j2;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = this.f60208OooO0Oo;
        CRC32 crc32 = this.f60212OooO0oo;
        o00O0000 o00o0002 = this.f60210OooO0o0;
        if (b == 0) {
            o00o0002.OoooOoO(10L);
            o00000O o00000o = o00o0002.f60234OooO0o0;
            byte bOooOo = o00000o.OooOo(3L);
            boolean z = ((bOooOo >> 1) & 1) == 1;
            if (z) {
                OooO0OO(0L, 10L, o00o0002.f60234OooO0o0);
            }
            OooO00o(8075, o00o0002.readShort(), "ID1ID2");
            o00o0002.skip(8L);
            if (((bOooOo >> 2) & 1) == 1) {
                o00o0002.OoooOoO(2L);
                if (z) {
                    OooO0OO(0L, 2L, o00o0002.f60234OooO0o0);
                }
                long jOooo = o00000o.Oooo();
                o00o0002.OoooOoO(jOooo);
                if (z) {
                    OooO0OO(0L, jOooo, o00o0002.f60234OooO0o0);
                    j2 = jOooo;
                } else {
                    j2 = jOooo;
                }
                o00o0002.skip(j2);
            }
            if (((bOooOo >> 3) & 1) == 1) {
                o00o0001 = o00o0002;
                long jOooO00o = o00o0002.OooO00o((byte) 0, 0L, LongCompanionObject.MAX_VALUE);
                if (jOooO00o == -1) {
                    throw new EOFException();
                }
                if (z) {
                    OooO0OO(0L, jOooO00o + 1, o00o0001.f60234OooO0o0);
                }
                o00o0001.skip(jOooO00o + 1);
            } else {
                o00o0001 = o00o0002;
            }
            if (((bOooOo >> 4) & 1) == 1) {
                long jOooO00o2 = o00o0001.OooO00o((byte) 0, 0L, LongCompanionObject.MAX_VALUE);
                if (jOooO00o2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    OooO0OO(0L, jOooO00o2 + 1, o00o0001.f60234OooO0o0);
                }
                o00o0001.skip(jOooO00o2 + 1);
            }
            if (z) {
                OooO00o(o00o0001.OooO0oO(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f60208OooO0Oo = (byte) 1;
        } else {
            o00o0001 = o00o0002;
        }
        if (this.f60208OooO0Oo == 1) {
            long j3 = sink.f60177OooO0o0;
            long jO0000OO0 = this.f60211OooO0oO.o0000OO0(sink, j);
            if (jO0000OO0 != -1) {
                OooO0OO(j3, jO0000OO0, sink);
                return jO0000OO0;
            }
            this.f60208OooO0Oo = (byte) 2;
        }
        if (this.f60208OooO0Oo != 2) {
            return -1L;
        }
        OooO00o(o00o0001.o0000Ooo(), (int) crc32.getValue(), "CRC");
        OooO00o(o00o0001.o0000Ooo(), (int) this.f60209OooO0o.getBytesWritten(), "ISIZE");
        this.f60208OooO0Oo = (byte) 3;
        if (o00o0001.oo000o()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // p659o0oooO00.o00O00
    @NotNull
    public final o00O00O timeout() {
        return this.f60210OooO0o0.timeout();
    }
}
