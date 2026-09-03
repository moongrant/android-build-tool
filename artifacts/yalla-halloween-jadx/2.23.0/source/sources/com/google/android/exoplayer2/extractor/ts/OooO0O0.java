package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.extractor.TrackOutput;
import org.conscrypt.PSKKeyManager;
import p205o00o0oO0.o00000;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0O0 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f12135OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00OOOOo f12136OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo00 f12137OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f12138OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f12139OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f12140OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public TrackOutput f12141OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f12142OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f12143OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public com.google.android.exoplayer2.OooOo f12144OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f12145OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f12146OooOO0o;

    public OooO0O0(@Nullable String str) {
        o00OOOOo o00ooooo2 = new o00OOOOo(new byte[128], 128);
        this.f12136OooO00o = o00ooooo2;
        this.f12137OooO0O0 = new o00Oo00(o00ooooo2.f40584OooO00o);
        this.f12140OooO0o = 0;
        this.f12146OooOO0o = -9223372036854775807L;
        this.f12138OooO0OO = str;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0208  */
    /* JADX WARN: Code duplicated, block: B:149:0x024d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0(o00Oo00 o00oo00) {
        int i;
        int iOooO00o;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        byte b;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char c;
        boolean z;
        o00O000o.OooO0o0(this.f12141OooO0o0);
        while (true) {
            int i17 = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
            if (i17 <= 0) {
                return;
            }
            int i18 = this.f12140OooO0o;
            o00Oo00 o00oo01 = this.f12137OooO0O0;
            if (i18 == 0) {
                while (true) {
                    if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 <= 0) {
                        c = 0;
                        z = false;
                        break;
                    } else if (this.f12143OooO0oo) {
                        int iOooOo0O = o00oo00.OooOo0O();
                        if (iOooOo0O == 119) {
                            c = 0;
                            this.f12143OooO0oo = false;
                            z = true;
                            break;
                        }
                        this.f12143OooO0oo = iOooOo0O == 11;
                    } else {
                        this.f12143OooO0oo = o00oo00.OooOo0O() == 11;
                    }
                }
                if (z) {
                    this.f12140OooO0o = 1;
                    byte[] bArr = o00oo01.f40591OooO00o;
                    bArr[c] = 11;
                    bArr[1] = 119;
                    this.f12142OooO0oO = 2;
                }
            } else if (i18 == 1) {
                byte[] bArr2 = o00oo01.f40591OooO00o;
                int iMin = Math.min(i17, 128 - this.f12142OooO0oO);
                o00oo00.OooO0Oo(this.f12142OooO0oO, iMin, bArr2);
                int i19 = this.f12142OooO0oO + iMin;
                this.f12142OooO0oO = i19;
                if ((i19 == 128) != false) {
                    o00OOOOo o00ooooo2 = this.f12136OooO00o;
                    o00ooooo2.OooOO0O(0);
                    int iOooO0o0 = o00ooooo2.OooO0o0();
                    o00ooooo2.OooOOO0(40);
                    Object[] objArr = o00ooooo2.OooO0oO(5) > 10;
                    o00ooooo2.OooOO0O(iOooO0o0);
                    int[] iArr = o00000.f39321OooO0Oo;
                    int[] iArr2 = o00000.f39319OooO0O0;
                    if (objArr == true) {
                        o00ooooo2.OooOOO0(16);
                        int iOooO0oO = o00ooooo2.OooO0oO(2);
                        if (iOooO0oO == 0) {
                            b = 0;
                        } else if (iOooO0oO != 1) {
                            b = iOooO0oO != 2 ? (byte) -1 : (byte) 2;
                        } else {
                            b = 1;
                        }
                        o00ooooo2.OooOOO0(3);
                        iOooO00o = (o00ooooo2.OooO0oO(11) + 1) * 2;
                        int iOooO0oO2 = o00ooooo2.OooO0oO(2);
                        if (iOooO0oO2 == 3) {
                            i4 = o00000.f39320OooO0OO[o00ooooo2.OooO0oO(2)];
                            i6 = 3;
                            i7 = 6;
                        } else {
                            int iOooO0oO3 = o00ooooo2.OooO0oO(2);
                            int i20 = o00000.f39318OooO00o[iOooO0oO3];
                            i4 = iArr2[iOooO0oO2];
                            i6 = iOooO0oO3;
                            i7 = i20;
                        }
                        i5 = i7 * PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        int i21 = (iOooO00o * i4) / (i7 * 32);
                        int iOooO0oO4 = o00ooooo2.OooO0oO(3);
                        boolean zOooO0o = o00ooooo2.OooO0o();
                        i3 = iArr[iOooO0oO4] + (zOooO0o ? 1 : 0);
                        o00ooooo2.OooOOO0(10);
                        if (o00ooooo2.OooO0o()) {
                            o00ooooo2.OooOOO0(8);
                        }
                        if (iOooO0oO4 == 0) {
                            o00ooooo2.OooOOO0(5);
                            if (o00ooooo2.OooO0o()) {
                                o00ooooo2.OooOOO0(8);
                            }
                        }
                        if (b == 1 && o00ooooo2.OooO0o()) {
                            o00ooooo2.OooOOO0(16);
                        }
                        if (o00ooooo2.OooO0o()) {
                            if (iOooO0oO4 > 2) {
                                o00ooooo2.OooOOO0(2);
                            }
                            if ((iOooO0oO4 & 1) == 0 || iOooO0oO4 <= 2) {
                                i12 = 6;
                            } else {
                                i12 = 6;
                                o00ooooo2.OooOOO0(6);
                            }
                            if ((iOooO0oO4 & 4) != 0) {
                                o00ooooo2.OooOOO0(i12);
                            }
                            if (zOooO0o && o00ooooo2.OooO0o()) {
                                o00ooooo2.OooOOO0(5);
                            }
                            if (b != 0) {
                                i8 = i6;
                            } else {
                                if (o00ooooo2.OooO0o()) {
                                    i13 = 6;
                                    o00ooooo2.OooOOO0(6);
                                } else {
                                    i13 = 6;
                                }
                                if (iOooO0oO4 == 0 && o00ooooo2.OooO0o()) {
                                    o00ooooo2.OooOOO0(i13);
                                }
                                if (o00ooooo2.OooO0o()) {
                                    o00ooooo2.OooOOO0(i13);
                                }
                                int iOooO0oO5 = o00ooooo2.OooO0oO(2);
                                if (iOooO0oO5 == 1) {
                                    o00ooooo2.OooOOO0(5);
                                    i15 = 2;
                                } else {
                                    if (iOooO0oO5 == 2) {
                                        o00ooooo2.OooOOO0(12);
                                    } else if (iOooO0oO5 == 3) {
                                        int iOooO0oO6 = o00ooooo2.OooO0oO(5);
                                        if (o00ooooo2.OooO0o()) {
                                            o00ooooo2.OooOOO0(5);
                                            if (o00ooooo2.OooO0o()) {
                                                i16 = 4;
                                                o00ooooo2.OooOOO0(4);
                                            } else {
                                                i16 = 4;
                                            }
                                            if (o00ooooo2.OooO0o()) {
                                                o00ooooo2.OooOOO0(i16);
                                            }
                                            if (o00ooooo2.OooO0o()) {
                                                o00ooooo2.OooOOO0(i16);
                                            }
                                            if (o00ooooo2.OooO0o()) {
                                                o00ooooo2.OooOOO0(i16);
                                            }
                                            if (o00ooooo2.OooO0o()) {
                                                o00ooooo2.OooOOO0(i16);
                                            }
                                            if (o00ooooo2.OooO0o()) {
                                                o00ooooo2.OooOOO0(i16);
                                            }
                                            if (o00ooooo2.OooO0o()) {
                                                o00ooooo2.OooOOO0(i16);
                                            }
                                            if (o00ooooo2.OooO0o()) {
                                                if (o00ooooo2.OooO0o()) {
                                                    o00ooooo2.OooOOO0(i16);
                                                }
                                                if (o00ooooo2.OooO0o()) {
                                                    o00ooooo2.OooOOO0(i16);
                                                }
                                            }
                                        }
                                        if (o00ooooo2.OooO0o()) {
                                            o00ooooo2.OooOOO0(5);
                                            if (o00ooooo2.OooO0o()) {
                                                o00ooooo2.OooOOO0(7);
                                                if (o00ooooo2.OooO0o()) {
                                                    i14 = 8;
                                                    o00ooooo2.OooOOO0(8);
                                                } else {
                                                    i14 = 8;
                                                }
                                            } else {
                                                i14 = 8;
                                            }
                                        } else {
                                            i14 = 8;
                                        }
                                        i15 = 2;
                                        o00ooooo2.OooOOO0((iOooO0oO6 + 2) * i14);
                                        o00ooooo2.OooO0OO();
                                    }
                                    i15 = 2;
                                }
                                if (iOooO0oO4 < i15) {
                                    if (o00ooooo2.OooO0o()) {
                                        o00ooooo2.OooOOO0(14);
                                    }
                                    if (iOooO0oO4 == 0 && o00ooooo2.OooO0o()) {
                                        o00ooooo2.OooOOO0(14);
                                    }
                                }
                                if (o00ooooo2.OooO0o()) {
                                    i8 = i6;
                                    if (i8 == 0) {
                                        o00ooooo2.OooOOO0(5);
                                    } else {
                                        int i22 = 5;
                                        int i23 = 0;
                                        while (i23 < i7) {
                                            if (o00ooooo2.OooO0o()) {
                                                o00ooooo2.OooOOO0(i22);
                                            }
                                            i23++;
                                            i22 = 5;
                                        }
                                    }
                                } else {
                                    i8 = i6;
                                }
                            }
                        } else {
                            i8 = i6;
                        }
                        if (o00ooooo2.OooO0o()) {
                            o00ooooo2.OooOOO0(5);
                            if (iOooO0oO4 == 2) {
                                o00ooooo2.OooOOO0(4);
                            }
                            if (iOooO0oO4 >= 6) {
                                o00ooooo2.OooOOO0(2);
                            }
                            if (o00ooooo2.OooO0o()) {
                                i11 = 8;
                                o00ooooo2.OooOOO0(8);
                            } else {
                                i11 = 8;
                            }
                            if (iOooO0oO4 == 0 && o00ooooo2.OooO0o()) {
                                o00ooooo2.OooOOO0(i11);
                            }
                            i9 = 3;
                            if (iOooO0oO2 < 3) {
                                o00ooooo2.OooOO0o();
                            }
                        } else {
                            i9 = 3;
                        }
                        if (b == 0 && i8 != i9) {
                            o00ooooo2.OooOO0o();
                        }
                        if (b == 2 && (i8 == i9 || o00ooooo2.OooO0o())) {
                            i10 = 6;
                            o00ooooo2.OooOOO0(6);
                        } else {
                            i10 = 6;
                        }
                        str = (o00ooooo2.OooO0o() && o00ooooo2.OooO0oO(i10) == 1 && o00ooooo2.OooO0oO(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                        i = i21;
                    } else {
                        o00ooooo2.OooOOO0(32);
                        int iOooO0oO7 = o00ooooo2.OooO0oO(2);
                        String str2 = iOooO0oO7 == 3 ? null : "audio/ac3";
                        int iOooO0oO8 = o00ooooo2.OooO0oO(6);
                        i = o00000.f39323OooO0o0[iOooO0oO8 / 2] * 1000;
                        iOooO00o = o00000.OooO00o(iOooO0oO7, iOooO0oO8);
                        o00ooooo2.OooOOO0(8);
                        int iOooO0oO9 = o00ooooo2.OooO0oO(3);
                        if ((iOooO0oO9 & 1) == 0 || iOooO0oO9 == 1) {
                            i2 = 2;
                        } else {
                            i2 = 2;
                            o00ooooo2.OooOOO0(2);
                        }
                        if ((iOooO0oO9 & 4) != 0) {
                            o00ooooo2.OooOOO0(i2);
                        }
                        if (iOooO0oO9 == i2) {
                            o00ooooo2.OooOOO0(i2);
                        }
                        int i24 = iOooO0oO7 < 3 ? iArr2[iOooO0oO7] : -1;
                        i3 = iArr[iOooO0oO9] + (o00ooooo2.OooO0o() ? 1 : 0);
                        i4 = i24;
                        String str3 = str2;
                        i5 = 1536;
                        str = str3;
                    }
                    com.google.android.exoplayer2.OooOo oooOo = this.f12144OooOO0;
                    if (oooOo == null || i3 != oooOo.f11225OooOoo0 || i4 != oooOo.f11224OooOoo || !o0O00.OooO00o(str, oooOo.f11211OooOOOO)) {
                        com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
                        oooO00o.f11235OooO00o = this.f12139OooO0Oo;
                        oooO00o.f11244OooOO0O = str;
                        oooO00o.f11253OooOo = i3;
                        oooO00o.f11259OooOoO0 = i4;
                        oooO00o.f11237OooO0OO = this.f12138OooO0OO;
                        oooO00o.f11241OooO0oO = i;
                        if ("audio/ac3".equals(str)) {
                            oooO00o.f11239OooO0o = i;
                        }
                        com.google.android.exoplayer2.OooOo oooOo2 = new com.google.android.exoplayer2.OooOo(oooO00o);
                        this.f12144OooOO0 = oooOo2;
                        this.f12141OooO0o0.OooO0OO(oooOo2);
                    }
                    this.f12145OooOO0O = iOooO00o;
                    this.f12135OooO = (((long) i5) * AnimationKt.MillisToNanos) / ((long) this.f12144OooOO0.f11224OooOoo);
                    o00oo01.Oooo00O(0);
                    this.f12141OooO0o0.OooO0O0(128, o00oo01);
                    this.f12140OooO0o = 2;
                }
            } else if (i18 == 2) {
                int iMin2 = Math.min(i17, this.f12145OooOO0O - this.f12142OooO0oO);
                this.f12141OooO0o0.OooO0O0(iMin2, o00oo00);
                int i25 = this.f12142OooO0oO + iMin2;
                this.f12142OooO0oO = i25;
                int i26 = this.f12145OooOO0O;
                if (i25 == i26) {
                    long j = this.f12146OooOO0o;
                    if (j != -9223372036854775807L) {
                        this.f12141OooO0o0.OooO0o0(j, 1, i26, 0, null);
                        this.f12146OooOO0o += this.f12135OooO;
                    }
                    this.f12140OooO0o = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
        this.f12140OooO0o = 0;
        this.f12142OooO0oO = 0;
        this.f12143OooO0oo = false;
        this.f12146OooOO0o = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        this.f12139OooO0Oo = oooO0o.f12363OooO0o0;
        oooO0o.OooO0O0();
        this.f12141OooO0o0 = o00o0o0.OooOOO(oooO0o.f12362OooO0Oo, 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f12146OooOO0o = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0() {
    }
}
