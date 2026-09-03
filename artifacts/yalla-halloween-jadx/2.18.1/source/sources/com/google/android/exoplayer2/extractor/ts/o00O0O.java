package com.google.android.exoplayer2.extractor.ts;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000OO0;
import p318o0O0oOo.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O implements TsPayloadReader {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f14309OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0 f14310OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000OO0 f14311OooO0O0 = new o0000OO0(new byte[10], 10);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f14312OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f14313OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f14314OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o000O0O0 f14315OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f14316OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f14317OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f14318OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f14319OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f14320OooOO0o;

    public o00O0O(OooOOO0 oooOOO0) {
        this.f14310OooO00o = oooOOO0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void OooO00o(o000 o000Var, int i) throws ParserException {
        boolean z;
        o00000O0.OooO0o(this.f14315OooO0o0);
        int i2 = -1;
        int i3 = 3;
        if ((i & 1) != 0) {
            int i4 = this.f14312OooO0OO;
            if (i4 != 0 && i4 != 1) {
                if (i4 == 2) {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i4 != 3) {
                        throw new IllegalStateException();
                    }
                    int i5 = this.f14318OooOO0;
                    if (i5 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i5);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.f14310OooO00o.OooO0OO();
                }
            }
            OooO0o0(1);
        }
        while (true) {
            int i6 = o000Var.f36663OooO0OO;
            int i7 = o000Var.f36662OooO0O0;
            if (i6 - i7 <= 0) {
                return;
            }
            int i8 = this.f14312OooO0OO;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        if (OooO0Oo(o000Var, this.f14311OooO0O0.f36700OooO00o, Math.min(10, this.f14309OooO)) && OooO0Oo(o000Var, null, this.f14309OooO)) {
                            this.f14311OooO0O0.OooOO0O(0);
                            this.f14320OooOO0o = -9223372036854775807L;
                            if (this.f14314OooO0o) {
                                this.f14311OooO0O0.OooOOO0(4);
                                long jOooO0oO = ((long) this.f14311OooO0O0.OooO0oO(i3)) << 30;
                                this.f14311OooO0O0.OooOOO0(1);
                                long jOooO0oO2 = jOooO0oO | ((long) (this.f14311OooO0O0.OooO0oO(15) << 15));
                                this.f14311OooO0O0.OooOOO0(1);
                                long jOooO0oO3 = jOooO0oO2 | ((long) this.f14311OooO0O0.OooO0oO(15));
                                this.f14311OooO0O0.OooOOO0(1);
                                if (!this.f14317OooO0oo && this.f14316OooO0oO) {
                                    this.f14311OooO0O0.OooOOO0(4);
                                    long jOooO0oO4 = ((long) this.f14311OooO0O0.OooO0oO(3)) << 30;
                                    this.f14311OooO0O0.OooOOO0(1);
                                    long jOooO0oO5 = jOooO0oO4 | ((long) (this.f14311OooO0O0.OooO0oO(15) << 15));
                                    this.f14311OooO0O0.OooOOO0(1);
                                    long jOooO0oO6 = jOooO0oO5 | ((long) this.f14311OooO0O0.OooO0oO(15));
                                    this.f14311OooO0O0.OooOOO0(1);
                                    this.f14315OooO0o0.OooO0O0(jOooO0oO6);
                                    this.f14317OooO0oo = true;
                                }
                                this.f14320OooOO0o = this.f14315OooO0o0.OooO0O0(jOooO0oO3);
                            }
                            i |= this.f14319OooOO0O ? 4 : 0;
                            this.f14310OooO00o.OooO0Oo(this.f14320OooOO0o, i);
                            OooO0o0(3);
                        }
                    } else {
                        if (i8 != i3) {
                            throw new IllegalStateException();
                        }
                        int i9 = i6 - i7;
                        int i10 = this.f14318OooOO0;
                        int i11 = i10 != i2 ? i9 - i10 : 0;
                        if (i11 > 0) {
                            i9 -= i11;
                            o000Var.OooOoO(i7 + i9);
                        }
                        this.f14310OooO00o.OooO00o(o000Var);
                        int i12 = this.f14318OooOO0;
                        if (i12 != i2) {
                            int i13 = i12 - i9;
                            this.f14318OooOO0 = i13;
                            if (i13 == 0) {
                                this.f14310OooO00o.OooO0OO();
                                OooO0o0(1);
                            }
                        }
                    }
                } else if (OooO0Oo(o000Var, this.f14311OooO0O0.f36700OooO00o, 9)) {
                    this.f14311OooO0O0.OooOO0O(0);
                    int iOooO0oO = this.f14311OooO0O0.OooO0oO(24);
                    if (iOooO0oO != 1) {
                        o00O00O.OooO0OO.OooO0O0(41, "Unexpected start code prefix: ", iOooO0oO, "PesReader");
                        this.f14318OooOO0 = -1;
                        z = false;
                    } else {
                        this.f14311OooO0O0.OooOOO0(8);
                        int iOooO0oO2 = this.f14311OooO0O0.OooO0oO(16);
                        this.f14311OooO0O0.OooOOO0(5);
                        this.f14319OooOO0O = this.f14311OooO0O0.OooO0o();
                        this.f14311OooO0O0.OooOOO0(2);
                        this.f14314OooO0o = this.f14311OooO0O0.OooO0o();
                        this.f14316OooO0oO = this.f14311OooO0O0.OooO0o();
                        this.f14311OooO0O0.OooOOO0(6);
                        int iOooO0oO3 = this.f14311OooO0O0.OooO0oO(8);
                        this.f14309OooO = iOooO0oO3;
                        if (iOooO0oO2 == 0) {
                            this.f14318OooOO0 = -1;
                        } else {
                            int i14 = ((iOooO0oO2 + 6) - 9) - iOooO0oO3;
                            this.f14318OooOO0 = i14;
                            if (i14 < 0) {
                                o00O00O.OooO0OO.OooO0O0(47, "Found negative packet payload size: ", i14, "PesReader");
                                this.f14318OooOO0 = -1;
                            }
                        }
                        z = true;
                    }
                    OooO0o0(z ? 2 : 0);
                }
            } else {
                o000Var.OooOoo0(i6 - i7);
            }
            i2 = -1;
            i3 = 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void OooO0O0() {
        this.f14312OooO0OO = 0;
        this.f14313OooO0Oo = 0;
        this.f14317OooO0oo = false;
        this.f14310OooO00o.OooO0O0();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void OooO0OO(o000O0O0 o000o0o1, p296o0O0OoO0.o0OoOo0 o0oooo1, TsPayloadReader.OooO0o oooO0o) {
        this.f14315OooO0o0 = o000o0o1;
        this.f14310OooO00o.OooO0o0(o0oooo1, oooO0o);
    }

    public final boolean OooO0Oo(o000 o000Var, @Nullable byte[] bArr, int i) {
        int iMin = Math.min(o000Var.f36663OooO0OO - o000Var.f36662OooO0O0, i - this.f14313OooO0Oo);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            o000Var.OooOoo0(iMin);
        } else {
            o000Var.OooO0OO(bArr, this.f14313OooO0Oo, iMin);
        }
        int i2 = this.f14313OooO0Oo + iMin;
        this.f14313OooO0Oo = i2;
        return i2 == i;
    }

    public final void OooO0o0(int i) {
        this.f14312OooO0OO = i;
        this.f14313OooO0Oo = 0;
    }
}
