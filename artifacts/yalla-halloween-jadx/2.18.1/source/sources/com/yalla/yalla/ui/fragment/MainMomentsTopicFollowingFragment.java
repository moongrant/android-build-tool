package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.fragment.MainMomentsTopicFollowingFragment;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00O0OOO;
import p173o00OooO0.o0o0Oo;
import p524o0o0O0oO.o0O0O0O;
import p535o0o0OOoO.oO0o0000;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.v8;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0014J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/ui/fragment/MainMomentsTopicFollowingFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/v8;", "", "initObserver", "initView", "", "isRefresh", "loadData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onDestroy", "onResume", "scrollTopRefresh", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "vm", "Landroid/view/View;", "viewHeader$delegate", "getViewHeader", "()Landroid/view/View;", "viewHeader", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainMomentsTopicFollowingFragment extends p503o0o00o00.OooO<v8> {
    public static final int $stable = 8;
    private p188o00o00o0.OooO0OO<TopicInfoModel> baseAdapter;

    /* JADX INFO: renamed from: viewHeader$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewHeader;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO00o extends p188o00o00o0.OooO0OO<TopicInfoModel> {
        public OooO00o(Context context) {
            super(context, R.layout.item_topic_follow);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
            TopicInfoModel topicInfoModel = (TopicInfoModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            if (topicInfoModel == null) {
                return;
            }
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
            oooO00o2.f48429OooO0OO = topicInfoModel.getImage();
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO());
            oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.nivHeader));
            helper.OooOO0(R.id.tvName, topicInfoModel.getName());
            ImageView imageView = (ImageView) helper.OooO0Oo(R.id.ivOwner);
            int positionid = topicInfoModel.getPositionid();
            if (positionid == 1) {
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.ic_topic_owner);
            } else if (positionid != 3) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.ic_topic_manager);
            }
            TextView textView = (TextView) helper.OooO0Oo(R.id.tvPostContent);
            String postContent = topicInfoModel.getPostContent();
            if (postContent == null || StringsKt.isBlank(postContent)) {
                textView.setText(R.string.no_posts_yet);
                return;
            }
            MomentSendContentModel momentSendContentModel = (MomentSendContentModel) com.android.billingclient.api.o0Oo0oo.OooO0OO(topicInfoModel.getPostContent(), new OooO().getType());
            String content = momentSendContentModel != null ? momentSendContentModel.getContent() : null;
            if (content == null || content.length() == 0) {
                textView.setText(R.string.topic_post_photo);
            } else {
                o0o0Oo.OooO0OO(MainMomentsTopicFollowingFragment.this.getActivity(), momentSendContentModel, textView);
            }
        }
    }

    public static final class OooO0O0 extends p654o0ooo.o00Oo0 {
        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@Nullable View view) {
            LiveEventBus.get("TOPIC_TO_RECOMMEND").post(null);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<View> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            View viewInflate = View.inflate(MainMomentsTopicFollowingFragment.this.getContext(), R.layout.item_topic_follow_header, null);
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: o0oOoOoO.b2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveEventBus.get("TOPIC_CREATE_CHECK_CLICK").post(Boolean.TRUE);
                }
            });
            return viewInflate;
        }
    }

    public MainMomentsTopicFollowingFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.MainMomentsTopicFollowingFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.MainMomentsTopicFollowingFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.MainMomentsTopicFollowingFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.MainMomentsTopicFollowingFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f23948Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f23948Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.MainMomentsTopicFollowingFragment$special$$inlined$viewModels$default$5
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
        this.viewHeader = LazyKt.lazy(new OooO0OO());
    }

    private final View getViewHeader() {
        Object value = this.viewHeader.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-viewHeader>(...)");
        return (View) value;
    }

    private final MomentVM getVm() {
        return (MomentVM) this.vm.getValue();
    }

    private final void initObserver() {
        int i = 5;
        LiveEventBus.get("TOPIC_TO_CREATED").observe(this, new o0O0O0O(this, i));
        LiveEventBus.get("TOPIC_CREATE_VIEW_VISIBLE", Boolean.TYPE).observe(this, new o00O0OOO(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-0, reason: not valid java name */
    public static final void m349initObserver$lambda0(MainMomentsTopicFollowingFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getIsLazyInit()) {
            this$0.loadData(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-1, reason: not valid java name */
    public static final void m350initObserver$lambda1(MainMomentsTopicFollowingFragment this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO = null;
        if (it.booleanValue()) {
            p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO2 = this$0.baseAdapter;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            } else {
                oooO0OO = oooO0OO2;
            }
            oooO0OO.setHeaderView(this$0.getViewHeader());
            return;
        }
        if (this$0.getViewHeader().getParent() != null) {
            p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO3 = this$0.baseAdapter;
            if (oooO0OO3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            } else {
                oooO0OO = oooO0OO3;
            }
            oooO0OO.removeHeaderView(this$0.getViewHeader());
        }
    }

    private final void initView() {
        getBinding().f50788OooO0OO.setOnRefreshListener(new p142o00OOooO.OooOo00(this, 3));
        getBinding().f50788OooO0OO.setOnLoadMoreListener(new p466o0OooO0.o00000(this));
        getBinding().f50787OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        OooO00o oooO00o = new OooO00o(getContext());
        this.baseAdapter = oooO00o;
        oooO00o.setOnItemClickListener(new oO0o0000(this, 2));
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO = this.baseAdapter;
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO = null;
        }
        oooO0OO.setEmptyText(R.string.null_topic);
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO3 = this.baseAdapter;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO3 = null;
        }
        oooO0OO3.setEmptyImageRes(R.drawable.ic_empty_message_system);
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO4 = this.baseAdapter;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO4 = null;
        }
        oooO0OO4.setEmptyButtonText(R.string.topic_find);
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO5 = this.baseAdapter;
        if (oooO0OO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO5 = null;
        }
        oooO0OO5.setOnEmptyClickListener(new OooO0O0());
        RecyclerView recyclerView = getBinding().f50787OooO0O0;
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO6 = this.baseAdapter;
        if (oooO0OO6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO6 = null;
        }
        recyclerView.setAdapter(oooO0OO6);
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO7 = this.baseAdapter;
        if (oooO0OO7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
        } else {
            oooO0OO2 = oooO0OO7;
        }
        oooO0OO2.setHeaderView(getViewHeader());
        p617o0oo0o.o00000OO o00000oo2 = p617o0oo0o.o00000OO.f48476OooO00o;
        RecyclerView recyclerView2 = getBinding().f50787OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.rvMomentJoin");
        p617o0oo0o.o00000OO.OooO00o(recyclerView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-2, reason: not valid java name */
    public static final void m351initView$lambda2(MainMomentsTopicFollowingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-3, reason: not valid java name */
    public static final void m352initView$lambda3(MainMomentsTopicFollowingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-5, reason: not valid java name */
    public static final void m353initView$lambda5(MainMomentsTopicFollowingFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.getContext();
        if (context != null) {
            TopicDetailActivity.OooO00o oooO00o = TopicDetailActivity.f22567o0OoOo0;
            p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO = this$0.baseAdapter;
            if (oooO0OO == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                oooO0OO = null;
            }
            TopicInfoModel topicInfoModel = oooO0OO.getData().get(i);
            Intrinsics.checkNotNullExpressionValue(topicInfoModel, "baseAdapter.data[position]");
            oooO00o.OooO00o(context, topicInfoModel);
        }
    }

    private final void loadData(final boolean isRefresh) {
        if (isRefresh) {
            LiveEventBus.get("TOPIC_CREATE_CHECK").post(Boolean.TRUE);
        }
        getVm().loadFollowingTopic(isRefresh).observe(this, new Observer() { // from class: o0oOoOoO.a2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MainMomentsTopicFollowingFragment.m354loadData$lambda7(isRefresh, this, (Response) obj);
            }
        });
    }

    public static /* synthetic */ void loadData$default(MainMomentsTopicFollowingFragment mainMomentsTopicFollowingFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        mainMomentsTopicFollowingFragment.loadData(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData$lambda-7, reason: not valid java name */
    public static final void m354loadData$lambda7(boolean z, MainMomentsTopicFollowingFragment this$0, Response response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO = null;
        if (response.getIsSuccess()) {
            if (z) {
                p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO2 = this$0.baseAdapter;
                if (oooO0OO2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                    oooO0OO2 = null;
                }
                oooO0OO2.setNewData((List) response.getData());
            } else {
                ArrayList arrayList = (ArrayList) response.getData();
                if (arrayList != null) {
                    p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO3 = this$0.baseAdapter;
                    if (oooO0OO3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                        oooO0OO3 = null;
                    }
                    oooO0OO3.addData(arrayList);
                }
            }
        }
        XRefreshLayout xRefreshLayout = this$0.getBinding().f50788OooO0OO;
        boolean isSuccess = response.getIsSuccess();
        Collection collection = (Collection) response.getData();
        xRefreshLayout.Oooo0o0(z, isSuccess, collection == null || collection.isEmpty());
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO4 = this$0.baseAdapter;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
        } else {
            oooO0OO = oooO0OO4;
        }
        oooO0OO.setLoadComplete(response.getIsSuccess());
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
        loadData$default(this, false, 1, null);
        initObserver();
        getVm().statisticalTime();
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.android.billingclient.api.o00000O.OooO0O0().OooOOOO(2);
    }

    @Override // p503o0o00o00.OooO
    public void scrollTopRefresh() {
        try {
            getBinding().f50788OooO0OO.Oooo00o();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public v8 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        v8 v8VarInflate = v8.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(v8VarInflate, "inflate(inflater)");
        return v8VarInflate;
    }
}
