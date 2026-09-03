package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o000;
import p080o000OoO.o000O000;
import p080o000OoO.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o00O0O implements TsPayloadReader {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f9143OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0 f9144OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f9145OooO0O0 = new o000(new byte[10], 10);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f9146OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f9147OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f9148OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o000O0Oo f9149OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f9150OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f9151OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f9152OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f9153OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f9154OooOO0o;

    public o00O0O(OooOOO0 oooOOO0) {
        this.f9144OooO00o = oooOOO0;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void OooO00o(o000O0Oo o000o0oo2, o000OOoO.Oooo0 oooo0, TsPayloadReader.OooO0o oooO0o) {
        this.f9149OooO0o0 = o000o0oo2;
        this.f9144OooO00o.OooO0o(oooo0, oooO0o);
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void OooO0O0() {
        this.f9146OooO0OO = 0;
        this.f9147OooO0Oo = 0;
        this.f9151OooO0oo = false;
        this.f9144OooO00o.OooO0O0();
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void OooO0OO(int i, o000O000 o000o001) throws ParserException {
        boolean z;
        p080o000OoO.o00Oo0.OooO0o(this.f9149OooO0o0);
        int i2 = i & 1;
        OooOOO0 oooOOO0 = this.f9144OooO00o;
        int i3 = -1;
        int i4 = 3;
        int i5 = 2;
        if (i2 != 0) {
            int i6 = this.f9146OooO0OO;
            if (i6 != 0 && i6 != 1) {
                if (i6 == 2) {
                    Log.OooO0o("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i6 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f9152OooOO0 != -1) {
                        Log.OooO0o("PesReader", "Unexpected start indicator: expected " + this.f9152OooOO0 + " more bytes");
                    }
                    oooOOO0.OooO0Oo();
                }
            }
            this.f9146OooO0OO = 1;
            this.f9147OooO0Oo = 0;
        }
        int i7 = i;
        while (true) {
            int i8 = o000o001.f34964OooO0OO;
            int i9 = o000o001.f34963OooO0O0;
            int i10 = i8 - i9;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f9146OooO0OO;
            if (i11 != 0) {
                o000 o000Var = this.f9145OooO0O0;
                if (i11 != 1) {
                    if (i11 == i5) {
                        if (OooO0Oo(Math.min(10, this.f9143OooO), o000o001, o000Var.f34922OooO00o) && OooO0Oo(this.f9143OooO, o000o001, null)) {
                            o000Var.OooOO0O(0);
                            this.f9154OooOO0o = -9223372036854775807L;
                            if (this.f9148OooO0o) {
                                o000Var.OooOOO0(4);
                                long jOooO0oO = ((long) o000Var.OooO0oO(i4)) << 30;
                                o000Var.OooOOO0(1);
                                long jOooO0oO2 = jOooO0oO | ((long) (o000Var.OooO0oO(15) << 15));
                                o000Var.OooOOO0(1);
                                long jOooO0oO3 = jOooO0oO2 | ((long) o000Var.OooO0oO(15));
                                o000Var.OooOOO0(1);
                                if (!this.f9151OooO0oo && this.f9150OooO0oO) {
                                    o000Var.OooOOO0(4);
                                    long jOooO0oO4 = ((long) o000Var.OooO0oO(3)) << 30;
                                    o000Var.OooOOO0(1);
                                    long jOooO0oO5 = ((long) (o000Var.OooO0oO(15) << 15)) | jOooO0oO4;
                                    o000Var.OooOOO0(1);
                                    long jOooO0oO6 = jOooO0oO5 | ((long) o000Var.OooO0oO(15));
                                    o000Var.OooOOO0(1);
                                    this.f9149OooO0o0.OooO0O0(jOooO0oO6);
                                    this.f9151OooO0oo = true;
                                }
                                this.f9154OooOO0o = this.f9149OooO0o0.OooO0O0(jOooO0oO3);
                            }
                            i7 |= this.f9153OooOO0O ? 4 : 0;
                            oooOOO0.OooO0o0(i7, this.f9154OooOO0o);
                            i4 = 3;
                            this.f9146OooO0OO = 3;
                            this.f9147OooO0Oo = 0;
                        }
                        i3 = -1;
                        i5 = 2;
                    } else {
                        if (i11 != i4) {
                            throw new IllegalStateException();
                        }
                        int i12 = this.f9152OooOO0;
                        int i13 = i12 == i3 ? 0 : i10 - i12;
                        if (i13 > 0) {
                            i10 -= i13;
                            o000o001.Oooo000(i9 + i10);
                        }
                        oooOOO0.OooO0OO(o000o001);
                        int i14 = this.f9152OooOO0;
                        if (i14 != i3) {
                            int i15 = i14 - i10;
                            this.f9152OooOO0 = i15;
                            if (i15 == 0) {
                                oooOOO0.OooO0Oo();
                                this.f9146OooO0OO = 1;
                                this.f9147OooO0Oo = 0;
                            }
                        }
                    }
                } else if (OooO0Oo(9, o000o001, o000Var.f34922OooO00o)) {
                    o000Var.OooOO0O(0);
                    int iOooO0oO = o000Var.OooO0oO(24);
                    if (iOooO0oO != 1) {
                        p070o000O0o.Oooo000.OooO00o("Unexpected start code prefix: ", iOooO0oO, "PesReader");
                        i3 = -1;
                        this.f9152OooOO0 = -1;
                        i5 = 2;
                        z = false;
                    } else {
                        o000Var.OooOOO0(8);
                        int iOooO0oO2 = o000Var.OooO0oO(16);
                        o000Var.OooOOO0(5);
                        this.f9153OooOO0O = o000Var.OooO0o();
                        o000Var.OooOOO0(2);
                        this.f9148OooO0o = o000Var.OooO0o();
                        this.f9150OooO0oO = o000Var.OooO0o();
                        o000Var.OooOOO0(6);
                        int iOooO0oO3 = o000Var.OooO0oO(8);
                        this.f9143OooO = iOooO0oO3;
                        if (iOooO0oO2 == 0) {
                            i3 = -1;
                            this.f9152OooOO0 = -1;
                        } else {
                            int i16 = ((iOooO0oO2 + 6) - 9) - iOooO0oO3;
                            this.f9152OooOO0 = i16;
                            if (i16 < 0) {
                                Log.OooO0o("PesReader", "Found negative packet payload size: " + this.f9152OooOO0);
                                i3 = -1;
                                this.f9152OooOO0 = -1;
                            } else {
                                i3 = -1;
                            }
                        }
                        i5 = 2;
                        z = true;
                    }
                    this.f9146OooO0OO = z ? i5 : 0;
                    this.f9147OooO0Oo = 0;
                } else {
                    i3 = -1;
                    i5 = 2;
                }
            } else {
                o000o001.Oooo00o(i10);
            }
        }
    }

    public final boolean OooO0Oo(int i, o000O000 o000o001, @Nullable byte[] bArr) {
        int iMin = Math.min(o000o001.f34964OooO0OO - o000o001.f34963OooO0O0, i - this.f9147OooO0Oo);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            o000o001.Oooo00o(iMin);
        } else {
            o000o001.OooO0Oo(this.f9147OooO0Oo, iMin, bArr);
        }
        int i2 = this.f9147OooO0Oo + iMin;
        this.f9147OooO0Oo = i2;
        return i2 == i;
    }
}
