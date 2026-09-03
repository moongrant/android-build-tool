package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000OO0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f14065OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000OO0 f14066OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f14067OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f14068OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f14069OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f14070OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public TrackOutput f14071OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f14072OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f14073OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Format f14074OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f14075OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f14076OooOO0o;

    public OooO0O0(@Nullable String str) {
        o0000OO0 o0000oo1 = new o0000OO0(new byte[128], 128);
        this.f14066OooO00o = o0000oo1;
        this.f14067OooO0O0 = new o000(o0000oo1.f36700OooO00o);
        this.f14070OooO0o = 0;
        this.f14068OooO0OO = str;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:126:0x0201  */
    /* JADX WARN: Code duplicated, block: B:133:0x0215 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x0217  */
    /* JADX WARN: Code duplicated, block: B:135:0x021b  */
    /* JADX WARN: Code duplicated, block: B:137:0x021e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0224  */
    /* JADX WARN: Code duplicated, block: B:253:0x0227 A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO00o(o000 o000Var) {
        int i;
        int i2;
        int i3;
        String str;
        int iOooO0oO;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        o00000O0.OooO0o(this.f14071OooO0o0);
        while (true) {
            int i13 = o000Var.f36663OooO0OO - o000Var.f36662OooO0O0;
            if (i13 <= 0) {
                return;
            }
            int i14 = this.f14070OooO0o;
            if (i14 == 0) {
                while (true) {
                    if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 <= 0) {
                        z = false;
                        break;
                    }
                    if (this.f14073OooO0oo) {
                        int iOooOOo0 = o000Var.OooOOo0();
                        if (iOooOOo0 == 119) {
                            this.f14073OooO0oo = false;
                            z = true;
                            break;
                        }
                        this.f14073OooO0oo = iOooOOo0 == 11;
                    } else {
                        this.f14073OooO0oo = o000Var.OooOOo0() == 11;
                    }
                }
                if (z) {
                    this.f14070OooO0o = 1;
                    byte[] bArr = this.f14067OooO0O0.f36661OooO00o;
                    bArr[0] = 11;
                    bArr[1] = 119;
                    this.f14072OooO0oO = 2;
                }
            } else if (i14 == 1) {
                byte[] bArr2 = this.f14067OooO0O0.f36661OooO00o;
                int iMin = Math.min(i13, 128 - this.f14072OooO0oO);
                o000Var.OooO0OO(bArr2, this.f14072OooO0oO, iMin);
                int i15 = this.f14072OooO0oO + iMin;
                this.f14072OooO0oO = i15;
                if (i15 == 128) {
                    this.f14066OooO00o.OooOO0O(0);
                    o0000OO0 o0000oo1 = this.f14066OooO00o;
                    int iOooO0o0 = o0000oo1.OooO0o0();
                    o0000oo1.OooOOO0(40);
                    boolean z2 = o0000oo1.OooO0oO(5) > 10;
                    o0000oo1.OooOO0O(iOooO0o0);
                    int i16 = -1;
                    if (z2) {
                        o0000oo1.OooOOO0(16);
                        int iOooO0oO2 = o0000oo1.OooO0oO(2);
                        if (iOooO0oO2 == 0) {
                            i16 = 0;
                        } else if (iOooO0oO2 == 1) {
                            i16 = 1;
                        } else if (iOooO0oO2 == 2) {
                            i16 = 2;
                        }
                        o0000oo1.OooOOO0(3);
                        iOooO0oO = (o0000oo1.OooO0oO(11) + 1) * 2;
                        int iOooO0oO3 = o0000oo1.OooO0oO(2);
                        if (iOooO0oO3 == 3) {
                            i6 = p293o0O0Oo0O.OooOO0.f35731OooO0OO[o0000oo1.OooO0oO(2)];
                            i5 = 6;
                            i4 = 3;
                        } else {
                            int iOooO0oO4 = o0000oo1.OooO0oO(2);
                            i4 = iOooO0oO4;
                            i5 = p293o0O0Oo0O.OooOO0.f35729OooO00o[iOooO0oO4];
                            i6 = p293o0O0Oo0O.OooOO0.f35730OooO0O0[iOooO0oO3];
                        }
                        i3 = i5 * 256;
                        int iOooO0oO5 = o0000oo1.OooO0oO(3);
                        boolean zOooO0o = o0000oo1.OooO0o();
                        i2 = p293o0O0Oo0O.OooOO0.f35732OooO0Oo[iOooO0oO5] + (zOooO0o ? 1 : 0);
                        o0000oo1.OooOOO0(10);
                        if (o0000oo1.OooO0o()) {
                            o0000oo1.OooOOO0(8);
                        }
                        if (iOooO0oO5 == 0) {
                            o0000oo1.OooOOO0(5);
                            if (o0000oo1.OooO0o()) {
                                o0000oo1.OooOOO0(8);
                            }
                        }
                        if (i16 == 1 && o0000oo1.OooO0o()) {
                            o0000oo1.OooOOO0(16);
                        }
                        if (o0000oo1.OooO0o()) {
                            if (iOooO0oO5 > 2) {
                                o0000oo1.OooOOO0(2);
                            }
                            if ((iOooO0oO5 & 1) == 0 || iOooO0oO5 <= 2) {
                                i9 = 6;
                            } else {
                                i9 = 6;
                                o0000oo1.OooOOO0(6);
                            }
                            if ((iOooO0oO5 & 4) != 0) {
                                o0000oo1.OooOOO0(i9);
                            }
                            if (zOooO0o && o0000oo1.OooO0o()) {
                                o0000oo1.OooOOO0(5);
                            }
                            if (i16 == 0) {
                                if (o0000oo1.OooO0o()) {
                                    i10 = 6;
                                    o0000oo1.OooOOO0(6);
                                } else {
                                    i10 = 6;
                                }
                                if (iOooO0oO5 == 0 && o0000oo1.OooO0o()) {
                                    o0000oo1.OooOOO0(i10);
                                }
                                if (o0000oo1.OooO0o()) {
                                    o0000oo1.OooOOO0(i10);
                                }
                                int iOooO0oO6 = o0000oo1.OooO0oO(2);
                                if (iOooO0oO6 == 1) {
                                    o0000oo1.OooOOO0(5);
                                } else if (iOooO0oO6 == 2) {
                                    o0000oo1.OooOOO0(12);
                                } else {
                                    if (iOooO0oO6 == 3) {
                                        int iOooO0oO7 = o0000oo1.OooO0oO(5);
                                        if (o0000oo1.OooO0o()) {
                                            o0000oo1.OooOOO0(5);
                                            if (o0000oo1.OooO0o()) {
                                                o0000oo1.OooOOO0(4);
                                            }
                                            if (o0000oo1.OooO0o()) {
                                                o0000oo1.OooOOO0(4);
                                            }
                                            if (o0000oo1.OooO0o()) {
                                                o0000oo1.OooOOO0(4);
                                            }
                                            if (o0000oo1.OooO0o()) {
                                                o0000oo1.OooOOO0(4);
                                            }
                                            if (o0000oo1.OooO0o()) {
                                                o0000oo1.OooOOO0(4);
                                            }
                                            if (o0000oo1.OooO0o()) {
                                                o0000oo1.OooOOO0(4);
                                            }
                                            if (o0000oo1.OooO0o()) {
                                                o0000oo1.OooOOO0(4);
                                            }
                                            if (o0000oo1.OooO0o()) {
                                                if (o0000oo1.OooO0o()) {
                                                    o0000oo1.OooOOO0(4);
                                                }
                                                if (o0000oo1.OooO0o()) {
                                                    o0000oo1.OooOOO0(4);
                                                }
                                            }
                                        }
                                        if (o0000oo1.OooO0o()) {
                                            o0000oo1.OooOOO0(5);
                                            if (o0000oo1.OooO0o()) {
                                                o0000oo1.OooOOO0(7);
                                                if (o0000oo1.OooO0o()) {
                                                    o0000oo1.OooOOO0(8);
                                                }
                                            }
                                        }
                                        i11 = 2;
                                        o0000oo1.OooOOO0((iOooO0oO7 + 2) * 8);
                                        o0000oo1.OooO0OO();
                                    }
                                    if (iOooO0oO5 < i11) {
                                        if (o0000oo1.OooO0o()) {
                                            o0000oo1.OooOOO0(14);
                                        }
                                        if (iOooO0oO5 == 0 && o0000oo1.OooO0o()) {
                                            o0000oo1.OooOOO0(14);
                                        }
                                    }
                                    if (o0000oo1.OooO0o()) {
                                        if (i4 == 0) {
                                            o0000oo1.OooOOO0(5);
                                        } else {
                                            for (i12 = 0; i12 < i5; i12++) {
                                                if (o0000oo1.OooO0o()) {
                                                    o0000oo1.OooOOO0(5);
                                                }
                                            }
                                        }
                                    }
                                }
                                i11 = 2;
                                if (iOooO0oO5 < i11) {
                                    if (o0000oo1.OooO0o()) {
                                        o0000oo1.OooOOO0(14);
                                    }
                                    if (iOooO0oO5 == 0) {
                                        o0000oo1.OooOOO0(14);
                                    }
                                }
                                if (o0000oo1.OooO0o()) {
                                    if (i4 == 0) {
                                        o0000oo1.OooOOO0(5);
                                    } else {
                                        while (i12 < i5) {
                                            if (o0000oo1.OooO0o()) {
                                                o0000oo1.OooOOO0(5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (o0000oo1.OooO0o()) {
                            o0000oo1.OooOOO0(5);
                            if (iOooO0oO5 == 2) {
                                o0000oo1.OooOOO0(4);
                            }
                            if (iOooO0oO5 >= 6) {
                                o0000oo1.OooOOO0(2);
                            }
                            if (o0000oo1.OooO0o()) {
                                i8 = 8;
                                o0000oo1.OooOOO0(8);
                            } else {
                                i8 = 8;
                            }
                            if (iOooO0oO5 == 0 && o0000oo1.OooO0o()) {
                                o0000oo1.OooOOO0(i8);
                            }
                            if (iOooO0oO3 < 3) {
                                o0000oo1.OooOO0o();
                            }
                        }
                        if (i16 == 0 && i4 != 3) {
                            o0000oo1.OooOO0o();
                        }
                        if (i16 == 2 && (i4 == 3 || o0000oo1.OooO0o())) {
                            i7 = 6;
                            o0000oo1.OooOOO0(6);
                        } else {
                            i7 = 6;
                        }
                        str = (o0000oo1.OooO0o() && o0000oo1.OooO0oO(i7) == 1 && o0000oo1.OooO0oO(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                        i16 = i6;
                    } else {
                        o0000oo1.OooOOO0(32);
                        int iOooO0oO8 = o0000oo1.OooO0oO(2);
                        String str2 = iOooO0oO8 == 3 ? null : "audio/ac3";
                        int iOooO00o = p293o0O0Oo0O.OooOO0.OooO00o(iOooO0oO8, o0000oo1.OooO0oO(6));
                        o0000oo1.OooOOO0(8);
                        int iOooO0oO9 = o0000oo1.OooO0oO(3);
                        if ((iOooO0oO9 & 1) == 0 || iOooO0oO9 == 1) {
                            i = 2;
                        } else {
                            i = 2;
                            o0000oo1.OooOOO0(2);
                        }
                        if ((iOooO0oO9 & 4) != 0) {
                            o0000oo1.OooOOO0(i);
                        }
                        if (iOooO0oO9 == i) {
                            o0000oo1.OooOOO0(i);
                        }
                        i16 = iOooO0oO8 < 3 ? p293o0O0Oo0O.OooOO0.f35730OooO0O0[iOooO0oO8] : -1;
                        i2 = p293o0O0Oo0O.OooOO0.f35732OooO0Oo[iOooO0oO9] + (o0000oo1.OooO0o() ? 1 : 0);
                        i3 = 1536;
                        str = str2;
                        iOooO0oO = iOooO00o;
                    }
                    int i17 = i2;
                    Format format = this.f14074OooOO0;
                    if (format == null || i17 != format.f13150o0OoOo0 || i16 != format.f13152ooOO || !o000OOo0.OooO00o(str, format.f13131OoooOOo)) {
                        Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
                        oooO0O0.f13154OooO00o = this.f14069OooO0Oo;
                        oooO0O0.f13163OooOO0O = str;
                        oooO0O0.f13172OooOo = i17;
                        oooO0O0.f13178OooOoO0 = i16;
                        oooO0O0.f13156OooO0OO = this.f14068OooO0OO;
                        Format format2 = new Format(oooO0O0);
                        this.f14074OooOO0 = format2;
                        this.f14071OooO0o0.OooO0o0(format2);
                    }
                    this.f14075OooOO0O = iOooO0oO;
                    this.f14065OooO = (((long) i3) * 1000000) / ((long) this.f14074OooOO0.f13152ooOO);
                    this.f14067OooO0O0.OooOoOO(0);
                    this.f14071OooO0o0.OooO0OO(this.f14067OooO0O0, 128);
                    this.f14070OooO0o = 2;
                }
            } else if (i14 == 2) {
                int iMin2 = Math.min(i13, this.f14075OooOO0O - this.f14072OooO0oO);
                this.f14071OooO0o0.OooO0OO(o000Var, iMin2);
                int i18 = this.f14072OooO0oO + iMin2;
                this.f14072OooO0oO = i18;
                int i19 = this.f14075OooOO0O;
                if (i18 == i19) {
                    this.f14071OooO0o0.OooO0Oo(this.f14076OooOO0o, 1, i19, 0, null);
                    this.f14076OooOO0o += this.f14065OooO;
                    this.f14070OooO0o = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0() {
        this.f14070OooO0o = 0;
        this.f14072OooO0oO = 0;
        this.f14073OooO0oo = false;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(long j, int i) {
        this.f14076OooOO0o = j;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0(p296o0O0OoO0.o0OoOo0 o0oooo1, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        this.f14069OooO0Oo = oooO0o.OooO0O0();
        this.f14071OooO0o0 = o0oooo1.OooO00o(oooO0o.OooO0OO());
    }
}
