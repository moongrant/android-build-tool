package p528o0o0OOOo;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53707OooO00o = ComposableLambdaKt.composableLambdaInstance(-1352665748, false, OooO00o.f53711OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53708OooO0O0 = ComposableLambdaKt.composableLambdaInstance(-192337590, false, OooO0O0.f53712OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53709OooO0OO = ComposableLambdaKt.composableLambdaInstance(-2117802984, false, OooO0OO.f53713OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53710OooO0Oo = ComposableLambdaKt.composableLambdaInstance(449384413, false, OooO0o.f53714OooO0Oo);

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f53711OooO0Oo = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1352665748, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.ComposableSingletons$MomentCommentDialogKt.lambda-1.<anonymous> (MomentCommentDialog.kt:68)");
                }
                o0O0o00O.OooO0Oo(o0O0o00O.f53726OooO00o, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f53712OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-192337590, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.ComposableSingletons$MomentCommentDialogKt.lambda-2.<anonymous> (MomentCommentDialog.kt:84)");
                }
                o0O0o00O.OooO0Oo(o0O0o00O.f53726OooO00o, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f53713OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2117802984, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.ComposableSingletons$MomentCommentDialogKt.lambda-3.<anonymous> (MomentCommentDialog.kt:110)");
            }
            o0O0o00O.OooO0Oo(o0O0o00O.f53726OooO00o, composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function4<PagerScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f53714OooO0Oo = new OooO0o();

        public OooO0o() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
            PagerScope HorizontalPager = pagerScope;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(449384413, iIntValue2, -1, "com.yalla.yalla.ui.screen.moment.media.ComposableSingletons$MomentCommentDialogKt.lambda-4.<anonymous> (MomentCommentDialog.kt:165)");
            }
            if (iIntValue == 0) {
                composer2.startReplaceableGroup(1727454289);
                o0OO0o.f53756OooO00o.OooO00o(iIntValue, composer2, ((iIntValue2 >> 3) & 14) | 48);
                composer2.endReplaceableGroup();
            } else if (iIntValue == 1) {
                composer2.startReplaceableGroup(1727454353);
                oO0o0o.f54055OooO00o.OooO00o(iIntValue, composer2, ((iIntValue2 >> 3) & 14) | 48);
                composer2.endReplaceableGroup();
            } else if (iIntValue != 2) {
                composer2.startReplaceableGroup(1727454455);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(1727454415);
                oO0Oo.f54032OooO00o.OooO00o(iIntValue, composer2, ((iIntValue2 >> 3) & 14) | 48);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }
}
