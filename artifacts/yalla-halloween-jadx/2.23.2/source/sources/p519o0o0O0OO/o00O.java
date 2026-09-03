package p519o0o0O0OO;

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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.OooOO0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.vm.moment.TopicInfoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentDetailTopicShowComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailTopicShowComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailTopicShowCompKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,240:1\n71#2,7:241\n78#2:276\n82#2:281\n78#3,11:248\n91#3:280\n456#4,8:259\n464#4,3:273\n467#4,3:277\n4144#5,6:267\n*S KotlinDebug\n*F\n+ 1 MomentDetailTopicShowComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailTopicShowCompKt\n*L\n237#1:241,7\n237#1:276\n237#1:281\n237#1:248,11\n237#1:280\n237#1:259,8\n237#1:273,3\n237#1:277,3\n237#1:267,6\n*E\n"})
public final class o00O {

    public static final class OooO00o extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f51994OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentDetailTopicShowComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailTopicShowComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailTopicShowCompKt$MomentDetailTopicShow$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,240:1\n154#2:241\n154#2:243\n154#2:244\n154#2:245\n154#2:246\n76#3:242\n*S KotlinDebug\n*F\n+ 1 MomentDetailTopicShowComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailTopicShowCompKt$MomentDetailTopicShow$2\n*L\n60#1:241\n66#1:243\n67#1:244\n69#1:245\n72#1:246\n62#1:242\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ TopicInfoVM f51995OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(TopicInfoVM topicInfoVM) {
            super(3);
            this.f51995OooO0Oo = topicInfoVM;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1012258833, iIntValue, -1, "com.yalla.yalla.ui.composable.moment.MomentDetailTopicShow.<anonymous> (MomentDetailTopicShowComp.kt:57)");
            }
            TopicInfoModel value = this.f51995OooO0Oo.getTopicInfo().getValue();
            Intrinsics.checkNotNull(value);
            TopicInfoModel topicInfoModel = value;
            OooOO0.OooO0o(Dp.m3775constructorimpl(2), null, composer2, 6, 2);
            float f = 12;
            SurfaceKt.m1201SurfaceFjzlyU(o0O0O00.OooO0O0(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(PaddingKt.m480paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3775constructorimpl(15), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(f), 7, null), 0.0f, 1, null), Dp.m3775constructorimpl(77)), false, false, 0L, false, null, null, null, new o00OO000((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()), topicInfoModel), 253), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f)), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, 1003479629, true, new o00OO00O(topicInfoModel)), composer2, 1572864, 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f51996OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51997OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TopicInfoVM f51998OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ColumnScope columnScope, TopicInfoVM topicInfoVM, int i) {
            super(2);
            this.f51996OooO0Oo = columnScope;
            this.f51998OooO0o0 = topicInfoVM;
            this.f51997OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51997OooO0o | 1);
            o00O.OooO00o(this.f51996OooO0Oo, this.f51998OooO0o0, composer, iUpdateChangedFlags);
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
                ComposerKt.traceEventStart(1876472633, i2, -1, "com.yalla.yalla.ui.composable.moment.MomentDetailTopicShow (MomentDetailTopicShowComp.kt:55)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(columnScope, topicInfoVM.getTopicInfo().getValue() != null, SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, OooO00o.f51994OooO0Oo, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1012258833, true, new OooO0O0(topicInfoVM)), composerStartRestartGroup, (i2 & 14) | 1572864, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(columnScope, topicInfoVM, i));
    }
}
