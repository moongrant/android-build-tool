package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.extractor.TrackOutput;
import p205o00o0oO0.o00000O0;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0o implements OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f12150OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00OOOOo f12151OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo00 f12152OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f12153OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f12154OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f12155OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public TrackOutput f12156OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f12157OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f12158OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f12159OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public com.google.android.exoplayer2.OooOo f12160OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f12161OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f12162OooOOO0;

    public OooO0o(@Nullable String str) {
        o00OOOOo o00ooooo2 = new o00OOOOo(new byte[16], 16);
        this.f12151OooO00o = o00ooooo2;
        this.f12152OooO0O0 = new o00Oo00(o00ooooo2.f40584OooO00o);
        this.f12155OooO0o = 0;
        this.f12157OooO0oO = 0;
        this.f12158OooO0oo = false;
        this.f12150OooO = false;
        this.f12162OooOOO0 = -9223372036854775807L;
        this.f12153OooO0OO = str;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0(o00Oo00 o00oo00) {
        boolean z;
        o00O000o.OooO0o0(this.f12156OooO0o0);
        while (true) {
            int i = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
            if (i <= 0) {
                return;
            }
            int i2 = this.f12155OooO0o;
            o00Oo00 o00oo01 = this.f12152OooO0O0;
            if (i2 == 0) {
                while (true) {
                    if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 <= 0) {
                        z = false;
                        break;
                    }
                    if (this.f12158OooO0oo) {
                        int iOooOo0O = o00oo00.OooOo0O();
                        this.f12158OooO0oo = iOooOo0O == 172;
                        if (iOooOo0O == 64 || iOooOo0O == 65) {
                            this.f12150OooO = iOooOo0O == 65;
                            z = true;
                            break;
                        }
                    } else {
                        this.f12158OooO0oo = o00oo00.OooOo0O() == 172;
                    }
                }
                if (z) {
                    this.f12155OooO0o = 1;
                    byte[] bArr = o00oo01.f40591OooO00o;
                    bArr[0] = -84;
                    bArr[1] = (byte) (this.f12150OooO ? 65 : 64);
                    this.f12157OooO0oO = 2;
                }
            } else if (i2 == 1) {
                byte[] bArr2 = o00oo01.f40591OooO00o;
                int iMin = Math.min(i, 16 - this.f12157OooO0oO);
                o00oo00.OooO0Oo(this.f12157OooO0oO, iMin, bArr2);
                int i3 = this.f12157OooO0oO + iMin;
                this.f12157OooO0oO = i3;
                if (i3 == 16) {
                    o00OOOOo o00ooooo2 = this.f12151OooO00o;
                    o00ooooo2.OooOO0O(0);
                    o00000O0.OooO00o oooO00oOooO0O0 = o00000O0.OooO0O0(o00ooooo2);
                    com.google.android.exoplayer2.OooOo oooOo = this.f12160OooOO0O;
                    int i4 = oooO00oOooO0O0.f39325OooO00o;
                    if (oooOo == null || 2 != oooOo.f11225OooOoo0 || i4 != oooOo.f11224OooOoo || !"audio/ac4".equals(oooOo.f11211OooOOOO)) {
                        com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
                        oooO00o.f11235OooO00o = this.f12154OooO0Oo;
                        oooO00o.f11244OooOO0O = "audio/ac4";
                        oooO00o.f11253OooOo = 2;
                        oooO00o.f11259OooOoO0 = i4;
                        oooO00o.f11237OooO0OO = this.f12153OooO0OO;
                        com.google.android.exoplayer2.OooOo oooOo2 = new com.google.android.exoplayer2.OooOo(oooO00o);
                        this.f12160OooOO0O = oooOo2;
                        this.f12156OooO0o0.OooO0OO(oooOo2);
                    }
                    this.f12161OooOO0o = oooO00oOooO0O0.f39326OooO0O0;
                    this.f12159OooOO0 = (((long) oooO00oOooO0O0.f39327OooO0OO) * AnimationKt.MillisToNanos) / ((long) this.f12160OooOO0O.f11224OooOoo);
                    o00oo01.Oooo00O(0);
                    this.f12156OooO0o0.OooO0O0(16, o00oo01);
                    this.f12155OooO0o = 2;
                }
            } else if (i2 == 2) {
                int iMin2 = Math.min(i, this.f12161OooOO0o - this.f12157OooO0oO);
                this.f12156OooO0o0.OooO0O0(iMin2, o00oo00);
                int i5 = this.f12157OooO0oO + iMin2;
                this.f12157OooO0oO = i5;
                int i6 = this.f12161OooOO0o;
                if (i5 == i6) {
                    long j = this.f12162OooOOO0;
                    if (j != -9223372036854775807L) {
                        this.f12156OooO0o0.OooO0o0(j, 1, i6, 0, null);
                        this.f12162OooOOO0 += this.f12159OooOO0;
                    }
                    this.f12155OooO0o = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
        this.f12155OooO0o = 0;
        this.f12157OooO0oO = 0;
        this.f12158OooO0oo = false;
        this.f12150OooO = false;
        this.f12162OooOOO0 = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        this.f12154OooO0Oo = oooO0o.f12363OooO0o0;
        oooO0o.OooO0O0();
        this.f12156OooO0o0 = o00o0o0.OooOOO(oooO0o.f12362OooO0Oo, 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f12162OooOOO0 = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0() {
    }
}
