package o0O0o000;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.IOException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p296o0O0OoO0.o000000;
import p296o0O0OoO0.o000oOoO;
import p296o0O0OoO0.o0OO00O;
import p296o0O0OoO0.o0OoOo0;
import p296o0O0OoO0.oo0o0Oo;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements Extractor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0OoOo0 f36124OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOOO0 f36125OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f36126OooO0OO;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO(o0OoOo0 o0oooo1) {
        this.f36124OooO00o = o0oooo1;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    public final boolean OooO00o(o000oOoO o000oooo2) throws IOException {
        boolean zOooO0OO;
        boolean zEquals;
        OooO oooO = new OooO();
        if (oooO.OooO00o(o000oooo2, true) && (oooO.f36098OooO00o & 2) == 2) {
            int iMin = Math.min(oooO.f36103OooO0o0, 8);
            o000 o000Var = new o000(iMin);
            o000oooo2.OooOOO0(o000Var.f36661OooO00o, 0, iMin);
            o000Var.OooOoOO(0);
            if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 >= 5 && o000Var.OooOOo0() == 127 && o000Var.OooOOo() == 1179402563) {
                this.f36125OooO0O0 = new OooO0O0();
            } else {
                o000Var.OooOoOO(0);
                try {
                    zOooO0OO = o000000.OooO0OO(1, o000Var, true);
                } catch (ParserException unused) {
                    zOooO0OO = false;
                }
                if (zOooO0OO) {
                    this.f36125OooO0O0 = new OooOOO();
                } else {
                    o000Var.OooOoOO(0);
                    int i = o000Var.f36663OooO0OO - o000Var.f36662OooO0O0;
                    byte[] bArr = OooOO0O.f36132OooOOOO;
                    if (i < 8) {
                        zEquals = false;
                    } else {
                        byte[] bArr2 = new byte[8];
                        o000Var.OooO0OO(bArr2, 0, 8);
                        zEquals = Arrays.equals(bArr2, bArr);
                    }
                    if (zEquals) {
                        this.f36125OooO0O0 = new OooOO0O();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0Oo(long j, long j2) {
        OooOOO0 oooOOO0 = this.f36125OooO0O0;
        if (oooOOO0 != null) {
            OooO0o oooO0o = oooOOO0.f36144OooO00o;
            oooO0o.f36127OooO00o.OooO0O0();
            oooO0o.f36128OooO0O0.OooOo(0);
            oooO0o.f36129OooO0OO = -1;
            oooO0o.f36131OooO0o0 = false;
            if (j == 0) {
                oooOOO0.OooO0o0(!oooOOO0.f36154OooOO0o);
            } else if (oooOOO0.f36151OooO0oo != 0) {
                long jOooO00o = oooOOO0.OooO00o(j2);
                oooOOO0.f36149OooO0o0 = jOooO00o;
                oooOOO0.f36147OooO0Oo.OooO0OO(jOooO00o);
                oooOOO0.f36151OooO0oo = 2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0o(o000oOoO o000oooo2) throws IOException {
        try {
            return OooO00o(o000oooo2);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0176  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0o0(o000oOoO o000oooo2, o0OO00O o0oo00o2) throws IOException {
        int i;
        OooO0o oooO0o;
        o000 o000Var;
        byte[] bArr;
        o00000O0.OooO0o(this.f36124OooO00o);
        if (this.f36125OooO0O0 == null) {
            if (!OooO00o(o000oooo2)) {
                throw new ParserException("Failed to determine bitstream type");
            }
            o000oooo2.OooO();
        }
        if (!this.f36126OooO0OO) {
            TrackOutput trackOutputOooO00o = this.f36124OooO00o.OooO00o(0);
            this.f36124OooO00o.OooOOO0();
            OooOOO0 oooOOO0 = this.f36125OooO0O0;
            oooOOO0.f36146OooO0OO = this.f36124OooO00o;
            oooOOO0.f36145OooO0O0 = trackOutputOooO00o;
            oooOOO0.OooO0o0(true);
            this.f36126OooO0OO = true;
        }
        OooOOO0 oooOOO1 = this.f36125OooO0O0;
        int i2 = oooOOO1.f36151OooO0oo;
        if (i2 == 0) {
            boolean zOooO0Oo = true;
            while (zOooO0Oo) {
                if (oooOOO1.f36144OooO00o.OooO0O0(o000oooo2)) {
                    long position = o000oooo2.getPosition();
                    long j = oooOOO1.f36148OooO0o;
                    oooOOO1.f36153OooOO0O = position - j;
                    zOooO0Oo = oooOOO1.OooO0Oo(oooOOO1.f36144OooO00o.f36128OooO0O0, j, oooOOO1.f36152OooOO0);
                    if (zOooO0Oo) {
                        oooOOO1.f36148OooO0o = o000oooo2.getPosition();
                    }
                } else {
                    oooOOO1.f36151OooO0oo = 3;
                }
            }
            Format format = oooOOO1.f36152OooOO0.f36156OooO00o;
            oooOOO1.f36143OooO = format.f13152ooOO;
            if (!oooOOO1.f36155OooOOO0) {
                oooOOO1.f36145OooO0O0.OooO0o0(format);
                oooOOO1.f36155OooOOO0 = true;
            }
            OooO0O0.OooO00o oooO00o = oooOOO1.f36152OooOO0.f36157OooO0O0;
            if (oooO00o == null) {
                if (o000oooo2.OooO00o() == -1) {
                    oooOOO1.f36147OooO0Oo = new OooOOO0.OooO0O0();
                } else {
                    OooO oooO = oooOOO1.f36144OooO00o.f36127OooO00o;
                    boolean z = (oooO.f36098OooO00o & 4) != 0;
                    long j2 = oooOOO1.f36148OooO0o;
                    long jOooO00o = o000oooo2.OooO00o();
                    long j3 = oooO.f36101OooO0Oo + oooO.f36103OooO0o0;
                    long j4 = oooO.f36099OooO0O0;
                    i = 2;
                    oooOOO1.f36147OooO0Oo = new OooO00o(oooOOO1, j2, jOooO00o, j3, j4, z);
                }
                oooOOO1.f36152OooOO0 = 0;
                oooOOO1.f36151OooO0oo = i;
                oooO0o = oooOOO1.f36144OooO00o;
                o000Var = oooO0o.f36128OooO0O0;
                bArr = o000Var.f36661OooO00o;
                if (bArr.length != 65025) {
                    o000Var.OooOoO0(Arrays.copyOf(bArr, Math.max(65025, o000Var.f36663OooO0OO)), oooO0o.f36128OooO0O0.f36663OooO0OO);
                }
                return 0;
            }
            oooOOO1.f36147OooO0Oo = oooO00o;
            i = 2;
            oooOOO1.f36152OooOO0 = 0;
            oooOOO1.f36151OooO0oo = i;
            oooO0o = oooOOO1.f36144OooO00o;
            o000Var = oooO0o.f36128OooO0O0;
            bArr = o000Var.f36661OooO00o;
            if (bArr.length != 65025) {
                o000Var.OooOoO0(Arrays.copyOf(bArr, Math.max(65025, o000Var.f36663OooO0OO)), oooO0o.f36128OooO0O0.f36663OooO0OO);
            }
            return 0;
        }
        if (i2 == 1) {
            o000oooo2.OooOO0((int) oooOOO1.f36148OooO0o);
            oooOOO1.f36151OooO0oo = 2;
            return 0;
        }
        if (i2 != 2) {
            throw new IllegalStateException();
        }
        long jOooO00o2 = oooOOO1.f36147OooO0Oo.OooO00o(o000oooo2);
        if (jOooO00o2 >= 0) {
            o0oo00o2.f35929OooO00o = jOooO00o2;
            return 1;
        }
        if (jOooO00o2 < -1) {
            oooOOO1.OooO0O0(-(jOooO00o2 + 2));
        }
        if (!oooOOO1.f36154OooOO0o) {
            oo0o0Oo oo0o0ooOooO0O0 = oooOOO1.f36147OooO0Oo.OooO0O0();
            o00000O0.OooO0o(oo0o0ooOooO0O0);
            oooOOO1.f36146OooO0OO.OooOO0O(oo0o0ooOooO0O0);
            oooOOO1.f36154OooOO0o = true;
        }
        if (oooOOO1.f36153OooOO0O > 0 || oooOOO1.f36144OooO00o.OooO0O0(o000oooo2)) {
            oooOOO1.f36153OooOO0O = 0L;
            o000 o000Var2 = oooOOO1.f36144OooO00o.f36128OooO0O0;
            long jOooO0OO = oooOOO1.OooO0OO(o000Var2);
            if (jOooO0OO >= 0) {
                long j5 = oooOOO1.f36150OooO0oO;
                if (j5 + jOooO0OO >= oooOOO1.f36149OooO0o0) {
                    long j6 = (j5 * 1000000) / ((long) oooOOO1.f36143OooO);
                    oooOOO1.f36145OooO0O0.OooO0OO(o000Var2, o000Var2.f36663OooO0OO);
                    oooOOO1.f36145OooO0O0.OooO0Oo(j6, 1, o000Var2.f36663OooO0OO, 0, null);
                    oooOOO1.f36149OooO0o0 = -1L;
                }
            }
            oooOOO1.f36150OooO0oO += jOooO0OO;
            return 0;
        }
        oooOOO1.f36151OooO0oo = 3;
        return -1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
