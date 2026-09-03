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
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.code.android.util.o0OoOo0;
import com.geetest.captcha.GTCaptcha4Client;
import com.google.android.material.snackbar.Snackbar;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.api.old.ApiEvent;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.model.DeleteAccountParamsModel;
import com.yalla.yalla.model.SmsCodeModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import com.yalla.yalla.ui.view.VerifyCodeView;
import com.yalla.yalla.ui.vm.account.SmsCodeVM;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOo0.o000Oo0;
import p157o00OoOO0.o0OO00O;
import p367o0OOo0o0.Oooo000;
import p377o0OOoOo.o0000OO0;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p402o0Oo0OOO.o00O000o;
import p408o0Oo0o0O.o00Oo0;
import p427o0OoOO00.o00Ooo;
import p474o0o00.o0O00;
import p474o0o00.o0O0000O;
import p474o0o00.o0O000O;
import p474o0o00.o0O000Oo;
import p474o0o00.o0O000o0;
import p474o0o00.o0O00O;
import p474o0o00.o0O00O0o;
import p474o0o00.o0O00OO;
import p474o0o00.o0O00OOO;
import p474o0o00.o0O00o00;
import p474o0o00.o0O00oO0;
import p474o0o00.o0O0O0O;
import p474o0o00.o0O0O0Oo;
import p474o0o00.o0O0O0o0;
import p474o0o00.o0O0oo0o;
import p474o0o00.o0OoOoOo;
import p474o0o00.o0oO0O0o;
import p474o0o00.o0oO0Ooo;
import p539o0o0OoOO.q3;
import p579o0oOoo.oOOO00;
import p579o0oOoo.oOOO000o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.f0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/SmsCodeActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmsCodeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmsCodeActivity.kt\ncom/yalla/yalla/ui/activity/account/SmsCodeActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,757:1\n22#2,2:758\n75#3,13:760\n262#4,2:773\n*S KotlinDebug\n*F\n+ 1 SmsCodeActivity.kt\ncom/yalla/yalla/ui/activity/account/SmsCodeActivity\n*L\n63#1:758,2\n65#1:760,13\n311#1:773,2\n*E\n"})
public final class SmsCodeActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final /* synthetic */ int f25298Oooo0 = 0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public ClientCodeType f25303OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f25304OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f25305OooOoO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f25309OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f25310OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f25311OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public String f25312Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f25313Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public GTCaptcha4Client f25314Oooo00o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25299OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(f0.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25302OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SmsCodeVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.SmsCodeActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25332OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25332OooO0Oo;
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
    public final Lazy f25301OooOo0 = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public String f25300OooOo = "";

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public String f25306OooOoO0 = "";

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f25307OooOoOO = o00Oo0.OooO00o().OooO0OO("phoneCodeType", 1);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final List<String> f25308OooOoo = StringsKt__StringsKt.split$default(o00Oo0.OooO00o().OooO0o0("phoneWaCodeCountry", ""), new String[]{","}, false, 0, 6, (Object) null);

    public static final class OooO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25315OooO0Oo;

        public OooO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25315OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25315OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25315OooO0Oo;
        }

        public final int hashCode() {
            return this.f25315OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25315OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO00o {
        public static void OooO00o(Context context, String str, String str2, ClientCodeType clientCodeType, int i, DeleteAccountParamsModel deleteAccountParamsModel, int i2, String str3, boolean z, int i3) {
            int i4 = SmsCodeActivity.f25298Oooo0;
            if ((i3 & 16) != 0) {
                i = -1;
            }
            if ((i3 & 32) != 0) {
                deleteAccountParamsModel = null;
            }
            if ((i3 & 64) != 0) {
                i2 = 0;
            }
            if ((i3 & 128) != 0) {
                str3 = null;
            }
            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                z = false;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) SmsCodeActivity.class);
            intent.putExtra("PHONE_NUMBER", str);
            intent.putExtra("COUNTRY_AREA_CODE", str2);
            intent.putExtra("TYPE_ACCOUNT", clientCodeType);
            intent.putExtra("TYPE_UNBIND", i);
            intent.putExtra("DELETE_REASON_TYPE", deleteAccountParamsModel);
            intent.putExtra("ISO_CODE", str3);
            intent.putExtra("IS_AUTO_REGISTER", z);
            intent.putExtra("IS_ACTIVATE", i2);
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
                iArr[ClientCodeType.ChangeOld.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClientCodeType.BingingPhone.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClientCodeType.UnbindThird.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClientCodeType.Retrieve.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClientCodeType.Change.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ClientCodeType.DeleteAccount.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ClientCodeType.LoginVerification.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ClientCodeType.TurnOnProtection.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ClientCodeType.TunOnProtectionBingingPhone.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
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
            return new OpenAuthManager(SmsCodeActivity.this);
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Boolean, String, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f25318OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Function1<? super String, Unit> function1) {
            super(2);
            this.f25318OooO0o0 = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Boolean bool, String str) {
            boolean zBooleanValue = bool.booleanValue();
            String code = str;
            Intrinsics.checkNotNullParameter(code, "code");
            Function1<String, Unit> function1 = this.f25318OooO0o0;
            if (zBooleanValue) {
                SmsCodeActivity smsCodeActivity = SmsCodeActivity.this;
                smsCodeActivity.getClass();
                smsCodeActivity.f25314Oooo00o = o00Ooo.OooO00o(smsCodeActivity, code, new com.yalla.yalla.ui.activity.account.OooOO0O(smsCodeActivity), new com.yalla.yalla.ui.activity.account.OooOOO0(smsCodeActivity), null, new com.yalla.yalla.ui.activity.account.OooOOO(smsCodeActivity, function1));
            } else {
                function1.invoke(null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0000OO0<SmsCodeModel> f25320OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f25321OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i, o0000OO0<SmsCodeModel> o0000oo1) {
            super(1);
            this.f25321OooO0o0 = i;
            this.f25320OooO0o = o0000oo1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            int i = SmsCodeActivity.f25298Oooo0;
            SmsCodeActivity smsCodeActivity = SmsCodeActivity.this;
            smsCodeActivity.OooOooo().sendPhoneCode(smsCodeActivity.f25300OooOo, smsCodeActivity.f25306OooOoO0, smsCodeActivity.OooOoo0(), -1, this.f25321OooO0o0, str2, smsCodeActivity.f25312Oooo000).observe(smsCodeActivity, this.f25320OooO0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0000OO0<SmsCodeModel> f25323OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f25324OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(int i, o0000OO0<SmsCodeModel> o0000oo1) {
            super(1);
            this.f25324OooO0o0 = i;
            this.f25323OooO0o = o0000oo1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            int i = SmsCodeActivity.f25298Oooo0;
            SmsCodeActivity smsCodeActivity = SmsCodeActivity.this;
            SmsCodeVM.sendPhoneCode$default(smsCodeActivity.OooOooo(), "", "", smsCodeActivity.OooOoo0(), smsCodeActivity.f25304OooOo0o, this.f25324OooO0o0, str2, null, 64, null).observe(smsCodeActivity, this.f25323OooO0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<SmsCodeModel, Unit> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SmsCodeModel smsCodeModel) {
            StringBuilder sb;
            SmsCodeModel smsCodeModel2 = smsCodeModel;
            int i = SmsCodeActivity.f25298Oooo0;
            SmsCodeActivity smsCodeActivity = SmsCodeActivity.this;
            smsCodeActivity.OooOooO().f57869OooO.setTextColor(o0000.OooO00o(oO00O0o.color_alpha_38));
            oOOO000o oooo000o = oOOO00.f56668OooO00o;
            if (oooo000o != null) {
                oooo000o.cancel();
                oOOO00.f56669OooO0O0 = null;
                oOOO00.f56668OooO00o = null;
            }
            oOOO000o oooo000o2 = new oOOO000o();
            oOOO00.f56668OooO00o = oooo000o2;
            oooo000o2.start();
            oOOO00.f56669OooO0O0 = smsCodeActivity.f25300OooOo;
            if (smsCodeModel2 != null) {
                int iOooO0o = o0OoOo0.OooO0o(-1, smsCodeModel2.getInterval());
                String msgrandom = smsCodeModel2.getMsgrandom();
                Ref.IntRef intRef = new Ref.IntRef();
                if (iOooO0o == -1) {
                    smsCodeActivity.OooOo0();
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.verification_code_send_successed);
                    String[] strArr = new String[1];
                    boolean zOooO0o0 = p591o0oo000O.OooO.OooO0o0();
                    String str = smsCodeActivity.f25300OooOo;
                    if (zOooO0o0) {
                        sb = o000Oo0.OooO0O0(str, "+");
                    } else {
                        sb = new StringBuilder("+");
                        sb.append(str);
                    }
                    strArr[0] = sb.toString();
                    String strOooO00o = o0000O.OooO00o(strOooO0OO, strArr);
                    if (!StringsKt.isBlank(strOooO00o)) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO00o, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                } else {
                    smsCodeActivity.OooOooo().checkVerCodeSendType(iOooO0o, msgrandom, smsCodeActivity.OooOoo0()).observe(smsCodeActivity, new o0000OO0(new o0O000O(intRef, smsCodeActivity), null, new o0OoOoOo(smsCodeActivity), false, 10));
                }
                if (intRef.element != 2 && smsCodeActivity.f25310OooOooO == 2) {
                    o0OO00O o0oo00o2 = new o0OO00O(smsCodeActivity);
                    o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.account_send_whats_app_failed));
                    o0oo00o2.OooOO0o();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0000OO0<SmsCodeModel> f25327OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f25328OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(int i, o0000OO0<SmsCodeModel> o0000oo1) {
            super(1);
            this.f25328OooO0o0 = i;
            this.f25327OooO0o = o0000oo1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            int i = SmsCodeActivity.f25298Oooo0;
            SmsCodeActivity smsCodeActivity = SmsCodeActivity.this;
            smsCodeActivity.OooOooo().sendPhoneCode(smsCodeActivity.f25300OooOo, smsCodeActivity.f25306OooOoO0, smsCodeActivity.OooOoo0(), smsCodeActivity.f25304OooOo0o, this.f25328OooO0o0, str2, smsCodeActivity.f25312Oooo000).observe(smsCodeActivity, this.f25327OooO0o);
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
            SmsCodeActivity.this.OooOo0();
            return Unit.INSTANCE;
        }
    }

    static {
        new OooO00o();
    }

    public static final void OooOo(SmsCodeActivity smsCodeActivity) {
        ClientCodeType clientCodeType = smsCodeActivity.f25303OooOo0O;
        if ((clientCodeType == null ? -1 : OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()]) != 1) {
            o00O000o.f44496OooO0oO.observe(smsCodeActivity, new o0O0O0o0(smsCodeActivity));
            return;
        }
        o0OO000.OooO00o("101057");
        smsCodeActivity.Oooo00O(false);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(smsCodeActivity), null, null, new o0O0O0Oo(smsCodeActivity, null), 3, null);
    }

    public static final void OooOoO(SmsCodeActivity smsCodeActivity, ApiError apiError) {
        smsCodeActivity.getClass();
        int code = apiError.getCode();
        if (code != 1022 && code != 1023) {
            smsCodeActivity.OooOooO().f57888OooOo0.OooO0Oo();
            return;
        }
        VerifyCodeView verifyCodeView = smsCodeActivity.OooOooO().f57888OooOo0;
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
        VerifyCodeView verifyCodeView2 = smsCodeActivity.OooOooO().f57888OooOo0;
        verifyCodeView2.getClass();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 20.0f, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new CycleInterpolator(2.0f));
        translateAnimation.setDuration(500L);
        if (verifyCodeView2.f30826OooOOO0 != 0) {
            for (int i = 0; i < verifyCodeView2.getChildCount(); i++) {
                verifyCodeView2.getChildAt(i).setBackgroundResource(verifyCodeView2.f30826OooOOO0);
            }
        }
        translateAnimation.setAnimationListener(new q3(verifyCodeView2));
        verifyCodeView2.startAnimation(translateAnimation);
    }

    public static final void OooOoO0(final SmsCodeActivity smsCodeActivity) {
        Snackbar snackbarOooO0oo = Snackbar.OooO0oo(smsCodeActivity.OooOooO().f57875OooO0o0, oO00OOo0.login_feedback_tips);
        snackbarOooO0oo.OooO(oO00OOo0.feedback, new View.OnClickListener() { // from class: o0o00.o0O000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SmsCodeActivity.f25298Oooo0;
                SmsCodeActivity this$0 = this.f47293OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0OO000.OooO00o("101060");
                o00O000o.f44496OooO0oO.observe(this$0, new o0O0OOO0(this$0));
            }
        });
        snackbarOooO0oo.f17799OooOO0O = 5000;
        snackbarOooO0oo.OooOO0();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity
    public final boolean OooOOOo() {
        return false;
    }

    public final void OooOoOO(Function1<? super String, Unit> function1) {
        GTCaptcha4Client gTCaptcha4Client = this.f25314Oooo00o;
        if (gTCaptcha4Client != null) {
            gTCaptcha4Client.destroy();
        }
        this.f25314Oooo00o = null;
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        OooOooo().getGeetCode(this.f25300OooOo, OooOoo0(), new OooO0o(function1));
    }

    public final OpenAuthManager OooOoo() {
        return (OpenAuthManager) this.f25301OooOo0.getValue();
    }

    public final int OooOoo0() {
        ClientCodeType clientCodeType = this.f25303OooOo0O;
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

    public final f0 OooOooO() {
        return (f0) this.f25299OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SmsCodeVM OooOooo() {
        return (SmsCodeVM) this.f25302OooOo00.getValue();
    }

    public final void Oooo000(boolean z) {
        o0000OO0 o0000oo1 = new o0000OO0(new OooOOO(), null, new OooOOOO(), false, 10);
        ClientCodeType clientCodeType = this.f25303OooOo0O;
        int i = clientCodeType == null ? -1 : OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()];
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                OooOoOO(new OooOOO0(z ? 1 : 0, o0000oo1));
                return;
            } else {
                OooOoOO(new OooOO0O(z ? 1 : 0, o0000oo1));
                return;
            }
        }
        String str = oOOO00.f56669OooO0O0;
        if (str != null && str.length() != 0) {
            z2 = false;
        }
        if (com.code.android.util.OooOo00.OooO00o(Boolean.valueOf(z2)) || !Intrinsics.areEqual(this.f25300OooOo, str)) {
            OooOoOO(new OooOO0(z ? 1 : 0, o0000oo1));
        }
    }

    public final void Oooo00O(boolean z) {
        if (!z) {
            OooOooO().f57888OooOo0.clearFocus();
            VerifyCodeView view = OooOooO().f57888OooOo0;
            Intrinsics.checkNotNullExpressionValue(view, "binding.verificationCodeView");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
            p367o0OOo0o0.OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
            return;
        }
        OooOooO().f57888OooOo0.OooO0Oo();
        View view2 = OooOooO().f57888OooOo0.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(view2, "binding.verificationCodeView.getChildAt(0)");
        Intrinsics.checkNotNullParameter(view2, "view");
        Context context2 = view2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "view.context");
        InputMethodManager inputMethodManagerOooO00o2 = Oooo000.OooO00o(context2);
        view2.setFocusable(true);
        view2.setFocusableInTouchMode(true);
        view2.requestFocus();
        inputMethodManagerOooO00o2.showSoftInput(view2, 2, new KeyBoardUtil$showKeyboard$1(view2.getContext().getApplicationContext(), new Handler()));
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        OooOoo().OooO0oO(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f57870OooO00o);
        String stringExtra = getIntent().getStringExtra("PHONE_NUMBER");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f25300OooOo = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("COUNTRY_AREA_CODE");
        String str = stringExtra2 != null ? stringExtra2 : "";
        this.f25306OooOoO0 = str;
        this.f25305OooOoO = Intrinsics.areEqual(str, "62") || Intrinsics.areEqual(this.f25306OooOoO0, "+62");
        Serializable serializableExtra = getIntent().getSerializableExtra("TYPE_ACCOUNT");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.data.constant.ClientCodeType");
        this.f25303OooOo0O = (ClientCodeType) serializableExtra;
        this.f25304OooOo0o = getIntent().getIntExtra("TYPE_UNBIND", -1);
        if (ClientCodeType.Register == this.f25303OooOo0O) {
            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
            ApiEvent.OooO00o(50);
        }
        OooOooo().setClientType(this.f25303OooOo0O);
        this.f25312Oooo000 = getIntent().getStringExtra("ISO_CODE");
        this.f25313Oooo00O = getIntent().getBooleanExtra("IS_AUTO_REGISTER", false);
        OooOoo().f24730OooO0O0 = new com.yalla.yalla.ui.activity.account.OooOOOO(this);
        OooOoo().f24732OooO0Oo = new o0O00O0o(this);
        OooOoo().f24731OooO0OO = new o0O00O(this);
        OooOooO().f57888OooOo0.clearFocus();
        boolean zContains = this.f25308OooOoo.contains(String.valueOf(getIntent().getStringExtra("COUNTRY_AREA_CODE")));
        this.f25309OooOoo0 = zContains;
        int i = this.f25307OooOoOO;
        if (i != 2 || !zContains) {
            Oooo000(false);
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new o0O00OO(this, null));
        }
        OooOOo0(1);
        if (i == 2 && this.f25309OooOoo0) {
            LinearLayout linearLayout = OooOooO().f57874OooO0o;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llSms");
            o000OO00.OooO0O0(linearLayout);
            TextView textView = OooOooO().f57884OooOOOo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSmsTime");
            o000OO00.OooO0O0(textView);
            TextView textView2 = OooOooO().f57889OooOo00;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvWhatsAppTime");
            o000OO00.OooO0O0(textView2);
            TextView textView3 = OooOooO().f57878OooOO0;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvBottomText");
            o000OO00.OooO0O0(textView3);
            ImageView imageView = OooOooO().f57871OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivOtherLogin");
            o000OO00.OooO0O0(imageView);
            LinearLayout linearLayout2 = OooOooO().f57876OooO0oO;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llSmsOrWhatApp");
            o000OO00.OooOOOO(linearLayout2);
            OooOooO().f57886OooOOo0.setText(o0000.OooO0OO(oO00OOo0.enter_select_code));
        } else {
            LinearLayout linearLayout3 = OooOooO().f57874OooO0o;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.llSms");
            o000OO00.OooOOOO(linearLayout3);
            TextView textView4 = OooOooO().f57879OooOO0O;
            Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvFeedback");
            o000OO00.OooO0O0(textView4);
            TextView textView5 = OooOooO().f57882OooOOO0;
            Intrinsics.checkNotNullExpressionValue(textView5, "binding.tvPhoneError");
            o000OO00.OooO0O0(textView5);
            LinearLayout linearLayout4 = OooOooO().f57876OooO0oO;
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "binding.llSmsOrWhatApp");
            o000OO00.OooO0O0(linearLayout4);
        }
        ClientCodeType clientCodeType = this.f25303OooOo0O;
        switch (clientCodeType != null ? OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()] : -1) {
            case 1:
                OooOo00(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.sign_up_step), FeedbackType.Suggestions));
                TextView textView6 = OooOooO().f57882OooOOO0;
                Intrinsics.checkNotNullExpressionValue(textView6, "binding.tvPhoneError");
                o000OO00.OooOOOO(textView6);
                TextView textView7 = OooOooO().f57880OooOO0o;
                Intrinsics.checkNotNullExpressionValue(textView7, "binding.tvNotReceive");
                o000OO00.OooOOOO(textView7);
                TextView textView8 = OooOooO().f57879OooOO0O;
                Intrinsics.checkNotNullExpressionValue(textView8, "binding.tvFeedback");
                o000OO00.OooOOOO(textView8);
                TextView textView9 = OooOooO().f57878OooOO0;
                Intrinsics.checkNotNullExpressionValue(textView9, "binding.tvBottomText");
                o000OO00.OooOOOO(textView9);
                ImageView imageView2 = OooOooO().f57871OooO0O0;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivOtherLogin");
                o000OO00.OooOOOO(imageView2);
                OooOooO().f57879OooOO0O.setText(oO00OOo0.Try_another_log_in);
                OooOooO().f57878OooOO0.setText(o0000.OooO0OO(oO00OOo0.try_another_login));
                TextView textView10 = OooOooO().f57882OooOOO0;
                Intrinsics.checkNotNullExpressionValue(textView10, "binding.tvPhoneError");
                textView10.setVisibility(true ^ this.f25313Oooo00O ? 0 : 8);
                break;
            case 2:
                OooOOoo(oO00OOo0.title_Phone_enterCode);
                break;
            case 3:
                OooOOoo(oO00OOo0.title_Phone_enterCode);
                break;
            case 4:
                OooOOoo(oO00OOo0.title_Phone_enterCode);
                break;
            case 5:
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str2 = String.format("%s (1/2)", Arrays.copyOf(new Object[]{o0000.OooO0OO(oO00OOo0.title_Forgot_Password)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                OooOo00(str2);
                TextView textView11 = OooOooO().f57879OooOO0O;
                Intrinsics.checkNotNullExpressionValue(textView11, "binding.tvFeedback");
                o000OO00.OooOOOO(textView11);
                ImageView imageView3 = OooOooO().f57871OooO0O0;
                Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivOtherLogin");
                o000OO00.OooO0O0(imageView3);
                TextView textView12 = OooOooO().f57878OooOO0;
                Intrinsics.checkNotNullExpressionValue(textView12, "binding.tvBottomText");
                o000OO00.OooOOOO(textView12);
                TextView textView13 = OooOooO().f57879OooOO0O;
                int i2 = oO00OOo0.Have_Problem;
                textView13.setText(i2);
                OooOooO().f57878OooOO0.setText(o0000.OooO0OO(i2));
                break;
            case 6:
                OooOOoo(oO00OOo0.title_Phone_enterCode);
                break;
            case 7:
                OooOOoo(oO00OOo0.delete_account);
                TextView textView14 = OooOooO().f57885OooOOo;
                Intrinsics.checkNotNullExpressionValue(textView14, "binding.tvVerification");
                o000OO00.OooOOOO(textView14);
                if (!this.f25309OooOoo0 || i != 2) {
                    OooOooO().f57886OooOOo0.setText(o0000.OooO0OO(oO00OOo0.account_delete_account_code_title));
                }
                OooOooO().f57885OooOOo.setText(o0000.OooO0OO(oO00OOo0.verification_title));
                break;
            case 8:
                OooOOoo(oO00OOo0.account_login_verification);
                LinearLayout linearLayout5 = OooOooO().f57877OooO0oo;
                Intrinsics.checkNotNullExpressionValue(linearLayout5, "binding.llTurnLoginProtection");
                o000OO00.OooOOOO(linearLayout5);
                break;
            default:
                OooOOoo(oO00OOo0.title_Phone_enterCode);
                break;
        }
        String strOooO00o = this.f25300OooOo;
        if (com.code.android.util.OooOo00.OooO0O0(this.f25306OooOoO0) && StringsKt.Oooo00o(this.f25300OooOo, this.f25306OooOoO0)) {
            String str3 = this.f25306OooOoO0;
            String strSubstring = this.f25300OooOo.substring(str3.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            strOooO00o = p031OoooO0.o0OoOo0.OooO00o(str3, ZegoConstants.ZegoVideoDataAuxPublishingStream, strSubstring);
        }
        OooOooO().f57881OooOOO.setText("+" + strOooO00o);
        OooOooO().f57888OooOo0.setBackgroundErrorResource(oOo00OO0.shape_bg_ver_code_error);
        OooOooO().f57888OooOo0.setOnCompleteListener(new o0O0000O(this));
        TextView textView15 = OooOooO().f57883OooOOOO;
        Intrinsics.checkNotNullExpressionValue(textView15, "binding.tvSms");
        o000OO00.OooO0oo(textView15, new o0O00OOO(this));
        TextView textView16 = OooOooO().f57887OooOOoo;
        Intrinsics.checkNotNullExpressionValue(textView16, "binding.tvWhatsApp");
        o000OO00.OooO0oo(textView16, new o0oO0Ooo(this));
        TextView textView17 = OooOooO().f57878OooOO0;
        Intrinsics.checkNotNullExpressionValue(textView17, "binding.tvBottomText");
        o000OO00.OooO0oo(textView17, new o0O00o00(this));
        TextView textView18 = OooOooO().f57882OooOOO0;
        Intrinsics.checkNotNullExpressionValue(textView18, "binding.tvPhoneError");
        o000OO00.OooO0oo(textView18, new o0O00oO0(this));
        TextView textView19 = OooOooO().f57879OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView19, "binding.tvFeedback");
        o000OO00.OooO0oo(textView19, new o0O0O0O(this));
        TextView textView20 = OooOooO().f57869OooO;
        Intrinsics.checkNotNullExpressionValue(textView20, "binding.tvAgain");
        o000OO00.OooO0oo(textView20, new o0oO0O0o(this));
        oOOO00.f56670OooO0OO = new o0O0oo0o(this);
        if (this.f25305OooOoO) {
            OooOooO().f57872OooO0OO.setBackgroundResource(oOo00OO0.account_whats_app);
            OooOooO().f57873OooO0Oo.setBackgroundResource(oOo00OO0.account_sms);
            OooOooO().f57883OooOOOO.setText(oO00OOo0.account_send_whats_app);
            OooOooO().f57887OooOOoo.setText(oO00OOo0.account_send_sms);
        } else {
            OooOooO().f57872OooO0OO.setBackgroundResource(oOo00OO0.account_sms);
            OooOooO().f57873OooO0Oo.setBackgroundResource(oOo00OO0.account_whats_app);
            OooOooO().f57883OooOOOO.setText(oO00OOo0.account_send_sms);
            OooOooO().f57887OooOOoo.setText(oO00OOo0.account_send_whats_app);
        }
        LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new o0O000Oo(this));
        LiveEventBus.get("LOGIN_RESULT").observe(this, new o0O000o0(this));
        ((MutableLiveData) p382o0OOoo0o.o0OoOo0.f44301OooO0O0.getValue()).observe(this, new OooO(new o0O00(this)));
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        GTCaptcha4Client gTCaptcha4Client = this.f25314Oooo00o;
        if (gTCaptcha4Client != null) {
            gTCaptcha4Client.destroy();
        }
        this.f25314Oooo00o = null;
        oOOO00.f56670OooO0OO = null;
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        Oooo00O(false);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (OooOooO().f57888OooOo0.getCurrentAmount() == OooOooO().f57888OooOo0.getChildCount()) {
            OooOooO().f57888OooOo0.OooO0Oo();
        }
    }
}
