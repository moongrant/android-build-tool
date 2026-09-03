package p674o0oooo0;

import OooO00o.OooO0OO;
import androidx.viewpager2.adapter.OooO00o;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000 implements o0O0O0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final o0O000O f52042Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public byte f52043Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o0O00OO f52044Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Inflater f52045Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final CRC32 f52046OoooO00;

    public o0O000(@NotNull o0O0O0O source) {
        Intrinsics.checkNotNullParameter(source, "source");
        o0O00OO o0o00oo2 = new o0O00OO(source);
        this.f52044Oooo0oO = o0o00oo2;
        Inflater inflater = new Inflater(true);
        this.f52045Oooo0oo = inflater;
        this.f52042Oooo = new o0O000O((o0oOOo) o0o00oo2, inflater);
        this.f52046OoooO00 = new CRC32();
    }

    public final void OooO00o(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(OooO0OO.OooO00o(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3, "%s: actual 0x%08x != expected 0x%08x", "java.lang.String.format(this, *args)"));
        }
    }

    public final void OooO0O0(o0oOO o0ooo2, long j, long j2) {
        o0O00OOO o0o00ooo2 = o0ooo2.f52098Oooo0o;
        Intrinsics.checkNotNull(o0o00ooo2);
        while (true) {
            int i = o0o00ooo2.f52069OooO0OO;
            int i2 = o0o00ooo2.f52068OooO0O0;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            o0o00ooo2 = o0o00ooo2.f52071OooO0o;
            Intrinsics.checkNotNull(o0o00ooo2);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) o0o00ooo2.f52068OooO0O0) + j);
            int iMin = (int) Math.min(o0o00ooo2.f52069OooO0OO - i3, j2);
            this.f52046OoooO00.update(o0o00ooo2.f52067OooO00o, i3, iMin);
            j2 -= (long) iMin;
            o0o00ooo2 = o0o00ooo2.f52071OooO0o;
            Intrinsics.checkNotNull(o0o00ooo2);
            j = 0;
        }
    }

    @Override // p674o0oooo0.o0O0O0O
    public final long Oooo0O0(@NotNull o0oOO sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        if (this.f52043Oooo0o == 0) {
            this.f52044Oooo0oO.o0000oo(10L);
            byte bOooOOoo = this.f52044Oooo0oO.f52063Oooo0o.OooOOoo(3L);
            boolean z = ((bOooOOoo >> 1) & 1) == 1;
            if (z) {
                OooO0O0(this.f52044Oooo0oO.f52063Oooo0o, 0L, 10L);
            }
            OooO00o("ID1ID2", 8075, this.f52044Oooo0oO.readShort());
            this.f52044Oooo0oO.skip(8L);
            if (((bOooOOoo >> 2) & 1) == 1) {
                this.f52044Oooo0oO.o0000oo(2L);
                if (z) {
                    OooO0O0(this.f52044Oooo0oO.f52063Oooo0o, 0L, 2L);
                }
                long jOooo0 = this.f52044Oooo0oO.f52063Oooo0o.Oooo0();
                this.f52044Oooo0oO.o0000oo(jOooo0);
                if (z) {
                    OooO0O0(this.f52044Oooo0oO.f52063Oooo0o, 0L, jOooo0);
                }
                this.f52044Oooo0oO.skip(jOooo0);
            }
            if (((bOooOOoo >> 3) & 1) == 1) {
                long jOooO00o = this.f52044Oooo0oO.OooO00o((byte) 0, 0L, Long.MAX_VALUE);
                if (jOooO00o == -1) {
                    throw new EOFException();
                }
                if (z) {
                    OooO0O0(this.f52044Oooo0oO.f52063Oooo0o, 0L, jOooO00o + 1);
                }
                this.f52044Oooo0oO.skip(jOooO00o + 1);
            }
            if (((bOooOOoo >> 4) & 1) == 1) {
                long jOooO00o2 = this.f52044Oooo0oO.OooO00o((byte) 0, 0L, Long.MAX_VALUE);
                if (jOooO00o2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    OooO0O0(this.f52044Oooo0oO.f52063Oooo0o, 0L, jOooO00o2 + 1);
                }
                this.f52044Oooo0oO.skip(jOooO00o2 + 1);
            }
            if (z) {
                o0O00OO o0o00oo2 = this.f52044Oooo0oO;
                o0o00oo2.o0000oo(2L);
                OooO00o("FHCRC", o0o00oo2.f52063Oooo0o.Oooo0(), (short) this.f52046OoooO00.getValue());
                this.f52046OoooO00.reset();
            }
            this.f52043Oooo0o = (byte) 1;
        }
        if (this.f52043Oooo0o == 1) {
            long j2 = sink.f52099Oooo0oO;
            long jOooo0O0 = this.f52042Oooo.Oooo0O0(sink, j);
            if (jOooo0O0 != -1) {
                OooO0O0(sink, j2, jOooo0O0);
                return jOooo0O0;
            }
            this.f52043Oooo0o = (byte) 2;
        }
        if (this.f52043Oooo0o == 2) {
            OooO00o("CRC", this.f52044Oooo0oO.o0ooOoO(), (int) this.f52046OoooO00.getValue());
            OooO00o("ISIZE", this.f52044Oooo0oO.o0ooOoO(), (int) this.f52045Oooo0oo.getBytesWritten());
            this.f52043Oooo0o = (byte) 3;
            if (!this.f52044Oooo0oO.OooOooo()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f52042Oooo.close();
    }

    @Override // p674o0oooo0.o0O0O0O
    @NotNull
    public final o0oO0O0o timeout() {
        return this.f52044Oooo0oO.timeout();
    }
}
