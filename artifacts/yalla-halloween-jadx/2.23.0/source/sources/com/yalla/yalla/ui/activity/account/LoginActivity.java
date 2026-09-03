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
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.api.old.ApiEvent;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.vm.account.LoginVM;
import com.yalla.yalla.util.WebPageInfo;
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
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p382o0OOoo0o.o00Ooo;
import p382o0OOoo0o.oo000o;
import p402o0Oo0OOO.o00O0000;
import p417o0OoO0.o000O0o;
import p463o0OooOoo.o0O0O0O;
import p474o0o00.o000;
import p474o0o00.o00000O;
import p474o0o00.o00000OO;
import p474o0o00.o0000OO0;
import p474o0o00.o0000Ooo;
import p474o0o00.o000O0;
import p474o0o00.o000O00;
import p474o0o00.o000O000;
import p474o0o00.o000Oo0;
import p507o0o00ooo.v0;
import p571o0oOoOO.o0O0OOO0;
import p579o0oOoo.oO;
import p584o0oOooO0.oO000o00;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p599o0oo00oo.o0000O;
import p599o0oo00oo.o000OO;
import p641o0ooOOOO.x;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/LoginActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLoginActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginActivity.kt\ncom/yalla/yalla/ui/activity/account/LoginActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,315:1\n22#2,2:316\n75#3,13:318\n*S KotlinDebug\n*F\n+ 1 LoginActivity.kt\ncom/yalla/yalla/ui/activity/account/LoginActivity\n*L\n61#1:316,2\n62#1:318,13\n*E\n"})
public final class LoginActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f25186OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25187OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(x.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25189OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(LoginVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.LoginActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25195OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25195OooO0Oo;
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
    public final Lazy f25188OooOo0 = LazyKt.lazy(new OooO0OO());

    public static final class OooO implements Observer<String> {
        public OooO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(String str) {
            String url = str;
            if (url == null || StringsKt.isBlank(url)) {
                return;
            }
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.LoginPageFeedback);
            Intrinsics.checkNotNullExpressionValue(url, "it");
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32819OooO0o0 = url;
            webPageInfo.OooO0Oo(o0000.OooO0OO(oO00OOo0.feedback));
            webPageInfo.OooO00o("PID", oo000o.OooO00o());
            webPageInfo.OooO00o("type", "1");
            webPageInfo.OooO00o(RemoteConfigConstants$RequestFieldKey.APP_VERSION, o00Ooo.OooO0Oo());
            webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, oo000o.OooO0O0());
            webPageInfo.OooO00o("sysVersion", oo000o.OooO0Oo());
            webPageInfo.OooO00o("internet", oO.OooO00o().toString());
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(LoginActivity.this, webPageInfo);
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

    public static final class OooO0o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25192OooO0Oo;

        public OooO0o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25192OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25192OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25192OooO0Oo;
        }

        public final int hashCode() {
            return this.f25192OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25192OooO0Oo.invoke(obj);
        }
    }

    public static final void OooOo(LoginActivity loginActivity, boolean z, boolean z2) {
        LinearLayout linearLayout = loginActivity.OooOoO().f59218OooO;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llOr");
        boolean z3 = false;
        o000OO00.OooOOO0(linearLayout, z || z2);
        View view = loginActivity.OooOoO().f59229OooOO0o;
        Intrinsics.checkNotNullExpressionValue(view, "binding.vSpacer");
        if (z && z2) {
            z3 = true;
        }
        o000OO00.OooOOO0(view, z3);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOO() {
        overridePendingTransition(oO000o00.account_anim_below_in, oO000o00.anim_empty);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOO0() {
        overridePendingTransition(oO000o00.anim_empty, oO000o00.account_anim_below_out);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity
    public final boolean OooOOOo() {
        return false;
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity
    public final void OooOOo() {
    }

    public final x OooOoO() {
        return (x) this.f25187OooOOoo.getValue();
    }

    public final OpenAuthManager OooOoO0() {
        return (OpenAuthManager) this.f25188OooOo0.getValue();
    }

    public final void OooOoOO() {
        Snackbar snackbarOooO0oo = Snackbar.OooO0oo(OooOoO().f59228OooOO0O, oO00OOo0.login_feedback_tips);
        snackbarOooO0oo.OooO(oO00OOo0.feedback, new o00000O(this, 0));
        snackbarOooO0oo.f17799OooOO0O = 5000;
        snackbarOooO0oo.OooOO0();
    }

    public final void OooOoo0(OpenAuthManager.AuthType authType) {
        int i = OooO0O0.$EnumSwitchMapping$0[authType.ordinal()];
        if (i == 1) {
            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
            ApiEvent.OooO0OO(2);
            o0OO000.OooO00o("201033");
            OooOoO0().OooO00o();
            return;
        }
        if (i == 2) {
            o000O00O o000o00o3 = o000O0O0.f44226OooO00o;
            ApiEvent.OooO0OO(3);
            o0OO000.OooO00o("201035");
            OooOoO0().OooO0OO();
            return;
        }
        if (i == 3) {
            o000O00O o000o00o4 = o000O0O0.f44226OooO00o;
            ApiEvent.OooO0OO(4);
            o0OO000.OooO00o("201037");
            OooOoO0().OooO0O0();
            return;
        }
        if (i == 4) {
            o000O00O o000o00o5 = o000O0O0.f44226OooO00o;
            ApiEvent.OooO0OO(5);
            OooOoO0().OooO0Oo();
        } else {
            if (i != 5) {
                return;
            }
            o000O00O o000o00o6 = o000O0O0.f44226OooO00o;
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

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoO().f59224OooO0o0)) {
            LiveEventBus.get("LOGIN_RESULT").post(Boolean.FALSE);
            finish();
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f59220OooO0O0)) {
            OooOoo0(OpenAuthManager.AuthType.Facebook);
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f59225OooO0oO)) {
            OooOoo0(OpenAuthManager.AuthType.Twitter);
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f59226OooO0oo)) {
            OooOoo0(OpenAuthManager.AuthType.WeChat);
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f59222OooO0Oo)) {
            o0OO000.OooO00o("101051");
            OooOoo0(OpenAuthManager.AuthType.YallaChat);
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f59221OooO0OO)) {
            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
            ApiEvent.OooO0OO(1);
            ClientCodeType clientCodeType = ClientCodeType.Login;
            o0000O startForResultManagerCallback = new o0000O() { // from class: o0o00.o00000
                @Override // p599o0oo00oo.o0000O
                public final void onActivityResult(int i, Intent intent) {
                    int i2 = LoginActivity.f25186OooOo0O;
                    LoginActivity this$0 = this.f47228OooO00o;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.OooOoOO();
                }
            };
            Intrinsics.checkNotNullParameter(startForResultManagerCallback, "startForResultManagerCallback");
            Bundle bundle = new Bundle();
            bundle.putString("PHONE_NUMBER", null);
            bundle.putSerializable("TYPE_ACCOUNT", clientCodeType);
            o000OO o000oo2 = new o000OO(this);
            o000oo2.OooO00o(bundle);
            o000oo2.f56864OooO0O0 = PhoneNumberActivity.class;
            o000oo2.OooO0O0(startForResultManagerCallback);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO().f59219OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        p370o0OOoO.OooOOO0.OooO0OO(window, 0);
        ImageView imageView = OooOoO().f59224OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivClose");
        p370o0OOoO.OooOOO0.OooO00o(imageView, false, 3);
        OooOoO().f59224OooO0o0.setOnClickListener(this);
        OooOoO().f59220OooO0O0.setOnClickListener(this);
        OooOoO().f59221OooO0OO.setOnClickListener(this);
        OooOoO().f59222OooO0Oo.setOnClickListener(this);
        OooOoO().f59225OooO0oO.setOnClickListener(this);
        OooOoO().f59226OooO0oo.setOnClickListener(this);
        if (!o00Ooo.OooO0o0()) {
            OooOoO().f59223OooO0o.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o00.o00000O0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity context = this.f47233OooO0Oo;
                    Intrinsics.checkNotNullParameter(context, "this$0");
                    int i2 = o0O0O0O.f46666OooO00o;
                    Intrinsics.checkNotNullParameter(context, "context");
                    return true;
                }
            });
        }
        TextView textView = OooOoO().f59227OooOO0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTermsService");
        int i = oO00OOo0.terms_service;
        o000O0o.OooO00o(textView, o0000.OooO0OO(i), new o000(this));
        TextView textView2 = OooOoO().f59227OooOO0;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvTermsService");
        int i2 = oO00OOo0.privacy_policy;
        o000O0o.OooO00o(textView2, o0000.OooO0OO(i2), new o000O000(this));
        TextView textView3 = OooOoO().f59227OooOO0;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTermsService");
        o000O0o.OooO0Oo(textView3, o0000.OooO00o(oO00O0o.color_e9a711), o0000.OooO0OO(i), o0000.OooO0OO(i2));
        OooOoO0().f24730OooO0O0 = new p474o0o00.o000OO(this);
        OooOoO0().f24732OooO0Oo = new p474o0o00.o0000O(this);
        OooOoO0().f24731OooO0OO = new o0000OO0(this);
        LiveEventBus.get("LOGIN_RESULT").observe(this, new o00000OO(this));
        LiveEventBus.get("ACTIVE_ACCOUNT").observe(this, new o0000Ooo(this));
        LiveEventBus.get("SHOW_APPEAL_DIALOG").observeSticky(this, new p474o0o00.o0000(this));
        v0.OooO0O0(o00O0000.OooO00o(), (o0O0OOO0) this.f22756OooOO0O.getValue(), true, 2);
        o00O0000.f44476OooO00o.observe(this, new OooO0o(new p474o0o00.o000O0o(this)));
        o00O0000.f44481OooO0o0.observe(this, new OooO0o(new o000Oo0(this)));
        o00O0000.f44477OooO0O0.observe(this, new OooO0o(new o000O00(this)));
        o00O0000.f44478OooO0OO.observe(this, new OooO0o(new p474o0o00.o000O00O(this)));
        o00O0000.f44479OooO0Oo.observe(this, new OooO0o(new o000O0(this)));
    }

    @Override // android.app.Activity
    public final void recreate() {
    }
}
