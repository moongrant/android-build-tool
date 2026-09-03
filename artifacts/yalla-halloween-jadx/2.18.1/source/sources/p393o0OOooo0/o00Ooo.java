package p393o0OOooo0;

import kotlin.text.Typography;
import p392o0OOooo.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo extends o0OO00O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final short f38922OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final short f38923OooO0Oo;

    public o00Ooo(o0OO00O o0oo00o2, int i, int i2) {
        super(o0oo00o2);
        this.f38922OooO0OO = (short) i;
        this.f38923OooO0Oo = (short) i2;
    }

    @Override // p393o0OOooo0.o0OO00O
    public final void OooO00o(o00000O o00000o, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f38923OooO0Oo;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                o00000o.OooO0o0(31, 5);
                short s2 = this.f38923OooO0Oo;
                if (s2 > 62) {
                    o00000o.OooO0o0(s2 - 31, 16);
                } else if (i == 0) {
                    o00000o.OooO0o0(Math.min((int) s2, 31), 5);
                } else {
                    o00000o.OooO0o0(s2 - 31, 5);
                }
            }
            o00000o.OooO0o0(bArr[this.f38922OooO0OO + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.f38922OooO0OO);
        sb.append("::");
        sb.append((this.f38922OooO0OO + this.f38923OooO0Oo) - 1);
        sb.append(Typography.greater);
        return sb.toString();
    }
}
