package com.yalla.yalla.ui.activity.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.http.ApiEvent;
import com.app.base.view.VerifyCodeView;
import com.code.android.util.ToastUtil;
import com.geetest.captcha.GTCaptcha4Client;
import com.google.android.material.snackbar.Snackbar;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.MobclickAgent;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.common.manager.GeetCodeManager;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.model.DeleteAccountParamsModel;
import com.yalla.yalla.model.SmsCodeModel;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.account.SmsCodeVM;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooO.o00;
import p143o00OOooO.o00O0000;
import p154o00Oo0oO.o00000OO;
import p154o00Oo0oO.o00oO0o;
import p169o00Ooo0.o0OO00O;
import p169o00Ooo0.o0Oo0oo;
import p169o00Ooo0.oo000o;
import p176o00OooOo.oO0Oo;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o00O000o;
import p255o00ooO0O.o0O0ooO;
import p256o00ooO0o.oo0oOO0;
import p259o00ooOOo.f;
import p393o0OOooOo.o0O00000;
import p501o0o00OoO.o00O0O;
import p503o0o00o.o0000O0O;
import p536o0o0OOo0.o;
import p536o0o0OOo0.o0OO;
import p536o0o0OOo0.o0OO0o;
import p536o0o0OOo0.o0OO0oO0;
import p536o0o0OOo0.o0OOO0;
import p536o0o0OOo0.o0OOO00;
import p536o0o0OOo0.o0OOO0OO;
import p536o0o0OOo0.o0OOOO00;
import p536o0o0OOo0.o0OOOO0o;
import p536o0o0OOo0.o0OOo000;
import p536o0o0OOo0.o0o0000;
import p536o0o0OOo0.o0oo0000;
import p536o0o0OOo0.ooo0Oo0;
import p651o0ooOOoo.u6;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/SmsCodeActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SmsCodeActivity extends BaseActivityK {

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f21864oo000o = new OooO00o();

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f21868Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public ClientCodeType f21869Oooooo0;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f21872o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @NotNull
    public List<String> f21873o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public int f21874o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f21875o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @Nullable
    public GTCaptcha4Client f21876o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f21877o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public int f21878ooOO;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f21865OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(u6.class), this, null);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21866OooooOO = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SmsCodeVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.SmsCodeActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.SmsCodeActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.SmsCodeActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f21896Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21896Oooo;
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
    public final Lazy f21867OooooOo = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public String f21870OoooooO = "";

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public String f21871Ooooooo = "";

    public static final class OooO extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ OooOo<SmsCodeModel> f21880OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f21881OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i, OooOo<SmsCodeModel> oooOo) {
            super(1);
            this.f21881OoooO00 = i;
            this.f21880OoooO0 = oooOo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            SmsCodeActivity smsCodeActivity = SmsCodeActivity.this;
            OooO00o oooO00o = SmsCodeActivity.f21864oo000o;
            SmsCodeVM smsCodeVMOooo0O0 = smsCodeActivity.Oooo0O0();
            SmsCodeActivity smsCodeActivity2 = SmsCodeActivity.this;
            smsCodeVMOooo0O0.sendPhoneCode(smsCodeActivity2.f21870OoooooO, smsCodeActivity2.f21871Ooooooo, smsCodeActivity2.Oooo00O(), -1, this.f21881OoooO00, str2).observe(SmsCodeActivity.this, this.f21880OoooO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        public static void OooO00o(Context context, String str, String str2, ClientCodeType clientCodeType, int i, DeleteAccountParamsModel deleteAccountParamsModel, int i2) {
            OooO00o oooO00o = SmsCodeActivity.f21864oo000o;
            if ((i2 & 16) != 0) {
                i = -1;
            }
            if ((i2 & 32) != 0) {
                deleteAccountParamsModel = null;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) SmsCodeActivity.class);
            intent.putExtra("PHONE_NUMBER", str);
            intent.putExtra("COUNTRY_AREA_CODE", str2);
            intent.putExtra("TYPE_ACCOUNT", clientCodeType);
            intent.putExtra("TYPE_UNBIND", i);
            intent.putExtra("DELETE_REASON_TYPE", deleteAccountParamsModel);
            intent.putExtra("IS_ACTIVATE", 0);
            context.startActivity(intent);
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClientCodeType.values().length];
            iArr[ClientCodeType.Register.ordinal()] = 1;
            iArr[ClientCodeType.ChangeOld.ordinal()] = 2;
            iArr[ClientCodeType.BingingPhone.ordinal()] = 3;
            iArr[ClientCodeType.UnbindThird.ordinal()] = 4;
            iArr[ClientCodeType.Retrieve.ordinal()] = 5;
            iArr[ClientCodeType.Change.ordinal()] = 6;
            iArr[ClientCodeType.DeleteAccount.ordinal()] = 7;
            iArr[ClientCodeType.LoginVerification.ordinal()] = 8;
            iArr[ClientCodeType.TurnOnProtection.ordinal()] = 9;
            iArr[ClientCodeType.TunOnProtectionBingingPhone.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<OpenAuthManager> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OpenAuthManager invoke() {
            return new OpenAuthManager(SmsCodeActivity.this);
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Boolean, String, Unit> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f21884OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Function1<? super String, Unit> function1) {
            super(2);
            this.f21884OoooO00 = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Boolean bool, String str) {
            boolean zBooleanValue = bool.booleanValue();
            String code2 = str;
            Intrinsics.checkNotNullParameter(code2, "code");
            if (zBooleanValue) {
                SmsCodeActivity smsCodeActivity = SmsCodeActivity.this;
                Objects.requireNonNull(smsCodeActivity);
                smsCodeActivity.f21876o00ooo = GeetCodeManager.INSTANCE.call(smsCodeActivity, code2, new com.yalla.yalla.ui.activity.account.OooO00o(smsCodeActivity), new com.yalla.yalla.ui.activity.account.OooO0O0(SmsCodeActivity.this), new com.yalla.yalla.ui.activity.account.OooO0OO(SmsCodeActivity.this, this.f21884OoooO00));
            } else {
                this.f21884OoooO00.invoke(null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ OooOo<SmsCodeModel> f21886OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f21887OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i, OooOo<SmsCodeModel> oooOo) {
            super(1);
            this.f21887OoooO00 = i;
            this.f21886OoooO0 = oooOo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            SmsCodeActivity smsCodeActivity = SmsCodeActivity.this;
            OooO00o oooO00o = SmsCodeActivity.f21864oo000o;
            smsCodeActivity.Oooo0O0().sendPhoneCode("", "", SmsCodeActivity.this.Oooo00O(), SmsCodeActivity.this.f21868Oooooo, this.f21887OoooO00, str2).observe(SmsCodeActivity.this, this.f21886OoooO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ OooOo<SmsCodeModel> f21889OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f21890OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(int i, OooOo<SmsCodeModel> oooOo) {
            super(1);
            this.f21890OoooO00 = i;
            this.f21889OoooO0 = oooOo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            SmsCodeActivity smsCodeActivity = SmsCodeActivity.this;
            OooO00o oooO00o = SmsCodeActivity.f21864oo000o;
            SmsCodeVM smsCodeVMOooo0O0 = smsCodeActivity.Oooo0O0();
            SmsCodeActivity smsCodeActivity2 = SmsCodeActivity.this;
            smsCodeVMOooo0O0.sendPhoneCode(smsCodeActivity2.f21870OoooooO, smsCodeActivity2.f21871Ooooooo, smsCodeActivity2.Oooo00O(), SmsCodeActivity.this.f21868Oooooo, this.f21890OoooO00, str2).observe(SmsCodeActivity.this, this.f21889OoooO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<ApiError, Unit> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            if (ClientCodeType.Register == SmsCodeActivity.this.f21869Oooooo0) {
                o0O00000.OooO0o0("send_verify_code_fail", SmsCodeActivity.this.f21871Ooooooo + SmsCodeActivity.this.f21870OoooooO);
            }
            if (ClientCodeType.Retrieve == SmsCodeActivity.this.f21869Oooooo0) {
                o0O00000.OooO0OO("Forgot_password_send_fail");
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<SmsCodeModel, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SmsCodeModel smsCodeModel) {
            StringBuilder sbOooO0O0;
            SmsCodeModel smsCodeModel2 = smsCodeModel;
            SmsCodeActivity smsCodeActivity = SmsCodeActivity.this;
            OooO00o oooO00o = SmsCodeActivity.f21864oo000o;
            smsCodeActivity.Oooo0().f50698OooO.setTextColor(o000O0O0.OooO00o(R.color.color_alpha_38));
            o0Oo0oo o0oo0oo2 = o0OO00O.f32674OooO00o;
            if (o0oo0oo2 != null) {
                o0oo0oo2.cancel();
                o0OO00O.f32675OooO0O0 = null;
                o0OO00O.f32674OooO00o = null;
            }
            o0Oo0oo o0oo0oo3 = new o0Oo0oo();
            o0OO00O.f32674OooO00o = o0oo0oo3;
            o0oo0oo3.start();
            SmsCodeActivity smsCodeActivity2 = SmsCodeActivity.this;
            o0OO00O.f32675OooO0O0 = smsCodeActivity2.f21870OoooooO;
            if (smsCodeModel2 != null) {
                int iOooO0Oo = com.yalla.support.common.util.OooO.OooO0Oo(smsCodeModel2.getInterval(), -1);
                String msgrandom = smsCodeModel2.getMsgrandom();
                Ref.IntRef intRef = new Ref.IntRef();
                if (iOooO0Oo == -1) {
                    smsCodeActivity2.OooOoO();
                    String strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.verification_code_send_successed);
                    String[] strArr = new String[1];
                    if (oo000o.OooO0o0()) {
                        sbOooO0O0 = new StringBuilder();
                        sbOooO0O0.append(smsCodeActivity2.f21870OoooooO);
                        sbOooO0O0.append('+');
                    } else {
                        sbOooO0O0 = OooO00o.OooO0OO.OooO0O0('+');
                        sbOooO0O0.append(smsCodeActivity2.f21870OoooooO);
                    }
                    strArr[0] = sbOooO0O0.toString();
                    String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO, strArr);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (!StringsKt.isBlank(strOooO00o)) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO00o, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                } else {
                    smsCodeActivity2.Oooo0O0().checkVerCodeSendType(iOooO0Oo, msgrandom, smsCodeActivity2.Oooo00O()).observe(smsCodeActivity2, new OooOo(new o0OO0o(intRef, smsCodeActivity2), null, new o0OO0oO0(smsCodeActivity2), false, 10));
                }
                if (intRef.element != 2 && smsCodeActivity2.f21874o00Ooo == 2) {
                    oo0oOO0 oo0ooo0 = new oo0oOO0(smsCodeActivity2);
                    oo0ooo0.OooOo0O(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.account_send_whats_app_failed));
                    oo0ooo0.OooOOO0();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<ApiResult<SmsCodeModel>, Unit> {
        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<SmsCodeModel> apiResult) {
            ApiResult<SmsCodeModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            SmsCodeActivity.this.OooOoO();
            return Unit.INSTANCE;
        }
    }

    public SmsCodeActivity() {
        p499o0o00Oo.OooOOO0 oooOOO0 = p499o0o00Oo.OooOOO0.f41199OooO00o;
        o00O0O o00o0oOooO00o = p499o0o00Oo.OooOOO0.OooO00o();
        Objects.requireNonNull(o00o0oOooO00o);
        this.f21878ooOO = o00o0oOooO00o.OooO0O0(p642o0ooO0oO.o000O0O0.OooO00o(-20584465755889L), 1);
        o00O0O o00o0oOooO00o2 = p499o0o00Oo.OooOOO0.OooO00o();
        Objects.requireNonNull(o00o0oOooO00o2);
        this.f21873o00Oo0 = StringsKt__StringsKt.split$default(o00o0oOooO00o2.OooO0Oo(p642o0ooO0oO.o000O0O0.OooO00o(-20704724840177L), p642o0ooO0oO.o000O0O0.OooO00o(-20786329218801L)), new String[]{","}, false, 0, 6, (Object) null);
    }

    public static final void OooOoo(SmsCodeActivity smsCodeActivity) {
        ClientCodeType clientCodeType = smsCodeActivity.f21869Oooooo0;
        int i = 1;
        if ((clientCodeType == null ? -1 : OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()]) != 1) {
            SharedUrlManager.INSTANCE.getFeedBackLoginUrl().observe(smsCodeActivity, new o0000O0O(smsCodeActivity, i));
            return;
        }
        o0O00000.OooO0OO("verify_code_another_way");
        smsCodeActivity.Oooo0o0(false);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(smsCodeActivity), null, null, new o(smsCodeActivity, null), 3, null);
    }

    public static final void OooOooO(SmsCodeActivity smsCodeActivity) {
        Snackbar snackbarOooOO0O = Snackbar.OooOO0O(smsCodeActivity.Oooo0().f50704OooO0o0);
        snackbarOooOO0O.OooOO0o(new f(smsCodeActivity, 1));
        snackbarOooOO0O.f17716OooO0o0 = 5000;
        snackbarOooOO0O.OooOOO0();
    }

    public static final void OooOooo(SmsCodeActivity smsCodeActivity, ApiError apiError) {
        Objects.requireNonNull(smsCodeActivity);
        int code2 = apiError.getCode();
        if (code2 == 1022 || code2 == 1023) {
            VerifyCodeView verifyCodeView = smsCodeActivity.Oooo0().f50717OooOo0;
            int childCount = verifyCodeView.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                } else {
                    ((EditText) verifyCodeView.getChildAt(childCount)).setText("");
                }
            }
            verifyCodeView.OooO0OO();
            VerifyCodeView verifyCodeView2 = smsCodeActivity.Oooo0().f50717OooOo0;
            Objects.requireNonNull(verifyCodeView2);
            TranslateAnimation translateAnimation = new TranslateAnimation(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 20.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            translateAnimation.setInterpolator(new CycleInterpolator(2.0f));
            translateAnimation.setDuration(500L);
            if (verifyCodeView2.f12165OoooOo0 != 0) {
                for (int i = 0; i < verifyCodeView2.getChildCount(); i++) {
                    verifyCodeView2.getChildAt(i).setBackgroundResource(verifyCodeView2.f12165OoooOo0);
                }
            }
            translateAnimation.setAnimationListener(new oO0Oo(verifyCodeView2));
            verifyCodeView2.startAnimation(translateAnimation);
            if (ClientCodeType.Register == smsCodeActivity.f21869Oooooo0) {
                o0O00000.OooO0OO("verify_code_fail");
            }
        } else {
            smsCodeActivity.Oooo0().f50717OooOo0.OooO0Oo();
        }
        if (ClientCodeType.Retrieve == smsCodeActivity.f21869Oooooo0) {
            o0O00000.OooO0OO("Forgot_password_code_fail");
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOOo0() {
        finish();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOOoo() {
        MobclickAgent.onPageEnd(SmsCodeActivity.class.getName() + "-Type" + this.f21869Oooooo0);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final boolean OooOo0() {
        return false;
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOo00() {
        MobclickAgent.onPageStart(SmsCodeActivity.class.getName() + "-Type" + this.f21869Oooooo0);
    }

    public final u6 Oooo0() {
        return (u6) this.f21865OooooO0.getValue();
    }

    public final void Oooo000(Function1<? super String, Unit> function1) {
        GTCaptcha4Client gTCaptcha4Client = this.f21876o00ooo;
        if (gTCaptcha4Client != null) {
            gTCaptcha4Client.destroy();
        }
        this.f21876o00ooo = null;
        BaseActivityK.OooOoo0(this, null, 0L, 3, null);
        Oooo0O0().getGeetCode(this.f21870OoooooO, Oooo00O(), new OooO0o(function1));
    }

    public final int Oooo00O() {
        ClientCodeType clientCodeType = this.f21869Oooooo0;
        switch (clientCodeType == null ? -1 : OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()]) {
            case 1:
            default:
                return 1;
            case 2:
            case 6:
                return 3;
            case 3:
            case 10:
                return 2;
            case 4:
                return 4;
            case 5:
                return 0;
            case 7:
                return 5;
            case 8:
                return 6;
            case 9:
                return 7;
        }
    }

    public final OpenAuthManager Oooo00o() {
        return (OpenAuthManager) this.f21867OooooOo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SmsCodeVM Oooo0O0() {
        return (SmsCodeVM) this.f21866OooooOO.getValue();
    }

    public final void Oooo0OO(boolean z) {
        OooOo oooOo = new OooOo(new OooOOO0(), new OooOOO(), new OooOOOO(), false, 8);
        ClientCodeType clientCodeType = this.f21869Oooooo0;
        int i = clientCodeType == null ? -1 : OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()];
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                Oooo000(new OooOO0O(z ? 1 : 0, oooOo));
                return;
            } else {
                Oooo000(new OooOO0(z ? 1 : 0, oooOo));
                return;
            }
        }
        String str = o0OO00O.f32675OooO0O0;
        if (str != null && str.length() != 0) {
            z2 = false;
        }
        if (com.yalla.support.common.util.OooO0OO.OooO00o(Boolean.valueOf(z2)) || !Intrinsics.areEqual(this.f21870OoooooO, str)) {
            Oooo000(new OooO(z ? 1 : 0, oooOo));
        }
    }

    public final void Oooo0o0(boolean z) {
        if (!z) {
            Oooo0().f50717OooOo0.clearFocus();
            VerifyCodeView view = Oooo0().f50717OooOo0;
            Intrinsics.checkNotNullExpressionValue(view, "binding.verificationCodeView");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = p472o0Oooo0.o00O000.OooO00o(context);
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "view.context");
            inputMethodManagerOooO00o.hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(context2.getApplicationContext(), new Handler()));
            return;
        }
        Oooo0().f50717OooOo0.OooO0Oo();
        View view2 = Oooo0().f50717OooOo0.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(view2, "binding.verificationCodeView.getChildAt(0)");
        Intrinsics.checkNotNullParameter(view2, "view");
        Context context3 = view2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "view.context");
        InputMethodManager inputMethodManagerOooO00o2 = p472o0Oooo0.o00O000.OooO00o(context3);
        view2.setFocusable(true);
        view2.setFocusableInTouchMode(true);
        view2.requestFocus();
        Context context4 = view2.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "view.context");
        inputMethodManagerOooO00o2.showSoftInput(view2, 2, new KeyBoardUtil$showKeyboard$1(context4.getApplicationContext(), new Handler()));
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Oooo00o().OooO0oO(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Oooo0().f50699OooO00o);
        String stringExtra = getIntent().getStringExtra("PHONE_NUMBER");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f21870OoooooO = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("COUNTRY_AREA_CODE");
        String str = stringExtra2 != null ? stringExtra2 : "";
        this.f21871Ooooooo = str;
        this.f21877o0OoOo0 = Intrinsics.areEqual(str, "62") || Intrinsics.areEqual(this.f21871Ooooooo, "+62");
        Serializable serializableExtra = getIntent().getSerializableExtra("TYPE_ACCOUNT");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.data.constant.ClientCodeType");
        this.f21869Oooooo0 = (ClientCodeType) serializableExtra;
        this.f21868Oooooo = getIntent().getIntExtra("TYPE_UNBIND", -1);
        if (ClientCodeType.Register == this.f21869Oooooo0) {
            o0O00000.OooO0OO("Sign_code");
            o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
            new ApiEvent().OooO00o(50);
        }
        Oooo00o().f21667OooO0O0 = new o0OO(this);
        Oooo00o().f21669OooO0Oo = new o0OOO00(this);
        Oooo00o().f21668OooO0OO = new o0OOO0(this);
        Oooo0().f50717OooOo0.clearFocus();
        boolean zContains = this.f21873o00Oo0.contains(String.valueOf(getIntent().getStringExtra("COUNTRY_AREA_CODE")));
        this.f21872o00O0O = zContains;
        int i = 2;
        if (this.f21878ooOO != 2 || !zContains) {
            Oooo0OO(false);
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new o0OOO0OO(this, null));
        }
        OooOo0O(1);
        if (this.f21878ooOO == 2 && this.f21872o00O0O) {
            LinearLayout linearLayout = Oooo0().f50703OooO0o;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llSms");
            com.yalla.support.common.util.o00O0O.OooO00o(linearLayout);
            TextView textView = Oooo0().f50713OooOOOo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSmsTime");
            com.yalla.support.common.util.o00O0O.OooO00o(textView);
            TextView textView2 = Oooo0().f50718OooOo00;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvWhatsAppTime");
            com.yalla.support.common.util.o00O0O.OooO00o(textView2);
            TextView textView3 = Oooo0().f50707OooOO0;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvBottomText");
            com.yalla.support.common.util.o00O0O.OooO00o(textView3);
            ImageView imageView = Oooo0().f50700OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivOtherLogin");
            com.yalla.support.common.util.o00O0O.OooO00o(imageView);
            LinearLayout linearLayout2 = Oooo0().f50705OooO0oO;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llSmsOrWhatApp");
            com.yalla.support.common.util.o00O0O.OooO(linearLayout2);
            Oooo0().f50715OooOOo0.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.enter_select_code));
        } else {
            LinearLayout linearLayout3 = Oooo0().f50703OooO0o;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.llSms");
            com.yalla.support.common.util.o00O0O.OooO(linearLayout3);
            TextView textView4 = Oooo0().f50708OooOO0O;
            Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvFeedback");
            com.yalla.support.common.util.o00O0O.OooO00o(textView4);
            TextView textView5 = Oooo0().f50711OooOOO0;
            Intrinsics.checkNotNullExpressionValue(textView5, "binding.tvPhoneError");
            com.yalla.support.common.util.o00O0O.OooO00o(textView5);
            LinearLayout linearLayout4 = Oooo0().f50705OooO0oO;
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "binding.llSmsOrWhatApp");
            com.yalla.support.common.util.o00O0O.OooO00o(linearLayout4);
        }
        ClientCodeType clientCodeType = this.f21869Oooooo0;
        switch (clientCodeType != null ? OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()] : -1) {
            case 1:
                OooOoO0(getString(R.string.sign_up_1));
                TextView textView6 = Oooo0().f50711OooOOO0;
                Intrinsics.checkNotNullExpressionValue(textView6, "binding.tvPhoneError");
                com.yalla.support.common.util.o00O0O.OooO(textView6);
                TextView textView7 = Oooo0().f50709OooOO0o;
                Intrinsics.checkNotNullExpressionValue(textView7, "binding.tvNotReceive");
                com.yalla.support.common.util.o00O0O.OooO(textView7);
                TextView textView8 = Oooo0().f50708OooOO0O;
                Intrinsics.checkNotNullExpressionValue(textView8, "binding.tvFeedback");
                com.yalla.support.common.util.o00O0O.OooO(textView8);
                TextView textView9 = Oooo0().f50707OooOO0;
                Intrinsics.checkNotNullExpressionValue(textView9, "binding.tvBottomText");
                com.yalla.support.common.util.o00O0O.OooO(textView9);
                ImageView imageView2 = Oooo0().f50700OooO0O0;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivOtherLogin");
                com.yalla.support.common.util.o00O0O.OooO(imageView2);
                Oooo0().f50708OooOO0O.setText(R.string.Try_another_log_in);
                Oooo0().f50707OooOO0.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.try_another_login));
                break;
            case 2:
                OooOo(R.string.title_Phone_enterCode);
                break;
            case 3:
                OooOo(R.string.title_Phone_enterCode);
                break;
            case 4:
                OooOo(R.string.title_Phone_enterCode);
                break;
            case 5:
                o0O00000.OooO0OO("Forgot_password");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str2 = String.format("%s (1/2)", Arrays.copyOf(new Object[]{com.yalla.support.common.util.OooOOO.OooO0OO(R.string.title_Forgot_Password)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                OooOoO0(str2);
                TextView textView10 = Oooo0().f50708OooOO0O;
                Intrinsics.checkNotNullExpressionValue(textView10, "binding.tvFeedback");
                com.yalla.support.common.util.o00O0O.OooO(textView10);
                ImageView imageView3 = Oooo0().f50700OooO0O0;
                Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivOtherLogin");
                com.yalla.support.common.util.o00O0O.OooO00o(imageView3);
                TextView textView11 = Oooo0().f50707OooOO0;
                Intrinsics.checkNotNullExpressionValue(textView11, "binding.tvBottomText");
                com.yalla.support.common.util.o00O0O.OooO(textView11);
                Oooo0().f50708OooOO0O.setText(R.string.Have_Problem);
                Oooo0().f50707OooOO0.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Have_Problem));
                break;
            case 6:
                OooOo(R.string.title_Phone_enterCode);
                break;
            case 7:
                OooOo(R.string.delete_account);
                TextView textView12 = Oooo0().f50714OooOOo;
                Intrinsics.checkNotNullExpressionValue(textView12, "binding.tvVerification");
                com.yalla.support.common.util.o00O0O.OooO(textView12);
                if (!this.f21872o00O0O || this.f21878ooOO != 2) {
                    Oooo0().f50715OooOOo0.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.account_delete_account_code_title));
                }
                Oooo0().f50714OooOOo.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.verification_title));
                break;
            case 8:
                OooOo(R.string.account_login_verification);
                LinearLayout linearLayout5 = Oooo0().f50706OooO0oo;
                Intrinsics.checkNotNullExpressionValue(linearLayout5, "binding.llTurnLoginProtection");
                com.yalla.support.common.util.o00O0O.OooO(linearLayout5);
                break;
            default:
                OooOo(R.string.title_Phone_enterCode);
                break;
        }
        String string = this.f21870OoooooO;
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(this.f21871Ooooooo) && StringsKt__StringsJVMKt.startsWith$default(this.f21870OoooooO, this.f21871Ooooooo, false, 2, null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f21871Ooooooo);
            sb.append(' ');
            String strSubstring = this.f21870OoooooO.substring(this.f21871Ooooooo.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            sb.append(strSubstring);
            string = sb.toString();
        }
        Oooo0().f50710OooOOO.setText('+' + string);
        Oooo0().f50717OooOo0.setBackgroundErrorResource(R.drawable.shape_bg_ver_code_error);
        Oooo0().f50717OooOo0.setOnCompleteListener(new p176o00OooOo.o0OOO0OO(this));
        TextView textView13 = Oooo0().f50712OooOOOO;
        Intrinsics.checkNotNullExpressionValue(textView13, "binding.tvSms");
        com.yalla.support.common.util.o00O0O.OooO0Oo(textView13, new o0OOOO00(this));
        TextView textView14 = Oooo0().f50716OooOOoo;
        Intrinsics.checkNotNullExpressionValue(textView14, "binding.tvWhatsApp");
        com.yalla.support.common.util.o00O0O.OooO0Oo(textView14, new o0OOOO0o(this));
        TextView textView15 = Oooo0().f50707OooOO0;
        Intrinsics.checkNotNullExpressionValue(textView15, "binding.tvBottomText");
        com.yalla.support.common.util.o00O0O.OooO0Oo(textView15, new o0OOo000(this));
        TextView textView16 = Oooo0().f50711OooOOO0;
        Intrinsics.checkNotNullExpressionValue(textView16, "binding.tvPhoneError");
        com.yalla.support.common.util.o00O0O.OooO0Oo(textView16, new o0o0000(this));
        TextView textView17 = Oooo0().f50708OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView17, "binding.tvFeedback");
        com.yalla.support.common.util.o00O0O.OooO0Oo(textView17, new p536o0o0OOo0.oO0Oo(this));
        TextView textView18 = Oooo0().f50698OooO;
        Intrinsics.checkNotNullExpressionValue(textView18, "binding.tvAgain");
        com.yalla.support.common.util.o00O0O.OooO0Oo(textView18, new o0oo0000(this));
        o0OO00O.f32676OooO0OO = new ooo0Oo0(this);
        if (this.f21877o0OoOo0) {
            Oooo0().f50701OooO0OO.setBackgroundResource(R.drawable.account_whats_app);
            Oooo0().f50702OooO0Oo.setBackgroundResource(R.drawable.account_sms);
            Oooo0().f50712OooOOOO.setText(R.string.account_send_whats_app);
            Oooo0().f50716OooOOoo.setText(R.string.account_send_sms);
        } else {
            Oooo0().f50701OooO0OO.setBackgroundResource(R.drawable.account_sms);
            Oooo0().f50702OooO0Oo.setBackgroundResource(R.drawable.account_whats_app);
            Oooo0().f50712OooOOOO.setText(R.string.account_send_sms);
            Oooo0().f50716OooOOoo.setText(R.string.account_send_whats_app);
        }
        LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new p143o00OOooO.o000O0O0(this, i));
        LiveEventBus.get("LOGIN_RESULT").observe(this, new o00(this, i));
        p489o0o000oO.oo000o oo000oVar = p489o0o000oO.oo000o.f40977OooO00o;
        p489o0o000oO.oo000o.OooO00o().observe(this, new o00O0000(this, i));
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        GTCaptcha4Client gTCaptcha4Client = this.f21876o00ooo;
        if (gTCaptcha4Client != null) {
            gTCaptcha4Client.destroy();
        }
        this.f21876o00ooo = null;
        o0OO00O.f32676OooO0OO = null;
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        Oooo0o0(false);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (Oooo0().f50717OooOo0.getCurrentAmount() == Oooo0().f50717OooOo0.getChildCount()) {
            Oooo0().f50717OooOo0.OooO0Oo();
        }
    }
}
