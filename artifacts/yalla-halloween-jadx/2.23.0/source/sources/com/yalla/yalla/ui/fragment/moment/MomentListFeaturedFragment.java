package com.yalla.yalla.ui.fragment.moment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.uikit.swiprefresh.RefreshState;
import com.code.android.util.o000OO00;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.moment.MomentBannerModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.ui.vm.moment.MomentFeaturedVM;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p507o0o00ooo.d0;
import p579o0oOoo.oO0O0O00;
import p579o0oOoo.oO0OOO00;
import p579o0oOoo.oOOOOo0O;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.m6;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0014J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\u0006\u0010\u0017\u001a\u00020\u0003R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/yalla/yalla/ui/fragment/moment/MomentListFeaturedFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/m6;", "", "initView", "Lcom/yalla/yalla/ui/vm/moment/MomentFeaturedVM;", "newMomentVM", "InitObservers", "(Lcom/yalla/yalla/ui/vm/moment/MomentFeaturedVM;Landroidx/compose/runtime/Composer;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onLazyInit", "onDestroy", "onResume", "onPause", "scrollToTop", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "momentVM$delegate", "Lkotlin/Lazy;", "getMomentVM", "()Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "momentVM", "Lo0oOoo/oO0O0O00;", "momentGiftSendUtil$delegate", "getMomentGiftSendUtil", "()Lo0oOoo/oO0O0O00;", "momentGiftSendUtil", "Landroidx/compose/foundation/lazy/LazyListState;", "mLazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "Lcom/code/android/uikit/swiprefresh/RefreshState;", "mRefreshState", "Lcom/code/android/uikit/swiprefresh/RefreshState;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMomentListFeaturedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentListFeaturedFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentListFeaturedFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,280:1\n106#2,15:281\n*S KotlinDebug\n*F\n+ 1 MomentListFeaturedFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentListFeaturedFragment\n*L\n70#1:281,15\n*E\n"})
public final class MomentListFeaturedFragment extends p508o0o0O.OooOO0O<m6> {
    public static final int $stable = 8;

    @Nullable
    private LazyListState mLazyListState;

    @Nullable
    private RefreshState mRefreshState;

    /* JADX INFO: renamed from: momentGiftSendUtil$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy momentGiftSendUtil;

    /* JADX INFO: renamed from: momentVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy momentVM;

    public static final class OooO extends Lambda implements Function0<oO0O0O00> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0O0O00 invoke() {
            MomentListFeaturedFragment momentListFeaturedFragment = MomentListFeaturedFragment.this;
            FragmentActivity fragmentActivityRequireActivity = momentListFeaturedFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return new oO0O0O00(fragmentActivityRequireActivity, GiftPropTypeShow.InMomentList, momentListFeaturedFragment.getMomentVM(), null, 24);
        }
    }

    public static final class OooO00o implements Observer<MomentDetailModel> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentFeaturedVM f28774OooO0Oo;

        public OooO00o(MomentFeaturedVM momentFeaturedVM) {
            this.f28774OooO0Oo = momentFeaturedVM;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(MomentDetailModel momentDetailModel) {
            MomentDetailModel it = momentDetailModel;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f28774OooO0Oo.deleteAD(it);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28776OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentFeaturedVM f28777OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MomentFeaturedVM momentFeaturedVM, int i) {
            super(2);
            this.f28777OooO0o0 = momentFeaturedVM;
            this.f28776OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28776OooO0o | 1);
            MomentListFeaturedFragment.this.InitObservers(this.f28777OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentListFeaturedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentListFeaturedFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentListFeaturedFragment$initView$2\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,280:1\n81#2,11:281\n*S KotlinDebug\n*F\n+ 1 MomentListFeaturedFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentListFeaturedFragment$initView$2\n*L\n131#1:281,11\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {
        public OooO0OO() {
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
                    ComposerKt.traceEventStart(1715717152, iIntValue, -1, "com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment.initView.<anonymous> (MomentListFeaturedFragment.kt:129)");
                }
                composer2.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer2, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel = ViewModelKt.viewModel(MomentFeaturedVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 36936, 0);
                composer2.endReplaceableGroup();
                MomentFeaturedVM momentFeaturedVM = (MomentFeaturedVM) viewModel;
                MomentBannerModel value = momentFeaturedVM.getBannerModel().getValue();
                List<MomentBannerModel.MomentBannerItem> bannerList = value != null ? value.getBannerList() : null;
                boolean z = bannerList == null || bannerList.isEmpty();
                MomentListFeaturedFragment momentListFeaturedFragment = MomentListFeaturedFragment.this;
                if (z) {
                    ImageView imageView = momentListFeaturedFragment.getBinding().f58412OooO0o;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivTopShadow");
                    o000OO00.OooO0O0(imageView);
                } else {
                    ImageView imageView2 = momentListFeaturedFragment.getBinding().f58412OooO0o;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivTopShadow");
                    o000OO00.OooOOOO(imageView2);
                }
                d0.OooO00o(momentFeaturedVM.getBannerModel().getValue(), composer2, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentListFeaturedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentListFeaturedFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentListFeaturedFragment$initView$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,280:1\n66#2,6:281\n72#2:315\n76#2:370\n78#3,11:287\n91#3:369\n456#4,8:298\n464#4,3:312\n25#4:331\n25#4:342\n25#4:351\n50#4:358\n49#4:359\n467#4,3:366\n4144#5,6:306\n81#6,11:316\n486#7,4:327\n490#7,2:335\n494#7:341\n1097#8,3:332\n1100#8,3:338\n1097#8,3:343\n1100#8,3:347\n1097#8,6:352\n1097#8,6:360\n486#9:337\n154#10:346\n76#11:350\n81#12:371\n107#12,2:372\n81#12:374\n*S KotlinDebug\n*F\n+ 1 MomentListFeaturedFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentListFeaturedFragment$initView$3\n*L\n143#1:281,6\n143#1:315\n143#1:370\n143#1:287,11\n143#1:369\n143#1:298,8\n143#1:312,3\n153#1:331\n168#1:342\n176#1:351\n187#1:358\n187#1:359\n143#1:366,3\n143#1:306,6\n144#1:316,11\n153#1:327,4\n153#1:335,2\n153#1:341\n153#1:332,3\n153#1:338,3\n168#1:343,3\n168#1:347,3\n176#1:352,6\n187#1:360,6\n153#1:337\n168#1:346\n170#1:350\n168#1:371\n168#1:372,2\n176#1:374\n*E\n"})
    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {
        public OooO0o() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            RefreshState refreshState;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1469886761, iIntValue, -1, "com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment.initView.<anonymous> (MomentListFeaturedFragment.kt:141)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                MomentListFeaturedFragment momentListFeaturedFragment = MomentListFeaturedFragment.this;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer2, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel = ViewModelKt.viewModel(MomentFeaturedVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 36936, 0);
                composer2.endReplaceableGroup();
                MomentFeaturedVM momentFeaturedVM = (MomentFeaturedVM) viewModel;
                EffectsKt.LaunchedEffect(Unit.INSTANCE, new o0000O0O(momentFeaturedVM, null), composer2, 70);
                momentListFeaturedFragment.InitObservers(momentFeaturedVM, composer2, 72);
                momentListFeaturedFragment.mLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
                momentListFeaturedFragment.mRefreshState = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composer2);
                composer2.startReplaceableGroup(773894976);
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer2.rememberedValue();
                Composer.Companion companion3 = Composer.INSTANCE;
                if (objRememberedValue == companion3.getEmpty()) {
                    objRememberedValue = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                }
                composer2.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composer2.endReplaceableGroup();
                momentFeaturedVM.setScrollToTop(new o0000O(coroutineScope, momentListFeaturedFragment));
                if (!momentFeaturedVM.isRefreshIng().getValue().booleanValue() && (refreshState = momentListFeaturedFragment.mRefreshState) != null) {
                    refreshState.OooO0Oo(false);
                }
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion3.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3763boximpl(Dp.m3765constructorimpl(0)), null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue2;
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                oO0OOO00.f56606OooO00o.OooO00o(momentListFeaturedFragment.mLazyListState, composer2, 64);
                NestedScrollConnection nestedScrollConnectionRememberNestedScrollInteropConnection = NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer2, 0, 1);
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (objRememberedValue3 == companion3.getEmpty()) {
                    LazyListState lazyListState = momentListFeaturedFragment.mLazyListState;
                    Intrinsics.checkNotNull(lazyListState);
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new p515o0o0O0O0.o0Oo0oo(lazyListState), null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                MutableState mutableState2 = (MutableState) objRememberedValue3;
                ((p515o0o0O0O0.o0Oo0oo) mutableState2.getValue()).OooO0O0(momentFeaturedVM.getListData().size(), null, composer2, ConstantsKt.MINIMUM_BLOCK_SIZE, 2);
                RefreshState refreshState2 = momentListFeaturedFragment.mRefreshState;
                Intrinsics.checkNotNull(refreshState2);
                o0000OO0 o0000oo1 = new o0000OO0(momentFeaturedVM);
                composer2.startReplaceableGroup(511388516);
                boolean zChanged = composer2.changed(mutableState) | composer2.changed(density);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChanged || objRememberedValue4 == companion3.getEmpty()) {
                    objRememberedValue4 = new o000(density, mutableState);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, o0000oo1, null, OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) objRememberedValue4), false, ComposableLambdaKt.composableLambda(composer2, -255783330, true, new o000OO0O(mutableState2, mutableState, nestedScrollConnectionRememberNestedScrollInteropConnection, momentListFeaturedFragment, momentFeaturedVM)), composer2, 196616, 20);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Integer, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer it = num;
            ImageView imageView = MomentListFeaturedFragment.this.getBinding().f58412OooO0o;
            oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            imageView.setImageResource(oOOOOo0O.OooO0OO(it.intValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28781OooO0Oo;

        public OooOO0O(OooOO0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28781OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28781OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28781OooO0Oo;
        }

        public final int hashCode() {
            return this.f28781OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28781OooO0Oo.invoke(obj);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment$scrollToTop$1", f = "MomentListFeaturedFragment.kt", i = {}, l = {267}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f28782OooO0Oo;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MomentListFeaturedFragment.this.new OooOOO0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f28782OooO0Oo;
            MomentListFeaturedFragment momentListFeaturedFragment = MomentListFeaturedFragment.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LazyListState lazyListState = momentListFeaturedFragment.mLazyListState;
                if (lazyListState != null) {
                    this.f28782OooO0Oo = 1;
                    if (LazyListState.scrollToItem$default(lazyListState, 0, 0, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RefreshState refreshState = momentListFeaturedFragment.mRefreshState;
            if (refreshState != null) {
                refreshState.OooO0Oo(true);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment$special$$inlined$viewModels$default$1] */
    public MomentListFeaturedFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.momentVM = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(BaseMomentDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28792OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28792OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.momentGiftSendUtil = LazyKt.lazy(new OooO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public final void InitObservers(MomentFeaturedVM momentFeaturedVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-353953809);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-353953809, i, -1, "com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment.InitObservers (MomentListFeaturedFragment.kt:272)");
        }
        Observable<Object> observable = LiveEventBus.get("POST_FEATURED_AD_DELETE");
        Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.POST_FEATURED_AD_DELETE)");
        p417o0OoO0.o00000O.OooO00o(observable, new OooO00o(momentFeaturedVM), composerStartRestartGroup, 8);
        p509o0o0O0.o0ooOOo.OooO00o(momentFeaturedVM, null, composerStartRestartGroup, 8, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(momentFeaturedVM, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oO0O0O00 getMomentGiftSendUtil() {
        return (oO0O0O00) this.momentGiftSendUtil.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseMomentDetailVM getMomentVM() {
        return (BaseMomentDetailVM) this.momentVM.getValue();
    }

    private final void initView() {
        getBinding().f58409OooO0O0.OooO00o(new p485o0o00O0.o0O0O00(this, 1));
        ComposeView composeView = getBinding().f58411OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.composeViewToolBar");
        p147o00Oo0Oo.o000OOo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(1715717152, true, new OooO0OO()));
        ComposeView composeView2 = getBinding().f58410OooO0OO;
        Intrinsics.checkNotNullExpressionValue(composeView2, "binding.composeViewContent");
        p147o00Oo0Oo.o000OOo.OooO0Oo(composeView2, ComposableLambdaKt.composableLambdaInstance(-1469886761, true, new OooO0o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(MomentListFeaturedFragment this$0, AppBarLayout appBarLayout, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().f58412OooO0o.setTranslationY(i);
    }

    @Override // p508o0o0O.OooOO0O, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getMomentVM().statisticalTime();
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        getMomentVM().statisticalTime();
    }

    @Override // p508o0o0O.OooOO0O, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        o0OO000.OooO0O0("403002", MapsKt.mapOf(new Pair("staytime", getTimeLengthStr())));
    }

    @Override // p508o0o0O.OooOO0O, p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.android.billingclient.api.o0000OO0.OooO0O0().OooOO0(1);
        o0OO000.OooO00o("203017");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        p427o0OoOO00.OooOo.f45669OooO00o.observe(getViewLifecycleOwner(), new OooOO0O(new OooOO0()));
    }

    public final void scrollToTop() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooOOO0(null), 3, null);
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public m6 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m6 m6VarInflate = m6.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(m6VarInflate, "inflate(inflater)");
        CollapsingToolbarLayout collapsingToolbarLayout = m6VarInflate.f58413OooO0o0;
        WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooOOO.OooOo0(collapsingToolbarLayout, null);
        return m6VarInflate;
    }
}
