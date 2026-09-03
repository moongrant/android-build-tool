package com.yalla.yalla.ui.fragment.mainroom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.o000Oo0;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.session.o000O0o;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.ui.adapter.room.RoomBaseAdapter;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.main.MainRoomRecommendVM;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O00O.o0000O0O;
import o000O00O.o000OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOo0.o00O0000;
import p193o00o0O0O.o0000oo;
import p384o0OOoo0O.o00O0O;
import p405o0Oo0OOO.oO00O0o;
import p429o0OoOO.OooOo00;
import p450o0OoOooO.o0O0O0o0;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p507o0o00oo.o0Oo0oo;
import p545o0oO0O00.OooOOO;
import p562o0oOo000.o000000;
import p587o0oOooOO.p0;
import p587o0oOooOO.r0;
import p590o0oOooo0.oo000000;
import p590o0oOooo0.z0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0014J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\u0014\u0010\u0019\u001a\u00020\u00032\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomRecommendFragment;", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomBaseFragment;", "Lo0Oo0OOO/oO00O0o;", "", "initView", "moreLoad", "freshLoad", "", "isRefresh", "loadNewRoomData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onLazyInit", "onPause", "scrollToTop", "Lo0oO0O00/OooOOO;", "msg", "onEventMainThread", "Lo0o00oo/o0Oo0oo;", "mAdapter", "Lo0o00oo/o0Oo0oo;", "Lo0oOooOO/p0;", "mRecommendBannerManager$delegate", "Lkotlin/Lazy;", "getMRecommendBannerManager", "()Lo0oOooOO/p0;", "mRecommendBannerManager", "Lcom/yalla/yalla/ui/vm/main/MainRoomRecommendVM;", "mViewModel$delegate", "getMViewModel", "()Lcom/yalla/yalla/ui/vm/main/MainRoomRecommendVM;", "mViewModel", "isFirstApiStatistical", "Z", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMainRoomRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomRecommendFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomRecommendFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,225:1\n106#2,15:226\n*S KotlinDebug\n*F\n+ 1 MainRoomRecommendFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomRecommendFragment\n*L\n48#1:226,15\n*E\n"})
public final class MainRoomRecommendFragment extends MainRoomBaseFragment<oO00O0o> {
    public static final int $stable = 8;
    private boolean isFirstApiStatistical;

    @Nullable
    private o0Oo0oo mAdapter;

    /* JADX INFO: renamed from: mRecommendBannerManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRecommendBannerManager = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: mViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    public static final class OooO extends Lambda implements Function1<List<RoomIndexModel>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f27972OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainRoomRecommendFragment f27973OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MainRoomRecommendFragment mainRoomRecommendFragment, boolean z) {
            super(1);
            this.f27972OooO0Oo = z;
            this.f27973OooO0o0 = mainRoomRecommendFragment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<RoomIndexModel> list) {
            List<RoomIndexModel> list2 = list;
            boolean z = this.f27972OooO0Oo;
            MainRoomRecommendFragment mainRoomRecommendFragment = this.f27973OooO0o0;
            if (z) {
                o0Oo0oo o0oo0oo2 = mainRoomRecommendFragment.mAdapter;
                if (o0oo0oo2 != null) {
                    o0oo0oo2.OooOoO0(list2);
                }
                o0Oo0oo o0oo0oo3 = mainRoomRecommendFragment.mAdapter;
                if (o0oo0oo3 != null) {
                    o0oo0oo3.OoooO00();
                }
            } else {
                o0Oo0oo o0oo0oo4 = mainRoomRecommendFragment.mAdapter;
                if (o0oo0oo4 != null) {
                    o0oo0oo4.Oooo0oO(list2);
                }
                o0Oo0oo o0oo0oo5 = mainRoomRecommendFragment.mAdapter;
                if (o0oo0oo5 != null) {
                    o0oo0oo5.OooO0O0(list2 != null ? list2 : CollectionsKt.emptyList());
                }
            }
            ((oO00O0o) mainRoomRecommendFragment.getBinding()).f44790OooO0Oo.postDelayed(new OooOO0O.OooO0OO(4, mainRoomRecommendFragment, list2), 300L);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends o0OOOO0o {
        public OooO00o() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MainRoomRecommendFragment mainRoomRecommendFragment = MainRoomRecommendFragment.this;
            o0Oo0oo o0oo0oo2 = mainRoomRecommendFragment.mAdapter;
            Intrinsics.checkNotNull(o0oo0oo2);
            o0oo0oo2.Oooo00O(true);
            mainRoomRecommendFragment.freshLoad();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {
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
                    ComposerKt.traceEventStart(1524696254, iIntValue, -1, "com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment.initView.<anonymous> (MainRoomRecommendFragment.kt:121)");
                }
                r0.OooO0O0(MainRoomRecommendFragment.this.getMViewModel(), composer2, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<View, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View view2 = view;
            o0Oo0oo o0oo0oo2 = MainRoomRecommendFragment.this.mAdapter;
            if (o0oo0oo2 != null) {
                if (view2 == null) {
                    o0oo0oo2.f50618Oooo0 = null;
                    int i = o0oo0oo2.f50619Oooo00o;
                    if (i >= 0) {
                        o0oo0oo2.notifyItemChanged(i);
                    }
                    o0oo0oo2.f50619Oooo00o = -1;
                } else {
                    o0oo0oo2.f50618Oooo0 = view2;
                    o0oo0oo2.OoooO00();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiResult<List<RoomIndexModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f27978OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f27978OooO0o0 = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<RoomIndexModel>> apiResult) {
            ApiResult<List<RoomIndexModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MainRoomRecommendFragment mainRoomRecommendFragment = MainRoomRecommendFragment.this;
            boolean z = true;
            mainRoomRecommendFragment.getMViewModel().setPageIndex(it.getPage().getPageIndex() + 1);
            boolean zIsSuccess = it.isSuccess();
            boolean z2 = this.f27978OooO0o0;
            if (zIsSuccess) {
                ((oO00O0o) mainRoomRecommendFragment.getBinding()).f44791OooO0o.OooOooO(z2, true);
                o0Oo0oo o0oo0oo2 = mainRoomRecommendFragment.mAdapter;
                if (o0oo0oo2 != null) {
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    Boolean bool = Boolean.TRUE;
                    List<RoomIndexModel> data = it.getData();
                    if (data != null && !data.isEmpty()) {
                        z = false;
                    }
                    o0oo0oo2.Oooo0(boolValueOf, bool, Boolean.valueOf(z));
                }
            } else {
                ((oO00O0o) mainRoomRecommendFragment.getBinding()).f44791OooO0o.OooOooO(z2, false);
                o0Oo0oo o0oo0oo3 = mainRoomRecommendFragment.mAdapter;
                if (o0oo0oo3 != null) {
                    o0oo0oo3.Oooo0(Boolean.valueOf(z2), Boolean.FALSE, Boolean.TRUE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<p0> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p0 invoke() {
            FragmentActivity fragmentActivityRequireActivity = MainRoomRecommendFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            return new p0(fragmentActivityRequireActivity);
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Integer, Unit> {
        public OooOO0O() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer num2 = num;
            ImageView imageView = ((oO00O0o) MainRoomRecommendFragment.this.getBinding()).f44789OooO0OO;
            z0 z0Var = z0.f57313OooO00o;
            Intrinsics.checkNotNull(num2);
            imageView.setImageResource(z0.OooO0OO(num2.intValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27981OooO0Oo;

        public OooOOO0(OooOO0O function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27981OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27981OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27981OooO0Oo;
        }

        public final int hashCode() {
            return this.f27981OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27981OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment$special$$inlined$viewModels$default$1] */
    public MainRoomRecommendFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.mViewModel = o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(MainRoomRecommendVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o000Oo0.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f27985OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27985OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void freshLoad() {
        getMViewModel().setPageIndex(1);
        loadNewRoomData(true);
        getMViewModel().loadRankingTopData();
    }

    private final p0 getMRecommendBannerManager() {
        return (p0) this.mRecommendBannerManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainRoomRecommendVM getMViewModel() {
        return (MainRoomRecommendVM) this.mViewModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((oO00O0o) getBinding()).f44791OooO0o.setOnRefreshListener(new o0000O0O(this));
        int i = 4;
        ((oO00O0o) getBinding()).f44791OooO0o.setOnLoadMoreListener(new o00O0000(this, i));
        ((oO00O0o) getBinding()).f44791OooO0o.f20868Oooo0oO = true;
        ((oO00O0o) getBinding()).f44791OooO0o.f20870OoooO = true;
        ((oO00O0o) getBinding()).f44791OooO0o.f20874OoooOO0 = true;
        o0Oo0oo o0oo0oo2 = new o0Oo0oo(getContext());
        this.mAdapter = o0oo0oo2;
        RoomBaseAdapter.PageSource pageSource = RoomBaseAdapter.PageSource.RoomAllNewFragment;
        o0oo0oo2.f27241OooOooO = new o000OO(this, i);
        o0oo0oo2.f27239OooOoo = pageSource;
        o0oo0oo2.Oooo000(o000000.blank_ta_no_rooms);
        o0Oo0oo o0oo0oo3 = this.mAdapter;
        if (o0oo0oo3 != null) {
            o0oo0oo3.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_room);
        }
        o0Oo0oo o0oo0oo4 = this.mAdapter;
        if (o0oo0oo4 != null) {
            o0oo0oo4.OooOo0o();
        }
        o0Oo0oo o0oo0oo5 = this.mAdapter;
        if (o0oo0oo5 != null) {
            o0oo0oo5.OooOoO(new o000O0o(this), ((oO00O0o) getBinding()).f44790OooO0Oo);
        }
        o0Oo0oo o0oo0oo6 = this.mAdapter;
        if (o0oo0oo6 != null) {
            o0oo0oo6.Oooo0OO(new OooO00o());
        }
        ComposeView topComposeView = ((oO00O0o) getBinding()).f44792OooO0o0;
        Intrinsics.checkNotNullExpressionValue(topComposeView, "topComposeView");
        o0000oo.OooO0Oo(topComposeView, ComposableLambdaKt.composableLambdaInstance(1524696254, true, new OooO0O0()));
        ((oO00O0o) getBinding()).f44790OooO0Oo.setLayoutManager(new FixLinearLayoutManager(getContext()));
        ((oO00O0o) getBinding()).f44790OooO0Oo.setAdapter(this.mAdapter);
        getMRecommendBannerManager().f56923OooO0oo = new OooO0OO();
        oo000000 oo000000Var = oo000000.f57240OooO00o;
        RecyclerView rvMainNew = ((oO00O0o) getBinding()).f44790OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(rvMainNew, "rvMainNew");
        oo000000.OooO0O0(rvMainNew);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(MainRoomRecommendFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMRecommendBannerManager().OooO00o();
        this$0.freshLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(MainRoomRecommendFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.moreLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$4(MainRoomRecommendFragment this$0, RoomIndexModel data) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "data");
        o0o00O00.OooO0OO.OooO00o oooO00oOooO0O0 = p489o0o00O00.OooO0OO.OooO0O0(((oO00O0o) this$0.getBinding()).f44790OooO0Oo);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = oooO00oOooO0O0.f48921OooO00o;
        int i2 = oooO00oOooO0O0.f48922OooO0O0;
        if (i <= i2) {
            while (true) {
                o0Oo0oo o0oo0oo2 = this$0.mAdapter;
                Intrinsics.checkNotNull(o0oo0oo2);
                if (o0oo0oo2.f13189OooOOoo.size() > i) {
                    o0Oo0oo o0oo0oo3 = this$0.mAdapter;
                    Intrinsics.checkNotNull(o0oo0oo3);
                    Object obj = o0oo0oo3.f13189OooOOoo.get(i);
                    Intrinsics.checkNotNull(obj);
                    arrayList.add(((RoomIndexModel) obj).barid);
                    o0Oo0oo o0oo0oo4 = this$0.mAdapter;
                    Intrinsics.checkNotNull(o0oo0oo4);
                    Object obj2 = o0oo0oo4.f13189OooOOoo.get(i);
                    Intrinsics.checkNotNull(obj2);
                    arrayList2.add(((RoomIndexModel) obj2).sessionId);
                }
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        String barid = data.barid;
        Intrinsics.checkNotNullExpressionValue(barid, "barid");
        if (barid.length() > 0) {
            WebEventRepository webEventRepository = WebEventRepository.f24430OooO00o;
            String barid2 = data.barid;
            Intrinsics.checkNotNullExpressionValue(barid2, "barid");
            EnterRoomParentPage enterRoomParentPage = EnterRoomParentPage.AII_New;
            webEventRepository.getClass();
            WebEventRepository.OooO0OO(this$0, arrayList, arrayList2, barid2, enterRoomParentPage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$5(MainRoomRecommendFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.moreLoad();
    }

    private final void loadNewRoomData(boolean isRefresh) {
        o00O0O.OooO0Oo(getMViewModel().loadNewRoomData(), this, false, new OooO0o(isRefresh), null, new OooO(this, isRefresh), 10);
    }

    private final void moreLoad() {
        loadNewRoomData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLazyInit$lambda$1(MainRoomRecommendFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(bool);
        if (bool.booleanValue()) {
            this$0.freshLoad();
        }
    }

    @Override // p527o0o0OO0o.o000O, p545o0oO0O00.OooOOOO
    public void onEventMainThread(@NotNull OooOOO<?> msg) {
        o0Oo0oo o0oo0oo2;
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.onEventMainThread(msg);
        if (getIsLazyInit()) {
            int i = msg.f55758OooO00o;
            if (i == 15 || i == 31 || i == 36 || i == 109) {
                freshLoad();
            } else if (i == 575 && (o0oo0oo2 = this.mAdapter) != null) {
                o0oo0oo2.Oooo();
            }
        }
    }

    @Override // p586o0oOooO0.oO0Oo0o0
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.FALSE)) {
            freshLoad();
        }
        o0O00oO0.OooOo0O().observe(this, new o0O0O0o0(this, 3));
    }

    @Override // p527o0o0OO0o.o000O, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        o0oo0000.OooO00o.OooO0OO("401002", MapsKt.mapOf(new Pair("staytime", getTimeLengthStr())));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        OooOo00.f46776OooO00o.observe(getViewLifecycleOwner(), new OooOOO0(new OooOO0O()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.fragment.mainroom.MainRoomBaseFragment
    public void scrollToTop() {
        super.scrollToTop();
        ((oO00O0o) getBinding()).f44790OooO0Oo.scrollToPosition(0);
        if (((oO00O0o) getBinding()).f44791OooO0o.getState() == RefreshState.None) {
            ((oO00O0o) getBinding()).f44791OooO0o.OooO();
            ((oO00O0o) getBinding()).f44791OooO0o.OooO0oo();
        }
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public oO00O0o getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        oO00O0o oo00o0oInflate = oO00O0o.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(oo00o0oInflate, "inflate(...)");
        CollapsingToolbarLayout collapsingToolbarLayout = oo00o0oInflate.f44788OooO0O0;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO.OooOo0(collapsingToolbarLayout, null);
        return oo00o0oInflate;
    }
}
