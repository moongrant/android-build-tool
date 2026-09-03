package com.google.android.exoplayer2.extractor.amr;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import p265o00ooo00.Oooo0;
import p296o0O0OoO0.OooOo;
import p296o0O0OoO0.o000oOoO;
import p296o0O0OoO0.o0OO00O;
import p296o0O0OoO0.o0OoOo0;
import p296o0O0OoO0.oo0o0Oo;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class AmrExtractor implements Extractor {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final int[] f13739OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final int[] f13740OooOOO0 = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final byte[] f13741OooOOOO = o000OOo0.OooOoO0("#!AMR\n");

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final byte[] f13742OooOOOo = o000OOo0.OooOoO0("#!AMR-WB\n");

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final int f13743OooOOo0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o0OoOo0 f13744OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f13745OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f13746OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f13747OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f13748OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f13749OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f13750OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f13751OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f13752OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TrackOutput f13753OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public oo0o0Oo.OooO0O0 f13754OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f13755OooOO0o;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f13739OooOOO = iArr;
        f13743OooOOo0 = iArr[8];
    }

    public AmrExtractor() {
        this.f13745OooO00o = new byte[1];
        this.f13751OooO0oO = -1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO(o0OoOo0 o0oooo1) {
        this.f13744OooO = o0oooo1;
        this.f13753OooOO0 = o0oooo1.OooO00o(0);
        o0oooo1.OooOOO0();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003b  */
    public final int OooO00o(o000oOoO o000oooo2) throws IOException {
        o000oooo2.OooO();
        boolean z = false;
        o000oooo2.OooOOO0(this.f13745OooO00o, 0, 1);
        byte b = this.f13745OooO00o[0];
        if ((b & 131) > 0) {
            throw new ParserException(Oooo0.OooO00o(42, "Invalid padding bits for frame header ", b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15) {
            boolean z2 = this.f13746OooO0O0;
            if (z2 && (i < 10 || i > 13)) {
                z = true;
            } else {
                if (!z2 && (i < 12 || i > 14)) {
                    z = true;
                }
            }
        }
        if (z) {
            return this.f13746OooO0O0 ? f13739OooOOO[i] : f13740OooOOO0[i];
        }
        String str = this.f13746OooO0O0 ? "WB" : "NB";
        StringBuilder sb = new StringBuilder(str.length() + 35);
        sb.append("Illegal AMR ");
        sb.append(str);
        sb.append(" frame type ");
        sb.append(i);
        throw new ParserException(sb.toString());
    }

    public final boolean OooO0O0(o000oOoO o000oooo2) throws IOException {
        byte[] bArr = f13741OooOOOO;
        o000oooo2.OooO();
        byte[] bArr2 = new byte[bArr.length];
        o000oooo2.OooOOO0(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f13746OooO0O0 = false;
            o000oooo2.OooOO0(bArr.length);
            return true;
        }
        byte[] bArr3 = f13742OooOOOo;
        o000oooo2.OooO();
        byte[] bArr4 = new byte[bArr3.length];
        o000oooo2.OooOOO0(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f13746OooO0O0 = true;
        o000oooo2.OooOO0(bArr3.length);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0Oo(long j, long j2) {
        this.f13747OooO0OO = 0L;
        this.f13748OooO0Oo = 0;
        this.f13750OooO0o0 = 0;
        if (j != 0) {
            Object obj = this.f13754OooOO0O;
            if (obj instanceof OooOo) {
                this.f13752OooO0oo = ((OooOo) obj).OooO0Oo(j);
                return;
            }
        }
        this.f13752OooO0oo = 0L;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0o(o000oOoO o000oooo2) throws IOException {
        return OooO0O0(o000oooo2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0o0(o000oOoO o000oooo2, o0OO00O o0oo00o2) throws IOException {
        int iOooO0O0;
        int i;
        o00000O0.OooO0o(this.f13753OooOO0);
        int i2 = o000OOo0.f36740OooO00o;
        if (o000oooo2.getPosition() == 0 && !OooO0O0(o000oooo2)) {
            throw new ParserException("Could not find AMR header.");
        }
        if (!this.f13755OooOO0o) {
            this.f13755OooOO0o = true;
            boolean z = this.f13746OooO0O0;
            String str = z ? "audio/amr-wb" : "audio/3gpp";
            int i3 = z ? 16000 : 8000;
            TrackOutput trackOutput = this.f13753OooOO0;
            Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
            oooO0O0.f13163OooOO0O = str;
            oooO0O0.f13164OooOO0o = f13743OooOOo0;
            oooO0O0.f13172OooOo = 1;
            oooO0O0.f13178OooOoO0 = i3;
            trackOutput.OooO0o0(new Format(oooO0O0));
        }
        int i4 = -1;
        if (this.f13750OooO0o0 == 0) {
            try {
                int iOooO00o = OooO00o(o000oooo2);
                this.f13748OooO0Oo = iOooO00o;
                this.f13750OooO0o0 = iOooO00o;
                if (this.f13751OooO0oO == -1) {
                    o000oooo2.getPosition();
                    this.f13751OooO0oO = this.f13748OooO0Oo;
                }
                iOooO0O0 = this.f13753OooOO0.OooO0O0(o000oooo2, this.f13750OooO0o0, true);
                if (iOooO0O0 != -1) {
                    i = this.f13750OooO0o0 - iOooO0O0;
                    this.f13750OooO0o0 = i;
                    if (i <= 0) {
                        this.f13753OooOO0.OooO0Oo(this.f13752OooO0oo + this.f13747OooO0OO, 1, this.f13748OooO0Oo, 0, null);
                        this.f13747OooO0OO += 20000;
                    }
                    i4 = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iOooO0O0 = this.f13753OooOO0.OooO0O0(o000oooo2, this.f13750OooO0o0, true);
            if (iOooO0O0 != -1) {
                i = this.f13750OooO0o0 - iOooO0O0;
                this.f13750OooO0o0 = i;
                if (i <= 0) {
                    this.f13753OooOO0.OooO0Oo(this.f13752OooO0oo + this.f13747OooO0OO, 1, this.f13748OooO0Oo, 0, null);
                    this.f13747OooO0OO += 20000;
                }
                i4 = 0;
            }
        }
        o000oooo2.OooO00o();
        if (!this.f13749OooO0o) {
            oo0o0Oo.OooO0O0 oooO0O1 = new oo0o0Oo.OooO0O0(-9223372036854775807L);
            this.f13754OooOO0O = oooO0O1;
            this.f13744OooO.OooOO0O(oooO0O1);
            this.f13749OooO0o = true;
        }
        return i4;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    public AmrExtractor(int i) {
        this.f13745OooO00o = new byte[1];
        this.f13751OooO0oO = -1;
    }
}
