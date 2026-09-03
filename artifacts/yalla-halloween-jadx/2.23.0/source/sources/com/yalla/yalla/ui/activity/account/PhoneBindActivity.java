package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.account.AccountVM;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o000O000;
import p464o0Oooo.o000000O;
import p474o0o00.o00O0O0;
import p474o0o00.o00O0O00;
import p474o0o00.o00O0O0O;
import p474o0o00.o00O0OO0;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.a0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/PhoneBindActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhoneBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneBindActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneBindActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,119:1\n22#2,2:120\n75#3,13:122\n*S KotlinDebug\n*F\n+ 1 PhoneBindActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneBindActivity\n*L\n32#1:120,2\n33#1:122,13\n*E\n"})
public final class PhoneBindActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f25241OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public String f25243OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public String f25245OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25242OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(a0.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25244OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.PhoneBindActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.PhoneBindActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.PhoneBindActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25249OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25249OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25246OooO0Oo;

        public OooO00o(o00O0OO0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25246OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25246OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25246OooO0Oo;
        }

        public final int hashCode() {
            return this.f25246OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25246OooO0Oo.invoke(obj);
        }
    }

    public final a0 OooOo() {
        return (a0) this.f25242OooOOoo.getValue();
    }

    public final void OooOoO0() {
        String str = this.f25243OooOo0;
        if (str == null || StringsKt.isBlank(str)) {
            FrameLayout frameLayout = OooOo().f57456OooO0O0;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.flChangePwd");
            o000OO00.OooO0O0(frameLayout);
            OooOo().f57457OooO0OO.setImageResource(oOo00OO0.ic_account_phone_gray);
            OooOo().f57461OooO0oO.setText(o0000.OooO0OO(oO00OOo0.title_Phone_noBind));
            OooOo().f57459OooO0o.setText(o0000.OooO0OO(oO00OOo0.title_Phone_connectPhone));
            return;
        }
        FrameLayout frameLayout2 = OooOo().f57456OooO0O0;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "binding.flChangePwd");
        o000OO00.OooOOOO(frameLayout2);
        OooOo().f57457OooO0OO.setImageResource(oOo00OO0.ic_account_phone_green);
        OooOo().f57461OooO0oO.setText("\u202d+" + this.f25243OooOo0 + "\u202c");
        OooOo().f57459OooO0o.setText(o0000.OooO0OO(oO00OOo0.title_Phone_changePhone));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 102 && i2 == -1) {
            setResult(-1);
            o000O000.OooO0Oo(((AccountVM) this.f25244OooOo00.getValue()).getAccountBindInfo(), this, false, null, null, new o00O0O00(this), 14);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (!Intrinsics.areEqual(view, OooOo().f57458OooO0Oo)) {
            if (Intrinsics.areEqual(view, OooOo().f57460OooO0o0)) {
                Intrinsics.checkNotNullParameter(this, "activity");
                startActivity(new Intent(this, (Class<?>) ChangePasswordActivity.class));
                return;
            }
            return;
        }
        String str = this.f25243OooOo0;
        if (!(str == null || StringsKt.isBlank(str))) {
            SmsCodeActivity.OooO00o.OooO00o(this, this.f25243OooOo0, this.f25245OooOo0O, ClientCodeType.ChangeOld, 0, null, 0, null, false, 496);
            return;
        }
        ClientCodeType clientCodeType = ClientCodeType.BingingPhone;
        Intrinsics.checkNotNullParameter(this, "context");
        Intent intent = new Intent(this, (Class<?>) PhoneNumberActivity.class);
        intent.putExtra("PHONE_NUMBER", (String) null);
        intent.putExtra("TYPE_ACCOUNT", clientCodeType);
        startActivity(intent);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f57455OooO00o);
        this.f25243OooOo0 = getIntent().getStringExtra("ACCOUNT_BIND_PHONE");
        this.f25245OooOo0O = getIntent().getStringExtra("ACCOUNT_BIND_PHONE_COUNTRY_CODE");
        OooOOoo(oO00OOo0.title_Phone_Phone);
        OooOOo0(1);
        OooOoO0();
        OooOo().f57458OooO0Oo.setOnClickListener(this);
        OooOo().f57460OooO0o0.setOnClickListener(this);
        LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new o00O0O0(this));
        LiveEventBus.get("ACCOUNT_CHANGE_PASSWORD").observe(this, new o00O0O0O(this));
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooOo0().observe(this, new OooO00o(new o00O0OO0(this)));
    }
}
