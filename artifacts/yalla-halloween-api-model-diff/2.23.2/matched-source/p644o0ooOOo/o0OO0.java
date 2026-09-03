package p644o0ooOOo;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.State;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Function3<androidx.constraintlayout.core.state.OooO00o, Object, LayoutDirection, androidx.constraintlayout.core.state.OooO00o>[][] f58025OooO00o = {new Function3[]{OooOO0.f58031OooO0Oo, OooOO0O.f58032OooO0Oo}, new Function3[]{OooOOO0.f58034OooO0Oo, OooOOO.f58033OooO0Oo}};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Function2<androidx.constraintlayout.core.state.OooO00o, Object, androidx.constraintlayout.core.state.OooO00o>[][] f58026OooO0O0 = {new Function2[]{OooO0O0.f58028OooO0Oo, OooO0OO.f58029OooO0Oo}, new Function2[]{OooO0o.f58030OooO0Oo, OooO.f58027OooO0Oo}};

    public static final class OooO extends Lambda implements Function2<androidx.constraintlayout.core.state.OooO00o, Object, androidx.constraintlayout.core.state.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f58027OooO0Oo = new OooO();

        public OooO() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final androidx.constraintlayout.core.state.OooO00o invoke(androidx.constraintlayout.core.state.OooO00o oooO00o, Object other) {
            androidx.constraintlayout.core.state.OooO00o arrayOf = oooO00o;
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            arrayOf.f4311OooOoOO = null;
            arrayOf.f4312OooOoo = null;
            arrayOf.f4318Oooo00O = State.Constraint.BOTTOM_TO_BOTTOM;
            arrayOf.f4313OooOoo0 = other;
            Intrinsics.checkNotNullExpressionValue(arrayOf, "bottomToBottom(other)");
            return arrayOf;
        }
    }

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<androidx.constraintlayout.core.state.OooO00o, Object, androidx.constraintlayout.core.state.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f58028OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final androidx.constraintlayout.core.state.OooO00o invoke(androidx.constraintlayout.core.state.OooO00o oooO00o, Object other) {
            androidx.constraintlayout.core.state.OooO00o arrayOf = oooO00o;
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            arrayOf.f4309OooOoO = null;
            arrayOf.f4312OooOoo = null;
            arrayOf.f4318Oooo00O = State.Constraint.TOP_TO_TOP;
            arrayOf.f4310OooOoO0 = other;
            Intrinsics.checkNotNullExpressionValue(arrayOf, "topToTop(other)");
            return arrayOf;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<androidx.constraintlayout.core.state.OooO00o, Object, androidx.constraintlayout.core.state.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f58029OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final androidx.constraintlayout.core.state.OooO00o invoke(androidx.constraintlayout.core.state.OooO00o oooO00o, Object other) {
            androidx.constraintlayout.core.state.OooO00o arrayOf = oooO00o;
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            arrayOf.f4310OooOoO0 = null;
            arrayOf.f4312OooOoo = null;
            arrayOf.f4318Oooo00O = State.Constraint.TOP_TO_BOTTOM;
            arrayOf.f4309OooOoO = other;
            Intrinsics.checkNotNullExpressionValue(arrayOf, "topToBottom(other)");
            return arrayOf;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<androidx.constraintlayout.core.state.OooO00o, Object, androidx.constraintlayout.core.state.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f58030OooO0Oo = new OooO0o();

        public OooO0o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final androidx.constraintlayout.core.state.OooO00o invoke(androidx.constraintlayout.core.state.OooO00o oooO00o, Object other) {
            androidx.constraintlayout.core.state.OooO00o arrayOf = oooO00o;
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            arrayOf.f4313OooOoo0 = null;
            arrayOf.f4312OooOoo = null;
            arrayOf.f4318Oooo00O = State.Constraint.BOTTOM_TO_TOP;
            arrayOf.f4311OooOoOO = other;
            Intrinsics.checkNotNullExpressionValue(arrayOf, "bottomToTop(other)");
            return arrayOf;
        }
    }

    public static final class OooOO0 extends Lambda implements Function3<androidx.constraintlayout.core.state.OooO00o, Object, LayoutDirection, androidx.constraintlayout.core.state.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f58031OooO0Oo = new OooOO0();

        public OooOO0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final androidx.constraintlayout.core.state.OooO00o invoke(androidx.constraintlayout.core.state.OooO00o oooO00o, Object other, LayoutDirection layoutDirection) {
            androidx.constraintlayout.core.state.OooO00o arrayOf = oooO00o;
            LayoutDirection layoutDirection2 = layoutDirection;
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
            o0OO0.OooO00o(arrayOf, layoutDirection2);
            arrayOf.f4318Oooo00O = State.Constraint.LEFT_TO_LEFT;
            arrayOf.f4302OooOOo0 = other;
            Intrinsics.checkNotNullExpressionValue(arrayOf, "leftToLeft(other)");
            return arrayOf;
        }
    }

    public static final class OooOO0O extends Lambda implements Function3<androidx.constraintlayout.core.state.OooO00o, Object, LayoutDirection, androidx.constraintlayout.core.state.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f58032OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final androidx.constraintlayout.core.state.OooO00o invoke(androidx.constraintlayout.core.state.OooO00o oooO00o, Object other, LayoutDirection layoutDirection) {
            androidx.constraintlayout.core.state.OooO00o arrayOf = oooO00o;
            LayoutDirection layoutDirection2 = layoutDirection;
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
            o0OO0.OooO00o(arrayOf, layoutDirection2);
            arrayOf.f4318Oooo00O = State.Constraint.LEFT_TO_RIGHT;
            arrayOf.f4301OooOOo = other;
            Intrinsics.checkNotNullExpressionValue(arrayOf, "leftToRight(other)");
            return arrayOf;
        }
    }

    public static final class OooOOO extends Lambda implements Function3<androidx.constraintlayout.core.state.OooO00o, Object, LayoutDirection, androidx.constraintlayout.core.state.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f58033OooO0Oo = new OooOOO();

        public OooOOO() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final androidx.constraintlayout.core.state.OooO00o invoke(androidx.constraintlayout.core.state.OooO00o oooO00o, Object other, LayoutDirection layoutDirection) {
            androidx.constraintlayout.core.state.OooO00o arrayOf = oooO00o;
            LayoutDirection layoutDirection2 = layoutDirection;
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
            o0OO0.OooO0O0(arrayOf, layoutDirection2);
            arrayOf.f4318Oooo00O = State.Constraint.RIGHT_TO_RIGHT;
            arrayOf.f4306OooOo00 = other;
            Intrinsics.checkNotNullExpressionValue(arrayOf, "rightToRight(other)");
            return arrayOf;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function3<androidx.constraintlayout.core.state.OooO00o, Object, LayoutDirection, androidx.constraintlayout.core.state.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f58034OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final androidx.constraintlayout.core.state.OooO00o invoke(androidx.constraintlayout.core.state.OooO00o oooO00o, Object other, LayoutDirection layoutDirection) {
            androidx.constraintlayout.core.state.OooO00o arrayOf = oooO00o;
            LayoutDirection layoutDirection2 = layoutDirection;
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
            o0OO0.OooO0O0(arrayOf, layoutDirection2);
            arrayOf.f4318Oooo00O = State.Constraint.RIGHT_TO_LEFT;
            arrayOf.f4303OooOOoo = other;
            Intrinsics.checkNotNullExpressionValue(arrayOf, "rightToLeft(other)");
            return arrayOf;
        }
    }

    public static final void OooO00o(androidx.constraintlayout.core.state.OooO00o oooO00o, LayoutDirection layoutDirection) {
        oooO00o.f4302OooOOo0 = null;
        oooO00o.f4318Oooo00O = State.Constraint.LEFT_TO_RIGHT;
        oooO00o.f4301OooOOo = null;
        int i = OooO00o.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            oooO00o.f4305OooOo0 = null;
            oooO00o.f4318Oooo00O = State.Constraint.START_TO_END;
            oooO00o.f4307OooOo0O = null;
        } else {
            if (i != 2) {
                return;
            }
            oooO00o.f4308OooOo0o = null;
            oooO00o.f4318Oooo00O = State.Constraint.END_TO_END;
            oooO00o.f4304OooOo = null;
        }
    }

    public static final void OooO0O0(androidx.constraintlayout.core.state.OooO00o oooO00o, LayoutDirection layoutDirection) {
        oooO00o.f4303OooOOoo = null;
        oooO00o.f4318Oooo00O = State.Constraint.RIGHT_TO_RIGHT;
        oooO00o.f4306OooOo00 = null;
        int i = OooO00o.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            oooO00o.f4308OooOo0o = null;
            oooO00o.f4318Oooo00O = State.Constraint.END_TO_END;
            oooO00o.f4304OooOo = null;
        } else {
            if (i != 2) {
                return;
            }
            oooO00o.f4305OooOo0 = null;
            oooO00o.f4318Oooo00O = State.Constraint.START_TO_END;
            oooO00o.f4307OooOo0O = null;
        }
    }
}
