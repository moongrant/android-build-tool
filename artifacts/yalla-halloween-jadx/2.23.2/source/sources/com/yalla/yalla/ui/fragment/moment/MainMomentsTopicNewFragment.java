package com.yalla.yalla.ui.fragment.moment;

import android.app.Activity;
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
import androidx.media3.session.o000O0O0;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.OooO0O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.FollowTopicModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.topic.TopicFollowChange;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicNewFragment;
import com.yalla.yalla.ui.fragment.moment.oo0o0Oo;
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
import p269o00oooo0.o0O0oo0o;
import p405o0Oo0OOO.o0O0o000;
import p475o0Ooooo0.o0O00oO0;
import p527o0o0OO0o.o000O;
import p590o0oOooo0.oo000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/yalla/yalla/ui/fragment/moment/MainMomentsTopicNewFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/o0O0o000;", "", "initObserver", "initView", "", "position", "joinTopic", "", "isRefresh", "loadData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onDestroy", "onResume", "scrollTopRefresh", "Lcom/yalla/yalla/ui/vm/moment/MomentTopicVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/MomentTopicVM;", "vm", "Lo0oOoO0/o0000oo;", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "baseAdapter$delegate", "getBaseAdapter", "()Lo0oOoO0/o0000oo;", "baseAdapter", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMainMomentsTopicNewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentsTopicNewFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicNewFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,172:1\n106#2,15:173\n1864#3,3:188\n*S KotlinDebug\n*F\n+ 1 MainMomentsTopicNewFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicNewFragment\n*L\n39#1:173,15\n46#1:188,3\n*E\n"})
public final class MainMomentsTopicNewFragment extends o000O<o0O0o000> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: baseAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy baseAdapter;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    @SourceDebugExtension({"SMAP\nMainMomentsTopicNewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentsTopicNewFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentsTopicNewFragment$baseAdapter$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
    public static final class OooO00o extends Lambda implements Function0<o0OO00O> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OO00O invoke() {
            final MainMomentsTopicNewFragment mainMomentsTopicNewFragment = MainMomentsTopicNewFragment.this;
            o0OO00O o0oo00o2 = new o0OO00O(mainMomentsTopicNewFragment.getContext(), p562o0oOo000.oo0o0Oo.item_topic_recommend);
            o0oo00o2.f13176OooO0o = new androidx.media3.session.o000O(o0oo00o2);
            o0oo00o2.f13179OooO0oo = new BaseQuickAdapter.OooO0O0() { // from class: o0o0OOO.o0O0ooO
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
                public final void OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                    MainMomentsTopicNewFragment this$0 = mainMomentsTopicNewFragment;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    oo0o0Oo onLogin = new oo0o0Oo(this$0, i);
                    Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                        onLogin.invoke();
                        return;
                    }
                    Activity activityOooO0O0 = OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i2 = LoginActivity.f24727OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            };
            o0oo00o2.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_message_system);
            o0oo00o2.Oooo000(p562o0oOo000.o000000.no_recommend_topic);
            o0oo00o2.Oooo0OO(new o0O0O00(mainMomentsTopicNewFragment));
            return o0oo00o2;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<FollowTopicModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ TopicInfoModel f28160OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28161OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainMomentsTopicNewFragment f28162OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(TopicInfoModel topicInfoModel, MainMomentsTopicNewFragment mainMomentsTopicNewFragment, int i) {
            super(1);
            this.f28160OooO0Oo = topicInfoModel;
            this.f28162OooO0o0 = mainMomentsTopicNewFragment;
            this.f28161OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FollowTopicModel followTopicModel) {
            this.f28160OooO0Oo.setJoin(1);
            this.f28162OooO0o0.getBaseAdapter().notifyItemChanged(this.f28161OooO0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<List<TopicInfoModel>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f28163OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainMomentsTopicNewFragment f28164OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MainMomentsTopicNewFragment mainMomentsTopicNewFragment, boolean z) {
            super(1);
            this.f28163OooO0Oo = z;
            this.f28164OooO0o0 = mainMomentsTopicNewFragment;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<TopicInfoModel> list) {
            List<TopicInfoModel> list2 = list;
            if (list2 != null) {
                boolean z = this.f28163OooO0Oo;
                MainMomentsTopicNewFragment mainMomentsTopicNewFragment = this.f28164OooO0o0;
                if (z) {
                    mainMomentsTopicNewFragment.getBaseAdapter().f13189OooOOoo.addAll(0, list2);
                    mainMomentsTopicNewFragment.getBaseAdapter().notifyDataSetChanged();
                    mainMomentsTopicNewFragment.getBinding().f44534OooO0O0.scrollToPosition(0);
                } else {
                    mainMomentsTopicNewFragment.getBaseAdapter().OooO0O0(list2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiResult<List<TopicInfoModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28166OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f28166OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<TopicInfoModel>> apiResult) {
            ApiResult<List<TopicInfoModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MainMomentsTopicNewFragment mainMomentsTopicNewFragment = MainMomentsTopicNewFragment.this;
            XRefreshLayout xRefreshLayout = mainMomentsTopicNewFragment.getBinding().f44535OooO0OO;
            boolean zIsSuccess = it.isSuccess();
            List<TopicInfoModel> data = it.getData();
            boolean z = data == null || data.isEmpty();
            boolean z2 = this.f28166OooO0o0;
            xRefreshLayout.OooOooo(z2, zIsSuccess, z);
            p571o0oOoO0.o0000oo baseAdapter = mainMomentsTopicNewFragment.getBaseAdapter();
            Boolean boolValueOf = Boolean.valueOf(z2);
            Boolean boolValueOf2 = Boolean.valueOf(it.isSuccess());
            List<TopicInfoModel> data2 = it.getData();
            baseAdapter.Oooo0(boolValueOf, boolValueOf2, Boolean.valueOf(data2 == null || data2.isEmpty()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.moment.MainMomentsTopicNewFragment$special$$inlined$viewModels$default$1] */
    public MainMomentsTopicNewFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicNewFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicNewFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentTopicVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicNewFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000Oo0.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicNewFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28170OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28170OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentsTopicNewFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy);
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
    public final p571o0oOoO0.o0000oo<TopicInfoModel> getBaseAdapter() {
        return (p571o0oOoO0.o0000oo) this.baseAdapter.getValue();
    }

    private final MomentTopicVM getVm() {
        return (MomentTopicVM) this.vm.getValue();
    }

    private final void initObserver() {
        LiveEventBus.get("TOPIC_FOLLOW_CHANGE", TopicFollowChange.class).observe(this, new p433o0OoOOO0.o0000O00(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$1(MainMomentsTopicNewFragment this$0, TopicFollowChange topicFollowChange) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<TopicInfoModel> list = this$0.getBaseAdapter().f13189OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TopicInfoModel topicInfoModel = (TopicInfoModel) obj;
            if (topicInfoModel.getId() == topicFollowChange.getTopicId()) {
                topicInfoModel.setJoin(topicFollowChange.getFollow() ? 1 : 0);
                this$0.getBaseAdapter().notifyItemChanged(i);
                return;
            }
            i = i2;
        }
    }

    private final void initView() {
        getBinding().f44535OooO0OO.setOnRefreshListener(new p559o0oOo.o00O0O() { // from class: o0o0OOO.o00O0000
            @Override // p559o0oOo.o00O0O
            public final void OooO0OO() {
                MainMomentsTopicNewFragment.initView$lambda$2(this.f53359OooO0Oo);
            }
        });
        getBinding().f44535OooO0OO.setOnLoadMoreListener(new o000O0O0(this));
        getBinding().f44534OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f44534OooO0O0.setAdapter(getBaseAdapter());
        oo000000 oo000000Var = oo000000.f57240OooO00o;
        RecyclerView rvMomentRecommend = getBinding().f44534OooO0O0;
        Intrinsics.checkNotNullExpressionValue(rvMomentRecommend, "rvMomentRecommend");
        oo000000.OooO0O0(rvMomentRecommend);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(MainMomentsTopicNewFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(MainMomentsTopicNewFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void joinTopic(int position) {
        TopicInfoModel topicInfoModel = getBaseAdapter().f13189OooOOoo.get(position);
        getVm().circleJoin(topicInfoModel.getId(), true).observe(getViewLifecycleOwner(), new p384o0OOoo0O.o000oOoO(new OooO0O0(topicInfoModel, this, position), null, null, false, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData(boolean isRefresh) {
        getVm().circleNewList(isRefresh).observe(getViewLifecycleOwner(), new p384o0OOoo0O.o000oOoO(new OooO0OO(this, isRefresh), null, new OooO0o(isRefresh), false, 10));
    }

    public static /* synthetic */ void loadData$default(MainMomentsTopicNewFragment mainMomentsTopicNewFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        mainMomentsTopicNewFragment.loadData(z);
    }

    @Override // p527o0o0OO0o.o000O, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getVm().statisticalTime();
    }

    @Override // p586o0oOooO0.oO0Oo0o0
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        loadData$default(this, false, 1, null);
        initObserver();
        getVm().statisticalTime();
    }

    @Override // p527o0o0OO0o.o000O, p586o0oOooO0.oO0Oo0o0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0O0oo0o.OooO00o().OooOO0(3);
    }

    @Override // p527o0o0OO0o.o000O
    public void scrollTopRefresh() {
        try {
            getBinding().f44535OooO0OO.OooOoOO();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public o0O0o000 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o0O0o000 o0o0o000Inflate = o0O0o000.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(o0o0o000Inflate, "inflate(...)");
        return o0o0o000Inflate;
    }
}
