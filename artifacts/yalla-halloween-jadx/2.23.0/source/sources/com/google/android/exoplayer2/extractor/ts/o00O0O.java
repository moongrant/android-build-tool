package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Log;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O0000O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0O implements TsPayloadReader {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f12376OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0 f12377OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OOOOo f12378OooO0O0 = new o00OOOOo(new byte[10], 10);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f12379OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f12380OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f12381OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0O0000O f12382OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f12383OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f12384OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f12385OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f12386OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f12387OooOO0o;

    public o00O0O(OooOOO0 oooOOO0) {
        this.f12377OooO00o = oooOOO0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void OooO00o(o0O0000O o0o0000o2, o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        this.f12382OooO0o0 = o0o0000o2;
        this.f12377OooO00o.OooO0Oo(o00o0o0, oooO0o);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void OooO0O0(int i, o00Oo00 o00oo00) throws ParserException {
        boolean z;
        o00O000o.OooO0o0(this.f12382OooO0o0);
        int i2 = i & 1;
        OooOOO0 oooOOO0 = this.f12377OooO00o;
        int i3 = -1;
        int i4 = 3;
        int i5 = 2;
        if (i2 != 0) {
            int i6 = this.f12379OooO0OO;
            if (i6 != 0 && i6 != 1) {
                if (i6 == 2) {
                    Log.OooO0o("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i6 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f12385OooOO0 != -1) {
                        Log.OooO0o("PesReader", "Unexpected start indicator: expected " + this.f12385OooOO0 + " more bytes");
                    }
                    oooOOO0.OooO0o0();
                }
            }
            this.f12379OooO0OO = 1;
            this.f12380OooO0Oo = 0;
        }
        int i7 = i;
        while (true) {
            int i8 = o00oo00.f40593OooO0OO;
            int i9 = o00oo00.f40592OooO0O0;
            int i10 = i8 - i9;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f12379OooO0OO;
            if (i11 != 0) {
                o00OOOOo o00ooooo2 = this.f12378OooO0O0;
                if (i11 != 1) {
                    if (i11 == i5) {
                        if (OooO0Oo(Math.min(10, this.f12376OooO), o00oo00, o00ooooo2.f40584OooO00o) && OooO0Oo(this.f12376OooO, o00oo00, null)) {
                            o00ooooo2.OooOO0O(0);
                            this.f12387OooOO0o = -9223372036854775807L;
                            if (this.f12381OooO0o) {
                                o00ooooo2.OooOOO0(4);
                                long jOooO0oO = ((long) o00ooooo2.OooO0oO(i4)) << 30;
                                o00ooooo2.OooOOO0(1);
                                long jOooO0oO2 = jOooO0oO | ((long) (o00ooooo2.OooO0oO(15) << 15));
                                o00ooooo2.OooOOO0(1);
                                long jOooO0oO3 = jOooO0oO2 | ((long) o00ooooo2.OooO0oO(15));
                                o00ooooo2.OooOOO0(1);
                                if (!this.f12384OooO0oo && this.f12383OooO0oO) {
                                    o00ooooo2.OooOOO0(4);
                                    long jOooO0oO4 = ((long) o00ooooo2.OooO0oO(3)) << 30;
                                    o00ooooo2.OooOOO0(1);
                                    long jOooO0oO5 = ((long) (o00ooooo2.OooO0oO(15) << 15)) | jOooO0oO4;
                                    o00ooooo2.OooOOO0(1);
                                    long jOooO0oO6 = jOooO0oO5 | ((long) o00ooooo2.OooO0oO(15));
                                    o00ooooo2.OooOOO0(1);
                                    this.f12382OooO0o0.OooO0O0(jOooO0oO6);
                                    this.f12384OooO0oo = true;
                                }
                                this.f12387OooOO0o = this.f12382OooO0o0.OooO0O0(jOooO0oO3);
                            }
                            i7 |= this.f12386OooOO0O ? 4 : 0;
                            oooOOO0.OooO0o(i7, this.f12387OooOO0o);
                            i4 = 3;
                            this.f12379OooO0OO = 3;
                            this.f12380OooO0Oo = 0;
                        }
                        i3 = -1;
                        i5 = 2;
                    } else {
                        if (i11 != i4) {
                            throw new IllegalStateException();
                        }
                        int i12 = this.f12385OooOO0;
                        int i13 = i12 == i3 ? 0 : i10 - i12;
                        if (i13 > 0) {
                            i10 -= i13;
                            o00oo00.Oooo000(i9 + i10);
                        }
                        oooOOO0.OooO0O0(o00oo00);
                        int i14 = this.f12385OooOO0;
                        if (i14 != i3) {
                            int i15 = i14 - i10;
                            this.f12385OooOO0 = i15;
                            if (i15 == 0) {
                                oooOOO0.OooO0o0();
                                this.f12379OooO0OO = 1;
                                this.f12380OooO0Oo = 0;
                            }
                        }
                    }
                } else if (OooO0Oo(9, o00oo00, o00ooooo2.f40584OooO00o)) {
                    o00ooooo2.OooOO0O(0);
                    int iOooO0oO = o00ooooo2.OooO0oO(24);
                    if (iOooO0oO != 1) {
                        p101o000oo.Oooo000.OooO0O0("Unexpected start code prefix: ", iOooO0oO, "PesReader");
                        i3 = -1;
                        this.f12385OooOO0 = -1;
                        i5 = 2;
                        z = false;
                    } else {
                        o00ooooo2.OooOOO0(8);
                        int iOooO0oO2 = o00ooooo2.OooO0oO(16);
                        o00ooooo2.OooOOO0(5);
                        this.f12386OooOO0O = o00ooooo2.OooO0o();
                        o00ooooo2.OooOOO0(2);
                        this.f12381OooO0o = o00ooooo2.OooO0o();
                        this.f12383OooO0oO = o00ooooo2.OooO0o();
                        o00ooooo2.OooOOO0(6);
                        int iOooO0oO3 = o00ooooo2.OooO0oO(8);
                        this.f12376OooO = iOooO0oO3;
                        if (iOooO0oO2 == 0) {
                            i3 = -1;
                            this.f12385OooOO0 = -1;
                        } else {
                            int i16 = ((iOooO0oO2 + 6) - 9) - iOooO0oO3;
                            this.f12385OooOO0 = i16;
                            if (i16 < 0) {
                                Log.OooO0o("PesReader", "Found negative packet payload size: " + this.f12385OooOO0);
                                i3 = -1;
                                this.f12385OooOO0 = -1;
                            } else {
                                i3 = -1;
                            }
                        }
                        i5 = 2;
                        z = true;
                    }
                    this.f12379OooO0OO = z ? i5 : 0;
                    this.f12380OooO0Oo = 0;
                } else {
                    i3 = -1;
                    i5 = 2;
                }
            } else {
                o00oo00.Oooo00o(i10);
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void OooO0OO() {
        this.f12379OooO0OO = 0;
        this.f12380OooO0Oo = 0;
        this.f12384OooO0oo = false;
        this.f12377OooO00o.OooO0OO();
    }

    public final boolean OooO0Oo(int i, o00Oo00 o00oo00, @Nullable byte[] bArr) {
        int iMin = Math.min(o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0, i - this.f12380OooO0Oo);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            o00oo00.Oooo00o(iMin);
        } else {
            o00oo00.OooO0Oo(this.f12380OooO0Oo, iMin, bArr);
        }
        int i2 = this.f12380OooO0Oo + iMin;
        this.f12380OooO0Oo = i2;
        return i2 == i;
    }
}
