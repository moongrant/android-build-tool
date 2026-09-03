package com.google.android.exoplayer2.extractor.ts;

import kotlin.UByte;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;
import p245o00oo0o.o0O0000O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oo000o implements TsPayloadReader {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Ooo f12413OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo00 f12414OooO0O0 = new o00Oo00(32);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f12415OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f12416OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f12417OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f12418OooO0o0;

    public oo000o(o00Ooo o00ooo2) {
        this.f12413OooO00o = o00ooo2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void OooO00o(o0O0000O o0o0000o2, o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        this.f12413OooO00o.OooO00o(o0o0000o2, o00o0o0, oooO0o);
        this.f12417OooO0o = true;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void OooO0O0(int i, o00Oo00 o00oo00) {
        boolean z = (i & 1) != 0;
        int iOooOo0O = z ? o00oo00.f40592OooO0O0 + o00oo00.OooOo0O() : -1;
        if (this.f12417OooO0o) {
            if (!z) {
                return;
            }
            this.f12417OooO0o = false;
            o00oo00.Oooo00O(iOooOo0O);
            this.f12416OooO0Oo = 0;
        }
        while (true) {
            int i2 = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
            if (i2 <= 0) {
                return;
            }
            int i3 = this.f12416OooO0Oo;
            o00Oo00 o00oo01 = this.f12414OooO0O0;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iOooOo0O2 = o00oo00.OooOo0O();
                    o00oo00.Oooo00O(o00oo00.f40592OooO0O0 - 1);
                    if (iOooOo0O2 == 255) {
                        this.f12417OooO0o = true;
                        return;
                    }
                }
                int iMin = Math.min(o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0, 3 - this.f12416OooO0Oo);
                o00oo00.OooO0Oo(this.f12416OooO0Oo, iMin, o00oo01.f40591OooO00o);
                int i4 = this.f12416OooO0Oo + iMin;
                this.f12416OooO0Oo = i4;
                if (i4 == 3) {
                    o00oo01.Oooo00O(0);
                    o00oo01.Oooo000(3);
                    o00oo01.Oooo00o(1);
                    int iOooOo0O3 = o00oo01.OooOo0O();
                    int iOooOo0O4 = o00oo01.OooOo0O();
                    this.f12418OooO0o0 = (iOooOo0O3 & 128) != 0;
                    int i5 = (((iOooOo0O3 & 15) << 8) | iOooOo0O4) + 3;
                    this.f12415OooO0OO = i5;
                    byte[] bArr = o00oo01.f40591OooO00o;
                    if (bArr.length < i5) {
                        o00oo01.OooO00o(Math.min(4098, Math.max(i5, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(i2, this.f12415OooO0OO - i3);
                o00oo00.OooO0Oo(this.f12416OooO0Oo, iMin2, o00oo01.f40591OooO00o);
                int i6 = this.f12416OooO0Oo + iMin2;
                this.f12416OooO0Oo = i6;
                int i7 = this.f12415OooO0OO;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.f12418OooO0o0) {
                        byte[] bArr2 = o00oo01.f40591OooO00o;
                        int i8 = o0O00.f40595OooO00o;
                        int i9 = -1;
                        for (int i10 = 0; i10 < i7; i10++) {
                            i9 = o0O00.f40606OooOOO[((i9 >>> 24) ^ (bArr2[i10] & UByte.MAX_VALUE)) & 255] ^ (i9 << 8);
                        }
                        if (i9 != 0) {
                            this.f12417OooO0o = true;
                            return;
                        }
                        o00oo01.Oooo000(this.f12415OooO0OO - 4);
                    } else {
                        o00oo01.Oooo000(i7);
                    }
                    o00oo01.Oooo00O(0);
                    this.f12413OooO00o.OooO0O0(o00oo01);
                    this.f12416OooO0Oo = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void OooO0OO() {
        this.f12417OooO0o = true;
    }
}
