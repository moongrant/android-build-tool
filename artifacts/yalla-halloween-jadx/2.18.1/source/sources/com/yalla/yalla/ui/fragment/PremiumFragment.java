package com.yalla.yalla.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.model.VipPrivilegeInfo;
import com.yalla.yalla.model.VipPrivilegeModel;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O0O;
import p649o0ooOOoo.pi;
import p649o0ooOOoo.t8;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0014R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/yalla/yalla/ui/fragment/PremiumFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/t8;", "", "initView", "loadData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "Lcom/yalla/yalla/ui/vm/main/PremiumVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/main/PremiumVM;", "vm", "Lo00o00o0/OooO0OO;", "Lcom/yalla/yalla/model/VipPrivilegeInfo;", "adapter$delegate", "getAdapter", "()Lo00o00o0/OooO0OO;", "adapter", "Lcom/yalla/yalla/model/PremiumShopModel$PremiumInfo;", "vipInfo", "Lcom/yalla/yalla/model/PremiumShopModel$PremiumInfo;", "Lo0ooOOoo/pi;", "bindingHeader$delegate", "getBindingHeader", "()Lo0ooOOoo/pi;", "bindingHeader", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PremiumFragment extends p503o0o00o00.OooO<t8> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String Key_data = "data";
    private PremiumShopModel.PremiumInfo vipInfo;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(PremiumVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.PremiumFragment$special$$inlined$activityViewModels$default$1
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f24155Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24155Oooo0o;
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
            if (vipPrivilegeModel2 == null) {
                PremiumFragment.this.getBinding().f50634OooO00o.OooO0o();
            } else {
                PremiumFragment.this.getAdapter().setNewData(vipPrivilegeModel2.getData());
                TextView textView = PremiumFragment.this.getBindingHeader().f50335OooO0Oo;
                StringBuilder sbOooO00o = o00O0O0O.OooO00o('(');
                sbOooO00o.append(vipPrivilegeModel2.getVipcount());
                sbOooO00o.append('/');
                sbOooO00o.append(vipPrivilegeModel2.getSumcount());
                sbOooO00o.append(')');
                textView.setText(sbOooO00o.toString());
                PremiumFragment.this.getBinding().f50634OooO00o.OooO0Oo();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.PremiumFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0000O0> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000O0 invoke() {
            return new o0000O0(PremiumFragment.this, PremiumFragment.this.getContext());
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<pi> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final pi invoke() {
            pi piVarInflate = pi.inflate(PremiumFragment.this.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(piVarInflate, "inflate(layoutInflater)");
            return piVarInflate;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PremiumFragment.this.getBinding().f50634OooO00o.OooO0oo();
            PremiumFragment.this.loadData();
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
            PremiumFragment.this.getBinding().f50634OooO00o.OooO0o();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p188o00o00o0.OooO0OO<VipPrivilegeInfo> getAdapter() {
        return (p188o00o00o0.OooO0OO) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pi getBindingHeader() {
        return (pi) this.bindingHeader.getValue();
    }

    private final PremiumVM getVm() {
        return (PremiumVM) this.vm.getValue();
    }

    private final void initView() {
        getBinding().f50635OooO0O0.setLayoutManager(new FixGridLayoutManager(getContext(), 2));
        getAdapter().isUseEmpty(false);
        getAdapter().addHeaderView(getBindingHeader().f50332OooO00o);
        getBinding().f50635OooO0O0.setAdapter(getAdapter());
        UserPremiumView userPremiumView = getBindingHeader().f50333OooO0O0;
        PremiumShopModel.PremiumInfo premiumInfo = this.vipInfo;
        PremiumShopModel.PremiumInfo premiumInfo2 = null;
        if (premiumInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vipInfo");
            premiumInfo = null;
        }
        userPremiumView.OooO0o0(true, premiumInfo.getVipLevel());
        TextView textView = getBindingHeader().f50334OooO0OO;
        PremiumShopModel.PremiumInfo premiumInfo3 = this.vipInfo;
        if (premiumInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vipInfo");
        } else {
            premiumInfo2 = premiumInfo3;
        }
        textView.setText(premiumInfo2.getVipName());
        StateLayout stateLayout = getBinding().f50634OooO00o;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.root");
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
        vm.loadVipPrivilegeList(Integer.parseInt(premiumInfo.getShopid())).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooO(), new OooOO0(), null, false, 12));
    }

    @Override // p503o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("data") : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.yalla.yalla.model.PremiumShopModel.PremiumInfo");
        this.vipInfo = (PremiumShopModel.PremiumInfo) serializable;
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        getBinding().f50634OooO00o.OooOO0O(false);
        initView();
        loadData();
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public t8 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        t8 t8VarInflate = t8.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(t8VarInflate, "inflate(inflater)");
        return t8VarInflate;
    }
}
