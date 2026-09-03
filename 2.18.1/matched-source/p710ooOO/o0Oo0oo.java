package p710ooOO;

import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusStateImpl;
import kotlin.NoWhenBranchMatchedException;
import p036OoooOOO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo {

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final o0OO00O OooO00o(o0OO00O o0oo00o2) {
        o0OO00O o0oo00oOooO00o;
        switch (OooO00o.$EnumSwitchMapping$0[o0oo00o2.f53475Oooo.ordinal()]) {
            case 1:
            case 2:
                return o0oo00o2;
            case 3:
            case 4:
                o0OO00O o0oo00o3 = o0oo00o2.f53480OoooO00;
                if (o0oo00o3 == null || (o0oo00oOooO00o = OooO00o(o0oo00o3)) == null) {
                    throw new IllegalStateException("no child".toString());
                }
                return o0oo00oOooO00o;
            case 5:
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void OooO0O0(o0OO00O o0oo00o2) {
        FocusPropertiesKt.OooO0O0(o0oo00o2);
        o000OOo<o0OO00O> o000ooo2 = o0oo00o2.f53477Oooo0oo;
        int i = o000ooo2.f3664Oooo0oo;
        if (i > 0) {
            int i2 = 0;
            o0OO00O[] o0oo00oArr = o000ooo2.f3662Oooo0o;
            do {
                OooO0O0(o0oo00oArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }
}
