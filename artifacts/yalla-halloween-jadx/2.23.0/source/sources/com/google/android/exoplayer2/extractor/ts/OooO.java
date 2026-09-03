package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Log;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO implements OooOOO0 {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final byte[] f12110OooOo0O = {73, 68, 51};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f12112OooO00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f12115OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public TrackOutput f12116OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f12117OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TrackOutput f12118OooO0oO;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f12121OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f12122OooOO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f12125OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f12126OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f12127OooOOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f12130OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TrackOutput f12131OooOo00;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OOOOo f12113OooO0O0 = new o00OOOOo(new byte[7], 7);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo00 f12114OooO0OO = new o00Oo00(Arrays.copyOf(f12110OooOo0O, 10));

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f12119OooO0oo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f12111OooO = 0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f12120OooOO0 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f12124OooOOO0 = -1;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f12123OooOOO = -1;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f12128OooOOo0 = -9223372036854775807L;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f12129OooOOoo = -9223372036854775807L;

    public OooO(boolean z, @Nullable String str) {
        this.f12112OooO00o = z;
        this.f12115OooO0Oo = str;
    }

    public final boolean OooO00o(int i, o00Oo00 o00oo00, byte[] bArr) {
        int iMin = Math.min(o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0, i - this.f12111OooO);
        o00oo00.OooO0Oo(this.f12111OooO, iMin, bArr);
        int i2 = this.f12111OooO + iMin;
        this.f12111OooO = i2;
        return i2 == i;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023f  */
    /* JADX WARN: Code duplicated, block: B:102:0x024c  */
    /* JADX WARN: Code duplicated, block: B:103:0x024e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0258  */
    /* JADX WARN: Code duplicated, block: B:134:0x029b  */
    /* JADX WARN: Code duplicated, block: B:137:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:143:0x02af  */
    /* JADX WARN: Code duplicated, block: B:145:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:146:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:150:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:175:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:85:0x0214  */
    /* JADX WARN: Code duplicated, block: B:86:0x0216  */
    /* JADX WARN: Code duplicated, block: B:88:0x021c  */
    /* JADX WARN: Code duplicated, block: B:89:0x021e  */
    /* JADX WARN: Code duplicated, block: B:92:0x022d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0235  */
    /* JADX WARN: Code duplicated, block: B:97:0x023a  */
    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0(o00Oo00 o00oo00) throws ParserException {
        int i;
        int i2;
        int i3;
        char c;
        boolean z;
        byte[] bArr;
        boolean z2;
        int iOooO0oO;
        byte[] bArr2;
        int i4;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        byte b2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.f12116OooO0o.getClass();
        int i9 = o0O00.f40595OooO00o;
        while (true) {
            int i10 = o00oo00.f40593OooO0OO;
            int i11 = o00oo00.f40592OooO0O0;
            int i12 = i10 - i11;
            if (i12 <= 0) {
                return;
            }
            int i13 = this.f12119OooO0oo;
            int i14 = 4;
            int i15 = 2;
            o00Oo00 o00oo01 = this.f12114OooO0OO;
            o00OOOOo o00ooooo2 = this.f12113OooO0O0;
            if (i13 == 0) {
                byte[] bArr3 = o00oo00.f40591OooO00o;
                while (true) {
                    if (i11 < i10) {
                        int i16 = i11 + 1;
                        int i17 = bArr3[i11] & UByte.MAX_VALUE;
                        if (this.f12120OooOO0 != 512) {
                            i = this.f12120OooOO0;
                            i2 = i17 | i;
                            if (i2 != 329) {
                                i3 = 2;
                                c = 3;
                                this.f12120OooOO0 = 768;
                            } else if (i2 != 511) {
                                i3 = 2;
                                c = 3;
                                this.f12120OooOO0 = ConstantsKt.MINIMUM_BLOCK_SIZE;
                            } else if (i2 != 836) {
                                i3 = 2;
                                c = 3;
                                this.f12120OooOO0 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                            } else if (i2 != 1075) {
                                if (i != 256) {
                                    this.f12120OooOO0 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    i11 = i16 - 1;
                                    i3 = 2;
                                    c = 3;
                                } else {
                                    i3 = 2;
                                    c = 3;
                                }
                                i15 = i3;
                                i14 = 4;
                            } else {
                                this.f12119OooO0oo = 2;
                                this.f12111OooO = 3;
                                this.f12127OooOOo = 0;
                                o00oo01.Oooo00O(0);
                                o00oo00.Oooo00O(i16);
                            }
                            i11 = i16;
                            i15 = i3;
                            i14 = 4;
                        } else {
                            if ((((((byte) i17) & UByte.MAX_VALUE) | 65280) & 65526) == 65520) {
                                if (!this.f12122OooOO0o) {
                                    int i18 = i16 - 2;
                                    o00oo00.Oooo00O(i18 + 1);
                                    byte[] bArr4 = o00ooooo2.f40584OooO00o;
                                    if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 < 1) {
                                        z = false;
                                    } else {
                                        o00oo00.OooO0Oo(0, 1, bArr4);
                                        z = true;
                                    }
                                    if (z) {
                                        o00ooooo2.OooOO0O(i14);
                                        int iOooO0oO2 = o00ooooo2.OooO0oO(1);
                                        int i19 = this.f12124OooOOO0;
                                        if (i19 != -1 && iOooO0oO2 != i19) {
                                            z4 = false;
                                        } else if (this.f12123OooOOO != -1) {
                                            byte[] bArr5 = o00ooooo2.f40584OooO00o;
                                            if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 < 1) {
                                                z5 = false;
                                            } else {
                                                o00oo00.OooO0Oo(0, 1, bArr5);
                                                z5 = true;
                                            }
                                            if (z5) {
                                                o00ooooo2.OooOO0O(i15);
                                                if (o00ooooo2.OooO0oO(4) == this.f12123OooOOO) {
                                                    o00oo00.Oooo00O(i18 + 2);
                                                    bArr = o00ooooo2.f40584OooO00o;
                                                    if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 < 4) {
                                                        z2 = false;
                                                    } else {
                                                        o00oo00.OooO0Oo(0, 4, bArr);
                                                        z2 = true;
                                                    }
                                                    if (!z2) {
                                                        o00ooooo2.OooOO0O(14);
                                                        iOooO0oO = o00ooooo2.OooO0oO(13);
                                                        if (iOooO0oO < 7) {
                                                            bArr2 = o00oo00.f40591OooO00o;
                                                            i4 = o00oo00.f40593OooO0OO;
                                                            i5 = i18 + iOooO0oO;
                                                            if (i5 >= i4) {
                                                                b = bArr2[i5];
                                                                if (b == -1) {
                                                                    i8 = i5 + 1;
                                                                    if (i8 != i4) {
                                                                        b2 = bArr2[i8];
                                                                        if ((((b2 & UByte.MAX_VALUE) | 65280) & 65526) == 65520) {
                                                                            z3 = true;
                                                                        } else {
                                                                            z3 = false;
                                                                        }
                                                                        if (z3 || ((b2 & 8) >> 3) != iOooO0oO2) {
                                                                        }
                                                                    }
                                                                } else if (b == 73 && ((i6 = i5 + 1) == i4 || (bArr2[i6] == 68 && ((i7 = i5 + 2) == i4 || bArr2[i7] == 51)))) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z4 = true;
                                                }
                                                z4 = false;
                                            }
                                            z4 = true;
                                        } else {
                                            bArr = o00ooooo2.f40584OooO00o;
                                            if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 < 4) {
                                                z2 = false;
                                            } else {
                                                o00oo00.OooO0Oo(0, 4, bArr);
                                                z2 = true;
                                            }
                                            if (!z2) {
                                                o00ooooo2.OooOO0O(14);
                                                iOooO0oO = o00ooooo2.OooO0oO(13);
                                                if (iOooO0oO < 7) {
                                                    bArr2 = o00oo00.f40591OooO00o;
                                                    i4 = o00oo00.f40593OooO0OO;
                                                    i5 = i18 + iOooO0oO;
                                                    if (i5 >= i4) {
                                                        b = bArr2[i5];
                                                        if (b == -1) {
                                                            i8 = i5 + 1;
                                                            if (i8 != i4) {
                                                                b2 = bArr2[i8];
                                                                if ((((b2 & UByte.MAX_VALUE) | 65280) & 65526) == 65520) {
                                                                    z3 = true;
                                                                } else {
                                                                    z3 = false;
                                                                }
                                                                if (z3) {
                                                                }
                                                            }
                                                        } else if (b == 73) {
                                                        }
                                                    }
                                                }
                                                z4 = false;
                                            }
                                            z4 = true;
                                        }
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                    }
                                }
                                this.f12125OooOOOO = (i17 & 8) >> 3;
                                this.f12121OooOO0O = (i17 & 1) == 0;
                                if (this.f12122OooOO0o) {
                                    this.f12119OooO0oo = 3;
                                    this.f12111OooO = 0;
                                } else {
                                    this.f12119OooO0oo = 1;
                                    this.f12111OooO = 0;
                                }
                                o00oo00.Oooo00O(i16);
                            }
                            i = this.f12120OooOO0;
                            i2 = i17 | i;
                            if (i2 != 329) {
                                i3 = 2;
                                c = 3;
                                this.f12120OooOO0 = 768;
                            } else if (i2 != 511) {
                                i3 = 2;
                                c = 3;
                                this.f12120OooOO0 = ConstantsKt.MINIMUM_BLOCK_SIZE;
                            } else if (i2 != 836) {
                                i3 = 2;
                                c = 3;
                                this.f12120OooOO0 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                            } else if (i2 != 1075) {
                                if (i != 256) {
                                    this.f12120OooOO0 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    i11 = i16 - 1;
                                    i3 = 2;
                                    c = 3;
                                } else {
                                    i3 = 2;
                                    c = 3;
                                }
                                i15 = i3;
                                i14 = 4;
                            } else {
                                this.f12119OooO0oo = 2;
                                this.f12111OooO = 3;
                                this.f12127OooOOo = 0;
                                o00oo01.Oooo00O(0);
                                o00oo00.Oooo00O(i16);
                            }
                            i11 = i16;
                            i15 = i3;
                            i14 = 4;
                        }
                    } else {
                        o00oo00.Oooo00O(i11);
                    }
                }
            } else if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        if (OooO00o(this.f12121OooOO0O ? 7 : 5, o00oo00, o00ooooo2.f40584OooO00o)) {
                            o00ooooo2.OooOO0O(0);
                            if (this.f12126OooOOOo) {
                                o00ooooo2.OooOOO0(10);
                            } else {
                                int iOooO0oO3 = o00ooooo2.OooO0oO(2) + 1;
                                if (iOooO0oO3 != 2) {
                                    Log.OooO0o("AdtsReader", "Detected audio object type: " + iOooO0oO3 + ", but assuming AAC LC.");
                                    iOooO0oO3 = 2;
                                }
                                o00ooooo2.OooOOO0(5);
                                int iOooO0oO4 = o00ooooo2.OooO0oO(3);
                                int i20 = this.f12123OooOOO;
                                byte[] bArr6 = {(byte) (((iOooO0oO3 << 3) & 248) | ((i20 >> 1) & 7)), (byte) (((i20 << 7) & 128) | ((iOooO0oO4 << 3) & 120))};
                                AacUtil.OooO00o oooO00oOooO0O0 = AacUtil.OooO0O0(new o00OOOOo(bArr6, 2), false);
                                com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
                                oooO00o.f11235OooO00o = this.f12117OooO0o0;
                                oooO00o.f11244OooOO0O = "audio/mp4a-latm";
                                oooO00o.f11242OooO0oo = oooO00oOooO0O0.f11441OooO0OO;
                                oooO00o.f11253OooOo = oooO00oOooO0O0.f11440OooO0O0;
                                oooO00o.f11259OooOoO0 = oooO00oOooO0O0.f11439OooO00o;
                                oooO00o.f11247OooOOO0 = Collections.singletonList(bArr6);
                                oooO00o.f11237OooO0OO = this.f12115OooO0Oo;
                                com.google.android.exoplayer2.OooOo oooOo = new com.google.android.exoplayer2.OooOo(oooO00o);
                                this.f12128OooOOo0 = 1024000000 / ((long) oooOo.f11224OooOoo);
                                this.f12116OooO0o.OooO0OO(oooOo);
                                this.f12126OooOOOo = true;
                            }
                            o00ooooo2.OooOOO0(4);
                            int iOooO0oO5 = (o00ooooo2.OooO0oO(13) - 2) - 5;
                            if (this.f12121OooOO0O) {
                                iOooO0oO5 -= 2;
                            }
                            TrackOutput trackOutput = this.f12116OooO0o;
                            long j = this.f12128OooOOo0;
                            this.f12119OooO0oo = 4;
                            this.f12111OooO = 0;
                            this.f12131OooOo00 = trackOutput;
                            this.f12130OooOo0 = j;
                            this.f12127OooOOo = iOooO0oO5;
                        }
                    } else {
                        if (i13 != 4) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(i12, this.f12127OooOOo - this.f12111OooO);
                        this.f12131OooOo00.OooO0O0(iMin, o00oo00);
                        int i21 = this.f12111OooO + iMin;
                        this.f12111OooO = i21;
                        int i22 = this.f12127OooOOo;
                        if (i21 == i22) {
                            long j2 = this.f12129OooOOoo;
                            if (j2 != -9223372036854775807L) {
                                this.f12131OooOo00.OooO0o0(j2, 1, i22, 0, null);
                                this.f12129OooOOoo += this.f12130OooOo0;
                            }
                            this.f12119OooO0oo = 0;
                            this.f12111OooO = 0;
                            this.f12120OooOO0 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        }
                    }
                } else if (OooO00o(10, o00oo00, o00oo01.f40591OooO00o)) {
                    this.f12118OooO0oO.OooO0O0(10, o00oo01);
                    o00oo01.Oooo00O(6);
                    TrackOutput trackOutput2 = this.f12118OooO0oO;
                    int iOooOo0 = o00oo01.OooOo0() + 10;
                    this.f12119OooO0oo = 4;
                    this.f12111OooO = 10;
                    this.f12131OooOo00 = trackOutput2;
                    this.f12130OooOo0 = 0L;
                    this.f12127OooOOo = iOooOo0;
                }
            } else if (i12 != 0) {
                o00ooooo2.f40584OooO00o[0] = o00oo00.f40591OooO00o[i11];
                o00ooooo2.OooOO0O(2);
                int iOooO0oO6 = o00ooooo2.OooO0oO(4);
                int i23 = this.f12123OooOOO;
                if (i23 == -1 || iOooO0oO6 == i23) {
                    if (!this.f12122OooOO0o) {
                        this.f12122OooOO0o = true;
                        this.f12124OooOOO0 = this.f12125OooOOOO;
                        this.f12123OooOOO = iOooO0oO6;
                    }
                    this.f12119OooO0oo = 3;
                    this.f12111OooO = 0;
                } else {
                    this.f12122OooOO0o = false;
                    this.f12119OooO0oo = 0;
                    this.f12111OooO = 0;
                    this.f12120OooOO0 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
        this.f12129OooOOoo = -9223372036854775807L;
        this.f12122OooOO0o = false;
        this.f12119OooO0oo = 0;
        this.f12111OooO = 0;
        this.f12120OooOO0 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        this.f12117OooO0o0 = oooO0o.f12363OooO0o0;
        oooO0o.OooO0O0();
        TrackOutput trackOutputOooOOO = o00o0o0.OooOOO(oooO0o.f12362OooO0Oo, 1);
        this.f12116OooO0o = trackOutputOooOOO;
        this.f12131OooOo00 = trackOutputOooOOO;
        if (!this.f12112OooO00o) {
            this.f12118OooO0oO = new com.google.android.exoplayer2.extractor.OooO0O0();
            return;
        }
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        TrackOutput trackOutputOooOOO2 = o00o0o0.OooOOO(oooO0o.f12362OooO0Oo, 5);
        this.f12118OooO0oO = trackOutputOooOOO2;
        com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
        oooO0o.OooO0O0();
        oooO00o.f11235OooO00o = oooO0o.f12363OooO0o0;
        oooO00o.f11244OooOO0O = "application/id3";
        trackOutputOooOOO2.OooO0OO(new com.google.android.exoplayer2.OooOo(oooO00o));
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f12129OooOOoo = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0() {
    }
}
