package p677o0oooo0o;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends oO0O000o {
    public b(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        byte[] bArr = this.f52144Oooo0o;
        int length = bArr.length + 1;
        byte[] bArr2 = new byte[length];
        bArr2[0] = (byte) this.f52145Oooo0oO;
        System.arraycopy(bArr, 0, bArr2, 1, length - 1);
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
