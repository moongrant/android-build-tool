package p497o0o00OoO;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p587o0oOooOO.i;
import p587o0oOooOO.t;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O00 {

    public static final class OooO00o extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f49741OooO0Oo = new OooO00o();

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

    @SourceDebugExtension({"SMAP\nPanelLayoutComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanelLayoutComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/PanelLayoutCompKt$PanelLayoutComp$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,92:1\n76#2:93\n1#3:94\n66#4,6:95\n72#4:129\n76#4:134\n78#5,11:101\n91#5:133\n456#6,8:112\n464#6,3:126\n467#6,3:130\n4144#7,6:120\n*S KotlinDebug\n*F\n+ 1 PanelLayoutComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/PanelLayoutCompKt$PanelLayoutComp$2\n*L\n52#1:93\n49#1:95,6\n49#1:129\n49#1:134\n49#1:101,11\n49#1:133\n49#1:112,8\n49#1:126,3\n49#1:130,3\n49#1:120,6\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000oo f49742OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ t f49743OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0000oo o0000ooVar, t tVar) {
            super(3);
            this.f49742OooO0Oo = o0000ooVar;
            this.f49743OooO0o0 = tVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1961794442, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.bottom.PanelLayoutComp.<anonymous> (PanelLayoutComp.kt:48)");
            }
            Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo323toDpu2uoSUM(this.f49742OooO0Oo.f49753OooO0o.getValue().intValue()));
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM511height3ABfNKs);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o = OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            i.OooO0O0(this.f49743OooO0o0, composer2, 8);
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

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000oo f49744OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f49745OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ t f49746OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f49747OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f49748OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0000oo o0000ooVar, t tVar, int i, int i2, int i3) {
            super(2);
            this.f49744OooO0Oo = o0000ooVar;
            this.f49746OooO0o0 = tVar;
            this.f49745OooO0o = i;
            this.f49747OooO0oO = i2;
            this.f49748OooO0oo = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000O00.OooO00o(this.f49744OooO0Oo, this.f49746OooO0o0, this.f49745OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f49747OooO0oO | 1), this.f49748OooO0oo);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull o0000oo panelLayoutState, @NotNull t facePanelState, int i, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(panelLayoutState, "panelLayoutState");
        Intrinsics.checkNotNullParameter(facePanelState, "facePanelState");
        Composer composerStartRestartGroup = composer.startRestartGroup(666870450);
        int i4 = (i3 & 4) != 0 ? 60 : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(666870450, i2, -1, "com.yalla.yalla.ui.activity.room.live.bottom.PanelLayoutComp (PanelLayoutComp.kt:34)");
        }
        AnimatedVisibilityKt.AnimatedVisibility(panelLayoutState.f49754OooO0o0.getValue().booleanValue(), SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, OooO00o.f49741OooO0Oo, 1, null), EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(i4, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, false, null, 14, null), EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.spring$default(1.0f, 1500.0f, null, 4, null), null, false, null, 14, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1961794442, true, new OooO0O0(panelLayoutState, facePanelState)), composerStartRestartGroup, 196608, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(panelLayoutState, facePanelState, i4, i2, i3));
    }
}
