package p509o0o0O0;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.OooOO0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.vm.moment.TopicInfoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentDetailTopicShowComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailTopicShowComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailTopicShowCompKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,239:1\n71#2,7:240\n78#2:275\n82#2:280\n78#3,11:247\n91#3:279\n456#4,8:258\n464#4,3:272\n467#4,3:276\n4144#5,6:266\n*S KotlinDebug\n*F\n+ 1 MomentDetailTopicShowComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailTopicShowCompKt\n*L\n236#1:240,7\n236#1:275\n236#1:280\n236#1:247,11\n236#1:279\n236#1:258,8\n236#1:272,3\n236#1:276,3\n236#1:266,6\n*E\n"})
public final class o000OO {

    @SourceDebugExtension({"SMAP\nMomentDetailTopicShowComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailTopicShowComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailTopicShowCompKt$MomentDetailTopicShow$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,239:1\n154#2:240\n154#2:242\n154#2:243\n154#2:244\n154#2:245\n76#3:241\n*S KotlinDebug\n*F\n+ 1 MomentDetailTopicShowComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailTopicShowCompKt$MomentDetailTopicShow$1\n*L\n59#1:240\n65#1:242\n66#1:243\n68#1:244\n71#1:245\n61#1:241\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ TopicInfoVM f50648OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(TopicInfoVM topicInfoVM) {
            super(3);
            this.f50648OooO0Oo = topicInfoVM;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1012258833, iIntValue, -1, "com.yalla.yalla.ui.composable.moment.MomentDetailTopicShow.<anonymous> (MomentDetailTopicShowComp.kt:55)");
            }
            TopicInfoModel value = this.f50648OooO0Oo.getTopicInfo().getValue();
            Intrinsics.checkNotNull(value);
            TopicInfoModel topicInfoModel = value;
            OooOO0.OooO0o(Dp.m3765constructorimpl(2), null, composer2, 6, 2);
            float f = 12;
            SurfaceKt.m1185SurfaceFjzlyU(o0O0O00.OooO0O0(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(PaddingKt.m478paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(15), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(f), 7, null), 0.0f, 1, null), Dp.m3765constructorimpl(77)), false, false, 0L, false, null, null, null, new o0000O0((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()), topicInfoModel), 253), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f)), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, 1003479629, true, new o0000O0O(topicInfoModel)), composer2, 1572864, 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f50649OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50650OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TopicInfoVM f50651OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ColumnScope columnScope, TopicInfoVM topicInfoVM, int i) {
            super(2);
            this.f50649OooO0Oo = columnScope;
            this.f50651OooO0o0 = topicInfoVM;
            this.f50650OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50650OooO0o | 1);
            o000OO.OooO00o(this.f50649OooO0Oo, this.f50651OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull ColumnScope columnScope, @NotNull TopicInfoVM topicInfoVM, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(topicInfoVM, "topicInfoVM");
        Composer composerStartRestartGroup = composer.startRestartGroup(1876472633);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(topicInfoVM) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1876472633, i2, -1, "com.yalla.yalla.ui.composable.moment.MomentDetailTopicShow (MomentDetailTopicShowComp.kt:54)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(columnScope, topicInfoVM.getTopicInfo().getValue() != null, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1012258833, true, new OooO00o(topicInfoVM)), composerStartRestartGroup, (i2 & 14) | 1572864, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(columnScope, topicInfoVM, i));
    }
}
