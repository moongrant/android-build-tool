package com.yalla.yalla.ui.fragment.moment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.topic.TopicTypeTagModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.ui.vm.moment.MomentTopicVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p269o00oooo0.o0O0oo0o;
import p405o0Oo0OOO.o0O0o0;
import p475o0Ooooo0.o0O00oO0;
import p527o0o0OO0o.o000O;
import p550o0oOOO0o.o00O0O00;
import p586o0oOooO0.oO0o0000;
import p590o0oOooo0.z0;
import p650o0ooo.m4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0006\u0010\u0013\u001a\u00020\u0003R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R \u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020+0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/yalla/yalla/ui/fragment/moment/MainMomentTopicFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/o0O0o0;", "", "initObserver", "initView", "setIndicator", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onLazyInit", "onDestroy", "scrollToTop", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "vm", "Lcom/yalla/yalla/ui/vm/moment/MomentTopicVM;", "momentTopicVM$delegate", "getMomentTopicVM", "()Lcom/yalla/yalla/ui/vm/moment/MomentTopicVM;", "momentTopicVM", "Lcom/yalla/yalla/ui/fragment/moment/MainMomentsTopicFollowingFragment;", "joinFragment", "Lcom/yalla/yalla/ui/fragment/moment/MainMomentsTopicFollowingFragment;", "Lcom/yalla/yalla/ui/fragment/moment/MainMomentsTopicRecommendFragment;", "recommendFragment", "Lcom/yalla/yalla/ui/fragment/moment/MainMomentsTopicRecommendFragment;", "Lcom/yalla/yalla/ui/fragment/moment/MainMomentsTopicNewFragment;", "newFragment", "Lcom/yalla/yalla/ui/fragment/moment/MainMomentsTopicNewFragment;", "", "fragments", "Ljava/util/List;", "", "titles", "Lo0oOooO0/oO0o0000;", "lazyFragmentPagerAdapter", "Lo0oOooO0/oO0o0000;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMainMomentTopicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentTopicFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentTopicFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,187:1\n106#2,15:188\n106#2,15:203\n*S KotlinDebug\n*F\n+ 1 MainMomentTopicFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentTopicFragment\n*L\n37#1:188,15\n38#1:203,15\n*E\n"})
public final class MainMomentTopicFragment extends o000O<o0O0o0> {
    public static final int $stable = 8;

    @NotNull
    private List<o000O<?>> fragments;
    private MainMomentsTopicFollowingFragment joinFragment;

    @Nullable
    private oO0o0000 lazyFragmentPagerAdapter;

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

    public static final class OooO extends Lambda implements Function1<Integer, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer num2 = num;
            ImageView imageView = MainMomentTopicFragment.this.getBinding().f44529OooO0OO;
            z0 z0Var = z0.f57313OooO00o;
            Intrinsics.checkNotNull(num2);
            imageView.setImageResource(z0.OooO0OO(num2.intValue()));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMainMomentTopicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentTopicFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentTopicFragment$initObserver$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n1864#2,3:188\n*S KotlinDebug\n*F\n+ 1 MainMomentTopicFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentTopicFragment$initObserver$2\n*L\n78#1:188,3\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<List<TopicTypeTagModel>, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<TopicTypeTagModel> list) {
            List<TopicTypeTagModel> list2 = list;
            if (list2 != null) {
                int i = 0;
                for (Object obj : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    TopicTypeTagModel topicTypeTagModel = (TopicTypeTagModel) obj;
                    if (topicTypeTagModel.getId() > 0 && (!StringsKt.isBlank(topicTypeTagModel.getTagName()))) {
                        MainMomentsTopicAddMoreFragment data = new MainMomentsTopicAddMoreFragment().setData(topicTypeTagModel);
                        MainMomentTopicFragment mainMomentTopicFragment = MainMomentTopicFragment.this;
                        mainMomentTopicFragment.fragments.add(data);
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
            MainMomentsTopicNewFragment mainMomentsTopicNewFragment = new MainMomentsTopicNewFragment();
            MainMomentTopicFragment mainMomentTopicFragment = MainMomentTopicFragment.this;
            mainMomentTopicFragment.fragments.add(0, mainMomentsTopicNewFragment);
            mainMomentTopicFragment.titles.add(0, com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.moment_topic_main_new));
            mainMomentTopicFragment.newFragment = mainMomentsTopicNewFragment;
            MainMomentsTopicRecommendFragment mainMomentsTopicRecommendFragment = new MainMomentsTopicRecommendFragment();
            mainMomentTopicFragment.fragments.add(0, mainMomentsTopicRecommendFragment);
            mainMomentTopicFragment.titles.add(0, com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Recommended));
            mainMomentTopicFragment.recommendFragment = mainMomentsTopicRecommendFragment;
            MainMomentsTopicFollowingFragment mainMomentsTopicFollowingFragment = new MainMomentsTopicFollowingFragment();
            mainMomentTopicFragment.fragments.add(0, mainMomentsTopicFollowingFragment);
            mainMomentTopicFragment.titles.add(0, com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.topic_following));
            mainMomentTopicFragment.joinFragment = mainMomentsTopicFollowingFragment;
            FragmentManager childFragmentManager = mainMomentTopicFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            mainMomentTopicFragment.lazyFragmentPagerAdapter = new oO0o0000(childFragmentManager, mainMomentTopicFragment.fragments);
            mainMomentTopicFragment.getBinding().f44531OooO0o.setAdapter(mainMomentTopicFragment.lazyFragmentPagerAdapter);
            mainMomentTopicFragment.setIndicator();
            mainMomentTopicFragment.getBinding().f44531OooO0o.setCurrentItem(1);
            p477o0o00.OooO0o oooO0oOooO00o = o0O0oo0o.OooO00o();
            oooO0oOooO00o.getClass();
            if (oooO0oOooO00o.OooO0O0("FIRST_RECOMMEND_TOPIC".concat(String.valueOf(o0O00oO0.OooOOo0().getValue())), true)) {
                mainMomentTopicFragment.getBinding().f44531OooO0o.setCurrentItem(1);
                p477o0o00.OooO0o oooO0oOooO00o2 = o0O0oo0o.OooO00o();
                oooO0oOooO00o2.getClass();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                oooO0oOooO00o2.OooO0o("FIRST_RECOMMEND_TOPIC".concat(String.valueOf(o0O00oO0.OooOOo0().getValue())), false);
            } else {
                int lastLeaveMomentPage = mainMomentTopicFragment.getVm().getLastLeaveMomentPage();
                if (lastLeaveMomentPage == 2) {
                    mainMomentTopicFragment.getBinding().f44531OooO0o.setCurrentItem(0);
                } else if (lastLeaveMomentPage == 3) {
                    mainMomentTopicFragment.getBinding().f44531OooO0o.setCurrentItem(1);
                } else if (lastLeaveMomentPage == 4) {
                    mainMomentTopicFragment.getBinding().f44531OooO0o.setCurrentItem(2);
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
                o0oo0000.OooO00o.OooO0O0("203020");
            } else {
                if (i != 1) {
                    return;
                }
                o0oo0000.OooO00o.OooO0O0("203019");
            }
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f28115OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Context context) {
            super(0);
            this.f28115OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("103033");
            int i = TopicSearchActivity.f25947OooOoo0;
            Context context = this.f28115OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(context, "$it");
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) TopicSearchActivity.class));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28116OooO0Oo;

        public OooOO0(OooO function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28116OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28116OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28116OooO0Oo;
        }

        public final int hashCode() {
            return this.f28116OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28116OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Boolean, o0oOo00O.o0OOO0o.OooO0O0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f28117OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Boolean bool, o0oOo00O.o0OOO0o.OooO0O0 oooO0O0) {
            boolean zBooleanValue = bool.booleanValue();
            o0oOo00O.o0OOO0o.OooO0O0 item = oooO0O0;
            Intrinsics.checkNotNullParameter(item, "item");
            if (zBooleanValue) {
                item.f56301OooO0O0.setBackgroundResource(p562o0oOo000.o0Oo0oo.bg_green_r360);
                item.f56301OooO0O0.setTextColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_white));
            } else {
                item.f56301OooO0O0.setBackgroundResource(p562o0oOo000.o0Oo0oo.bg_05333333_r360);
                item.f56301OooO0O0.setTextColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_333333_45));
                com.code.android.util.o000O.OooO0O0(item.f56302OooO0OO);
                View view = item.f56303OooO0Oo;
                com.code.android.util.o000O.OooO0O0(view);
                View view2 = item.f56305OooO0o0;
                com.code.android.util.o000O.OooO0O0(view2);
                int i = item.f56306OooO0oO;
                if (i == 0) {
                    com.code.android.util.o000O.OooOOOO(view);
                }
                if (i == item.f56304OooO0o - 1) {
                    com.code.android.util.o000O.OooOOOO(view2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment$special$$inlined$viewModels$default$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment$special$$inlined$viewModels$default$6] */
    public MainMomentTopicFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(BaseMomentDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000Oo0.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28123OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28123OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment$special$$inlined$viewModels$default$5
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
        final ?? r1 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r1.invoke();
            }
        });
        this.momentTopicVM = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentTopicVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000Oo0.OooO00o(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment$special$$inlined$viewModels$default$9

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28130OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28130OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.fragments = new ArrayList();
        this.titles = new ArrayList();
    }

    private final MomentTopicVM getMomentTopicVM() {
        return (MomentTopicVM) this.momentTopicVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseMomentDetailVM getVm() {
        return (BaseMomentDetailVM) this.vm.getValue();
    }

    private final void initObserver() {
        LiveEventBus.get("TOPIC_TO_RECOMMEND").observe(this, new o00O0O00(this, 2));
        getMomentTopicVM().circleTypeConfigList().observe(this, new p384o0OOoo0O.o000oOoO(new OooO00o(), null, new OooO0O0(), false, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$0(MainMomentTopicFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().f44531OooO0o.setCurrentItem(1);
    }

    private final void initView() {
        getBinding().f44531OooO0o.setOffscreenPageLimit(20);
        getBinding().f44531OooO0o.OooO0O0(new OooO0OO());
        getBinding().f44530OooO0Oo.setOnClickListener(new m4(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(MainMomentTopicFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.getContext();
        if (context != null) {
            OooO0o onLogin = new OooO0o(context);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = LoginActivity.f24727OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIndicator() {
        Context context = getBinding().f44531OooO0o.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        o0oOo00O.o0OOO0o.OooO00o oooO00o = new o0oOo00O.o0OOO0o.OooO00o(context);
        List<String> list = this.titles;
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        oooO00o.f56290OooO0O0 = list;
        oooO00o.f56297OooOO0 = getBinding().f44531OooO0o;
        oooO00o.f56288OooO = com.code.android.util.o0000O0.OooO00o(0);
        oooO00o.f56295OooO0oO = com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.tr_00);
        oooO00o.f56289OooO00o.setAdjustMode(false);
        YlTableLayout magicIndicator = getBinding().f44532OooO0o0;
        Intrinsics.checkNotNullExpressionValue(magicIndicator, "titleFrameLayout");
        Intrinsics.checkNotNullParameter(magicIndicator, "magicIndicator");
        oooO00o.f56298OooOO0O = magicIndicator;
        new p563o0oOo00O.o0OOO0o(oooO00o).f56287OooO0Oo = OooOO0O.f28117OooO0Oo;
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
        initObserver();
        getVm().statisticalTime();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        p429o0OoOO.OooOo00.f46776OooO00o.observe(getViewLifecycleOwner(), new OooOO0(new OooO()));
    }

    public final void scrollToTop() {
        if (getIsLazyInit()) {
            int size = this.fragments.size();
            int currentItem = getBinding().f44531OooO0o.getCurrentItem();
            boolean z = false;
            if (currentItem >= 0 && currentItem < size) {
                z = true;
            }
            if (z) {
                this.fragments.get(getBinding().f44531OooO0o.getCurrentItem()).scrollTopRefresh();
            }
        }
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public o0O0o0 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o0O0o0 o0o0o0Inflate = o0O0o0.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(o0o0o0Inflate, "inflate(...)");
        return o0o0o0Inflate;
    }
}
