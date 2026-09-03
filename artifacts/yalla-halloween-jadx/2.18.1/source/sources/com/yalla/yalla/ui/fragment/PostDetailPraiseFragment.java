package com.yalla.yalla.ui.fragment;

import android.content.Context;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.view.EmptyView;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.model.PostUserModel;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import java.util.Collection;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p176o00OoooO.oO000Oo0;
import p407o0Oo0OOo.oO000Oo;
import p649o0ooOOoo.td;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b9\u0010:J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u0003R!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00100¨\u0006="}, d2 = {"Lcom/yalla/yalla/ui/fragment/PostDetailPraiseFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/td;", "", "init", "", "isRefresh", "isMoveToListTop", "loadData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "", ShareConstants.RESULT_POST_ID, "setData", "isAdd", "selfPraiseItem", "tabRefreshData", "initData", "Lo00o00o0/OooO0OO;", "Lcom/yalla/yalla/model/PostUserModel;", "baseAdapter$delegate", "Lkotlin/Lazy;", "getBaseAdapter", "()Lo00o00o0/OooO0OO;", "baseAdapter", "Lcom/yalla/yalla/common/ui/view/EmptyView;", "emptyView$delegate", "getEmptyView", "()Lcom/yalla/yalla/common/ui/view/EmptyView;", "emptyView", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "vm$delegate", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "vm", "mPostId", "Ljava/lang/Long;", "mIsRefresh", "Z", "mIsSuccess", "mIsNoMoreData", "", "pageIndex", "I", "dateSort", "J", "isInitLoadData", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PostDetailPraiseFragment extends p503o0o00o00.OooO<td> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String POST_ID = "POST_ID";
    private long dateSort;
    private boolean isInitLoadData;
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f24134Oooo0o = new OooO();

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

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.PostDetailPraiseFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0000> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000 invoke() {
            return new o0000(PostDetailPraiseFragment.this, PostDetailPraiseFragment.this.getContext());
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<EmptyView> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final EmptyView invoke() {
            Context contextRequireContext = PostDetailPraiseFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            EmptyView emptyView = new EmptyView(contextRequireContext, null, 0, 6, null);
            PostDetailPraiseFragment postDetailPraiseFragment = PostDetailPraiseFragment.this;
            emptyView.setImage(Integer.valueOf(R.drawable.icon_no_list_praise));
            emptyView.setText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.No_likes_yet));
            EmptyView.OooO00o(emptyView, new o0000O00(postDetailPraiseFragment));
            return emptyView;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<List<PostUserModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f24138Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f24138Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<PostUserModel> list) {
            List<PostUserModel> list2 = list;
            if (list2 != null) {
                boolean z = this.f24138Oooo0oO;
                PostDetailPraiseFragment postDetailPraiseFragment = PostDetailPraiseFragment.this;
                if (z) {
                    postDetailPraiseFragment.getBaseAdapter().setNewData(list2);
                } else {
                    postDetailPraiseFragment.getBaseAdapter().addData((Collection) list2);
                }
            }
            PostDetailPraiseFragment.this.pageIndex++;
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiResult<List<PostUserModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f24140Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f24141Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(boolean z, boolean z2) {
            super(1);
            this.f24140Oooo0oO = z;
            this.f24141Oooo0oo = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<PostUserModel>> apiResult) {
            ApiResult<List<PostUserModel>> result = apiResult;
            Intrinsics.checkNotNullParameter(result, "result");
            PostDetailPraiseFragment postDetailPraiseFragment = PostDetailPraiseFragment.this;
            Long dateSort = result.getPage().getDateSort();
            postDetailPraiseFragment.dateSort = dateSort != null ? dateSort.longValue() : 0L;
            if (this.f24140Oooo0oO) {
                PostDetailPraiseFragment.this.getBinding().f50654OooO0O0.scrollToPosition(0);
            }
            PostDetailPraiseFragment.this.mIsRefresh = this.f24141Oooo0oo;
            PostDetailPraiseFragment.this.mIsSuccess = result.isSuccess();
            PostDetailPraiseFragment postDetailPraiseFragment2 = PostDetailPraiseFragment.this;
            List<PostUserModel> data = result.getData();
            postDetailPraiseFragment2.mIsNoMoreData = data == null || data.isEmpty();
            if (PostDetailPraiseFragment.this.getBaseAdapter().getData().isEmpty()) {
                if (result.isSuccess()) {
                    PostDetailPraiseFragment.this.getEmptyView().OooO0O0(EmptyView.State.DataNull);
                } else {
                    PostDetailPraiseFragment.this.getEmptyView().OooO0O0(EmptyView.State.DataError);
                }
                PostDetailPraiseFragment.this.getBaseAdapter().hindEmptyView(true);
            }
            PostDetailPraiseFragment.this.getBinding().f50656OooO0Oo.OooO0Oo();
            LiveEventBus.get("POST_DETAIL_REFRESH_LOAD_SUCCESS").post(Boolean.TRUE);
            PostDetailPraiseFragment.this.getBaseAdapter().setLoadComplete(Boolean.valueOf(PostDetailPraiseFragment.this.mIsRefresh), Boolean.valueOf(result.isSuccess()), Boolean.valueOf(PostDetailPraiseFragment.this.mIsNoMoreData));
            PostDetailPraiseFragment.this.getBinding().f50655OooO0OO.Oooo00o(PostDetailPraiseFragment.this.mIsRefresh, PostDetailPraiseFragment.this.mIsSuccess, PostDetailPraiseFragment.this.mIsNoMoreData);
            return Unit.INSTANCE;
        }
    }

    public PostDetailPraiseFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.PostDetailPraiseFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.PostDetailPraiseFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.PostDetailPraiseFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.PostDetailPraiseFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f24145Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f24145Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.PostDetailPraiseFragment$special$$inlined$viewModels$default$5
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

    /* JADX INFO: Access modifiers changed from: private */
    public final p188o00o00o0.OooO0OO<PostUserModel> getBaseAdapter() {
        return (p188o00o00o0.OooO0OO) this.baseAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmptyView getEmptyView() {
        return (EmptyView) this.emptyView.getValue();
    }

    private final MomentVM getVm() {
        return (MomentVM) this.vm.getValue();
    }

    private final void init() {
        getBinding().f50654OooO0O0.setLayoutManager(new LinearLayoutManager(getContext()));
        getBinding().f50654OooO0O0.setAdapter(getBaseAdapter());
        getBaseAdapter().setEmptyView(getEmptyView());
        getBinding().f50655OooO0OO.f19541o00O0O = false;
        getBinding().f50655OooO0OO.OooOoOO(true);
        getBinding().f50655OooO0OO.Oooo0(new oO000Oo0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-0, reason: not valid java name */
    public static final void m394init$lambda0(PostDetailPraiseFragment this$0, oO000Oo it) {
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
                getBinding().f50656OooO0Oo.OooO0oo();
            }
            getVm().praiseList(String.valueOf(jLongValue), this.dateSort, this.pageIndex).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooO0o(isRefresh), OooO.f24134Oooo0o, new OooOO0(isMoveToListTop, isRefresh), false));
        }
    }

    public final void initData() {
        if (this.isInitLoadData || !getIsLazyInit()) {
            return;
        }
        loadData(true, false);
    }

    @Override // p503o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.mPostId = arguments != null ? Long.valueOf(arguments.getLong(POST_ID, 0L)) : null;
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

    public final void selfPraiseItem(boolean isAdd) {
        if (isAdd) {
            PostUserModel postUserModel = new PostUserModel();
            p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
            Long value = oooOOO.OooOo().getValue();
            postUserModel.setUserid(value == null ? 0L : value.longValue());
            postUserModel.setNickname(oooOOO.OooOoO().getValue());
            postUserModel.setHeadurl(oooOOO.OooO0oo().getValue());
            Integer value2 = oooOOO.OooOOOo().getValue();
            postUserModel.setSex(value2 == null ? 2 : value2.intValue());
            Pair<Boolean, Integer> value3 = oooOOO.OooOOO0().getValue();
            if (value3 != null) {
                postUserModel.setVip(value3.getFirst().booleanValue() ? 1 : 0);
                postUserModel.setVipLevel(value3.getSecond().intValue());
            }
            Pair<Integer, Integer> value4 = oooOOO.OooO().getValue();
            if (value4 != null && value4.getFirst().intValue() == VipState.Vip.getValue()) {
                Pair<Integer, Integer> value5 = oooOOO.OooO().getValue();
                postUserModel.kaVIPLv = value5 != null ? value5.getSecond().intValue() : 0;
            }
            Integer value6 = oooOOO.OooOOOO().getValue();
            postUserModel.setRole(value6 == null ? 0 : value6.intValue());
            getBaseAdapter().addData(0, postUserModel);
            getBinding().f50654OooO0O0.smoothScrollToPosition(getBaseAdapter().getHeaderLayoutCount() + 0);
        } else {
            int i = -1;
            int size = getBaseAdapter().getData().size();
            for (int i2 = 0; i2 < size; i2++) {
                PostUserModel postUserModel2 = getBaseAdapter().getData().get(i2);
                if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue(), postUserModel2 != null ? Long.valueOf(postUserModel2.getUserid()) : null)) {
                    i = i2;
                }
            }
            if (i >= 0) {
                getBaseAdapter().remove(i);
            }
        }
        if (getBaseAdapter().getData().isEmpty()) {
            getEmptyView().OooO0O0(EmptyView.State.DataNull);
            getBaseAdapter().hindEmptyView(true);
        }
        getBinding().f50656OooO0Oo.OooO0Oo();
    }

    public final void setData(long postId) {
        this.mPostId = Long.valueOf(postId);
    }

    public final void tabRefreshData(boolean isMoveToListTop) {
        loadData(true, isMoveToListTop);
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public td getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        td tdVarInflate = td.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(tdVarInflate, "inflate(inflater, container, false)");
        return tdVarInflate;
    }
}
