package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p712ooOO.o0000oo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "", "LooOO/o0000oo;", "Active", "ActiveParent", "Captured", "Deactivated", "DeactivatedParent", "Inactive", "ui_release"}, k = 1, mv = {1, 6, 0})
public enum FocusStateImpl implements o0000oo {
    Active,
    ActiveParent,
    Captured,
    Deactivated,
    DeactivatedParent,
    Inactive;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Captured.ordinal()] = 1;
            iArr[FocusStateImpl.Active.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 4;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // p712ooOO.o0000oo
    public final boolean OooO00o() {
        switch (OooO00o.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
                return true;
            case 4:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // p712ooOO.o0000oo
    public final boolean OooO0O0() {
        switch (OooO00o.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean OooO0Oo() {
        switch (OooO00o.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
                return false;
            case 4:
            case 5:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
