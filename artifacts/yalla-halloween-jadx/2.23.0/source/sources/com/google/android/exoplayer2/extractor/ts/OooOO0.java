package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.util.Arrays;
import kotlin.UByte;
import p205o00o0oO0.o0O0ooO;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOO0 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public com.google.android.exoplayer2.OooOo f12163OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f12165OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f12166OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TrackOutput f12167OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f12168OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f12170OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f12171OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f12172OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo00 f12164OooO00o = new o00Oo00(new byte[18]);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f12169OooO0o0 = 0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f12173OooOO0O = -9223372036854775807L;

    public OooOO0(@Nullable String str) {
        this.f12165OooO0O0 = str;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0209  */
    /* JADX WARN: Code duplicated, block: B:74:0x0211  */
    /* JADX WARN: Code duplicated, block: B:76:0x0214  */
    /* JADX WARN: Code duplicated, block: B:78:0x0218  */
    /* JADX WARN: Code duplicated, block: B:79:0x0222  */
    /* JADX WARN: Code duplicated, block: B:80:0x022c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0239  */
    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0(o00Oo00 o00oo00) {
        char c;
        int i;
        int i2;
        byte b;
        boolean z;
        int i3;
        int i4;
        byte b2;
        int i5;
        byte b3;
        int i6;
        byte b4;
        o00OOOOo o00ooooo2;
        int i7;
        int i8;
        boolean z2;
        o00O000o.OooO0o0(this.f12167OooO0Oo);
        while (true) {
            int i9 = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
            if (i9 <= 0) {
                return;
            }
            int i10 = this.f12169OooO0o0;
            int i11 = 8;
            int i12 = 2;
            o00Oo00 o00oo01 = this.f12164OooO00o;
            if (i10 == 0) {
                while (true) {
                    if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 <= 0) {
                        z2 = false;
                        break;
                    }
                    int i13 = this.f12170OooO0oO << 8;
                    this.f12170OooO0oO = i13;
                    int iOooOo0O = i13 | o00oo00.OooOo0O();
                    this.f12170OooO0oO = iOooOo0O;
                    if (iOooOo0O == 2147385345 || iOooOo0O == -25230976 || iOooOo0O == 536864768 || iOooOo0O == -14745368) {
                        byte[] bArr = o00oo01.f40591OooO00o;
                        bArr[0] = (byte) ((iOooOo0O >> 24) & 255);
                        bArr[1] = (byte) ((iOooOo0O >> 16) & 255);
                        bArr[2] = (byte) ((iOooOo0O >> 8) & 255);
                        bArr[3] = (byte) (iOooOo0O & 255);
                        this.f12168OooO0o = 4;
                        this.f12170OooO0oO = 0;
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    this.f12169OooO0o0 = 1;
                }
            } else if (i10 == 1) {
                byte[] bArr2 = o00oo01.f40591OooO00o;
                int iMin = Math.min(i9, 18 - this.f12168OooO0o);
                o00oo00.OooO0Oo(this.f12168OooO0o, iMin, bArr2);
                int i14 = this.f12168OooO0o + iMin;
                this.f12168OooO0o = i14;
                if (i14 == 18) {
                    byte[] bArr3 = o00oo01.f40591OooO00o;
                    if (this.f12163OooO == null) {
                        String str = this.f12166OooO0OO;
                        if (bArr3[0] == 127) {
                            o00ooooo2 = new o00OOOOo(bArr3, bArr3.length);
                        } else {
                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
                            byte b5 = bArrCopyOf[0];
                            if (b5 == -2 || b5 == -1) {
                                for (int i15 = 0; i15 < bArrCopyOf.length - 1; i15 += 2) {
                                    byte b6 = bArrCopyOf[i15];
                                    int i16 = i15 + 1;
                                    bArrCopyOf[i15] = bArrCopyOf[i16];
                                    bArrCopyOf[i16] = b6;
                                }
                            }
                            o00OOOOo o00ooooo3 = new o00OOOOo(bArrCopyOf, bArrCopyOf.length);
                            if (bArrCopyOf[0] == 31) {
                                o00OOOOo o00ooooo4 = new o00OOOOo(bArrCopyOf, bArrCopyOf.length);
                                while (o00ooooo4.OooO0O0() >= 16) {
                                    o00ooooo4.OooOOO0(i12);
                                    int iOooO0oO = o00ooooo4.OooO0oO(14) & 16383;
                                    int iMin2 = Math.min(8 - o00ooooo3.f40586OooO0OO, 14);
                                    int i17 = o00ooooo3.f40586OooO0OO;
                                    int i18 = (8 - i17) - iMin2;
                                    byte[] bArr4 = o00ooooo3.f40584OooO00o;
                                    int i19 = o00ooooo3.f40585OooO0O0;
                                    byte b7 = (byte) (((65280 >> i17) | ((1 << i18) - 1)) & bArr4[i19]);
                                    bArr4[i19] = b7;
                                    int i20 = 14 - iMin2;
                                    bArr4[i19] = (byte) (b7 | ((iOooO0oO >>> i20) << i18));
                                    int i21 = i19 + 1;
                                    while (i20 > i11) {
                                        i20 -= 8;
                                        o00ooooo3.f40584OooO00o[i21] = (byte) (iOooO0oO >>> i20);
                                        i21++;
                                        i11 = 8;
                                    }
                                    int i22 = 8 - i20;
                                    byte[] bArr5 = o00ooooo3.f40584OooO00o;
                                    byte b8 = (byte) (bArr5[i21] & ((1 << i22) - 1));
                                    bArr5[i21] = b8;
                                    bArr5[i21] = (byte) (((iOooO0oO & ((1 << i20) - 1)) << i22) | b8);
                                    o00ooooo3.OooOOO0(14);
                                    o00ooooo3.OooO00o();
                                    i11 = 8;
                                    i12 = 2;
                                }
                            }
                            o00ooooo3.OooOO0(bArrCopyOf.length, bArrCopyOf);
                            o00ooooo2 = o00ooooo3;
                        }
                        o00ooooo2.OooOOO0(60);
                        int i23 = o0O0ooO.f39395OooO00o[o00ooooo2.OooO0oO(6)];
                        int i24 = o0O0ooO.f39396OooO0O0[o00ooooo2.OooO0oO(4)];
                        int iOooO0oO2 = o00ooooo2.OooO0oO(5);
                        if (iOooO0oO2 >= 29) {
                            i8 = -1;
                            i7 = 2;
                        } else {
                            int i25 = o0O0ooO.f39397OooO0OO[iOooO0oO2] * 1000;
                            i7 = 2;
                            i8 = i25 / 2;
                        }
                        o00ooooo2.OooOOO0(10);
                        int i26 = i23 + (o00ooooo2.OooO0oO(i7) > 0 ? 1 : 0);
                        com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
                        oooO00o.f11235OooO00o = str;
                        oooO00o.f11244OooOO0O = "audio/vnd.dts";
                        oooO00o.f11239OooO0o = i8;
                        oooO00o.f11253OooOo = i26;
                        oooO00o.f11259OooOoO0 = i24;
                        oooO00o.f11246OooOOO = null;
                        oooO00o.f11237OooO0OO = this.f12165OooO0O0;
                        com.google.android.exoplayer2.OooOo oooOo = new com.google.android.exoplayer2.OooOo(oooO00o);
                        this.f12163OooO = oooOo;
                        this.f12167OooO0Oo.OooO0OO(oooOo);
                        c = 0;
                    } else {
                        c = 0;
                    }
                    byte b9 = bArr3[c];
                    if (b9 != -2) {
                        if (b9 == -1) {
                            i6 = ((3 & bArr3[7]) << 12) | ((bArr3[6] & UByte.MAX_VALUE) << 4);
                            b4 = bArr3[9];
                        } else if (b9 != 31) {
                            i = 4;
                            i2 = ((3 & bArr3[5]) << 12) | ((bArr3[6] & UByte.MAX_VALUE) << 4);
                            b = bArr3[7];
                        } else {
                            i6 = ((3 & bArr3[6]) << 12) | ((bArr3[7] & UByte.MAX_VALUE) << 4);
                            b4 = bArr3[8];
                        }
                        i3 = (i6 | ((b4 & 60) >> 2)) + 1;
                        z = true;
                        if (z) {
                            i3 = (i3 * 16) / 14;
                        }
                        this.f12172OooOO0 = i3;
                        if (b9 != -2) {
                            if (b9 != -1) {
                                int i27 = (bArr3[4] & 7) << 4;
                                b3 = bArr3[7];
                                i4 = i27;
                            } else if (b9 != 31) {
                                i4 = (bArr3[4] & 1) << 6;
                                b2 = bArr3[5];
                            } else {
                                i4 = (7 & bArr3[5]) << 4;
                                b3 = bArr3[6];
                            }
                            i5 = b3 & 60;
                            this.f12171OooO0oo = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * AnimationKt.MillisToNanos) / ((long) this.f12163OooO.f11224OooOoo));
                            o00oo01.Oooo00O(0);
                            this.f12167OooO0Oo.OooO0O0(18, o00oo01);
                            this.f12169OooO0o0 = 2;
                        } else {
                            i4 = (bArr3[5] & 1) << 6;
                            b2 = bArr3[4];
                        }
                        i5 = b2 & 252;
                        this.f12171OooO0oo = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * AnimationKt.MillisToNanos) / ((long) this.f12163OooO.f11224OooOoo));
                        o00oo01.Oooo00O(0);
                        this.f12167OooO0Oo.OooO0O0(18, o00oo01);
                        this.f12169OooO0o0 = 2;
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
                    this.f12172OooOO0 = i3;
                    if (b9 != -2) {
                        if (b9 != -1) {
                            int i28 = (bArr3[4] & 7) << 4;
                            b3 = bArr3[7];
                            i4 = i28;
                        } else if (b9 != 31) {
                            i4 = (bArr3[4] & 1) << 6;
                            b2 = bArr3[5];
                        } else {
                            i4 = (7 & bArr3[5]) << 4;
                            b3 = bArr3[6];
                        }
                        i5 = b3 & 60;
                        this.f12171OooO0oo = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * AnimationKt.MillisToNanos) / ((long) this.f12163OooO.f11224OooOoo));
                        o00oo01.Oooo00O(0);
                        this.f12167OooO0Oo.OooO0O0(18, o00oo01);
                        this.f12169OooO0o0 = 2;
                    } else {
                        i4 = (bArr3[5] & 1) << 6;
                        b2 = bArr3[4];
                    }
                    i5 = b2 & 252;
                    this.f12171OooO0oo = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * AnimationKt.MillisToNanos) / ((long) this.f12163OooO.f11224OooOoo));
                    o00oo01.Oooo00O(0);
                    this.f12167OooO0Oo.OooO0O0(18, o00oo01);
                    this.f12169OooO0o0 = 2;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iMin3 = Math.min(i9, this.f12172OooOO0 - this.f12168OooO0o);
                this.f12167OooO0Oo.OooO0O0(iMin3, o00oo00);
                int i29 = this.f12168OooO0o + iMin3;
                this.f12168OooO0o = i29;
                int i30 = this.f12172OooOO0;
                if (i29 == i30) {
                    long j = this.f12173OooOO0O;
                    if (j != -9223372036854775807L) {
                        this.f12167OooO0Oo.OooO0o0(j, 1, i30, 0, null);
                        this.f12173OooOO0O += this.f12171OooO0oo;
                    }
                    this.f12169OooO0o0 = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
        this.f12169OooO0o0 = 0;
        this.f12168OooO0o = 0;
        this.f12170OooO0oO = 0;
        this.f12173OooOO0O = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        this.f12166OooO0OO = oooO0o.f12363OooO0o0;
        oooO0o.OooO0O0();
        this.f12167OooO0Oo = o00o0o0.OooOOO(oooO0o.f12362OooO0Oo, 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f12173OooOO0O = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0() {
    }
}
