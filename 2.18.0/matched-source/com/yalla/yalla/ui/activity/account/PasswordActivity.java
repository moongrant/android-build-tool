package com.yalla.yalla.ui.activity.account;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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
import com.android.billingclient.api.o0000;
import com.app.base.http.ApiEvent;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.MobclickAgent;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.account.PasswordVM;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0o0000.OooOOOO;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.o000O0Oo;
import p074o000O0oo.OooOOO;
import p154o00Oo0oO.o00000OO;
import p154o00Oo0oO.o00oO0o;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o00O000o;
import p255o00ooO0O.o0O0ooO;
import p393o0OOooOo.o0O00000;
import p504o0o00o0.o000O000;
import p536o0o0OOo0.o0O0OOOo;
import p536o0o0OOo0.o0O0o000;
import p536o0o0OOo0.oo0OOoo;
import p619o0oo0o.Oooo000;
import p651o0ooOOoo.k6;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/PasswordActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClick", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PasswordActivity extends BaseActivityK {

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f21800ooOO = new OooO00o();

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f21806OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @Nullable
    public ClientCodeType f21807Ooooooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f21808o0OoOo0;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f21801OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(k6.class), this, null);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21802OooooOO = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PasswordVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.PasswordActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f21817Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21817Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public String f21803OooooOo = "";

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public String f21805Oooooo0 = "";

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public String f21804Oooooo = "";

    public static final class OooO extends Lambda implements Function1<ApiResult<LoginListModel>, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<LoginListModel> apiResult) {
            ApiResult<LoginListModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            PasswordActivity.this.OooOoO();
            PasswordActivity.this.f21808o0OoOo0 = false;
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        public final void OooO00o(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ClientCodeType clientCodeType) {
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
            iArr[ClientCodeType.Register.ordinal()] = 1;
            iArr[ClientCodeType.Retrieve.ordinal()] = 2;
            iArr[ClientCodeType.BingingPhone.ordinal()] = 3;
            iArr[ClientCodeType.Login.ordinal()] = 4;
            iArr[ClientCodeType.TunOnProtectionBingingPhone.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<LoginListModel, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LoginListModel loginListModel) {
            LoginListModel loginListModel2 = loginListModel;
            PasswordActivity.OooOoo(PasswordActivity.this);
            if (loginListModel2 != null && loginListModel2.getIsFirst()) {
                p142o00OOoo.OooO.OooO00o("AFEventLogin", null);
            }
            if (PasswordActivity.this.f21807Ooooooo == ClientCodeType.Retrieve) {
                o0O00000.OooO0OO("Forgot_password_success");
            } else {
                o0O00000.OooO0OO("Log_in_success");
                o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
                ApiEvent apiEvent = new ApiEvent();
                Objects.requireNonNull(PasswordActivity.this);
                apiEvent.OooO00o(70);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f21812OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str) {
            super(1);
            this.f21812OoooO00 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError error = apiError;
            Intrinsics.checkNotNullParameter(error, "it");
            if (PasswordActivity.this.f21807Ooooooo == ClientCodeType.Login) {
                o0O00000.OooO0OO("Log_password_error");
            }
            if (error.getCode() == 1069) {
                Pair<String, String> pairOooO00o = Oooo000.OooO00o(this.f21812OoooO00, PasswordActivity.this);
                if (!StringsKt.isBlank(pairOooO00o.getFirst())) {
                    SmsCodeActivity.OooO00o oooO00o = SmsCodeActivity.f21864oo000o;
                    SmsCodeActivity.OooO00o.OooO00o(PasswordActivity.this, pairOooO00o.getFirst() + pairOooO00o.getSecond(), pairOooO00o.getFirst(), ClientCodeType.LoginVerification, 0, null, 112);
                }
            } else {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Object, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            String strOooO0OO = o000O0O0.OooO0OO(R.string.Success);
            ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o001 = o00O000.f34368OooO00o;
                    o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                }
            }
            LiveEventBus.get("BIND_PH_SUCCESS").post(null);
            PasswordActivity.this.finish();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<ApiResult<Object>, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<Object> apiResult) {
            ApiResult<Object> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            PasswordActivity.this.OooOoO();
            return Unit.INSTANCE;
        }
    }

    public static final void OooOoo(PasswordActivity passwordActivity) {
        passwordActivity.getWindow().setSoftInputMode(3);
        EditText view = passwordActivity.OooOooO().f49845OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "binding.etPassword");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        p472o0Oooo0.o00O000.OooO00o(context).hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO0O0(view, "view.context"), new Handler()));
        passwordActivity.finish();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOOo0() {
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOOoo() {
        MobclickAgent.onPageEnd(PasswordActivity.class.getName() + "-Type" + this.f21807Ooooooo);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final boolean OooOo0() {
        return false;
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOo00() {
        MobclickAgent.onPageStart(PasswordActivity.class.getName() + "-Type" + this.f21807Ooooooo);
    }

    public final k6 OooOooO() {
        return (k6) this.f21801OooooO0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PasswordVM OooOooo() {
        return (PasswordVM) this.f21802OooooOO.getValue();
    }

    public final void Oooo000(String str, String str2) {
        if (this.f21808o0OoOo0) {
            return;
        }
        this.f21808o0OoOo0 = true;
        BaseActivityK.OooOoo0(this, null, 0L, 3, null);
        OooOooo().userPhoneLogin(str, str2).observe(this, new OooOo(new OooO0OO(), new OooO0o(str), new OooO(), true));
    }

    public final void Oooo00O(String str, String str2, String str3, int i) {
        BaseActivityK.OooOoo0(this, null, 0L, 3, null);
        OooOooo().userBindingPhone(str, str3, str2, i).observe(this, new OooOo(new OooOO0(), null, new OooOO0O(), false, 10));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getId() == R.id.iv_see) {
            boolean z = !this.f21806OoooooO;
            this.f21806OoooooO = z;
            if (z) {
                OooOooO().f49845OooO0OO.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                OooOooO().f49848OooO0o0.setImageResource(R.drawable.eye1);
            } else {
                OooOooO().f49845OooO0OO.setTransformationMethod(PasswordTransformationMethod.getInstance());
                OooOooO().f49848OooO0o0.setImageResource(R.drawable.eye2);
            }
            OooOooO().f49845OooO0OO.setTypeface(Typeface.MONOSPACE);
            o0000.OooOO0(OooOooO().f49845OooO0OO);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f49843OooO00o);
        Serializable serializableExtra = getIntent().getSerializableExtra("TYPE_ACCOUNT");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.data.constant.ClientCodeType");
        this.f21807Ooooooo = (ClientCodeType) serializableExtra;
        String stringExtra = getIntent().getStringExtra("PHONE_NUMBER");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f21803OooooOo = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("COUNTRY_AREA_CODE");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f21805Oooooo0 = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("SMS_CODE");
        this.f21804Oooooo = stringExtra3 != null ? stringExtra3 : "";
        if (this.f21807Ooooooo == ClientCodeType.Register) {
            o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
            new ApiEvent().OooO00o(60);
        }
        OooOo0O(1);
        OooOooO().f49846OooO0Oo.setOnClickListener(new o000O000(this, 1));
        OooOooO().f49847OooO0o.setColor(o000O0O0.OooO00o(R.color.color_FFB7B7B7));
        OooOooO().f49847OooO0o.OooO00o();
        ClientCodeType clientCodeType = this.f21807Ooooooo;
        int i = clientCodeType == null ? -1 : OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()];
        if (i == 1) {
            o0O00000.OooO0OO("Set_Password");
            OooOoO0(getString(R.string.sign_up_2));
            OooOooO().f49842OooO.setText(R.string.Create_password);
        } else if (i == 2) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s (2/2)", Arrays.copyOf(new Object[]{o000O0O0.OooO0OO(R.string.title_Forgot_Password)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            OooOoO0(str);
            OooOooO().f49842OooO.setText(R.string.Create_new_password);
        } else if (i == 3) {
            OooOoO0(getString(R.string.title_activity_bound_phone));
            OooOooO().f49842OooO.setText(R.string.Create_password);
        } else if (i != 4) {
            OooOoO0(getString(R.string.password));
        } else {
            OooOoO0(getString(R.string.Log_In));
            OooOooO().f49849OooO0oO.setVisibility(0);
            OooOooO().f49849OooO0oO.setEnabled(true);
            OooOooO().f49842OooO.setText(R.string.Registered_Phone_Number);
            OooOooO().f49850OooO0oo.setVisibility(0);
            String string = this.f21803OooooOo;
            if (com.yalla.support.common.util.OooO0OO.OooO0O0(this.f21805Oooooo0) && StringsKt__StringsJVMKt.startsWith$default(this.f21803OooooOo, this.f21805Oooooo0, false, 2, null)) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f21805Oooooo0);
                sb.append(' ');
                String strSubstring = this.f21803OooooOo.substring(this.f21805Oooooo0.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                string = sb.toString();
            }
            OooOooO().f49850OooO0oo.setText('+' + string);
        }
        OooOooO().f49849OooO0oO.setOnClickListener(new oo0OOoo(this));
        OooOooO().f49848OooO0o0.setOnClickListener(this);
        OooOooO().f49844OooO0O0.setOnClickListener(new o0O0o000(this));
        EditText editText = OooOooO().f49845OooO0OO;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.etPassword");
        editText.addTextChangedListener(new o0O0OOOo(this));
        EditText view = OooOooO().f49845OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "binding.etPassword");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = p472o0Oooo0.o00O000.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO0O0(view, "view.context"), new Handler()));
        LiveEventBus.get("LOGIN_RESULT").observe(this, new p044OooooOO.o00O000(this, 3));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        EditText view = OooOooO().f49845OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "binding.etPassword");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        p472o0Oooo0.o00O000.OooO00o(context).hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO0O0(view, "view.context"), new Handler()));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f21808o0OoOo0 = false;
    }

    @Override // android.app.Activity
    public final void recreate() {
    }
}
