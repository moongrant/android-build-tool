package com.yalla.yalla.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
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
import com.app.base.view.ViewPagerFixed;
import com.app.base.view.indicator.YlTableLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.vm.main.TopVM;
import com.yalla.yalla.ui.vm.user.TopDataVM;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p649o0ooOOoo.nb;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/ui/fragment/TopFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/nb;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onLazyInit", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Lcom/yalla/yalla/ui/vm/main/TopVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/main/TopVM;", "vm", "", "Lcom/yalla/yalla/ui/fragment/TopDataFragment;", "fragments", "Ljava/util/List;", "", "rankType", "Ljava/lang/String;", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopFragment extends p503o0o00o00.OooO<nb> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private List<TopDataFragment> fragments;
    private String rankType;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.TopFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public final TopFragment OooO00o(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            TopFragment topFragment = new TopFragment();
            Bundle bundle = new Bundle();
            Objects.requireNonNull(TopVM.INSTANCE);
            bundle.putString(TopVM.RANK_TYPE_KEY, type);
            topFragment.setArguments(bundle);
            return topFragment;
        }
    }

    public TopFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.TopFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.TopFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(TopVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.TopFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.TopFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f24268Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f24268Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.TopFragment$special$$inlined$viewModels$default$5
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

    private final TopVM getVm() {
        return (TopVM) this.vm.getValue();
    }

    @Override // p503o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            TopVM.Companion companion = TopVM.INSTANCE;
            Objects.requireNonNull(companion);
            String str = TopVM.RANK_TYPE_KEY;
            Objects.requireNonNull(companion);
            string = arguments.getString(str, TopVM.TYPE_ROOM_GIFT);
        } else {
            string = null;
        }
        if (string == null) {
            Objects.requireNonNull(TopVM.INSTANCE);
            string = TopVM.TYPE_ROOM_GIFT;
        }
        this.rankType = string;
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        TopDataFragment[] topDataFragmentArr = new TopDataFragment[4];
        TopDataFragment.Companion companion = TopDataFragment.INSTANCE;
        String str = this.rankType;
        List<TopDataFragment> list = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str = null;
        }
        topDataFragmentArr[0] = companion.OooO00o(str, TopDataVM.TYPE_HOUR);
        String str2 = this.rankType;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str2 = null;
        }
        topDataFragmentArr[1] = companion.OooO00o(str2, TopDataVM.TYPE_DAY);
        String str3 = this.rankType;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str3 = null;
        }
        topDataFragmentArr[2] = companion.OooO00o(str3, TopDataVM.TYPE_WEEKLY);
        String str4 = this.rankType;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str4 = null;
        }
        topDataFragmentArr[3] = companion.OooO00o(str4, TopDataVM.TYPE_MONTH);
        this.fragments = CollectionsKt.mutableListOf(topDataFragmentArr);
        getBinding().f50102OooO0OO.setOffscreenPageLimit(3);
        ViewPagerFixed viewPagerFixed = getBinding().f50102OooO0OO;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        List<TopDataFragment> list2 = this.fragments;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragments");
        } else {
            list = list2;
        }
        viewPagerFixed.setAdapter(new p462o0Ooo0o.o0000O00(childFragmentManager, list));
        FragmentActivity context = requireActivity();
        Intrinsics.checkNotNullExpressionValue(context, "requireActivity()");
        Intrinsics.checkNotNullParameter(context, "context");
        o00o000O.OooO0O0.OooO00o oooO00o = new o00o000O.OooO0O0.OooO00o(context);
        oooO00o.OooO0O0(getVm().getTitles());
        oooO00o.f32981OooO0o = p254o00ooO0O.o000O0O0.OooO00o(R.color.white);
        oooO00o.f32982OooO0o0 = 14.0f;
        oooO00o.f32980OooO0Oo = 14.0f;
        oooO00o.f32983OooO0oO = p254o00ooO0O.o000O0O0.OooO00o(R.color.color_white_70);
        ViewPagerFixed viewPagerFixed2 = getBinding().f50102OooO0OO;
        Intrinsics.checkNotNullExpressionValue(viewPagerFixed2, "binding.vpTop");
        oooO00o.OooO0OO(viewPagerFixed2);
        oooO00o.f32976OooO = p254o00ooO0O.o000O0O0.OooO00o(R.color.white);
        oooO00o.f32985OooOO0 = com.yalla.support.common.util.OooOo00.OooO00o(11.0f);
        oooO00o.f32986OooOO0O = com.yalla.support.common.util.OooOo00.OooO00o(3.0f);
        oooO00o.f32984OooO0oo = 5.0f;
        oooO00o.f32978OooO0O0.setAdjustMode(true);
        YlTableLayout ylTableLayout = getBinding().f50101OooO0O0;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.tlTop");
        oooO00o.OooO00o(ylTableLayout);
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public nb getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        nb nbVarInflate = nb.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(nbVarInflate, "inflate(inflater)");
        return nbVarInflate;
    }
}
