package com.yalla.yalla.ui.fragment.moment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
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
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.ui.vm.moment.MomentFollowingVM;
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
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import p509o0o0O0.o0O00000;
import p523o0o0OO0O.o00OO00O;
import p579o0oOoo.oO0O0O00;
import p579o0oOoo.oO0OOO00;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.n6;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0006\u0010\u0013\u001a\u00020\u0003R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/yalla/yalla/ui/fragment/moment/MainMomentFollowingFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/n6;", "", "initObserver", "initView", "Lcom/yalla/yalla/ui/vm/moment/MomentFollowingVM;", "newMomentVM", "InitObservers", "(Lcom/yalla/yalla/ui/vm/moment/MomentFollowingVM;Landroidx/compose/runtime/Composer;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onDestroy", "onResume", "onPause", "scrollToTop", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "mMomentVM$delegate", "Lkotlin/Lazy;", "getMMomentVM", "()Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "mMomentVM", "Landroidx/compose/foundation/lazy/LazyListState;", "mLazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "Lcom/code/android/uikit/swiprefresh/RefreshState;", "mRefreshState", "Lcom/code/android/uikit/swiprefresh/RefreshState;", "Lo0oOoo/oO0O0O00;", "momentGiftSendUtil$delegate", "getMomentGiftSendUtil", "()Lo0oOoo/oO0O0O00;", "momentGiftSendUtil", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainMomentFollowingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentFollowingFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,355:1\n106#2,15:356\n*S KotlinDebug\n*F\n+ 1 MainMomentFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentFollowingFragment\n*L\n75#1:356,15\n*E\n"})
public final class MainMomentFollowingFragment extends p508o0o0O.OooOO0O<n6> {
    public static final int $stable = 8;

    @Nullable
    private LazyListState mLazyListState;

    /* JADX INFO: renamed from: mMomentVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMomentVM;

    @Nullable
    private RefreshState mRefreshState;

    /* JADX INFO: renamed from: momentGiftSendUtil$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy momentGiftSendUtil;

    public static final class OooO extends Lambda implements Function0<Unit> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RefreshState refreshState = MainMomentFollowingFragment.this.mRefreshState;
            if (refreshState != null) {
                refreshState.OooO0Oo(true);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o implements Observer<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentFollowingVM f28566OooO0Oo;

        public OooO00o(MomentFollowingVM momentFollowingVM) {
            this.f28566OooO0Oo = momentFollowingVM;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MomentFollowingVM momentFollowingVM = this.f28566OooO0Oo;
            momentFollowingVM.checkUnreadPost(momentFollowingVM.getHeadUserList(), false);
        }
    }

    public static final class OooO0O0 implements Observer<MomentSendModel> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentFollowingVM f28567OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainMomentFollowingFragment f28568OooO0o0;

        public OooO0O0(MomentFollowingVM momentFollowingVM, MainMomentFollowingFragment mainMomentFollowingFragment) {
            this.f28567OooO0Oo = momentFollowingVM;
            this.f28568OooO0o0 = mainMomentFollowingFragment;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(MomentSendModel momentSendModel) {
            MomentSendModel it = momentSendModel;
            Intrinsics.checkNotNullParameter(it, "it");
            p592o0oo00O.OooOOO0.OooO0O0("动态任务 新增 刷新 " + it.getType() + "," + it);
            if (it.getType() == MomentType.Video.getValue()) {
                this.f28567OooO0Oo.setRefreshTrigger(Boolean.FALSE);
            }
            MainMomentFollowingFragment mainMomentFollowingFragment = this.f28568OooO0o0;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mainMomentFollowingFragment), null, null, new com.yalla.yalla.ui.fragment.moment.OooO00o(mainMomentFollowingFragment, null), 3, null);
        }
    }

    public static final class OooO0OO implements Observer<MomentSendModel> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentFollowingVM f28569OooO0Oo;

        public OooO0OO(MomentFollowingVM momentFollowingVM) {
            this.f28569OooO0Oo = momentFollowingVM;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(MomentSendModel momentSendModel) {
            MomentSendModel it = momentSendModel;
            Intrinsics.checkNotNullParameter(it, "it");
            p592o0oo00O.OooOOO0.OooO0O0("动态任务 发送成功 刷新 taskModel = " + it);
            this.f28569OooO0Oo.postSendSuccess(it);
        }
    }

    public static final class OooO0o implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentFollowingVM f28570OooO0Oo;

        public OooO0o(MomentFollowingVM momentFollowingVM) {
            this.f28570OooO0Oo = momentFollowingVM;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            this.f28570OooO0Oo.getShowFollowDialog().setValue(Boolean.valueOf(bool.booleanValue()));
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28572OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentFollowingVM f28573OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MomentFollowingVM momentFollowingVM, int i) {
            super(2);
            this.f28573OooO0o0 = momentFollowingVM;
            this.f28572OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28572OooO0o | 1);
            MainMomentFollowingFragment.this.InitObservers(this.f28573OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Boolean, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean it = bool;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (it.booleanValue()) {
                MainMomentFollowingFragment.this.getMMomentVM().startCheckNewPostJob();
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMainMomentFollowingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentFollowingFragment$initView$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,355:1\n66#2,6:356\n72#2:390\n76#2:430\n78#3,11:362\n91#3:429\n456#4,8:373\n464#4,3:387\n25#4:402\n25#4:411\n50#4:418\n49#4:419\n467#4,3:426\n4144#5,6:381\n81#6,11:391\n1097#7,3:403\n1100#7,3:407\n1097#7,6:412\n1097#7,6:420\n154#8:406\n76#9:410\n81#10:431\n107#10,2:432\n81#10:434\n81#10:435\n*S KotlinDebug\n*F\n+ 1 MainMomentFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentFollowingFragment$initView$3\n*L\n181#1:356,6\n181#1:390\n181#1:430\n181#1:362,11\n181#1:429\n181#1:373,8\n181#1:387,3\n200#1:402\n204#1:411\n225#1:418\n225#1:419\n181#1:426,3\n181#1:381,6\n182#1:391,11\n200#1:403,3\n200#1:407,3\n204#1:412,6\n225#1:420,6\n200#1:406\n202#1:410\n200#1:431\n200#1:432,2\n204#1:434\n213#1:435\n*E\n"})
    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {
        public OooOOO() {
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
                    ComposerKt.traceEventStart(631768962, iIntValue, -1, "com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment.initView.<anonymous> (MainMomentFollowingFragment.kt:179)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                MainMomentFollowingFragment mainMomentFollowingFragment = MainMomentFollowingFragment.this;
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
                ViewModel viewModel = ViewModelKt.viewModel(MomentFollowingVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 36936, 0);
                composer2.endReplaceableGroup();
                MomentFollowingVM momentFollowingVM = (MomentFollowingVM) viewModel;
                EffectsKt.LaunchedEffect(Unit.INSTANCE, new com.yalla.yalla.ui.fragment.moment.OooO0O0(momentFollowingVM, null), composer2, 70);
                mainMomentFollowingFragment.InitObservers(momentFollowingVM, composer2, 72);
                mainMomentFollowingFragment.mLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
                mainMomentFollowingFragment.mRefreshState = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composer2);
                if (!momentFollowingVM.isRefreshIng().getValue().booleanValue() && (refreshState = mainMomentFollowingFragment.mRefreshState) != null) {
                    refreshState.OooO0Oo(false);
                }
                oO0OOO00.f56606OooO00o.OooO00o(mainMomentFollowingFragment.mLazyListState, composer2, 64);
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer2.rememberedValue();
                Composer.Companion companion3 = Composer.INSTANCE;
                if (objRememberedValue == companion3.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3763boximpl(Dp.m3765constructorimpl(0)), null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion3.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new p515o0o0O0O0.o0Oo0oo(mainMomentFollowingFragment.mLazyListState), null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                MutableState mutableState2 = (MutableState) objRememberedValue2;
                ((p515o0o0O0O0.o0Oo0oo) mutableState2.getValue()).OooO0O0(momentFollowingVM.getListData().size(), MomentAdapterTag.MomentListFollowingFragment, composer2, 560, 0);
                NestedScrollConnection nestedScrollConnectionRememberNestedScrollInteropConnection = NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer2, 0, 1);
                p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                State stateObserveAsState = LiveDataAdapterKt.observeAsState(p464o0Oooo.o000000O.OooOOo0(), 0L, composer2, 56);
                EffectsKt.LaunchedEffect((Long) stateObserveAsState.getValue(), new com.yalla.yalla.ui.fragment.moment.OooO0OO(momentFollowingVM, stateObserveAsState, null), composer2, 64);
                RefreshState refreshState2 = mainMomentFollowingFragment.mRefreshState;
                Intrinsics.checkNotNull(refreshState2);
                com.yalla.yalla.ui.fragment.moment.OooO0o oooO0o = new com.yalla.yalla.ui.fragment.moment.OooO0o(momentFollowingVM);
                composer2.startReplaceableGroup(511388516);
                boolean zChanged = composer2.changed(mutableState) | composer2.changed(density);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged || objRememberedValue3 == companion3.getEmpty()) {
                    objRememberedValue3 = new com.yalla.yalla.ui.fragment.moment.OooO(density, mutableState);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, oooO0o, null, OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) objRememberedValue3), false, ComposableLambdaKt.composableLambda(composer2, -845938359, true, new Oooo000(mutableState2, mutableState, nestedScrollConnectionRememberNestedScrollInteropConnection, mainMomentFollowingFragment, momentFollowingVM)), composer2, 196616, 20);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMainMomentFollowingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentFollowingFragment$initView$2\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,355:1\n81#2,11:356\n65#3,7:367\n72#3:402\n76#3:407\n78#4,11:374\n91#4:406\n456#5,8:385\n464#5,3:399\n467#5,3:403\n4144#6,6:393\n*S KotlinDebug\n*F\n+ 1 MainMomentFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentFollowingFragment$initView$2\n*L\n174#1:356,11\n175#1:367,7\n175#1:402\n175#1:407\n175#1:374,11\n175#1:406\n175#1:385,8\n175#1:399,3\n175#1:403,3\n175#1:393,6\n*E\n"})
    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {
        public OooOOO0() {
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
                    ComposerKt.traceEventStart(1105794945, iIntValue, -1, "com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment.initView.<anonymous> (MainMomentFollowingFragment.kt:172)");
                }
                composer2.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer2, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel = ViewModelKt.viewModel(MomentFollowingVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 36936, 0);
                composer2.endReplaceableGroup();
                MomentFollowingVM momentFollowingVM = (MomentFollowingVM) viewModel;
                composer2.startReplaceableGroup(733328855);
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                MainMomentFollowingFragment mainMomentFollowingFragment = MainMomentFollowingFragment.this;
                o0O00000.OooO0OO(momentFollowingVM, mainMomentFollowingFragment.getActivity(), mainMomentFollowingFragment.getMomentGiftSendUtil(), composer2, 584);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<oO0O0O00> {
        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0O0O00 invoke() {
            MainMomentFollowingFragment mainMomentFollowingFragment = MainMomentFollowingFragment.this;
            FragmentActivity fragmentActivityRequireActivity = mainMomentFollowingFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return new oO0O0O00(fragmentActivityRequireActivity, GiftPropTypeShow.InMomentList, mainMomentFollowingFragment.getMMomentVM(), null, 24);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment$scrollToTop$1", f = "MainMomentFollowingFragment.kt", i = {}, l = {318}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f28578OooO0Oo;

        public OooOo(Continuation<? super OooOo> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MainMomentFollowingFragment.this.new OooOo(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f28578OooO0Oo;
            MainMomentFollowingFragment mainMomentFollowingFragment = MainMomentFollowingFragment.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LazyListState lazyListState = mainMomentFollowingFragment.mLazyListState;
                if (lazyListState != null) {
                    this.f28578OooO0Oo = 1;
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
            RefreshState refreshState = mainMomentFollowingFragment.mRefreshState;
            if (refreshState != null) {
                refreshState.OooO0Oo(true);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28580OooO0Oo;

        public OooOo00(OooOO0O function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28580OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28580OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28580OooO0Oo;
        }

        public final int hashCode() {
            return this.f28580OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28580OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment$special$$inlined$viewModels$default$1] */
    public MainMomentFollowingFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.mMomentVM = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(BaseMomentDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28593OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28593OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment$special$$inlined$viewModels$default$5
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
        this.momentGiftSendUtil = LazyKt.lazy(new OooOOOO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public final void InitObservers(MomentFollowingVM momentFollowingVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1386178826);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1386178826, i, -1, "com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment.InitObservers (MainMomentFollowingFragment.kt:323)");
        }
        Observable<Object> observable = LiveEventBus.get("POST_READ_NEW");
        Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.POST_READ_NEW)");
        p417o0OoO0.o00000O.OooO00o(observable, new OooO00o(momentFollowingVM), composerStartRestartGroup, 8);
        Observable<Object> observable2 = LiveEventBus.get("Post_send_add");
        Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.Post_send_add)");
        p417o0OoO0.o00000O.OooO00o(observable2, new OooO0O0(momentFollowingVM, this), composerStartRestartGroup, 8);
        Observable<Object> observable3 = LiveEventBus.get("Post_send_success");
        Intrinsics.checkNotNullExpressionValue(observable3, "get(EventKey.Post_send_success)");
        p417o0OoO0.o00000O.OooO00o(observable3, new OooO0OO(momentFollowingVM), composerStartRestartGroup, 8);
        Observable<Object> observable4 = LiveEventBus.get("SHOW_BOTTOM_SHEET_POSITION");
        Intrinsics.checkNotNullExpressionValue(observable4, "get(EventKey.SHOW_BOTTOM_SHEET_POSITION)");
        p417o0OoO0.o00000O.OooO00o(observable4, new OooO0o(momentFollowingVM), composerStartRestartGroup, 8);
        p509o0o0O0.o0ooOOo.OooO00o(momentFollowingVM, new OooO(), composerStartRestartGroup, 8, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(momentFollowingVM, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseMomentDetailVM getMMomentVM() {
        return (BaseMomentDetailVM) this.mMomentVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oO0O0O00 getMomentGiftSendUtil() {
        return (oO0O0O00) this.momentGiftSendUtil.getValue();
    }

    private final void initObserver() {
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        p464o0Oooo.o000000O.OooOo0O().observe(this, new OooOo00(new OooOO0O()));
    }

    private final void initView() {
        ComposeView composeView = getBinding().f58458OooO0o0;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.composeViewTopBg");
        p147o00Oo0Oo.o000OOo.OooO0Oo(composeView, o00OO00O.f53450OooO00o);
        getBinding().f58454OooO0O0.OooO00o(new AppBarLayout.OooO0O0() { // from class: o0o0OO0O.o00OO0O0
            @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
            public final void OooO00o(AppBarLayout appBarLayout, int i) {
                MainMomentFollowingFragment.initView$lambda$0(this.f53452OooO00o, appBarLayout, i);
            }
        });
        ComposeView composeView2 = getBinding().f58456OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(composeView2, "binding.composeViewToolBar");
        p147o00Oo0Oo.o000OOo.OooO0Oo(composeView2, ComposableLambdaKt.composableLambdaInstance(1105794945, true, new OooOOO0()));
        ComposeView composeView3 = getBinding().f58455OooO0OO;
        Intrinsics.checkNotNullExpressionValue(composeView3, "binding.composeViewContent");
        p147o00Oo0Oo.o000OOo.OooO0Oo(composeView3, ComposableLambdaKt.composableLambdaInstance(631768962, true, new OooOOO()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(MainMomentFollowingFragment this$0, AppBarLayout appBarLayout, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().f58458OooO0o0.setTranslationY(i);
    }

    @Override // p508o0o0O.OooOO0O, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getMMomentVM().statisticalTime();
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initObserver();
        getMMomentVM().statisticalTime();
    }

    @Override // p508o0o0O.OooOO0O, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        o0OO000.OooO0O0("403001", MapsKt.mapOf(new Pair("staytime", getTimeLengthStr())));
    }

    @Override // p508o0o0O.OooOO0O, p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.android.billingclient.api.o0000OO0.OooO0O0().OooOO0(0);
        o0OO000.OooO00o("203016");
    }

    public final void scrollToTop() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooOo(null), 3, null);
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public n6 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        n6 n6VarInflate = n6.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(n6VarInflate, "inflate(inflater)");
        CollapsingToolbarLayout collapsingToolbarLayout = n6VarInflate.f58457OooO0o;
        WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooOOO.OooOo0(collapsingToolbarLayout, null);
        return n6VarInflate;
    }
}
