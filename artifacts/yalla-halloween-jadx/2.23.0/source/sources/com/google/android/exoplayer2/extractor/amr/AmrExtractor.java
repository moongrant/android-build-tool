package com.google.android.exoplayer2.extractor.amr;

import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import p209o00o0oo0.o00O00OO;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00OO0O0;
import p209o00o0oo0.o00OO0OO;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class AmrExtractor implements Extractor {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final int[] f11798OooOOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final int f11800OooOo00;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f11804OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f11805OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f11806OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f11807OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f11808OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f11809OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f11810OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f11811OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o00O0O0 f11812OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o00OO0OO f11813OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TrackOutput f11814OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f11815OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final int[] f11796OooOOOo = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final byte[] f11797OooOOo = o0O00.OooOoo0("#!AMR\n");

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final byte[] f11799OooOOoo = o0O00.OooOoo0("#!AMR-WB\n");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f11803OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f11802OooO00o = new byte[1];

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f11801OooO = -1;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f11798OooOOo0 = iArr;
        f11800OooOo00 = iArr[8];
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0039  */
    public final int OooO00o(o00O00o0 o00o00o1) throws IOException {
        boolean z = false;
        o00o00o1.f39533OooO0o = 0;
        byte[] bArr = this.f11802OooO00o;
        o00o00o1.OooO0Oo(bArr, 0, 1, false);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.OooO00o("Invalid padding bits for frame header " + ((int) b), null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15) {
            boolean z2 = this.f11804OooO0OO;
            if (z2 && (i < 10 || i > 13)) {
                z = true;
            } else {
                if (!z2 && (i < 12 || i > 14)) {
                    z = true;
                }
            }
        }
        if (z) {
            return this.f11804OooO0OO ? f11798OooOOo0[i] : f11796OooOOOo[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f11804OooO0OO ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.OooO00o(sb.toString(), null);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        this.f11805OooO0Oo = 0L;
        this.f11807OooO0o0 = 0;
        this.f11806OooO0o = 0;
        if (j != 0) {
            o00OO0OO o00oo0oo = this.f11813OooOOO;
            if (o00oo0oo instanceof o00O00OO) {
                o00O00OO o00o00oo2 = (o00O00OO) o00oo0oo;
                this.f11811OooOO0O = ((Math.max(0L, j - o00o00oo2.f39523OooO0O0) * 8) * AnimationKt.MillisToNanos) / ((long) o00o00oo2.f39527OooO0o0);
                return;
            }
        }
        this.f11811OooOO0O = 0L;
    }

    public final boolean OooO0OO(o00O00o0 o00o00o1) throws IOException {
        o00o00o1.f39533OooO0o = 0;
        byte[] bArr = f11797OooOOo;
        byte[] bArr2 = new byte[bArr.length];
        o00o00o1.OooO0Oo(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f11804OooO0OO = false;
            o00o00o1.OooOO0(bArr.length);
            return true;
        }
        o00o00o1.f39533OooO0o = 0;
        byte[] bArr3 = f11799OooOOoo;
        byte[] bArr4 = new byte[bArr3.length];
        o00o00o1.OooO0Oo(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f11804OooO0OO = true;
        o00o00o1.OooOO0(bArr3.length);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        return OooO0OO((o00O00o0) o00o0o01);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException {
        int i;
        int i2;
        int iOooO00o;
        int i3;
        o00O000o.OooO0o0(this.f11814OooOOO0);
        int i4 = o0O00.f40595OooO00o;
        o00O00o0 o00o00o1 = (o00O00o0) o00o0o01;
        if (o00o00o1.f39532OooO0Oo == 0 && !OooO0OO(o00o00o1)) {
            throw ParserException.OooO00o("Could not find AMR header.", null);
        }
        if (!this.f11815OooOOOO) {
            this.f11815OooOOOO = true;
            boolean z = this.f11804OooO0OO;
            String str = z ? "audio/amr-wb" : "audio/3gpp";
            int i5 = z ? 16000 : 8000;
            TrackOutput trackOutput = this.f11814OooOOO0;
            OooOo.OooO00o oooO00o = new OooOo.OooO00o();
            oooO00o.f11244OooOO0O = str;
            oooO00o.f11245OooOO0o = f11800OooOo00;
            oooO00o.f11253OooOo = 1;
            oooO00o.f11259OooOoO0 = i5;
            trackOutput.OooO0OO(new OooOo(oooO00o));
        }
        if (this.f11806OooO0o == 0) {
            try {
                int iOooO00o2 = OooO00o((o00O00o0) o00o0o01);
                this.f11807OooO0o0 = iOooO00o2;
                this.f11806OooO0o = iOooO00o2;
                if (this.f11801OooO == -1) {
                    this.f11809OooO0oo = o00o00o1.f39532OooO0Oo;
                    this.f11801OooO = iOooO00o2;
                }
                if (this.f11801OooO == iOooO00o2) {
                    this.f11810OooOO0++;
                }
                iOooO00o = this.f11814OooOOO0.OooO00o(o00o0o01, this.f11806OooO0o, true);
                if (iOooO00o == -1) {
                    i = -1;
                } else {
                    i3 = this.f11806OooO0o - iOooO00o;
                    this.f11806OooO0o = i3;
                    if (i3 <= 0) {
                        this.f11814OooOOO0.OooO0o0(this.f11811OooOO0O + this.f11805OooO0Oo, 1, this.f11807OooO0o0, 0, null);
                        this.f11805OooO0Oo += 20000;
                    }
                    i = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iOooO00o = this.f11814OooOOO0.OooO00o(o00o0o01, this.f11806OooO0o, true);
            if (iOooO00o == -1) {
                i = -1;
            } else {
                i3 = this.f11806OooO0o - iOooO00o;
                this.f11806OooO0o = i3;
                if (i3 <= 0) {
                    this.f11814OooOOO0.OooO0o0(this.f11811OooOO0O + this.f11805OooO0Oo, 1, this.f11807OooO0o0, 0, null);
                    this.f11805OooO0Oo += 20000;
                }
                i = 0;
            }
        }
        long j = o00o00o1.f39531OooO0OO;
        if (!this.f11808OooO0oO) {
            int i6 = this.f11803OooO0O0;
            if ((i6 & 1) == 0 || j == -1 || !((i2 = this.f11801OooO) == -1 || i2 == this.f11807OooO0o0)) {
                o00OO0OO.OooO0O0 oooO0O0 = new o00OO0OO.OooO0O0(-9223372036854775807L);
                this.f11813OooOOO = oooO0O0;
                this.f11812OooOO0o.OooO0O0(oooO0O0);
                this.f11808OooO0oO = true;
            } else if (this.f11810OooOO0 >= 20 || i == -1) {
                o00O00OO o00o00oo2 = new o00O00OO((int) (((((long) i2) * 8) * AnimationKt.MillisToNanos) / 20000), i2, j, this.f11809OooO0oo, (i6 & 2) != 0);
                this.f11813OooOOO = o00o00oo2;
                this.f11812OooOO0o.OooO0O0(o00o00oo2);
                this.f11808OooO0oO = true;
            }
        }
        return i;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        this.f11812OooOO0o = o00o0o0;
        this.f11814OooOOO0 = o00o0o0.OooOOO(0, 1);
        o00o0o0.OooO00o();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
