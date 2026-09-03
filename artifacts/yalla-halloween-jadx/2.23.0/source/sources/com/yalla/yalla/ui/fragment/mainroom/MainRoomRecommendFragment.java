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
import androidx.core.view.o000O0Oo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.o000O0o;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.firebase.messaging.o00O0O;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.ui.adapter.room.RoomBaseAdapter;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p331o0OO0o0.o0O0O00;
import p331o0OO0o0.oo0o0Oo;
import p377o0OOoOo.o000O000;
import p418o0OoO000.OooOo;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p481o0o000o0.OooOo00;
import p539o0o0OoOO.r1;
import p539o0o0OoOO.t1;
import p579o0oOoo.oO0OOO00;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.i4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0014J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\u0014\u0010\u0019\u001a\u00020\u00032\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomRecommendFragment;", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomBaseFragment;", "Lo0ooOOOO/i4;", "", "initView", "moreLoad", "freshLoad", "", "isRefresh", "loadNewRoomData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onLazyInit", "onPause", "scrollToTop", "Lo0OoO000/OooOo;", "msg", "onEventMainThread", "Lcom/yalla/yalla/ui/adapter/room/OooO0OO;", "mAdapter", "Lcom/yalla/yalla/ui/adapter/room/OooO0OO;", "Lo0o0OoOO/r1;", "mRecommendBannerManager$delegate", "Lkotlin/Lazy;", "getMRecommendBannerManager", "()Lo0o0OoOO/r1;", "mRecommendBannerManager", "Lcom/yalla/yalla/ui/vm/main/MainRoomRecommendVM;", "mViewModel$delegate", "getMViewModel", "()Lcom/yalla/yalla/ui/vm/main/MainRoomRecommendVM;", "mViewModel", "isFirstApiStatistical", "Z", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainRoomRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomRecommendFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomRecommendFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,225:1\n106#2,15:226\n*S KotlinDebug\n*F\n+ 1 MainRoomRecommendFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomRecommendFragment\n*L\n48#1:226,15\n*E\n"})
public final class MainRoomRecommendFragment extends MainRoomBaseFragment<i4> {
    public static final int $stable = 8;
    private boolean isFirstApiStatistical;

    @Nullable
    private com.yalla.yalla.ui.adapter.room.OooO0OO mAdapter;

    /* JADX INFO: renamed from: mRecommendBannerManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRecommendBannerManager = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: mViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    public static final class OooO extends Lambda implements Function1<List<RoomIndexModel>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f28477OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainRoomRecommendFragment f28478OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MainRoomRecommendFragment mainRoomRecommendFragment, boolean z) {
            super(1);
            this.f28477OooO0Oo = z;
            this.f28478OooO0o0 = mainRoomRecommendFragment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<RoomIndexModel> list) {
            final List<RoomIndexModel> list2 = list;
            boolean z = this.f28477OooO0Oo;
            final MainRoomRecommendFragment mainRoomRecommendFragment = this.f28478OooO0o0;
            if (z) {
                com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO = mainRoomRecommendFragment.mAdapter;
                if (oooO0OO != null) {
                    oooO0OO.OooOoO0(list2);
                }
                com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO2 = mainRoomRecommendFragment.mAdapter;
                if (oooO0OO2 != null) {
                    oooO0OO2.OoooO00();
                }
            } else {
                com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO3 = mainRoomRecommendFragment.mAdapter;
                if (oooO0OO3 != null) {
                    oooO0OO3.Oooo0oO(list2);
                }
                com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO4 = mainRoomRecommendFragment.mAdapter;
                if (oooO0OO4 != null) {
                    oooO0OO4.OooO0O0(list2 != null ? list2 : CollectionsKt.emptyList());
                }
            }
            ((i4) mainRoomRecommendFragment.getBinding()).f58109OooO0Oo.postDelayed(new Runnable() { // from class: o0o0OoO0.o00OOO0O
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    MainRoomRecommendFragment this$0 = mainRoomRecommendFragment;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    try {
                        if (this$0.isFirstApiStatistical) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        OooOo00.OooO00o oooO00oOooO0O0 = OooOo00.OooO0O0(((i4) this$0.getBinding()).f58109OooO0Oo);
                        int i = oooO00oOooO0O0.f47696OooO0OO;
                        for (int i2 = oooO00oOooO0O0.f47694OooO00o; i2 < i; i2++) {
                            List list3 = list2;
                            if ((list3 != null ? list3.size() : 0) > i2) {
                                Intrinsics.checkNotNull(list3);
                                arrayList.add(((RoomIndexModel) list3.get(i2)).barid);
                                arrayList2.add(((RoomIndexModel) list3.get(i2)).sessionId);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        this$0.isFirstApiStatistical = true;
                        WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
                        EnterRoomParentPage enterRoomParentPage = EnterRoomParentPage.AII_New;
                        webEventRepository.getClass();
                        WebEventRepository.OooO0oO(this$0, arrayList, arrayList2, enterRoomParentPage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, 300L);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends oo00o {
        public OooO00o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MainRoomRecommendFragment mainRoomRecommendFragment = MainRoomRecommendFragment.this;
            com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO = mainRoomRecommendFragment.mAdapter;
            Intrinsics.checkNotNull(oooO0OO);
            oooO0OO.Oooo00O(true);
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
                    ComposerKt.traceEventStart(1524696254, iIntValue, -1, "com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment.initView.<anonymous> (MainRoomRecommendFragment.kt:120)");
                }
                t1.OooO0O0(MainRoomRecommendFragment.this.getMViewModel(), composer2, 8);
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
            com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO = MainRoomRecommendFragment.this.mAdapter;
            if (oooO0OO != null) {
                if (view2 == null) {
                    oooO0OO.f27699Oooo0 = null;
                    int i = oooO0OO.f27700Oooo00o;
                    if (i >= 0) {
                        oooO0OO.notifyItemChanged(i);
                    }
                    oooO0OO.f27700Oooo00o = -1;
                } else {
                    oooO0OO.f27699Oooo0 = view2;
                    oooO0OO.OoooO00();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiResult<List<RoomIndexModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28483OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f28483OooO0o0 = z;
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
            boolean z2 = this.f28483OooO0o0;
            if (zIsSuccess) {
                ((i4) mainRoomRecommendFragment.getBinding()).f58110OooO0o.OooOooO(z2, true);
                com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO = mainRoomRecommendFragment.mAdapter;
                if (oooO0OO != null) {
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    Boolean bool = Boolean.TRUE;
                    List<RoomIndexModel> data = it.getData();
                    if (data != null && !data.isEmpty()) {
                        z = false;
                    }
                    oooO0OO.Oooo0(boolValueOf, bool, Boolean.valueOf(z));
                }
            } else {
                ((i4) mainRoomRecommendFragment.getBinding()).f58110OooO0o.OooOooO(z2, false);
                com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO2 = mainRoomRecommendFragment.mAdapter;
                if (oooO0OO2 != null) {
                    oooO0OO2.Oooo0(Boolean.valueOf(z2), Boolean.FALSE, Boolean.TRUE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<r1> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r1 invoke() {
            FragmentActivity fragmentActivityRequireActivity = MainRoomRecommendFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return new r1(fragmentActivityRequireActivity);
        }
    }

    public static final class OooOO0O implements Observer<Boolean> {
        public OooOO0O() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            Boolean it = bool;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (it.booleanValue()) {
                MainRoomRecommendFragment.this.freshLoad();
            }
        }
    }

    public static final class OooOOO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28486OooO0Oo;

        public OooOOO(OooOOO0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28486OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28486OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28486OooO0Oo;
        }

        public final int hashCode() {
            return this.f28486OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28486OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<Integer, Unit> {
        public OooOOO0() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer it = num;
            ImageView imageView = ((i4) MainRoomRecommendFragment.this.getBinding()).f58108OooO0OO;
            oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            imageView.setImageResource(oOOOOo0O.OooO0OO(it.intValue()));
            return Unit.INSTANCE;
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
        this.mViewModel = o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(MainRoomRecommendVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28491OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28491OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000O0o.OooO00o(lazy);
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
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000O0o.OooO00o(lazy);
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

    private final r1 getMRecommendBannerManager() {
        return (r1) this.mRecommendBannerManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainRoomRecommendVM getMViewModel() {
        return (MainRoomRecommendVM) this.mViewModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((i4) getBinding()).f58110OooO0o.setOnRefreshListener(new com.facebook.OooOO0(this));
        ((i4) getBinding()).f58110OooO0o.setOnLoadMoreListener(new oo0o0Oo(this, 2));
        ((i4) getBinding()).f58110OooO0o.f21341Oooo0oO = true;
        ((i4) getBinding()).f58110OooO0o.f21343OoooO = true;
        ((i4) getBinding()).f58110OooO0o.f21347OoooOO0 = true;
        com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO = new com.yalla.yalla.ui.adapter.room.OooO0OO(getContext());
        this.mAdapter = oooO0OO;
        RoomBaseAdapter.PageSource pageSource = RoomBaseAdapter.PageSource.RoomAllNewFragment;
        oooO0OO.f27703OooOooO = new o00O0O(this);
        oooO0OO.f27701OooOoo = pageSource;
        oooO0OO.Oooo000(oO00OOo0.blank_ta_no_rooms);
        com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO2 = this.mAdapter;
        if (oooO0OO2 != null) {
            oooO0OO2.OooOooo(oOo00OO0.ic_empty_room);
        }
        com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO3 = this.mAdapter;
        if (oooO0OO3 != null) {
            oooO0OO3.OooOo0o();
        }
        com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO4 = this.mAdapter;
        if (oooO0OO4 != null) {
            oooO0OO4.OooOoO(new o0O0O00(this), ((i4) getBinding()).f58109OooO0Oo);
        }
        com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO5 = this.mAdapter;
        if (oooO0OO5 != null) {
            oooO0OO5.Oooo0OO(new OooO00o());
        }
        ComposeView composeView = ((i4) getBinding()).f58111OooO0o0;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.topComposeView");
        o000OOo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(1524696254, true, new OooO0O0()));
        ((i4) getBinding()).f58109OooO0Oo.setLayoutManager(new FixLinearLayoutManager(getContext()));
        ((i4) getBinding()).f58109OooO0Oo.setAdapter(this.mAdapter);
        getMRecommendBannerManager().f55662OooO0oo = new OooO0OO();
        oO0OOO00 oo0ooo00 = oO0OOO00.f56606OooO00o;
        RecyclerView recyclerView = ((i4) getBinding()).f58109OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvMainNew");
        oO0OOO00.OooO0O0(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(MainRoomRecommendFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMRecommendBannerManager().OooO00o();
        this$0.freshLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(MainRoomRecommendFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.moreLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$3(MainRoomRecommendFragment this$0, RoomIndexModel data) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "data");
        OooOo00.OooO00o oooO00oOooO0O0 = OooOo00.OooO0O0(((i4) this$0.getBinding()).f58109OooO0Oo);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = oooO00oOooO0O0.f47694OooO00o;
        int i2 = oooO00oOooO0O0.f47695OooO0O0;
        if (i <= i2) {
            while (true) {
                com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO = this$0.mAdapter;
                Intrinsics.checkNotNull(oooO0OO);
                if (oooO0OO.f10111OooOOoo.size() > i) {
                    com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO2 = this$0.mAdapter;
                    Intrinsics.checkNotNull(oooO0OO2);
                    Object obj = oooO0OO2.f10111OooOOoo.get(i);
                    Intrinsics.checkNotNull(obj);
                    arrayList.add(((RoomIndexModel) obj).barid);
                    com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO3 = this$0.mAdapter;
                    Intrinsics.checkNotNull(oooO0OO3);
                    Object obj2 = oooO0OO3.f10111OooOOoo.get(i);
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
        String str = data.barid;
        Intrinsics.checkNotNullExpressionValue(str, "data.barid");
        if (str.length() > 0) {
            WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
            String str2 = data.barid;
            Intrinsics.checkNotNullExpressionValue(str2, "data.barid");
            EnterRoomParentPage enterRoomParentPage = EnterRoomParentPage.AII_New;
            webEventRepository.getClass();
            WebEventRepository.OooO0OO(this$0, arrayList, arrayList2, str2, enterRoomParentPage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(MainRoomRecommendFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.moreLoad();
    }

    private final void loadNewRoomData(boolean isRefresh) {
        o000O000.OooO0Oo(getMViewModel().loadNewRoomData(), this, false, new OooO0o(isRefresh), null, new OooO(this, isRefresh), 10);
    }

    private final void moreLoad() {
        loadNewRoomData(false);
    }

    @Override // p508o0o0O.OooOO0O, p418o0OoO000.Oooo000
    public void onEventMainThread(@NotNull OooOo<?> msg) {
        com.yalla.yalla.ui.adapter.room.OooO0OO oooO0OO;
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.onEventMainThread(msg);
        if (getIsLazyInit()) {
            int i = msg.f45532OooO00o;
            if (i == 15 || i == 31 || i == 36 || i == 109) {
                freshLoad();
            } else if (i == 575 && (oooO0OO = this.mAdapter) != null) {
                oooO0OO.Oooo();
            }
        }
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.FALSE)) {
            freshLoad();
        }
        o000000O.OooOo0O().observe(this, new OooOO0O());
    }

    @Override // p508o0o0O.OooOO0O, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        o0OO000.OooO0O0("401002", MapsKt.mapOf(new Pair("staytime", getTimeLengthStr())));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        p427o0OoOO00.OooOo.f45669OooO00o.observe(getViewLifecycleOwner(), new OooOOO(new OooOOO0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.fragment.mainroom.MainRoomBaseFragment
    public void scrollToTop() {
        super.scrollToTop();
        ((i4) getBinding()).f58109OooO0Oo.scrollToPosition(0);
        if (((i4) getBinding()).f58110OooO0o.getState() == RefreshState.None) {
            ((i4) getBinding()).f58110OooO0o.OooO();
            ((i4) getBinding()).f58110OooO0o.OooO0oo();
        }
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public i4 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        i4 i4VarInflate = i4.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(i4VarInflate, "inflate(inflater, container, false)");
        CollapsingToolbarLayout collapsingToolbarLayout = i4VarInflate.f58107OooO0O0;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooOOO.OooOo0(collapsingToolbarLayout, null);
        return i4VarInflate;
    }
}
