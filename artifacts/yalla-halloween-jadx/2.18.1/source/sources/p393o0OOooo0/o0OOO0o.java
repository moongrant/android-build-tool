package p393o0OOooo0;

import kotlin.text.Typography;
import p392o0OOooo.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o extends o0OO00O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final short f38926OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final short f38927OooO0Oo;

    public o0OOO0o(o0OO00O o0oo00o2, int i, int i2) {
        super(o0oo00o2);
        this.f38926OooO0OO = (short) i;
        this.f38927OooO0Oo = (short) i2;
    }

    @Override // p393o0OOooo0.o0OO00O
    public final void OooO00o(o00000O o00000o, byte[] bArr) {
        o00000o.OooO0o0(this.f38926OooO0OO, this.f38927OooO0Oo);
    }

    public final String toString() {
        short s = this.f38926OooO0OO;
        short s2 = this.f38927OooO0Oo;
        return "<" + Integer.toBinaryString((s & ((1 << s2) - 1)) | (1 << s2) | (1 << this.f38927OooO0Oo)).substring(1) + Typography.greater;
    }
}
