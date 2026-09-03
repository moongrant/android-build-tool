package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.account.AccountVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.o00O0O;
import p405o0Oo0OOO.o00O000;
import p491o0o00O0o.o0o0Oo;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/PhoneBindActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPhoneBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneBindActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneBindActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,116:1\n22#2,2:117\n75#3,13:119\n*S KotlinDebug\n*F\n+ 1 PhoneBindActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneBindActivity\n*L\n32#1:117,2\n33#1:119,13\n*E\n"})
public final class PhoneBindActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f24787OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public String f24789OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public String f24791OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24788OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o00O000.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24790OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.PhoneBindActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f24794OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24794OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public final o00O000 OooOo() {
        return (o00O000) this.f24788OooOOoo.getValue();
    }

    public final void OooOoO0() {
        String str = this.f24789OooOo0;
        if (str == null || StringsKt.isBlank(str)) {
            FrameLayout flChangePwd = OooOo().f44259OooO0O0;
            Intrinsics.checkNotNullExpressionValue(flChangePwd, "flChangePwd");
            o000O.OooO0O0(flChangePwd);
            OooOo().f44260OooO0OO.setImageResource(o0Oo0oo.ic_account_phone_gray);
            OooOo().f44264OooO0oO.setText(o0000.OooO0OO(o000000.title_Phone_noBind));
            OooOo().f44262OooO0o.setText(o0000.OooO0OO(o000000.title_Phone_connectPhone));
            return;
        }
        FrameLayout flChangePwd2 = OooOo().f44259OooO0O0;
        Intrinsics.checkNotNullExpressionValue(flChangePwd2, "flChangePwd");
        o000O.OooOOOO(flChangePwd2);
        OooOo().f44260OooO0OO.setImageResource(o0Oo0oo.ic_account_phone_green);
        OooOo().f44264OooO0oO.setText("\u202d+" + this.f24789OooOo0 + "\u202c");
        OooOo().f44262OooO0o.setText(o0000.OooO0OO(o000000.title_Phone_changePhone));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 102 && i2 == -1) {
            setResult(-1);
            o00O0O.OooO0Oo(((AccountVM) this.f24790OooOo00.getValue()).getAccountBindInfo(), this, false, null, null, new o0o0Oo(this), 14);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (!Intrinsics.areEqual(view, OooOo().f44261OooO0Oo)) {
            if (Intrinsics.areEqual(view, OooOo().f44263OooO0o0)) {
                Intrinsics.checkNotNullParameter(this, "activity");
                startActivity(new Intent(this, (Class<?>) ChangePasswordActivity.class));
                return;
            }
            return;
        }
        String str = this.f24789OooOo0;
        if (!(str == null || StringsKt.isBlank(str))) {
            SmsCodeActivity.OooO00o.OooO00o(this, this.f24789OooOo0, this.f24791OooOo0O, ClientCodeType.ChangeOld, 0, null, 0, null, false, 496);
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
        setContentView(OooOo().f44258OooO00o);
        this.f24789OooOo0 = getIntent().getStringExtra("ACCOUNT_BIND_PHONE");
        this.f24791OooOo0O = getIntent().getStringExtra("ACCOUNT_BIND_PHONE_COUNTRY_CODE");
        OooOOoo(o000000.title_Phone_Phone);
        int i = 1;
        OooOOo0(1);
        OooOoO0();
        OooOo().f44261OooO0Oo.setOnClickListener(this);
        OooOo().f44263OooO0o0.setOnClickListener(this);
        LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new com.yalla.yalla.mixedroom.OooOO0(this, i));
        LiveEventBus.get("ACCOUNT_CHANGE_PASSWORD").observe(this, new com.yalla.yalla.mixedroom.OooOO0O(this, i));
        LinearLayout llBindNum = OooOo().f44261OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(llBindNum, "llBindNum");
        o000O.OooOOOO(llBindNum);
    }
}
