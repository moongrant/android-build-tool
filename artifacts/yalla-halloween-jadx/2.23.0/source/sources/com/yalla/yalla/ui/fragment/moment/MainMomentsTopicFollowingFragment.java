package com.yalla.yalla.ui.fragment.moment;

import android.content.Context;
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
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.message.oOO00O;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment;
import com.yalla.yalla.ui.fragment.moment.o0OOO0o;
import com.yalla.yalla.ui.view.TopicFollowingCreateTopicView;
import com.yalla.yalla.ui.view.TopicFollowingEmptyView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p564o0oOo0OO.o000O;
import p579o0oOoo.oO0OOO00;
import p584o0oOooO0.oO00OO0O;
import p641o0ooOOOO.i2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0014J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/yalla/yalla/ui/fragment/moment/MainMomentsTopicFollowingFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/i2;", "", "initObserver", "initView", "", "isRefresh", "loadData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onDestroy", "onResume", "scrollTopRefresh", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "vm", "Lo0oOo0OO/o000O;", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "baseAdapter$delegate", "getBaseAdapter", "()Lo0oOo0OO/o000O;", "baseAdapter", "Lcom/yalla/yalla/ui/view/TopicFollowingCreateTopicView;", "viewHeader$delegate", "getViewHeader", "()Lcom/yalla/yalla/ui/view/TopicFollowingCreateTopicView;", "viewHeader", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainMomentsTopicFollowingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentsTopicFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicFollowingFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,219:1\n106#2,15:220\n*S KotlinDebug\n*F\n+ 1 MainMomentsTopicFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicFollowingFragment\n*L\n50#1:220,15\n*E\n"})
public final class MainMomentsTopicFollowingFragment extends p508o0o0O.OooOO0O<i2> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: baseAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy baseAdapter;

    /* JADX INFO: renamed from: viewHeader$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewHeader;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28666OooO0Oo;

        public OooO(OooO0o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28666OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28666OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28666OooO0Oo;
        }

        public final int hashCode() {
            return this.f28666OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28666OooO0Oo.invoke(obj);
        }
    }

    @SourceDebugExtension({"SMAP\nMainMomentsTopicFollowingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentsTopicFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicFollowingFragment$baseAdapter$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
    public static final class OooO00o extends Lambda implements Function0<o0OOO0o> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OOO0o invoke() {
            final MainMomentsTopicFollowingFragment mainMomentsTopicFollowingFragment = MainMomentsTopicFollowingFragment.this;
            final o0OOO0o o0ooo0o2 = new o0OOO0o(mainMomentsTopicFollowingFragment, mainMomentsTopicFollowingFragment.getContext(), oO00OO0O.item_topic_follow);
            o0ooo0o2.f10098OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0o0OO0O.o00OO
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
                public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                    o0OOO0o this_apply = o0ooo0o2;
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    MainMomentsTopicFollowingFragment this$0 = mainMomentsTopicFollowingFragment;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Context context = this_apply.f56196OooOo;
                    if (context != null) {
                        int i2 = TopicDetailActivity.f26305OooOoOO;
                        Object obj = this$0.getBaseAdapter().f10111OooOOoo.get(i);
                        Intrinsics.checkNotNullExpressionValue(obj, "baseAdapter.data[position]");
                        TopicDetailActivity.OooO00o.OooO00o(context, (TopicInfoModel) obj);
                    }
                }
            };
            Context contextRequireContext = mainMomentsTopicFollowingFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            TopicFollowingEmptyView topicFollowingEmptyView = new TopicFollowingEmptyView(contextRequireContext, null, 6, 0);
            topicFollowingEmptyView.setButtonListener(o0Oo0oo.f28883OooO0Oo);
            o0ooo0o2.OooOo0(topicFollowingEmptyView);
            o0ooo0o2.OooOo(mainMomentsTopicFollowingFragment.getViewHeader());
            return o0ooo0o2;
        }
    }

    public static final class OooO0O0 implements Observer<Object> {
        public OooO0O0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            MainMomentsTopicFollowingFragment mainMomentsTopicFollowingFragment = MainMomentsTopicFollowingFragment.this;
            if (mainMomentsTopicFollowingFragment.getIsLazyInit()) {
                mainMomentsTopicFollowingFragment.loadData(true);
            }
        }
    }

    public static final class OooO0OO implements Observer<Boolean> {
        public OooO0OO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            Boolean it = bool;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            boolean zBooleanValue = it.booleanValue();
            MainMomentsTopicFollowingFragment mainMomentsTopicFollowingFragment = MainMomentsTopicFollowingFragment.this;
            if (zBooleanValue) {
                mainMomentsTopicFollowingFragment.getBaseAdapter().OooOo(mainMomentsTopicFollowingFragment.getViewHeader());
                return;
            }
            int i = 0;
            if (mainMomentsTopicFollowingFragment.getViewHeader().getParent() != null) {
                o000O baseAdapter = mainMomentsTopicFollowingFragment.getBaseAdapter();
                TopicFollowingCreateTopicView viewHeader = mainMomentsTopicFollowingFragment.getViewHeader();
                if (baseAdapter.OooOOO0() == 0) {
                    return;
                }
                baseAdapter.f10102OooOO0.removeView(viewHeader);
                if (baseAdapter.f10102OooOO0.getChildCount() == 0) {
                    if (baseAdapter.OooOO0() == 1 && !baseAdapter.f10105OooOOO) {
                        i = -1;
                    }
                    if (i != -1) {
                        baseAdapter.notifyItemRemoved(i);
                    }
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nMainMomentsTopicFollowingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentsTopicFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicFollowingFragment$loadData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
    public static final class OooO0o extends Lambda implements Function1<Response<ArrayList<TopicInfoModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f28670OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainMomentsTopicFollowingFragment f28671OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MainMomentsTopicFollowingFragment mainMomentsTopicFollowingFragment, boolean z) {
            super(1);
            this.f28670OooO0Oo = z;
            this.f28671OooO0o0 = mainMomentsTopicFollowingFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<ArrayList<TopicInfoModel>> response) {
            Response<ArrayList<TopicInfoModel>> response2 = response;
            boolean isSuccess = response2.getIsSuccess();
            boolean z = this.f28670OooO0Oo;
            MainMomentsTopicFollowingFragment mainMomentsTopicFollowingFragment = this.f28671OooO0o0;
            if (isSuccess) {
                if (z) {
                    mainMomentsTopicFollowingFragment.getBaseAdapter().OooOoO0(response2.getData());
                } else {
                    ArrayList<TopicInfoModel> data = response2.getData();
                    if (data != null) {
                        mainMomentsTopicFollowingFragment.getBaseAdapter().OooO0O0(data);
                    }
                }
            }
            XRefreshLayout xRefreshLayout = mainMomentsTopicFollowingFragment.getBinding().f58101OooO0OO;
            boolean isSuccess2 = response2.getIsSuccess();
            ArrayList<TopicInfoModel> data2 = response2.getData();
            xRefreshLayout.OooOooo(z, isSuccess2, data2 == null || data2.isEmpty());
            mainMomentsTopicFollowingFragment.getBaseAdapter().Oooo0O0(response2.getIsSuccess());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<TopicFollowingCreateTopicView> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TopicFollowingCreateTopicView invoke() {
            Context contextRequireContext = MainMomentsTopicFollowingFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            TopicFollowingCreateTopicView topicFollowingCreateTopicView = new TopicFollowingCreateTopicView(contextRequireContext, null, 6, 0);
            topicFollowingCreateTopicView.setButtonListener(o0OO00O.f28881OooO0Oo);
            return topicFollowingCreateTopicView;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment$special$$inlined$viewModels$default$1] */
    public MainMomentsTopicFollowingFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(BaseMomentDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28676OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28676OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment$special$$inlined$viewModels$default$5
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
        this.viewHeader = LazyKt.lazy(new OooOO0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o000O<TopicInfoModel> getBaseAdapter() {
        return (o000O) this.baseAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TopicFollowingCreateTopicView getViewHeader() {
        return (TopicFollowingCreateTopicView) this.viewHeader.getValue();
    }

    private final BaseMomentDetailVM getVm() {
        return (BaseMomentDetailVM) this.vm.getValue();
    }

    private final void initObserver() {
        LiveEventBus.get("TOPIC_TO_CREATED").observe(this, new OooO0O0());
        LiveEventBus.get("TOPIC_CREATE_VIEW_VISIBLE", Boolean.TYPE).observe(this, new OooO0OO());
    }

    private final void initView() {
        getBinding().f58101OooO0OO.setOnRefreshListener(new oOO00O(this));
        getBinding().f58101OooO0OO.setOnLoadMoreListener(new com.google.firebase.messaging.o0ooOOo(this));
        getBinding().f58100OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f58100OooO0O0.setAdapter(getBaseAdapter());
        oO0OOO00 oo0ooo00 = oO0OOO00.f56606OooO00o;
        RecyclerView recyclerView = getBinding().f58100OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvMomentJoin");
        oO0OOO00.OooO0O0(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(MainMomentsTopicFollowingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(MainMomentsTopicFollowingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData(boolean isRefresh) {
        if (isRefresh) {
            LiveEventBus.get("TOPIC_CREATE_CHECK").post(Boolean.TRUE);
        }
        getVm().loadFollowingTopic(isRefresh).observe(this, new OooO(new OooO0o(this, isRefresh)));
    }

    public static /* synthetic */ void loadData$default(MainMomentsTopicFollowingFragment mainMomentsTopicFollowingFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        mainMomentsTopicFollowingFragment.loadData(z);
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
        com.android.billingclient.api.o0000OO0.OooO0O0().OooOO0(2);
    }

    @Override // p508o0o0O.OooOO0O
    public void scrollTopRefresh() {
        try {
            getBinding().f58101OooO0OO.OooOoOO();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public i2 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        i2 i2VarInflate = i2.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(i2VarInflate, "inflate(inflater)");
        return i2VarInflate;
    }
}
