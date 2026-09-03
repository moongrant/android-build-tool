package p032OoooO0;

import androidx.compose.foundation.gestures.Orientation;
import o00000O.o0OOO0o;
import o0000O0O.OooO;
import o00O0O.OooOO0O;
import p054o00000oo.o00OOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo00 {

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[Orientation.Vertical.ordinal()] = 1;
            iArr[Orientation.Horizontal.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final OooOO0O OooO00o(OooO oooO, int i, o00OOO0 o00ooo1, o0OOO0o o0ooo0o2, boolean z, int i2) {
        float f;
        OooOO0O oooOO0OOooO0OO = o0ooo0o2 != null ? o0ooo0o2.OooO0OO(o00ooo1.f27220OooO0O0.OooO0O0(i)) : OooOO0O.f30402OooO0o;
        float f2 = o00O0O0.f3169OooO00o;
        int iOoooooO = oooO.OoooooO(o00O0O0.f3169OooO00o);
        float f3 = z ? (i2 - oooOO0OOooO0OO.f30404OooO00o) - iOoooooO : oooOO0OOooO0OO.f30404OooO00o;
        if (z) {
            f = i2 - oooOO0OOooO0OO.f30404OooO00o;
        } else {
            f = iOoooooO + oooOO0OOooO0OO.f30404OooO00o;
        }
        return new OooOO0O(f3, oooOO0OOooO0OO.f30405OooO0O0, f, oooOO0OOooO0OO.f30407OooO0Oo);
    }
}
