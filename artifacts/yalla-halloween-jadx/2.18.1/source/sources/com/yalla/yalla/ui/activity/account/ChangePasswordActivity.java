package com.yalla.yalla.ui.activity.account;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.billingclient.api.o0000;
import com.app.base.model.LoginInformation;
import com.app.base.model.LoginInformation2;
import com.app.base.view.HeaderLayout;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.ak;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.account.AccountVM;
import io.agora.rtc.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.o0O0ooO;
import p498o0o00Oo0.OooOOO;
import p534o0o0OOo0.o00OOO0;
import p534o0o0OOo0.o00OOO00;
import p649o0ooOOoo.x6;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/ChangePasswordActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", ak.aE, "", "onClick", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ChangePasswordActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f21724OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f21725Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final o00O000o f21726Ooooo0o = new o00O000o(Reflection.getOrCreateKotlinClass(x6.class), this, null);

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21727OooooO0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.ChangePasswordActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.ChangePasswordActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.ChangePasswordActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f21732Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21732Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO00o extends Lambda implements Function1<LoginInformation2, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LoginInformation2 loginInformation2) {
            String token;
            String tokenActivity;
            String tokenChat;
            String tokenRoom;
            LoginInformation2 loginInformation3 = loginInformation2;
            if (loginInformation3 != null) {
                ChangePasswordActivity changePasswordActivity = ChangePasswordActivity.this;
                OooOOO oooOOO = OooOOO.f41216OooO00o;
                LoginInformation.LoginToken loginToken = loginInformation3.token;
                MutableLiveData<String> mutableLiveDataOooOo00 = oooOOO.OooOo00();
                String str = "";
                if (loginToken == null || (token = loginToken.getToken()) == null) {
                    token = "";
                }
                mutableLiveDataOooOo00.setValue(token);
                MutableLiveData<String> mutableLiveDataOooOo0 = oooOOO.OooOo0();
                if (loginToken == null || (tokenActivity = loginToken.getTokenActivity()) == null) {
                    tokenActivity = "";
                }
                mutableLiveDataOooOo0.setValue(tokenActivity);
                MutableLiveData<String> mutableLiveDataOooOo0O = oooOOO.OooOo0O();
                if (loginToken == null || (tokenChat = loginToken.getTokenChat()) == null) {
                    tokenChat = "";
                }
                mutableLiveDataOooOo0O.setValue(tokenChat);
                MutableLiveData<String> mutableLiveDataOooOo0o = oooOOO.OooOo0o();
                if (loginToken != null && (tokenRoom = loginToken.getTokenRoom()) != null) {
                    str = tokenRoom;
                }
                mutableLiveDataOooOo0o.setValue(str);
                LiveEventBus.get("ACCOUNT_CHANGE_PASSWORD").post(null);
                ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Successfully));
                changePasswordActivity.finish();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ApiResult<LoginInformation2>, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<LoginInformation2> apiResult) {
            ApiResult<LoginInformation2> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            ChangePasswordActivity.this.OooOoO();
            return Unit.INSTANCE;
        }
    }

    public static final void OooOoo(ChangePasswordActivity changePasswordActivity) {
        String string = changePasswordActivity.OooOooO().f50916OooO0o0.getText().toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string2 = string.subSequence(i, length + 1).toString();
        String string3 = changePasswordActivity.OooOooO().f50915OooO0o.getText().toString();
        int length2 = string3.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length2) {
            boolean z4 = Intrinsics.compare((int) string3.charAt(!z3 ? i2 : length2), 32) <= 0;
            if (z3) {
                if (!z4) {
                    break;
                } else {
                    length2--;
                }
            } else if (z4) {
                i2++;
            } else {
                z3 = true;
            }
        }
        String string4 = string3.subSequence(i2, length2 + 1).toString();
        if (!(string2.length() == 0)) {
            if (!(string4.length() == 0)) {
                changePasswordActivity.OooOooO().f50912OooO0O0.setEnabled(true);
                changePasswordActivity.OooOooO().f50912OooO0O0.setClickable(true);
                return;
            }
        }
        changePasswordActivity.OooOooO().f50912OooO0O0.setEnabled(false);
        changePasswordActivity.OooOooO().f50912OooO0O0.setClickable(false);
    }

    public final x6 OooOooO() {
        return (x6) this.f21726Ooooo0o.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:39:0x0107  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x0116  */
    /* JADX WARN: Code duplicated, block: B:50:0x013c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x0152  */
    /* JADX WARN: Code duplicated, block: B:60:0x0164  */
    /* JADX WARN: Code duplicated, block: B:61:0x0168  */
    /* JADX WARN: Code duplicated, block: B:63:0x0170  */
    /* JADX WARN: Code duplicated, block: B:65:0x0177  */
    /* JADX WARN: Code duplicated, block: B:67:0x0182  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x019f  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        String string;
        String string2;
        int length;
        int i;
        boolean z;
        String string3;
        String strOooO0OO;
        ToastUtil toastUtil;
        o0O0ooO o0o0oooOooO0O0;
        String strOooO0OO2;
        ToastUtil toastUtil2;
        o0O0ooO o0o0oooOooO0O1;
        String string4;
        ToastUtil toastUtil3;
        o0O0ooO o0o0oooOooO0O2;
        int i2;
        boolean z2;
        Intrinsics.checkNotNullParameter(v, "v");
        boolean z3 = true;
        switch (v.getId()) {
            case R.id.btn_submit /* 2131296559 */:
                String string5 = OooOooO().f50915OooO0o.getText().toString();
                int length2 = string5.length() - 1;
                int i3 = 0;
                boolean z4 = false;
                while (i3 <= length2) {
                    boolean z5 = Intrinsics.compare((int) string5.charAt(!z4 ? i3 : length2), 32) <= 0;
                    if (z4) {
                        if (!z5) {
                            string = string5.subSequence(i3, length2 + 1).toString();
                            string2 = OooOooO().f50916OooO0o0.getText().toString();
                            length = string2.length() - 1;
                            i = 0;
                            z = false;
                            while (i <= length) {
                                if (z) {
                                    i2 = length;
                                } else {
                                    i2 = i;
                                }
                                if (Intrinsics.compare((int) string2.charAt(i2), 32) <= 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z) {
                                    if (!z2) {
                                        string3 = string2.subSequence(i, length + 1).toString();
                                        if (OooOooO().f50916OooO0o0.getText().toString().length() != string3.length()) {
                                            string4 = getString(R.string.invalid_password);
                                            toastUtil3 = ToastUtil.f12568OooO0O0;
                                            if (string4 != null && !StringsKt.isBlank(string4)) {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                o0o0oooOooO0O2 = p074o000O0oo.OooOOO.OooO0O0(toastUtil3, string4, "runnable");
                                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                    o00O000 o00o001 = o00O000.f34346OooO00o;
                                                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O2);
                                                } else {
                                                    o0o0oooOooO0O2.run();
                                                }
                                                break;
                                            }
                                        } else if (string3.length() < 6) {
                                            strOooO0OO2 = o000O0O0.OooO0OO(R.string.new_password_err);
                                            toastUtil2 = ToastUtil.f12568OooO0O0;
                                            if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                    o00O000 o00o002 = o00O000.f34346OooO00o;
                                                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                                                } else {
                                                    o0o0oooOooO0O1.run();
                                                }
                                                break;
                                            }
                                        } else if (Intrinsics.areEqual(string3, string)) {
                                            BaseActivityK.OooOoo0(this, null, 0L, 3, null);
                                            ((AccountVM) this.f21727OooooO0.getValue()).userPasswordEdit(string, string3).observe(this, new OooOo(new OooO00o(), null, new OooO0O0(), false, 10));
                                            break;
                                        } else {
                                            strOooO0OO = o000O0O0.OooO0OO(R.string.new_and_old_pwd_err);
                                            toastUtil = ToastUtil.f12568OooO0O0;
                                            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                    o00O000 o00o003 = o00O000.f34346OooO00o;
                                                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                                                } else {
                                                    o0o0oooOooO0O0.run();
                                                }
                                                break;
                                            }
                                        }
                                    } else {
                                        length--;
                                    }
                                } else if (z2) {
                                    i++;
                                } else {
                                    z = true;
                                }
                            }
                            string3 = string2.subSequence(i, length + 1).toString();
                            if (OooOooO().f50916OooO0o0.getText().toString().length() != string3.length()) {
                                string4 = getString(R.string.invalid_password);
                                toastUtil3 = ToastUtil.f12568OooO0O0;
                                if (string4 != null) {
                                    z3 = false;
                                }
                                if (z3) {
                                    o0o0oooOooO0O2 = p074o000O0oo.OooOOO.OooO0O0(toastUtil3, string4, "runnable");
                                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                        o00O000 o00o004 = o00O000.f34346OooO00o;
                                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O2);
                                    } else {
                                        o0o0oooOooO0O2.run();
                                    }
                                    break;
                                }
                            } else if (string3.length() < 6) {
                                strOooO0OO2 = o000O0O0.OooO0OO(R.string.new_password_err);
                                toastUtil2 = ToastUtil.f12568OooO0O0;
                                if (strOooO0OO2 != null) {
                                    z3 = false;
                                }
                                if (z3) {
                                    o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                        o00O000 o00o005 = o00O000.f34346OooO00o;
                                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                                    } else {
                                        o0o0oooOooO0O1.run();
                                    }
                                    break;
                                }
                            } else if (Intrinsics.areEqual(string3, string)) {
                                BaseActivityK.OooOoo0(this, null, 0L, 3, null);
                                ((AccountVM) this.f21727OooooO0.getValue()).userPasswordEdit(string, string3).observe(this, new OooOo(new OooO00o(), null, new OooO0O0(), false, 10));
                                break;
                            } else {
                                strOooO0OO = o000O0O0.OooO0OO(R.string.new_and_old_pwd_err);
                                toastUtil = ToastUtil.f12568OooO0O0;
                                if (strOooO0OO != null) {
                                    z3 = false;
                                }
                                if (z3) {
                                    o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                        o00O000 o00o006 = o00O000.f34346OooO00o;
                                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                                    } else {
                                        o0o0oooOooO0O0.run();
                                    }
                                    break;
                                }
                            }
                        } else {
                            length2--;
                        }
                    } else if (z5) {
                        i3++;
                    } else {
                        z4 = true;
                    }
                }
                string = string5.subSequence(i3, length2 + 1).toString();
                string2 = OooOooO().f50916OooO0o0.getText().toString();
                length = string2.length() - 1;
                i = 0;
                z = false;
                while (i <= length) {
                    if (z) {
                        i2 = i;
                    } else {
                        i2 = length;
                    }
                    if (Intrinsics.compare((int) string2.charAt(i2), 32) <= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        if (z2) {
                            z = true;
                        } else {
                            i++;
                        }
                    } else if (!z2) {
                        string3 = string2.subSequence(i, length + 1).toString();
                        if (OooOooO().f50916OooO0o0.getText().toString().length() != string3.length()) {
                            string4 = getString(R.string.invalid_password);
                            toastUtil3 = ToastUtil.f12568OooO0O0;
                            if (string4 != null) {
                                z3 = false;
                            }
                            if (z3) {
                                o0o0oooOooO0O2 = p074o000O0oo.OooOOO.OooO0O0(toastUtil3, string4, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    o00O000 o00o007 = o00O000.f34346OooO00o;
                                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O2);
                                } else {
                                    o0o0oooOooO0O2.run();
                                }
                                break;
                            }
                        } else if (string3.length() < 6) {
                            strOooO0OO2 = o000O0O0.OooO0OO(R.string.new_password_err);
                            toastUtil2 = ToastUtil.f12568OooO0O0;
                            if (strOooO0OO2 != null) {
                                z3 = false;
                            }
                            if (z3) {
                                o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    o00O000 o00o008 = o00O000.f34346OooO00o;
                                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                                } else {
                                    o0o0oooOooO0O1.run();
                                }
                                break;
                            }
                        } else if (Intrinsics.areEqual(string3, string)) {
                            BaseActivityK.OooOoo0(this, null, 0L, 3, null);
                            ((AccountVM) this.f21727OooooO0.getValue()).userPasswordEdit(string, string3).observe(this, new OooOo(new OooO00o(), null, new OooO0O0(), false, 10));
                            break;
                        } else {
                            strOooO0OO = o000O0O0.OooO0OO(R.string.new_and_old_pwd_err);
                            toastUtil = ToastUtil.f12568OooO0O0;
                            if (strOooO0OO != null) {
                                z3 = false;
                            }
                            if (z3) {
                                o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    o00O000 o00o009 = o00O000.f34346OooO00o;
                                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                                } else {
                                    o0o0oooOooO0O0.run();
                                }
                                break;
                            }
                        }
                    } else {
                        length--;
                    }
                }
                string3 = string2.subSequence(i, length + 1).toString();
                if (OooOooO().f50916OooO0o0.getText().toString().length() != string3.length()) {
                    string4 = getString(R.string.invalid_password);
                    toastUtil3 = ToastUtil.f12568OooO0O0;
                    if (string4 != null) {
                        z3 = false;
                    }
                    if (z3) {
                        o0o0oooOooO0O2 = p074o000O0oo.OooOOO.OooO0O0(toastUtil3, string4, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o0010 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O2);
                        } else {
                            o0o0oooOooO0O2.run();
                        }
                        break;
                    }
                } else if (string3.length() < 6) {
                    strOooO0OO2 = o000O0O0.OooO0OO(R.string.new_password_err);
                    toastUtil2 = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO2 != null) {
                        z3 = false;
                    }
                    if (z3) {
                        o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o0011 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                        } else {
                            o0o0oooOooO0O1.run();
                        }
                        break;
                    }
                } else if (Intrinsics.areEqual(string3, string)) {
                    BaseActivityK.OooOoo0(this, null, 0L, 3, null);
                    ((AccountVM) this.f21727OooooO0.getValue()).userPasswordEdit(string, string3).observe(this, new OooOo(new OooO00o(), null, new OooO0O0(), false, 10));
                    break;
                } else {
                    strOooO0OO = o000O0O0.OooO0OO(R.string.new_and_old_pwd_err);
                    toastUtil = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO != null) {
                        z3 = false;
                    }
                    if (z3) {
                        o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o0012 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        } else {
                            o0o0oooOooO0O0.run();
                        }
                        break;
                    }
                }
                break;
            case R.id.iv_see_new /* 2131297978 */:
                boolean z6 = !this.f21725Ooooo00;
                this.f21725Ooooo00 = z6;
                if (z6) {
                    OooOooO().f50916OooO0o0.setInputType(144);
                    OooOooO().f50913OooO0OO.setImageResource(R.drawable.eye1);
                } else {
                    OooOooO().f50916OooO0o0.setInputType(Constants.ERR_WATERMARK_READ);
                    OooOooO().f50913OooO0OO.setImageResource(R.drawable.eye2);
                }
                OooOooO().f50916OooO0o0.setTypeface(Typeface.DEFAULT);
                o0000.OooOO0(OooOooO().f50916OooO0o0);
                break;
            case R.id.iv_see_old /* 2131297979 */:
                boolean z7 = !this.f21724OoooOoo;
                this.f21724OoooOoo = z7;
                if (z7) {
                    OooOooO().f50915OooO0o.setInputType(144);
                    OooOooO().f50914OooO0Oo.setImageResource(R.drawable.eye1);
                } else {
                    OooOooO().f50915OooO0o.setInputType(Constants.ERR_WATERMARK_READ);
                    OooOooO().f50914OooO0Oo.setImageResource(R.drawable.eye2);
                }
                OooOooO().f50915OooO0o.setTypeface(Typeface.DEFAULT);
                o0000.OooOO0(OooOooO().f50915OooO0o);
                break;
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f50911OooO00o);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.change_password);
        }
        OooOo0O(1);
        OooOooO().f50912OooO0O0.setOnClickListener(this);
        OooOooO().f50914OooO0Oo.setOnClickListener(this);
        OooOooO().f50913OooO0OO.setOnClickListener(this);
        OooOooO().f50916OooO0o0.addTextChangedListener(new o00OOO00(this));
        OooOooO().f50915OooO0o.addTextChangedListener(new o00OOO0(this));
        OooOooO().f50915OooO0o.setTypeface(Typeface.DEFAULT);
        OooOooO().f50916OooO0o0.setTypeface(Typeface.DEFAULT);
    }
}
