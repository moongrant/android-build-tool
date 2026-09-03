package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.application.App;
import com.app.base.http.ApiEvent;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity;
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
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p391o0OOooOo.o0O00000;
import p478o0OooooO.oO0OoOO0;
import p522o0o0O0o.oo0o0O0;
import p534o0o0OOo0.o0O0O0Oo;
import p534o0o0OOo0.o0O0O0o0;
import p534o0o0OOo0.o0O0OO0;
import p534o0o0OOo0.o0O0OOO0;
import p534o0o0OOo0.o0O0oo0o;
import p620o0oo0o0O.o00O00OO;
import p620o0oo0o0O.o00O00o0;
import p649o0ooOOoo.o6;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/LoginOnRoomDialogActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class LoginOnRoomDialogActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f21768OooooO0 = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f21769OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(o6.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final Lazy f21770Ooooo00 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21771Ooooo0o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(LoginVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f21775Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21775Oooo0o;
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

    public static final class OooO0O0 extends Lambda implements Function0<OpenAuthManager> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OpenAuthManager invoke() {
            return new OpenAuthManager(LoginOnRoomDialogActivity.this);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOOo0() {
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOo0o() {
    }

    public final OpenAuthManager OooOoo() {
        return (OpenAuthManager) this.f21770Ooooo00.getValue();
    }

    public final o6 OooOooO() {
        return (o6) this.f21769OoooOoo.getValue();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.anim_empty, R.anim.alpha_out);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        OooOoo().OooO0oO(i, i2, intent);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOooO().f50144OooO0Oo) ? true : Intrinsics.areEqual(view, OooOooO().f50141OooO00o)) {
            o0O00000.OooO0OO("InRoom_login_close");
            finish();
            return;
        }
        if (Intrinsics.areEqual(view, OooOooO().f50142OooO0O0)) {
            o0O00000.OooO0OO("InRoom_login_Facebook");
            OooOoo().OooO00o();
            return;
        }
        if (Intrinsics.areEqual(view, OooOooO().f50143OooO0OO)) {
            o0O00000.OooO0OO("InRoom_login_Phone");
            App.f11456Oooo = 1;
            o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
            new ApiEvent().OooO00o(20);
            o0O00000.OooO0OO("Sign_Log");
            ClientCodeType clientCodeType = ClientCodeType.Login;
            o00O00o0 startForResultManagerCallback = new o00O00o0() { // from class: o0o0OOo0.o0oO0O0o
                @Override // p620o0oo0o0O.o00O00o0
                public final void onActivityResult(int i, Intent intent) {
                    LoginOnRoomDialogActivity this$0 = this.f43596OooO00o;
                    LoginOnRoomDialogActivity.OooO00o oooO00o = LoginOnRoomDialogActivity.f21768OooooO0;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.finish();
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
        setContentView(OooOooO().f50141OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        oO0OoOO0.OooO0Oo(window, 0);
        OooOooO().f50144OooO0Oo.setOnClickListener(this);
        OooOooO().f50141OooO00o.setOnClickListener(this);
        OooOooO().f50142OooO0O0.setOnClickListener(this);
        OooOooO().f50143OooO0OO.setOnClickListener(this);
        TextView textView = OooOooO().f50145OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTermsService");
        oo0o0O0.OooO0O0(textView, o000O0O0.OooO0OO(R.string.terms_service), new o0O0OO0(this));
        TextView textView2 = OooOooO().f50145OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvTermsService");
        oo0o0O0.OooO0O0(textView2, o000O0O0.OooO0OO(R.string.privacy_policy), new o0O0OOO0(this));
        TextView textView3 = OooOooO().f50145OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTermsService");
        oo0o0O0.OooO0o0(textView3, new String[]{o000O0O0.OooO0OO(R.string.terms_service), o000O0O0.OooO0OO(R.string.privacy_policy)}, o000O0O0.OooO00o(R.color.color_e9a711));
        OooOoo().f21648OooO0O0 = new o0O0oo0o(this);
        OooOoo().f21650OooO0Oo = new o0O0O0Oo(this);
        OooOoo().f21649OooO0OO = new o0O0O0o0(this);
    }
}
