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
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0OoOo0;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.geetest.captcha.GTCaptcha4Client;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.api.old.ApiEvent;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.model.DeleteAccountParamsModel;
import com.yalla.yalla.model.SmsCodeModel;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.view.VerifyCodeView;
import com.yalla.yalla.ui.vm.account.SmsCodeVM;
import com.yalla.yalla.util.WebPageInfo;
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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o0oo0000.OooO00o;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOo0.o000O0o;
import p205o00o0o0o.o000O;
import p384o0OOoo0O.o000oOoO;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p386o0OOooO.oo0o0Oo;
import p405o0Oo0OOO.o00O00OO;
import p415o0Oo0oO0.o00Ooo;
import p429o0OoOO.o00Oo0;
import p491o0o00O0o.o0O;
import p491o0o00O0o.o0O00o00;
import p491o0o00O0o.o0O0O0O;
import p491o0o00O0o.o0O0O0o0;
import p491o0o00O0o.o0O0OO0;
import p491o0o00O0o.o0O0OOO0;
import p491o0o00O0o.o0O0o0;
import p491o0o00O0o.o0O0o000;
import p491o0o00O0o.o0O0o00O;
import p491o0o00O0o.o0O0oo00;
import p491o0o00O0o.o0OO000;
import p491o0o00O0o.o0OO000o;
import p491o0o00O0o.o0oOo0O0;
import p491o0o00O0o.oo0OOoo;
import p491o0o00O0o.oo0oO0;
import p491o0o00O0o.oo0ooO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p583o0oOoo00.o00000OO;
import p587o0oOooOO.v2;
import p590o0oOooo0.a0;
import p590o0oOooo0.r0;
import p590o0oOooo0.s0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/SmsCodeActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSmsCodeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmsCodeActivity.kt\ncom/yalla/yalla/ui/activity/account/SmsCodeActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,767:1\n22#2,2:768\n75#3,13:770\n262#4,2:783\n*S KotlinDebug\n*F\n+ 1 SmsCodeActivity.kt\ncom/yalla/yalla/ui/activity/account/SmsCodeActivity\n*L\n65#1:768,2\n67#1:770,13\n313#1:783,2\n*E\n"})
public final class SmsCodeActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final /* synthetic */ int f24843Oooo0 = 0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public ClientCodeType f24848OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f24849OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f24850OooOoO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f24854OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f24855OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f24856OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public String f24857Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f24858Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public GTCaptcha4Client f24859Oooo00o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24844OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o00O00OO.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24847OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SmsCodeVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.SmsCodeActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f24877OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24877OooO0Oo;
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
    public final Lazy f24846OooOo0 = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public String f24845OooOo = "";

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public String f24851OooOoO0 = "";

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f24852OooOoOO = o00Ooo.OooO00o().OooO0OO("phoneCodeType", 1);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final List<String> f24853OooOoo = StringsKt__StringsKt.split$default((CharSequence) o00Ooo.OooO00o().OooO0o0("phoneWaCodeCountry", ""), new String[]{","}, false, 0, 6, (Object) null);

    public static final class OooO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f24860OooO0Oo;

        public OooO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24860OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f24860OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24860OooO0Oo;
        }

        public final int hashCode() {
            return this.f24860OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24860OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO00o {
        public static void OooO00o(Context context, String str, String str2, ClientCodeType clientCodeType, int i, DeleteAccountParamsModel deleteAccountParamsModel, int i2, String str3, boolean z, int i3) {
            int i4 = SmsCodeActivity.f24843Oooo0;
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
        public final /* synthetic */ Function1<String, Unit> f24863OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Function1<? super String, Unit> function1) {
            super(2);
            this.f24863OooO0o0 = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Boolean bool, String str) {
            boolean zBooleanValue = bool.booleanValue();
            String code = str;
            Intrinsics.checkNotNullParameter(code, "code");
            Function1<String, Unit> function1 = this.f24863OooO0o0;
            if (zBooleanValue) {
                SmsCodeActivity smsCodeActivity = SmsCodeActivity.this;
                smsCodeActivity.getClass();
                smsCodeActivity.f24859Oooo00o = o00Oo0.OooO00o(smsCodeActivity, code, new com.yalla.yalla.ui.activity.account.OooOOO0(smsCodeActivity), new com.yalla.yalla.ui.activity.account.OooOOO(smsCodeActivity), null, new com.yalla.yalla.ui.activity.account.OooOOOO(smsCodeActivity, function1));
            } else {
                function1.invoke(null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000oOoO<SmsCodeModel> f24865OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f24866OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i, o000oOoO<SmsCodeModel> o000oooo2) {
            super(1);
            this.f24866OooO0o0 = i;
            this.f24865OooO0o = o000oooo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            int i = SmsCodeActivity.f24843Oooo0;
            SmsCodeActivity smsCodeActivity = SmsCodeActivity.this;
            smsCodeActivity.OooOooo().sendPhoneCode(smsCodeActivity.f24845OooOo, smsCodeActivity.f24851OooOoO0, smsCodeActivity.OooOoo0(), -1, this.f24866OooO0o0, str2, smsCodeActivity.f24857Oooo000).observe(smsCodeActivity, this.f24865OooO0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000oOoO<SmsCodeModel> f24868OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f24869OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(int i, o000oOoO<SmsCodeModel> o000oooo2) {
            super(1);
            this.f24869OooO0o0 = i;
            this.f24868OooO0o = o000oooo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            int i = SmsCodeActivity.f24843Oooo0;
            SmsCodeActivity smsCodeActivity = SmsCodeActivity.this;
            SmsCodeVM.sendPhoneCode$default(smsCodeActivity.OooOooo(), "", "", smsCodeActivity.OooOoo0(), smsCodeActivity.f24849OooOo0o, this.f24869OooO0o0, str2, null, 64, null).observe(smsCodeActivity, this.f24868OooO0o);
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
            int i = SmsCodeActivity.f24843Oooo0;
            SmsCodeActivity smsCodeActivity = SmsCodeActivity.this;
            smsCodeActivity.OooOooO().f44285OooO.setTextColor(o0000.OooO00o(o0OOO0o.color_alpha_38));
            r0 r0Var = s0.f57273OooO00o;
            if (r0Var != null) {
                r0Var.cancel();
                s0.f57274OooO0O0 = null;
                s0.f57273OooO00o = null;
            }
            r0 r0Var2 = new r0();
            s0.f57273OooO00o = r0Var2;
            r0Var2.start();
            s0.f57274OooO0O0 = smsCodeActivity.f24845OooOo;
            if (smsCodeModel2 != null) {
                int iOooO0o = o0OoOo0.OooO0o(-1, smsCodeModel2.getInterval());
                String msgrandom = smsCodeModel2.getMsgrandom();
                Ref.IntRef intRef = new Ref.IntRef();
                if (iOooO0o == -1) {
                    smsCodeActivity.OooOo0();
                    String strOooO0OO = o0000.OooO0OO(o000000.verification_code_send_successed);
                    String[] strArr = new String[1];
                    boolean zOooO0o0 = p595o0oo00O.OooOo00.OooO0o0();
                    String str = smsCodeActivity.f24845OooOo;
                    if (zOooO0o0) {
                        sb = o000O0o.OooO0O0(str, "+");
                    } else {
                        sb = new StringBuilder("+");
                        sb.append(str);
                    }
                    strArr[0] = sb.toString();
                    String strOooO00o = o0000O.OooO00o(strOooO0OO, strArr);
                    if (!StringsKt.isBlank(strOooO00o)) {
                        o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO00o, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                } else {
                    smsCodeActivity.OooOooo().checkVerCodeSendType(iOooO0o, msgrandom, smsCodeActivity.OooOoo0()).observe(smsCodeActivity, new o000oOoO(new o0O0O0o0(intRef, smsCodeActivity), null, new o0O0OO0(smsCodeActivity), false, 10));
                }
                if (intRef.element != 2 && smsCodeActivity.f24855OooOooO == 2) {
                    o000O o000o = new o000O(smsCodeActivity);
                    o000o.OooOo00(o0000.OooO0OO(o000000.account_send_whats_app_failed));
                    o000o.OooOO0o();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000oOoO<SmsCodeModel> f24872OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f24873OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(int i, o000oOoO<SmsCodeModel> o000oooo2) {
            super(1);
            this.f24873OooO0o0 = i;
            this.f24872OooO0o = o000oooo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            int i = SmsCodeActivity.f24843Oooo0;
            SmsCodeActivity smsCodeActivity = SmsCodeActivity.this;
            smsCodeActivity.OooOooo().sendPhoneCode(smsCodeActivity.f24845OooOo, smsCodeActivity.f24851OooOoO0, smsCodeActivity.OooOoo0(), smsCodeActivity.f24849OooOo0o, this.f24873OooO0o0, str2, smsCodeActivity.f24857Oooo000).observe(smsCodeActivity, this.f24872OooO0o);
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

    public static final void OooOo(final SmsCodeActivity smsCodeActivity) {
        ClientCodeType clientCodeType = smsCodeActivity.f24848OooOo0O;
        if ((clientCodeType == null ? -1 : OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()]) != 1) {
            o00000OO.f56665OooO0oO.observe(smsCodeActivity, new Observer() { // from class: o0o00O0o.o0O0O0Oo
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    String url = (String) obj;
                    int i = SmsCodeActivity.f24843Oooo0;
                    SmsCodeActivity context = this.f49020OooO0Oo;
                    Intrinsics.checkNotNullParameter(context, "this$0");
                    if (url == null || StringsKt.isBlank(url)) {
                        return;
                    }
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.VerificationCodeFeedback);
                    Intrinsics.checkNotNull(url);
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f32283OooO0o0 = url;
                    webPageInfo.OooO0Oo(o0000.OooO0OO(o000000.feedback));
                    String strSubstring = context.f24845OooOo.substring(context.f24851OooOoO0.length(), context.f24845OooOo.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    webPageInfo.OooO00o("Tel", strSubstring);
                    webPageInfo.OooO00o("type", FeedbackType.Suggestions);
                    webPageInfo.OooO00o("areaCode", "mAreaCode");
                    webPageInfo.OooO00o("PID", p386o0OOooO.o000000.OooO00o());
                    webPageInfo.OooO00o(RemoteConfigConstants$RequestFieldKey.APP_VERSION, oo0o0Oo.OooO0Oo());
                    webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, p386o0OOooO.o000000.OooO0O0());
                    webPageInfo.OooO00o("sysVersion", p386o0OOooO.o000000.OooO0Oo());
                    webPageInfo.OooO00o("internet", a0.OooO00o().toString());
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intent intent = new Intent(context, (Class<?>) WebActivity.class);
                    intent.putExtra("pageinfo", webPageInfo);
                    context.startActivity(intent);
                }
            });
            return;
        }
        o0oo0000.OooO00o.OooO0O0("101057");
        smsCodeActivity.Oooo00O(false);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(smsCodeActivity), null, null, new oo0ooO(smsCodeActivity, null), 3, null);
    }

    public static final void OooOoO(SmsCodeActivity smsCodeActivity, ApiError apiError) {
        smsCodeActivity.getClass();
        int code = apiError.getCode();
        if (code != 1022 && code != 1023) {
            smsCodeActivity.OooOooO().f44304OooOo0.OooO0Oo();
            return;
        }
        VerifyCodeView verifyCodeView = smsCodeActivity.OooOooO().f44304OooOo0;
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
        VerifyCodeView verifyCodeView2 = smsCodeActivity.OooOooO().f44304OooOo0;
        verifyCodeView2.getClass();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 20.0f, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new CycleInterpolator(2.0f));
        translateAnimation.setDuration(500L);
        if (verifyCodeView2.f30281OooOOO0 != 0) {
            for (int i = 0; i < verifyCodeView2.getChildCount(); i++) {
                verifyCodeView2.getChildAt(i).setBackgroundResource(verifyCodeView2.f30281OooOOO0);
            }
        }
        translateAnimation.setAnimationListener(new v2(verifyCodeView2));
        verifyCodeView2.startAnimation(translateAnimation);
    }

    public static final void OooOoO0(final SmsCodeActivity smsCodeActivity) {
        Snackbar snackbarOooO0oo = Snackbar.OooO0oo(smsCodeActivity.OooOooO().f44291OooO0o0, o000000.login_feedback_tips);
        snackbarOooO0oo.OooO(o000000.feedback, new View.OnClickListener() { // from class: o0o00O0o.o0oO0O0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SmsCodeActivity.f24843Oooo0;
                final SmsCodeActivity this$0 = this.f49063OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO00o.OooO0O0("101060");
                o00000OO.f56665OooO0oO.observe(this$0, new Observer() { // from class: o0o00O0o.o0O0oo0o
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        String url = (String) obj;
                        int i2 = SmsCodeActivity.f24843Oooo0;
                        SmsCodeActivity context = this$0;
                        Intrinsics.checkNotNullParameter(context, "this$0");
                        if (url == null || StringsKt.isBlank(url)) {
                            return;
                        }
                        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.LoginPageFeedback);
                        Intrinsics.checkNotNull(url);
                        Intrinsics.checkNotNullParameter(url, "url");
                        webPageInfo.f32283OooO0o0 = url;
                        webPageInfo.OooO0Oo(o0000.OooO0OO(o000000.feedback));
                        String strSubstring = context.f24845OooOo.substring(context.f24851OooOoO0.length(), context.f24845OooOo.length());
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        webPageInfo.OooO00o("Tel", strSubstring);
                        webPageInfo.OooO00o("type", "1");
                        webPageInfo.OooO00o("areaCode", "mAreaCode");
                        webPageInfo.OooO00o("PID", p386o0OOooO.o000000.OooO00o());
                        webPageInfo.OooO00o(RemoteConfigConstants$RequestFieldKey.APP_VERSION, oo0o0Oo.OooO0Oo());
                        webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, p386o0OOooO.o000000.OooO0O0());
                        webPageInfo.OooO00o("sysVersion", p386o0OOooO.o000000.OooO0Oo());
                        webPageInfo.OooO00o("internet", a0.OooO00o().toString());
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intent intent = new Intent(context, (Class<?>) WebActivity.class);
                        intent.putExtra("pageinfo", webPageInfo);
                        context.startActivity(intent);
                    }
                });
            }
        });
        snackbarOooO0oo.f17322OooOO0O = 5000;
        snackbarOooO0oo.OooOO0();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity
    public final boolean OooOOOo() {
        return false;
    }

    public final void OooOoOO(Function1<? super String, Unit> function1) {
        GTCaptcha4Client gTCaptcha4Client = this.f24859Oooo00o;
        if (gTCaptcha4Client != null) {
            gTCaptcha4Client.destroy();
        }
        this.f24859Oooo00o = null;
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        OooOooo().getGeetCode(this.f24845OooOo, OooOoo0(), new OooO0o(function1));
    }

    public final OpenAuthManager OooOoo() {
        return (OpenAuthManager) this.f24846OooOo0.getValue();
    }

    public final int OooOoo0() {
        ClientCodeType clientCodeType = this.f24848OooOo0O;
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

    public final o00O00OO OooOooO() {
        return (o00O00OO) this.f24844OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SmsCodeVM OooOooo() {
        return (SmsCodeVM) this.f24847OooOo00.getValue();
    }

    public final void Oooo000(boolean z) {
        o000oOoO o000oooo2 = new o000oOoO(new OooOOO(), null, new OooOOOO(), false, 10);
        ClientCodeType clientCodeType = this.f24848OooOo0O;
        int i = clientCodeType == null ? -1 : OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()];
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                OooOoOO(new OooOOO0(z ? 1 : 0, o000oooo2));
                return;
            } else {
                OooOoOO(new OooOO0O(z ? 1 : 0, o000oooo2));
                return;
            }
        }
        String str = s0.f57274OooO0O0;
        if (str != null && str.length() != 0) {
            z2 = false;
        }
        if (com.code.android.util.OooOo00.OooO00o(Boolean.valueOf(z2)) || !Intrinsics.areEqual(this.f24845OooOo, str)) {
            OooOoOO(new OooOO0(z ? 1 : 0, o000oooo2));
        }
    }

    public final void Oooo00O(boolean z) {
        if (!z) {
            OooOooO().f44304OooOo0.clearFocus();
            VerifyCodeView view = OooOooO().f44304OooOo0;
            Intrinsics.checkNotNullExpressionValue(view, "verificationCodeView");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InputMethodManager inputMethodManagerOooO00o = p371o0OOo0oO.o0OOO0o.OooO00o(context);
            kotlin.collections.OooO00o.OooO0O0(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
            return;
        }
        OooOooO().f44304OooOo0.OooO0Oo();
        View view2 = OooOooO().f44304OooOo0.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(view2, "getChildAt(...)");
        Intrinsics.checkNotNullParameter(view2, "view");
        Context context2 = view2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o2 = p371o0OOo0oO.o0OOO0o.OooO00o(context2);
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
        setContentView(OooOooO().f44286OooO00o);
        String stringExtra = getIntent().getStringExtra("PHONE_NUMBER");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f24845OooOo = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("COUNTRY_AREA_CODE");
        String str = stringExtra2 != null ? stringExtra2 : "";
        this.f24851OooOoO0 = str;
        int i = 0;
        this.f24850OooOoO = Intrinsics.areEqual(str, "62") || Intrinsics.areEqual(this.f24851OooOoO0, "+62");
        Serializable serializableExtra = getIntent().getSerializableExtra("TYPE_ACCOUNT");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.data.constant.ClientCodeType");
        this.f24848OooOo0O = (ClientCodeType) serializableExtra;
        this.f24849OooOo0o = getIntent().getIntExtra("TYPE_UNBIND", -1);
        if (ClientCodeType.Register == this.f24848OooOo0O) {
            o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
            ApiEvent.OooO00o(50);
        }
        OooOooo().setClientType(this.f24848OooOo0O);
        this.f24857Oooo000 = getIntent().getStringExtra("ISO_CODE");
        this.f24858Oooo00O = getIntent().getBooleanExtra("IS_AUTO_REGISTER", false);
        OooOoo().f24267OooO0O0 = new OooOo00(this);
        OooOoo().f24269OooO0Oo = new oo0OOoo(this);
        OooOoo().f24268OooO0OO = new o0O0o000(this);
        OooOooO().f44304OooOo0.clearFocus();
        boolean zContains = this.f24853OooOoo.contains(String.valueOf(getIntent().getStringExtra("COUNTRY_AREA_CODE")));
        this.f24854OooOoo0 = zContains;
        int i2 = this.f24852OooOoOO;
        if (i2 != 2 || !zContains) {
            Oooo000(false);
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new o0O0o00O(this, null));
        }
        OooOOo0(1);
        if (i2 == 2 && this.f24854OooOoo0) {
            LinearLayout llSms = OooOooO().f44290OooO0o;
            Intrinsics.checkNotNullExpressionValue(llSms, "llSms");
            com.code.android.util.o000O.OooO0O0(llSms);
            TextView tvSmsTime = OooOooO().f44300OooOOOo;
            Intrinsics.checkNotNullExpressionValue(tvSmsTime, "tvSmsTime");
            com.code.android.util.o000O.OooO0O0(tvSmsTime);
            TextView tvWhatsAppTime = OooOooO().f44305OooOo00;
            Intrinsics.checkNotNullExpressionValue(tvWhatsAppTime, "tvWhatsAppTime");
            com.code.android.util.o000O.OooO0O0(tvWhatsAppTime);
            TextView tvBottomText = OooOooO().f44294OooOO0;
            Intrinsics.checkNotNullExpressionValue(tvBottomText, "tvBottomText");
            com.code.android.util.o000O.OooO0O0(tvBottomText);
            ImageView ivOtherLogin = OooOooO().f44287OooO0O0;
            Intrinsics.checkNotNullExpressionValue(ivOtherLogin, "ivOtherLogin");
            com.code.android.util.o000O.OooO0O0(ivOtherLogin);
            LinearLayout llSmsOrWhatApp = OooOooO().f44292OooO0oO;
            Intrinsics.checkNotNullExpressionValue(llSmsOrWhatApp, "llSmsOrWhatApp");
            com.code.android.util.o000O.OooOOOO(llSmsOrWhatApp);
            OooOooO().f44302OooOOo0.setText(o0000.OooO0OO(o000000.enter_select_code));
        } else {
            LinearLayout llSms2 = OooOooO().f44290OooO0o;
            Intrinsics.checkNotNullExpressionValue(llSms2, "llSms");
            com.code.android.util.o000O.OooOOOO(llSms2);
            TextView tvFeedback = OooOooO().f44295OooOO0O;
            Intrinsics.checkNotNullExpressionValue(tvFeedback, "tvFeedback");
            com.code.android.util.o000O.OooO0O0(tvFeedback);
            TextView tvPhoneError = OooOooO().f44298OooOOO0;
            Intrinsics.checkNotNullExpressionValue(tvPhoneError, "tvPhoneError");
            com.code.android.util.o000O.OooO0O0(tvPhoneError);
            LinearLayout llSmsOrWhatApp2 = OooOooO().f44292OooO0oO;
            Intrinsics.checkNotNullExpressionValue(llSmsOrWhatApp2, "llSmsOrWhatApp");
            com.code.android.util.o000O.OooO0O0(llSmsOrWhatApp2);
        }
        ClientCodeType clientCodeType = this.f24848OooOo0O;
        switch (clientCodeType != null ? OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()] : -1) {
            case 1:
                OooOo00(o0000O.OooO00o(o0000.OooO0OO(o000000.sign_up_step), FeedbackType.Suggestions));
                TextView tvPhoneError2 = OooOooO().f44298OooOOO0;
                Intrinsics.checkNotNullExpressionValue(tvPhoneError2, "tvPhoneError");
                com.code.android.util.o000O.OooOOOO(tvPhoneError2);
                TextView tvNotReceive = OooOooO().f44296OooOO0o;
                Intrinsics.checkNotNullExpressionValue(tvNotReceive, "tvNotReceive");
                com.code.android.util.o000O.OooOOOO(tvNotReceive);
                TextView tvFeedback2 = OooOooO().f44295OooOO0O;
                Intrinsics.checkNotNullExpressionValue(tvFeedback2, "tvFeedback");
                com.code.android.util.o000O.OooOOOO(tvFeedback2);
                TextView tvBottomText2 = OooOooO().f44294OooOO0;
                Intrinsics.checkNotNullExpressionValue(tvBottomText2, "tvBottomText");
                com.code.android.util.o000O.OooOOOO(tvBottomText2);
                ImageView ivOtherLogin2 = OooOooO().f44287OooO0O0;
                Intrinsics.checkNotNullExpressionValue(ivOtherLogin2, "ivOtherLogin");
                com.code.android.util.o000O.OooOOOO(ivOtherLogin2);
                OooOooO().f44295OooOO0O.setText(o000000.Try_another_log_in);
                OooOooO().f44294OooOO0.setText(o0000.OooO0OO(o000000.try_another_login));
                TextView tvPhoneError3 = OooOooO().f44298OooOOO0;
                Intrinsics.checkNotNullExpressionValue(tvPhoneError3, "tvPhoneError");
                tvPhoneError3.setVisibility(true ^ this.f24858Oooo00O ? 0 : 8);
                break;
            case 2:
                OooOOoo(o000000.title_Phone_enterCode);
                break;
            case 3:
                OooOOoo(o000000.title_Phone_enterCode);
                break;
            case 4:
                OooOOoo(o000000.title_Phone_enterCode);
                break;
            case 5:
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str2 = String.format("%s (1/2)", Arrays.copyOf(new Object[]{o0000.OooO0OO(o000000.title_Forgot_Password)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                OooOo00(str2);
                TextView tvFeedback3 = OooOooO().f44295OooOO0O;
                Intrinsics.checkNotNullExpressionValue(tvFeedback3, "tvFeedback");
                com.code.android.util.o000O.OooOOOO(tvFeedback3);
                ImageView ivOtherLogin3 = OooOooO().f44287OooO0O0;
                Intrinsics.checkNotNullExpressionValue(ivOtherLogin3, "ivOtherLogin");
                com.code.android.util.o000O.OooO0O0(ivOtherLogin3);
                TextView tvBottomText3 = OooOooO().f44294OooOO0;
                Intrinsics.checkNotNullExpressionValue(tvBottomText3, "tvBottomText");
                com.code.android.util.o000O.OooOOOO(tvBottomText3);
                TextView textView = OooOooO().f44295OooOO0O;
                int i3 = o000000.Have_Problem;
                textView.setText(i3);
                OooOooO().f44294OooOO0.setText(o0000.OooO0OO(i3));
                break;
            case 6:
                OooOOoo(o000000.title_Phone_enterCode);
                break;
            case 7:
                OooOOoo(o000000.delete_account);
                TextView tvVerification = OooOooO().f44301OooOOo;
                Intrinsics.checkNotNullExpressionValue(tvVerification, "tvVerification");
                com.code.android.util.o000O.OooOOOO(tvVerification);
                if (!this.f24854OooOoo0 || i2 != 2) {
                    OooOooO().f44302OooOOo0.setText(o0000.OooO0OO(o000000.account_delete_account_code_title));
                }
                OooOooO().f44301OooOOo.setText(o0000.OooO0OO(o000000.verification_title));
                break;
            case 8:
                OooOOoo(o000000.account_login_verification);
                LinearLayout llTurnLoginProtection = OooOooO().f44293OooO0oo;
                Intrinsics.checkNotNullExpressionValue(llTurnLoginProtection, "llTurnLoginProtection");
                com.code.android.util.o000O.OooOOOO(llTurnLoginProtection);
                break;
            default:
                OooOOoo(o000000.title_Phone_enterCode);
                break;
        }
        String strOooO0O0 = this.f24845OooOo;
        if (com.code.android.util.OooOo00.OooO0O0(this.f24851OooOoO0) && StringsKt__StringsJVMKt.startsWith$default(this.f24845OooOo, this.f24851OooOoO0, false, 2, null)) {
            String str3 = this.f24851OooOoO0;
            String strSubstring = this.f24845OooOo.substring(str3.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            strOooO0O0 = p031OoooO0.o0OoOo0.OooO0O0(str3, ZegoConstants.ZegoVideoDataAuxPublishingStream, strSubstring);
        }
        OooOooO().f44297OooOOO.setText("+" + strOooO0O0);
        OooOooO().f44304OooOo0.setBackgroundErrorResource(o0Oo0oo.shape_bg_ver_code_error);
        OooOooO().f44304OooOo0.setOnCompleteListener(new o0O00o00(this));
        TextView tvSms = OooOooO().f44299OooOOOO;
        Intrinsics.checkNotNullExpressionValue(tvSms, "tvSms");
        com.code.android.util.o000O.OooO0oo(tvSms, new o0O0o0(this));
        TextView tvWhatsApp = OooOooO().f44303OooOOoo;
        Intrinsics.checkNotNullExpressionValue(tvWhatsApp, "tvWhatsApp");
        com.code.android.util.o000O.OooO0oo(tvWhatsApp, new o0oOo0O0(this));
        TextView tvBottomText4 = OooOooO().f44294OooOO0;
        Intrinsics.checkNotNullExpressionValue(tvBottomText4, "tvBottomText");
        com.code.android.util.o000O.OooO0oo(tvBottomText4, new o0O0oo00(this));
        TextView tvPhoneError4 = OooOooO().f44298OooOOO0;
        Intrinsics.checkNotNullExpressionValue(tvPhoneError4, "tvPhoneError");
        com.code.android.util.o000O.OooO0oo(tvPhoneError4, new o0O(this));
        TextView tvFeedback4 = OooOooO().f44295OooOO0O;
        Intrinsics.checkNotNullExpressionValue(tvFeedback4, "tvFeedback");
        com.code.android.util.o000O.OooO0oo(tvFeedback4, new o0OO000(this));
        TextView tvAgain = OooOooO().f44285OooO;
        Intrinsics.checkNotNullExpressionValue(tvAgain, "tvAgain");
        com.code.android.util.o000O.OooO0oo(tvAgain, new o0OO000o(this));
        s0.f57275OooO0OO = new oo0oO0(this);
        if (this.f24850OooOoO) {
            OooOooO().f44288OooO0OO.setBackgroundResource(o0Oo0oo.account_whats_app);
            OooOooO().f44289OooO0Oo.setBackgroundResource(o0Oo0oo.account_sms);
            OooOooO().f44299OooOOOO.setText(o000000.account_send_whats_app);
            OooOooO().f44303OooOOoo.setText(o000000.account_send_sms);
        } else {
            OooOooO().f44288OooO0OO.setBackgroundResource(o0Oo0oo.account_sms);
            OooOooO().f44289OooO0Oo.setBackgroundResource(o0Oo0oo.account_whats_app);
            OooOooO().f44299OooOOOO.setText(o000000.account_send_sms);
            OooOooO().f44303OooOOoo.setText(o000000.account_send_whats_app);
        }
        LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new Observer() { // from class: o0o00O0o.o0O00oO0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i4 = SmsCodeActivity.f24843Oooo0;
                SmsCodeActivity this$0 = this.f49016OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
            }
        });
        LiveEventBus.get("LOGIN_RESULT").observe(this, new o0O0O0O(this, i));
        ((MutableLiveData) p386o0OOooO.o0OOO0o.f43500OooO0O0.getValue()).observe(this, new OooO(new o0O0OOO0(this)));
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        GTCaptcha4Client gTCaptcha4Client = this.f24859Oooo00o;
        if (gTCaptcha4Client != null) {
            gTCaptcha4Client.destroy();
        }
        this.f24859Oooo00o = null;
        s0.f57275OooO0OO = null;
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        Oooo00O(false);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (OooOooO().f44304OooOo0.getCurrentAmount() == OooOooO().f44304OooOo0.getChildCount()) {
            OooOooO().f44304OooOo0.OooO0Oo();
        }
    }
}
