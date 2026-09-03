package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.app.base.base.activity.BaseFragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.view.EmptyView;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.MomentGift;
import com.yalla.yalla.ui.view.PostDetailGiftHeaderView;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0OOo.oO000Oo;
import p522o0o0O0o.o00O0;
import p522o0o0O0o.oOO00O;
import p566o0oOo00O.oO00000o;
import p579o0oOoOOo.ooooO000;
import p649o0ooOOoo.sd;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001JB\u0007¢\u0006\u0004\bG\u0010HJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019J\u001e\u0010!\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010\"\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010#\u001a\u00020\u0003R!\u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010'\u001a\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010A\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010?R\u0016\u0010B\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010?R\u0016\u0010C\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00108R\u0016\u0010D\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010?¨\u0006K"}, d2 = {"Lcom/yalla/yalla/ui/fragment/PostDetailGiftFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/sd;", "", "showFirstPostSendGiftInfo", "init", "showHotOrNewHeaderView", "", "isRefresh", "isMoveToListTop", "loadData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "isShowCurrentFragment", "showFragment", "", ShareConstants.RESULT_POST_ID, "setData", "giftId", "", "giftNum", "", "giftImage", "addSendGiftItem", "tabRefreshData", "initData", "Lo00o00o0/OooO0OO;", "Lcom/yalla/yalla/model/MomentGift;", "baseAdapter$delegate", "Lkotlin/Lazy;", "getBaseAdapter", "()Lo00o00o0/OooO0OO;", "baseAdapter", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "vm$delegate", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "vm", "Lcom/yalla/yalla/ui/view/PostDetailGiftHeaderView;", "mPostDetailGiftHeaderView$delegate", "getMPostDetailGiftHeaderView", "()Lcom/yalla/yalla/ui/view/PostDetailGiftHeaderView;", "mPostDetailGiftHeaderView", "mPostId", "Ljava/lang/Long;", "giftListType", "I", "Lcom/yalla/yalla/common/ui/view/EmptyView;", "emptyView$delegate", "getEmptyView", "()Lcom/yalla/yalla/common/ui/view/EmptyView;", "emptyView", "mIsShowCurrentFragment", "Z", "mIsRefresh", "mIsSuccess", "mIsNoMoreData", "pageIndex", "dateSort", "J", "isInitLoadData", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PostDetailGiftFragment extends p503o0o00o00.OooO<sd> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String GIFT_LIST_TYPE = "GIFT_LIST_TYPE";

    @NotNull
    private static final String POST_ID = "POST_ID";

    /* JADX INFO: renamed from: baseAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy baseAdapter = LazyKt.lazy(new OooO0O0());
    private long dateSort;

    /* JADX INFO: renamed from: emptyView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy emptyView;
    private int giftListType;
    private boolean isInitLoadData;
    private boolean mIsNoMoreData;
    private boolean mIsRefresh;
    private boolean mIsShowCurrentFragment;
    private boolean mIsSuccess;

    /* JADX INFO: renamed from: mPostDetailGiftHeaderView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPostDetailGiftHeaderView;

    @Nullable
    private Long mPostId;
    private int pageIndex;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f24118Oooo0o = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.PostDetailGiftFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00000O> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000O invoke() {
            return new o00000O(PostDetailGiftFragment.this, PostDetailGiftFragment.this.getContext());
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<EmptyView> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final EmptyView invoke() {
            Context contextRequireContext = PostDetailGiftFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            EmptyView emptyView = new EmptyView(contextRequireContext, null, 0, 6, null);
            PostDetailGiftFragment postDetailGiftFragment = PostDetailGiftFragment.this;
            emptyView.setImage(Integer.valueOf(R.drawable.icon_no_list_gift));
            emptyView.setText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.No_gifts_yet));
            EmptyView.OooO00o(emptyView, new o00000OO(postDetailGiftFragment));
            return emptyView;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<List<MomentGift>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f24122Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f24122Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<MomentGift> list) {
            List<MomentGift> list2 = list;
            if (list2 != null) {
                boolean z = this.f24122Oooo0oO;
                PostDetailGiftFragment postDetailGiftFragment = PostDetailGiftFragment.this;
                if (z) {
                    postDetailGiftFragment.getBaseAdapter().setNewData(list2);
                    postDetailGiftFragment.showHotOrNewHeaderView();
                } else {
                    postDetailGiftFragment.getBaseAdapter().addData((Collection) list2);
                }
            }
            PostDetailGiftFragment.this.pageIndex++;
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiResult<List<MomentGift>>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f24123Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PostDetailGiftFragment f24124Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f24125Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(boolean z, PostDetailGiftFragment postDetailGiftFragment, boolean z2) {
            super(1);
            this.f24123Oooo0o = z;
            this.f24124Oooo0oO = postDetailGiftFragment;
            this.f24125Oooo0oo = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<MomentGift>> apiResult) {
            ApiResult<List<MomentGift>> result = apiResult;
            Intrinsics.checkNotNullParameter(result, "result");
            Long dateSort = result.getPage().getDateSort();
            if (dateSort != null) {
                this.f24124Oooo0oO.dateSort = dateSort.longValue();
            }
            if (this.f24123Oooo0o) {
                this.f24124Oooo0oO.getBinding().f50596OooO0O0.scrollToPosition(0);
            }
            this.f24124Oooo0oO.mIsRefresh = this.f24125Oooo0oo;
            this.f24124Oooo0oO.mIsSuccess = result.isSuccess();
            PostDetailGiftFragment postDetailGiftFragment = this.f24124Oooo0oO;
            List<MomentGift> data = result.getData();
            postDetailGiftFragment.mIsNoMoreData = data == null || data.isEmpty();
            if (this.f24124Oooo0oO.getBaseAdapter().getData().isEmpty()) {
                if (result.isSuccess()) {
                    this.f24124Oooo0oO.getEmptyView().OooO0O0(EmptyView.State.DataNull);
                } else {
                    this.f24124Oooo0oO.getEmptyView().OooO0O0(EmptyView.State.DataError);
                }
                this.f24124Oooo0oO.getBaseAdapter().hindEmptyView(true);
            }
            this.f24124Oooo0oO.getBinding().f50598OooO0Oo.OooO0Oo();
            LiveEventBus.get("POST_DETAIL_REFRESH_LOAD_SUCCESS").post(Boolean.TRUE);
            this.f24124Oooo0oO.getBaseAdapter().setLoadComplete(Boolean.valueOf(this.f24124Oooo0oO.mIsRefresh), Boolean.valueOf(this.f24124Oooo0oO.mIsSuccess), Boolean.valueOf(this.f24124Oooo0oO.mIsNoMoreData));
            this.f24124Oooo0oO.getBinding().f50597OooO0OO.Oooo00o(this.f24124Oooo0oO.mIsRefresh, this.f24124Oooo0oO.mIsSuccess, this.f24124Oooo0oO.mIsNoMoreData);
            this.f24124Oooo0oO.showFirstPostSendGiftInfo();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<PostDetailGiftHeaderView> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PostDetailGiftHeaderView invoke() {
            PostDetailGiftHeaderView postDetailGiftHeaderView = new PostDetailGiftHeaderView(PostDetailGiftFragment.this.requireActivity(), null, 0, 6, null);
            PostDetailGiftFragment postDetailGiftFragment = PostDetailGiftFragment.this;
            postDetailGiftHeaderView.OooO00o(postDetailGiftFragment.giftListType);
            postDetailGiftHeaderView.setListener(new oO00000o(postDetailGiftFragment));
            return postDetailGiftHeaderView;
        }
    }

    public PostDetailGiftFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.PostDetailGiftFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.PostDetailGiftFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.PostDetailGiftFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.PostDetailGiftFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f24130Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f24130Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.PostDetailGiftFragment$special$$inlined$viewModels$default$5
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
        this.mPostDetailGiftHeaderView = LazyKt.lazy(new OooOO0O());
        this.giftListType = 1;
        this.emptyView = LazyKt.lazy(new OooO0OO());
        this.pageIndex = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p188o00o00o0.OooO0OO<MomentGift> getBaseAdapter() {
        return (p188o00o00o0.OooO0OO) this.baseAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmptyView getEmptyView() {
        return (EmptyView) this.emptyView.getValue();
    }

    private final PostDetailGiftHeaderView getMPostDetailGiftHeaderView() {
        return (PostDetailGiftHeaderView) this.mPostDetailGiftHeaderView.getValue();
    }

    private final MomentVM getVm() {
        return (MomentVM) this.vm.getValue();
    }

    private final void init() {
        getBinding().f50596OooO0O0.setLayoutManager(new LinearLayoutManager(getContext()));
        getBinding().f50596OooO0O0.setAdapter(getBaseAdapter());
        getBaseAdapter().setEmptyView(getEmptyView());
        getBinding().f50597OooO0OO.f19541o00O0O = false;
        getBinding().f50597OooO0OO.OooOoOO(true);
        getBinding().f50597OooO0OO.Oooo0(new p324o0O0oo0O.o00000OO(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-1, reason: not valid java name */
    public static final void m393init$lambda1(PostDetailGiftFragment this$0, oO000Oo it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.loadData(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData(boolean isRefresh, boolean isMoveToListTop) {
        Long l = this.mPostId;
        if (l != null) {
            long jLongValue = l.longValue();
            Long l2 = this.mPostId;
            if (l2 != null && l2.longValue() == 0) {
                return;
            }
            if (!this.isInitLoadData) {
                this.isInitLoadData = true;
            }
            if (isRefresh) {
                this.pageIndex = 1;
                this.dateSort = 0L;
                getBinding().f50598OooO0Oo.OooO0oo();
            }
            getVm().momentGiftList(this.giftListType, jLongValue, this.dateSort, this.pageIndex).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooO0o(isRefresh), OooO.f24118Oooo0o, new OooOO0(isMoveToListTop, this, isRefresh), false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFirstPostSendGiftInfo() {
        if (this.mIsShowCurrentFragment) {
            List<MomentGift> data = getBaseAdapter().getData();
            Intrinsics.checkNotNullExpressionValue(data, "baseAdapter.data");
            if (!data.isEmpty()) {
                p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
                p499o0o00OoO.o000000 o000000VarOooO = p497o0o00Oo.OooOOO0.OooO();
                Objects.requireNonNull(o000000VarOooO);
                if (o000000VarOooO.OooO00o("momentFirstSendGiftInfo" + p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue(), false)) {
                    return;
                }
                p497o0o00Oo.OooOOO0.OooO().OooOO0o(true);
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.app.base.base.activity.BaseFragmentActivity");
                BaseFragmentActivity activity = (BaseFragmentActivity) fragmentActivityRequireActivity;
                Intrinsics.checkNotNullParameter(activity, "activity");
                ooooO000 ooooo000 = ooooO000.f46233OooO00o;
                activity.showDialog((String) null, ooooO000.f46235OooO0OO);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showHotOrNewHeaderView() {
        List<MomentGift> data = getBaseAdapter().getData();
        Intrinsics.checkNotNullExpressionValue(data, "baseAdapter.data");
        if (!(!data.isEmpty())) {
            getBaseAdapter().removeAllHeaderView();
        } else if (getMPostDetailGiftHeaderView().getParent() == null) {
            getBaseAdapter().addHeaderView(getMPostDetailGiftHeaderView());
        }
    }

    public final void addSendGiftItem(long giftId, int giftNum, @NotNull String giftImage) {
        String imageUrl;
        Intrinsics.checkNotNullParameter(giftImage, "giftImage");
        try {
            if (giftImage.length() == 0) {
                GiftPropModel giftPropModelOooO0O0 = oo0O.OooO0OO.f53327OooO00o.OooO0O0((int) giftId);
                giftImage = (giftPropModelOooO0O0 == null || (imageUrl = giftPropModelOooO0O0.getImageUrl()) == null) ? null : o00O0.OooO0oO(imageUrl);
            }
            MomentGift momentGift = new MomentGift();
            p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
            momentGift.setHeadUrl(oooOOO.OooO0oo().getValue());
            Long value = oooOOO.OooOo().getValue();
            momentGift.setUserId(value == null ? 0L : value.longValue());
            momentGift.setNickname(oooOOO.OooOoO().getValue());
            Integer value2 = oooOOO.OooOOOo().getValue();
            momentGift.setSex(value2 == null ? 2 : value2.intValue());
            Pair<Boolean, Integer> value3 = oooOOO.OooOOO0().getValue();
            if (value3 != null) {
                momentGift.setIsVip(value3.getFirst().booleanValue() ? 1 : 0);
                momentGift.setVipLevel(value3.getSecond().intValue());
            }
            momentGift.setPropId((int) giftId);
            momentGift.setPropNum(giftNum);
            momentGift.setPropImage(giftImage);
            momentGift.kaVIPLv = 0;
            Pair<Integer, Integer> value4 = oooOOO.OooO().getValue();
            if (value4 != null && value4.getFirst().intValue() == VipState.Vip.getValue()) {
                momentGift.kaVIPLv = value4.getSecond().intValue();
            }
            getBaseAdapter().addData(0, momentGift);
            getBinding().f50596OooO0O0.smoothScrollToPosition(getBaseAdapter().getHeaderLayoutCount() + 0);
            if (getBaseAdapter().getData().isEmpty()) {
                getEmptyView().OooO0O0(EmptyView.State.DataNull);
                getBaseAdapter().hindEmptyView(true);
            }
            getBinding().f50598OooO0Oo.OooO0Oo();
            showHotOrNewHeaderView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void initData() {
        if (this.isInitLoadData) {
            return;
        }
        loadData(true, false);
    }

    @Override // p503o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mPostId = Long.valueOf(arguments.getLong(POST_ID, 0L));
            this.giftListType = oOO00O.OooO0Oo(Integer.valueOf(arguments.getInt(GIFT_LIST_TYPE, 1)), 1);
        }
        if (this.giftListType == -1) {
            this.giftListType = 1;
        }
    }

    @Override // p503o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getVm().statisticalTime();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        init();
        getVm().statisticalTime();
    }

    public final void setData(long postId) {
        this.mPostId = Long.valueOf(postId);
    }

    public final void showFragment(boolean isShowCurrentFragment) {
        this.mIsShowCurrentFragment = isShowCurrentFragment;
        showFirstPostSendGiftInfo();
    }

    public final void tabRefreshData(boolean isMoveToListTop) {
        loadData(true, isMoveToListTop);
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public sd getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        sd sdVarInflate = sd.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(sdVarInflate, "inflate(inflater, container, false)");
        return sdVarInflate;
    }
}
