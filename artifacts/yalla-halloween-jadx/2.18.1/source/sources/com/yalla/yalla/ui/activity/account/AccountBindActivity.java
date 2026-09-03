package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.view.HeaderLayout;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.account.AccountVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p164o00OoOo0.o00OO0OO;
import p254o00ooO0O.o00O000o;
import p524o0o0O0oO.o0O0O0Oo;
import p534o0o0OOo0.o00O;
import p534o0o0OOo0.o00O0O0;
import p534o0o0OOo0.o00O0OO;
import p534o0o0OOo0.o00O0OOO;
import p534o0o0OOo0.oo0oOO0;
import p617o0oo0o.Oooo000;
import p649o0ooOOoo.f6;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/AccountBindActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class AccountBindActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f21702OooooOO = new OooO00o();

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public OpenAuthManager f21704Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public AccountBindInfo f21705Ooooo0o;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f21703OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(f6.class), this, null);

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21706OooooO0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.AccountBindActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.AccountBindActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.AccountBindActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f21709Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21709Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO00o {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoo() {
        BaseActivityK.OooOoo0(this, null, 0L, 3, null);
        ((AccountVM) this.f21706OooooO0.getValue()).getAccountBindInfo().observe(this, new o00OO0OO(this, 2));
    }

    public final f6 OooOooO() {
        return (f6) this.f21703OoooOoo.getValue();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        OpenAuthManager openAuthManager = this.f21704Ooooo00;
        if (openAuthManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            openAuthManager = null;
        }
        openAuthManager.OooO0oO(i, i2, intent);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (this.f21705Ooooo0o == null) {
            return;
        }
        if (Intrinsics.areEqual(view, OooOooO().f49323OooOO0)) {
            AccountBindInfo accountBindInfo = this.f21705Ooooo0o;
            Intrinsics.checkNotNullParameter(this, "activity");
            if (accountBindInfo == null) {
                return;
            }
            Intent intent = new Intent(this, (Class<?>) PhoneBindActivity.class);
            intent.putExtra("ACCOUNT_BIND_INFO", accountBindInfo);
            startActivity(intent);
            return;
        }
        OpenAuthManager openAuthManager = null;
        if (Intrinsics.areEqual(view, OooOooO().f49322OooO0oo)) {
            AccountBindInfo accountBindInfo2 = this.f21705Ooooo0o;
            Intrinsics.checkNotNull(accountBindInfo2);
            if (!Oooo000.OooO0O0(accountBindInfo2.getIsFb())) {
                BaseActivityK.OooOoo0(this, null, 0L, 3, null);
                OpenAuthManager openAuthManager2 = this.f21704Ooooo00;
                if (openAuthManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
                } else {
                    openAuthManager = openAuthManager2;
                }
                openAuthManager.OooO00o();
                return;
            }
            AccountBindInfo accountBindInfo3 = this.f21705Ooooo0o;
            Intrinsics.checkNotNullParameter(this, "activity");
            if (accountBindInfo3 == null) {
                return;
            }
            Intent intent2 = new Intent(this, (Class<?>) UntieAccountBindActivity.class);
            intent2.putExtra("LOGIN_PLATFORM_DATA", accountBindInfo3);
            intent2.putExtra("UNTIE_TYPE", 4);
            startActivity(intent2);
            return;
        }
        if (Intrinsics.areEqual(view, OooOooO().f49326OooOOO)) {
            AccountBindInfo accountBindInfo4 = this.f21705Ooooo0o;
            Intrinsics.checkNotNull(accountBindInfo4);
            if (!Oooo000.OooO0O0(accountBindInfo4.getIsYc())) {
                OpenAuthManager openAuthManager3 = this.f21704Ooooo00;
                if (openAuthManager3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
                } else {
                    openAuthManager = openAuthManager3;
                }
                openAuthManager.OooO0o0();
                return;
            }
            AccountBindInfo accountBindInfo5 = this.f21705Ooooo0o;
            Intrinsics.checkNotNullParameter(this, "activity");
            if (accountBindInfo5 == null) {
                return;
            }
            Intent intent3 = new Intent(this, (Class<?>) UntieAccountBindActivity.class);
            intent3.putExtra("LOGIN_PLATFORM_DATA", accountBindInfo5);
            intent3.putExtra("UNTIE_TYPE", 12);
            startActivity(intent3);
            return;
        }
        if (Intrinsics.areEqual(view, OooOooO().f49324OooOO0O)) {
            AccountBindInfo accountBindInfo6 = this.f21705Ooooo0o;
            Intrinsics.checkNotNull(accountBindInfo6);
            if (!Oooo000.OooO0O0(accountBindInfo6.getIsTt())) {
                OpenAuthManager openAuthManager4 = this.f21704Ooooo00;
                if (openAuthManager4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
                } else {
                    openAuthManager = openAuthManager4;
                }
                openAuthManager.OooO0OO();
                return;
            }
            AccountBindInfo accountBindInfo7 = this.f21705Ooooo0o;
            Intrinsics.checkNotNullParameter(this, "activity");
            if (accountBindInfo7 == null) {
                return;
            }
            Intent intent4 = new Intent(this, (Class<?>) UntieAccountBindActivity.class);
            intent4.putExtra("LOGIN_PLATFORM_DATA", accountBindInfo7);
            intent4.putExtra("UNTIE_TYPE", 9);
            startActivity(intent4);
            return;
        }
        if (Intrinsics.areEqual(view, OooOooO().f49314OooO)) {
            AccountBindInfo accountBindInfo8 = this.f21705Ooooo0o;
            Intrinsics.checkNotNull(accountBindInfo8);
            if (!Oooo000.OooO0O0(accountBindInfo8.getIsIg())) {
                BaseActivityK.OooOoo0(this, null, 0L, 3, null);
                OpenAuthManager openAuthManager5 = this.f21704Ooooo00;
                if (openAuthManager5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
                } else {
                    openAuthManager = openAuthManager5;
                }
                openAuthManager.OooO0O0();
                return;
            }
            AccountBindInfo accountBindInfo9 = this.f21705Ooooo0o;
            Intrinsics.checkNotNullParameter(this, "activity");
            if (accountBindInfo9 == null) {
                return;
            }
            Intent intent5 = new Intent(this, (Class<?>) UntieAccountBindActivity.class);
            intent5.putExtra("LOGIN_PLATFORM_DATA", accountBindInfo9);
            intent5.putExtra("UNTIE_TYPE", 7);
            startActivity(intent5);
            return;
        }
        if (Intrinsics.areEqual(view, OooOooO().f49327OooOOO0)) {
            OpenAuthManager openAuthManager6 = this.f21704Ooooo00;
            if (openAuthManager6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
                openAuthManager6 = null;
            }
            if (!openAuthManager6.OooO0o()) {
                ToastUtil.f12567OooO00o.OooO0O0(OooOo.OooO00o(OooOOO.OooO0OO(R.string.Please_install_XXX), OooOOO.OooO0OO(R.string.single_third_weChat)));
                return;
            }
            AccountBindInfo accountBindInfo10 = this.f21705Ooooo0o;
            Intrinsics.checkNotNull(accountBindInfo10);
            if (!Oooo000.OooO0O0(accountBindInfo10.getIsWx())) {
                OpenAuthManager openAuthManager7 = this.f21704Ooooo00;
                if (openAuthManager7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
                } else {
                    openAuthManager = openAuthManager7;
                }
                openAuthManager.OooO0Oo();
                return;
            }
            AccountBindInfo accountBindInfo11 = this.f21705Ooooo0o;
            Intrinsics.checkNotNullParameter(this, "activity");
            if (accountBindInfo11 == null) {
                return;
            }
            Intent intent6 = new Intent(this, (Class<?>) UntieAccountBindActivity.class);
            intent6.putExtra("LOGIN_PLATFORM_DATA", accountBindInfo11);
            intent6.putExtra("UNTIE_TYPE", 5);
            startActivity(intent6);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f49315OooO00o);
        OpenAuthManager openAuthManager = new OpenAuthManager(this);
        this.f21704Ooooo00 = openAuthManager;
        openAuthManager.f21648OooO0O0 = new o00O0OO(this);
        OpenAuthManager openAuthManager2 = this.f21704Ooooo00;
        OpenAuthManager openAuthManager3 = null;
        if (openAuthManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            openAuthManager2 = null;
        }
        openAuthManager2.f21650OooO0Oo = new o00O0OOO(this);
        OpenAuthManager openAuthManager4 = this.f21704Ooooo00;
        if (openAuthManager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
        } else {
            openAuthManager3 = openAuthManager4;
        }
        openAuthManager3.f21649OooO0OO = new oo0oOO0(this);
        OooOo(R.string.account_my_account_binding);
        int i = 1;
        OooOo0O(1);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.OooOoOO(R.drawable.icon_nav_more_three_dot, new o00O(this));
        }
        OooOooO().f49323OooOO0.setOnClickListener(this);
        OooOooO().f49322OooO0oo.setOnClickListener(this);
        OooOooO().f49326OooOOO.setOnClickListener(this);
        OooOooO().f49324OooOO0O.setOnClickListener(this);
        OooOooO().f49314OooO.setOnClickListener(this);
        OooOooO().f49327OooOOO0.setOnClickListener(this);
        LiveEventBus.get("ACCOUNT_CHANGE_PASSWORD").observe(this, new o00O0O0(this, 0));
        p498o0o00Oo0.OooOOO.f41216OooO00o.OooOoo().observe(this, new o0O0O0Oo(this, i));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        OooOoo();
    }
}
