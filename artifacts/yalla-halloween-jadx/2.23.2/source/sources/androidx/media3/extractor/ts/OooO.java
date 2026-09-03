package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.TrackOutput;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import p080o000OoO.o00;
import p080o000OoO.o000;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO implements OooOOO0 {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final byte[] f8877OooOo0O = {73, 68, 51};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f8879OooO00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f8882OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public TrackOutput f8883OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f8884OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TrackOutput f8885OooO0oO;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f8888OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f8889OooOO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f8892OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f8893OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f8894OooOOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f8897OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TrackOutput f8898OooOo00;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f8880OooO0O0 = new o000(new byte[7], 7);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O000 f8881OooO0OO = new o000O000(Arrays.copyOf(f8877OooOo0O, 10));

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f8886OooO0oo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f8878OooO = 0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f8887OooOO0 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f8891OooOOO0 = -1;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f8890OooOOO = -1;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f8895OooOOo0 = -9223372036854775807L;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f8896OooOOoo = -9223372036854775807L;

    public OooO(boolean z, @Nullable String str) {
        this.f8879OooO00o = z;
        this.f8882OooO0Oo = str;
    }

    public final boolean OooO00o(int i, o000O000 o000o001, byte[] bArr) {
        int iMin = Math.min(o000o001.f34964OooO0OO - o000o001.f34963OooO0O0, i - this.f8878OooO);
        o000o001.OooO0Oo(this.f8878OooO, iMin, bArr);
        int i2 = this.f8878OooO + iMin;
        this.f8878OooO = i2;
        return i2 == i;
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0O0() {
        this.f8896OooOOoo = -9223372036854775807L;
        this.f8889OooOO0o = false;
        this.f8886OooO0oo = 0;
        this.f8878OooO = 0;
        this.f8887OooOO0 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
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
    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0OO(o000O000 o000o001) throws ParserException {
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
        this.f8883OooO0o.getClass();
        int i9 = o00.f34910OooO00o;
        while (true) {
            int i10 = o000o001.f34964OooO0OO;
            int i11 = o000o001.f34963OooO0O0;
            int i12 = i10 - i11;
            if (i12 <= 0) {
                return;
            }
            int i13 = this.f8886OooO0oo;
            int i14 = 4;
            int i15 = 2;
            o000O000 o000o002 = this.f8881OooO0OO;
            o000 o000Var = this.f8880OooO0O0;
            if (i13 == 0) {
                byte[] bArr3 = o000o001.f34962OooO00o;
                while (true) {
                    if (i11 < i10) {
                        int i16 = i11 + 1;
                        int i17 = bArr3[i11] & UByte.MAX_VALUE;
                        if (this.f8887OooOO0 != 512) {
                            i = this.f8887OooOO0;
                            i2 = i17 | i;
                            if (i2 != 329) {
                                i3 = 2;
                                c = 3;
                                this.f8887OooOO0 = 768;
                            } else if (i2 != 511) {
                                i3 = 2;
                                c = 3;
                                this.f8887OooOO0 = ConstantsKt.MINIMUM_BLOCK_SIZE;
                            } else if (i2 != 836) {
                                i3 = 2;
                                c = 3;
                                this.f8887OooOO0 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                            } else if (i2 != 1075) {
                                if (i != 256) {
                                    this.f8887OooOO0 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
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
                                this.f8886OooO0oo = 2;
                                this.f8878OooO = 3;
                                this.f8894OooOOo = 0;
                                o000o002.Oooo00O(0);
                                o000o001.Oooo00O(i16);
                            }
                            i11 = i16;
                            i15 = i3;
                            i14 = 4;
                        } else {
                            if ((((((byte) i17) & UByte.MAX_VALUE) | 65280) & 65526) == 65520) {
                                if (!this.f8889OooOO0o) {
                                    int i18 = i16 - 2;
                                    o000o001.Oooo00O(i18 + 1);
                                    byte[] bArr4 = o000Var.f34922OooO00o;
                                    if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 < 1) {
                                        z = false;
                                    } else {
                                        o000o001.OooO0Oo(0, 1, bArr4);
                                        z = true;
                                    }
                                    if (z) {
                                        o000Var.OooOO0O(i14);
                                        int iOooO0oO2 = o000Var.OooO0oO(1);
                                        int i19 = this.f8891OooOOO0;
                                        if (i19 != -1 && iOooO0oO2 != i19) {
                                            z4 = false;
                                        } else if (this.f8890OooOOO != -1) {
                                            byte[] bArr5 = o000Var.f34922OooO00o;
                                            if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 < 1) {
                                                z5 = false;
                                            } else {
                                                o000o001.OooO0Oo(0, 1, bArr5);
                                                z5 = true;
                                            }
                                            if (z5) {
                                                o000Var.OooOO0O(i15);
                                                if (o000Var.OooO0oO(4) == this.f8890OooOOO) {
                                                    o000o001.Oooo00O(i18 + 2);
                                                    bArr = o000Var.f34922OooO00o;
                                                    if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 < 4) {
                                                        z2 = false;
                                                    } else {
                                                        o000o001.OooO0Oo(0, 4, bArr);
                                                        z2 = true;
                                                    }
                                                    if (!z2) {
                                                        o000Var.OooOO0O(14);
                                                        iOooO0oO = o000Var.OooO0oO(13);
                                                        if (iOooO0oO < 7) {
                                                            bArr2 = o000o001.f34962OooO00o;
                                                            i4 = o000o001.f34964OooO0OO;
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
                                            bArr = o000Var.f34922OooO00o;
                                            if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 < 4) {
                                                z2 = false;
                                            } else {
                                                o000o001.OooO0Oo(0, 4, bArr);
                                                z2 = true;
                                            }
                                            if (!z2) {
                                                o000Var.OooOO0O(14);
                                                iOooO0oO = o000Var.OooO0oO(13);
                                                if (iOooO0oO < 7) {
                                                    bArr2 = o000o001.f34962OooO00o;
                                                    i4 = o000o001.f34964OooO0OO;
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
                                this.f8892OooOOOO = (i17 & 8) >> 3;
                                this.f8888OooOO0O = (i17 & 1) == 0;
                                if (this.f8889OooOO0o) {
                                    this.f8886OooO0oo = 3;
                                    this.f8878OooO = 0;
                                } else {
                                    this.f8886OooO0oo = 1;
                                    this.f8878OooO = 0;
                                }
                                o000o001.Oooo00O(i16);
                            }
                            i = this.f8887OooOO0;
                            i2 = i17 | i;
                            if (i2 != 329) {
                                i3 = 2;
                                c = 3;
                                this.f8887OooOO0 = 768;
                            } else if (i2 != 511) {
                                i3 = 2;
                                c = 3;
                                this.f8887OooOO0 = ConstantsKt.MINIMUM_BLOCK_SIZE;
                            } else if (i2 != 836) {
                                i3 = 2;
                                c = 3;
                                this.f8887OooOO0 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                            } else if (i2 != 1075) {
                                if (i != 256) {
                                    this.f8887OooOO0 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
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
                                this.f8886OooO0oo = 2;
                                this.f8878OooO = 3;
                                this.f8894OooOOo = 0;
                                o000o002.Oooo00O(0);
                                o000o001.Oooo00O(i16);
                            }
                            i11 = i16;
                            i15 = i3;
                            i14 = 4;
                        }
                    } else {
                        o000o001.Oooo00O(i11);
                    }
                }
            } else if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        if (OooO00o(this.f8888OooOO0O ? 7 : 5, o000o001, o000Var.f34922OooO00o)) {
                            o000Var.OooOO0O(0);
                            if (this.f8893OooOOOo) {
                                o000Var.OooOOO0(10);
                            } else {
                                int iOooO0oO3 = o000Var.OooO0oO(2) + 1;
                                if (iOooO0oO3 != 2) {
                                    Log.OooO0o("AdtsReader", "Detected audio object type: " + iOooO0oO3 + ", but assuming AAC LC.");
                                    iOooO0oO3 = 2;
                                }
                                o000Var.OooOOO0(5);
                                int iOooO0oO4 = o000Var.OooO0oO(3);
                                int i20 = this.f8890OooOOO;
                                byte[] bArr6 = {(byte) (((iOooO0oO3 << 3) & 248) | ((i20 >> 1) & 7)), (byte) (((i20 << 7) & 128) | ((iOooO0oO4 << 3) & 120))};
                                AacUtil.OooO00o oooO00oOooO0O0 = AacUtil.OooO0O0(new o000(bArr6, 2), false);
                                androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o();
                                oooO00o.f6436OooO00o = this.f8884OooO0o0;
                                oooO00o.f6445OooOO0O = "audio/mp4a-latm";
                                oooO00o.f6443OooO0oo = oooO00oOooO0O0.f8363OooO0OO;
                                oooO00o.f6454OooOo = oooO00oOooO0O0.f8362OooO0O0;
                                oooO00o.f6460OooOoO0 = oooO00oOooO0O0.f8361OooO00o;
                                oooO00o.f6448OooOOO0 = Collections.singletonList(bArr6);
                                oooO00o.f6438OooO0OO = this.f8882OooO0Oo;
                                androidx.media3.common.OooOO0 oooOO1 = new androidx.media3.common.OooOO0(oooO00o);
                                this.f8895OooOOo0 = 1024000000 / ((long) oooOO1.f6425OooOoo);
                                this.f8883OooO0o.OooO0O0(oooOO1);
                                this.f8893OooOOOo = true;
                            }
                            o000Var.OooOOO0(4);
                            int iOooO0oO5 = (o000Var.OooO0oO(13) - 2) - 5;
                            if (this.f8888OooOO0O) {
                                iOooO0oO5 -= 2;
                            }
                            TrackOutput trackOutput = this.f8883OooO0o;
                            long j = this.f8895OooOOo0;
                            this.f8886OooO0oo = 4;
                            this.f8878OooO = 0;
                            this.f8898OooOo00 = trackOutput;
                            this.f8897OooOo0 = j;
                            this.f8894OooOOo = iOooO0oO5;
                        }
                    } else {
                        if (i13 != 4) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(i12, this.f8894OooOOo - this.f8878OooO);
                        this.f8898OooOo00.OooO0OO(iMin, o000o001);
                        int i21 = this.f8878OooO + iMin;
                        this.f8878OooO = i21;
                        int i22 = this.f8894OooOOo;
                        if (i21 == i22) {
                            long j2 = this.f8896OooOOoo;
                            if (j2 != -9223372036854775807L) {
                                this.f8898OooOo00.OooO0o0(j2, 1, i22, 0, null);
                                this.f8896OooOOoo += this.f8897OooOo0;
                            }
                            this.f8886OooO0oo = 0;
                            this.f8878OooO = 0;
                            this.f8887OooOO0 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        }
                    }
                } else if (OooO00o(10, o000o001, o000o002.f34962OooO00o)) {
                    this.f8885OooO0oO.OooO0OO(10, o000o002);
                    o000o002.Oooo00O(6);
                    TrackOutput trackOutput2 = this.f8885OooO0oO;
                    int iOooOo0 = o000o002.OooOo0() + 10;
                    this.f8886OooO0oo = 4;
                    this.f8878OooO = 10;
                    this.f8898OooOo00 = trackOutput2;
                    this.f8897OooOo0 = 0L;
                    this.f8894OooOOo = iOooOo0;
                }
            } else if (i12 != 0) {
                o000Var.f34922OooO00o[0] = o000o001.f34962OooO00o[i11];
                o000Var.OooOO0O(2);
                int iOooO0oO6 = o000Var.OooO0oO(4);
                int i23 = this.f8890OooOOO;
                if (i23 == -1 || iOooO0oO6 == i23) {
                    if (!this.f8889OooOO0o) {
                        this.f8889OooOO0o = true;
                        this.f8891OooOOO0 = this.f8892OooOOOO;
                        this.f8890OooOOO = iOooO0oO6;
                    }
                    this.f8886OooO0oo = 3;
                    this.f8878OooO = 0;
                } else {
                    this.f8889OooOO0o = false;
                    this.f8886OooO0oo = 0;
                    this.f8878OooO = 0;
                    this.f8887OooOO0 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
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
        this.f8884OooO0o0 = oooO0o.f9130OooO0o0;
        oooO0o.OooO0O0();
        TrackOutput trackOutputOooOOOO = oooo0.OooOOOO(oooO0o.f9129OooO0Oo, 1);
        this.f8883OooO0o = trackOutputOooOOOO;
        this.f8898OooOo00 = trackOutputOooOOOO;
        if (!this.f8879OooO00o) {
            this.f8885OooO0oO = new androidx.media3.extractor.OooO0O0();
            return;
        }
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        TrackOutput trackOutputOooOOOO2 = oooo0.OooOOOO(oooO0o.f9129OooO0Oo, 5);
        this.f8885OooO0oO = trackOutputOooOOOO2;
        androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o();
        oooO0o.OooO0O0();
        oooO00o.f6436OooO00o = oooO0o.f9130OooO0o0;
        oooO00o.f6445OooOO0O = "application/id3";
        trackOutputOooOOOO2.OooO0O0(new androidx.media3.common.OooOO0(oooO00o));
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o0(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f8896OooOOoo = j;
        }
    }
}
