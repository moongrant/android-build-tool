package com.yalla.yalla.ui.activity.account;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.billingclient.api.o00000O;
import com.app.base.http.ApiEvent;
import com.app.base.model.CountryCodeItemModel;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.MobclickAgent;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.vm.account.PhNumberVM;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0o0000.OooOOOO;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p025Oooo0O0.o000O0Oo;
import p074o000O0oo.OooOOO;
import p143o00OOooO.o000O000;
import p143o00OOooO.o000Oo0;
import p154o00Oo0oO.o00000OO;
import p154o00Oo0oO.o00oO0o;
import p169o00Ooo0.oo000o;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000o;
import p255o00ooO0O.o0O0ooO;
import p393o0OOooOo.o0O00000;
import p472o0Oooo0.o00O000;
import p524o0o0O0o.oo0o0O0;
import p536o0o0OOo0.o0OO0;
import p536o0o0OOo0.o0OO00OO;
import p536o0o0OOo0.o0OO00o0;
import p536o0o0OOo0.o0OO0O0;
import p536o0o0OOo0.oo0oO0;
import p536o0o0OOo0.oo0ooO;
import p618o0oo0Ooo.oO0O000o;
import p622o0oo0o0O.o00O00OO;
import p622o0oo0o0O.oOO00O;
import p651o0ooOOoo.o6;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/PhoneNumberActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PhoneNumberActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f21838Oooooo = new OooO00o();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public ClientCodeType f21840OooooOO;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f21839OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(o6.class), this, null);

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21841OooooOo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PhNumberVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.PhoneNumberActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.PhoneNumberActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.PhoneNumberActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f21845Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21845Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public String f21842Oooooo0 = "";

    public static final class OooO00o {
        public final void OooO00o(@NotNull Activity context, @Nullable String str, @Nullable ClientCodeType clientCodeType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) PhoneNumberActivity.class);
            intent.putExtra("PHONE_NUMBER", str);
            intent.putExtra("TYPE_ACCOUNT", clientCodeType);
            context.startActivity(intent);
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClientCodeType.values().length];
            iArr[ClientCodeType.Login.ordinal()] = 1;
            iArr[ClientCodeType.Change.ordinal()] = 2;
            iArr[ClientCodeType.BingingPhone.ordinal()] = 3;
            iArr[ClientCodeType.TunOnProtectionBingingPhone.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOOoo() {
        MobclickAgent.onPageEnd(PhoneNumberActivity.class.getName() + "-Type" + this.f21840OooooOO);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final boolean OooOo0() {
        return false;
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOo00() {
        MobclickAgent.onPageStart(PhoneNumberActivity.class.getName() + "-Type" + this.f21840OooooOO);
    }

    public final o6 OooOoo() {
        return (o6) this.f21839OooooO0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PhNumberVM OooOooO() {
        return (PhNumberVM) this.f21841OooooOo.getValue();
    }

    public final void OooOooo(CountryCodeItemModel countryCodeItemModel) {
        if (countryCodeItemModel == null) {
            return;
        }
        oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this);
        oooO00o.f48447OooO0OO = oo000o.OooO0OO(countryCodeItemModel.getId());
        oooO00o.f48445OooO00o = 0;
        oooO00o.OooO0o(OooOoo().f50166OooO0o0);
        OooOooO().setPhoneAreaCodeInfo(countryCodeItemModel);
        OooOoo().f50168OooO0oo.setText(countryCodeItemModel.getCountryCode());
        Oooo000();
    }

    public final void Oooo000() {
        String string = StringsKt.trim((CharSequence) OooOoo().f50163OooO0OO.getText().toString()).toString();
        Button button = OooOoo().f50162OooO0O0;
        int length = string.length();
        button.setEnabled(5 <= length && length < 21);
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(string)) {
            OooOoo().f50164OooO0Oo.setVisibility(0);
            OooOoo().f50164OooO0Oo.setClickable(true);
        } else {
            OooOoo().f50164OooO0Oo.setClickable(false);
            OooOoo().f50164OooO0Oo.setVisibility(4);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoo().f50164OooO0Oo)) {
            OooOoo().f50163OooO0OO.setText("");
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f50167OooO0oO)) {
            o0O00000.OooO0OO("Sign_country");
            oOO00O ooo00o = new oOO00O(this);
            ooo00o.f48639OooO0O0 = PhoneCountryCodeSelectActivity.class;
            ooo00o.OooO0O0(new o00O00OO() { // from class: o0o0OOo0.o0OO000o
                @Override // p622o0oo0o0O.o00O00OO
                public final void onActivityResult(int i, Intent intent) {
                    PhoneNumberActivity this$0 = this.f43590OooO00o;
                    PhoneNumberActivity.OooO00o oooO00o = PhoneNumberActivity.f21838Oooooo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (intent != null) {
                        Serializable serializableExtra = intent.getSerializableExtra("DATA");
                        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.app.base.model.CountryCodeItemModel");
                        this$0.OooOooo((CountryCodeItemModel) serializableExtra);
                    }
                }
            });
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f50162OooO0O0)) {
            ClientCodeType clientCodeType = ClientCodeType.Register;
            ClientCodeType clientCodeType2 = this.f21840OooooOO;
            if (clientCodeType == clientCodeType2 || ClientCodeType.Login == clientCodeType2) {
                o0O00000.OooO0OO("SignOrLog");
                o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
                new ApiEvent().OooO00o(40);
            }
            String string = StringsKt.trim((CharSequence) OooOoo().f50163OooO0OO.getText().toString()).toString();
            EditText view2 = OooOoo().f50163OooO0OO;
            Intrinsics.checkNotNullExpressionValue(view2, "binding.etPhoneNumber");
            Intrinsics.checkNotNullParameter(view2, "view");
            Context context = view2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            o00O000.OooO00o(context).hideSoftInputFromWindow(view2.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO0O0(view2, "view.context"), new Handler()));
            if (StringsKt.isBlank(string)) {
                String string2 = getString(R.string.input_number);
                ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                if (string2 == null || StringsKt.isBlank(string2)) {
                    return;
                }
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, string2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                    return;
                } else {
                    p255o00ooO0O.o00O000 o00o001 = p255o00ooO0O.o00O000.f34368OooO00o;
                    p255o00ooO0O.o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                    return;
                }
            }
            if (StringsKt__StringsJVMKt.startsWith$default(string, AppEventsConstants.EVENT_PARAM_VALUE_NO, false, 2, null)) {
                string = string.substring(1);
                Intrinsics.checkNotNullExpressionValue(string, "this as java.lang.String).substring(startIndex)");
            }
            String string3 = StringsKt.trim((CharSequence) OooOoo().f50168OooO0oo.getText().toString()).toString();
            String strOooO00o = OooOo00.OooO00o(string3, string);
            if (this.f21840OooooOO != ClientCodeType.Change || !com.yalla.support.common.util.OooO0OO.OooO0O0(this.f21842Oooooo0) || !Intrinsics.areEqual(this.f21842Oooooo0, strOooO00o)) {
                BaseActivityK.OooOoo0(this, null, 0L, 3, null);
                OooOooO().checkPhoneRegister(strOooO00o, string3).observe(this, new OooOo(new oo0oO0(this, strOooO00o, string3), new oo0ooO(this), new o0OO00OO(this), false, 8));
            } else {
                ApiError error = new ApiError(1016, null, 2, null);
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
            }
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50161OooO00o);
        String stringExtra = getIntent().getStringExtra("PHONE_NUMBER");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f21842Oooooo0 = stringExtra;
        Serializable serializableExtra = getIntent().getSerializableExtra("TYPE_ACCOUNT");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.data.constant.ClientCodeType");
        ClientCodeType clientCodeType = (ClientCodeType) serializableExtra;
        this.f21840OooooOO = clientCodeType;
        if (ClientCodeType.Register == clientCodeType || ClientCodeType.Login == clientCodeType) {
            o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
            new ApiEvent().OooO00o(30);
        }
        OooOo0O(1);
        OooOooo(OooOooO().getPhoneAreaCodeInfo());
        OooOoo().f50164OooO0Oo.setOnClickListener(this);
        OooOoo().f50167OooO0oO.setOnClickListener(this);
        OooOoo().f50165OooO0o.setColor(o000O0O0.OooO00o(R.color.color_FFB7B7B7));
        ClientCodeType clientCodeType2 = this.f21840OooooOO;
        int i = clientCodeType2 == null ? -1 : OooO0O0.$EnumSwitchMapping$0[clientCodeType2.ordinal()];
        int i2 = 4;
        int i3 = 2;
        if (i == 1) {
            OooOo(R.string.title_Verify_Phone_Number);
            OooOoo().f50162OooO0O0.setText(R.string.Login_login_or_signup);
        } else if (i == 2) {
            OooOo(R.string.title_Phone_changePhone);
            OooOoo().f50169OooOO0.setText(R.string.tips_Phone_TellUs);
        } else if (i == 3 || i == 4) {
            OooOo(R.string.title_Phone_connectPhone);
            OooOoo().f50169OooOO0.setText(R.string.verify_phone_number_tips);
        } else {
            OooOo(R.string.title_Verify_Phone_Number);
        }
        OooOoo().f50162OooO0O0.setOnClickListener(this);
        EditText editText = OooOoo().f50163OooO0OO;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.etPhoneNumber");
        editText.addTextChangedListener(new o0OO00o0(this));
        String loginPhoneNumber = o00000O.OooO0O0().OooO0OO("LOGIN_PHONE_NUMBER");
        Intrinsics.checkNotNullExpressionValue(loginPhoneNumber, "loginPhoneNumber");
        if (!StringsKt.isBlank(loginPhoneNumber)) {
            OooOoo().f50163OooO0OO.setText(loginPhoneNumber);
            OooOoo().f50163OooO0OO.setSelection(loginPhoneNumber.length());
        } else {
            OooOoo().f50165OooO0o.OooO00o();
            EditText view = OooOoo().f50163OooO0OO;
            Intrinsics.checkNotNullExpressionValue(view, "binding.etPhoneNumber");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO0O0(view, "view.context"), new Handler()));
        }
        TextView textView = OooOoo().f50160OooO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTermsService");
        oo0o0O0.OooO0O0(textView, o000O0O0.OooO0OO(R.string.terms_service), new o0OO0(this));
        TextView textView2 = OooOoo().f50160OooO;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvTermsService");
        oo0o0O0.OooO0O0(textView2, o000O0O0.OooO0OO(R.string.privacy_policy), new o0OO0O0(this));
        TextView textView3 = OooOoo().f50160OooO;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTermsService");
        oo0o0O0.OooO0o0(textView3, new String[]{o000O0O0.OooO0OO(R.string.terms_service), o000O0O0.OooO0OO(R.string.privacy_policy)}, o000O0O0.OooO00o(R.color.color_e9a711));
        LiveEventBus.get("LOGIN_RESULT").observe(this, new o000Oo0(this, i2));
        LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new o000O000(this, i3));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        EditText view = OooOoo().f50163OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "binding.etPhoneNumber");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO0O0(view, "view.context"), new Handler()));
    }
}
