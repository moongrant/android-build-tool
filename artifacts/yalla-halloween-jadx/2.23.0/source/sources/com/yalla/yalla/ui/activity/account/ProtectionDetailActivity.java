package com.yalla.yalla.ui.activity.account;

import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.TrustedDevice;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.account.ProtectionDetailVM;
import java.io.Serializable;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p474o0o00.o0O0o;
import p474o0o00.o0oOOo;
import p584o0oOooO0.oO00OOo0;
import p601o0oo0O0.o0000oo;
import p641o0ooOOOO.b0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/ProtectionDetailActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nProtectionDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtectionDetailActivity.kt\ncom/yalla/yalla/ui/activity/account/ProtectionDetailActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,83:1\n75#2,13:84\n22#3,2:97\n*S KotlinDebug\n*F\n+ 1 ProtectionDetailActivity.kt\ncom/yalla/yalla/ui/activity/account/ProtectionDetailActivity\n*L\n30#1:84,13\n31#1:97,2\n*E\n"})
public final class ProtectionDetailActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f25280OooOo0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25281OooOOoo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ProtectionDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.ProtectionDetailActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25286OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25286OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25282OooOo00 = new o000O0Oo(Reflection.getOrCreateKotlinClass(b0.class), this, null);

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25283OooO0Oo;

        public OooO00o(o0O0o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25283OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25283OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25283OooO0Oo;
        }

        public final int hashCode() {
            return this.f25283OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25283OooO0Oo.invoke(obj);
        }
    }

    public final b0 OooOo() {
        return (b0) this.f25282OooOo00.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f57532OooO00o);
        Window window = getWindow();
        if (window != null) {
            p370o0OOoO.OooOOO0.OooO0OO(window, 100);
        }
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            p370o0OOoO.OooOOO0.OooO0O0(headerLayout);
        }
        OooOOoo(oO00OOo0.account_delete_device_detail);
        OooOOo0(1);
        Serializable serializableExtra = getIntent().getSerializableExtra("TrustedDevice");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.model.TrustedDevice");
        TrustedDevice trustedDevice = (TrustedDevice) serializableExtra;
        if (trustedDevice.getIsCurrent()) {
            TextView textView = OooOo().f57534OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvDelete");
            o000OO00.OooO0O0(textView);
        } else {
            TextView textView2 = OooOo().f57534OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvDelete");
            o000OO00.OooOOOO(textView2);
        }
        OooOo().f57535OooO0Oo.setText(trustedDevice.getPhoneType());
        OooOo().f57533OooO0O0.setText(trustedDevice.getAppType() == 1 ? o0000.OooO0OO(oO00OOo0.account_protection_detail_app_type_ios) : o0000.OooO0OO(oO00OOo0.account_protection_detail_app_type_android));
        OooOo().f57536OooO0o0.setText(o0000oo.OooO0OO(trustedDevice.getLastLoginTime(), "dd/MM/yyyy HH:mm"));
        OooOo().f57534OooO0OO.setOnClickListener(new o0oOOo(this, trustedDevice));
        ((ProtectionDetailVM) this.f25281OooOOoo.getValue()).isOperatingSuccess().observe(this, new OooO00o(new o0O0o(this)));
    }
}
