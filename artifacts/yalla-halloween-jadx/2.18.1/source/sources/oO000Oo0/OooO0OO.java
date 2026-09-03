package oO000Oo0;

import p677o0oooo0o.oO0O00oO;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oOOO0OO0;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.oOo0oooO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends oOo0o0oO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public byte[][] f52675Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public oOo0oooO f52676Oooo0o = new oOo0oooO(0);

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public oOo0oooO f52677Oooo0oO = new oOo0oooO(0);

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public byte[][] f52678Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public byte[] f52679OoooO00;

    public OooO0OO() {
        throw null;
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        oO0O00oO oo0o00oo = new oO0O00oO();
        oOo0oooO ooo0oooo = this.f52676Oooo0o;
        if (ooo0oooo == null) {
            ooo0oooo = null;
        }
        oo0o00oo.OooO00o(ooo0oooo);
        oo0o00oo.OooO00o(this.f52677Oooo0oO);
        oO0O00oO oo0o00oo2 = new oO0O00oO();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr = this.f52678Oooo0oo;
            if (i2 >= bArr.length) {
                break;
            }
            oo0o00oo2.OooO00o(new oOOO0OO0(bArr[i2]));
            i2++;
        }
        oo0o00oo.OooO00o(new oOOo0000(oo0o00oo2));
        oO0O00oO oo0o00oo3 = new oO0O00oO();
        while (true) {
            byte[][] bArr2 = this.f52675Oooo;
            if (i >= bArr2.length) {
                oo0o00oo.OooO00o(new oOOo0000(oo0o00oo3));
                oO0O00oO oo0o00oo4 = new oO0O00oO();
                oo0o00oo4.OooO00o(new oOOO0OO0(this.f52679OoooO00));
                oo0o00oo.OooO00o(new oOOo0000(oo0o00oo4));
                return new oOOo0000(oo0o00oo);
            }
            oo0o00oo3.OooO00o(new oOOO0OO0(bArr2[i]));
            i++;
        }
    }
}
