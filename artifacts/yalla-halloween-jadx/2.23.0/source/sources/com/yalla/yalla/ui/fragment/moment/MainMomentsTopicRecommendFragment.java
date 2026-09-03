package com.yalla.yalla.ui.fragment.moment;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.OooO0O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.FollowTopicModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.topic.TopicFollowChange;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicRecommendFragment;
import com.yalla.yalla.ui.fragment.moment.o000000O;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.vm.moment.MomentTopicVM;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p200o00o0o.o00;
import p564o0oOo0OO.o000O;
import p579o0oOoo.oO0OOO00;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.k2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/yalla/yalla/ui/fragment/moment/MainMomentsTopicRecommendFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/k2;", "", "initObserver", "initView", "", "position", "joinTopic", "", "isRefresh", "loadData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onDestroy", "onResume", "scrollTopRefresh", "Lcom/yalla/yalla/ui/vm/moment/MomentTopicVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/MomentTopicVM;", "vm", "Lo0oOo0OO/o000O;", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "baseAdapter$delegate", "getBaseAdapter", "()Lo0oOo0OO/o000O;", "baseAdapter", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainMomentsTopicRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentsTopicRecommendFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicRecommendFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,172:1\n106#2,15:173\n*S KotlinDebug\n*F\n+ 1 MainMomentsTopicRecommendFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicRecommendFragment\n*L\n39#1:173,15\n*E\n"})
public final class MainMomentsTopicRecommendFragment extends p508o0o0O.OooOO0O<k2> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: baseAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy baseAdapter;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO extends Lambda implements Function1<ApiResult<List<TopicInfoModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28697OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z) {
            super(1);
            this.f28697OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<TopicInfoModel>> apiResult) {
            ApiResult<List<TopicInfoModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MainMomentsTopicRecommendFragment mainMomentsTopicRecommendFragment = MainMomentsTopicRecommendFragment.this;
            XRefreshLayout xRefreshLayout = mainMomentsTopicRecommendFragment.getBinding().f58245OooO0OO;
            boolean zIsSuccess = it.isSuccess();
            List<TopicInfoModel> data = it.getData();
            boolean z = data == null || data.isEmpty();
            boolean z2 = this.f28697OooO0o0;
            xRefreshLayout.OooOooo(z2, zIsSuccess, z);
            o000O baseAdapter = mainMomentsTopicRecommendFragment.getBaseAdapter();
            Boolean boolValueOf = Boolean.valueOf(z2);
            Boolean boolValueOf2 = Boolean.valueOf(it.isSuccess());
            List<TopicInfoModel> data2 = it.getData();
            baseAdapter.Oooo0(boolValueOf, boolValueOf2, Boolean.valueOf(data2 == null || data2.isEmpty()));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMainMomentsTopicRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentsTopicRecommendFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicRecommendFragment$baseAdapter$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
    public static final class OooO00o extends Lambda implements Function0<o000000> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000000 invoke() {
            final MainMomentsTopicRecommendFragment mainMomentsTopicRecommendFragment = MainMomentsTopicRecommendFragment.this;
            o000000 o000000Var = new o000000(mainMomentsTopicRecommendFragment.getContext(), oO00OO0O.item_topic_recommend);
            o000000Var.f10098OooO0o = new o00(o000000Var);
            o000000Var.f10101OooO0oo = new BaseQuickAdapter.OooO0O0() { // from class: o0o0OO0O.o00OOOO0
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
                public final void OooO0OO(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                    MainMomentsTopicRecommendFragment this$0 = mainMomentsTopicRecommendFragment;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    o000000O onLogin = new o000000O(this$0, i);
                    Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                    p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                    if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                        onLogin.invoke();
                        return;
                    }
                    Activity activityOooO0O0 = OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i2 = LoginActivity.f25186OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            };
            o000000Var.OooOooo(oOo00OO0.ic_empty_message_system);
            o000000Var.Oooo000(oO00OOo0.no_recommend_topic);
            o000000Var.Oooo0OO(new o00000(mainMomentsTopicRecommendFragment));
            return o000000Var;
        }
    }

    @SourceDebugExtension({"SMAP\nMainMomentsTopicRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentsTopicRecommendFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicRecommendFragment$initObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,172:1\n1864#2,3:173\n*S KotlinDebug\n*F\n+ 1 MainMomentsTopicRecommendFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicRecommendFragment$initObserver$1\n*L\n46#1:173,3\n*E\n"})
    public static final class OooO0O0 implements Observer<TopicFollowChange> {
        public OooO0O0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(TopicFollowChange topicFollowChange) {
            TopicFollowChange topicFollowChange2 = topicFollowChange;
            MainMomentsTopicRecommendFragment mainMomentsTopicRecommendFragment = MainMomentsTopicRecommendFragment.this;
            List<T> list = mainMomentsTopicRecommendFragment.getBaseAdapter().f10111OooOOoo;
            Intrinsics.checkNotNullExpressionValue(list, "baseAdapter.data");
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                TopicInfoModel topicInfoModel = (TopicInfoModel) obj;
                if (topicInfoModel.getId() == topicFollowChange2.getTopicId()) {
                    topicInfoModel.setJoin(topicFollowChange2.getFollow() ? 1 : 0);
                    mainMomentsTopicRecommendFragment.getBaseAdapter().notifyItemChanged(i);
                    return;
                }
                i = i2;
            }
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<FollowTopicModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ TopicInfoModel f28700OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28701OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainMomentsTopicRecommendFragment f28702OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(TopicInfoModel topicInfoModel, MainMomentsTopicRecommendFragment mainMomentsTopicRecommendFragment, int i) {
            super(1);
            this.f28700OooO0Oo = topicInfoModel;
            this.f28702OooO0o0 = mainMomentsTopicRecommendFragment;
            this.f28701OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FollowTopicModel followTopicModel) {
            this.f28700OooO0Oo.setJoin(1);
            this.f28702OooO0o0.getBaseAdapter().notifyItemChanged(this.f28701OooO0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<List<TopicInfoModel>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f28703OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainMomentsTopicRecommendFragment f28704OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MainMomentsTopicRecommendFragment mainMomentsTopicRecommendFragment, boolean z) {
            super(1);
            this.f28703OooO0Oo = z;
            this.f28704OooO0o0 = mainMomentsTopicRecommendFragment;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<TopicInfoModel> list) {
            List<TopicInfoModel> list2 = list;
            if (list2 != null) {
                boolean z = this.f28703OooO0Oo;
                MainMomentsTopicRecommendFragment mainMomentsTopicRecommendFragment = this.f28704OooO0o0;
                if (z) {
                    mainMomentsTopicRecommendFragment.getBaseAdapter().f10111OooOOoo.addAll(0, list2);
                    mainMomentsTopicRecommendFragment.getBaseAdapter().notifyDataSetChanged();
                    mainMomentsTopicRecommendFragment.getBinding().f58244OooO0O0.scrollToPosition(0);
                } else {
                    mainMomentsTopicRecommendFragment.getBaseAdapter().OooO0O0(list2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.moment.MainMomentsTopicRecommendFragment$special$$inlined$viewModels$default$1] */
    public MainMomentsTopicRecommendFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicRecommendFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicRecommendFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentTopicVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicRecommendFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicRecommendFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28708OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28708OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicRecommendFragment$special$$inlined$viewModels$default$5
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
        this.baseAdapter = LazyKt.lazy(new OooO00o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o000O<TopicInfoModel> getBaseAdapter() {
        return (o000O) this.baseAdapter.getValue();
    }

    private final MomentTopicVM getVm() {
        return (MomentTopicVM) this.vm.getValue();
    }

    private final void initObserver() {
        LiveEventBus.get("TOPIC_FOLLOW_CHANGE", TopicFollowChange.class).observe(this, new OooO0O0());
    }

    private final void initView() {
        getBinding().f58245OooO0OO.setOnRefreshListener(new p562o0oOo0O.o000oOoO() { // from class: o0o0OO0O.o00OOO0O
            @Override // p562o0oOo0O.o000oOoO
            public final void OooO0O0() {
                MainMomentsTopicRecommendFragment.initView$lambda$0(this.f53456OooO0Oo);
            }
        });
        getBinding().f58245OooO0OO.setOnLoadMoreListener(new p562o0oOo0O.o000oOoO() { // from class: o0o0OO0O.o0o0Oo
            @Override // p562o0oOo0O.o000oOoO
            public final void OooO0O0() {
                MainMomentsTopicRecommendFragment.initView$lambda$1(this.f53458OooO0Oo);
            }
        });
        getBinding().f58244OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f58244OooO0O0.setAdapter(getBaseAdapter());
        oO0OOO00 oo0ooo00 = oO0OOO00.f56606OooO00o;
        RecyclerView recyclerView = getBinding().f58244OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvMomentRecommend");
        oO0OOO00.OooO0O0(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(MainMomentsTopicRecommendFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(MainMomentsTopicRecommendFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void joinTopic(int position) {
        TopicInfoModel topicInfoModel = getBaseAdapter().f10111OooOOoo.get(position);
        getVm().circleJoin(topicInfoModel.getId(), true).observe(getViewLifecycleOwner(), new p377o0OOoOo.o0000OO0(new OooO0OO(topicInfoModel, this, position), null, null, false, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData(boolean isRefresh) {
        getVm().circleRecommendList(isRefresh, 0L).observe(getViewLifecycleOwner(), new p377o0OOoOo.o0000OO0(new OooO0o(this, isRefresh), null, new OooO(isRefresh), false, 10));
    }

    public static /* synthetic */ void loadData$default(MainMomentsTopicRecommendFragment mainMomentsTopicRecommendFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        mainMomentsTopicRecommendFragment.loadData(z);
    }

    @Override // p508o0o0O.OooOO0O, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getVm().statisticalTime();
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        loadData$default(this, false, 1, null);
        initObserver();
        getVm().statisticalTime();
    }

    @Override // p508o0o0O.OooOO0O, p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.android.billingclient.api.o0000OO0.OooO0O0().OooOO0(3);
    }

    @Override // p508o0o0O.OooOO0O
    public void scrollTopRefresh() {
        try {
            getBinding().f58245OooO0OO.OooOoOO();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public k2 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        k2 k2VarInflate = k2.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(k2VarInflate, "inflate(inflater)");
        return k2VarInflate;
    }
}
