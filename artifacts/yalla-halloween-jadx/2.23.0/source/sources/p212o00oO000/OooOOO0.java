package p212o00oO000;

import java.io.IOException;
import kotlin.UByte;
import p209o00o0oo0.o00O00o0;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo00 f39636OooO00o = new o00Oo00(8);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f39637OooO0O0;

    public final long OooO00o(o00O00o0 o00o00o1) throws IOException {
        o00Oo00 o00oo00 = this.f39636OooO00o;
        int i = 0;
        o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 1, false);
        int i2 = o00oo00.f40591OooO00o[0] & UByte.MAX_VALUE;
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
        o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (o00oo00.f40591OooO00o[i] & UByte.MAX_VALUE) + (i5 << 8);
        }
        this.f39637OooO0O0 = i4 + 1 + this.f39637OooO0O0;
        return i5;
    }
}
