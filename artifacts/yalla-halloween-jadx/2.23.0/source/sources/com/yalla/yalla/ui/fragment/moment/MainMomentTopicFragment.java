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
import com.code.android.util.o000OO00;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.topic.TopicTypeTagModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment;
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
import p553o0oOOoo.o0oO0Ooo;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.l2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0006\u0010\u0013\u001a\u00020\u0003R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R \u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020+0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/yalla/yalla/ui/fragment/moment/MainMomentTopicFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/l2;", "", "initObserver", "initView", "setIndicator", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onLazyInit", "onDestroy", "scrollToTop", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "vm", "Lcom/yalla/yalla/ui/vm/moment/MomentTopicVM;", "momentTopicVM$delegate", "getMomentTopicVM", "()Lcom/yalla/yalla/ui/vm/moment/MomentTopicVM;", "momentTopicVM", "Lcom/yalla/yalla/ui/fragment/moment/MainMomentsTopicFollowingFragment;", "joinFragment", "Lcom/yalla/yalla/ui/fragment/moment/MainMomentsTopicFollowingFragment;", "Lcom/yalla/yalla/ui/fragment/moment/MainMomentsTopicRecommendFragment;", "recommendFragment", "Lcom/yalla/yalla/ui/fragment/moment/MainMomentsTopicRecommendFragment;", "Lcom/yalla/yalla/ui/fragment/moment/MainMomentsTopicNewFragment;", "newFragment", "Lcom/yalla/yalla/ui/fragment/moment/MainMomentsTopicNewFragment;", "", "fragments", "Ljava/util/List;", "", "titles", "Lo0Oo0OO0/o00Oo0;", "lazyFragmentPagerAdapter", "Lo0Oo0OO0/o00Oo0;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainMomentTopicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentTopicFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentTopicFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,187:1\n106#2,15:188\n106#2,15:203\n*S KotlinDebug\n*F\n+ 1 MainMomentTopicFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentTopicFragment\n*L\n37#1:188,15\n38#1:203,15\n*E\n"})
public final class MainMomentTopicFragment extends p508o0o0O.OooOO0O<l2> {
    public static final int $stable = 8;

    @NotNull
    private List<p508o0o0O.OooOO0O<?>> fragments;
    private MainMomentsTopicFollowingFragment joinFragment;

    @Nullable
    private p401o0Oo0OO0.o00Oo0 lazyFragmentPagerAdapter;

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

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f28629OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Context context) {
            super(0);
            this.f28629OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("103033");
            int i = TopicSearchActivity.f26398OooOoo0;
            Context context = this.f28629OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(context, "it");
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) TopicSearchActivity.class));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o implements Observer<Object> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            MainMomentTopicFragment.this.getBinding().f58324OooO0o.setCurrentItem(1);
        }
    }

    @SourceDebugExtension({"SMAP\nMainMomentTopicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentTopicFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentTopicFragment$initObserver$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n1864#2,3:188\n*S KotlinDebug\n*F\n+ 1 MainMomentTopicFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentTopicFragment$initObserver$2\n*L\n78#1:188,3\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<List<TopicTypeTagModel>, Unit> {
        public OooO0O0() {
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

    public static final class OooO0OO extends Lambda implements Function1<ApiResult<List<TopicTypeTagModel>>, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<TopicTypeTagModel>> apiResult) {
            ApiResult<List<TopicTypeTagModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MainMomentsTopicNewFragment mainMomentsTopicNewFragment = new MainMomentsTopicNewFragment();
            MainMomentTopicFragment mainMomentTopicFragment = MainMomentTopicFragment.this;
            mainMomentTopicFragment.fragments.add(0, mainMomentsTopicNewFragment);
            mainMomentTopicFragment.titles.add(0, com.code.android.util.o0000.OooO0OO(oO00OOo0.moment_topic_main_new));
            mainMomentTopicFragment.newFragment = mainMomentsTopicNewFragment;
            MainMomentsTopicRecommendFragment mainMomentsTopicRecommendFragment = new MainMomentsTopicRecommendFragment();
            mainMomentTopicFragment.fragments.add(0, mainMomentsTopicRecommendFragment);
            mainMomentTopicFragment.titles.add(0, com.code.android.util.o0000.OooO0OO(oO00OOo0.Recommended));
            mainMomentTopicFragment.recommendFragment = mainMomentsTopicRecommendFragment;
            MainMomentsTopicFollowingFragment mainMomentsTopicFollowingFragment = new MainMomentsTopicFollowingFragment();
            mainMomentTopicFragment.fragments.add(0, mainMomentsTopicFollowingFragment);
            mainMomentTopicFragment.titles.add(0, com.code.android.util.o0000.OooO0OO(oO00OOo0.topic_following));
            mainMomentTopicFragment.joinFragment = mainMomentsTopicFollowingFragment;
            FragmentManager childFragmentManager = mainMomentTopicFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            mainMomentTopicFragment.lazyFragmentPagerAdapter = new p401o0Oo0OO0.o00Oo0(childFragmentManager, mainMomentTopicFragment.fragments);
            mainMomentTopicFragment.getBinding().f58324OooO0o.setAdapter(mainMomentTopicFragment.lazyFragmentPagerAdapter);
            mainMomentTopicFragment.setIndicator();
            mainMomentTopicFragment.getBinding().f58324OooO0o.setCurrentItem(1);
            p480o0o000Oo.o0OOO0o o0ooo0oOooO0O0 = com.android.billingclient.api.o0000OO0.OooO0O0();
            o0ooo0oOooO0O0.getClass();
            if (o0ooo0oOooO0O0.OooO0O0("FIRST_RECOMMEND_TOPIC".concat(String.valueOf(p464o0Oooo.o000000O.OooOOo0().getValue())), true)) {
                mainMomentTopicFragment.getBinding().f58324OooO0o.setCurrentItem(1);
                p480o0o000Oo.o0OOO0o o0ooo0oOooO0O1 = com.android.billingclient.api.o0000OO0.OooO0O0();
                o0ooo0oOooO0O1.getClass();
                p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                o0ooo0oOooO0O1.OooO0o("FIRST_RECOMMEND_TOPIC".concat(String.valueOf(p464o0Oooo.o000000O.OooOOo0().getValue())), false);
            } else {
                int lastLeaveMomentPage = mainMomentTopicFragment.getVm().getLastLeaveMomentPage();
                if (lastLeaveMomentPage == 2) {
                    mainMomentTopicFragment.getBinding().f58324OooO0o.setCurrentItem(0);
                } else if (lastLeaveMomentPage == 3) {
                    mainMomentTopicFragment.getBinding().f58324OooO0o.setCurrentItem(1);
                } else if (lastLeaveMomentPage == 4) {
                    mainMomentTopicFragment.getBinding().f58324OooO0o.setCurrentItem(2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o implements ViewPager.OooOOO0 {
        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            if (i == 0) {
                o0OO000.OooO00o("203020");
            } else {
                if (i != 1) {
                    return;
                }
                o0OO000.OooO00o("203019");
            }
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Integer, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer it = num;
            ImageView imageView = MainMomentTopicFragment.this.getBinding().f58322OooO0OO;
            oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            imageView.setImageResource(oOOOOo0O.OooO0OO(it.intValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28634OooO0Oo;

        public OooOO0O(OooOO0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28634OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28634OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28634OooO0Oo;
        }

        public final int hashCode() {
            return this.f28634OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28634OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Boolean, o0oO0Ooo.OooO0O0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f28635OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Boolean bool, o0oO0Ooo.OooO0O0 oooO0O0) {
            boolean zBooleanValue = bool.booleanValue();
            o0oO0Ooo.OooO0O0 item = oooO0O0;
            Intrinsics.checkNotNullParameter(item, "item");
            if (zBooleanValue) {
                item.f56058OooO0O0.setBackgroundResource(oOo00OO0.bg_green_r360);
                item.f56058OooO0O0.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_white));
            } else {
                item.f56058OooO0O0.setBackgroundResource(oOo00OO0.bg_05333333_r360);
                item.f56058OooO0O0.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_333333_45));
                o000OO00.OooO0O0(item.f56059OooO0OO);
                View view = item.f56060OooO0Oo;
                o000OO00.OooO0O0(view);
                View view2 = item.f56062OooO0o0;
                o000OO00.OooO0O0(view2);
                int i = item.f56063OooO0oO;
                if (i == 0) {
                    o000OO00.OooOOOO(view);
                }
                if (i == item.f56061OooO0o - 1) {
                    o000OO00.OooOOOO(view2);
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
        this.vm = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(BaseMomentDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28641OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28641OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy);
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
        this.momentTopicVM = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentTopicVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000O0o.OooO00o(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment$special$$inlined$viewModels$default$9

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28648OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28648OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy2);
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
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy2);
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
        LiveEventBus.get("TOPIC_TO_RECOMMEND").observe(this, new OooO00o());
        getMomentTopicVM().circleTypeConfigList().observe(this, new p377o0OOoOo.o0000OO0(new OooO0O0(), null, new OooO0OO(), false, 10));
    }

    private final void initView() {
        getBinding().f58324OooO0o.setOffscreenPageLimit(20);
        getBinding().f58324OooO0o.OooO0O0(new OooO0o());
        getBinding().f58323OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: o0o0OO0O.o00OO0OO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainMomentTopicFragment.initView$lambda$1(this.f53453OooO0Oo, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(MainMomentTopicFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.getContext();
        if (context != null) {
            OooO onLogin = new OooO(context);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = LoginActivity.f25186OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIndicator() {
        Context context = getBinding().f58324OooO0o.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "binding.vpMomentTopic.context");
        Intrinsics.checkNotNullParameter(context, "context");
        o0oO0Ooo.OooO00o oooO00o = new o0oO0Ooo.OooO00o(context);
        List<String> list = this.titles;
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        oooO00o.f56047OooO0O0 = list;
        oooO00o.f56054OooOO0 = getBinding().f58324OooO0o;
        oooO00o.f56045OooO = com.code.android.util.o0000O0.OooO00o(0);
        oooO00o.f56052OooO0oO = com.code.android.util.o0000.OooO00o(oO00O0o.tr_00);
        oooO00o.f56046OooO00o.setAdjustMode(false);
        YlTableLayout magicIndicator = getBinding().f58325OooO0o0;
        Intrinsics.checkNotNullExpressionValue(magicIndicator, "binding.titleFrameLayout");
        Intrinsics.checkNotNullParameter(magicIndicator, "magicIndicator");
        oooO00o.f56055OooOO0O = magicIndicator;
        new o0oO0Ooo(oooO00o).f56044OooO0Oo = OooOOO0.f28635OooO0Oo;
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
        initObserver();
        getVm().statisticalTime();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        p427o0OoOO00.OooOo.f45669OooO00o.observe(getViewLifecycleOwner(), new OooOO0O(new OooOO0()));
    }

    public final void scrollToTop() {
        if (getIsLazyInit()) {
            int size = this.fragments.size();
            int currentItem = getBinding().f58324OooO0o.getCurrentItem();
            boolean z = false;
            if (currentItem >= 0 && currentItem < size) {
                z = true;
            }
            if (z) {
                this.fragments.get(getBinding().f58324OooO0o.getCurrentItem()).scrollTopRefresh();
            }
        }
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public l2 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        l2 l2VarInflate = l2.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(l2VarInflate, "inflate(inflater)");
        return l2VarInflate;
    }
}
