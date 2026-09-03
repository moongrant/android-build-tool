package p710ooOO;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import o000000.oo000o;
import p036OoooOOO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO {

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 2;
            iArr[FocusStateImpl.Active.ordinal()] = 3;
            iArr[FocusStateImpl.Captured.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o0O0O00.OooO0OO.OooO00o, Boolean> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<o0OO00O, Boolean> f53460Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f53461Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f53462Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f53463Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(o0OO00O o0oo00o2, o0OO00O o0oo00o3, int i, Function1<? super o0OO00O, Boolean> function1) {
            super(1);
            this.f53461Oooo0o = o0oo00o2;
            this.f53462Oooo0oO = o0oo00o3;
            this.f53463Oooo0oo = i;
            this.f53460Oooo = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(o0O0O00.OooO0OO.OooO00o oooO00o) {
            o0O0O00.OooO0OO.OooO00o searchBeyondBounds = oooO00o;
            Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
            Boolean boolValueOf = Boolean.valueOf(o000OO.OooO0o0(this.f53461Oooo0o, this.f53462Oooo0oO, this.f53463Oooo0oo, this.f53460Oooo));
            if (boolValueOf.booleanValue() || !searchBeyondBounds.OooO00o()) {
                return boolValueOf;
            }
            return null;
        }
    }

    public static final class OooO0OO<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            LayoutNode layoutNode;
            LayoutNode layoutNode2;
            oo000o oo000oVar = ((o0OO00O) t).f53485OoooOo0;
            Integer numValueOf = null;
            Integer numValueOf2 = (oo000oVar == null || (layoutNode2 = oo000oVar.f26702OoooO00) == null) ? null : Integer.valueOf(layoutNode2.f6155Oooooo);
            oo000o oo000oVar2 = ((o0OO00O) t2).f53485OoooOo0;
            if (oo000oVar2 != null && (layoutNode = oo000oVar2.f26702OoooO00) != null) {
                numValueOf = Integer.valueOf(layoutNode.f6155Oooooo);
            }
            return ComparisonsKt.compareValues(numValueOf2, numValueOf);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0074 A[ORIG_RETURN, RETURN] */
    public static final boolean OooO00o(o0OO00O o0oo00o2, Function1<? super o0OO00O, Boolean> function1) {
        FocusStateImpl focusStateImpl = o0oo00o2.f53475Oooo;
        int[] iArr = OooO00o.$EnumSwitchMapping$0;
        switch (iArr[focusStateImpl.ordinal()]) {
            case 1:
            case 2:
                o0OO00O o0oo00o3 = o0oo00o2.f53480OoooO00;
                if (o0oo00o3 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                switch (iArr[o0oo00o3.f53475Oooo.ordinal()]) {
                    case 1:
                        if (OooO00o(o0oo00o3, function1) || function1.invoke(o0oo00o3).booleanValue()) {
                            return true;
                        }
                        return false;
                    case 2:
                        if (OooO00o(o0oo00o3, function1) || OooO0OO(o0oo00o2, o0oo00o3, 2, function1)) {
                            return true;
                        }
                        return false;
                    case 3:
                    case 4:
                        return OooO0OO(o0oo00o2, o0oo00o3, 2, function1);
                    case 5:
                    case 6:
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 3:
            case 4:
            case 5:
                return OooO0Oo(o0oo00o2, function1);
            case 6:
                if (OooO0Oo(o0oo00o2, function1) || function1.invoke(o0oo00o2).booleanValue()) {
                    return true;
                }
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean OooO0O0(o0OO00O o0oo00o2, Function1<? super o0OO00O, Boolean> function1) {
        switch (OooO00o.$EnumSwitchMapping$0[o0oo00o2.f53475Oooo.ordinal()]) {
            case 1:
            case 2:
                o0OO00O o0oo00o3 = o0oo00o2.f53480OoooO00;
                if (o0oo00o3 != null) {
                    return OooO0O0(o0oo00o3, function1) || OooO0OO(o0oo00o2, o0oo00o3, 1, function1);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            case 3:
            case 4:
            case 5:
                OooO0o(o0oo00o2.f53477Oooo0oo);
                o000OOo<o0OO00O> o000ooo2 = o0oo00o2.f53477Oooo0oo;
                int i = o000ooo2.f3664Oooo0oo;
                if (i <= 0) {
                    return false;
                }
                o0OO00O[] o0oo00oArr = o000ooo2.f3662Oooo0o;
                int i2 = 0;
                do {
                    o0OO00O o0oo00o4 = o0oo00oArr[i2];
                    if (!(o0000O0O.OooO0o0(o0oo00o4) && OooO0O0(o0oo00o4, function1))) {
                        i2++;
                    }
                } while (i2 < i);
                return false;
            case 6:
                return function1.invoke(o0oo00o2).booleanValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean OooO0OO(o0OO00O o0oo00o2, o0OO00O o0oo00o3, int i, Function1<? super o0OO00O, Boolean> function1) {
        if (OooO0o0(o0oo00o2, o0oo00o3, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) o000oOoO.OooO00o(o0oo00o2, i, new OooO0O0(o0oo00o2, o0oo00o3, i, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean OooO0Oo(o0OO00O o0oo00o2, Function1<? super o0OO00O, Boolean> function1) {
        OooO0o(o0oo00o2.f53477Oooo0oo);
        o000OOo<o0OO00O> o000ooo2 = o0oo00o2.f53477Oooo0oo;
        int i = o000ooo2.f3664Oooo0oo;
        if (i <= 0) {
            return false;
        }
        int i2 = i - 1;
        o0OO00O[] o0oo00oArr = o000ooo2.f3662Oooo0o;
        do {
            o0OO00O o0oo00o3 = o0oo00oArr[i2];
            if (o0000O0O.OooO0o0(o0oo00o3) && OooO00o(o0oo00o3, function1)) {
                return true;
            }
            i2--;
        } while (i2 >= 0);
        return false;
    }

    public static final void OooO0o(o000OOo<o0OO00O> o000ooo2) {
        o000ooo2.OooOOO(new OooO0OO());
    }

    public static final boolean OooO0o0(o0OO00O o0oo00o2, o0OO00O o0oo00o3, int i, Function1<? super o0OO00O, Boolean> function1) {
        FocusStateImpl focusStateImpl = o0oo00o2.f53475Oooo;
        if (!(focusStateImpl == FocusStateImpl.ActiveParent || focusStateImpl == FocusStateImpl.DeactivatedParent)) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        OooO0o(o0oo00o2.f53477Oooo0oo);
        if (i == 1) {
            o000OOo<o0OO00O> o000ooo2 = o0oo00o2.f53477Oooo0oo;
            IntRange intRange = new IntRange(0, o000ooo2.f3664Oooo0oo - 1);
            int first = intRange.getFirst();
            int last = intRange.getLast();
            if (first <= last) {
                boolean z = false;
                while (true) {
                    if (z) {
                        o0OO00O o0oo00o4 = o000ooo2.f3662Oooo0o[first];
                        if (o0000O0O.OooO0o0(o0oo00o4) && OooO0O0(o0oo00o4, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.areEqual(o000ooo2.f3662Oooo0o[first], o0oo00o3)) {
                        z = true;
                    }
                    if (first == last) {
                        break;
                    }
                    first++;
                }
            }
        } else {
            if (!(i == 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            o000OOo<o0OO00O> o000ooo3 = o0oo00o2.f53477Oooo0oo;
            IntRange intRange2 = new IntRange(0, o000ooo3.f3664Oooo0oo - 1);
            int first2 = intRange2.getFirst();
            int last2 = intRange2.getLast();
            if (first2 <= last2) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        o0OO00O o0oo00o5 = o000ooo3.f3662Oooo0o[last2];
                        if (o0000O0O.OooO0o0(o0oo00o5) && OooO00o(o0oo00o5, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.areEqual(o000ooo3.f3662Oooo0o[last2], o0oo00o3)) {
                        z2 = true;
                    }
                    if (last2 == first2) {
                        break;
                    }
                    last2--;
                }
            }
        }
        if (!(i == 1) && o0oo00o2.f53475Oooo != FocusStateImpl.DeactivatedParent) {
            if (!(o0oo00o2.f53476Oooo0oO == null)) {
                return function1.invoke(o0oo00o2).booleanValue();
            }
        }
        return false;
    }
}
