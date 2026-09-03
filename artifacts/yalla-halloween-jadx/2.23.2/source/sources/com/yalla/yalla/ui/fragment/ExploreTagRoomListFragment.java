package com.yalla.yalla.ui.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.ui.adapter.room.RoomBaseAdapter;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.main.MoreRoomVM;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oO00O0o0;
import p473o0OoooOo.o0OOOO0o;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0014R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/ui/fragment/ExploreTagRoomListFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/oO00O0o0;", "", "initView", "", "isRefresh", "loadCountryData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "", "labelId", "I", "Lcom/yalla/yalla/ui/vm/main/MoreRoomVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/main/MoreRoomVM;", "vm", "Lcom/yalla/yalla/ui/adapter/room/RoomBaseAdapter;", "Lcom/yalla/yalla/model/room/RoomIndexModel;", "roomCountryAdapter", "Lcom/yalla/yalla/ui/adapter/room/RoomBaseAdapter;", "pageIndex", "<init>", "(I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nExploreTagRoomListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExploreTagRoomListFragment.kt\ncom/yalla/yalla/ui/fragment/ExploreTagRoomListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,101:1\n106#2,15:102\n*S KotlinDebug\n*F\n+ 1 ExploreTagRoomListFragment.kt\ncom/yalla/yalla/ui/fragment/ExploreTagRoomListFragment\n*L\n25#1:102,15\n*E\n"})
public final class ExploreTagRoomListFragment extends p527o0o0OO0o.o000O<oO00O0o0> {
    public static final int $stable = 8;
    private final int labelId;
    private int pageIndex;
    private RoomBaseAdapter<RoomIndexModel> roomCountryAdapter;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO00o extends o0OOOO0o {
        public OooO00o() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            ExploreTagRoomListFragment exploreTagRoomListFragment = ExploreTagRoomListFragment.this;
            RoomBaseAdapter roomBaseAdapter = exploreTagRoomListFragment.roomCountryAdapter;
            if (roomBaseAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
                roomBaseAdapter = null;
            }
            roomBaseAdapter.Oooo00O(true);
            exploreTagRoomListFragment.loadCountryData(true);
        }
    }

    public static final class OooO0O0 extends o0OOOO0o {
        public OooO0O0() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@Nullable View view) {
            ExploreTagRoomListFragment.this.loadCountryData(true);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<List<RoomIndexModel>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f27625OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z) {
            super(1);
            this.f27625OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<RoomIndexModel> list) {
            List<RoomIndexModel> list2 = list;
            ExploreTagRoomListFragment exploreTagRoomListFragment = ExploreTagRoomListFragment.this;
            exploreTagRoomListFragment.pageIndex++;
            boolean z = this.f27625OooO0o0;
            if (list2 != null) {
                if (z) {
                    RoomBaseAdapter roomBaseAdapter = exploreTagRoomListFragment.roomCountryAdapter;
                    if (roomBaseAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
                        roomBaseAdapter = null;
                    }
                    roomBaseAdapter.OooOoO0(list2);
                } else {
                    RoomBaseAdapter roomBaseAdapter2 = exploreTagRoomListFragment.roomCountryAdapter;
                    if (roomBaseAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
                        roomBaseAdapter2 = null;
                    }
                    roomBaseAdapter2.Oooo0oO(list2);
                    RoomBaseAdapter roomBaseAdapter3 = exploreTagRoomListFragment.roomCountryAdapter;
                    if (roomBaseAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
                        roomBaseAdapter3 = null;
                    }
                    roomBaseAdapter3.OooO0O0(CollectionsKt.toList(list2));
                }
            }
            RoomBaseAdapter roomBaseAdapter4 = exploreTagRoomListFragment.roomCountryAdapter;
            if (roomBaseAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
                roomBaseAdapter4 = null;
            }
            roomBaseAdapter4.Oooo0(Boolean.valueOf(z), Boolean.TRUE, list2 != null ? Boolean.valueOf(list2.isEmpty()) : null);
            exploreTagRoomListFragment.getBinding().f44795OooO0OO.OooOooO(z, true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f27627OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f27627OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            ExploreTagRoomListFragment exploreTagRoomListFragment = ExploreTagRoomListFragment.this;
            RoomBaseAdapter roomBaseAdapter = exploreTagRoomListFragment.roomCountryAdapter;
            if (roomBaseAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
                roomBaseAdapter = null;
            }
            roomBaseAdapter.OooOoo();
            exploreTagRoomListFragment.getBinding().f44795OooO0OO.OooOooO(this.f27627OooO0o0, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.yalla.yalla.ui.fragment.ExploreTagRoomListFragment$special$$inlined$viewModels$default$1] */
    public ExploreTagRoomListFragment(int i) {
        this.labelId = i;
        final ?? r5 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.ExploreTagRoomListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.ExploreTagRoomListFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r5.invoke();
            }
        });
        this.vm = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(MoreRoomVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.ExploreTagRoomListFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000Oo0.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.ExploreTagRoomListFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f27631OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27631OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.ExploreTagRoomListFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.pageIndex = 1;
    }

    private final MoreRoomVM getVm() {
        return (MoreRoomVM) this.vm.getValue();
    }

    private final void initView() {
        getBinding().f44795OooO0OO.setOnRefreshListener(new p022Oooo00O.o000oOoO(this));
        getBinding().f44795OooO0OO.OooOo00(false);
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter = new RoomBaseAdapter<>(getContext());
        this.roomCountryAdapter = roomBaseAdapter;
        roomBaseAdapter.f27239OooOoo = RoomBaseAdapter.PageSource.GeneralRoomCountry;
        roomBaseAdapter.f27242OooOooo = EnterRoomParentPage.Explore_Country;
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter2 = this.roomCountryAdapter;
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter3 = null;
        if (roomBaseAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
            roomBaseAdapter2 = null;
        }
        roomBaseAdapter2.Oooo00O(true);
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter4 = this.roomCountryAdapter;
        if (roomBaseAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
            roomBaseAdapter4 = null;
        }
        roomBaseAdapter4.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_room_tag);
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter5 = this.roomCountryAdapter;
        if (roomBaseAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
            roomBaseAdapter5 = null;
        }
        roomBaseAdapter5.Oooo000(p562o0oOo000.o000000.blank_ta_no_rooms);
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter6 = this.roomCountryAdapter;
        if (roomBaseAdapter6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
            roomBaseAdapter6 = null;
        }
        roomBaseAdapter6.Oooo0OO(new OooO00o());
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter7 = this.roomCountryAdapter;
        if (roomBaseAdapter7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
            roomBaseAdapter7 = null;
        }
        roomBaseAdapter7.OooOoO(new BaseQuickAdapter.OooOO0() { // from class: com.yalla.yalla.ui.fragment.o0OoOo0
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0
            public final void OooO00o() {
                ExploreTagRoomListFragment.initView$lambda$1(this.f28422OooO0Oo);
            }
        }, getBinding().f44794OooO0O0);
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter8 = this.roomCountryAdapter;
        if (roomBaseAdapter8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
            roomBaseAdapter8 = null;
        }
        roomBaseAdapter8.f13179OooO0oo = new androidx.compose.animation.OooO00o();
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter9 = this.roomCountryAdapter;
        if (roomBaseAdapter9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
            roomBaseAdapter9 = null;
        }
        roomBaseAdapter9.Oooo0OO(new OooO0O0());
        getBinding().f44794OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        RecyclerView recyclerView = getBinding().f44794OooO0O0;
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter10 = this.roomCountryAdapter;
        if (roomBaseAdapter10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomCountryAdapter");
        } else {
            roomBaseAdapter3 = roomBaseAdapter10;
        }
        recyclerView.setAdapter(roomBaseAdapter3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(ExploreTagRoomListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadCountryData(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(ExploreTagRoomListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        loadCountryData$default(this$0, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Object obj = baseQuickAdapter.f13189OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.room.RoomIndexModel");
        RoomIndexModel roomIndexModel = (RoomIndexModel) obj;
        o0oo0000.OooO00o.OooO0OO("201009", MapsKt.mapOf(new Pair("roompoint", roomIndexModel.barid)));
        RoomModel roomModel = new RoomModel();
        roomModel.setName(roomIndexModel.barname);
        roomModel.setBaridx(roomIndexModel.baridx);
        roomModel.setImage(roomIndexModel.barimage);
        roomModel.setId(o0O0O0Oo.OooOO0o(roomIndexModel.barid));
        roomModel.setRoomIp(roomIndexModel.roomserverip);
        roomModel.websocketaddr = roomIndexModel.websocketaddr;
        MutableState mutableState = p429o0OoOO.o0Oo0oo.f46817OooO00o;
        p429o0OoOO.o0Oo0oo.OooO0o(roomModel, EnterRoomParentPage.Explore_Country);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadCountryData(boolean isRefresh) {
        if (isRefresh) {
            this.pageIndex = 1;
        }
        getVm().getRoomListByTag(this.pageIndex, this.labelId).observe(this, new p384o0OOoo0O.o000oOoO(new OooO0OO(isRefresh), new OooO0o(isRefresh), null, false, 12));
    }

    public static /* synthetic */ void loadCountryData$default(ExploreTagRoomListFragment exploreTagRoomListFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        exploreTagRoomListFragment.loadCountryData(z);
    }

    @Override // p586o0oOooO0.oO0Oo0o0
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        loadCountryData(true);
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public oO00O0o0 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        oO00O0o0 oo00o0o0Inflate = oO00O0o0.inflate(getLayoutInflater(), container, false);
        Intrinsics.checkNotNullExpressionValue(oo00o0o0Inflate, "inflate(...)");
        return oo00o0o0Inflate;
    }
}
