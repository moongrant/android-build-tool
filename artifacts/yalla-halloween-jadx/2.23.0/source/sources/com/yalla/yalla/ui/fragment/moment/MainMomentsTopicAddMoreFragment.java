package com.yalla.yalla.ui.fragment.moment;

import android.view.LayoutInflater;
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
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.FollowTopicModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.topic.TopicFollowChange;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.model.topic.TopicTypeTagModel;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicAddMoreFragment;
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
import p029Oooo0oo.o0OO000o;
import p029Oooo0oo.oo0oO0;
import p564o0oOo0OO.o000O;
import p579o0oOoo.oO0OOO00;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.h2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0014\u001a\u00020\u0003H\u0014J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR!\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/yalla/yalla/ui/fragment/moment/MainMomentsTopicAddMoreFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/h2;", "", "initObserver", "initView", "", "position", "joinTopic", "", "isRefresh", "loadData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Lcom/yalla/yalla/model/topic/TopicTypeTagModel;", "topicTypeTagModel", "setData", "onLazyInit", "onDestroy", "onResume", "scrollTopRefresh", "Lcom/yalla/yalla/ui/vm/moment/MomentTopicVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/MomentTopicVM;", "vm", "Lcom/yalla/yalla/model/topic/TopicTypeTagModel;", "Lo0oOo0OO/o000O;", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "baseAdapter$delegate", "getBaseAdapter", "()Lo0oOo0OO/o000O;", "baseAdapter", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainMomentsTopicAddMoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentsTopicAddMoreFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicAddMoreFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,178:1\n106#2,15:179\n*S KotlinDebug\n*F\n+ 1 MainMomentsTopicAddMoreFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicAddMoreFragment\n*L\n40#1:179,15\n*E\n"})
public final class MainMomentsTopicAddMoreFragment extends p508o0o0O.OooOO0O<h2> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: baseAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy baseAdapter;

    @Nullable
    private TopicTypeTagModel topicTypeTagModel;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO extends Lambda implements Function1<ApiResult<List<TopicInfoModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28651OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z) {
            super(1);
            this.f28651OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<TopicInfoModel>> apiResult) {
            ApiResult<List<TopicInfoModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MainMomentsTopicAddMoreFragment mainMomentsTopicAddMoreFragment = MainMomentsTopicAddMoreFragment.this;
            XRefreshLayout xRefreshLayout = mainMomentsTopicAddMoreFragment.getBinding().f58027OooO0OO;
            boolean zIsSuccess = it.isSuccess();
            List<TopicInfoModel> data = it.getData();
            xRefreshLayout.OooOooo(this.f28651OooO0o0, zIsSuccess, data == null || data.isEmpty());
            mainMomentsTopicAddMoreFragment.getBaseAdapter().Oooo0O0(it.isSuccess());
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMainMomentsTopicAddMoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentsTopicAddMoreFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicAddMoreFragment$baseAdapter$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
    public static final class OooO00o extends Lambda implements Function0<oo000o> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oo000o invoke() {
            MainMomentsTopicAddMoreFragment mainMomentsTopicAddMoreFragment = MainMomentsTopicAddMoreFragment.this;
            oo000o oo000oVar = new oo000o(mainMomentsTopicAddMoreFragment.getContext(), oO00OO0O.item_topic_recommend);
            oo000oVar.f10098OooO0o = new oo0oO0(oo000oVar, 4);
            oo000oVar.f10101OooO0oo = new p045Oooooo.o0000O00(mainMomentsTopicAddMoreFragment);
            oo000oVar.OooOooo(oOo00OO0.ic_empty_message_system);
            oo000oVar.Oooo000(oO00OOo0.no_recommend_topic);
            oo000oVar.Oooo0OO(new o0ooOOo(mainMomentsTopicAddMoreFragment));
            return oo000oVar;
        }
    }

    @SourceDebugExtension({"SMAP\nMainMomentsTopicAddMoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentsTopicAddMoreFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicAddMoreFragment$initObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n1864#2,3:179\n*S KotlinDebug\n*F\n+ 1 MainMomentsTopicAddMoreFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicAddMoreFragment$initObserver$1\n*L\n100#1:179,3\n*E\n"})
    public static final class OooO0O0 implements Observer<TopicFollowChange> {
        public OooO0O0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(TopicFollowChange topicFollowChange) {
            TopicFollowChange topicFollowChange2 = topicFollowChange;
            MainMomentsTopicAddMoreFragment mainMomentsTopicAddMoreFragment = MainMomentsTopicAddMoreFragment.this;
            List<T> list = mainMomentsTopicAddMoreFragment.getBaseAdapter().f10111OooOOoo;
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
                    mainMomentsTopicAddMoreFragment.getBaseAdapter().notifyItemChanged(i);
                    return;
                }
                i = i2;
            }
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<FollowTopicModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ TopicInfoModel f28654OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28655OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainMomentsTopicAddMoreFragment f28656OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(TopicInfoModel topicInfoModel, MainMomentsTopicAddMoreFragment mainMomentsTopicAddMoreFragment, int i) {
            super(1);
            this.f28654OooO0Oo = topicInfoModel;
            this.f28656OooO0o0 = mainMomentsTopicAddMoreFragment;
            this.f28655OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FollowTopicModel followTopicModel) {
            this.f28654OooO0Oo.setJoin(1);
            this.f28656OooO0o0.getBaseAdapter().notifyItemChanged(this.f28655OooO0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<List<TopicInfoModel>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f28657OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainMomentsTopicAddMoreFragment f28658OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MainMomentsTopicAddMoreFragment mainMomentsTopicAddMoreFragment, boolean z) {
            super(1);
            this.f28657OooO0Oo = z;
            this.f28658OooO0o0 = mainMomentsTopicAddMoreFragment;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<TopicInfoModel> list) {
            List<TopicInfoModel> list2 = list;
            if (list2 != null) {
                boolean z = this.f28657OooO0Oo;
                MainMomentsTopicAddMoreFragment mainMomentsTopicAddMoreFragment = this.f28658OooO0o0;
                if (z) {
                    o000O baseAdapter = mainMomentsTopicAddMoreFragment.getBaseAdapter();
                    baseAdapter.f10111OooOOoo.addAll(0, list2);
                    baseAdapter.notifyItemRangeInserted(baseAdapter.OooOOO0() + 0, list2.size());
                    baseAdapter.OooO0o(list2.size());
                    mainMomentsTopicAddMoreFragment.getBinding().f58026OooO0O0.scrollToPosition(0);
                } else {
                    mainMomentsTopicAddMoreFragment.getBaseAdapter().OooO0O0(list2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.moment.MainMomentsTopicAddMoreFragment$special$$inlined$viewModels$default$1] */
    public MainMomentsTopicAddMoreFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicAddMoreFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicAddMoreFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentTopicVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicAddMoreFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicAddMoreFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28662OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28662OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicAddMoreFragment$special$$inlined$viewModels$default$5
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
        getBinding().f58027OooO0OO.setOnRefreshListener(new p562o0oOo0O.o000oOoO() { // from class: o0o0OO0O.oo0O
            @Override // p562o0oOo0O.o000oOoO
            public final void OooO0O0() {
                MainMomentsTopicAddMoreFragment.initView$lambda$0(this.f53459OooO0Oo);
            }
        });
        getBinding().f58027OooO0OO.setOnLoadMoreListener(new o0OO000o(this, 2));
        getBinding().f58026OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f58026OooO0O0.setAdapter(getBaseAdapter());
        oO0OOO00 oo0ooo00 = oO0OOO00.f56606OooO00o;
        RecyclerView recyclerView = getBinding().f58026OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
        oO0OOO00.OooO0O0(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(MainMomentsTopicAddMoreFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(MainMomentsTopicAddMoreFragment this$0) {
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
        TopicTypeTagModel topicTypeTagModel = this.topicTypeTagModel;
        if (topicTypeTagModel != null) {
            getVm().circleOtherTypeList(isRefresh, topicTypeTagModel.getId()).observe(getViewLifecycleOwner(), new p377o0OOoOo.o0000OO0(new OooO0o(this, isRefresh), null, new OooO(isRefresh), false, 10));
        }
    }

    public static /* synthetic */ void loadData$default(MainMomentsTopicAddMoreFragment mainMomentsTopicAddMoreFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        mainMomentsTopicAddMoreFragment.loadData(z);
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
        getBinding().f58027OooO0OO.OooOoOO();
    }

    @NotNull
    public final MainMomentsTopicAddMoreFragment setData(@NotNull TopicTypeTagModel topicTypeTagModel) {
        Intrinsics.checkNotNullParameter(topicTypeTagModel, "topicTypeTagModel");
        this.topicTypeTagModel = topicTypeTagModel;
        return this;
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public h2 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        h2 h2VarInflate = h2.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(h2VarInflate, "inflate(inflater)");
        return h2VarInflate;
    }
}
