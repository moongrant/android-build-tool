package o0O0o000;

import java.io.IOException;
import java.util.Arrays;
import p296o0O0OoO0.o000oOoO;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f36127OooO00o = new OooO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f36128OooO0O0 = new o000(new byte[65025], 0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f36129OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f36130OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f36131OooO0o0;

    public final int OooO00o(int i) {
        int i2;
        int i3 = 0;
        this.f36130OooO0Oo = 0;
        do {
            int i4 = this.f36130OooO0Oo;
            int i5 = i + i4;
            OooO oooO = this.f36127OooO00o;
            if (i5 >= oooO.f36100OooO0OO) {
                break;
            }
            int[] iArr = oooO.f36102OooO0o;
            this.f36130OooO0Oo = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean OooO0O0(o000oOoO o000oooo2) throws IOException {
        int i;
        o00000O0.OooO0Oo(o000oooo2 != null);
        if (this.f36131OooO0o0) {
            this.f36131OooO0o0 = false;
            this.f36128OooO0O0.OooOo(0);
        }
        while (!this.f36131OooO0o0) {
            if (this.f36129OooO0OO < 0) {
                if (!this.f36127OooO00o.OooO0OO(o000oooo2, -1L) || !this.f36127OooO00o.OooO00o(o000oooo2, true)) {
                    return false;
                }
                OooO oooO = this.f36127OooO00o;
                int iOooO00o = oooO.f36101OooO0Oo;
                if ((oooO.f36098OooO00o & 1) == 1 && this.f36128OooO0O0.f36663OooO0OO == 0) {
                    iOooO00o += OooO00o(0);
                    i = this.f36130OooO0Oo + 0;
                } else {
                    i = 0;
                }
                o000oooo2.OooOO0(iOooO00o);
                this.f36129OooO0OO = i;
            }
            int iOooO00o2 = OooO00o(this.f36129OooO0OO);
            int i2 = this.f36129OooO0OO + this.f36130OooO0Oo;
            if (iOooO00o2 > 0) {
                o000 o000Var = this.f36128OooO0O0;
                byte[] bArr = o000Var.f36661OooO00o;
                int length = bArr.length;
                int i3 = o000Var.f36663OooO0OO + iOooO00o2;
                if (length < i3) {
                    o000Var.OooOoO0(Arrays.copyOf(bArr, i3), this.f36128OooO0O0.f36663OooO0OO);
                }
                o000 o000Var2 = this.f36128OooO0O0;
                o000oooo2.readFully(o000Var2.f36661OooO00o, o000Var2.f36663OooO0OO, iOooO00o2);
                o000 o000Var3 = this.f36128OooO0O0;
                o000Var3.OooOoO(o000Var3.f36663OooO0OO + iOooO00o2);
                this.f36131OooO0o0 = this.f36127OooO00o.f36102OooO0o[i2 + (-1)] != 255;
            }
            if (i2 == this.f36127OooO00o.f36100OooO0OO) {
                i2 = -1;
            }
            this.f36129OooO0OO = i2;
        }
        return true;
    }
}
