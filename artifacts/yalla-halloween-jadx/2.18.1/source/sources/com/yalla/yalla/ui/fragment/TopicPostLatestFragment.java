package com.yalla.yalla.ui.fragment;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.impl.PostGifPlayControl;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentForwardContent;
import com.yalla.yalla.model.MomentTypeDelete;
import com.yalla.yalla.model.MomentTypePower;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import com.yalla.yalla.ui.vm.moment.TopicDetailVM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00O;
import p143o00OOooo.o00OO000;
import p143o00OOooo.oo0o0O0;
import p143o00OOooo.oo0oOO0;
import p515o0o0O00.o00O00;
import p522o0o0O0o.o00O00OO;
import p524o0o0O0oO.o0O00OO;
import p524o0o0O0oO.o0O00oO0;
import p524o0o0O0oO.o0O0O0O;
import p649o0ooOOoo.h9;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u0003H\u0016J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/yalla/yalla/ui/fragment/TopicPostLatestFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/h9;", "", "initObserve", "", ShareConstants.RESULT_POST_ID, "squareSingle4Edited", "", "isRefresh", "loadTopicPost", "initView", "onLazyInit", "onDestroy", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Lo0oOo0/o00000OO;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "()Lo0oOo0/o00000OO;", "adapter", "Lcom/yalla/yalla/ui/vm/moment/TopicDetailVM;", "vm$delegate", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/TopicDetailVM;", "vm", "Lcom/app/base/impl/PostGifPlayControl;", "postGifPlayControl", "Lcom/app/base/impl/PostGifPlayControl;", "topicId", "J", "dateSort", "", "pageIndex", "I", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicPostLatestFragment extends p503o0o00o00.OooO<h9> {
    public static final int $stable = 8;
    private long dateSort;
    private PostGifPlayControl postGifPlayControl;
    private long topicId;

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(TopicDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.TopicPostLatestFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.TopicPostLatestFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f24279Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24279Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.TopicPostLatestFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });
    private int pageIndex = 1;

    public static final class OooO00o extends Lambda implements Function0<p563o0oOo0.o00000OO> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p563o0oOo0.o00000OO invoke() {
            FragmentActivity fragmentActivityRequireActivity = TopicPostLatestFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return new p563o0oOo0.o00000OO(fragmentActivityRequireActivity, MomentAdapterTag.TopicDetailFragmentLatest);
        }
    }

    public static final class OooO0O0 extends p654o0ooo.o00Oo0 {
        public OooO0O0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            TopicPostLatestFragment.this.getAdapter().setFirstLoading(true);
            TopicPostLatestFragment.this.loadTopicPost(true);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiResult<List<MomentDetailModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f24274Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ TopicPostLatestFragment f24275Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, TopicPostLatestFragment topicPostLatestFragment) {
            super(1);
            this.f24274Oooo0o = z;
            this.f24275Oooo0oO = topicPostLatestFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<MomentDetailModel>> apiResult) {
            ApiResult<List<MomentDetailModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.isSuccess()) {
                if (this.f24274Oooo0o) {
                    this.f24275Oooo0oO.getAdapter().setNewData(it.getData());
                    List<MomentDetailModel> data = this.f24275Oooo0oO.getAdapter().getData();
                    Intrinsics.checkNotNullExpressionValue(data, "adapter.data");
                    if (!data.isEmpty()) {
                        this.f24275Oooo0oO.getBinding().f49530OooO0O0.scrollToPosition(0);
                    }
                } else {
                    List<MomentDetailModel> data2 = it.getData();
                    if (data2 != null) {
                        this.f24275Oooo0oO.getAdapter().addData((Collection) data2);
                    }
                }
                TopicPostLatestFragment topicPostLatestFragment = this.f24275Oooo0oO;
                Long dateSort = it.getPage().getDateSort();
                topicPostLatestFragment.dateSort = dateSort != null ? dateSort.longValue() : 0L;
                this.f24275Oooo0oO.pageIndex = it.getPage().getPageIndex() + 1;
            }
            this.f24275Oooo0oO.getBinding().f49531OooO0OO.Oooo0OO(this.f24274Oooo0o, it.isSuccess());
            p563o0oOo0.o00000OO adapter = this.f24275Oooo0oO.getAdapter();
            Boolean boolValueOf = Boolean.valueOf(this.f24274Oooo0o);
            Boolean boolValueOf2 = Boolean.valueOf(it.isSuccess());
            List<MomentDetailModel> data3 = it.getData();
            adapter.setLoadComplete(boolValueOf, boolValueOf2, Boolean.valueOf(data3 == null || data3.isEmpty()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<MomentDetailModel, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f24277Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j) {
            super(1);
            this.f24277Oooo0oO = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentDetailModel momentDetailModel) {
            MomentDetailModel momentDetailModel2 = momentDetailModel;
            if (momentDetailModel2 != null) {
                List<MomentDetailModel> data = TopicPostLatestFragment.this.getAdapter().getData();
                Intrinsics.checkNotNullExpressionValue(data, "adapter.data");
                long j = this.f24277Oooo0oO;
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
                if (i != -1 && TopicPostLatestFragment.this.getAdapter().getData().size() > i) {
                    if (momentDetailModel2.getPower() == MomentTypePower.Self.getValue()) {
                        TopicPostLatestFragment.this.getAdapter().remove(i);
                        TopicPostLatestFragment.this.getAdapter().notifyItemRemoved(TopicPostLatestFragment.this.getAdapter().getHeaderLayoutCount() + i);
                    } else {
                        TopicPostLatestFragment.this.getAdapter().setData(i, momentDetailModel2);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p563o0oOo0.o00000OO getAdapter() {
        return (p563o0oOo0.o00000OO) this.adapter.getValue();
    }

    private final TopicDetailVM getVm() {
        return (TopicDetailVM) this.vm.getValue();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void initObserve() {
        LiveEventBus.get("POST_DETAIL_DATA_REFRESH", MomentDetailModel.class).observe(this, new o00OO000(this, 7));
        Class cls = Long.TYPE;
        LiveEventBus.get("EVENT_DELETED", cls).observe(this, new oo0oOO0(this, 8));
        getVm().getTopicOwnerId().observe(this, new oo0o0O0(this, 3));
        int i = 4;
        getVm().getTopicManagerIds().observe(this, new o00O(this, i));
        int i2 = 6;
        getVm().getTopDyId().observe(this, new o0O00OO(this, i2));
        getVm().getDeletePostId().observe(this, new o0O00oO0(this, i));
        LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS", cls).observe(this, new o0O0O0O(this, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserve$lambda-0, reason: not valid java name */
    public static final void m401initObserve$lambda0(TopicPostLatestFragment this$0, MomentDetailModel momentDetailModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (int i = 0; i < this$0.getAdapter().getData().size(); i++) {
            if (this$0.getAdapter().getData().get(i).getId() == momentDetailModel.getId()) {
                this$0.getAdapter().getData().set(i, momentDetailModel);
                RecyclerView recyclerView = this$0.getBinding().f49530OooO0O0;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvTopicPost");
                o00O00OO.OooO00o(recyclerView, this$0.getAdapter().getHeaderLayoutCount() + i);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserve$lambda-1, reason: not valid java name */
    public static final void m402initObserve$lambda1(TopicPostLatestFragment this$0, Long l) {
        MomentForwardContent forwardContent;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int size = this$0.getAdapter().getData().size();
        for (int i = 0; i < size; i++) {
            MomentDetailModel momentDetailModel = this$0.getAdapter().getData().get(i);
            if ((momentDetailModel == null || (forwardContent = momentDetailModel.getForwardContent()) == null || forwardContent.getShareType() != 20) ? false : true) {
                MomentForwardContent forwardContent2 = momentDetailModel.getForwardContent();
                if (Intrinsics.areEqual(forwardContent2 != null ? Long.valueOf(forwardContent2.getId()) : null, l)) {
                    momentDetailModel.setDeleteType(MomentTypeDelete.EVENT.getValue());
                    this$0.getAdapter().notifyItemChanged(this$0.getAdapter().getHeaderLayoutCount() + i);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserve$lambda-2, reason: not valid java name */
    public static final void m403initObserve$lambda2(TopicPostLatestFragment this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p563o0oOo0.o00000OO adapter = this$0.getAdapter();
        String strValueOf = String.valueOf(l);
        Objects.requireNonNull(adapter);
        Intrinsics.checkNotNullParameter(strValueOf, "<set-?>");
        adapter.f44992OooO0OO = strValueOf;
        this$0.getAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserve$lambda-3, reason: not valid java name */
    public static final void m404initObserve$lambda3(TopicPostLatestFragment this$0, ArrayList it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p563o0oOo0.o00000OO adapter = this$0.getAdapter();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        Objects.requireNonNull(adapter);
        Intrinsics.checkNotNullParameter(it, "<set-?>");
        adapter.f44993OooO0Oo = it;
        this$0.getAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserve$lambda-5, reason: not valid java name */
    public static final void m405initObserve$lambda5(TopicPostLatestFragment this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (l != null) {
            this$0.getAdapter().f44995OooO0o0 = l.longValue();
            this$0.getAdapter().notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserve$lambda-7, reason: not valid java name */
    public static final void m406initObserve$lambda7(TopicPostLatestFragment this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<MomentDetailModel> data = this$0.getAdapter().getData();
        int size = data.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            MomentDetailModel momentDetailModel = data.get(i2);
            if (Intrinsics.areEqual(momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null, l)) {
                i = i2;
            }
        }
        if (i < 0 || data.size() <= i) {
            return;
        }
        this$0.getAdapter().remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserve$lambda-8, reason: not valid java name */
    public static final void m407initObserve$lambda8(TopicPostLatestFragment this$0, Long it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00O00.OooOO0O("动态编辑 发送成功 刷新 = " + it);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.squareSingle4Edited(it.longValue());
    }

    private final void initView() {
        getBinding().f49530OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f49531OooO0OO.setOnRefreshListener(new p142o00OOooO.OooOOO0(this, 3));
        getAdapter().f44994OooO0o = EnterRoomParentPage.Moments_Topics_SharedRoom;
        TopicInfoModel value = getVm().getTopicDetailLocal().getValue();
        if (value != null) {
            this.topicId = value.getId();
        }
        getAdapter().f44991OooO0O0 = this.topicId;
        getAdapter().setEmptyText(R.string.No_posts_yet);
        getAdapter().setEmptyImageRes(R.drawable.ic_empty_fans);
        getAdapter().setLoadErrorClickListener(new OooO0O0());
        getAdapter().setOnLoadMoreListener(new p142o00OOooO.OooOOOO(this, 4), getBinding().f49530OooO0O0);
        getBinding().f49530OooO0O0.setAdapter(getAdapter());
        RecyclerView.ItemAnimator itemAnimator = getBinding().f49530OooO0O0.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f9012OooO0o = 0L;
        }
        this.postGifPlayControl = new PostGifPlayControl(this, getBinding().f49530OooO0O0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-11, reason: not valid java name */
    public static final void m408initView$lambda11(TopicPostLatestFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadTopicPost(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-9, reason: not valid java name */
    public static final void m409initView$lambda9(TopicPostLatestFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PostGifPlayControl postGifPlayControl = this$0.postGifPlayControl;
        if (postGifPlayControl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("postGifPlayControl");
            postGifPlayControl = null;
        }
        postGifPlayControl.OooO0OO();
        this$0.loadTopicPost(true);
        LiveEventBus.get("MOMENT_LIST_REFRESH_OF_TOPIC").post(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadTopicPost(boolean isRefresh) {
        if (isRefresh) {
            this.dateSort = 0L;
            this.pageIndex = 1;
        }
        getVm().topicMomentListNew(this.topicId, this.dateSort, this.pageIndex).observe(getViewLifecycleOwner(), new o0o0000.OooOo(null, null, new OooO0OO(isRefresh, this), false, 11));
    }

    private final void squareSingle4Edited(long postId) {
        MomentVM.momentDetail$default(getVm(), String.valueOf(postId), 0, 2, null).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooO0o(postId), null, null, false, 14));
    }

    @Override // p503o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getVm().statisticalTime();
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        loadTopicPost(true);
        initObserve();
        getVm().statisticalTime();
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public h9 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        h9 h9VarInflate = h9.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(h9VarInflate, "inflate(inflater)");
        return h9VarInflate;
    }
}
