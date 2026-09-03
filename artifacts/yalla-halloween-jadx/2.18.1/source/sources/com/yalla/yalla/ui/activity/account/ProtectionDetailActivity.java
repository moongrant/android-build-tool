package com.yalla.yalla.ui.activity.account;

import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.TrustedDevice;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.account.ProtectionDetailVM;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p478o0OooooO.oO0OoOO0;
import p501o0o00o.o0ooOOo;
import p534o0o0OOo0.o0OO0o;
import p621o0oo0o0o.o00O0;
import p649o0ooOOoo.r6;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/ProtectionDetailActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ProtectionDetailActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final /* synthetic */ int f21828Ooooo0o = 0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21829OoooOoo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ProtectionDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.ProtectionDetailActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.ProtectionDetailActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.ProtectionDetailActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f21833Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21833Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final o00O000o f21830Ooooo00 = new o00O000o(Reflection.getOrCreateKotlinClass(r6.class), this, null);

    public final r6 OooOoo() {
        return (r6) this.f21830Ooooo00.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50418OooO00o);
        Window window = getWindow();
        if (window != null) {
            oO0OoOO0.OooO0Oo(window, 100);
        }
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            oO0OoOO0.OooO0OO(headerLayout);
        }
        OooOo(R.string.account_delete_device_detail);
        int i = 1;
        OooOo0O(1);
        Serializable serializableExtra = getIntent().getSerializableExtra("TrustedDevice");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.model.TrustedDevice");
        TrustedDevice trustedDevice = (TrustedDevice) serializableExtra;
        if (trustedDevice.getIsCurrent()) {
            TextView textView = OooOoo().f50420OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvDelete");
            oOO00O.OooO00o(textView);
        } else {
            TextView textView2 = OooOoo().f50420OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvDelete");
            oOO00O.OooO(textView2);
        }
        OooOoo().f50421OooO0Oo.setText(trustedDevice.getPhoneType());
        OooOoo().f50419OooO0O0.setText(trustedDevice.getAppType() == 1 ? o000O0O0.OooO0OO(R.string.account_protection_detail_app_type_ios) : o000O0O0.OooO0OO(R.string.account_protection_detail_app_type_android));
        OooOoo().f50422OooO0o0.setText(o00O0.f48624OooO00o.OooO0OO(trustedDevice.getLastLoginTime(), "dd/MM/yyyy HH:mm"));
        OooOoo().f50420OooO0OO.setOnClickListener(new o0OO0o(this, trustedDevice));
        ((ProtectionDetailVM) this.f21829OoooOoo.getValue()).isOperatingSuccess().observe(this, new o0ooOOo(this, i));
    }
}
