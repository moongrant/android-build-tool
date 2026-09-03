package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.application.App;
import com.app.base.http.ApiEvent;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.snackbar.Snackbar;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.account.LoginVM;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o000000O;
import p142o00OOooO.o000OOo;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p391o0OOooOo.o0O00000;
import p478o0OooooO.oO0OoOO0;
import p487o0o000oO.o0OOO0o;
import p502o0o00o0.o00000O0;
import p522o0o0O0o.oo0o0O0;
import p534o0o0OOo0.o0O00O;
import p534o0o0OOo0.o0O00OO;
import p534o0o0OOo0.o0O00OOO;
import p534o0o0OOo0.o0O00o00;
import p534o0o0OOo0.o0OoOoOo;
import p534o0o0OOo0.o0oO0Ooo;
import p620o0oo0o0O.o00O00OO;
import p620o0oo0o0O.o00O00o0;
import p649o0ooOOoo.m6;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/LoginActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class LoginActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f21752OooooO0 = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f21753OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(m6.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21754Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(LoginVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.LoginActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.LoginActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.LoginActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f21759Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21759Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f21755Ooooo0o = LazyKt.lazy(new OooO0OO());

    public static final class OooO00o {
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpenAuthManager.AuthType.values().length];
            iArr[OpenAuthManager.AuthType.Facebook.ordinal()] = 1;
            iArr[OpenAuthManager.AuthType.Twitter.ordinal()] = 2;
            iArr[OpenAuthManager.AuthType.Instagram.ordinal()] = 3;
            iArr[OpenAuthManager.AuthType.WeChat.ordinal()] = 4;
            iArr[OpenAuthManager.AuthType.YallaChat.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<OpenAuthManager> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OpenAuthManager invoke() {
            return new OpenAuthManager(LoginActivity.this);
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOOO() {
        overridePendingTransition(R.anim.anim_empty, R.anim.account_anim_below_out);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOOo() {
        overridePendingTransition(R.anim.account_anim_below_in, R.anim.anim_empty);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOOo0() {
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final boolean OooOo0() {
        return false;
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOo0o() {
    }

    public final OpenAuthManager OooOoo() {
        return (OpenAuthManager) this.f21755Ooooo0o.getValue();
    }

    public final m6 OooOooO() {
        return (m6) this.f21753OoooOoo.getValue();
    }

    public final void OooOooo() {
        Snackbar snackbarOooOO0O = Snackbar.OooOO0O(OooOooO().f50000OooOO0);
        snackbarOooOO0O.OooOO0o(new o00000O0(this, 1));
        snackbarOooOO0O.f17697OooO0o0 = 5000;
        snackbarOooOO0O.OooOOO0();
    }

    public final void Oooo000(OpenAuthManager.AuthType authType) {
        int i = OooO0O0.$EnumSwitchMapping$0[authType.ordinal()];
        if (i == 1) {
            App.f11456Oooo = 2;
            o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
            new ApiEvent().OooO00o(20);
            o0O00000.OooO0OO("Facebook");
            OooOoo().OooO00o();
            return;
        }
        if (i == 2) {
            App.f11456Oooo = 3;
            o00oO0o o00oo0o3 = o00000OO.f32207OooO00o;
            new ApiEvent().OooO00o(20);
            o0O00000.OooO0OO("Twitter");
            OooOoo().OooO0OO();
            return;
        }
        if (i == 3) {
            App.f11456Oooo = 4;
            o00oO0o o00oo0o4 = o00000OO.f32207OooO00o;
            new ApiEvent().OooO00o(20);
            o0O00000.OooO0OO("Instagram");
            OooOoo().OooO0O0();
            return;
        }
        if (i == 4) {
            App.f11456Oooo = 5;
            o00oO0o o00oo0o5 = o00000OO.f32207OooO00o;
            new ApiEvent().OooO00o(20);
            OooOoo().OooO0Oo();
            return;
        }
        if (i != 5) {
            return;
        }
        App.f11456Oooo = 7;
        o00oO0o o00oo0o6 = o00000OO.f32207OooO00o;
        new ApiEvent().OooO00o(20);
        OooOoo().OooO0o0();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        OooOoO();
        OooOoo().OooO0oO(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        LiveEventBus.get("LOGIN_RESULT").post(Boolean.FALSE);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOooO().f49997OooO0o0)) {
            LiveEventBus.get("LOGIN_RESULT").post(Boolean.FALSE);
            finish();
            return;
        }
        if (Intrinsics.areEqual(view, OooOooO().f49993OooO0O0)) {
            Oooo000(OpenAuthManager.AuthType.Facebook);
            return;
        }
        if (Intrinsics.areEqual(view, OooOooO().f49998OooO0oO)) {
            Oooo000(OpenAuthManager.AuthType.Twitter);
            return;
        }
        if (Intrinsics.areEqual(view, OooOooO().f49999OooO0oo)) {
            Oooo000(OpenAuthManager.AuthType.WeChat);
            return;
        }
        if (Intrinsics.areEqual(view, OooOooO().f49995OooO0Oo)) {
            o0O00000.OooO0OO("Sign_Log_Yallachat");
            Oooo000(OpenAuthManager.AuthType.YallaChat);
            return;
        }
        if (Intrinsics.areEqual(view, OooOooO().f49994OooO0OO)) {
            App.f11456Oooo = 1;
            o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
            new ApiEvent().OooO00o(20);
            o0O00000.OooO0OO("Sign_Log");
            ClientCodeType clientCodeType = ClientCodeType.Login;
            o00O00o0 startForResultManagerCallback = new o00O00o0() { // from class: o0o0OOo0.o0O000Oo
                @Override // p620o0oo0o0O.o00O00o0
                public final void onActivityResult(int i, Intent intent) {
                    LoginActivity this$0 = this.f43544OooO00o;
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.OooOooo();
                }
            };
            Intrinsics.checkNotNullParameter(startForResultManagerCallback, "startForResultManagerCallback");
            Bundle bundle = new Bundle();
            bundle.putString("PHONE_NUMBER", null);
            bundle.putSerializable("TYPE_ACCOUNT", clientCodeType);
            o00O00OO o00o00oo2 = new o00O00OO(this);
            o00o00oo2.OooO00o(bundle);
            o00o00oo2.f48618OooO0O0 = PhoneNumberActivity.class;
            o00o00oo2.OooO0O0(startForResultManagerCallback);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f49992OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        int i = 0;
        oO0OoOO0.OooO0Oo(window, 0);
        ImageView imageView = OooOooO().f49997OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivClose");
        oO0OoOO0.OooO0O0(imageView, false, 3);
        OooOooO().f49997OooO0o0.setOnClickListener(this);
        OooOooO().f49993OooO0O0.setOnClickListener(this);
        OooOooO().f49994OooO0OO.setOnClickListener(this);
        OooOooO().f49995OooO0Oo.setOnClickListener(this);
        OooOooO().f49998OooO0oO.setOnClickListener(this);
        OooOooO().f49999OooO0oo.setOnClickListener(this);
        if (!o0OOO0o.OooO0OO()) {
            OooOooO().f49996OooO0o.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o0OOo0.o0O000O
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    LoginActivity context = this.f43543Oooo0o;
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    Intrinsics.checkNotNullParameter(context, "this$0");
                    Intrinsics.checkNotNullParameter(context, "context");
                    return true;
                }
            });
        }
        TextView textView = OooOooO().f49991OooO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTermsService");
        oo0o0O0.OooO0O0(textView, o000O0O0.OooO0OO(R.string.terms_service), new o0oO0Ooo(this));
        TextView textView2 = OooOooO().f49991OooO;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvTermsService");
        oo0o0O0.OooO0O0(textView2, o000O0O0.OooO0OO(R.string.privacy_policy), new o0O00o00(this));
        TextView textView3 = OooOooO().f49991OooO;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTermsService");
        int i2 = 1;
        oo0o0O0.OooO0o0(textView3, new String[]{o000O0O0.OooO0OO(R.string.terms_service), o000O0O0.OooO0OO(R.string.privacy_policy)}, o000O0O0.OooO00o(R.color.color_e9a711));
        p487o0o000oO.o00oO0o o00oo0o2 = p487o0o000oO.o00oO0o.f40931OooO00o;
        p487o0o000oO.o00oO0o.OooO00o().observe(this, new o0OoOoOo(this, i));
        OooOoo().f21648OooO0O0 = new o0O00O(this);
        OooOoo().f21650OooO0Oo = new o0O00OO(this);
        OooOoo().f21649OooO0OO = new o0O00OOO(this);
        LiveEventBus.get("LOGIN_RESULT").observe(this, new o000OOo(this, i2));
        LiveEventBus.get("ACTIVE_ACCOUNT").observe(this, new o000000O(this, i2));
        LiveEventBus.get("SHOW_APPEAL_DIALOG").observeSticky(this, new p142o00OOooO.o00000OO(this, 2));
    }

    @Override // android.app.Activity
    public final void recreate() {
    }
}
