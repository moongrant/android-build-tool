package com.google.android.exoplayer2.extractor.ts;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.uc.crashsdk.export.LogType;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import kotlin.UByte;
import p318o0O0oOo.o000;
import p318o0O0oOo.o0000OO0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements OooOOO0 {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final byte[] f14040OooOo0O = {73, 68, 51};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f14041OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f14042OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000OO0 f14043OooO0O0 = new o0000OO0(new byte[7], 7);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000 f14044OooO0OO = new o000(Arrays.copyOf(f14040OooOo0O, 10));

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f14045OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public TrackOutput f14046OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f14047OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TrackOutput f14048OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f14049OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f14050OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f14051OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f14052OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f14053OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f14054OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f14055OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f14056OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f14057OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f14058OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f14059OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f14060OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TrackOutput f14061OooOo00;

    public OooO(boolean z, @Nullable String str) {
        OooO0oo();
        this.f14054OooOOO0 = -1;
        this.f14053OooOOO = -1;
        this.f14058OooOOo0 = -9223372036854775807L;
        this.f14042OooO00o = z;
        this.f14045OooO0Oo = str;
    }

    public static boolean OooO0oO(int i) {
        return (i & 65526) == 65520;
    }

    public final boolean OooO(o000 o000Var, byte[] bArr, int i) {
        if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 < i) {
            return false;
        }
        o000Var.OooO0OO(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0259  */
    /* JADX WARN: Code duplicated, block: B:116:0x027e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0285  */
    /* JADX WARN: Code duplicated, block: B:120:0x0289  */
    /* JADX WARN: Code duplicated, block: B:122:0x028d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0291  */
    /* JADX WARN: Code duplicated, block: B:126:0x0295  */
    /* JADX WARN: Code duplicated, block: B:127:0x029d  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0204  */
    /* JADX WARN: Code duplicated, block: B:77:0x0214  */
    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO00o(o000 o000Var) throws ParserException {
        int i;
        int i2;
        boolean z;
        int iOooO0oO;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Objects.requireNonNull(this.f14046OooO0o);
        int i8 = o000OOo0.f36740OooO00o;
        while (true) {
            int i9 = o000Var.f36663OooO0OO;
            int i10 = o000Var.f36662OooO0O0;
            int i11 = i9 - i10;
            if (i11 <= 0) {
                return;
            }
            int i12 = this.f14049OooO0oo;
            int i13 = 4;
            int i14 = 2;
            if (i12 == 0) {
                byte[] bArr = o000Var.f36661OooO00o;
                while (true) {
                    if (i10 < i9) {
                        int i15 = i10 + 1;
                        int i16 = bArr[i10] & UByte.MAX_VALUE;
                        if (this.f14050OooOO0 == 512 && OooO0oO((((byte) i16) & UByte.MAX_VALUE) | 65280)) {
                            if (!this.f14052OooOO0o) {
                                int i17 = i15 - 2;
                                o000Var.OooOoOO(i17 + 1);
                                if (OooO(o000Var, this.f14043OooO0O0.f36700OooO00o, 1)) {
                                    this.f14043OooO0O0.OooOO0O(i13);
                                    int iOooO0oO2 = this.f14043OooO0O0.OooO0oO(1);
                                    int i18 = this.f14054OooOOO0;
                                    if (i18 != -1 && iOooO0oO2 != i18) {
                                        z = false;
                                    } else if (this.f14053OooOOO == -1) {
                                        if (OooO(o000Var, this.f14043OooO0O0.f36700OooO00o, i13)) {
                                            this.f14043OooO0O0.OooOO0O(14);
                                            iOooO0oO = this.f14043OooO0O0.OooO0oO(13);
                                            if (iOooO0oO >= 7) {
                                                byte[] bArr2 = o000Var.f36661OooO00o;
                                                i3 = o000Var.f36663OooO0OO;
                                                i4 = i17 + iOooO0oO;
                                                if (i4 < i3 && (bArr2[i4] != -1 ? !(bArr2[i4] == 73 && ((i5 = i4 + 1) == i3 || (bArr2[i5] == 68 && ((i6 = i4 + 2) == i3 || bArr2[i6] == 51)))) : !((i7 = i4 + 1) == i3 || (OooO0oO((bArr2[i7] & UByte.MAX_VALUE) | 65280) && ((bArr2[i7] & 8) >> 3) == iOooO0oO2)))) {
                                                }
                                            }
                                            z = false;
                                        }
                                        z = true;
                                    } else if (OooO(o000Var, this.f14043OooO0O0.f36700OooO00o, 1)) {
                                        this.f14043OooO0O0.OooOO0O(i14);
                                        if (this.f14043OooO0O0.OooO0oO(i13) != this.f14053OooOOO) {
                                            z = false;
                                        } else {
                                            o000Var.OooOoOO(i17 + 2);
                                            if (OooO(o000Var, this.f14043OooO0O0.f36700OooO00o, i13)) {
                                                this.f14043OooO0O0.OooOO0O(14);
                                                iOooO0oO = this.f14043OooO0O0.OooO0oO(13);
                                                if (iOooO0oO >= 7) {
                                                    byte[] bArr3 = o000Var.f36661OooO00o;
                                                    i3 = o000Var.f36663OooO0OO;
                                                    i4 = i17 + iOooO0oO;
                                                    if (i4 < i3) {
                                                    }
                                                }
                                                z = false;
                                            }
                                            z = true;
                                        }
                                    } else {
                                        z = true;
                                    }
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    i = this.f14050OooOO0;
                                    i2 = i16 | i;
                                    if (i2 != 329) {
                                        this.f14050OooOO0 = LogType.UNEXP_OTHER;
                                    } else if (i2 != 511) {
                                        this.f14050OooOO0 = 512;
                                    } else if (i2 != 836) {
                                        this.f14050OooOO0 = 1024;
                                    } else if (i2 != 1075) {
                                        if (i != 256) {
                                            this.f14050OooOO0 = 256;
                                            i10 = i15 - 1;
                                        }
                                        i13 = 4;
                                        i14 = 2;
                                    } else {
                                        this.f14049OooO0oo = 2;
                                        this.f14041OooO = 3;
                                        this.f14057OooOOo = 0;
                                        this.f14044OooO0OO.OooOoOO(0);
                                        o000Var.OooOoOO(i15);
                                    }
                                    i10 = i15;
                                    i13 = 4;
                                    i14 = 2;
                                }
                            }
                            this.f14055OooOOOO = (i16 & 8) >> 3;
                            this.f14051OooOO0O = (i16 & 1) == 0;
                            if (this.f14052OooOO0o) {
                                this.f14049OooO0oo = 3;
                                this.f14041OooO = 0;
                            } else {
                                this.f14049OooO0oo = 1;
                                this.f14041OooO = 0;
                            }
                            o000Var.OooOoOO(i15);
                        } else {
                            i = this.f14050OooOO0;
                            i2 = i16 | i;
                            if (i2 != 329) {
                                this.f14050OooOO0 = LogType.UNEXP_OTHER;
                            } else if (i2 != 511) {
                                this.f14050OooOO0 = 512;
                            } else if (i2 != 836) {
                                this.f14050OooOO0 = 1024;
                            } else if (i2 != 1075) {
                                if (i != 256) {
                                    this.f14050OooOO0 = 256;
                                    i10 = i15 - 1;
                                }
                                i13 = 4;
                                i14 = 2;
                            } else {
                                this.f14049OooO0oo = 2;
                                this.f14041OooO = 3;
                                this.f14057OooOOo = 0;
                                this.f14044OooO0OO.OooOoOO(0);
                                o000Var.OooOoOO(i15);
                            }
                            i10 = i15;
                            i13 = 4;
                            i14 = 2;
                        }
                    } else {
                        o000Var.OooOoOO(i10);
                    }
                }
            } else if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        if (OooO0o(o000Var, this.f14043OooO0O0.f36700OooO00o, this.f14051OooOO0O ? 7 : 5)) {
                            this.f14043OooO0O0.OooOO0O(0);
                            if (this.f14056OooOOOo) {
                                this.f14043OooO0O0.OooOOO0(10);
                            } else {
                                int iOooO0oO3 = this.f14043OooO0O0.OooO0oO(2) + 1;
                                if (iOooO0oO3 != 2) {
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(iOooO0oO3);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                    iOooO0oO3 = 2;
                                }
                                this.f14043OooO0O0.OooOOO0(5);
                                int iOooO0oO4 = this.f14043OooO0O0.OooO0oO(3);
                                int i19 = this.f14053OooOOO;
                                byte[] bArr4 = {(byte) (((iOooO0oO3 << 3) & 248) | ((i19 >> 1) & 7)), (byte) (((i19 << 7) & 128) | ((iOooO0oO4 << 3) & 120))};
                                AacUtil.OooO00o oooO00oOooO0Oo = AacUtil.OooO0Oo(bArr4);
                                Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
                                oooO0O0.f13154OooO00o = this.f14047OooO0o0;
                                oooO0O0.f13163OooOO0O = "audio/mp4a-latm";
                                oooO0O0.f13161OooO0oo = oooO00oOooO0Oo.f13471OooO0OO;
                                oooO0O0.f13172OooOo = oooO00oOooO0Oo.f13470OooO0O0;
                                oooO0O0.f13178OooOoO0 = oooO00oOooO0Oo.f13469OooO00o;
                                oooO0O0.f13166OooOOO0 = Collections.singletonList(bArr4);
                                oooO0O0.f13156OooO0OO = this.f14045OooO0Oo;
                                Format format = new Format(oooO0O0);
                                this.f14058OooOOo0 = 1024000000 / ((long) format.f13152ooOO);
                                this.f14046OooO0o.OooO0o0(format);
                                this.f14056OooOOOo = true;
                            }
                            this.f14043OooO0O0.OooOOO0(4);
                            int iOooO0oO5 = (this.f14043OooO0O0.OooO0oO(13) - 2) - 5;
                            if (this.f14051OooOO0O) {
                                iOooO0oO5 -= 2;
                            }
                            TrackOutput trackOutput = this.f14046OooO0o;
                            long j = this.f14058OooOOo0;
                            this.f14049OooO0oo = 4;
                            this.f14041OooO = 0;
                            this.f14061OooOo00 = trackOutput;
                            this.f14060OooOo0 = j;
                            this.f14057OooOOo = iOooO0oO5;
                        }
                    } else {
                        if (i12 != 4) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(i11, this.f14057OooOOo - this.f14041OooO);
                        this.f14061OooOo00.OooO0OO(o000Var, iMin);
                        int i20 = this.f14041OooO + iMin;
                        this.f14041OooO = i20;
                        int i21 = this.f14057OooOOo;
                        if (i20 == i21) {
                            this.f14061OooOo00.OooO0Oo(this.f14059OooOOoo, 1, i21, 0, null);
                            this.f14059OooOOoo += this.f14060OooOo0;
                            OooO0oo();
                        }
                    }
                } else if (OooO0o(o000Var, this.f14044OooO0OO.f36661OooO00o, 10)) {
                    this.f14048OooO0oO.OooO0OO(this.f14044OooO0OO, 10);
                    this.f14044OooO0OO.OooOoOO(6);
                    TrackOutput trackOutput2 = this.f14048OooO0oO;
                    int iOooOOOo = this.f14044OooO0OO.OooOOOo() + 10;
                    this.f14049OooO0oo = 4;
                    this.f14041OooO = 10;
                    this.f14061OooOo00 = trackOutput2;
                    this.f14060OooOo0 = 0L;
                    this.f14057OooOOo = iOooOOOo;
                }
            } else if (i11 != 0) {
                o0000OO0 o0000oo1 = this.f14043OooO0O0;
                o0000oo1.f36700OooO00o[0] = o000Var.f36661OooO00o[i10];
                o0000oo1.OooOO0O(2);
                int iOooO0oO6 = this.f14043OooO0O0.OooO0oO(4);
                int i22 = this.f14053OooOOO;
                if (i22 == -1 || iOooO0oO6 == i22) {
                    if (!this.f14052OooOO0o) {
                        this.f14052OooOO0o = true;
                        this.f14054OooOOO0 = this.f14055OooOOOO;
                        this.f14053OooOOO = iOooO0oO6;
                    }
                    this.f14049OooO0oo = 3;
                    this.f14041OooO = 0;
                } else {
                    this.f14052OooOO0o = false;
                    OooO0oo();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0() {
        this.f14052OooOO0o = false;
        OooO0oo();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(long j, int i) {
        this.f14059OooOOoo = j;
    }

    public final boolean OooO0o(o000 o000Var, byte[] bArr, int i) {
        int iMin = Math.min(o000Var.f36663OooO0OO - o000Var.f36662OooO0O0, i - this.f14041OooO);
        o000Var.OooO0OO(bArr, this.f14041OooO, iMin);
        int i2 = this.f14041OooO + iMin;
        this.f14041OooO = i2;
        return i2 == i;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0(p296o0O0OoO0.o0OoOo0 o0oooo1, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        this.f14047OooO0o0 = oooO0o.OooO0O0();
        TrackOutput trackOutputOooO00o = o0oooo1.OooO00o(oooO0o.OooO0OO());
        this.f14046OooO0o = trackOutputOooO00o;
        this.f14061OooOo00 = trackOutputOooO00o;
        if (!this.f14042OooO00o) {
            this.f14048OooO0oO = new com.google.android.exoplayer2.extractor.OooO0O0();
            return;
        }
        oooO0o.OooO00o();
        TrackOutput trackOutputOooO00o2 = o0oooo1.OooO00o(oooO0o.OooO0OO());
        this.f14048OooO0oO = trackOutputOooO00o2;
        Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
        oooO0O0.f13154OooO00o = oooO0o.OooO0O0();
        oooO0O0.f13163OooOO0O = "application/id3";
        trackOutputOooO00o2.OooO0o0(new Format(oooO0O0));
    }

    public final void OooO0oo() {
        this.f14049OooO0oo = 0;
        this.f14041OooO = 0;
        this.f14050OooOO0 = 256;
    }
}
