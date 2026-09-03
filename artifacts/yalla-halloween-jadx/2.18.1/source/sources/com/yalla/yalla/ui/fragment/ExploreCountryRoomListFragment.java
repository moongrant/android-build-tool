package com.yalla.yalla.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.adapter.room.RoomBaseAdapter;
import com.app.base.model.RoomIndexModel;
import com.app.base.model.RoomModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.main.MoreRoomVM;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p391o0OOooOo.o0O00000;
import p538o0o0Oo0.o0o0Oo;
import p649o0ooOOoo.za;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0014R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010¨\u0006 "}, d2 = {"Lcom/yalla/yalla/ui/fragment/ExploreCountryRoomListFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/za;", "", "initView", "", "isRefresh", "loadCountryData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "", "countryId", "I", "Lcom/yalla/yalla/ui/vm/main/MoreRoomVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/main/MoreRoomVM;", "vm", "Lcom/app/base/adapter/room/RoomBaseAdapter;", "Lcom/app/base/model/RoomIndexModel;", "roomCountryAdapter", "Lcom/app/base/adapter/room/RoomBaseAdapter;", "pageIndex", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ExploreCountryRoomListFragment extends p503o0o00o00.OooO<za> {
    public static final int $stable = 8;

    @NotNull
    private static final String COUNTRY_ID = "COUNTRY_ID";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private int countryId;
    private int pageIndex;
    private RoomBaseAdapter<RoomIndexModel> roomCountryAdapter;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f23841Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z) {
            super(1);
            this.f23841Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomBaseAdapter roomBaseAdapter = ExploreCountryRoomListFragment.this.roomCountryAdapter;
            if (roomBaseAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
                roomBaseAdapter = null;
            }
            roomBaseAdapter.loadError();
            ExploreCountryRoomListFragment.this.getBinding().f51069OooO0OO.Oooo0OO(this.f23841Oooo0oO, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.ExploreCountryRoomListFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends p654o0ooo.o00Oo0 {
        public OooO0O0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            RoomBaseAdapter roomBaseAdapter = ExploreCountryRoomListFragment.this.roomCountryAdapter;
            if (roomBaseAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
                roomBaseAdapter = null;
            }
            roomBaseAdapter.setFirstLoading(true);
            ExploreCountryRoomListFragment.this.loadCountryData(true);
        }
    }

    public static final class OooO0OO extends p654o0ooo.o00Oo0 {
        public OooO0OO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@Nullable View view) {
            ExploreCountryRoomListFragment.this.loadCountryData(true);
        }
    }

    public static final class OooO0o extends Lambda implements Function1<List<RoomIndexModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f23845Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f23845Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<RoomIndexModel> list) {
            List<RoomIndexModel> list2 = list;
            ExploreCountryRoomListFragment.this.pageIndex++;
            if (list2 != null) {
                boolean z = this.f23845Oooo0oO;
                ExploreCountryRoomListFragment exploreCountryRoomListFragment = ExploreCountryRoomListFragment.this;
                if (z) {
                    RoomBaseAdapter roomBaseAdapter = exploreCountryRoomListFragment.roomCountryAdapter;
                    if (roomBaseAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
                        roomBaseAdapter = null;
                    }
                    roomBaseAdapter.setNewData(list2);
                } else {
                    RoomBaseAdapter roomBaseAdapter2 = exploreCountryRoomListFragment.roomCountryAdapter;
                    if (roomBaseAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
                        roomBaseAdapter2 = null;
                    }
                    roomBaseAdapter2.OooO0OO(list2);
                    RoomBaseAdapter roomBaseAdapter3 = exploreCountryRoomListFragment.roomCountryAdapter;
                    if (roomBaseAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
                        roomBaseAdapter3 = null;
                    }
                    roomBaseAdapter3.addData((Collection) CollectionsKt.toList(list2));
                }
            }
            RoomBaseAdapter roomBaseAdapter4 = ExploreCountryRoomListFragment.this.roomCountryAdapter;
            if (roomBaseAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
                roomBaseAdapter4 = null;
            }
            roomBaseAdapter4.setLoadComplete(Boolean.valueOf(this.f23845Oooo0oO), Boolean.TRUE, list2 != null ? Boolean.valueOf(list2.isEmpty()) : null);
            ExploreCountryRoomListFragment.this.getBinding().f51069OooO0OO.Oooo0OO(this.f23845Oooo0oO, true);
            return Unit.INSTANCE;
        }
    }

    public ExploreCountryRoomListFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.ExploreCountryRoomListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.ExploreCountryRoomListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(MoreRoomVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.ExploreCountryRoomListFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.ExploreCountryRoomListFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f23849Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f23849Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.ExploreCountryRoomListFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.pageIndex = 1;
    }

    private final MoreRoomVM getVm() {
        return (MoreRoomVM) this.vm.getValue();
    }

    private final void initView() {
        getBinding().f51069OooO0OO.setOnRefreshListener(new o0o0Oo(this, 2));
        getBinding().f51069OooO0OO.OooOoOO(false);
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter = new RoomBaseAdapter<>(getContext());
        this.roomCountryAdapter = roomBaseAdapter;
        roomBaseAdapter.f11360OooO0O0 = RoomBaseAdapter.PageSource.GeneralRoomCountry;
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter2 = this.roomCountryAdapter;
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter3 = null;
        if (roomBaseAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
            roomBaseAdapter2 = null;
        }
        roomBaseAdapter2.f11362OooO0Oo = EnterRoomParentPage.Explore_Country;
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter4 = this.roomCountryAdapter;
        if (roomBaseAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
            roomBaseAdapter4 = null;
        }
        roomBaseAdapter4.setFirstLoading(true);
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter5 = this.roomCountryAdapter;
        if (roomBaseAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
            roomBaseAdapter5 = null;
        }
        roomBaseAdapter5.setEmptyImageRes(R.drawable.ic_empty_room_tag);
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter6 = this.roomCountryAdapter;
        if (roomBaseAdapter6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
            roomBaseAdapter6 = null;
        }
        roomBaseAdapter6.setEmptyText(R.string.blank_ta_no_rooms);
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter7 = this.roomCountryAdapter;
        if (roomBaseAdapter7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
            roomBaseAdapter7 = null;
        }
        roomBaseAdapter7.setLoadErrorClickListener(new OooO0O0());
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter8 = this.roomCountryAdapter;
        if (roomBaseAdapter8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
            roomBaseAdapter8 = null;
        }
        roomBaseAdapter8.setOnLoadMoreListener(new p564o0oOo00.o00000O0(this), getBinding().f51068OooO0O0);
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter9 = this.roomCountryAdapter;
        if (roomBaseAdapter9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
            roomBaseAdapter9 = null;
        }
        roomBaseAdapter9.setOnItemChildClickListener(p351o0OOOOo.OooOo00.f38281OooO0o0);
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter10 = this.roomCountryAdapter;
        if (roomBaseAdapter10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
            roomBaseAdapter10 = null;
        }
        roomBaseAdapter10.setLoadErrorClickListener(new OooO0OO());
        getBinding().f51068OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        RecyclerView recyclerView = getBinding().f51068OooO0O0;
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter11 = this.roomCountryAdapter;
        if (roomBaseAdapter11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
        } else {
            roomBaseAdapter3 = roomBaseAdapter11;
        }
        recyclerView.setAdapter(roomBaseAdapter3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-0, reason: not valid java name */
    public static final void m323initView$lambda0(ExploreCountryRoomListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadCountryData(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-1, reason: not valid java name */
    public static final void m324initView$lambda1(ExploreCountryRoomListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        loadCountryData$default(this$0, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-2, reason: not valid java name */
    public static final void m325initView$lambda2(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        o0O00000.OooO0o0("Room_country_room", o0O00000.OooO0O0(i));
        Object obj = baseQuickAdapter.getData().get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.model.RoomIndexModel");
        RoomIndexModel roomIndexModel = (RoomIndexModel) obj;
        String str = roomIndexModel.roomserverip;
        RoomModel roomModel = new RoomModel();
        roomModel.setName(roomIndexModel.barname);
        roomModel.setBaridx(roomIndexModel.baridx);
        roomModel.setImage(roomIndexModel.barimage);
        roomModel.setId(p168o00Ooo0.o0O0O00.OooOOO0(roomIndexModel.barid));
        roomModel.setRoomIp(str);
        RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Explore_Country);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadCountryData(boolean isRefresh) {
        if (isRefresh) {
            this.pageIndex = 1;
        }
        getVm().getRoomListByCountry(this.pageIndex, this.countryId).observe(this, new o0o0000.OooOo(new OooO0o(isRefresh), new OooO(isRefresh), null, false, 12));
    }

    public static /* synthetic */ void loadCountryData$default(ExploreCountryRoomListFragment exploreCountryRoomListFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        exploreCountryRoomListFragment.loadCountryData(z);
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        Bundle arguments = getArguments();
        this.countryId = arguments != null ? arguments.getInt(COUNTRY_ID) : 0;
        initView();
        loadCountryData(true);
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public za getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        za zaVarInflate = za.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(zaVarInflate, "inflate(inflater, container, false)");
        return zaVarInflate;
    }
}
