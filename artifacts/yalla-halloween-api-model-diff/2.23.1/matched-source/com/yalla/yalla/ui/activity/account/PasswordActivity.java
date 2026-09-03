package com.yalla.yalla.ui.activity.account;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.api.old.ApiEvent;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import com.yalla.yalla.ui.vm.account.PasswordVM;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p373o0OOo0oO.o00Oo0;
import p373o0OOo0oO.o0OOO0o;
import p383o0OOoOo0.Oooo000;
import p386o0OOoo0O.o0OoOo0;
import p386o0OOoo0O.o0ooOOo;
import p386o0OOoo0O.oo0o0Oo;
import p407o0Oo0OOO.o00;
import p490o0o00O0.o00O00;
import p490o0o00O0.o00O00O;
import p490o0o00O0.o00O00OO;
import p490o0o00O0.oOO00O;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0Oo0oo;
import p587o0oOooO.oO0000O;
import p587o0oOooO.oO00O0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/PasswordActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClick", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPasswordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PasswordActivity.kt\ncom/yalla/yalla/ui/activity/account/PasswordActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,287:1\n22#2,2:288\n75#3,13:290\n58#4,23:303\n93#4,3:326\n*S KotlinDebug\n*F\n+ 1 PasswordActivity.kt\ncom/yalla/yalla/ui/activity/account/PasswordActivity\n*L\n47#1:288,2\n48#1:290,13\n133#1:303,23\n133#1:326,3\n*E\n"})
public final class PasswordActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f24771OooOoOO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f24773OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f24778OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public ClientCodeType f24779OooOoO0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24772OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o00.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24775OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PasswordVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.PasswordActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.PasswordActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.PasswordActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f24786OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24786OooO0Oo;
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
    public String f24774OooOo0 = "";

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public String f24776OooOo0O = "";

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public String f24777OooOo0o = "";

    public static final class OooO extends Lambda implements Function1<ApiResult<LoginListModel>, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<LoginListModel> apiResult) {
            ApiResult<LoginListModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            PasswordActivity passwordActivity = PasswordActivity.this;
            passwordActivity.OooOo0();
            passwordActivity.f24778OooOoO = false;
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        public static void OooO00o(@NotNull BaseActivityK context, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ClientCodeType clientCodeType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) PasswordActivity.class);
            intent.putExtra("PHONE_NUMBER", str);
            intent.putExtra("COUNTRY_AREA_CODE", str2);
            intent.putExtra("SMS_CODE", str3);
            intent.putExtra("TYPE_ACCOUNT", clientCodeType);
            context.startActivity(intent);
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClientCodeType.values().length];
            try {
                iArr[ClientCodeType.Register.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClientCodeType.Retrieve.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClientCodeType.BingingPhone.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClientCodeType.Login.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClientCodeType.TunOnProtectionBingingPhone.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<LoginListModel, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LoginListModel loginListModel) {
            PasswordActivity.OooOo(PasswordActivity.this);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f24782OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PasswordActivity f24783OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(PasswordActivity passwordActivity, String str) {
            super(1);
            this.f24782OooO0Oo = str;
            this.f24783OooO0o0 = passwordActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError error = apiError;
            Intrinsics.checkNotNullParameter(error, "it");
            if (error.getCode() == 1069) {
                Pair pairOooO00o = oO0000O.OooO00o(this.f24783OooO0o0, this.f24782OooO0Oo);
                if (!StringsKt.isBlank((CharSequence) pairOooO00o.getFirst())) {
                    int i = SmsCodeActivity.f24845Oooo0;
                    PasswordActivity passwordActivity = this.f24783OooO0o0;
                    Object first = pairOooO00o.getFirst();
                    Object second = pairOooO00o.getSecond();
                    StringBuilder sb = new StringBuilder();
                    sb.append(first);
                    sb.append(second);
                    SmsCodeActivity.OooO00o.OooO00o(passwordActivity, sb.toString(), (String) pairOooO00o.getFirst(), ClientCodeType.LoginVerification, 0, null, 0, null, false, 496);
                }
            } else {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void OooOo(PasswordActivity passwordActivity) {
        passwordActivity.getWindow().setSoftInputMode(3);
        EditText view = passwordActivity.OooOoO0().f44206OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "etPassword");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
        o00Oo0.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
        passwordActivity.finish();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity
    public final boolean OooOOOo() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO(String str, String str2) {
        if (this.f24778OooOoO) {
            return;
        }
        this.f24778OooOoO = true;
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        ((PasswordVM) this.f24775OooOo00.getValue()).userPhoneLogin(str, str2).observe(this, new o0OoOo0(new OooO0OO(), new OooO0o(this, str), new OooO(), true));
    }

    public final o00 OooOoO0() {
        return (o00) this.f24772OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoOO(int i, String str, String str2, String str3) {
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        ((PasswordVM) this.f24775OooOo00.getValue()).userBindingPhone(str, str3, str2, i).observe(this, new o0OoOo0(new oOO00O(this), null, new o00O00OO(this), false, 10));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getId() == o0Oo0oo.iv_see) {
            boolean z = !this.f24773OooOo;
            this.f24773OooOo = z;
            if (z) {
                OooOoO0().f44206OooO0OO.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                OooOoO0().f44209OooO0o0.setImageResource(p565o0oOo000.o0OOO0o.eye1);
            } else {
                OooOoO0().f44206OooO0OO.setTransformationMethod(PasswordTransformationMethod.getInstance());
                OooOoO0().f44209OooO0o0.setImageResource(p565o0oOo000.o0OOO0o.eye2);
            }
            OooOoO0().f44206OooO0OO.setTypeface(Typeface.MONOSPACE);
            oO00O0o.OooO00o(OooOoO0().f44206OooO0OO);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO0().f44204OooO00o);
        Serializable serializableExtra = getIntent().getSerializableExtra("TYPE_ACCOUNT");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.data.constant.ClientCodeType");
        this.f24779OooOoO0 = (ClientCodeType) serializableExtra;
        String stringExtra = getIntent().getStringExtra("PHONE_NUMBER");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f24774OooOo0 = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("COUNTRY_AREA_CODE");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f24776OooOo0O = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("SMS_CODE");
        this.f24777OooOo0o = stringExtra3 != null ? stringExtra3 : "";
        if (this.f24779OooOoO0 == ClientCodeType.Register) {
            o0ooOOo o0ooooo = oo0o0Oo.f43479OooO00o;
            ApiEvent.OooO00o(60);
        }
        OooOOo0(1);
        OooOoO0().f44207OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: o0o00O0.o00oOoo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = PasswordActivity.f24771OooOoOO;
                PasswordActivity this$0 = this.f48816OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO0().f44206OooO0OO.setText("");
                this$0.OooOoO0().f44206OooO0OO.setTypeface(Typeface.MONOSPACE);
                oO00O0o.OooO00o(this$0.OooOoO0().f44206OooO0OO);
            }
        });
        OooOoO0().f44208OooO0o.setColor(o0000.OooO00o(p565o0oOo000.o0ooOOo.color_FFB7B7B7));
        OooOoO0().f44208OooO0o.OooO00o();
        ClientCodeType clientCodeType = this.f24779OooOoO0;
        int i = clientCodeType == null ? -1 : OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()];
        if (i == 1) {
            OooOo00(o0000O.OooO00o(o0000.OooO0OO(o000OOo.sign_up_step), FeedbackType.Recharge));
            OooOoO0().f44203OooO.setText(o000OOo.Create_password);
        } else if (i == 2) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s (2/2)", Arrays.copyOf(new Object[]{o0000.OooO0OO(o000OOo.title_Forgot_Password)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            OooOo00(str);
            OooOoO0().f44203OooO.setText(o000OOo.Create_new_password);
        } else if (i == 3) {
            OooOo00(getString(o000OOo.title_activity_bound_phone));
            OooOoO0().f44203OooO.setText(o000OOo.Create_password);
        } else if (i != 4) {
            OooOo00(getString(o000OOo.password));
        } else {
            OooOo00(o0000O.OooO00o(o0000.OooO0OO(o000OOo.user_login_in_step), FeedbackType.Suggestions));
            OooOoO0().f44210OooO0oO.setVisibility(0);
            OooOoO0().f44210OooO0oO.setEnabled(true);
            OooOoO0().f44203OooO.setText(o000OOo.login_phone_number_tip);
            OooOoO0().f44211OooO0oo.setVisibility(0);
            String strOooO00o = this.f24774OooOo0;
            if (com.code.android.util.OooOo00.OooO0O0(this.f24776OooOo0O) && StringsKt.Oooo00o(this.f24774OooOo0, this.f24776OooOo0O)) {
                String str2 = this.f24776OooOo0O;
                String strSubstring = this.f24774OooOo0.substring(str2.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                strOooO00o = p031OoooO0.o0OoOo0.OooO00o(str2, ZegoConstants.ZegoVideoDataAuxPublishingStream, strSubstring);
            }
            OooOoO0().f44211OooO0oo.setText("+" + strOooO00o);
        }
        OooOoO0().f44210OooO0oO.setOnClickListener(new com.yalla.yalla.ui.activity.account.OooO0O0(this));
        OooOoO0().f44209OooO0o0.setOnClickListener(this);
        OooOoO0().f44205OooO0O0.setOnClickListener(new o00O00O(this));
        EditText etPassword = OooOoO0().f44206OooO0OO;
        Intrinsics.checkNotNullExpressionValue(etPassword, "etPassword");
        etPassword.addTextChangedListener(new o00O00(this));
        EditText view = OooOoO0().f44206OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "etPassword");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
        LiveEventBus.get("LOGIN_RESULT").observe(this, new com.yalla.yalla.mixedroom.OooOO0(this, 1));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        EditText view = OooOoO0().f44206OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "etPassword");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
        o00Oo0.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f24778OooOoO = false;
    }

    @Override // android.app.Activity
    public final void recreate() {
    }
}
