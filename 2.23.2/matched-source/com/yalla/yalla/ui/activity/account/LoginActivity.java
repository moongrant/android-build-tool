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
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.snackbar.Snackbar;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.api.old.ApiEvent;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.mixedroom.o0000Ooo;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.repository.AppConfigRepo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.account.ReOpenAccountActivity;
import com.yalla.yalla.ui.vm.account.LoginVM;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p379o0OOoOOO.oOO00O;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p386o0OOooO.oo0o0Oo;
import p405o0Oo0OOO.o00O0000;
import p420o0OoO0.OooO0OO;
import p423o0OoO0OO.o00O0O0O;
import p491o0o00O0o.o00O0;
import p491o0o00O0o.o00O00;
import p491o0o00O0o.o00O000o;
import p491o0o00O0o.o00O00O;
import p491o0o00O0o.o00O00OO;
import p491o0o00O0o.o00O00o0;
import p491o0o00O0o.o00O0O0;
import p491o0o00O0o.o00O0O00;
import p491o0o00O0o.oo00o;
import p516o0o0O00o.o0oOO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.oo000o;
import p577o0oOoOo.o0oOo0O0;
import p583o0oOoo00.o000000O;
import p583o0oOoo00.o00000OO;
import p650o0ooo.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/LoginActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoginActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginActivity.kt\ncom/yalla/yalla/ui/activity/account/LoginActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,327:1\n22#2,2:328\n75#3,13:330\n*S KotlinDebug\n*F\n+ 1 LoginActivity.kt\ncom/yalla/yalla/ui/activity/account/LoginActivity\n*L\n63#1:328,2\n64#1:330,13\n*E\n"})
public final class LoginActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f24727OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24728OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o00O0000.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24730OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(LoginVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.LoginActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f24736OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24736OooO0Oo;
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
    public final Lazy f24729OooOo0 = LazyKt.lazy(new OooO0OO());

    public static final class OooO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f24731OooO0Oo;

        public OooO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24731OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f24731OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24731OooO0Oo;
        }

        public final int hashCode() {
            return this.f24731OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24731OooO0Oo.invoke(obj);
        }
    }

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

    public static final class OooO0o extends Lambda implements Function1<Boolean, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            Intrinsics.checkNotNull(bool2);
            boolean zBooleanValue = bool2.booleanValue();
            LoginActivity fragmentActivity = LoginActivity.this;
            if (zBooleanValue) {
                int i = o000000.facebook_update_dialog_login_Content;
                Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
                o000O o000o = new o000O(fragmentActivity);
                o000o.OooOoO0(o000000.facebook_update_dialog_Title);
                o000o.OooOOoo(i);
                o000o.OooOo(true);
                o000o.OooOOOO(o000000.facebook_update_dialog_Update);
                o000o.OooOo0(o0O00o0.f58639OooO0Oo);
                o000o.OooOO0o();
            } else {
                OpenAuthManager.AuthType authType = OpenAuthManager.AuthType.Facebook;
                int i2 = LoginActivity.f24727OooOo0O;
                fragmentActivity.OooOoo0(authType);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void OooOo(LoginActivity loginActivity, boolean z, boolean z2) {
        LinearLayout llOr = loginActivity.OooOoO().f44265OooO;
        Intrinsics.checkNotNullExpressionValue(llOr, "llOr");
        boolean z3 = false;
        com.code.android.util.o000O.OooOOO0(llOr, z || z2);
        View vSpacer = loginActivity.OooOoO().f44276OooOO0o;
        Intrinsics.checkNotNullExpressionValue(vSpacer, "vSpacer");
        if (z && z2) {
            z3 = true;
        }
        com.code.android.util.o000O.OooOOO0(vSpacer, z3);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOO() {
        overridePendingTransition(oo000o.account_anim_below_in, oo000o.anim_empty);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOO0() {
        overridePendingTransition(oo000o.anim_empty, oo000o.account_anim_below_out);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity
    public final boolean OooOOOo() {
        return false;
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity
    public final void OooOOo() {
    }

    public final o00O0000 OooOoO() {
        return (o00O0000) this.f24728OooOOoo.getValue();
    }

    public final OpenAuthManager OooOoO0() {
        return (OpenAuthManager) this.f24729OooOo0.getValue();
    }

    public final void OooOoOO() {
        Snackbar snackbarOooO0oo = Snackbar.OooO0oo(OooOoO().f44275OooOO0O, o000000.login_feedback_tips);
        snackbarOooO0oo.OooO(o000000.feedback, new View.OnClickListener() { // from class: o0o00O0o.o00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = LoginActivity.f24727OooOo0O;
                LoginActivity this$0 = this.f48933OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO00o.OooO0O0("101060");
                o00000OO.f56665OooO0oO.observe(this$0, new o0000Ooo(this$0, 1));
            }
        });
        snackbarOooO0oo.f17322OooOO0O = 5000;
        snackbarOooO0oo.OooOO0();
    }

    public final void OooOoo0(OpenAuthManager.AuthType authType) {
        int i = OooO0O0.$EnumSwitchMapping$0[authType.ordinal()];
        if (i == 1) {
            o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
            ApiEvent.OooO0OO(2);
            o0oo0000.OooO00o.OooO0O0("201033");
            OooOoO0().OooO00o();
            return;
        }
        if (i == 2) {
            o00oO0o o00oo0o3 = o0OO00O.f43462OooO00o;
            ApiEvent.OooO0OO(3);
            o0oo0000.OooO00o.OooO0O0("201035");
            OooOoO0().OooO0OO();
            return;
        }
        if (i == 3) {
            o00oO0o o00oo0o4 = o0OO00O.f43462OooO00o;
            ApiEvent.OooO0OO(4);
            o0oo0000.OooO00o.OooO0O0("201037");
            OooOoO0().OooO0O0();
            return;
        }
        if (i == 4) {
            o00oO0o o00oo0o5 = o0OO00O.f43462OooO00o;
            ApiEvent.OooO0OO(5);
            OooOoO0().OooO0Oo();
        } else {
            if (i != 5) {
                return;
            }
            o00oO0o o00oo0o6 = o0OO00O.f43462OooO00o;
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

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoO().f44271OooO0o0)) {
            LiveEventBus.get("LOGIN_RESULT").post(Boolean.FALSE);
            finish();
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f44267OooO0O0)) {
            AppConfigRepo.f24292OooO00o.getClass();
            AppConfigRepo.f24293OooO0O0.observe(this, new OooO(new OooO0o()));
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f44272OooO0oO)) {
            OooOoo0(OpenAuthManager.AuthType.Twitter);
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f44273OooO0oo)) {
            OooOoo0(OpenAuthManager.AuthType.WeChat);
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f44269OooO0Oo)) {
            o0oo0000.OooO00o.OooO0O0("101051");
            OooOoo0(OpenAuthManager.AuthType.YallaChat);
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f44268OooO0OO)) {
            o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
            ApiEvent.OooO0OO(1);
            ClientCodeType clientCodeType = ClientCodeType.Login;
            p604o0oo0O0.Oooo000 startForResultManagerCallback = new p604o0oo0O0.Oooo000() { // from class: o0o00O0o.o000OO00
                @Override // p604o0oo0O0.Oooo000
                public final void onActivityResult(int i, Intent intent) {
                    int i2 = LoginActivity.f24727OooOo0O;
                    LoginActivity this$0 = this.f48962OooO00o;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.OooOoOO();
                }
            };
            Intrinsics.checkNotNullParameter(startForResultManagerCallback, "startForResultManagerCallback");
            Bundle bundle = new Bundle();
            bundle.putString("PHONE_NUMBER", null);
            bundle.putSerializable("TYPE_ACCOUNT", clientCodeType);
            p604o0oo0O0.OooOo oooOo = new p604o0oo0O0.OooOo(this);
            oooOo.OooO00o(bundle);
            oooOo.f57388OooO0O0 = PhoneNumberActivity.class;
            oooOo.OooO0O0(startForResultManagerCallback);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO().f44266OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        int i = 0;
        oOO00O.OooO0OO(window, 0);
        ImageView ivClose = OooOoO().f44271OooO0o0;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        oOO00O.OooO00o(ivClose, false, 3);
        OooOoO().f44271OooO0o0.setOnClickListener(this);
        OooOoO().f44267OooO0O0.setOnClickListener(this);
        OooOoO().f44268OooO0OO.setOnClickListener(this);
        OooOoO().f44269OooO0Oo.setOnClickListener(this);
        OooOoO().f44272OooO0oO.setOnClickListener(this);
        OooOoO().f44273OooO0oo.setOnClickListener(this);
        if (!oo0o0Oo.OooO0o0()) {
            OooOoO().f44270OooO0o.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o00O0o.o000OOo0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int i2 = LoginActivity.f24727OooOo0O;
                    LoginActivity context = this.f48965OooO0Oo;
                    Intrinsics.checkNotNullParameter(context, "this$0");
                    int i3 = OooO0OO.f46612OooO00o;
                    Intrinsics.checkNotNullParameter(context, "context");
                    return true;
                }
            });
        }
        TextView tvTermsService = OooOoO().f44274OooOO0;
        Intrinsics.checkNotNullExpressionValue(tvTermsService, "tvTermsService");
        int i2 = o000000.terms_service;
        o00O0O0O.OooO00o(tvTermsService, o0000.OooO0OO(i2), new p491o0o00O0o.oOO00O(this));
        TextView tvTermsService2 = OooOoO().f44274OooOO0;
        Intrinsics.checkNotNullExpressionValue(tvTermsService2, "tvTermsService");
        int i3 = o000000.privacy_policy;
        o00O0O0O.OooO00o(tvTermsService2, o0000.OooO0OO(i3), new o00O00OO(this));
        TextView tvTermsService3 = OooOoO().f44274OooOO0;
        Intrinsics.checkNotNullExpressionValue(tvTermsService3, "tvTermsService");
        o00O0O0O.OooO0Oo(tvTermsService3, o0000.OooO00o(o0OOO0o.color_e9a711), o0000.OooO0OO(i2), o0000.OooO0OO(i3));
        OooOoO0().f24267OooO0O0 = new o00O000o(this);
        OooOoO0().f24269OooO0Oo = new o00O00(this);
        OooOoO0().f24268OooO0OO = new o00O00O(this);
        LiveEventBus.get("LOGIN_RESULT").observe(this, new Observer() { // from class: o0o00O0o.o000OO0O
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i4 = LoginActivity.f24727OooOo0O;
                LoginActivity this$0 = this.f48963OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
                    this$0.finish();
                }
            }
        });
        LiveEventBus.get("ACTIVE_ACCOUNT").observe(this, new Observer() { // from class: o0o00O0o.o000O0O0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i4 = LoginActivity.f24727OooOo0O;
                LoginActivity context = this.f48958OooO0Oo;
                Intrinsics.checkNotNullParameter(context, "this$0");
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) ReOpenAccountActivity.class));
            }
        });
        LiveEventBus.get("SHOW_APPEAL_DIALOG").observeSticky(this, new p491o0o00O0o.o000O(this, i));
        o0oOO.OooO0O0(o000000O.OooO00o(), (o0oOo0O0) this.f22283OooOO0O.getValue(), true, 2);
        o000000O.f56636OooO00o.observe(this, new OooO(new o00O00o0(this)));
        o000000O.f56641OooO0o0.observe(this, new OooO(new oo00o(this)));
        o000000O.f56637OooO0O0.observe(this, new OooO(new o00O0(this)));
        o000000O.f56638OooO0OO.observe(this, new OooO(new o00O0O00(this)));
        o000000O.f56639OooO0Oo.observe(this, new OooO(new o00O0O0(this)));
    }

    @Override // android.app.Activity
    public final void recreate() {
    }
}
