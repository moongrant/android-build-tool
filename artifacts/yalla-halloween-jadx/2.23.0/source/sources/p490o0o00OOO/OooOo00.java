package p490o0o00OOO;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p539o0o0OoOO.p0;
import p539o0o0OoOO.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 {

    @SourceDebugExtension({"SMAP\nPanelLayoutComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanelLayoutComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/PanelLayoutCompKt$PanelLayoutComp$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,90:1\n76#2:91\n1#3:92\n66#4,6:93\n72#4:127\n76#4:132\n78#5,11:99\n91#5:131\n456#6,8:110\n464#6,3:124\n467#6,3:128\n4144#7,6:118\n*S KotlinDebug\n*F\n+ 1 PanelLayoutComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/PanelLayoutCompKt$PanelLayoutComp$1\n*L\n50#1:91\n47#1:93,6\n47#1:127\n47#1:132\n47#1:99,11\n47#1:131\n47#1:110,8\n47#1:124,3\n47#1:128,3\n47#1:118,6\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOo f48512OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ y0 f48513OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOo oooOo, y0 y0Var) {
            super(3);
            this.f48512OooO0Oo = oooOo;
            this.f48513OooO0o0 = y0Var;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1961794442, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.bottom.PanelLayoutComp.<anonymous> (PanelLayoutComp.kt:45)");
            }
            Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo321toDpu2uoSUM(this.f48512OooO0Oo.f48510OooO0o.getValue().intValue()));
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o = OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            p0.OooO0O0(this.f48513OooO0o0, composer2, 8);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOo f48514OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f48515OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ y0 f48516OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f48517OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f48518OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(OooOo oooOo, y0 y0Var, int i, int i2, int i3) {
            super(2);
            this.f48514OooO0Oo = oooOo;
            this.f48516OooO0o0 = y0Var;
            this.f48515OooO0o = i;
            this.f48517OooO0oO = i2;
            this.f48518OooO0oo = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOo00.OooO00o(this.f48514OooO0Oo, this.f48516OooO0o0, this.f48515OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f48517OooO0oO | 1), this.f48518OooO0oo);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull OooOo panelLayoutState, @NotNull y0 facePanelState, int i, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(panelLayoutState, "panelLayoutState");
        Intrinsics.checkNotNullParameter(facePanelState, "facePanelState");
        Composer composerStartRestartGroup = composer.startRestartGroup(666870450);
        int i4 = (i3 & 4) != 0 ? 60 : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(666870450, i2, -1, "com.yalla.yalla.ui.activity.room.live.bottom.PanelLayoutComp (PanelLayoutComp.kt:29)");
        }
        AnimatedVisibilityKt.AnimatedVisibility(panelLayoutState.f48511OooO0o0.getValue().booleanValue(), (Modifier) null, EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(i4, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, false, null, 14, null), EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.spring$default(1.0f, 1500.0f, null, 4, null), null, false, null, 14, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1961794442, true, new OooO00o(panelLayoutState, facePanelState)), composerStartRestartGroup, 196608, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(panelLayoutState, facePanelState, i4, i2, i3));
    }
}
