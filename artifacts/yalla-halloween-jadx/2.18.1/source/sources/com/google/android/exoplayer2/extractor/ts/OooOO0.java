package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.util.Arrays;
import kotlin.KotlinVersion;
import kotlin.UByte;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Format f14093OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f14095OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f14096OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TrackOutput f14097OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f14098OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f14100OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f14101OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f14102OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f14103OooOO0O;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000 f14094OooO00o = new o000(new byte[18]);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f14099OooO0o0 = 0;

    public OooOO0(@Nullable String str) {
        this.f14095OooO0O0 = str;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0207  */
    /* JADX WARN: Code duplicated, block: B:71:0x0215  */
    /* JADX WARN: Code duplicated, block: B:73:0x0218  */
    /* JADX WARN: Code duplicated, block: B:75:0x021c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0226  */
    /* JADX WARN: Code duplicated, block: B:77:0x0230  */
    /* JADX WARN: Code duplicated, block: B:79:0x023d  */
    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO00o(o000 o000Var) {
        int i;
        int i2;
        byte b;
        boolean z;
        int i3;
        byte b2;
        int i4;
        byte b3;
        int i5;
        byte b4;
        int i6;
        byte b5;
        o0000OO0 o0000oo1;
        int i7;
        int i8;
        boolean z2;
        o00000O0.OooO0o(this.f14097OooO0Oo);
        while (true) {
            int i9 = o000Var.f36663OooO0OO - o000Var.f36662OooO0O0;
            if (i9 <= 0) {
                return;
            }
            int i10 = this.f14099OooO0o0;
            int i11 = 8;
            int i12 = 2;
            if (i10 == 0) {
                while (true) {
                    if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 <= 0) {
                        z2 = false;
                        break;
                    }
                    int i13 = this.f14100OooO0oO << 8;
                    this.f14100OooO0oO = i13;
                    int iOooOOo0 = i13 | o000Var.OooOOo0();
                    this.f14100OooO0oO = iOooOOo0;
                    if (iOooOOo0 == 2147385345 || iOooOOo0 == -25230976 || iOooOOo0 == 536864768 || iOooOOo0 == -14745368) {
                        byte[] bArr = this.f14094OooO00o.f36661OooO00o;
                        bArr[0] = (byte) ((iOooOOo0 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                        bArr[1] = (byte) ((iOooOOo0 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                        bArr[2] = (byte) ((iOooOOo0 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        bArr[3] = (byte) (iOooOOo0 & KotlinVersion.MAX_COMPONENT_VALUE);
                        this.f14098OooO0o = 4;
                        this.f14100OooO0oO = 0;
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    this.f14099OooO0o0 = 1;
                }
            } else if (i10 == 1) {
                byte[] bArr2 = this.f14094OooO00o.f36661OooO00o;
                int iMin = Math.min(i9, 18 - this.f14098OooO0o);
                o000Var.OooO0OO(bArr2, this.f14098OooO0o, iMin);
                int i14 = this.f14098OooO0o + iMin;
                this.f14098OooO0o = i14;
                if (i14 == 18) {
                    byte[] bArr3 = this.f14094OooO00o.f36661OooO00o;
                    if (this.f14093OooO == null) {
                        String str = this.f14096OooO0OO;
                        String str2 = this.f14095OooO0O0;
                        if (bArr3[0] == 127) {
                            o0000oo1 = new o0000OO0(bArr3, bArr3.length);
                        } else {
                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
                            if (bArrCopyOf[0] == -2 || bArrCopyOf[0] == -1) {
                                for (int i15 = 0; i15 < bArrCopyOf.length - 1; i15 += 2) {
                                    byte b6 = bArrCopyOf[i15];
                                    int i16 = i15 + 1;
                                    bArrCopyOf[i15] = bArrCopyOf[i16];
                                    bArrCopyOf[i16] = b6;
                                }
                            }
                            o0000OO0 o0000oo2 = new o0000OO0(bArrCopyOf, bArrCopyOf.length);
                            if (bArrCopyOf[0] == 31) {
                                o0000OO0 o0000oo3 = new o0000OO0(bArrCopyOf, bArrCopyOf.length);
                                while (o0000oo3.OooO0O0() >= 16) {
                                    o0000oo3.OooOOO0(i12);
                                    int iOooO0oO = o0000oo3.OooO0oO(14) & 16383;
                                    int iMin2 = Math.min(8 - o0000oo2.f36702OooO0OO, 14);
                                    int i17 = o0000oo2.f36702OooO0OO;
                                    int i18 = (8 - i17) - iMin2;
                                    byte[] bArr4 = o0000oo2.f36700OooO00o;
                                    int i19 = o0000oo2.f36701OooO0O0;
                                    bArr4[i19] = (byte) (((65280 >> i17) | ((1 << i18) - 1)) & bArr4[i19]);
                                    int i20 = 14 - iMin2;
                                    bArr4[i19] = (byte) (((iOooO0oO >>> i20) << i18) | bArr4[i19]);
                                    int i21 = i19 + 1;
                                    while (i20 > i11) {
                                        i20 -= 8;
                                        o0000oo2.f36700OooO00o[i21] = (byte) (iOooO0oO >>> i20);
                                        i21++;
                                        i11 = 8;
                                    }
                                    int i22 = 8 - i20;
                                    byte[] bArr5 = o0000oo2.f36700OooO00o;
                                    bArr5[i21] = (byte) (bArr5[i21] & ((1 << i22) - 1));
                                    bArr5[i21] = (byte) (((((1 << i20) - 1) & iOooO0oO) << i22) | bArr5[i21]);
                                    o0000oo2.OooOOO0(14);
                                    o0000oo2.OooO00o();
                                    i11 = 8;
                                    i12 = 2;
                                }
                            }
                            o0000oo2.OooOO0(bArrCopyOf, bArrCopyOf.length);
                            o0000oo1 = o0000oo2;
                        }
                        o0000oo1.OooOOO0(60);
                        int i23 = p293o0O0Oo0O.o00oO0o.f35778OooO00o[o0000oo1.OooO0oO(6)];
                        int i24 = p293o0O0Oo0O.o00oO0o.f35779OooO0O0[o0000oo1.OooO0oO(4)];
                        int iOooO0oO2 = o0000oo1.OooO0oO(5);
                        int[] iArr = p293o0O0Oo0O.o00oO0o.f35780OooO0OO;
                        if (iOooO0oO2 >= 29) {
                            i8 = -1;
                            i7 = 2;
                        } else {
                            int i25 = iArr[iOooO0oO2] * 1000;
                            i7 = 2;
                            i8 = i25 / 2;
                        }
                        o0000oo1.OooOOO0(10);
                        int i26 = i23 + (o0000oo1.OooO0oO(i7) > 0 ? 1 : 0);
                        Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
                        oooO0O0.f13154OooO00o = str;
                        oooO0O0.f13163OooOO0O = "audio/vnd.dts";
                        oooO0O0.f13158OooO0o = i8;
                        oooO0O0.f13172OooOo = i26;
                        oooO0O0.f13178OooOoO0 = i24;
                        oooO0O0.f13165OooOOO = null;
                        oooO0O0.f13156OooO0OO = str2;
                        Format format = new Format(oooO0O0);
                        this.f14093OooO = format;
                        this.f14097OooO0Oo.OooO0o0(format);
                    }
                    byte b7 = bArr3[0];
                    if (b7 != -2) {
                        if (b7 == -1) {
                            i6 = ((3 & bArr3[7]) << 12) | ((bArr3[6] & UByte.MAX_VALUE) << 4);
                            b5 = bArr3[9];
                        } else if (b7 != 31) {
                            i = 4;
                            i2 = ((3 & bArr3[5]) << 12) | ((bArr3[6] & UByte.MAX_VALUE) << 4);
                            b = bArr3[7];
                        } else {
                            i6 = ((3 & bArr3[6]) << 12) | ((bArr3[7] & UByte.MAX_VALUE) << 4);
                            b5 = bArr3[8];
                        }
                        i3 = (i6 | ((b5 & 60) >> 2)) + 1;
                        z = true;
                        if (z) {
                            i3 = (i3 * 16) / 14;
                        }
                        this.f14102OooOO0 = i3;
                        b2 = bArr3[0];
                        if (b2 != -2) {
                            if (b2 != -1) {
                                int i27 = (bArr3[4] & 7) << 4;
                                b4 = bArr3[7];
                                i4 = i27;
                            } else if (b2 != 31) {
                                i4 = (bArr3[4] & 1) << 6;
                                b3 = bArr3[5];
                            } else {
                                i4 = (7 & bArr3[5]) << 4;
                                b4 = bArr3[6];
                            }
                            i5 = b4 & 60;
                            this.f14101OooO0oo = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * 1000000) / ((long) this.f14093OooO.f13152ooOO));
                            this.f14094OooO00o.OooOoOO(0);
                            this.f14097OooO0Oo.OooO0OO(this.f14094OooO00o, 18);
                            this.f14099OooO0o0 = 2;
                        } else {
                            i4 = (bArr3[5] & 1) << 6;
                            b3 = bArr3[4];
                        }
                        i5 = b3 & 252;
                        this.f14101OooO0oo = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * 1000000) / ((long) this.f14093OooO.f13152ooOO));
                        this.f14094OooO00o.OooOoOO(0);
                        this.f14097OooO0Oo.OooO0OO(this.f14094OooO00o, 18);
                        this.f14099OooO0o0 = 2;
                    } else {
                        i = 4;
                        i2 = ((bArr3[4] & 3) << 12) | ((bArr3[7] & UByte.MAX_VALUE) << 4);
                        b = bArr3[6];
                    }
                    i3 = (i2 | ((b & 240) >> i)) + 1;
                    z = false;
                    if (z) {
                        i3 = (i3 * 16) / 14;
                    }
                    this.f14102OooOO0 = i3;
                    b2 = bArr3[0];
                    if (b2 != -2) {
                        if (b2 != -1) {
                            int i28 = (bArr3[4] & 7) << 4;
                            b4 = bArr3[7];
                            i4 = i28;
                        } else if (b2 != 31) {
                            i4 = (bArr3[4] & 1) << 6;
                            b3 = bArr3[5];
                        } else {
                            i4 = (7 & bArr3[5]) << 4;
                            b4 = bArr3[6];
                        }
                        i5 = b4 & 60;
                        this.f14101OooO0oo = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * 1000000) / ((long) this.f14093OooO.f13152ooOO));
                        this.f14094OooO00o.OooOoOO(0);
                        this.f14097OooO0Oo.OooO0OO(this.f14094OooO00o, 18);
                        this.f14099OooO0o0 = 2;
                    } else {
                        i4 = (bArr3[5] & 1) << 6;
                        b3 = bArr3[4];
                    }
                    i5 = b3 & 252;
                    this.f14101OooO0oo = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * 1000000) / ((long) this.f14093OooO.f13152ooOO));
                    this.f14094OooO00o.OooOoOO(0);
                    this.f14097OooO0Oo.OooO0OO(this.f14094OooO00o, 18);
                    this.f14099OooO0o0 = 2;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iMin3 = Math.min(i9, this.f14102OooOO0 - this.f14098OooO0o);
                this.f14097OooO0Oo.OooO0OO(o000Var, iMin3);
                int i29 = this.f14098OooO0o + iMin3;
                this.f14098OooO0o = i29;
                int i30 = this.f14102OooOO0;
                if (i29 == i30) {
                    this.f14097OooO0Oo.OooO0Oo(this.f14103OooOO0O, 1, i30, 0, null);
                    this.f14103OooOO0O += this.f14101OooO0oo;
                    this.f14099OooO0o0 = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0() {
        this.f14099OooO0o0 = 0;
        this.f14098OooO0o = 0;
        this.f14100OooO0oO = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(long j, int i) {
        this.f14103OooOO0O = j;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0(p296o0O0OoO0.o0OoOo0 o0oooo1, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        this.f14096OooO0OO = oooO0o.OooO0O0();
        this.f14097OooO0Oo = o0oooo1.OooO00o(oooO0o.OooO0OO());
    }
}
