package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import org.conscrypt.PSKKeyManager;
import p080o000OoO.o00;
import p080o000OoO.o000;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0O0 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f8902OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000 f8903OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O000 f8904OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f8905OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f8906OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f8907OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public TrackOutput f8908OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f8909OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f8910OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public androidx.media3.common.OooOO0 f8911OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f8912OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f8913OooOO0o;

    public OooO0O0(@Nullable String str) {
        o000 o000Var = new o000(new byte[128], 128);
        this.f8903OooO00o = o000Var;
        this.f8904OooO0O0 = new o000O000(o000Var.f34922OooO00o);
        this.f8907OooO0o = 0;
        this.f8913OooOO0o = -9223372036854775807L;
        this.f8905OooO0OO = str;
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0O0() {
        this.f8907OooO0o = 0;
        this.f8909OooO0oO = 0;
        this.f8910OooO0oo = false;
        this.f8913OooOO0o = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0208  */
    /* JADX WARN: Code duplicated, block: B:149:0x024d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0OO(o000O000 o000o001) {
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
        p080o000OoO.o00Oo0.OooO0o(this.f8908OooO0o0);
        while (true) {
            int i17 = o000o001.f34964OooO0OO - o000o001.f34963OooO0O0;
            if (i17 <= 0) {
                return;
            }
            int i18 = this.f8907OooO0o;
            o000O000 o000o002 = this.f8904OooO0O0;
            if (i18 == 0) {
                while (true) {
                    if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 <= 0) {
                        c = 0;
                        z = false;
                        break;
                    } else if (this.f8910OooO0oo) {
                        int iOooOo0O = o000o001.OooOo0O();
                        if (iOooOo0O == 119) {
                            c = 0;
                            this.f8910OooO0oo = false;
                            z = true;
                            break;
                        }
                        this.f8910OooO0oo = iOooOo0O == 11;
                    } else {
                        this.f8910OooO0oo = o000o001.OooOo0O() == 11;
                    }
                }
                if (z) {
                    this.f8907OooO0o = 1;
                    byte[] bArr = o000o002.f34962OooO00o;
                    bArr[c] = 11;
                    bArr[1] = 119;
                    this.f8909OooO0oO = 2;
                }
            } else if (i18 == 1) {
                byte[] bArr2 = o000o002.f34962OooO00o;
                int iMin = Math.min(i17, 128 - this.f8909OooO0oO);
                o000o001.OooO0Oo(this.f8909OooO0oO, iMin, bArr2);
                int i19 = this.f8909OooO0oO + iMin;
                this.f8909OooO0oO = i19;
                if ((i19 == 128) != false) {
                    o000 o000Var = this.f8903OooO00o;
                    o000Var.OooOO0O(0);
                    int iOooO0o0 = o000Var.OooO0o0();
                    o000Var.OooOOO0(40);
                    Object[] objArr = o000Var.OooO0oO(5) > 10;
                    o000Var.OooOO0O(iOooO0o0);
                    int[] iArr = o000OOoO.OooO00o.f34629OooO0Oo;
                    int[] iArr2 = o000OOoO.OooO00o.f34627OooO0O0;
                    if (objArr == true) {
                        o000Var.OooOOO0(16);
                        int iOooO0oO = o000Var.OooO0oO(2);
                        if (iOooO0oO == 0) {
                            b = 0;
                        } else if (iOooO0oO != 1) {
                            b = iOooO0oO != 2 ? (byte) -1 : (byte) 2;
                        } else {
                            b = 1;
                        }
                        o000Var.OooOOO0(3);
                        iOooO00o = (o000Var.OooO0oO(11) + 1) * 2;
                        int iOooO0oO2 = o000Var.OooO0oO(2);
                        if (iOooO0oO2 == 3) {
                            i4 = o000OOoO.OooO00o.f34628OooO0OO[o000Var.OooO0oO(2)];
                            i6 = 3;
                            i7 = 6;
                        } else {
                            int iOooO0oO3 = o000Var.OooO0oO(2);
                            int i20 = o000OOoO.OooO00o.f34626OooO00o[iOooO0oO3];
                            i4 = iArr2[iOooO0oO2];
                            i6 = iOooO0oO3;
                            i7 = i20;
                        }
                        i5 = i7 * PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        int i21 = (iOooO00o * i4) / (i7 * 32);
                        int iOooO0oO4 = o000Var.OooO0oO(3);
                        boolean zOooO0o = o000Var.OooO0o();
                        i3 = iArr[iOooO0oO4] + (zOooO0o ? 1 : 0);
                        o000Var.OooOOO0(10);
                        if (o000Var.OooO0o()) {
                            o000Var.OooOOO0(8);
                        }
                        if (iOooO0oO4 == 0) {
                            o000Var.OooOOO0(5);
                            if (o000Var.OooO0o()) {
                                o000Var.OooOOO0(8);
                            }
                        }
                        if (b == 1 && o000Var.OooO0o()) {
                            o000Var.OooOOO0(16);
                        }
                        if (o000Var.OooO0o()) {
                            if (iOooO0oO4 > 2) {
                                o000Var.OooOOO0(2);
                            }
                            if ((iOooO0oO4 & 1) == 0 || iOooO0oO4 <= 2) {
                                i12 = 6;
                            } else {
                                i12 = 6;
                                o000Var.OooOOO0(6);
                            }
                            if ((iOooO0oO4 & 4) != 0) {
                                o000Var.OooOOO0(i12);
                            }
                            if (zOooO0o && o000Var.OooO0o()) {
                                o000Var.OooOOO0(5);
                            }
                            if (b != 0) {
                                i8 = i6;
                            } else {
                                if (o000Var.OooO0o()) {
                                    i13 = 6;
                                    o000Var.OooOOO0(6);
                                } else {
                                    i13 = 6;
                                }
                                if (iOooO0oO4 == 0 && o000Var.OooO0o()) {
                                    o000Var.OooOOO0(i13);
                                }
                                if (o000Var.OooO0o()) {
                                    o000Var.OooOOO0(i13);
                                }
                                int iOooO0oO5 = o000Var.OooO0oO(2);
                                if (iOooO0oO5 == 1) {
                                    o000Var.OooOOO0(5);
                                    i15 = 2;
                                } else {
                                    if (iOooO0oO5 == 2) {
                                        o000Var.OooOOO0(12);
                                    } else if (iOooO0oO5 == 3) {
                                        int iOooO0oO6 = o000Var.OooO0oO(5);
                                        if (o000Var.OooO0o()) {
                                            o000Var.OooOOO0(5);
                                            if (o000Var.OooO0o()) {
                                                i16 = 4;
                                                o000Var.OooOOO0(4);
                                            } else {
                                                i16 = 4;
                                            }
                                            if (o000Var.OooO0o()) {
                                                o000Var.OooOOO0(i16);
                                            }
                                            if (o000Var.OooO0o()) {
                                                o000Var.OooOOO0(i16);
                                            }
                                            if (o000Var.OooO0o()) {
                                                o000Var.OooOOO0(i16);
                                            }
                                            if (o000Var.OooO0o()) {
                                                o000Var.OooOOO0(i16);
                                            }
                                            if (o000Var.OooO0o()) {
                                                o000Var.OooOOO0(i16);
                                            }
                                            if (o000Var.OooO0o()) {
                                                o000Var.OooOOO0(i16);
                                            }
                                            if (o000Var.OooO0o()) {
                                                if (o000Var.OooO0o()) {
                                                    o000Var.OooOOO0(i16);
                                                }
                                                if (o000Var.OooO0o()) {
                                                    o000Var.OooOOO0(i16);
                                                }
                                            }
                                        }
                                        if (o000Var.OooO0o()) {
                                            o000Var.OooOOO0(5);
                                            if (o000Var.OooO0o()) {
                                                o000Var.OooOOO0(7);
                                                if (o000Var.OooO0o()) {
                                                    i14 = 8;
                                                    o000Var.OooOOO0(8);
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
                                        o000Var.OooOOO0((iOooO0oO6 + 2) * i14);
                                        o000Var.OooO0OO();
                                    }
                                    i15 = 2;
                                }
                                if (iOooO0oO4 < i15) {
                                    if (o000Var.OooO0o()) {
                                        o000Var.OooOOO0(14);
                                    }
                                    if (iOooO0oO4 == 0 && o000Var.OooO0o()) {
                                        o000Var.OooOOO0(14);
                                    }
                                }
                                if (o000Var.OooO0o()) {
                                    i8 = i6;
                                    if (i8 == 0) {
                                        o000Var.OooOOO0(5);
                                    } else {
                                        int i22 = 5;
                                        int i23 = 0;
                                        while (i23 < i7) {
                                            if (o000Var.OooO0o()) {
                                                o000Var.OooOOO0(i22);
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
                        if (o000Var.OooO0o()) {
                            o000Var.OooOOO0(5);
                            if (iOooO0oO4 == 2) {
                                o000Var.OooOOO0(4);
                            }
                            if (iOooO0oO4 >= 6) {
                                o000Var.OooOOO0(2);
                            }
                            if (o000Var.OooO0o()) {
                                i11 = 8;
                                o000Var.OooOOO0(8);
                            } else {
                                i11 = 8;
                            }
                            if (iOooO0oO4 == 0 && o000Var.OooO0o()) {
                                o000Var.OooOOO0(i11);
                            }
                            i9 = 3;
                            if (iOooO0oO2 < 3) {
                                o000Var.OooOO0o();
                            }
                        } else {
                            i9 = 3;
                        }
                        if (b == 0 && i8 != i9) {
                            o000Var.OooOO0o();
                        }
                        if (b == 2 && (i8 == i9 || o000Var.OooO0o())) {
                            i10 = 6;
                            o000Var.OooOOO0(6);
                        } else {
                            i10 = 6;
                        }
                        str = (o000Var.OooO0o() && o000Var.OooO0oO(i10) == 1 && o000Var.OooO0oO(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                        i = i21;
                    } else {
                        o000Var.OooOOO0(32);
                        int iOooO0oO7 = o000Var.OooO0oO(2);
                        String str2 = iOooO0oO7 == 3 ? null : "audio/ac3";
                        int iOooO0oO8 = o000Var.OooO0oO(6);
                        i = o000OOoO.OooO00o.f34631OooO0o0[iOooO0oO8 / 2] * 1000;
                        iOooO00o = o000OOoO.OooO00o.OooO00o(iOooO0oO7, iOooO0oO8);
                        o000Var.OooOOO0(8);
                        int iOooO0oO9 = o000Var.OooO0oO(3);
                        if ((iOooO0oO9 & 1) == 0 || iOooO0oO9 == 1) {
                            i2 = 2;
                        } else {
                            i2 = 2;
                            o000Var.OooOOO0(2);
                        }
                        if ((iOooO0oO9 & 4) != 0) {
                            o000Var.OooOOO0(i2);
                        }
                        if (iOooO0oO9 == i2) {
                            o000Var.OooOOO0(i2);
                        }
                        int i24 = iOooO0oO7 < 3 ? iArr2[iOooO0oO7] : -1;
                        i3 = iArr[iOooO0oO9] + (o000Var.OooO0o() ? 1 : 0);
                        i4 = i24;
                        String str3 = str2;
                        i5 = 1536;
                        str = str3;
                    }
                    androidx.media3.common.OooOO0 oooOO1 = this.f8911OooOO0;
                    if (oooOO1 == null || i3 != oooOO1.f6426OooOoo0 || i4 != oooOO1.f6425OooOoo || !o00.OooO00o(str, oooOO1.f6412OooOOOO)) {
                        androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o();
                        oooO00o.f6436OooO00o = this.f8906OooO0Oo;
                        oooO00o.f6445OooOO0O = str;
                        oooO00o.f6454OooOo = i3;
                        oooO00o.f6460OooOoO0 = i4;
                        oooO00o.f6438OooO0OO = this.f8905OooO0OO;
                        oooO00o.f6442OooO0oO = i;
                        if ("audio/ac3".equals(str)) {
                            oooO00o.f6440OooO0o = i;
                        }
                        androidx.media3.common.OooOO0 oooOO2 = new androidx.media3.common.OooOO0(oooO00o);
                        this.f8911OooOO0 = oooOO2;
                        this.f8908OooO0o0.OooO0O0(oooOO2);
                    }
                    this.f8912OooOO0O = iOooO00o;
                    this.f8902OooO = (((long) i5) * AnimationKt.MillisToNanos) / ((long) this.f8911OooOO0.f6425OooOoo);
                    o000o002.Oooo00O(0);
                    this.f8908OooO0o0.OooO0OO(128, o000o002);
                    this.f8907OooO0o = 2;
                }
            } else if (i18 == 2) {
                int iMin2 = Math.min(i17, this.f8912OooOO0O - this.f8909OooO0oO);
                this.f8908OooO0o0.OooO0OO(iMin2, o000o001);
                int i25 = this.f8909OooO0oO + iMin2;
                this.f8909OooO0oO = i25;
                int i26 = this.f8912OooOO0O;
                if (i25 == i26) {
                    long j = this.f8913OooOO0o;
                    if (j != -9223372036854775807L) {
                        this.f8908OooO0o0.OooO0o0(j, 1, i26, 0, null);
                        this.f8913OooOO0o += this.f8902OooO;
                    }
                    this.f8907OooO0o = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0Oo() {
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o(o000OOoO.Oooo0 oooo0, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        this.f8906OooO0Oo = oooO0o.f9130OooO0o0;
        oooO0o.OooO0O0();
        this.f8908OooO0o0 = oooo0.OooOOOO(oooO0o.f9129OooO0Oo, 1);
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o0(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f8913OooOO0o = j;
        }
    }
}
