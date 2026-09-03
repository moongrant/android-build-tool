package p712ooOO;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o000000.oo000o;
import o00O0O.OooOO0O;
import o0O0O00.o000oOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p036OoooOOO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O {

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Rtl.ordinal()] = 1;
            iArr[LayoutDirection.Ltr.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            iArr2[FocusStateImpl.Active.ordinal()] = 1;
            iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr2[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr2[FocusStateImpl.Inactive.ordinal()] = 5;
            iArr2[FocusStateImpl.Deactivated.ordinal()] = 6;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final o000OOo<o0OO00O> OooO00o(@NotNull o0OO00O o0oo00o2) {
        boolean z;
        Intrinsics.checkNotNullParameter(o0oo00o2, "<this>");
        o000OOo<o0OO00O> o000ooo2 = o0oo00o2.f53492OoooO0;
        int i = o000ooo2.f3678OoooO0;
        int i2 = 0;
        if (i <= 0) {
            z = false;
            break;
        }
        o0OO00O[] o0oo00oArr = o000ooo2.f3677Oooo;
        int i3 = 0;
        while (true) {
            if (o0oo00oArr[i3].f53494OoooO0O.OooO0Oo()) {
                z = true;
                break;
            }
            i3++;
            if (i3 >= i) {
                z = false;
                break;
            }
        }
        if (!z) {
            return o0oo00o2.f53492OoooO0;
        }
        o000OOo<o0OO00O> o000ooo3 = new o000OOo<>(new o0OO00O[16]);
        o000OOo<o0OO00O> o000ooo4 = o0oo00o2.f53492OoooO0;
        int i4 = o000ooo4.f3678OoooO0;
        if (i4 > 0) {
            o0OO00O[] o0oo00oArr2 = o000ooo4.f3677Oooo;
            do {
                o0OO00O o0oo00o3 = o0oo00oArr2[i2];
                if (o0oo00o3.f53494OoooO0O.OooO0Oo()) {
                    o000ooo3.OooO0OO(o000ooo3.f3678OoooO0, OooO00o(o0oo00o3));
                } else {
                    o000ooo3.OooO0O0(o0oo00o3);
                }
                i2++;
            } while (i2 < i4);
        }
        return o000ooo3;
    }

    @Nullable
    public static final o0OO00O OooO0O0(@NotNull o0OO00O o0oo00o2) {
        Intrinsics.checkNotNullParameter(o0oo00o2, "<this>");
        switch (OooO00o.$EnumSwitchMapping$1[o0oo00o2.f53494OoooO0O.ordinal()]) {
            case 1:
            case 2:
                return o0oo00o2;
            case 3:
            case 4:
                o0OO00O o0oo00o3 = o0oo00o2.f53491OoooO;
                if (o0oo00o3 != null) {
                    return OooO0O0(o0oo00o3);
                }
            case 5:
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Nullable
    public static final o0OO00O OooO0OO(@NotNull o0OO00O o0oo00o2) {
        Intrinsics.checkNotNullParameter(o0oo00o2, "<this>");
        o0OO00O o0oo00o3 = o0oo00o2.f53493OoooO00;
        if (o0oo00o3 == null) {
            return null;
        }
        switch (OooO00o.$EnumSwitchMapping$1[o0oo00o2.f53494OoooO0O.ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return OooO0OO(o0oo00o3);
            case 3:
                return o0oo00o2;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final OooOO0O OooO0Oo(@NotNull o0OO00O o0oo00o2) {
        OooOO0O oooOO0OOooo;
        Intrinsics.checkNotNullParameter(o0oo00o2, "<this>");
        oo000o oo000oVar = o0oo00o2.f53501Ooooo00;
        return (oo000oVar == null || (oooOO0OOooo = o000oOoO.OooO0Oo(oo000oVar).Oooo(oo000oVar, false)) == null) ? OooOO0O.f30420OooO0o : oooOO0OOooo;
    }

    public static final boolean OooO0o0(@NotNull o0OO00O o0oo00o2) {
        LayoutNode layoutNode;
        LayoutNode layoutNode2;
        Intrinsics.checkNotNullParameter(o0oo00o2, "<this>");
        oo000o oo000oVar = o0oo00o2.f53501Ooooo00;
        if ((oo000oVar == null || (layoutNode2 = oo000oVar.f26719OoooO) == null || !layoutNode2.f6170Ooooooo) ? false : true) {
            if ((oo000oVar == null || (layoutNode = oo000oVar.f26719OoooO) == null || !layoutNode.OooOoo0()) ? false : true) {
                return true;
            }
        }
        return false;
    }
}
