package p662o0oooO0O;

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
public final class o0OO00o0 implements oO00000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public byte f59774OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Inflater f59775OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0o0000 f59776OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o0OO0 f59777OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final CRC32 f59778OooO0oo;

    public o0OO00o0(@NotNull oO00000 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        o0o0000 o0o0000Var = new o0o0000(source);
        this.f59776OooO0o0 = o0o0000Var;
        Inflater inflater = new Inflater(true);
        this.f59775OooO0o = inflater;
        this.f59777OooO0oO = new o0OO0(o0o0000Var, inflater);
        this.f59778OooO0oo = new CRC32();
    }

    public static void OooO00o(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(OooO0O0.OooO00o(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3, "%s: actual 0x%08x != expected 0x%08x", "format(this, *args)"));
        }
    }

    public final void OooO0OO(long j, long j2, oo0OOoo oo0oooo) {
        oO0Oo oo0oo = oo0oooo.f59827OooO0Oo;
        Intrinsics.checkNotNull(oo0oo);
        while (true) {
            int i = oo0oo.f59822OooO0OO;
            int i2 = oo0oo.f59821OooO0O0;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            oo0oo = oo0oo.f59824OooO0o;
            Intrinsics.checkNotNull(oo0oo);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) oo0oo.f59821OooO0O0) + j);
            int iMin = (int) Math.min(oo0oo.f59822OooO0OO - i3, j2);
            this.f59778OooO0oo.update(oo0oo.f59820OooO00o, i3, iMin);
            j2 -= (long) iMin;
            oo0oo = oo0oo.f59824OooO0o;
            Intrinsics.checkNotNull(oo0oo);
            j = 0;
        }
    }

    @Override // p662o0oooO0O.oO00000
    public final long OooOO0O(@NotNull oo0OOoo sink, long j) throws IOException {
        o0o0000 o0o0000Var;
        long j2;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = this.f59774OooO0Oo;
        CRC32 crc32 = this.f59778OooO0oo;
        o0o0000 o0o0000Var2 = this.f59776OooO0o0;
        if (b == 0) {
            o0o0000Var2.OoooOoO(10L);
            oo0OOoo oo0oooo = o0o0000Var2.f59801OooO0o0;
            byte bOooOo = oo0oooo.OooOo(3L);
            boolean z = ((bOooOo >> 1) & 1) == 1;
            if (z) {
                OooO0OO(0L, 10L, o0o0000Var2.f59801OooO0o0);
            }
            OooO00o(8075, o0o0000Var2.readShort(), "ID1ID2");
            o0o0000Var2.skip(8L);
            if (((bOooOo >> 2) & 1) == 1) {
                o0o0000Var2.OoooOoO(2L);
                if (z) {
                    OooO0OO(0L, 2L, o0o0000Var2.f59801OooO0o0);
                }
                long jOoooO00 = oo0oooo.OoooO00();
                o0o0000Var2.OoooOoO(jOoooO00);
                if (z) {
                    OooO0OO(0L, jOoooO00, o0o0000Var2.f59801OooO0o0);
                    j2 = jOoooO00;
                } else {
                    j2 = jOoooO00;
                }
                o0o0000Var2.skip(j2);
            }
            if (((bOooOo >> 3) & 1) == 1) {
                o0o0000Var = o0o0000Var2;
                long jOooO00o = o0o0000Var2.OooO00o((byte) 0, 0L, LongCompanionObject.MAX_VALUE);
                if (jOooO00o == -1) {
                    throw new EOFException();
                }
                if (z) {
                    OooO0OO(0L, jOooO00o + 1, o0o0000Var.f59801OooO0o0);
                }
                o0o0000Var.skip(jOooO00o + 1);
            } else {
                o0o0000Var = o0o0000Var2;
            }
            if (((bOooOo >> 4) & 1) == 1) {
                long jOooO00o2 = o0o0000Var.OooO00o((byte) 0, 0L, LongCompanionObject.MAX_VALUE);
                if (jOooO00o2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    OooO0OO(0L, jOooO00o2 + 1, o0o0000Var.f59801OooO0o0);
                }
                o0o0000Var.skip(jOooO00o2 + 1);
            }
            if (z) {
                OooO00o(o0o0000Var.OooO0oO(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f59774OooO0Oo = (byte) 1;
        } else {
            o0o0000Var = o0o0000Var2;
        }
        if (this.f59774OooO0Oo == 1) {
            long j3 = sink.f59828OooO0o0;
            long jOooOO0O = this.f59777OooO0oO.OooOO0O(sink, j);
            if (jOooOO0O != -1) {
                OooO0OO(j3, jOooOO0O, sink);
                return jOooOO0O;
            }
            this.f59774OooO0Oo = (byte) 2;
        }
        if (this.f59774OooO0Oo != 2) {
            return -1L;
        }
        OooO00o(o0o0000Var.o0000Ooo(), (int) crc32.getValue(), "CRC");
        OooO00o(o0o0000Var.o0000Ooo(), (int) this.f59775OooO0o.getBytesWritten(), "ISIZE");
        this.f59774OooO0Oo = (byte) 3;
        if (o0o0000Var.o00oO0O()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f59777OooO0oO.close();
    }

    @Override // p662o0oooO0O.oO00000
    @NotNull
    public final oO00000o timeout() {
        return this.f59776OooO0o0.timeout();
    }
}
