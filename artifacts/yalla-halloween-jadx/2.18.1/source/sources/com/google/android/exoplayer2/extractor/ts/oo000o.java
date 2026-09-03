package com.google.android.exoplayer2.extractor.ts;

import com.umeng.analytics.pro.o;
import kotlin.KotlinVersion;
import kotlin.UByte;
import p318o0O0oOo.o000;
import p318o0O0oOo.o000O0O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements TsPayloadReader {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Ooo f14346OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f14347OooO0O0 = new o000(32);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f14348OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f14349OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f14350OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f14351OooO0o0;

    public oo000o(o00Ooo o00ooo2) {
        this.f14346OooO00o = o00ooo2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void OooO00o(o000 o000Var, int i) {
        boolean z = (i & 1) != 0;
        int iOooOOo0 = z ? o000Var.f36662OooO0O0 + o000Var.OooOOo0() : -1;
        if (this.f14350OooO0o) {
            if (!z) {
                return;
            }
            this.f14350OooO0o = false;
            o000Var.OooOoOO(iOooOOo0);
            this.f14349OooO0Oo = 0;
        }
        while (true) {
            int i2 = o000Var.f36663OooO0OO;
            int i3 = o000Var.f36662OooO0O0;
            if (i2 - i3 <= 0) {
                return;
            }
            int i4 = this.f14349OooO0Oo;
            if (i4 < 3) {
                if (i4 == 0) {
                    int iOooOOo1 = o000Var.OooOOo0();
                    o000Var.OooOoOO(o000Var.f36662OooO0O0 - 1);
                    if (iOooOOo1 == 255) {
                        this.f14350OooO0o = true;
                        return;
                    }
                }
                int iMin = Math.min(o000Var.f36663OooO0OO - o000Var.f36662OooO0O0, 3 - this.f14349OooO0Oo);
                o000Var.OooO0OO(this.f14347OooO0O0.f36661OooO00o, this.f14349OooO0Oo, iMin);
                int i5 = this.f14349OooO0Oo + iMin;
                this.f14349OooO0Oo = i5;
                if (i5 == 3) {
                    this.f14347OooO0O0.OooOo(3);
                    this.f14347OooO0O0.OooOoo0(1);
                    int iOooOOo2 = this.f14347OooO0O0.OooOOo0();
                    int iOooOOo3 = this.f14347OooO0O0.OooOOo0();
                    this.f14351OooO0o0 = (iOooOOo2 & 128) != 0;
                    int i6 = (((iOooOOo2 & 15) << 8) | iOooOOo3) + 3;
                    this.f14348OooO0OO = i6;
                    o000 o000Var2 = this.f14347OooO0O0;
                    byte[] bArr = o000Var2.f36661OooO00o;
                    if (bArr.length < i6) {
                        o000Var2.OooOo(Math.min(o.a.b, Math.max(i6, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f14347OooO0O0.f36661OooO00o, 0, 3);
                    }
                }
            } else {
                int iMin2 = Math.min(i2 - i3, this.f14348OooO0OO - i4);
                o000Var.OooO0OO(this.f14347OooO0O0.f36661OooO00o, this.f14349OooO0Oo, iMin2);
                int i7 = this.f14349OooO0Oo + iMin2;
                this.f14349OooO0Oo = i7;
                int i8 = this.f14348OooO0OO;
                if (i7 != i8) {
                    continue;
                } else {
                    if (this.f14351OooO0o0) {
                        byte[] bArr2 = this.f14347OooO0O0.f36661OooO00o;
                        int i9 = o000OOo0.f36740OooO00o;
                        int i10 = -1;
                        for (int i11 = 0; i11 < i8; i11++) {
                            i10 = o000OOo0.f36748OooOO0[((i10 >>> 24) ^ (bArr2[i11] & UByte.MAX_VALUE)) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i10 << 8);
                        }
                        if (i10 != 0) {
                            this.f14350OooO0o = true;
                            return;
                        }
                        this.f14347OooO0O0.OooOo(this.f14348OooO0OO - 4);
                    } else {
                        this.f14347OooO0O0.OooOo(i8);
                    }
                    this.f14346OooO00o.OooO00o(this.f14347OooO0O0);
                    this.f14349OooO0Oo = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void OooO0O0() {
        this.f14350OooO0o = true;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void OooO0OO(o000O0O0 o000o0o1, p296o0O0OoO0.o0OoOo0 o0oooo1, TsPayloadReader.OooO0o oooO0o) {
        this.f14346OooO00o.OooO0OO(o000o0o1, o0oooo1, oooO0o);
        this.f14350OooO0o = true;
    }
}
