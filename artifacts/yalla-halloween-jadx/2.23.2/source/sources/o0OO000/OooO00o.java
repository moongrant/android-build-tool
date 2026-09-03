package o0OO000;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends OooOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final short f42250OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final short f42251OooO0Oo;

    public OooO00o(OooOO0 oooOO1, int i, int i2) {
        super(oooOO1);
        this.f42250OooO0OO = (short) i;
        this.f42251OooO0Oo = (short) i2;
    }

    @Override // o0OO000.OooOO0
    public final void OooO00o(o0OO000o.OooO00o oooO00o, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f42251OooO0Oo;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                oooO00o.OooO0Oo(31, 5);
                if (s > 62) {
                    oooO00o.OooO0Oo(s - 31, 16);
                } else if (i == 0) {
                    oooO00o.OooO0Oo(Math.min((int) s, 31), 5);
                } else {
                    oooO00o.OooO0Oo(s - 31, 5);
                }
            }
            oooO00o.OooO0Oo(bArr[this.f42250OooO0OO + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        short s = this.f42250OooO0OO;
        sb.append((int) s);
        sb.append("::");
        sb.append((s + this.f42251OooO0Oo) - 1);
        sb.append(Typography.greater);
        return sb.toString();
    }
}
