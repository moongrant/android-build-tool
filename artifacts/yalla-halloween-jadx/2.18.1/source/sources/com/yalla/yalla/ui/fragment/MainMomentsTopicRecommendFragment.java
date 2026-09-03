package com.yalla.yalla.ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.FollowTopicModel;
import com.yalla.yalla.model.TopicFollowChange;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.view.TopicFollowPostNumberView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.MomentTopicVM;
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
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p391o0OOooOo.o0O00000;
import p522o0o0O0o.o0O0ooO;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.x8;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/yalla/yalla/ui/fragment/MainMomentsTopicRecommendFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/x8;", "", "initObserver", "initView", "", "position", "joinTopic", "", "isRefresh", "loadData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onDestroy", "onResume", "scrollTopRefresh", "Lcom/yalla/yalla/ui/vm/moment/MomentTopicVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/MomentTopicVM;", "vm", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainMomentsTopicRecommendFragment extends p503o0o00o00.OooO<x8> {
    public static final int $stable = 8;
    private p188o00o00o0.OooO0OO<TopicInfoModel> baseAdapter;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO extends Lambda implements Function1<List<TopicInfoModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f23969Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MainMomentsTopicRecommendFragment f23970Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z, MainMomentsTopicRecommendFragment mainMomentsTopicRecommendFragment) {
            super(1);
            this.f23969Oooo0o = z;
            this.f23970Oooo0oO = mainMomentsTopicRecommendFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<TopicInfoModel> list) {
            List<TopicInfoModel> list2 = list;
            if (list2 != null) {
                boolean z = this.f23969Oooo0o;
                MainMomentsTopicRecommendFragment mainMomentsTopicRecommendFragment = this.f23970Oooo0oO;
                p188o00o00o0.OooO0OO oooO0OO = null;
                if (z) {
                    p188o00o00o0.OooO0OO oooO0OO2 = mainMomentsTopicRecommendFragment.baseAdapter;
                    if (oooO0OO2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                        oooO0OO2 = null;
                    }
                    oooO0OO2.getData().addAll(0, list2);
                    p188o00o00o0.OooO0OO oooO0OO3 = mainMomentsTopicRecommendFragment.baseAdapter;
                    if (oooO0OO3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                    } else {
                        oooO0OO = oooO0OO3;
                    }
                    oooO0OO.notifyDataSetChanged();
                    mainMomentsTopicRecommendFragment.getBinding().f50921OooO0O0.scrollToPosition(0);
                } else {
                    p188o00o00o0.OooO0OO oooO0OO4 = mainMomentsTopicRecommendFragment.baseAdapter;
                    if (oooO0OO4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                    } else {
                        oooO0OO = oooO0OO4;
                    }
                    oooO0OO.addData((Collection) list2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends p188o00o00o0.OooO0OO<TopicInfoModel> {
        public OooO00o(Context context) {
            super(context, R.layout.item_topic_recommend);
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
            String describe = topicInfoModel.getDescribe();
            if (describe == null || StringsKt.isBlank(describe)) {
                helper.OooO(R.id.tvDesc, R.string.topic_description_hint);
            } else {
                helper.OooOO0(R.id.tvDesc, topicInfoModel.getDescribe());
            }
            ((TopicFollowPostNumberView) helper.OooO0Oo(R.id.numberView)).OooO00o(topicInfoModel.getJoinNum(), topicInfoModel.getDyNum(), topicInfoModel.getPropPriceTotal());
            helper.OooO0O0(R.id.btFollow);
            boolean zOooO00o = o0O0ooO.OooO00o(Integer.valueOf(topicInfoModel.getIsJoin()));
            helper.OooO(R.id.btFollow, zOooO00o ? R.string.Following : R.string.Follow);
            View viewOooO0Oo = helper.OooO0Oo(R.id.btFollow);
            boolean z = !zOooO00o;
            viewOooO0Oo.setEnabled(z);
            viewOooO0Oo.setClickable(z);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f23972Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(0);
            this.f23972Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O00000.OooO0OO("Moments_topics_follow");
            MainMomentsTopicRecommendFragment.this.joinTopic(this.f23972Oooo0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends p654o0ooo.o00Oo0 {
        public OooO0OO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@Nullable View view) {
            MainMomentsTopicRecommendFragment.this.loadData(true);
        }
    }

    public static final class OooO0o extends Lambda implements Function1<FollowTopicModel, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ TopicInfoModel f23974Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MainMomentsTopicRecommendFragment f23975Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f23976Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(TopicInfoModel topicInfoModel, MainMomentsTopicRecommendFragment mainMomentsTopicRecommendFragment, int i) {
            super(1);
            this.f23974Oooo0o = topicInfoModel;
            this.f23975Oooo0oO = mainMomentsTopicRecommendFragment;
            this.f23976Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FollowTopicModel followTopicModel) {
            this.f23974Oooo0o.setJoin(1);
            p188o00o00o0.OooO0OO oooO0OO = this.f23975Oooo0oO.baseAdapter;
            if (oooO0OO == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                oooO0OO = null;
            }
            oooO0OO.notifyItemChanged(this.f23976Oooo0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiResult<List<TopicInfoModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f23978Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(boolean z) {
            super(1);
            this.f23978Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<TopicInfoModel>> apiResult) {
            ApiResult<List<TopicInfoModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            XRefreshLayout xRefreshLayout = MainMomentsTopicRecommendFragment.this.getBinding().f50922OooO0OO;
            boolean z = this.f23978Oooo0oO;
            boolean zIsSuccess = it.isSuccess();
            List<TopicInfoModel> data = it.getData();
            boolean z2 = true;
            xRefreshLayout.Oooo0o0(z, zIsSuccess, data == null || data.isEmpty());
            p188o00o00o0.OooO0OO oooO0OO = MainMomentsTopicRecommendFragment.this.baseAdapter;
            if (oooO0OO == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                oooO0OO = null;
            }
            Boolean boolValueOf = Boolean.valueOf(this.f23978Oooo0oO);
            Boolean boolValueOf2 = Boolean.valueOf(it.isSuccess());
            List<TopicInfoModel> data2 = it.getData();
            if (data2 != null && !data2.isEmpty()) {
                z2 = false;
            }
            oooO0OO.setLoadComplete(boolValueOf, boolValueOf2, Boolean.valueOf(z2));
            return Unit.INSTANCE;
        }
    }

    public MainMomentsTopicRecommendFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.MainMomentsTopicRecommendFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.MainMomentsTopicRecommendFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentTopicVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.MainMomentsTopicRecommendFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.MainMomentsTopicRecommendFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f23982Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f23982Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.MainMomentsTopicRecommendFragment$special$$inlined$viewModels$default$5
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
    }

    private final MomentTopicVM getVm() {
        return (MomentTopicVM) this.vm.getValue();
    }

    private final void initObserver() {
        LiveEventBus.get("TOPIC_FOLLOW_CHANGE", TopicFollowChange.class).observe(this, new p142o00OOooO.o00000(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-1, reason: not valid java name */
    public static final void m360initObserver$lambda1(MainMomentsTopicRecommendFragment this$0, TopicFollowChange topicFollowChange) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO = this$0.baseAdapter;
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO = null;
        }
        List<TopicInfoModel> data = oooO0OO.getData();
        Intrinsics.checkNotNullExpressionValue(data, "baseAdapter.data");
        int i = 0;
        for (Object obj : data) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TopicInfoModel topicInfoModel = (TopicInfoModel) obj;
            if (topicInfoModel.getId() == topicFollowChange.getTopicId()) {
                topicInfoModel.setJoin(topicFollowChange.getFollow() ? 1 : 0);
                p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO3 = this$0.baseAdapter;
                if (oooO0OO3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                } else {
                    oooO0OO2 = oooO0OO3;
                }
                oooO0OO2.notifyItemChanged(i);
                return;
            }
            i = i2;
        }
    }

    private final void initView() {
        getBinding().f50922OooO0OO.setOnRefreshListener(new p466o0OooO0.o0000O00(this));
        getBinding().f50922OooO0OO.setOnLoadMoreListener(new p466o0OooO0.o00000O0(this));
        getBinding().f50921OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        OooO00o oooO00o = new OooO00o(getContext());
        this.baseAdapter = oooO00o;
        oooO00o.setOnItemClickListener(new p466o0OooO0.o00000O(this));
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO = this.baseAdapter;
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO = null;
        }
        oooO0OO.setOnItemChildClickListener(new p466o0OooO0.o00000OO(this));
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
        oooO0OO4.setEmptyText(R.string.no_recommend_topic);
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO5 = this.baseAdapter;
        if (oooO0OO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO5 = null;
        }
        oooO0OO5.setLoadErrorClickListener(new OooO0OO());
        RecyclerView recyclerView = getBinding().f50921OooO0O0;
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO6 = this.baseAdapter;
        if (oooO0OO6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
        } else {
            oooO0OO2 = oooO0OO6;
        }
        recyclerView.setAdapter(oooO0OO2);
        p617o0oo0o.o00000OO o00000oo2 = p617o0oo0o.o00000OO.f48476OooO00o;
        RecyclerView recyclerView2 = getBinding().f50921OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.rvMomentRecommend");
        p617o0oo0o.o00000OO.OooO00o(recyclerView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-2, reason: not valid java name */
    public static final void m361initView$lambda2(MainMomentsTopicRecommendFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-3, reason: not valid java name */
    public static final void m362initView$lambda3(MainMomentsTopicRecommendFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-5, reason: not valid java name */
    public static final void m363initView$lambda5(MainMomentsTopicRecommendFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-6, reason: not valid java name */
    public static final void m364initView$lambda6(MainMomentsTopicRecommendFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OooO0O0 onLogin = this$0.new OooO0O0(i);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = p254o00ooO0O.o00000O.f34254OooO00o.OooO0O0();
        if (activityOooO0O0 != null) {
            LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
            o00OO0O0.o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void joinTopic(int position) {
        p188o00o00o0.OooO0OO<TopicInfoModel> oooO0OO = this.baseAdapter;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO = null;
        }
        TopicInfoModel topicInfoModel = oooO0OO.getData().get(position);
        getVm().circleJoin(topicInfoModel.getId(), true).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooO0o(topicInfoModel, this, position), null, null, false, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData(boolean isRefresh) {
        getVm().circleRecommendList(isRefresh, 0L).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooO(isRefresh, this), null, new OooOO0(isRefresh), false, 10));
    }

    public static /* synthetic */ void loadData$default(MainMomentsTopicRecommendFragment mainMomentsTopicRecommendFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        mainMomentsTopicRecommendFragment.loadData(z);
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
        com.android.billingclient.api.o00000O.OooO0O0().OooOOOO(3);
    }

    @Override // p503o0o00o00.OooO
    public void scrollTopRefresh() {
        try {
            getBinding().f50922OooO0OO.Oooo00o();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public x8 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        x8 x8VarInflate = x8.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(x8VarInflate, "inflate(inflater)");
        return x8VarInflate;
    }
}
