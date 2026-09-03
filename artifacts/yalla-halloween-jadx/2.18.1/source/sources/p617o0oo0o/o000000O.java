package p617o0oo0o;

import androidx.compose.runtime.internal.StabilityInferred;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o000000O {
    public static final void OooO00o(o0O00OO o0o00oo2, boolean z) {
        o0o00oo2.setValue(Boolean.valueOf(z));
    }

    public static final int OooO0O0(int i, int i2, int i3) {
        int i4 = i3 - i;
        if (i2 == 0) {
            return i4;
        }
        int i5 = i4 / i2;
        if ((i4 ^ i2) < 0 && i5 * i2 != i4) {
            i5--;
        }
        return i4 - (i5 * i2);
    }
}
