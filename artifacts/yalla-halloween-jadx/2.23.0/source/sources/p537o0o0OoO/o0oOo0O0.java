package p537o0o0OoO;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Observer;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.vip.VipWelfareModel;
import com.yalla.yalla.ui.vm.room.VipVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O0.OooOOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p148o00Oo0o.o0O0O00;
import p417o0OoO0.o00000O;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nWelfareMallPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelfareMallPage.kt\ncom/yalla/yalla/ui/screen/user/vip/WelfareMallPageKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,104:1\n154#2:105\n154#2:141\n66#3,6:106\n72#3:140\n76#3:146\n78#4,11:112\n91#4:145\n456#5,8:123\n464#5,3:137\n467#5,3:142\n4144#6,6:131\n*S KotlinDebug\n*F\n+ 1 WelfareMallPage.kt\ncom/yalla/yalla/ui/screen/user/vip/WelfareMallPageKt\n*L\n52#1:105\n68#1:141\n49#1:106,6\n49#1:140\n49#1:146\n49#1:112,11\n49#1:145\n49#1:123,8\n49#1:137,3\n49#1:142,3\n49#1:131,6\n*E\n"})
public final class o0oOo0O0 {

    public static final class OooO00o implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<VipWelfareModel> f55402OooO0Oo;

        public OooO00o(o000O0.OooO0O0<VipWelfareModel> oooO0O0) {
            this.f55402OooO0Oo = oooO0O0;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            bool.booleanValue();
            this.f55402OooO0Oo.OooO0Oo();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<VipWelfareModel> f55403OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o000O0.OooO0O0<VipWelfareModel> oooO0O0) {
            super(3);
            this.f55403OooO0Oo = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope RefreshContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1499302833, iIntValue, -1, "com.yalla.yalla.ui.screen.user.vip.WelFareRecordPage.<anonymous>.<anonymous> (WelfareMallPage.kt:76)");
                }
                o0O00OO.OooO00o(new o0O0oo00(this.f55403OooO0Oo), 0, null, 0L, null, null, composer2, 0, 62);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nWelfareMallPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelfareMallPage.kt\ncom/yalla/yalla/ui/screen/user/vip/WelfareMallPageKt$WelFareRecordPage$2$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,104:1\n154#2:105\n154#2:106\n*S KotlinDebug\n*F\n+ 1 WelfareMallPage.kt\ncom/yalla/yalla/ui/screen/user/vip/WelfareMallPageKt$WelFareRecordPage$2$2\n*L\n80#1:105\n81#1:106\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<VipWelfareModel> f55404OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f55405OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o000O0.OooO0O0<VipWelfareModel> oooO0O0, VipVm vipVm) {
            super(3);
            this.f55404OooO0Oo = oooO0O0;
            this.f55405OooO0o0 = vipVm;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope RefreshContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-603150670, iIntValue, -1, "com.yalla.yalla.ui.screen.user.vip.WelFareRecordPage.<anonymous>.<anonymous> (WelfareMallPage.kt:76)");
                }
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                Arrangement arrangement = Arrangement.INSTANCE;
                float f = 12;
                LazyGridDslKt.LazyVerticalGrid(fixed, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, false, arrangement.m390spacedBy0680j_4(Dp.m3765constructorimpl(f)), arrangement.m390spacedBy0680j_4(Dp.m3765constructorimpl(f)), null, false, new oo0oO0(this.f55404OooO0Oo, this.f55405OooO0o0), composer2, 1769520, FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f55406OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55407OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(VipVm vipVm, int i) {
            super(2);
            this.f55406OooO0Oo = vipVm;
            this.f55407OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55407OooO0o0 | 1);
            o0oOo0O0.OooO00o(this.f55406OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull VipVm vipViewModel, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(vipViewModel, "vipViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-138913200);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-138913200, i, -1, "com.yalla.yalla.ui.screen.user.vip.WelFareRecordPage (WelfareMallPage.kt:41)");
        }
        NestedScrollConnection nestedScrollConnectionRememberNestedScrollInteropConnection = NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composerStartRestartGroup, 0, 1);
        o000O0.OooO0O0 oooO0O0OooO00o = OooOOO.OooO00o(vipViewModel.getMyWelfareData().f37667OooO0oo, composerStartRestartGroup);
        Observable<Object> observable = LiveEventBus.get("WELFARE_ITEM_OUT_OF_STOCK_NOTIFY");
        Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.WELFARE_ITEM_OUT_OF_STOCK_NOTIFY)");
        o00000O.OooO00o(observable, new OooO00o(oooO0O0OooO00o), composerStartRestartGroup, 8);
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 16;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m168backgroundbw27NRU(companion, o0oO0O0o.f47119o00O0Oo, RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 0.0f, 0.0f, 12, null)), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_welfare_mall_bg, composerStartRestartGroup, 0), (String) null, SizeKt.fillMaxWidth$default(BoxScopeInstance.INSTANCE.align(companion, companion2.getTopCenter()), 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        Modifier modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(SizeKt.fillMaxSize$default(NestedScrollModifierKt.nestedScroll$default(companion, nestedScrollConnectionRememberNestedScrollInteropConnection, null, 2, null), 0.0f, 1, null), Dp.m3765constructorimpl(f));
        ComposableLambda composableLambda = o0O00O0o.f55293OooO00o;
        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1499302833, true, new OooO0O0(oooO0O0OooO00o));
        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -603150670, true, new OooO0OO(oooO0O0OooO00o, vipViewModel));
        int i2 = o000O0.OooO0O0.f34327OooO0o0;
        o0O0O00.OooO00o(oooO0O0OooO00o, modifierM476padding3ABfNKs, null, null, false, null, composableLambda, composableLambda2, composableLambda3, composerStartRestartGroup, 114819080, 60);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(vipViewModel, i));
    }
}
