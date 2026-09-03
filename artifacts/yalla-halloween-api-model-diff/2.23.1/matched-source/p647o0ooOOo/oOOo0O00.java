package p647o0ooOOo;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.State;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class oOOo0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Function3<androidx.constraintlayout.core.state.OooO00o, Object, LayoutDirection, androidx.constraintlayout.core.state.OooO00o>[][] f57645OooO00o = {new Function3[]{OooOO0.f57651OooO0Oo, OooOO0O.f57652OooO0Oo}, new Function3[]{OooOOO0.f57654OooO0Oo, OooOOO.f57653OooO0Oo}};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Function2<androidx.constraintlayout.core.state.OooO00o, Object, androidx.constraintlayout.core.state.OooO00o>[][] f57646OooO0O0 = {new Function2[]{OooO0O0.f57648OooO0Oo, OooO0OO.f57649OooO0Oo}, new Function2[]{OooO0o.f57650OooO0Oo, OooO.f57647OooO0Oo}};

    public static final class OooO extends Lambda implements Function2<androidx.constraintlayout.core.state.OooO00o, Object, androidx.constraintlayout.core.state.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f57647OooO0Oo = new OooO();

        public OooO() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final androidx.constraintlayout.core.state.OooO00o invoke(androidx.constraintlayout.core.state.OooO00o oooO00o, Object other) {
            androidx.constraintlayout.core.state.OooO00o arrayOf = oooO00o;
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            arrayOf.f4314OooOoOO = null;
            arrayOf.f4315OooOoo = null;
            arrayOf.f4321Oooo00O = State.Constraint.BOTTOM_TO_BOTTOM;
            arrayOf.f4316OooOoo0 = other;
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
        public static final OooO0O0 f57648OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final androidx.constraintlayout.core.state.OooO00o invoke(androidx.constraintlayout.core.state.OooO00o oooO00o, Object other) {
            androidx.constraintlayout.core.state.OooO00o arrayOf = oooO00o;
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            arrayOf.f4312OooOoO = null;
            arrayOf.f4315OooOoo = null;
            arrayOf.f4321Oooo00O = State.Constraint.TOP_TO_TOP;
            arrayOf.f4313OooOoO0 = other;
            Intrinsics.checkNotNullExpressionValue(arrayOf, "topToTop(other)");
            return arrayOf;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<androidx.constraintlayout.core.state.OooO00o, Object, androidx.constraintlayout.core.state.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f57649OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final androidx.constraintlayout.core.state.OooO00o invoke(androidx.constraintlayout.core.state.OooO00o oooO00o, Object other) {
            androidx.constraintlayout.core.state.OooO00o arrayOf = oooO00o;
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            arrayOf.f4313OooOoO0 = null;
            arrayOf.f4315OooOoo = null;
            arrayOf.f4321Oooo00O = State.Constraint.TOP_TO_BOTTOM;
            arrayOf.f4312OooOoO = other;
            Intrinsics.checkNotNullExpressionValue(arrayOf, "topToBottom(other)");
            return arrayOf;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<androidx.constraintlayout.core.state.OooO00o, Object, androidx.constraintlayout.core.state.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f57650OooO0Oo = new OooO0o();

        public OooO0o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final androidx.constraintlayout.core.state.OooO00o invoke(androidx.constraintlayout.core.state.OooO00o oooO00o, Object other) {
            androidx.constraintlayout.core.state.OooO00o arrayOf = oooO00o;
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            arrayOf.f4316OooOoo0 = null;
            arrayOf.f4315OooOoo = null;
            arrayOf.f4321Oooo00O = State.Constraint.BOTTOM_TO_TOP;
            arrayOf.f4314OooOoOO = other;
            Intrinsics.checkNotNullExpressionValue(arrayOf, "bottomToTop(other)");
            return arrayOf;
        }
    }

    public static final class OooOO0 extends Lambda implements Function3<androidx.constraintlayout.core.state.OooO00o, Object, LayoutDirection, androidx.constraintlayout.core.state.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f57651OooO0Oo = new OooOO0();

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
            oOOo0O00.OooO00o(arrayOf, layoutDirection2);
            arrayOf.f4321Oooo00O = State.Constraint.LEFT_TO_LEFT;
            arrayOf.f4305OooOOo0 = other;
            Intrinsics.checkNotNullExpressionValue(arrayOf, "leftToLeft(other)");
            return arrayOf;
        }
    }

    public static final class OooOO0O extends Lambda implements Function3<androidx.constraintlayout.core.state.OooO00o, Object, LayoutDirection, androidx.constraintlayout.core.state.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f57652OooO0Oo = new OooOO0O();

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
            oOOo0O00.OooO00o(arrayOf, layoutDirection2);
            arrayOf.f4321Oooo00O = State.Constraint.LEFT_TO_RIGHT;
            arrayOf.f4304OooOOo = other;
            Intrinsics.checkNotNullExpressionValue(arrayOf, "leftToRight(other)");
            return arrayOf;
        }
    }

    public static final class OooOOO extends Lambda implements Function3<androidx.constraintlayout.core.state.OooO00o, Object, LayoutDirection, androidx.constraintlayout.core.state.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f57653OooO0Oo = new OooOOO();

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
            oOOo0O00.OooO0O0(arrayOf, layoutDirection2);
            arrayOf.f4321Oooo00O = State.Constraint.RIGHT_TO_RIGHT;
            arrayOf.f4309OooOo00 = other;
            Intrinsics.checkNotNullExpressionValue(arrayOf, "rightToRight(other)");
            return arrayOf;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function3<androidx.constraintlayout.core.state.OooO00o, Object, LayoutDirection, androidx.constraintlayout.core.state.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f57654OooO0Oo = new OooOOO0();

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
            oOOo0O00.OooO0O0(arrayOf, layoutDirection2);
            arrayOf.f4321Oooo00O = State.Constraint.RIGHT_TO_LEFT;
            arrayOf.f4306OooOOoo = other;
            Intrinsics.checkNotNullExpressionValue(arrayOf, "rightToLeft(other)");
            return arrayOf;
        }
    }

    public static final void OooO00o(androidx.constraintlayout.core.state.OooO00o oooO00o, LayoutDirection layoutDirection) {
        oooO00o.f4305OooOOo0 = null;
        oooO00o.f4321Oooo00O = State.Constraint.LEFT_TO_RIGHT;
        oooO00o.f4304OooOOo = null;
        int i = OooO00o.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            oooO00o.f4308OooOo0 = null;
            oooO00o.f4321Oooo00O = State.Constraint.START_TO_END;
            oooO00o.f4310OooOo0O = null;
        } else {
            if (i != 2) {
                return;
            }
            oooO00o.f4311OooOo0o = null;
            oooO00o.f4321Oooo00O = State.Constraint.END_TO_END;
            oooO00o.f4307OooOo = null;
        }
    }

    public static final void OooO0O0(androidx.constraintlayout.core.state.OooO00o oooO00o, LayoutDirection layoutDirection) {
        oooO00o.f4306OooOOoo = null;
        oooO00o.f4321Oooo00O = State.Constraint.RIGHT_TO_RIGHT;
        oooO00o.f4309OooOo00 = null;
        int i = OooO00o.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            oooO00o.f4311OooOo0o = null;
            oooO00o.f4321Oooo00O = State.Constraint.END_TO_END;
            oooO00o.f4307OooOo = null;
        } else {
            if (i != 2) {
                return;
            }
            oooO00o.f4308OooOo0 = null;
            oooO00o.f4321Oooo00O = State.Constraint.START_TO_END;
            oooO00o.f4310OooOo0O = null;
        }
    }
}
