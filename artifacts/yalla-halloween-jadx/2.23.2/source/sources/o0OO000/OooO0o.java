package o0OO000;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends OooOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final short f42257OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final short f42258OooO0Oo;

    public OooO0o(OooOO0 oooOO1, int i, int i2) {
        super(oooOO1);
        this.f42257OooO0OO = (short) i;
        this.f42258OooO0Oo = (short) i2;
    }

    @Override // o0OO000.OooOO0
    public final void OooO00o(o0OO000o.OooO00o oooO00o, byte[] bArr) {
        oooO00o.OooO0Oo(this.f42257OooO0OO, this.f42258OooO0Oo);
    }

    public final String toString() {
        short s = this.f42258OooO0Oo;
        return "<" + Integer.toBinaryString((1 << s) | (((1 << s) - 1) & this.f42257OooO0OO) | (1 << s)).substring(1) + Typography.greater;
    }
}
