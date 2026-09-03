package p507o0o00ooo;

import android.content.Context;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0O0O00;
import com.facebook.OooOo;
import com.yalla.yalla.model.moment.MomentBannerModel;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p184o00o00o.OooOOOO;
import p184o00o00o.Oooo000;
import p417o0OoO0.o00Oo0;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFeaturedTopBannerComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeaturedTopBannerComp.kt\ncom/yalla/yalla/ui/composable/common/FeaturedTopBannerCompKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n76#2:168\n76#2:169\n81#3,11:170\n154#4:181\n154#4:217\n154#4:218\n154#4:219\n154#4:220\n154#4:221\n66#5,6:182\n72#5:216\n76#5:226\n78#6,11:188\n91#6:225\n456#7,8:199\n464#7,3:213\n467#7,3:222\n4144#8,6:207\n1#9:227\n*S KotlinDebug\n*F\n+ 1 FeaturedTopBannerComp.kt\ncom/yalla/yalla/ui/composable/common/FeaturedTopBannerCompKt\n*L\n55#1:168\n56#1:169\n57#1:170,11\n62#1:181\n68#1:217\n73#1:218\n100#1:219\n101#1:220\n106#1:221\n59#1:182,6\n59#1:216\n59#1:226\n59#1:188,11\n59#1:225\n59#1:199,8\n59#1:213,3\n59#1:222,3\n59#1:207,6\n*E\n"})
public final class d0 {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentBannerModel f49802OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49803OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentBannerModel momentBannerModel, int i) {
            super(2);
            this.f49802OooO0Oo = momentBannerModel;
            this.f49803OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49803OooO0o0 | 1);
            d0.OooO00o(this.f49802OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nFeaturedTopBannerComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeaturedTopBannerComp.kt\ncom/yalla/yalla/ui/composable/common/FeaturedTopBannerCompKt$FeaturedTopBanner$2$pagerStateAndPageMapper$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,167:1\n154#2:168\n*S KotlinDebug\n*F\n+ 1 FeaturedTopBannerComp.kt\ncom/yalla/yalla/ui/composable/common/FeaturedTopBannerCompKt$FeaturedTopBanner$2$pagerStateAndPageMapper$1\n*L\n84#1:168\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f49804OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Context f49805OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<MomentBannerModel.MomentBannerItem> f49806OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ BaseMomentDetailVM f49807OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f49808OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, List list, Context context, BaseMomentDetailVM baseMomentDetailVM, LifecycleOwner lifecycleOwner) {
            super(3);
            this.f49804OooO0Oo = i;
            this.f49806OooO0o0 = list;
            this.f49805OooO0o = context;
            this.f49807OooO0oO = baseMomentDetailVM;
            this.f49808OooO0oo = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Integer num, Composer composer, Integer num2) {
            int i;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 14) == 0) {
                i = (composer2.changed(iIntValue) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((i & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-800578596, iIntValue2, -1, "com.yalla.yalla.ui.composable.common.FeaturedTopBanner.<anonymous>.<anonymous> (FeaturedTopBannerComp.kt:73)");
                }
                int iOooO0OO = oOOO00o0.OooO0OO(iIntValue - LockFreeTaskQueueCore.MAX_CAPACITY_MASK, this.f49804OooO0Oo);
                ImageKt.Image(o00Oo0.OooO0OO(this.f49806OooO0o0.get(iOooO0OO).getImageUrl(), e0.f49832OooO0Oo, composer2, 48, 0), (String) null, o0O0O00.OooO0O0(OooOo.OooO0O0(9, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), false, false, 0L, false, null, null, null, new g0(this.f49806OooO0o0, iOooO0OO, this.f49805OooO0o, this.f49807OooO0oO, this.f49808OooO0oo), 253), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentBannerModel f49809OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49810OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentBannerModel momentBannerModel, int i) {
            super(2);
            this.f49809OooO0Oo = momentBannerModel;
            this.f49810OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49810OooO0o0 | 1);
            d0.OooO00o(this.f49809OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentBannerModel f49811OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49812OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MomentBannerModel momentBannerModel, int i) {
            super(2);
            this.f49811OooO0Oo = momentBannerModel;
            this.f49812OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49812OooO0o0 | 1);
            d0.OooO00o(this.f49811OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable MomentBannerModel momentBannerModel, @Nullable Composer composer, int i) {
        List<MomentBannerModel.MomentBannerItem> bannerList;
        Composer composerStartRestartGroup = composer.startRestartGroup(1262574173);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1262574173, i, -1, "com.yalla.yalla.ui.composable.common.FeaturedTopBanner (FeaturedTopBannerComp.kt:43)");
        }
        if (momentBannerModel == null || (bannerList = momentBannerModel.getBannerList()) == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(momentBannerModel, i));
            return;
        }
        if (bannerList.isEmpty()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup2.updateScope(new OooO00o(momentBannerModel, i));
            return;
        }
        int size = bannerList.size();
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(BaseMomentDetailVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        BaseMomentDetailVM baseMomentDetailVM = (BaseMomentDetailVM) viewModel;
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM477paddingVpY3zN4 = PaddingKt.m477paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(15), Dp.m3765constructorimpl(8));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM477paddingVpY3zN4);
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
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Pair pairOooO00o = oOOO00o0.OooO00o(true, size, SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(60)), momentBannerModel.delayTime(), size > 1, Dp.m3765constructorimpl(0), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -800578596, true, new OooO0O0(size, bannerList, context, baseMomentDetailVM, lifecycleOwner)), composerStartRestartGroup, 12583302, 8032);
        composerStartRestartGroup.startReplaceableGroup(-1253312895);
        if (size > 1) {
            Oooo000 oooo000 = (Oooo000) pairOooO00o.getFirst();
            Function1 function1 = (Function1) pairOooO00o.getSecond();
            float f = 7;
            OooOOOO.OooO00o(oooo000, PaddingKt.m480paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(6), 7, null), size, function1, o0oO0O0o.f46946OooO0O0, o0oO0O0o.f46955OooOO0o, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 0.0f, null, composerStartRestartGroup, 14155776, 768);
        }
        if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup3.updateScope(new OooO0OO(momentBannerModel, i));
    }
}
