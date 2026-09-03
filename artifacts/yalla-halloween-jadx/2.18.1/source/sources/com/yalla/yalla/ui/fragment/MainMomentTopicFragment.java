package com.yalla.yalla.ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import com.app.base.view.ViewPagerFixed;
import com.app.base.view.indicator.YlTableLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.TopicTypeTagModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.vm.moment.MomentTopicVM;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
import p143o00OOooo.o00OO000;
import p166o00OoOoo.o0O00O0o;
import p391o0OOooOo.o0O00000;
import p649o0ooOOoo.y8;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0006\u0010\u000e\u001a\u00020\u0003R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020&0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%¨\u0006*"}, d2 = {"Lcom/yalla/yalla/ui/fragment/MainMomentTopicFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/y8;", "", "initObserver", "initView", "setIndicator", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onDestroy", "scrollToTop", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "vm", "Lcom/yalla/yalla/ui/vm/moment/MomentTopicVM;", "momentTopicVM$delegate", "getMomentTopicVM", "()Lcom/yalla/yalla/ui/vm/moment/MomentTopicVM;", "momentTopicVM", "Lcom/yalla/yalla/ui/fragment/MainMomentsTopicFollowingFragment;", "joinFragment", "Lcom/yalla/yalla/ui/fragment/MainMomentsTopicFollowingFragment;", "Lcom/yalla/yalla/ui/fragment/MainMomentsTopicRecommendFragment;", "recommendFragment", "Lcom/yalla/yalla/ui/fragment/MainMomentsTopicRecommendFragment;", "Lcom/yalla/yalla/ui/fragment/MainMomentsTopicNewFragment;", "newFragment", "Lcom/yalla/yalla/ui/fragment/MainMomentsTopicNewFragment;", "", "fragments", "Ljava/util/List;", "", "titles", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainMomentTopicFragment extends p503o0o00o00.OooO<y8> {
    public static final int $stable = 8;

    @NotNull
    private List<p503o0o00o00.OooO<?>> fragments;
    private MainMomentsTopicFollowingFragment joinFragment;

    @Nullable
    private p462o0Ooo0o.o0000O00 lazyFragmentPagerAdapter;

    /* JADX INFO: renamed from: momentTopicVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy momentTopicVM;
    private MainMomentsTopicNewFragment newFragment;
    private MainMomentsTopicRecommendFragment recommendFragment;

    @NotNull
    private List<String> titles;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO00o extends Lambda implements Function1<List<TopicTypeTagModel>, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<TopicTypeTagModel> list) {
            List<TopicTypeTagModel> list2 = list;
            if (list2 != null) {
                MainMomentTopicFragment mainMomentTopicFragment = MainMomentTopicFragment.this;
                int i = 0;
                for (Object obj : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    TopicTypeTagModel topicTypeTagModel = (TopicTypeTagModel) obj;
                    if (topicTypeTagModel.getId() > 0 && (!StringsKt.isBlank(topicTypeTagModel.getTagName()))) {
                        mainMomentTopicFragment.fragments.add(new MainMomentsTopicAddMoreFragment().setData(topicTypeTagModel));
                        mainMomentTopicFragment.titles.add(topicTypeTagModel.getTagName());
                    }
                    i = i2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ApiResult<List<TopicTypeTagModel>>, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<TopicTypeTagModel>> apiResult) {
            ApiResult<List<TopicTypeTagModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MainMomentTopicFragment.this.newFragment = new MainMomentsTopicNewFragment();
            MainMomentTopicFragment.this.recommendFragment = new MainMomentsTopicRecommendFragment();
            MainMomentTopicFragment.this.joinFragment = new MainMomentsTopicFollowingFragment();
            List list = MainMomentTopicFragment.this.fragments;
            MainMomentsTopicNewFragment mainMomentsTopicNewFragment = MainMomentTopicFragment.this.newFragment;
            if (mainMomentsTopicNewFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newFragment");
                mainMomentsTopicNewFragment = null;
            }
            list.add(0, mainMomentsTopicNewFragment);
            List list2 = MainMomentTopicFragment.this.fragments;
            MainMomentsTopicRecommendFragment mainMomentsTopicRecommendFragment = MainMomentTopicFragment.this.recommendFragment;
            if (mainMomentsTopicRecommendFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recommendFragment");
                mainMomentsTopicRecommendFragment = null;
            }
            list2.add(0, mainMomentsTopicRecommendFragment);
            List list3 = MainMomentTopicFragment.this.fragments;
            MainMomentsTopicFollowingFragment mainMomentsTopicFollowingFragment = MainMomentTopicFragment.this.joinFragment;
            if (mainMomentsTopicFollowingFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("joinFragment");
                mainMomentsTopicFollowingFragment = null;
            }
            list3.add(0, mainMomentsTopicFollowingFragment);
            MainMomentTopicFragment.this.titles.add(0, p254o00ooO0O.o000O0O0.OooO0OO(R.string.moment_topic_main_new));
            MainMomentTopicFragment.this.titles.add(0, p254o00ooO0O.o000O0O0.OooO0OO(R.string.Recommended));
            MainMomentTopicFragment.this.titles.add(0, p254o00ooO0O.o000O0O0.OooO0OO(R.string.topic_following));
            MainMomentTopicFragment mainMomentTopicFragment = MainMomentTopicFragment.this;
            FragmentManager childFragmentManager = mainMomentTopicFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            mainMomentTopicFragment.lazyFragmentPagerAdapter = new p462o0Ooo0o.o0000O00(childFragmentManager, MainMomentTopicFragment.this.fragments);
            MainMomentTopicFragment.this.getBinding().f50998OooO0Oo.setAdapter(MainMomentTopicFragment.this.lazyFragmentPagerAdapter);
            MainMomentTopicFragment.this.setIndicator();
            MainMomentTopicFragment.this.getBinding().f50998OooO0Oo.setCurrentItem(1);
            if (com.android.billingclient.api.o00000O.OooO0O0().OooOOO0()) {
                MainMomentTopicFragment.this.getBinding().f50998OooO0Oo.setCurrentItem(1);
                o0O00O0o o0o00o0oOooO0O0 = com.android.billingclient.api.o00000O.OooO0O0();
                Objects.requireNonNull(o0o00o0oOooO0O0);
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("FIRST_RECOMMEND_TOPIC");
                sbOooO0o0.append(String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue()));
                o0o00o0oOooO0O0.OooO0oo(sbOooO0o0.toString(), false);
            } else {
                MomentVM vm = MainMomentTopicFragment.this.getVm();
                Integer numValueOf = vm != null ? Integer.valueOf(vm.getLastLeaveMomentPage()) : null;
                if (numValueOf != null && numValueOf.intValue() == 2) {
                    MainMomentTopicFragment.this.getBinding().f50998OooO0Oo.setCurrentItem(0);
                } else if (numValueOf != null && numValueOf.intValue() == 3) {
                    MainMomentTopicFragment.this.getBinding().f50998OooO0Oo.setCurrentItem(1);
                } else if (numValueOf != null && numValueOf.intValue() == 4) {
                    MainMomentTopicFragment.this.getBinding().f50998OooO0Oo.setCurrentItem(2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements ViewPager.OooOOO0 {
        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            if (i == 0) {
                o0O00000.OooO0OO("Moments_Topics_Following");
            } else {
                if (i != 1) {
                    return;
                }
                o0O00000.OooO0OO("Moments_Topics_Recommened");
            }
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f23911Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Context context) {
            super(0);
            this.f23911Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O00000.OooO0OO("Moments_topics_search");
            TopicSearchActivity.OooO00o oooO00o = TopicSearchActivity.f22654OooooOo;
            Context context = this.f23911Oooo0o;
            Intrinsics.checkNotNullExpressionValue(context, "it");
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) TopicSearchActivity.class));
            return Unit.INSTANCE;
        }
    }

    public MainMomentTopicFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.MainMomentTopicFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.MainMomentTopicFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.MainMomentTopicFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.MainMomentTopicFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f23917Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f23917Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.MainMomentTopicFragment$special$$inlined$viewModels$default$5
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
        final Function0<Fragment> function1 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.MainMomentTopicFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.MainMomentTopicFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function1.invoke();
            }
        });
        this.momentTopicVM = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentTopicVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.MainMomentTopicFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy2, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.MainMomentTopicFragment$special$$inlined$viewModels$default$9

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f23924Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = this.f23924Oooo0o;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.MainMomentTopicFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.fragments = new ArrayList();
        this.titles = new ArrayList();
    }

    private final MomentTopicVM getMomentTopicVM() {
        return (MomentTopicVM) this.momentTopicVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MomentVM getVm() {
        return (MomentVM) this.vm.getValue();
    }

    private final void initObserver() {
        LiveEventBus.get("TOPIC_TO_RECOMMEND").observe(this, new o00OO000(this, 6));
        getMomentTopicVM().circleTypeConfigList().observe(this, new o0o0000.OooOo(new OooO00o(), null, new OooO0O0(), false, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-0, reason: not valid java name */
    public static final void m342initObserver$lambda0(MainMomentTopicFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().f50998OooO0Oo.setCurrentItem(1);
    }

    private final void initView() {
        getBinding().f50998OooO0Oo.setOffscreenPageLimit(20);
        getBinding().f50998OooO0Oo.OooO0O0(new OooO0OO());
        getBinding().f50996OooO0O0.setOnClickListener(new p563o0oOo0.o0000OO0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-2, reason: not valid java name */
    public static final void m343initView$lambda2(MainMomentTopicFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.getContext();
        if (context != null) {
            OooO0o onLogin = new OooO0o(context);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIndicator() {
        FragmentActivity context = requireActivity();
        Intrinsics.checkNotNullExpressionValue(context, "requireActivity()");
        Intrinsics.checkNotNullParameter(context, "context");
        o00o000O.OooO0O0.OooO00o oooO00o = new o00o000O.OooO0O0.OooO00o(context);
        oooO00o.f32980OooO0Oo = 16.0f;
        oooO00o.f32982OooO0o0 = 16.0f;
        oooO00o.OooO0O0(this.titles);
        oooO00o.f32981OooO0o = p254o00ooO0O.o000O0O0.OooO00o(R.color.color_333333);
        oooO00o.f32983OooO0oO = p254o00ooO0O.o000O0O0.OooO00o(R.color.color_999999);
        ViewPagerFixed viewPagerFixed = getBinding().f50998OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(viewPagerFixed, "binding.vpMomentTopic");
        oooO00o.OooO0OO(viewPagerFixed);
        oooO00o.f32984OooO0oo = 2.0f;
        oooO00o.f32976OooO = p254o00ooO0O.o000O0O0.OooO00o(R.color.color_00d8c9);
        oooO00o.f32985OooOO0 = com.yalla.support.common.util.OooOo00.OooO00o(43.0f);
        oooO00o.f32986OooOO0O = com.yalla.support.common.util.OooOo00.OooO00o(2.0f);
        oooO00o.f32978OooO0O0.setLeftPadding(com.yalla.support.common.util.OooOo00.OooO00o(2.5f));
        oooO00o.f32978OooO0O0.setRightPadding(com.yalla.support.common.util.OooOo00.OooO00o(2.5f));
        oooO00o.f32995OooOo0 = com.yalla.support.common.util.OooOo00.OooO00o(9.0f);
        oooO00o.f32996OooOo00 = com.yalla.support.common.util.OooOo00.OooO00o(9.0f);
        oooO00o.f32978OooO0O0.setAdjustMode(false);
        YlTableLayout ylTableLayout = getBinding().f50997OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.tlMomentTopic");
        oooO00o.OooO00o(ylTableLayout);
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
        initObserver();
        getVm().statisticalTime();
    }

    public final void scrollToTop() {
        if (getIsLazyInit()) {
            int size = this.fragments.size();
            int currentItem = getBinding().f50998OooO0Oo.getCurrentItem();
            boolean z = false;
            if (currentItem >= 0 && currentItem < size) {
                z = true;
            }
            if (z) {
                this.fragments.get(getBinding().f50998OooO0Oo.getCurrentItem()).scrollTopRefresh();
            }
        }
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public y8 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        y8 y8VarInflate = y8.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(y8VarInflate, "inflate(inflater)");
        return y8VarInflate;
    }
}
