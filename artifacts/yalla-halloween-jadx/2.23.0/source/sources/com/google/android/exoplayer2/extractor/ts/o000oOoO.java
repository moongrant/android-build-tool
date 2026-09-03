package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.extractor.TrackOutput;
import kotlin.UByte;
import p205o00o0oO0.o00oOoo;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000oOoO implements OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f12364OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo00 f12365OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00oOoo.OooO00o f12366OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f12367OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TrackOutput f12368OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f12369OooO0o = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f12370OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f12371OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f12372OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f12373OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f12374OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f12375OooOO0o;

    public o000oOoO(@Nullable String str) {
        o00Oo00 o00oo00 = new o00Oo00(4);
        this.f12365OooO00o = o00oo00;
        o00oo00.f40591OooO00o[0] = -1;
        this.f12366OooO0O0 = new o00oOoo.OooO00o();
        this.f12375OooOO0o = -9223372036854775807L;
        this.f12367OooO0OO = str;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0(o00Oo00 o00oo00) {
        o00O000o.OooO0o0(this.f12368OooO0Oo);
        while (true) {
            int i = o00oo00.f40593OooO0OO;
            int i2 = o00oo00.f40592OooO0O0;
            int i3 = i - i2;
            if (i3 <= 0) {
                return;
            }
            int i4 = this.f12369OooO0o;
            o00Oo00 o00oo01 = this.f12365OooO00o;
            if (i4 == 0) {
                byte[] bArr = o00oo00.f40591OooO00o;
                while (true) {
                    if (i2 >= i) {
                        o00oo00.Oooo00O(i);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & UByte.MAX_VALUE) == 255;
                    boolean z2 = this.f12364OooO && (b & 224) == 224;
                    this.f12364OooO = z;
                    if (z2) {
                        o00oo00.Oooo00O(i2 + 1);
                        this.f12364OooO = false;
                        o00oo01.f40591OooO00o[1] = bArr[i2];
                        this.f12371OooO0oO = 2;
                        this.f12369OooO0o = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i4 == 1) {
                int iMin = Math.min(i3, 4 - this.f12371OooO0oO);
                o00oo00.OooO0Oo(this.f12371OooO0oO, iMin, o00oo01.f40591OooO00o);
                int i5 = this.f12371OooO0oO + iMin;
                this.f12371OooO0oO = i5;
                if (i5 >= 4) {
                    o00oo01.Oooo00O(0);
                    int iOooO0o = o00oo01.OooO0o();
                    o00oOoo.OooO00o oooO00o = this.f12366OooO0O0;
                    if (oooO00o.OooO00o(iOooO0o)) {
                        this.f12374OooOO0O = oooO00o.f39390OooO0OO;
                        if (!this.f12372OooO0oo) {
                            long j = ((long) oooO00o.f39394OooO0oO) * AnimationKt.MillisToNanos;
                            int i6 = oooO00o.f39391OooO0Oo;
                            this.f12373OooOO0 = j / ((long) i6);
                            com.google.android.exoplayer2.OooOo.OooO00o oooO00o2 = new com.google.android.exoplayer2.OooOo.OooO00o();
                            oooO00o2.f11235OooO00o = this.f12370OooO0o0;
                            oooO00o2.f11244OooOO0O = oooO00o.f39389OooO0O0;
                            oooO00o2.f11245OooOO0o = 4096;
                            oooO00o2.f11253OooOo = oooO00o.f39393OooO0o0;
                            oooO00o2.f11259OooOoO0 = i6;
                            oooO00o2.f11237OooO0OO = this.f12367OooO0OO;
                            this.f12368OooO0Oo.OooO0OO(new com.google.android.exoplayer2.OooOo(oooO00o2));
                            this.f12372OooO0oo = true;
                        }
                        o00oo01.Oooo00O(0);
                        this.f12368OooO0Oo.OooO0O0(4, o00oo01);
                        this.f12369OooO0o = 2;
                    } else {
                        this.f12371OooO0oO = 0;
                        this.f12369OooO0o = 1;
                    }
                }
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(i3, this.f12374OooOO0O - this.f12371OooO0oO);
                this.f12368OooO0Oo.OooO0O0(iMin2, o00oo00);
                int i7 = this.f12371OooO0oO + iMin2;
                this.f12371OooO0oO = i7;
                int i8 = this.f12374OooOO0O;
                if (i7 >= i8) {
                    long j2 = this.f12375OooOO0o;
                    if (j2 != -9223372036854775807L) {
                        this.f12368OooO0Oo.OooO0o0(j2, 1, i8, 0, null);
                        this.f12375OooOO0o += this.f12373OooOO0;
                    }
                    this.f12371OooO0oO = 0;
                    this.f12369OooO0o = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
        this.f12369OooO0o = 0;
        this.f12371OooO0oO = 0;
        this.f12364OooO = false;
        this.f12375OooOO0o = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        this.f12370OooO0o0 = oooO0o.f12363OooO0o0;
        oooO0o.OooO0O0();
        this.f12368OooO0Oo = o00o0o0.OooOOO(oooO0o.f12362OooO0Oo, 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f12375OooOO0o = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0() {
    }
}
