package com.yalla.yalla.ui.fragment;

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
import com.app.base.impl.PostGifPlayControl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentForwardContent;
import com.yalla.yalla.model.MomentTypeDelete;
import com.yalla.yalla.model.MomentTypePower;
import com.yalla.yalla.model.RecommendNewPostModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p044OooooOO.o00O000;
import p515o0o0O00.o00O00;
import p649o0ooOOoo.m9;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b*\u0010+J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u001a\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020$8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010&¨\u0006,"}, d2 = {"Lcom/yalla/yalla/ui/fragment/UserNewPostFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/m9;", "", "initObserver", "", ShareConstants.RESULT_POST_ID, "squareSingle4Edited", "", "isRefresh", "loadUserPost", "initView", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Lcom/yalla/yalla/model/RecommendNewPostModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/yalla/yalla/model/RecommendNewPostModel;", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "momentVM$delegate", "Lkotlin/Lazy;", "getMomentVM", "()Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "momentVM", "Lo0oOo0/o00000OO;", "adapter$delegate", "getAdapter", "()Lo0oOo0/o00000OO;", "adapter", "", "pageIndex", "I", "dateSort", "J", "sourceType", "<init>", "(Lcom/yalla/yalla/model/RecommendNewPostModel;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserNewPostFragment extends p503o0o00o00.OooO<m9> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;
    private long dateSort;

    @NotNull
    private final RecommendNewPostModel model;

    /* JADX INFO: renamed from: momentVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy momentVM;
    private int pageIndex;
    private final int sourceType;

    public static final class OooO00o extends Lambda implements Function0<p563o0oOo0.o00000OO> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p563o0oOo0.o00000OO invoke() {
            FragmentActivity fragmentActivityRequireActivity = UserNewPostFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return new p563o0oOo0.o00000OO(fragmentActivityRequireActivity, MomentAdapterTag.MomentListFollowingFragment_Top);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<List<MomentDetailModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f24307Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z) {
            super(1);
            this.f24307Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<MomentDetailModel> list) {
            List<MomentDetailModel> list2 = list;
            UserNewPostFragment.this.pageIndex++;
            if (this.f24307Oooo0oO) {
                UserNewPostFragment.this.getAdapter().setNewData(list2);
            } else if (list2 != null) {
                UserNewPostFragment.this.getAdapter().addData((Collection) list2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiResult<List<MomentDetailModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f24309Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z) {
            super(1);
            this.f24309Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<MomentDetailModel>> apiResult) {
            ApiResult<List<MomentDetailModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            UserNewPostFragment userNewPostFragment = UserNewPostFragment.this;
            Long dateSort = it.getPage().getDateSort();
            userNewPostFragment.dateSort = dateSort != null ? dateSort.longValue() : 0L;
            UserNewPostFragment.this.getBinding().f50009OooO0OO.Oooo0OO(this.f24309Oooo0oO, it.isSuccess());
            p563o0oOo0.o00000OO adapter = UserNewPostFragment.this.getAdapter();
            Boolean boolValueOf = Boolean.valueOf(this.f24309Oooo0oO);
            Boolean boolValueOf2 = Boolean.valueOf(it.isSuccess());
            List<MomentDetailModel> data = it.getData();
            adapter.setLoadComplete(boolValueOf, boolValueOf2, Boolean.valueOf(data == null || data.isEmpty()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<MomentDetailModel, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f24311Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j) {
            super(1);
            this.f24311Oooo0oO = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentDetailModel momentDetailModel) {
            MomentDetailModel momentDetailModel2 = momentDetailModel;
            if (momentDetailModel2 != null) {
                List<MomentDetailModel> data = UserNewPostFragment.this.getAdapter().getData();
                Intrinsics.checkNotNullExpressionValue(data, "adapter.data");
                long j = this.f24311Oooo0oO;
                Iterator<MomentDetailModel> it = data.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (it.next().getId() == j) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && UserNewPostFragment.this.getAdapter().getData().size() > i) {
                    if (momentDetailModel2.getPower() == MomentTypePower.Self.getValue()) {
                        UserNewPostFragment.this.getAdapter().remove(i);
                        UserNewPostFragment.this.getAdapter().notifyItemRemoved(UserNewPostFragment.this.getAdapter().getHeaderLayoutCount() + i);
                    } else {
                        UserNewPostFragment.this.getAdapter().setData(i, momentDetailModel2);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public UserNewPostFragment(@NotNull RecommendNewPostModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.model = model;
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.UserNewPostFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.UserNewPostFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.momentVM = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.UserNewPostFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.UserNewPostFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f24315Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f24315Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.UserNewPostFragment$special$$inlined$viewModels$default$5
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
        this.adapter = LazyKt.lazy(new OooO00o());
        this.pageIndex = 1;
        this.sourceType = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p563o0oOo0.o00000OO getAdapter() {
        return (p563o0oOo0.o00000OO) this.adapter.getValue();
    }

    private final MomentVM getMomentVM() {
        return (MomentVM) this.momentVM.getValue();
    }

    private final void initObserver() {
        int i = 8;
        LiveEventBus.get("POST_DETAIL_DATA_CHANGE_ISINROOM", MomentChangeUserIsInRoomModel.class).observe(this, new p142o00OOooO.o0000O00(this, i));
        Class cls = Long.TYPE;
        LiveEventBus.get("EVENT_DELETED", cls).observe(this, new p159o00OoOO.o00000OO(this, 7));
        LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS", cls).observe(this, new o00O000(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-1, reason: not valid java name */
    public static final void m428initObserver$lambda1(UserNewPostFragment this$0, MomentChangeUserIsInRoomModel momentChangeUserIsInRoomModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p563o0oOo0.o00000OO adapter = this$0.getAdapter();
        for (int i = 0; i < adapter.getData().size(); i++) {
            MomentDetailModel momentDetailModel = adapter.getData().get(i);
            if (momentDetailModel.getUserIdx() == Long.parseLong(momentChangeUserIsInRoomModel.getUserId()) && momentDetailModel.getIsInRoom() != momentChangeUserIsInRoomModel.getIsInRoom()) {
                momentDetailModel.setInRoom(momentChangeUserIsInRoomModel.getIsInRoom());
                adapter.notifyItemChanged(adapter.getHeaderLayoutCount() + i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-3, reason: not valid java name */
    public static final void m429initObserver$lambda3(UserNewPostFragment this$0, Long l) {
        MomentForwardContent forwardContent;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p563o0oOo0.o00000OO adapter = this$0.getAdapter();
        int size = adapter.getData().size();
        for (int i = 0; i < size; i++) {
            MomentDetailModel momentDetailModel = adapter.getData().get(i);
            if ((momentDetailModel == null || (forwardContent = momentDetailModel.getForwardContent()) == null || forwardContent.getShareType() != 20) ? false : true) {
                MomentForwardContent forwardContent2 = momentDetailModel.getForwardContent();
                if (Intrinsics.areEqual(forwardContent2 != null ? Long.valueOf(forwardContent2.getId()) : null, l)) {
                    momentDetailModel.setDeleteType(MomentTypeDelete.EVENT.getValue());
                    adapter.notifyItemChanged(adapter.getHeaderLayoutCount() + i);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-4, reason: not valid java name */
    public static final void m430initObserver$lambda4(UserNewPostFragment this$0, Long it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00O00.OooOO0O("动态编辑 发送成功 刷新 = " + it);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.squareSingle4Edited(it.longValue());
    }

    private final void initView() {
        getBinding().f50008OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getAdapter().f44994OooO0o = EnterRoomParentPage.Moments_Following_SharedRoom;
        getAdapter().setOnLoadMoreListener(new p192o00o0O0.o0000(this), getBinding().f50008OooO0O0);
        getBinding().f50008OooO0O0.setAdapter(getAdapter());
        getBinding().f50009OooO0OO.setNestedScrollingEnabled(false);
        new PostGifPlayControl(this, getBinding().f50008OooO0O0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-5, reason: not valid java name */
    public static final void m431initView$lambda5(UserNewPostFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadUserPost(false);
    }

    private final void loadUserPost(boolean isRefresh) {
        if (isRefresh) {
            this.pageIndex = 1;
            this.dateSort = 0L;
        }
        getMomentVM().userMomentList(this.model.getUserId(), this.dateSort, this.pageIndex, this.sourceType).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooO0O0(isRefresh), null, new OooO0OO(isRefresh), false, 10));
    }

    public static /* synthetic */ void loadUserPost$default(UserNewPostFragment userNewPostFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        userNewPostFragment.loadUserPost(z);
    }

    private final void squareSingle4Edited(long postId) {
        MomentVM.momentDetail$default(getMomentVM(), String.valueOf(postId), 0, 2, null).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooO0o(postId), null, null, false, 14));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadUserPost$default(this, false, 1, null);
        initObserver();
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public m9 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m9 m9VarInflate = m9.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(m9VarInflate, "inflate(inflater)");
        return m9VarInflate;
    }
}
