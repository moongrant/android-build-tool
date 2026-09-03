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
import com.code.android.util.o000O;
import com.code.android.util.o000O0;
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
import p379o0OOoOOO.oOO00O;
import p405o0Oo0OOO.o00O000o;
import p491o0o00O0o.o0O00O;
import p491o0o00O0o.o0O00OO;
import p562o0oOo000.o000000;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/ProtectionDetailActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nProtectionDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtectionDetailActivity.kt\ncom/yalla/yalla/ui/activity/account/ProtectionDetailActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,83:1\n75#2,13:84\n22#3,2:97\n*S KotlinDebug\n*F\n+ 1 ProtectionDetailActivity.kt\ncom/yalla/yalla/ui/activity/account/ProtectionDetailActivity\n*L\n30#1:84,13\n31#1:97,2\n*E\n"})
public final class ProtectionDetailActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f24825OooOo0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24826OooOOoo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ProtectionDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.ProtectionDetailActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f24831OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24831OooO0Oo;
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
    public final o000O0 f24827OooOo00 = new o000O0(Reflection.getOrCreateKotlinClass(o00O000o.class), this, null);

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f24828OooO0Oo;

        public OooO00o(o0O00OO function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24828OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f24828OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24828OooO0Oo;
        }

        public final int hashCode() {
            return this.f24828OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24828OooO0Oo.invoke(obj);
        }
    }

    public final o00O000o OooOo() {
        return (o00O000o) this.f24827OooOo00.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44277OooO00o);
        Window window = getWindow();
        if (window != null) {
            oOO00O.OooO0OO(window, 100);
        }
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            oOO00O.OooO0O0(headerLayout);
        }
        OooOOoo(o000000.account_delete_device_detail);
        OooOOo0(1);
        Serializable serializableExtra = getIntent().getSerializableExtra("TrustedDevice");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.model.TrustedDevice");
        TrustedDevice trustedDevice = (TrustedDevice) serializableExtra;
        if (trustedDevice.getIsCurrent()) {
            TextView tvDelete = OooOo().f44279OooO0OO;
            Intrinsics.checkNotNullExpressionValue(tvDelete, "tvDelete");
            o000O.OooO0O0(tvDelete);
        } else {
            TextView tvDelete2 = OooOo().f44279OooO0OO;
            Intrinsics.checkNotNullExpressionValue(tvDelete2, "tvDelete");
            o000O.OooOOOO(tvDelete2);
        }
        OooOo().f44280OooO0Oo.setText(trustedDevice.getPhoneType());
        OooOo().f44278OooO0O0.setText(trustedDevice.getAppType() == 1 ? o0000.OooO0OO(o000000.account_protection_detail_app_type_ios) : o0000.OooO0OO(o000000.account_protection_detail_app_type_android));
        OooOo().f44281OooO0o0.setText(o0O0O0o0.OooO0OO(trustedDevice.getLastLoginTime(), "dd/MM/yyyy HH:mm"));
        OooOo().f44279OooO0OO.setOnClickListener(new o0O00O(this, trustedDevice));
        ((ProtectionDetailVM) this.f24826OooOOoo.getValue()).isOperatingSuccess().observe(this, new OooO00o(new o0O00OO(this)));
    }
}
