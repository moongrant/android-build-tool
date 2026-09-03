package p710ooOO;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.LayoutNode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o000000.o00000;
import o000000.oo000o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0 {

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void OooO(@NotNull o0OO00O o0oo00o2) {
        Intrinsics.checkNotNullParameter(o0oo00o2, "<this>");
        o00oO0o o00oo0o2 = o0oo00o2.f53479OoooO0;
        if (o00oo0o2 != null) {
            o00oo0o2.OooO0OO();
        }
    }

    public static final void OooO00o(@NotNull o0OO00O o0oo00o2) {
        Intrinsics.checkNotNullParameter(o0oo00o2, "<this>");
        int i = OooO00o.$EnumSwitchMapping$0[o0oo00o2.f53475Oooo.ordinal()];
        if (i == 3) {
            o0oo00o2.OooO0O0(FocusStateImpl.Inactive);
        } else {
            if (i != 4) {
                return;
            }
            o0oo00o2.OooO0O0(FocusStateImpl.ActiveParent);
        }
    }

    public static final boolean OooO0O0(o0OO00O o0oo00o2) {
        o0OO00O o0oo00o3 = o0oo00o2.f53480OoooO00;
        if (o0oo00o3 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (!OooO0OO(o0oo00o3, false)) {
            return false;
        }
        o0oo00o2.f53480OoooO00 = null;
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final boolean OooO0OO(@NotNull o0OO00O o0oo00o2, boolean z) {
        Intrinsics.checkNotNullParameter(o0oo00o2, "<this>");
        switch (OooO00o.$EnumSwitchMapping$0[o0oo00o2.f53475Oooo.ordinal()]) {
            case 1:
                o0oo00o2.OooO0O0(FocusStateImpl.Inactive);
                return true;
            case 2:
                if (!z) {
                    return z;
                }
                o0oo00o2.OooO0O0(FocusStateImpl.Inactive);
                return z;
            case 3:
            case 6:
                return true;
            case 4:
                if (OooO0O0(o0oo00o2)) {
                    o0oo00o2.OooO0O0(FocusStateImpl.Deactivated);
                    return true;
                }
                return false;
            case 5:
                if (OooO0O0(o0oo00o2)) {
                    o0oo00o2.OooO0O0(FocusStateImpl.Inactive);
                    return true;
                }
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void OooO0Oo(@NotNull o0OO00O o0oo00o2) {
        LayoutNode layoutNode;
        o00000 o00000Var;
        o0ooOOo focusManager;
        Intrinsics.checkNotNullParameter(o0oo00o2, "<this>");
        int i = OooO00o.$EnumSwitchMapping$0[o0oo00o2.f53475Oooo.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 5) {
                o0oo00o2.OooO0O0(FocusStateImpl.DeactivatedParent);
                return;
            } else {
                if (i != 6) {
                    return;
                }
                o0oo00o2.OooO0O0(FocusStateImpl.Deactivated);
                return;
            }
        }
        oo000o oo000oVar = o0oo00o2.f53485OoooOo0;
        if (oo000oVar != null && (layoutNode = oo000oVar.f26702OoooO00) != null && (o00000Var = layoutNode.f6143OoooO0O) != null && (focusManager = o00000Var.getFocusManager()) != null) {
            focusManager.OooO0O0(true);
        }
        o0oo00o2.OooO0O0(FocusStateImpl.Deactivated);
    }

    public static final void OooO0o(@NotNull o0OO00O o0oo00o2) {
        LayoutNode layoutNode;
        Intrinsics.checkNotNullParameter(o0oo00o2, "<this>");
        oo000o oo000oVar = o0oo00o2.f53485OoooOo0;
        if (((oo000oVar == null || (layoutNode = oo000oVar.f26702OoooO00) == null) ? null : layoutNode.f6143OoooO0O) == null) {
            o0oo00o2.f53486OoooOoO = true;
        }
        switch (OooO00o.$EnumSwitchMapping$0[o0oo00o2.f53475Oooo.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                OooO(o0oo00o2);
                break;
            case 5:
                if (OooO0O0(o0oo00o2)) {
                    OooO0o0(o0oo00o2);
                }
                break;
            case 6:
                o0OO00O o0oo00o3 = o0oo00o2.f53476Oooo0oO;
                if (o0oo00o3 != null) {
                    OooO0oO(o0oo00o3, o0oo00o2);
                } else if (OooO0oo(o0oo00o2)) {
                    OooO0o0(o0oo00o2);
                }
                break;
        }
    }

    public static final void OooO0o0(o0OO00O o0oo00o2) {
        FocusStateImpl focusStateImpl;
        switch (OooO00o.$EnumSwitchMapping$0[o0oo00o2.f53475Oooo.ordinal()]) {
            case 1:
            case 5:
            case 6:
                focusStateImpl = FocusStateImpl.Active;
                break;
            case 2:
                focusStateImpl = FocusStateImpl.Captured;
                break;
            case 3:
            case 4:
                throw new IllegalStateException("Granting focus to a deactivated node.".toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        o0oo00o2.OooO0O0(focusStateImpl);
    }

    public static final boolean OooO0oO(o0OO00O o0oo00o2, o0OO00O o0oo00o3) {
        if (!o0oo00o2.f53477Oooo0oo.OooO0o(o0oo00o3)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        switch (OooO00o.$EnumSwitchMapping$0[o0oo00o2.f53475Oooo.ordinal()]) {
            case 1:
                o0oo00o2.OooO0O0(FocusStateImpl.ActiveParent);
                o0oo00o2.f53480OoooO00 = o0oo00o3;
                OooO0o0(o0oo00o3);
                return true;
            case 2:
                return false;
            case 3:
                OooO00o(o0oo00o2);
                boolean zOooO0oO = OooO0oO(o0oo00o2, o0oo00o3);
                OooO0Oo(o0oo00o2);
                return zOooO0oO;
            case 4:
                if (o0oo00o2.f53480OoooO00 != null && !OooO0O0(o0oo00o2)) {
                    return false;
                }
                o0oo00o2.f53480OoooO00 = o0oo00o3;
                OooO0o0(o0oo00o3);
                return true;
            case 5:
                if (!OooO0O0(o0oo00o2)) {
                    return false;
                }
                o0oo00o2.f53480OoooO00 = o0oo00o3;
                OooO0o0(o0oo00o3);
                return true;
            case 6:
                o0OO00O o0oo00o4 = o0oo00o2.f53476Oooo0oO;
                if (o0oo00o4 == null && OooO0oo(o0oo00o2)) {
                    o0oo00o2.OooO0O0(FocusStateImpl.Active);
                    return OooO0oO(o0oo00o2, o0oo00o3);
                }
                if (o0oo00o4 == null || !OooO0oO(o0oo00o4, o0oo00o2)) {
                    return false;
                }
                return OooO0oO(o0oo00o2, o0oo00o3);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean OooO0oo(o0OO00O o0oo00o2) {
        LayoutNode layoutNode;
        o00000 o00000Var;
        oo000o oo000oVar = o0oo00o2.f53485OoooOo0;
        if (oo000oVar == null || (layoutNode = oo000oVar.f26702OoooO00) == null || (o00000Var = layoutNode.f6143OoooO0O) == null) {
            throw new IllegalStateException("Owner not initialized.".toString());
        }
        return o00000Var.requestFocus();
    }
}
