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
import com.yalla.yalla.ui.view.ViewPagerFixed;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import com.yalla.yalla.ui.vm.main.TopVM;
import com.yalla.yalla.ui.vm.user.TopDataVM;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oO0OOO00;
import p586o0oOooO0.oO0o0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/ui/fragment/TopFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/oO0OOO00;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onLazyInit", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Lcom/yalla/yalla/ui/vm/main/TopVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/main/TopVM;", "vm", "", "Lcom/yalla/yalla/ui/fragment/TopDataFragment;", "fragments", "Ljava/util/List;", "", "rankType", "Ljava/lang/String;", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTopFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopFragment.kt\ncom/yalla/yalla/ui/fragment/TopFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,65:1\n106#2,15:66\n*S KotlinDebug\n*F\n+ 1 TopFragment.kt\ncom/yalla/yalla/ui/fragment/TopFragment\n*L\n18#1:66,15\n*E\n"})
public final class TopFragment extends p527o0o0OO0o.o000O<oO0OOO00> {
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
        public static TopFragment OooO00o(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            TopFragment topFragment = new TopFragment();
            Bundle bundle = new Bundle();
            TopVM.INSTANCE.getClass();
            bundle.putString(TopVM.RANK_TYPE_KEY, type);
            topFragment.setArguments(bundle);
            return topFragment;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.TopFragment$special$$inlined$viewModels$default$1] */
    public TopFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.TopFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.TopFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(TopVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.TopFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000Oo0.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.TopFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f27819OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27819OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.TopFragment$special$$inlined$viewModels$default$5
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
    }

    private final TopVM getVm() {
        return (TopVM) this.vm.getValue();
    }

    @Override // p527o0o0OO0o.o000O, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            TopVM.Companion companion = TopVM.INSTANCE;
            companion.getClass();
            String str = TopVM.RANK_TYPE_KEY;
            companion.getClass();
            string = arguments.getString(str, TopVM.TYPE_ROOM_GIFT);
        } else {
            string = null;
        }
        if (string == null) {
            TopVM.INSTANCE.getClass();
            string = TopVM.TYPE_ROOM_GIFT;
        }
        this.rankType = string;
    }

    @Override // p586o0oOooO0.oO0Oo0o0
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
        companion.getClass();
        topDataFragmentArr[0] = TopDataFragment.Companion.OooO00o(str, TopDataVM.TYPE_HOUR);
        String str2 = this.rankType;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str2 = null;
        }
        topDataFragmentArr[1] = TopDataFragment.Companion.OooO00o(str2, TopDataVM.TYPE_DAY);
        String str3 = this.rankType;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str3 = null;
        }
        topDataFragmentArr[2] = TopDataFragment.Companion.OooO00o(str3, TopDataVM.TYPE_WEEKLY);
        String str4 = this.rankType;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str4 = null;
        }
        topDataFragmentArr[3] = TopDataFragment.Companion.OooO00o(str4, TopDataVM.TYPE_MONTH);
        this.fragments = CollectionsKt.mutableListOf(topDataFragmentArr);
        getBinding().f44921OooO0OO.setOffscreenPageLimit(3);
        ViewPagerFixed viewPagerFixed = getBinding().f44921OooO0OO;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        List<TopDataFragment> list2 = this.fragments;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragments");
        } else {
            list = list2;
        }
        viewPagerFixed.setAdapter(new oO0o0000(childFragmentManager, list));
        FragmentActivity context = requireActivity();
        Intrinsics.checkNotNullExpressionValue(context, "requireActivity(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        o0oOo00O.o0O0O00.OooO00o oooO00o = new o0oOo00O.o0O0O00.OooO00o(context);
        oooO00o.OooO0O0(getVm().getTitles());
        int i = p562o0oOo000.o0OOO0o.white;
        oooO00o.f56262OooO0o0 = com.code.android.util.o0000.OooO00o(i);
        oooO00o.f56260OooO0Oo = 14.0f;
        oooO00o.f56259OooO0OO = 14.0f;
        oooO00o.f56264OooO0oo = com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_white_70);
        ViewPagerFixed vpTop = getBinding().f44921OooO0OO;
        Intrinsics.checkNotNullExpressionValue(vpTop, "vpTop");
        oooO00o.OooO0Oo(vpTop);
        oooO00o.f56265OooOO0 = com.code.android.util.o0000.OooO00o(i);
        oooO00o.f56266OooOO0O = com.code.android.util.o0000O0.OooO00o(11.0f);
        oooO00o.f56267OooOO0o = com.code.android.util.o0000O0.OooO00o(3.0f);
        oooO00o.f56256OooO = 5.0f;
        oooO00o.f56257OooO00o.setAdjustMode(true);
        YlTableLayout tlTop = getBinding().f44920OooO0O0;
        Intrinsics.checkNotNullExpressionValue(tlTop, "tlTop");
        oooO00o.OooO00o(tlTop);
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public oO0OOO00 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        oO0OOO00 oo0ooo00Inflate = oO0OOO00.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(oo0ooo00Inflate, "inflate(...)");
        return oo0ooo00Inflate;
    }
}
