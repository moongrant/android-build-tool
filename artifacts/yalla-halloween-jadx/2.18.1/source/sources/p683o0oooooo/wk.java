package p683o0oooooo;

import java.math.BigInteger;
import oO000Oo.OooO0O0;
import p677o0oooo0o.O0000000;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0O00oO;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oO0Oo0o0;
import p677o0oooo0o.oOO0Oo00;
import p677o0oooo0o.oOOO0OO0;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.oOo0oooO;

/* JADX INFO: loaded from: classes3.dex */
public final class wk extends oOo0o0oO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public oO0Oo0o0 f52274Oooo0o;

    public wk(BigInteger bigInteger, oOO0Oo00 ooo0oo00, oO0O00o0 oo0o00o0) {
        int i = OooO0O0.f52665OooO00o;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            byteArray = bArr;
        }
        oO0O00oO oo0o00oo = new oO0O00oO();
        oo0o00oo.OooO00o(new oOo0oooO(1L));
        oo0o00oo.OooO00o(new oOOO0OO0(byteArray));
        oo0o00oo.OooO00o(new O0000000(true, 0, oo0o00o0));
        if (ooo0oo00 != null) {
            oo0o00oo.OooO00o(new O0000000(true, 1, ooo0oo00));
        }
        this.f52274Oooo0o = new oOOo0000(oo0o00oo);
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        return this.f52274Oooo0o;
    }
}
