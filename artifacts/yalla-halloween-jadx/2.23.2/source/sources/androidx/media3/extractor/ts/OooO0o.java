package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import p080o000OoO.o000;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0o implements OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f8917OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000 f8918OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O000 f8919OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f8920OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f8921OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f8922OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public TrackOutput f8923OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f8924OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f8925OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f8926OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public androidx.media3.common.OooOO0 f8927OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f8928OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f8929OooOOO0;

    public OooO0o(@Nullable String str) {
        o000 o000Var = new o000(new byte[16], 16);
        this.f8918OooO00o = o000Var;
        this.f8919OooO0O0 = new o000O000(o000Var.f34922OooO00o);
        this.f8922OooO0o = 0;
        this.f8924OooO0oO = 0;
        this.f8925OooO0oo = false;
        this.f8917OooO = false;
        this.f8929OooOOO0 = -9223372036854775807L;
        this.f8920OooO0OO = str;
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0O0() {
        this.f8922OooO0o = 0;
        this.f8924OooO0oO = 0;
        this.f8925OooO0oo = false;
        this.f8917OooO = false;
        this.f8929OooOOO0 = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0OO(o000O000 o000o001) {
        boolean z;
        p080o000OoO.o00Oo0.OooO0o(this.f8923OooO0o0);
        while (true) {
            int i = o000o001.f34964OooO0OO - o000o001.f34963OooO0O0;
            if (i <= 0) {
                return;
            }
            int i2 = this.f8922OooO0o;
            o000O000 o000o002 = this.f8919OooO0O0;
            if (i2 == 0) {
                while (true) {
                    if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 <= 0) {
                        z = false;
                        break;
                    }
                    if (this.f8925OooO0oo) {
                        int iOooOo0O = o000o001.OooOo0O();
                        this.f8925OooO0oo = iOooOo0O == 172;
                        if (iOooOo0O == 64 || iOooOo0O == 65) {
                            this.f8917OooO = iOooOo0O == 65;
                            z = true;
                            break;
                        }
                    } else {
                        this.f8925OooO0oo = o000o001.OooOo0O() == 172;
                    }
                }
                if (z) {
                    this.f8922OooO0o = 1;
                    byte[] bArr = o000o002.f34962OooO00o;
                    bArr[0] = -84;
                    bArr[1] = (byte) (this.f8917OooO ? 65 : 64);
                    this.f8924OooO0oO = 2;
                }
            } else if (i2 == 1) {
                byte[] bArr2 = o000o002.f34962OooO00o;
                int iMin = Math.min(i, 16 - this.f8924OooO0oO);
                o000o001.OooO0Oo(this.f8924OooO0oO, iMin, bArr2);
                int i3 = this.f8924OooO0oO + iMin;
                this.f8924OooO0oO = i3;
                if (i3 == 16) {
                    o000 o000Var = this.f8918OooO00o;
                    o000Var.OooOO0O(0);
                    o000OOoO.OooO0O0.OooO00o oooO00oOooO0O0 = o000OOoO.OooO0O0.OooO0O0(o000Var);
                    androidx.media3.common.OooOO0 oooOO1 = this.f8927OooOO0O;
                    int i4 = oooO00oOooO0O0.f34633OooO00o;
                    if (oooOO1 == null || 2 != oooOO1.f6426OooOoo0 || i4 != oooOO1.f6425OooOoo || !"audio/ac4".equals(oooOO1.f6412OooOOOO)) {
                        androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o();
                        oooO00o.f6436OooO00o = this.f8921OooO0Oo;
                        oooO00o.f6445OooOO0O = "audio/ac4";
                        oooO00o.f6454OooOo = 2;
                        oooO00o.f6460OooOoO0 = i4;
                        oooO00o.f6438OooO0OO = this.f8920OooO0OO;
                        androidx.media3.common.OooOO0 oooOO2 = new androidx.media3.common.OooOO0(oooO00o);
                        this.f8927OooOO0O = oooOO2;
                        this.f8923OooO0o0.OooO0O0(oooOO2);
                    }
                    this.f8928OooOO0o = oooO00oOooO0O0.f34634OooO0O0;
                    this.f8926OooOO0 = (((long) oooO00oOooO0O0.f34635OooO0OO) * AnimationKt.MillisToNanos) / ((long) this.f8927OooOO0O.f6425OooOoo);
                    o000o002.Oooo00O(0);
                    this.f8923OooO0o0.OooO0OO(16, o000o002);
                    this.f8922OooO0o = 2;
                }
            } else if (i2 == 2) {
                int iMin2 = Math.min(i, this.f8928OooOO0o - this.f8924OooO0oO);
                this.f8923OooO0o0.OooO0OO(iMin2, o000o001);
                int i5 = this.f8924OooO0oO + iMin2;
                this.f8924OooO0oO = i5;
                int i6 = this.f8928OooOO0o;
                if (i5 == i6) {
                    long j = this.f8929OooOOO0;
                    if (j != -9223372036854775807L) {
                        this.f8923OooO0o0.OooO0o0(j, 1, i6, 0, null);
                        this.f8929OooOOO0 += this.f8926OooOO0;
                    }
                    this.f8922OooO0o = 0;
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
        this.f8921OooO0Oo = oooO0o.f9130OooO0o0;
        oooO0o.OooO0O0();
        this.f8923OooO0o0 = oooo0.OooOOOO(oooO0o.f9129OooO0Oo, 1);
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o0(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f8929OooOOO0 = j;
        }
    }
}
