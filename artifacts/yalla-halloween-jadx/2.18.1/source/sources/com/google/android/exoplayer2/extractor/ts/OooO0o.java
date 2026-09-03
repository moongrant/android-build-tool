package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f14080OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000OO0 f14081OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f14082OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f14083OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f14084OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f14085OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public TrackOutput f14086OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f14087OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f14088OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f14089OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Format f14090OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f14091OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f14092OooOOO0;

    public OooO0o(@Nullable String str) {
        o0000OO0 o0000oo1 = new o0000OO0(new byte[16], 16);
        this.f14081OooO00o = o0000oo1;
        this.f14082OooO0O0 = new o000(o0000oo1.f36700OooO00o);
        this.f14085OooO0o = 0;
        this.f14087OooO0oO = 0;
        this.f14088OooO0oo = false;
        this.f14080OooO = false;
        this.f14083OooO0OO = str;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO00o(o000 o000Var) {
        boolean z;
        o00000O0.OooO0o(this.f14086OooO0o0);
        while (true) {
            int i = o000Var.f36663OooO0OO - o000Var.f36662OooO0O0;
            if (i <= 0) {
                return;
            }
            int i2 = this.f14085OooO0o;
            if (i2 == 0) {
                while (true) {
                    if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 <= 0) {
                        z = false;
                        break;
                    }
                    if (this.f14088OooO0oo) {
                        int iOooOOo0 = o000Var.OooOOo0();
                        this.f14088OooO0oo = iOooOOo0 == 172;
                        if (iOooOOo0 == 64 || iOooOOo0 == 65) {
                            this.f14080OooO = iOooOOo0 == 65;
                            z = true;
                            break;
                        }
                    } else {
                        this.f14088OooO0oo = o000Var.OooOOo0() == 172;
                    }
                }
                if (z) {
                    this.f14085OooO0o = 1;
                    byte[] bArr = this.f14082OooO0O0.f36661OooO00o;
                    bArr[0] = -84;
                    bArr[1] = (byte) (this.f14080OooO ? 65 : 64);
                    this.f14087OooO0oO = 2;
                }
            } else if (i2 == 1) {
                byte[] bArr2 = this.f14082OooO0O0.f36661OooO00o;
                int iMin = Math.min(i, 16 - this.f14087OooO0oO);
                o000Var.OooO0OO(bArr2, this.f14087OooO0oO, iMin);
                int i3 = this.f14087OooO0oO + iMin;
                this.f14087OooO0oO = i3;
                if (i3 == 16) {
                    this.f14081OooO00o.OooOO0O(0);
                    o0O0Oo0O.OooOO0O.OooO00o oooO00oOooO0O0 = p293o0O0Oo0O.OooOO0O.OooO0O0(this.f14081OooO00o);
                    Format format = this.f14090OooOO0O;
                    if (format == null || 2 != format.f13150o0OoOo0 || oooO00oOooO0O0.f35736OooO00o != format.f13152ooOO || !"audio/ac4".equals(format.f13131OoooOOo)) {
                        Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
                        oooO0O0.f13154OooO00o = this.f14084OooO0Oo;
                        oooO0O0.f13163OooOO0O = "audio/ac4";
                        oooO0O0.f13172OooOo = 2;
                        oooO0O0.f13178OooOoO0 = oooO00oOooO0O0.f35736OooO00o;
                        oooO0O0.f13156OooO0OO = this.f14083OooO0OO;
                        Format format2 = new Format(oooO0O0);
                        this.f14090OooOO0O = format2;
                        this.f14086OooO0o0.OooO0o0(format2);
                    }
                    this.f14091OooOO0o = oooO00oOooO0O0.f35737OooO0O0;
                    this.f14089OooOO0 = (((long) oooO00oOooO0O0.f35738OooO0OO) * 1000000) / ((long) this.f14090OooOO0O.f13152ooOO);
                    this.f14082OooO0O0.OooOoOO(0);
                    this.f14086OooO0o0.OooO0OO(this.f14082OooO0O0, 16);
                    this.f14085OooO0o = 2;
                }
            } else if (i2 == 2) {
                int iMin2 = Math.min(i, this.f14091OooOO0o - this.f14087OooO0oO);
                this.f14086OooO0o0.OooO0OO(o000Var, iMin2);
                int i4 = this.f14087OooO0oO + iMin2;
                this.f14087OooO0oO = i4;
                int i5 = this.f14091OooOO0o;
                if (i4 == i5) {
                    this.f14086OooO0o0.OooO0Oo(this.f14092OooOOO0, 1, i5, 0, null);
                    this.f14092OooOOO0 += this.f14089OooOO0;
                    this.f14085OooO0o = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0() {
        this.f14085OooO0o = 0;
        this.f14087OooO0oO = 0;
        this.f14088OooO0oo = false;
        this.f14080OooO = false;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(long j, int i) {
        this.f14092OooOOO0 = j;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0(p296o0O0OoO0.o0OoOo0 o0oooo1, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        this.f14084OooO0Oo = oooO0o.OooO0O0();
        this.f14086OooO0o0 = o0oooo1.OooO00o(oooO0o.OooO0OO());
    }
}
