package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.account.AccountVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00O0OOO;
import p254o00ooO0O.o00O000o;
import p478o0OooooO.oO0OoOO0;
import p498o0o00Oo0.OooOOO;
import p518o0o0O00o.o000;
import p524o0o0O0oO.o0O00OO;
import p524o0o0O0oO.o0O00oO0;
import p524o0o0O0oO.o0O0O0O;
import p534o0o0OOo0.o00O0O00;
import p649o0ooOOoo.g6;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/AccountActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClick", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class AccountActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final /* synthetic */ int f21695Ooooo0o = 0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f21696OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(g6.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21697Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.AccountActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.AccountActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.AccountActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f21700Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21700Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    @NotNull
    public final g6 OooOoo() {
        return (g6) this.f21696OoooOoo.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClick(view);
        if (Intrinsics.areEqual(view, OooOoo().f49419OooO0O0)) {
            Intrinsics.checkNotNullParameter(this, "activity");
            startActivity(new Intent(this, (Class<?>) AccountBindActivity.class));
        } else if (Intrinsics.areEqual(view, OooOoo().f49420OooO0OO)) {
            Intrinsics.checkNotNullParameter(this, "activity");
            startActivity(new Intent(this, (Class<?>) AccountProtectionActivity.class));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f49418OooO00o);
        Window window = getWindow();
        if (window != null) {
            oO0OoOO0.OooO0Oo(window, 51);
        }
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            oO0OoOO0.OooO0OO(headerLayout);
        }
        OooOo(R.string.my_account);
        int i = 1;
        OooOo0O(1);
        OooOoo().f49419OooO0O0.setOnClickListener(this);
        OooOoo().f49420OooO0OO.setOnClickListener(this);
        BaseActivityK.OooOoo0(this, null, 0L, 3, null);
        OooOOO.f41216OooO00o.OooOoo().observe(this, new o0O00OO(this, i));
        o000 o000Var = o000.f42171OooO00o;
        o000.f42172OooO0O0.observe(this, new o0O00oO0(this, i));
        o000.f42173OooO0OO.observe(this, new o0O0O0O(this, i));
        ((AccountVM) this.f21697Ooooo00.getValue()).getAccountPrivacy().observe(this, new OooOo(null, null, new o00O0O00(this), false, 11));
        LiveEventBus.get("ACCOUNT_CHANGE_PASSWORD").observe(this, new o00O0OOO(this, i));
    }
}
