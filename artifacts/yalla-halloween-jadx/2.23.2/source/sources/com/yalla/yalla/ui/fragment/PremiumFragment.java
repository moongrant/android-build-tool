package com.yalla.yalla.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.model.VipPrivilegeInfo;
import com.yalla.yalla.model.VipPrivilegeModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.vm.main.PremiumVM;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p046Oooooo0.o0O00o0;
import p405o0Oo0OOO.o0O0OO0;
import p405o0Oo0OOO.u2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0014R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/yalla/yalla/ui/fragment/PremiumFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/o0O0OO0;", "", "initView", "loadData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "Lcom/yalla/yalla/ui/vm/main/PremiumVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/main/PremiumVM;", "vm", "Lo0oOoO0/o0000oo;", "Lcom/yalla/yalla/model/VipPrivilegeInfo;", "adapter$delegate", "getAdapter", "()Lo0oOoO0/o0000oo;", "adapter", "Lcom/yalla/yalla/model/PremiumShopModel$PremiumInfo;", "vipInfo", "Lcom/yalla/yalla/model/PremiumShopModel$PremiumInfo;", "Lo0Oo0OOO/u2;", "bindingHeader$delegate", "getBindingHeader", "()Lo0Oo0OOO/u2;", "bindingHeader", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPremiumFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumFragment.kt\ncom/yalla/yalla/ui/fragment/PremiumFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,130:1\n172#2,9:131\n*S KotlinDebug\n*F\n+ 1 PremiumFragment.kt\ncom/yalla/yalla/ui/fragment/PremiumFragment\n*L\n32#1:131,9\n*E\n"})
public final class PremiumFragment extends p527o0o0OO0o.o000O<o0O0OO0> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String Key_data = "data";
    private PremiumShopModel.PremiumInfo vipInfo;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(PremiumVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.PremiumFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.PremiumFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f27774OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27774OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.PremiumFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: bindingHeader$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bindingHeader = LazyKt.lazy(new OooO0OO());

    public static final class OooO extends Lambda implements Function1<VipPrivilegeModel, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(VipPrivilegeModel vipPrivilegeModel) {
            VipPrivilegeModel vipPrivilegeModel2 = vipPrivilegeModel;
            PremiumFragment premiumFragment = PremiumFragment.this;
            if (vipPrivilegeModel2 == null) {
                premiumFragment.getBinding().f44493OooO00o.OooO0o();
            } else {
                premiumFragment.getAdapter().OooOoO0(vipPrivilegeModel2.getData());
                premiumFragment.getBindingHeader().f45580OooO0Oo.setText(o0O00o0.OooO00o("(", vipPrivilegeModel2.getVipcount(), "/", vipPrivilegeModel2.getSumcount(), ")"));
                premiumFragment.getBinding().f44493OooO00o.OooO0Oo();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.PremiumFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0000O> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000O invoke() {
            PremiumFragment premiumFragment = PremiumFragment.this;
            return new o0000O(premiumFragment, premiumFragment.getContext(), p562o0oOo000.oo0o0Oo.user_item_vip_ari);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<u2> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final u2 invoke() {
            u2 u2VarInflate = u2.inflate(PremiumFragment.this.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(u2VarInflate, "inflate(...)");
            return u2VarInflate;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PremiumFragment premiumFragment = PremiumFragment.this;
            premiumFragment.getBinding().f44493OooO00o.OooO0oo();
            premiumFragment.loadData();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiError, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            PremiumFragment.this.getBinding().f44493OooO00o.OooO0o();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p571o0oOoO0.o0000oo<VipPrivilegeInfo> getAdapter() {
        return (p571o0oOoO0.o0000oo) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u2 getBindingHeader() {
        return (u2) this.bindingHeader.getValue();
    }

    private final PremiumVM getVm() {
        return (PremiumVM) this.vm.getValue();
    }

    private final void initView() {
        getBinding().f44494OooO0O0.setLayoutManager(new FixGridLayoutManager(getContext(), 2));
        getAdapter().f13184OooOOO0 = false;
        getAdapter().OooO0o0(getBindingHeader().f45577OooO00o, -1);
        getBinding().f44494OooO0O0.setAdapter(getAdapter());
        UserPremiumView userPremiumView = getBindingHeader().f45578OooO0O0;
        PremiumShopModel.PremiumInfo premiumInfo = this.vipInfo;
        PremiumShopModel.PremiumInfo premiumInfo2 = null;
        if (premiumInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vipInfo");
            premiumInfo = null;
        }
        userPremiumView.OooO0o0(true, premiumInfo.getVipLevel());
        TextView textView = getBindingHeader().f45579OooO0OO;
        PremiumShopModel.PremiumInfo premiumInfo3 = this.vipInfo;
        if (premiumInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vipInfo");
        } else {
            premiumInfo2 = premiumInfo3;
        }
        textView.setText(premiumInfo2.getVipName());
        StateLayout stateLayout = getBinding().f44493OooO00o;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "getRoot(...)");
        StateLayout.OooOO0(stateLayout, 0, new OooO0o(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        PremiumVM vm = getVm();
        PremiumShopModel.PremiumInfo premiumInfo = this.vipInfo;
        if (premiumInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vipInfo");
            premiumInfo = null;
        }
        vm.loadVipPrivilegeList(Integer.parseInt(premiumInfo.getShopid())).observe(getViewLifecycleOwner(), new p384o0OOoo0O.o000oOoO(new OooO(), new OooOO0(), null, false, 12));
    }

    @Override // p527o0o0OO0o.o000O, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("data") : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.yalla.yalla.model.PremiumShopModel.PremiumInfo");
        this.vipInfo = (PremiumShopModel.PremiumInfo) serializable;
    }

    @Override // p586o0oOooO0.oO0Oo0o0
    public void onLazyInit() {
        super.onLazyInit();
        getBinding().f44493OooO00o.OooOO0O(false);
        initView();
        loadData();
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public o0O0OO0 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o0O0OO0 o0o0oo0Inflate = o0O0OO0.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(o0o0oo0Inflate, "inflate(...)");
        return o0o0oo0Inflate;
    }
}
