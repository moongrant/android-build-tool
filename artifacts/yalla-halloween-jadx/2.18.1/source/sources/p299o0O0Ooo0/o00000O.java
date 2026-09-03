package p299o0O0Ooo0;

import java.io.IOException;
import kotlin.UByte;
import p296o0O0OoO0.Oooo000;
import p296o0O0OoO0.o000oOoO;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000 f35990OooO00o = new o000(8);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f35991OooO0O0;

    public final long OooO00o(o000oOoO o000oooo2) throws IOException {
        Oooo000 oooo000 = (Oooo000) o000oooo2;
        int i = 0;
        oooo000.OooO0OO(this.f35990OooO00o.f36661OooO00o, 0, 1, false);
        int i2 = this.f35990OooO00o.f36661OooO00o[0] & UByte.MAX_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        oooo000.OooO0OO(this.f35990OooO00o.f36661OooO00o, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (this.f35990OooO00o.f36661OooO00o[i] & UByte.MAX_VALUE) + (i5 << 8);
        }
        this.f35991OooO0O0 = i4 + 1 + this.f35991OooO0O0;
        return i5;
    }
}
