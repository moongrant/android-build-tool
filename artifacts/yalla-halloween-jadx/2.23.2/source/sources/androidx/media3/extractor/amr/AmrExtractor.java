package androidx.media3.extractor.amr;

import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.OooOO0;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.TrackOutput;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import o000OOoO.OooOO0O;
import o000OOoO.Oooo0;
import o000OOoO.Oooo000;
import o000OOoO.o000000;
import o000OOoO.o000OOo;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class AmrExtractor implements Extractor {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final int[] f8378OooOOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final int f8380OooOo00;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f8384OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f8385OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f8386OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f8387OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f8388OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f8389OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f8390OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f8391OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Oooo0 f8392OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o000000 f8393OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TrackOutput f8394OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f8395OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final int[] f8376OooOOOo = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final byte[] f8377OooOOo = o00.OooOoo("#!AMR\n");

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final byte[] f8379OooOOoo = o00.OooOoo("#!AMR-WB\n");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f8383OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f8382OooO00o = new byte[1];

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f8381OooO = -1;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f8378OooOOo0 = iArr;
        f8380OooOo00 = iArr[8];
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    @Override // androidx.media3.extractor.Extractor
    public final int OooO00o(Oooo000 oooo000, o000OOo o000ooo2) throws IOException {
        int i;
        int i2;
        int iOooO00o;
        int i3;
        o00Oo0.OooO0o(this.f8394OooOOO0);
        int i4 = o00.f34910OooO00o;
        OooOO0O oooOO0O = (OooOO0O) oooo000;
        if (oooOO0O.f34678OooO0Oo == 0 && !OooO0o0(oooOO0O)) {
            throw ParserException.OooO00o("Could not find AMR header.", null);
        }
        if (!this.f8395OooOOOO) {
            this.f8395OooOOOO = true;
            boolean z = this.f8384OooO0OO;
            String str = z ? "audio/amr-wb" : "audio/3gpp";
            int i5 = z ? 16000 : 8000;
            TrackOutput trackOutput = this.f8394OooOOO0;
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
            oooO00o.f6445OooOO0O = str;
            oooO00o.f6446OooOO0o = f8380OooOo00;
            oooO00o.f6454OooOo = 1;
            oooO00o.f6460OooOoO0 = i5;
            trackOutput.OooO0O0(new OooOO0(oooO00o));
        }
        if (this.f8386OooO0o == 0) {
            try {
                int iOooO0Oo = OooO0Oo((OooOO0O) oooo000);
                this.f8387OooO0o0 = iOooO0Oo;
                this.f8386OooO0o = iOooO0Oo;
                if (this.f8381OooO == -1) {
                    this.f8389OooO0oo = oooOO0O.f34678OooO0Oo;
                    this.f8381OooO = iOooO0Oo;
                }
                if (this.f8381OooO == iOooO0Oo) {
                    this.f8390OooOO0++;
                }
                iOooO00o = this.f8394OooOOO0.OooO00o(oooo000, this.f8386OooO0o, true);
                if (iOooO00o == -1) {
                    i = -1;
                } else {
                    i3 = this.f8386OooO0o - iOooO00o;
                    this.f8386OooO0o = i3;
                    if (i3 <= 0) {
                        this.f8394OooOOO0.OooO0o0(this.f8391OooOO0O + this.f8385OooO0Oo, 1, this.f8387OooO0o0, 0, null);
                        this.f8385OooO0Oo += 20000;
                    }
                    i = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iOooO00o = this.f8394OooOOO0.OooO00o(oooo000, this.f8386OooO0o, true);
            if (iOooO00o == -1) {
                i = -1;
            } else {
                i3 = this.f8386OooO0o - iOooO00o;
                this.f8386OooO0o = i3;
                if (i3 <= 0) {
                    this.f8394OooOOO0.OooO0o0(this.f8391OooOO0O + this.f8385OooO0Oo, 1, this.f8387OooO0o0, 0, null);
                    this.f8385OooO0Oo += 20000;
                }
                i = 0;
            }
        }
        long j = oooOO0O.f34677OooO0OO;
        if (!this.f8388OooO0oO) {
            int i6 = this.f8383OooO0O0;
            if ((i6 & 1) == 0 || j == -1 || !((i2 = this.f8381OooO) == -1 || i2 == this.f8387OooO0o0)) {
                o000000.OooO0O0 oooO0O0 = new o000000.OooO0O0(-9223372036854775807L);
                this.f8393OooOOO = oooO0O0;
                this.f8392OooOO0o.OooO(oooO0O0);
                this.f8388OooO0oO = true;
            } else if (this.f8390OooOO0 >= 20 || i == -1) {
                o000OOoO.OooOO0 oooOO1 = new o000OOoO.OooOO0((int) (((((long) i2) * 8) * AnimationKt.MillisToNanos) / 20000), i2, j, this.f8389OooO0oo, (i6 & 2) != 0);
                this.f8393OooOOO = oooOO1;
                this.f8392OooOO0o.OooO(oooOO1);
                this.f8388OooO0oO = true;
            }
        }
        return i;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        this.f8385OooO0Oo = 0L;
        this.f8387OooO0o0 = 0;
        this.f8386OooO0o = 0;
        if (j != 0) {
            o000000 o000000Var = this.f8393OooOOO;
            if (o000000Var instanceof o000OOoO.OooOO0) {
                o000OOoO.OooOO0 oooOO1 = (o000OOoO.OooOO0) o000000Var;
                this.f8391OooOO0O = ((Math.max(0L, j - oooOO1.f34669OooO0O0) * 8) * AnimationKt.MillisToNanos) / ((long) oooOO1.f34673OooO0o0);
                return;
            }
        }
        this.f8391OooOO0O = 0L;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0OO(Oooo0 oooo0) {
        this.f8392OooOO0o = oooo0;
        this.f8394OooOOO0 = oooo0.OooOOOO(0, 1);
        oooo0.OooOO0O();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0039  */
    public final int OooO0Oo(OooOO0O oooOO0O) throws IOException {
        boolean z = false;
        oooOO0O.f34679OooO0o = 0;
        byte[] bArr = this.f8382OooO00o;
        oooOO0O.OooO0OO(bArr, 0, 1, false);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.OooO00o("Invalid padding bits for frame header " + ((int) b), null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15) {
            boolean z2 = this.f8384OooO0OO;
            if (z2 && (i < 10 || i > 13)) {
                z = true;
            } else {
                if (!z2 && (i < 12 || i > 14)) {
                    z = true;
                }
            }
        }
        if (z) {
            return this.f8384OooO0OO ? f8378OooOOo0[i] : f8376OooOOOo[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f8384OooO0OO ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.OooO00o(sb.toString(), null);
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean OooO0o(Oooo000 oooo000) throws IOException {
        return OooO0o0((OooOO0O) oooo000);
    }

    public final boolean OooO0o0(OooOO0O oooOO0O) throws IOException {
        oooOO0O.f34679OooO0o = 0;
        byte[] bArr = f8377OooOOo;
        byte[] bArr2 = new byte[bArr.length];
        oooOO0O.OooO0OO(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f8384OooO0OO = false;
            oooOO0O.OooOO0(bArr.length);
            return true;
        }
        oooOO0O.f34679OooO0o = 0;
        byte[] bArr3 = f8379OooOOoo;
        byte[] bArr4 = new byte[bArr3.length];
        oooOO0O.OooO0OO(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f8384OooO0OO = true;
        oooOO0O.OooOO0(bArr3.length);
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
