package p677o0oooo0o;

import OooO00o.OooO00o;
import java.io.IOException;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
public class oOO0Oo00 extends oO0O000o {
    public oOO0Oo00(oO0O00o0 oo0o00o0) throws IOException {
        super(oo0o00o0.OooO0O0().OooO0oo("DER"), 0);
    }

    public oOO0Oo00(byte[] bArr) {
        super(bArr, 0);
    }

    public oOO0Oo00(byte[] bArr, int i) {
        super(bArr, i);
    }

    public static oOO0Oo00 OooOOoo(Object obj) {
        if (obj == null || (obj instanceof oOO0Oo00)) {
            return (oOO0Oo00) obj;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return new oOO0Oo00(bVar.f52144Oooo0o, bVar.f52145Oooo0oO);
        }
        if (!(obj instanceof byte[])) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("illegal object in getInstance: ");
            sbOooO0o0.append(obj.getClass().getName());
            throw new IllegalArgumentException(sbOooO0o0.toString());
        }
        try {
            return (oOO0Oo00) oO0OO0O.OooOO0o((byte[]) obj);
        } catch (Exception e) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("encoding error in getInstance: ");
            sbOooO0o1.append(e.toString());
            throw new IllegalArgumentException(sbOooO0o1.toString());
        }
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        byte[] bArr = this.f52144Oooo0o;
        int i = this.f52145Oooo0oO;
        byte[] bArrOooO0OO = oO000Oo.OooO00o.OooO0OO(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            bArrOooO0OO[length] = (byte) ((KotlinVersion.MAX_COMPONENT_VALUE << i) & bArrOooO0OO[length]);
        }
        int length2 = bArrOooO0OO.length + 1;
        byte[] bArr2 = new byte[length2];
        bArr2[0] = (byte) this.f52145Oooo0oO;
        System.arraycopy(bArrOooO0OO, 0, bArr2, 1, length2 - 1);
        oo0oo00.OooO0o(3, bArr2);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() {
        return m.OooO00o(this.f52144Oooo0o.length + 1) + 1 + this.f52144Oooo0o.length + 1;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        return false;
    }
}
