package oO000Oo0;

import java.math.BigInteger;
import p677o0oooo0o.oO0O00oO;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.oOo0oooO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends oOo0o0oO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int[] f52671Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f52672Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int[] f52673Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int[] f52674Oooo0oo;

    static {
        BigInteger.valueOf(0L);
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        oO0O00oO oo0o00oo = new oO0O00oO();
        oO0O00oO oo0o00oo2 = new oO0O00oO();
        oO0O00oO oo0o00oo3 = new oO0O00oO();
        int i = 0;
        while (true) {
            int[] iArr = this.f52673Oooo0oO;
            if (i >= iArr.length) {
                oO0O00oO oo0o00oo4 = new oO0O00oO();
                oo0o00oo4.OooO00o(new oOo0oooO(this.f52672Oooo0o));
                oo0o00oo4.OooO00o(new oOOo0000(oo0o00oo));
                oo0o00oo4.OooO00o(new oOOo0000(oo0o00oo2));
                oo0o00oo4.OooO00o(new oOOo0000(oo0o00oo3));
                return new oOOo0000(oo0o00oo4);
            }
            oo0o00oo.OooO00o(new oOo0oooO(iArr[i]));
            oo0o00oo2.OooO00o(new oOo0oooO(this.f52674Oooo0oo[i]));
            oo0o00oo3.OooO00o(new oOo0oooO(this.f52671Oooo[i]));
            i++;
        }
    }
}
