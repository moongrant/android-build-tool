package com.yalla.yalla.ui.fragment.moment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.PostUserModel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.view.EmptyView;
import com.yalla.yalla.ui.view.moment.MomentDetailLikeHeaderView;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.q6;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b?\u0010@J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\nJ\b\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\nH\u0002J\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0002R!\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0016\u00108\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00106¨\u0006C"}, d2 = {"Lcom/yalla/yalla/ui/fragment/moment/MomentDetailLikeFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/q6;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "", ShareConstants.RESULT_POST_ID, "setData", "count", "setCount", "", "isAdd", "selfPraiseItem", "isMoveToListTop", "tabRefreshData", "initData", "init", "showHotOrNewHeaderView", "isRefresh", "loadData", "Lo0oOo0OO/o000O;", "Lcom/yalla/yalla/model/PostUserModel;", "baseAdapter$delegate", "Lkotlin/Lazy;", "getBaseAdapter", "()Lo0oOo0OO/o000O;", "baseAdapter", "Lcom/yalla/yalla/ui/view/EmptyView;", "emptyView$delegate", "getEmptyView", "()Lcom/yalla/yalla/ui/view/EmptyView;", "emptyView", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "vm$delegate", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "vm", "Lcom/yalla/yalla/ui/view/moment/MomentDetailLikeHeaderView;", "mHeaderView", "Lcom/yalla/yalla/ui/view/moment/MomentDetailLikeHeaderView;", "mPostId", "Ljava/lang/Long;", "mIsRefresh", "Z", "mIsSuccess", "mIsNoMoreData", "", "pageIndex", "I", "dateSort", "J", "isInitLoadData", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMomentDetailLikeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailLikeFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentDetailLikeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,288:1\n106#2,15:289\n*S KotlinDebug\n*F\n+ 1 MomentDetailLikeFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentDetailLikeFragment\n*L\n107#1:289,15\n*E\n"})
public final class MomentDetailLikeFragment extends p508o0o0O.OooOO0O<q6> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String POST_ID = "POST_ID";
    private long dateSort;
    private boolean isInitLoadData;

    @Nullable
    private MomentDetailLikeHeaderView mHeaderView;
    private boolean mIsNoMoreData;
    private boolean mIsRefresh;
    private boolean mIsSuccess;

    @Nullable
    private Long mPostId;
    private int pageIndex;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    /* JADX INFO: renamed from: baseAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy baseAdapter = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: emptyView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy emptyView = LazyKt.lazy(new OooO0OO());

    public static final class OooO extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f28758OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(long j) {
            super(1);
            this.f28758OooO0Oo = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            int code = it.getCode();
            long j = this.f28758OooO0Oo;
            if (code == 2095) {
                LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE").post(Long.valueOf(j));
            } else if (code == 4000) {
                LiveEventBus.get("MOMENT_BY_USER_REMOVE").post(Long.valueOf(j));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.moment.MomentDetailLikeFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0000oo> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000oo invoke() {
            MomentDetailLikeFragment momentDetailLikeFragment = MomentDetailLikeFragment.this;
            return new o0000oo(momentDetailLikeFragment, momentDetailLikeFragment.getContext(), oO00OO0O.item_post_detail_praise_list);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<EmptyView> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final EmptyView invoke() {
            MomentDetailLikeFragment momentDetailLikeFragment = MomentDetailLikeFragment.this;
            Context contextRequireContext = momentDetailLikeFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            EmptyView emptyView = new EmptyView(contextRequireContext, null, 6, 0);
            emptyView.setImage(Integer.valueOf(oOo00OO0.icon_no_list_praise));
            emptyView.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.No_likes_yet));
            EmptyView.OooO00o(emptyView, new o0000O0(momentDetailLikeFragment));
            return emptyView;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<List<PostUserModel>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28762OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f28762OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<PostUserModel> list) {
            List<PostUserModel> list2 = list;
            MomentDetailLikeFragment momentDetailLikeFragment = MomentDetailLikeFragment.this;
            if (list2 != null) {
                if (this.f28762OooO0o0) {
                    momentDetailLikeFragment.getBaseAdapter().OooOoO0(list2);
                    momentDetailLikeFragment.showHotOrNewHeaderView();
                } else {
                    momentDetailLikeFragment.getBaseAdapter().OooO0O0(list2);
                }
            }
            momentDetailLikeFragment.pageIndex++;
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiResult<List<PostUserModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f28764OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28765OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(boolean z, boolean z2) {
            super(1);
            this.f28765OooO0o0 = z;
            this.f28764OooO0o = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<PostUserModel>> apiResult) {
            ApiResult<List<PostUserModel>> result = apiResult;
            Intrinsics.checkNotNullParameter(result, "result");
            Long dateSort = result.getPage().getDateSort();
            long jLongValue = dateSort != null ? dateSort.longValue() : 0L;
            MomentDetailLikeFragment momentDetailLikeFragment = MomentDetailLikeFragment.this;
            momentDetailLikeFragment.dateSort = jLongValue;
            if (this.f28765OooO0o0) {
                momentDetailLikeFragment.getBinding().f58668OooO0O0.scrollToPosition(0);
            }
            momentDetailLikeFragment.mIsRefresh = this.f28764OooO0o;
            momentDetailLikeFragment.mIsSuccess = result.isSuccess();
            List<PostUserModel> data = result.getData();
            momentDetailLikeFragment.mIsNoMoreData = data == null || data.isEmpty();
            if (momentDetailLikeFragment.getBaseAdapter().f10111OooOOoo.isEmpty()) {
                if (result.isSuccess()) {
                    momentDetailLikeFragment.getEmptyView().OooO0O0(EmptyView.State.DataNull);
                } else {
                    momentDetailLikeFragment.getEmptyView().OooO0O0(EmptyView.State.DataError);
                }
                momentDetailLikeFragment.getBaseAdapter().OooOoOO(true);
            }
            momentDetailLikeFragment.getBinding().f58670OooO0Oo.OooO0Oo();
            LiveEventBus.get("POST_DETAIL_REFRESH_LOAD_SUCCESS").post(Boolean.TRUE);
            momentDetailLikeFragment.getBaseAdapter().Oooo0(Boolean.valueOf(momentDetailLikeFragment.mIsRefresh), Boolean.valueOf(result.isSuccess()), Boolean.valueOf(momentDetailLikeFragment.mIsNoMoreData));
            momentDetailLikeFragment.getBinding().f58669OooO0OO.OooOoOO(momentDetailLikeFragment.mIsRefresh, momentDetailLikeFragment.mIsSuccess, momentDetailLikeFragment.mIsNoMoreData);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.yalla.yalla.ui.fragment.moment.MomentDetailLikeFragment$special$$inlined$viewModels$default$1] */
    public MomentDetailLikeFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailLikeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailLikeFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(BaseMomentDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailLikeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailLikeFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28769OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28769OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailLikeFragment$special$$inlined$viewModels$default$5
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
        this.pageIndex = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o000O<PostUserModel> getBaseAdapter() {
        return (o000O) this.baseAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmptyView getEmptyView() {
        return (EmptyView) this.emptyView.getValue();
    }

    private final BaseMomentDetailVM getVm() {
        return (BaseMomentDetailVM) this.vm.getValue();
    }

    private final void init() {
        getBinding().f58668OooO0O0.setLayoutManager(new LinearLayoutManager(getContext()));
        getBinding().f58668OooO0O0.setAdapter(getBaseAdapter());
        getBaseAdapter().OooOo0(getEmptyView());
        int i = 0;
        getBinding().f58669OooO0OO.f21330OooOooO = false;
        getBinding().f58669OooO0OO.OooOo00(true);
        getBinding().f58669OooO0OO.OooOoo0(new p427o0OoOO00.o00Oo0(this));
        Context context = getContext();
        if (context != null) {
            MomentDetailLikeHeaderView momentDetailLikeHeaderView = new MomentDetailLikeHeaderView(context, null, 6, i);
            this.mHeaderView = momentDetailLikeHeaderView;
            momentDetailLikeHeaderView.setData(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(MomentDetailLikeFragment this$0, o0OO0o.OooOOO0 it) {
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
                getBinding().f58670OooO0Oo.OooO0oo();
            }
            getVm().praiseList(jLongValue, this.dateSort, this.pageIndex).observe(getViewLifecycleOwner(), new p377o0OOoOo.o0000OO0(new OooO0o(isRefresh), new OooO(jLongValue), new OooOO0(isMoveToListTop, isRefresh), false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showHotOrNewHeaderView() {
        List<PostUserModel> list = getBaseAdapter().f10111OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "baseAdapter.data");
        if (!(!list.isEmpty())) {
            getBaseAdapter().OooOOoo();
            return;
        }
        MomentDetailLikeHeaderView momentDetailLikeHeaderView = this.mHeaderView;
        if ((momentDetailLikeHeaderView != null ? momentDetailLikeHeaderView.getParent() : null) == null) {
            getBaseAdapter().OooO0o0(this.mHeaderView, -1);
        }
    }

    public final void initData() {
        if (this.isInitLoadData || !getIsLazyInit()) {
            return;
        }
        loadData(true, false);
    }

    @Override // p508o0o0O.OooOO0O, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.mPostId = arguments != null ? Long.valueOf(arguments.getLong(POST_ID, 0L)) : null;
    }

    @Override // p508o0o0O.OooOO0O, androidx.fragment.app.Fragment
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void selfPraiseItem(boolean isAdd) {
        if (isAdd) {
            PostUserModel postUserModel = new PostUserModel();
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            Long l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
            postUserModel.setUserid(l == null ? 0L : l.longValue());
            postUserModel.setNickname((String) p464o0Oooo.o000000O.OooOOoo().getValue());
            postUserModel.setHeadurl((String) p464o0Oooo.o000000O.OooO().getValue());
            Integer num = (Integer) p464o0Oooo.o000000O.OooOOO().getValue();
            postUserModel.setSex(num == null ? 2 : num.intValue());
            Pair pair = (Pair) p464o0Oooo.o000000O.OooOO0o().getValue();
            if (pair != null) {
                postUserModel.setVip(((Boolean) pair.getFirst()).booleanValue() ? 1 : 0);
                postUserModel.setVipLevel(((Number) pair.getSecond()).intValue());
            }
            Pair pair2 = (Pair) p464o0Oooo.o000000O.OooOO0().getValue();
            if ((pair2 != null && ((Number) pair2.getFirst()).intValue() == VipState.Vip.getValue()) != false) {
                Pair pair3 = (Pair) p464o0Oooo.o000000O.OooOO0().getValue();
                postUserModel.kaVIPLv = pair3 != null ? ((Number) pair3.getSecond()).intValue() : 0;
            }
            Integer num2 = (Integer) ((MutableLiveData) p464o0Oooo.o000000O.f46695OooOo0O.getValue()).getValue();
            postUserModel.setRole(num2 == null ? 0 : num2.intValue());
            getBaseAdapter().OooO00o(postUserModel);
            getBinding().f58668OooO0O0.smoothScrollToPosition(getBaseAdapter().OooOOO0() + 0);
        } else {
            int size = getBaseAdapter().f10111OooOOoo.size();
            int i = -1;
            for (int i2 = 0; i2 < size; i2++) {
                PostUserModel postUserModel2 = getBaseAdapter().f10111OooOOoo.get(i2);
                p464o0Oooo.o000000O o000000o3 = p464o0Oooo.o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOOo0().getValue(), postUserModel2 != null ? Long.valueOf(postUserModel2.getUserid()) : null)) {
                    i = i2;
                }
            }
            if (i >= 0) {
                getBaseAdapter().OooOOo(i);
            }
        }
        if (getBaseAdapter().f10111OooOOoo.isEmpty()) {
            getEmptyView().OooO0O0(EmptyView.State.DataNull);
            getBaseAdapter().OooOoOO(true);
        }
        getBinding().f58670OooO0Oo.OooO0Oo();
        showHotOrNewHeaderView();
    }

    public final void setCount(long count) {
        MomentDetailLikeHeaderView momentDetailLikeHeaderView = this.mHeaderView;
        if (momentDetailLikeHeaderView != null) {
            momentDetailLikeHeaderView.setCount(count);
        }
    }

    public final void setData(long postId) {
        this.mPostId = Long.valueOf(postId);
    }

    public final void tabRefreshData(boolean isMoveToListTop) {
        loadData(true, isMoveToListTop);
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public q6 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        q6 q6VarInflate = q6.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(q6VarInflate, "inflate(inflater, container, false)");
        return q6VarInflate;
    }
}
