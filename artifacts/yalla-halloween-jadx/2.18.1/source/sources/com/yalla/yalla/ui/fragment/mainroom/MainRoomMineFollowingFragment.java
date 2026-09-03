package com.yalla.yalla.ui.fragment.mainroom;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o0000O;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.adapter.room.RoomBaseAdapter;
import com.app.base.fragment.ContributionFragment;
import com.app.base.model.RoomIndexFollowingModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o00OO0O0.o0OOO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p034OoooO0O.o0Oo0oo;
import p143o00OOooo.o00O0O0;
import p143o00OOooo.o00O0OO0;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0ooOOo;
import p153o00Oo0oO.oo0o0Oo;
import p160o00OoOO0.o00OO0O0;
import p176o00OoooO.oO00o000;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o000O0O0;
import p391o0OOooOo.o0O00000;
import p439o0OoOOo0.o00000O0;
import p495o0o00OOO.Oooo0;
import p498o0o00Oo0.OooOOO;
import p524o0o0O0oO.o0O00o0;
import p535o0o0OOoO.oO0OO00o;
import p538o0o0Oo0.o0O0000O;
import p566o0oOo00O.oO000;
import p605o0oo00oo.oO000Oo;
import p605o0oo00oo.oO000Oo0;
import p605o0oo00oo.oO000o00;
import p605o0oo00oo.oO0O0OoO;
import p649o0ooOOoo.eb;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J \u0010\u000b\u001a\u00020\u00032\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\tH\u0002J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\u001a\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0014J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0006\u0010\u0019\u001a\u00020\u0003R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R\"\u0010'\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFollowingFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/eb;", "", "initView", "", "barid", "followRoom", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "list", "followAllRoom", ContributionFragment.ARG_1, "changeFollowState", "", "isRefresh", "loadFollowingRoomList", "loadRecommendRoomList", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onResume", "scroolToTop", "Lo0oo00oo/oO000Oo0;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lo0oo00oo/oO000Oo0;", "vm", "Landroid/view/View;", "rootView", "Landroid/view/View;", "umengTag", "Ljava/lang/String;", "emptyHeaderView", "emptyFooterView", "needReInit", "Z", "getNeedReInit", "()Z", "setNeedReInit", "(Z)V", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainRoomMineFollowingFragment extends p503o0o00o00.OooO<eb> {
    public static final int $stable = 8;

    @Nullable
    private View emptyFooterView;

    @Nullable
    private View emptyHeaderView;

    @Nullable
    private o00OO0.OooO0OO followingAdapter;
    private boolean needReInit;
    private View rootView;

    @NotNull
    private final String umengTag;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o00OO0.OooO0OO oooO0OO = MainRoomMineFollowingFragment.this.followingAdapter;
            if (oooO0OO != null) {
                oooO0OO.setFirstLoading(true);
            }
            MainRoomMineFollowingFragment.this.loadFollowingRoomList(true);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f24410Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(0);
            this.f24410Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            List<T> data;
            RoomIndexFollowingModel roomIndexFollowingModel;
            o0O00000.OooO0OO("Room_following_followRoom");
            o00OO0.OooO0OO oooO0OO = MainRoomMineFollowingFragment.this.followingAdapter;
            if (oooO0OO == null || (data = oooO0OO.getData()) == 0 || (roomIndexFollowingModel = (RoomIndexFollowingModel) data.get(this.f24410Oooo0oO)) == null) {
                return null;
            }
            MainRoomMineFollowingFragment mainRoomMineFollowingFragment = MainRoomMineFollowingFragment.this;
            String str = roomIndexFollowingModel.barid;
            Intrinsics.checkNotNullExpressionValue(str, "it.barid");
            mainRoomMineFollowingFragment.followRoom(str);
            return null;
        }
    }

    public static final class OooO0OO extends o00Oo0 {

        public static final class OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ MainRoomMineFollowingFragment f24412Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MainRoomMineFollowingFragment mainRoomMineFollowingFragment) {
                super(0);
                this.f24412Oooo0o = mainRoomMineFollowingFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Collection data;
                o0O00000.OooO0OO("Room_following_followAll");
                ArrayList arrayList = new ArrayList();
                o00OO0.OooO0OO oooO0OO = this.f24412Oooo0o.followingAdapter;
                if (oooO0OO != null && (data = oooO0OO.getData()) != null) {
                    Iterator it = data.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((RoomIndexFollowingModel) it.next()).barid);
                    }
                }
                this.f24412Oooo0o.followAllRoom(arrayList);
                return null;
            }
        }

        public OooO0OO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            OooO00o onLogin = new OooO00o(MainRoomMineFollowingFragment.this);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
            if (activityOooO0O0 != null) {
                LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
            }
        }
    }

    public MainRoomMineFollowingFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(oO000Oo0.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f24416Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f24416Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.umengTag = "Room_related_following";
    }

    private final void changeFollowState(String roomId) {
        o00OO0.OooO0OO oooO0OO;
        Collection data;
        o00OO0.OooO0OO oooO0OO2 = this.followingAdapter;
        if (com.yalla.support.common.util.OooO0OO.OooO00o(oooO0OO2 != null ? oooO0OO2.getData() : null) || com.yalla.support.common.util.OooO0OO.OooO00o(roomId) || (oooO0OO = this.followingAdapter) == null || (data = oooO0OO.getData()) == null) {
            return;
        }
        int i = 0;
        for (Object obj : data) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            RoomIndexFollowingModel roomIndexFollowingModel = (RoomIndexFollowingModel) obj;
            if (Intrinsics.areEqual(roomId, roomIndexFollowingModel.barid)) {
                roomIndexFollowingModel.localFollow = true;
                o00OO0.OooO0OO oooO0OO3 = this.followingAdapter;
                if (oooO0OO3 != null) {
                    Intrinsics.checkNotNull(oooO0OO3);
                    oooO0OO3.notifyItemChanged(oooO0OO3.getHeaderLayoutCount() + i);
                }
                ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.post_list_follow_succeed));
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void followAllRoom(ArrayList<String> list) {
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(list)) {
            getVm().OooO0O0(list).observe(this, new o00O0OO0(this, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: followAllRoom$lambda-6, reason: not valid java name */
    public static final void m456followAllRoom$lambda6(MainRoomMineFollowingFragment this$0, Response response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadFollowingRoomList(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void followRoom(String barid) {
        Objects.requireNonNull(getVm());
        Intrinsics.checkNotNullParameter(barid, "barid");
        Oooo0 oooo0 = new Oooo0();
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        o00000OO.f32210OooO0Oo.OooO0OO(barid, false, new oO000Oo(oooo0, barid));
        oooo0.observe(this, new oO000(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: followRoom$lambda-5, reason: not valid java name */
    public static final void m457followRoom$lambda5(MainRoomMineFollowingFragment this$0, Response response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (response.getIsSuccess()) {
            this$0.changeFollowState((String) response.getData());
        }
    }

    private final oO000Oo0 getVm() {
        return (oO000Oo0) this.vm.getValue();
    }

    private final void initView() {
        View viewFindViewById;
        getBinding().f49239OooO0OO.setOnRefreshListener(new com.facebook.appevents.ml.OooO(this, 8));
        o00OO0.OooO0OO oooO0OO = new o00OO0.OooO0OO(getActivity());
        this.followingAdapter = oooO0OO;
        oooO0OO.f11362OooO0Oo = EnterRoomParentPage.Related_Following;
        oooO0OO.f11360OooO0O0 = RoomBaseAdapter.PageSource.RoomRelatedFollowingFragment;
        oooO0OO.setHeaderAndEmpty(true);
        o00OO0.OooO0OO oooO0OO2 = this.followingAdapter;
        if (oooO0OO2 != null) {
            oooO0OO2.setOnLoadMoreListener(new o00000O0(this, 4), getBinding().f49238OooO0O0);
        }
        o00OO0.OooO0OO oooO0OO3 = this.followingAdapter;
        if (oooO0OO3 != null) {
            oooO0OO3.setLoadErrorClickListener(new OooO00o());
        }
        o00OO0.OooO0OO oooO0OO4 = this.followingAdapter;
        if (oooO0OO4 != null) {
            oooO0OO4.setOnItemChildClickListener(new oO0OO00o(this, 3));
        }
        getBinding().f49238OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f49238OooO0O0.setAdapter(this.followingAdapter);
        this.emptyHeaderView = View.inflate(getContext(), R.layout.empty_main_related_follow, null);
        View viewInflate = View.inflate(getContext(), R.layout.empty_main_related_follow_footer, null);
        this.emptyFooterView = viewInflate;
        if (viewInflate != null && (viewFindViewById = viewInflate.findViewById(R.id.bt_follow_all)) != null) {
            viewFindViewById.setOnClickListener(new OooO0OO());
        }
        p617o0oo0o.o00000OO o00000oo2 = p617o0oo0o.o00000OO.f48476OooO00o;
        RecyclerView recyclerView = getBinding().f49238OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvMainRelated");
        p617o0oo0o.o00000OO.OooO00o(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-2, reason: not valid java name */
    public static final void m458initView$lambda2(MainRoomMineFollowingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0Oo0oo.OooO0o0(158, null);
        this$0.loadFollowingRoomList(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-3, reason: not valid java name */
    public static final void m459initView$lambda3(MainRoomMineFollowingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadFollowingRoomList(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-4, reason: not valid java name */
    public static final void m460initView$lambda4(MainRoomMineFollowingFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view.getId() != R.id.ivFollow) {
            return;
        }
        OooO0O0 onLogin = this$0.new OooO0O0(i);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
        if (activityOooO0O0 != null) {
            LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
            o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadFollowingRoomList(boolean isRefresh) {
        oO000Oo0 vm = getVm();
        Objects.requireNonNull(vm);
        Oooo0 oooo0 = new Oooo0();
        int i = 1;
        if (isRefresh) {
            vm.f48291OooO0OO = 1;
        }
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        oo0o0Oo oo0o0oo = o00000OO.f32210OooO0Oo;
        String strValueOf = String.valueOf(vm.f48291OooO0OO);
        int i2 = vm.f48289OooO00o;
        oO000o00 oo000o00 = new oO000o00(vm, oooo0);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("pageindex", strValueOf);
        mapOooO0O0.put("pagesize", i2 + "");
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32257Oooo0oO, mapOooO0O0, oo000o00);
        oooo0.observe(this, new o0O0000O(isRefresh, this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadFollowingRoomList$lambda-8, reason: not valid java name */
    public static final void m461loadFollowingRoomList$lambda8(boolean z, MainRoomMineFollowingFragment this$0, Response response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (response.getIsSuccess()) {
            if (z) {
                Collection collection = (Collection) response.getData();
                if (collection == null || collection.isEmpty()) {
                    this$0.loadRecommendRoomList();
                    return;
                }
                o00OO0.OooO0OO oooO0OO = this$0.followingAdapter;
                if (oooO0OO != null) {
                    oooO0OO.f31177OooO0o0 = false;
                }
                if (oooO0OO != null) {
                    oooO0OO.setNewData((List) response.getData());
                }
                o00OO0.OooO0OO oooO0OO2 = this$0.followingAdapter;
                if (oooO0OO2 != null) {
                    oooO0OO2.removeAllHeaderView();
                }
                o00OO0.OooO0OO oooO0OO3 = this$0.followingAdapter;
                if (oooO0OO3 != null) {
                    oooO0OO3.removeAllFooterView();
                }
                this$0.getBinding().f49239OooO0OO.OooOOo();
            } else if (response.getData() != null) {
                o00OO0.OooO0OO oooO0OO4 = this$0.followingAdapter;
                if (oooO0OO4 != null) {
                    oooO0OO4.OooO0OO((List) response.getData());
                }
                o00OO0.OooO0OO oooO0OO5 = this$0.followingAdapter;
                if (oooO0OO5 != null) {
                    Object data = response.getData();
                    Intrinsics.checkNotNull(data);
                    oooO0OO5.addData((Collection) data);
                }
            }
        }
        this$0.getBinding().f49239OooO0OO.Oooo0OO(z, response.getIsSuccess());
        o00OO0.OooO0OO oooO0OO6 = this$0.followingAdapter;
        if (oooO0OO6 != null) {
            oooO0OO6.setLoadComplete(Boolean.valueOf(z), Boolean.valueOf(response.getIsSuccess()), Boolean.valueOf(response.getNoMoreData()));
        }
    }

    private final void loadRecommendRoomList() {
        Objects.requireNonNull(getVm());
        Oooo0 oooo0 = new Oooo0();
        oO0O0OoO oo0o0ooo = new oO0O0OoO(oooo0);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32339o0ooOoO, mapOooO0O0, oo0o0ooo);
        oooo0.observe(this, new o00O0O0(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadRecommendRoomList$lambda-9, reason: not valid java name */
    public static final void m462loadRecommendRoomList$lambda9(MainRoomMineFollowingFragment this$0, Response response) {
        o00OO0.OooO0OO oooO0OO;
        o00OO0.OooO0OO oooO0OO2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00OO0.OooO0OO oooO0OO3 = this$0.followingAdapter;
        if (oooO0OO3 != null) {
            oooO0OO3.f31177OooO0o0 = true;
        }
        if (oooO0OO3 != null) {
            oooO0OO3.setNewData((List) response.getData());
        }
        View view = this$0.emptyHeaderView;
        if ((view != null ? view.getParent() : null) == null && (oooO0OO2 = this$0.followingAdapter) != null) {
            oooO0OO2.setHeaderView(this$0.emptyHeaderView);
        }
        View view2 = this$0.emptyFooterView;
        if ((view2 != null ? view2.getParent() : null) == null && (oooO0OO = this$0.followingAdapter) != null) {
            oooO0OO.setFooterView(this$0.emptyFooterView);
        }
        this$0.getBinding().f49239OooO0OO.Oooo0OO(true, response.getIsSuccess());
        o00OO0.OooO0OO oooO0OO4 = this$0.followingAdapter;
        if (oooO0OO4 != null) {
            Boolean bool = Boolean.TRUE;
            oooO0OO4.setLoadComplete(bool, Boolean.valueOf(response.getIsSuccess()), bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLazyInit$lambda-0, reason: not valid java name */
    public static final void m463onLazyInit$lambda0(MainRoomMineFollowingFragment this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            this$0.loadFollowingRoomList(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLazyInit$lambda-1, reason: not valid java name */
    public static final void m464onLazyInit$lambda1(MainRoomMineFollowingFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getIsLazyInit()) {
            this$0.getBinding().f49238OooO0O0.scrollToPosition(0);
            this$0.getBinding().f49239OooO0OO.OooO();
            this$0.loadFollowingRoomList(true);
        }
    }

    public final boolean getNeedReInit() {
        return this.needReInit;
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        this.needReInit = false;
        initView();
        loadFollowingRoomList(true);
        OooOOO.f41216OooO00o.OooOooO().observe(this, new o0O00o0(this, 6));
        LiveEventBus.get("JoinOrFollowRoom_Update").observe(this, new oO00o000(this, 8));
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0O00000.OooO0OO(this.umengTag);
        if (this.needReInit && getIsLazyInit()) {
            this.needReInit = false;
            initView();
            loadFollowingRoomList(true);
        }
    }

    public final void scroolToTop() {
        getBinding().f49238OooO0O0.scrollToPosition(0);
        getBinding().f49239OooO0OO.Oooo00o();
    }

    public final void setNeedReInit(boolean z) {
        this.needReInit = z;
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public eb getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        eb ebVarInflate = eb.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(ebVarInflate, "inflate(inflater, container, false)");
        return ebVarInflate;
    }
}
