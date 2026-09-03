package p535o0o0Oo0;

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
public final class o00Oo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53649OooO00o = ComposableLambdaKt.composableLambdaInstance(-1352665748, false, OooO00o.f53653OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53650OooO0O0 = ComposableLambdaKt.composableLambdaInstance(-192337590, false, OooO0O0.f53654OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53651OooO0OO = ComposableLambdaKt.composableLambdaInstance(-2117802984, false, OooO0OO.f53655OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53652OooO0Oo = ComposableLambdaKt.composableLambdaInstance(449384413, false, OooO0o.f53656OooO0Oo);

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f53653OooO0Oo = new OooO00o();

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
                    ComposerKt.traceEventStart(-1352665748, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.ComposableSingletons$MomentCommentDialogKt.lambda-1.<anonymous> (MomentCommentDialog.kt:70)");
                }
                o0.OooO0Oo(o0.f53626OooO00o, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f53654OooO0Oo = new OooO0O0();

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
                    ComposerKt.traceEventStart(-192337590, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.ComposableSingletons$MomentCommentDialogKt.lambda-2.<anonymous> (MomentCommentDialog.kt:86)");
                }
                o0.OooO0Oo(o0.f53626OooO00o, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f53655OooO0Oo = new OooO0OO();

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
                ComposerKt.traceEventStart(-2117802984, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.ComposableSingletons$MomentCommentDialogKt.lambda-3.<anonymous> (MomentCommentDialog.kt:114)");
            }
            o0.OooO0Oo(o0.f53626OooO00o, composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function4<PagerScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f53656OooO0Oo = new OooO0o();

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
                ComposerKt.traceEventStart(449384413, iIntValue2, -1, "com.yalla.yalla.ui.screen.moment.media.ComposableSingletons$MomentCommentDialogKt.lambda-4.<anonymous> (MomentCommentDialog.kt:169)");
            }
            if (iIntValue == 0) {
                composer2.startReplaceableGroup(1727454392);
                o0O0O0O.f53680OooO00o.OooO00o(iIntValue, composer2, ((iIntValue2 >> 3) & 14) | 48);
                composer2.endReplaceableGroup();
            } else if (iIntValue == 1) {
                composer2.startReplaceableGroup(1727454456);
                o0OO00o0.f53747OooO00o.OooO00o(iIntValue, composer2, ((iIntValue2 >> 3) & 14) | 48);
                composer2.endReplaceableGroup();
            } else if (iIntValue != 2) {
                composer2.startReplaceableGroup(1727454558);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(1727454518);
                o0O0OOOo.f53714OooO00o.OooO00o(iIntValue, composer2, ((iIntValue2 >> 3) & 14) | 48);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }
}
