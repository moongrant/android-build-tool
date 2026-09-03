package androidx.media3.extractor.ts;

import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class oo000o implements TsPayloadReader {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Ooo f9180OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O000 f9181OooO0O0 = new o000O000(32);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f9182OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f9183OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f9184OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f9185OooO0o0;

    public oo000o(o00Ooo o00ooo2) {
        this.f9180OooO00o = o00ooo2;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void OooO00o(o000O0Oo o000o0oo2, o000OOoO.Oooo0 oooo0, TsPayloadReader.OooO0o oooO0o) {
        this.f9180OooO00o.OooO00o(o000o0oo2, oooo0, oooO0o);
        this.f9184OooO0o = true;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void OooO0O0() {
        this.f9184OooO0o = true;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void OooO0OO(int i, o000O000 o000o001) {
        int iOooOo0O;
        boolean z = (i & 1) != 0;
        if (z) {
            iOooOo0O = o000o001.f34963OooO0O0 + o000o001.OooOo0O();
        } else {
            iOooOo0O = -1;
        }
        if (this.f9184OooO0o) {
            if (!z) {
                return;
            }
            this.f9184OooO0o = false;
            o000o001.Oooo00O(iOooOo0O);
            this.f9183OooO0Oo = 0;
        }
        while (true) {
            int i2 = o000o001.f34964OooO0OO;
            int i3 = o000o001.f34963OooO0O0;
            if (i2 - i3 <= 0) {
                return;
            }
            int i4 = this.f9183OooO0Oo;
            o000O000 o000o002 = this.f9181OooO0O0;
            if (i4 < 3) {
                if (i4 == 0) {
                    int iOooOo0O2 = o000o001.OooOo0O();
                    o000o001.Oooo00O(o000o001.f34963OooO0O0 - 1);
                    if (iOooOo0O2 == 255) {
                        this.f9184OooO0o = true;
                        return;
                    }
                }
                int iMin = Math.min(o000o001.f34964OooO0OO - o000o001.f34963OooO0O0, 3 - this.f9183OooO0Oo);
                o000o001.OooO0Oo(this.f9183OooO0Oo, iMin, o000o002.f34962OooO00o);
                int i5 = this.f9183OooO0Oo + iMin;
                this.f9183OooO0Oo = i5;
                if (i5 == 3) {
                    o000o002.Oooo00O(0);
                    o000o002.Oooo000(3);
                    o000o002.Oooo00o(1);
                    int iOooOo0O3 = o000o002.OooOo0O();
                    int iOooOo0O4 = o000o002.OooOo0O();
                    this.f9185OooO0o0 = (iOooOo0O3 & 128) != 0;
                    int i6 = (((iOooOo0O3 & 15) << 8) | iOooOo0O4) + 3;
                    this.f9182OooO0OO = i6;
                    byte[] bArr = o000o002.f34962OooO00o;
                    if (bArr.length < i6) {
                        o000o002.OooO00o(Math.min(4098, Math.max(i6, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(i2 - i3, this.f9182OooO0OO - i4);
                o000o001.OooO0Oo(this.f9183OooO0Oo, iMin2, o000o002.f34962OooO00o);
                int i7 = this.f9183OooO0Oo + iMin2;
                this.f9183OooO0Oo = i7;
                int i8 = this.f9182OooO0OO;
                if (i7 != i8) {
                    continue;
                } else {
                    if (!this.f9185OooO0o0) {
                        o000o002.Oooo000(i8);
                    } else {
                        if (o00.OooOO0O(0, o000o002.f34962OooO00o, i8, -1) != 0) {
                            this.f9184OooO0o = true;
                            return;
                        }
                        o000o002.Oooo000(this.f9182OooO0OO - 4);
                    }
                    o000o002.Oooo00O(0);
                    this.f9180OooO00o.OooO0OO(o000o002);
                    this.f9183OooO0Oo = 0;
                }
            }
        }
    }
}
