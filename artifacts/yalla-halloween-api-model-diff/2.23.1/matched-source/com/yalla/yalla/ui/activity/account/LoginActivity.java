package com.yalla.yalla.ui.activity.account;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.snackbar.Snackbar;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.api.old.ApiEvent;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.mixedroom.o00000O;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.account.ReOpenAccountActivity;
import com.yalla.yalla.ui.vm.account.LoginVM;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208o00o0oOO.o0O00;
import p381o0OOoOOO.o00O00o0;
import p386o0OOoo0O.o0ooOOo;
import p386o0OOoo0O.oo0o0Oo;
import p407o0Oo0OOO.o00O0000;
import p422o0OoO0.OooO0OO;
import p425o0OoO0OO.o00O0O0;
import p490o0o00O0.o0000O;
import p490o0o00O0.o0000OO0;
import p490o0o00O0.o000O00;
import p490o0o00O0.o000O00O;
import p490o0o00O0.o000O0Oo;
import p490o0o00O0.o000O0o;
import p490o0o00O0.o000Oo0;
import p515o0o0O00.o0oOO;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o00Ooo;
import p577o0oOoOOO.f;
import p585o0oOoo00.o000000O;
import p593o0oOoooO.h0;
import p604o0oo00oo.o000;
import p604o0oo00oo.o000O000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/LoginActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoginActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginActivity.kt\ncom/yalla/yalla/ui/activity/account/LoginActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,315:1\n22#2,2:316\n75#3,13:318\n*S KotlinDebug\n*F\n+ 1 LoginActivity.kt\ncom/yalla/yalla/ui/activity/account/LoginActivity\n*L\n61#1:316,2\n62#1:318,13\n*E\n"})
public final class LoginActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f24734OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24735OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o00O0000.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24737OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(LoginVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.LoginActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f24742OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24742OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f24736OooOo0 = LazyKt.lazy(new OooO0OO());

    public static final class OooO00o {
        public static void OooO00o(@NotNull Activity context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) LoginActivity.class));
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpenAuthManager.AuthType.values().length];
            try {
                iArr[OpenAuthManager.AuthType.Facebook.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenAuthManager.AuthType.Twitter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpenAuthManager.AuthType.Instagram.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OpenAuthManager.AuthType.WeChat.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OpenAuthManager.AuthType.YallaChat.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
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

    public static final class OooO0o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f24739OooO0Oo;

        public OooO0o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24739OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f24739OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24739OooO0Oo;
        }

        public final int hashCode() {
            return this.f24739OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24739OooO0Oo.invoke(obj);
        }
    }

    public static final void OooOo(LoginActivity loginActivity, boolean z, boolean z2) {
        LinearLayout llOr = loginActivity.OooOoO().f44263OooO;
        Intrinsics.checkNotNullExpressionValue(llOr, "llOr");
        boolean z3 = false;
        o000O.OooOOO0(llOr, z || z2);
        View vSpacer = loginActivity.OooOoO().f44274OooOO0o;
        Intrinsics.checkNotNullExpressionValue(vSpacer, "vSpacer");
        if (z && z2) {
            z3 = true;
        }
        o000O.OooOOO0(vSpacer, z3);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOO() {
        overridePendingTransition(o00Ooo.account_anim_below_in, o00Ooo.anim_empty);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOO0() {
        overridePendingTransition(o00Ooo.anim_empty, o00Ooo.account_anim_below_out);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity
    public final boolean OooOOOo() {
        return false;
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity
    public final void OooOOo() {
    }

    public final o00O0000 OooOoO() {
        return (o00O0000) this.f24735OooOOoo.getValue();
    }

    public final OpenAuthManager OooOoO0() {
        return (OpenAuthManager) this.f24736OooOo0.getValue();
    }

    public final void OooOoOO() {
        Snackbar snackbarOooO0oo = Snackbar.OooO0oo(OooOoO().f44273OooOO0O, o000OOo.login_feedback_tips);
        snackbarOooO0oo.OooO(o000OOo.feedback, new o0O00(this, 1));
        snackbarOooO0oo.f17327OooOO0O = 5000;
        snackbarOooO0oo.OooOO0();
    }

    public final void OooOoo0(OpenAuthManager.AuthType authType) {
        int i = OooO0O0.$EnumSwitchMapping$0[authType.ordinal()];
        if (i == 1) {
            o0ooOOo o0ooooo = oo0o0Oo.f43479OooO00o;
            ApiEvent.OooO0OO(2);
            h0.OooO0O0("201033");
            OooOoO0().OooO00o();
            return;
        }
        if (i == 2) {
            o0ooOOo o0ooooo2 = oo0o0Oo.f43479OooO00o;
            ApiEvent.OooO0OO(3);
            h0.OooO0O0("201035");
            OooOoO0().OooO0OO();
            return;
        }
        if (i == 3) {
            o0ooOOo o0ooooo3 = oo0o0Oo.f43479OooO00o;
            ApiEvent.OooO0OO(4);
            h0.OooO0O0("201037");
            OooOoO0().OooO0O0();
            return;
        }
        if (i == 4) {
            o0ooOOo o0ooooo4 = oo0o0Oo.f43479OooO00o;
            ApiEvent.OooO0OO(5);
            OooOoO0().OooO0Oo();
        } else {
            if (i != 5) {
                return;
            }
            o0ooOOo o0ooooo5 = oo0o0Oo.f43479OooO00o;
            ApiEvent.OooO0OO(7);
            OooOoO0().OooO0o0();
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        OooOo0();
        OooOoO0().OooO0oO(i, i2, intent);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        LiveEventBus.get("LOGIN_RESULT").post(Boolean.FALSE);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p402o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoO().f44269OooO0o0)) {
            LiveEventBus.get("LOGIN_RESULT").post(Boolean.FALSE);
            finish();
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f44265OooO0O0)) {
            OooOoo0(OpenAuthManager.AuthType.Facebook);
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f44270OooO0oO)) {
            OooOoo0(OpenAuthManager.AuthType.Twitter);
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f44271OooO0oo)) {
            OooOoo0(OpenAuthManager.AuthType.WeChat);
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f44267OooO0Oo)) {
            h0.OooO0O0("101051");
            OooOoo0(OpenAuthManager.AuthType.YallaChat);
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f44266OooO0OO)) {
            o0ooOOo o0ooooo = oo0o0Oo.f43479OooO00o;
            ApiEvent.OooO0OO(1);
            ClientCodeType clientCodeType = ClientCodeType.Login;
            o000O000 startForResultManagerCallback = new o000O000() { // from class: o0o00O0.o0000
                @Override // p604o0oo00oo.o000O000
                public final void onActivityResult(int i, Intent intent) {
                    int i2 = LoginActivity.f24734OooOo0O;
                    LoginActivity this$0 = this.f48745OooO00o;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.OooOoOO();
                }
            };
            Intrinsics.checkNotNullParameter(startForResultManagerCallback, "startForResultManagerCallback");
            Bundle bundle = new Bundle();
            bundle.putString("PHONE_NUMBER", null);
            bundle.putSerializable("TYPE_ACCOUNT", clientCodeType);
            o000 o000Var = new o000(this);
            o000Var.OooO00o(bundle);
            o000Var.f56955OooO0O0 = PhoneNumberActivity.class;
            o000Var.OooO0O0(startForResultManagerCallback);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO().f44264OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        o00O00o0.OooO0OO(window, 0);
        ImageView ivClose = OooOoO().f44269OooO0o0;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        o00O00o0.OooO00o(ivClose, false, 3);
        OooOoO().f44269OooO0o0.setOnClickListener(this);
        OooOoO().f44265OooO0O0.setOnClickListener(this);
        OooOoO().f44266OooO0OO.setOnClickListener(this);
        OooOoO().f44267OooO0Oo.setOnClickListener(this);
        OooOoO().f44270OooO0oO.setOnClickListener(this);
        OooOoO().f44271OooO0oo.setOnClickListener(this);
        if (!p388o0OOooO.oo0o0Oo.OooO0o0()) {
            OooOoO().f44268OooO0o.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o00O0.o0000O00
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int i = LoginActivity.f24734OooOo0O;
                    LoginActivity context = this.f48756OooO0Oo;
                    Intrinsics.checkNotNullParameter(context, "this$0");
                    int i2 = OooO0OO.f46611OooO00o;
                    Intrinsics.checkNotNullParameter(context, "context");
                    return true;
                }
            });
        }
        TextView tvTermsService = OooOoO().f44272OooOO0;
        Intrinsics.checkNotNullExpressionValue(tvTermsService, "tvTermsService");
        int i = o000OOo.terms_service;
        o00O0O0.OooO00o(tvTermsService, o0000.OooO0OO(i), new p490o0o00O0.o000O000(this));
        TextView tvTermsService2 = OooOoO().f44272OooOO0;
        Intrinsics.checkNotNullExpressionValue(tvTermsService2, "tvTermsService");
        int i2 = o000OOo.privacy_policy;
        o00O0O0.OooO00o(tvTermsService2, o0000.OooO0OO(i2), new o000O0o(this));
        TextView tvTermsService3 = OooOoO().f44272OooOO0;
        Intrinsics.checkNotNullExpressionValue(tvTermsService3, "tvTermsService");
        o00O0O0.OooO0Oo(tvTermsService3, o0000.OooO00o(p565o0oOo000.o0ooOOo.color_e9a711), o0000.OooO0OO(i), o0000.OooO0OO(i2));
        OooOoO0().f24277OooO0O0 = new o0000O(this);
        OooOoO0().f24279OooO0Oo = new o0000OO0(this);
        OooOoO0().f24278OooO0OO = new p490o0o00O0.o000(this);
        LiveEventBus.get("LOGIN_RESULT").observe(this, new Observer() { // from class: o0o00O0.o00000OO
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i3 = LoginActivity.f24734OooOo0O;
                LoginActivity this$0 = this.f48753OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
                    this$0.finish();
                }
            }
        });
        LiveEventBus.get("ACTIVE_ACCOUNT").observe(this, new Observer() { // from class: o0o00O0.o0000Ooo
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i3 = LoginActivity.f24734OooOo0O;
                LoginActivity context = this.f48759OooO0Oo;
                Intrinsics.checkNotNullParameter(context, "this$0");
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) ReOpenAccountActivity.class));
            }
        });
        LiveEventBus.get("SHOW_APPEAL_DIALOG").observeSticky(this, new o00000O(this, 1));
        o0oOO.OooO0O0(o000000O.OooO00o(), (f) this.f22290OooOO0O.getValue(), true, 2);
        o000000O.f56593OooO00o.observe(this, new OooO0o(new o000Oo0(this)));
        o000000O.f56598OooO0o0.observe(this, new OooO0o(new o000O00(this)));
        o000000O.f56594OooO0O0.observe(this, new OooO0o(new o000O00O(this)));
        o000000O.f56595OooO0OO.observe(this, new OooO0o(new p490o0o00O0.o000O0(this)));
        o000000O.f56596OooO0Oo.observe(this, new OooO0o(new o000O0Oo(this)));
    }

    @Override // android.app.Activity
    public final void recreate() {
    }
}
