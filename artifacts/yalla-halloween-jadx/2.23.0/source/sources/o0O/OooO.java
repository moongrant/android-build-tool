package o0O;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends OooOO0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final short f41548OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final short f41549OooO0Oo;

    public OooO(OooOO0O oooOO0O, int i, int i2) {
        super(oooOO0O);
        this.f41548OooO0OO = (short) i;
        this.f41549OooO0Oo = (short) i2;
    }

    @Override // o0O.OooOO0O
    public final void OooO00o(o0OO000.OooO00o oooO00o, byte[] bArr) {
        oooO00o.OooO0Oo(this.f41548OooO0OO, this.f41549OooO0Oo);
    }

    public final String toString() {
        short s = this.f41549OooO0Oo;
        return "<" + Integer.toBinaryString((1 << s) | (((1 << s) - 1) & this.f41548OooO0OO) | (1 << s)).substring(1) + Typography.greater;
    }
}
