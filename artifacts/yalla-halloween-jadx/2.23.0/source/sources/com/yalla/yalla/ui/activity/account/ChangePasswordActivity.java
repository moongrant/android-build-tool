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
import com.android.billingclient.api.o000O000;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.LoginInformation;
import com.yalla.yalla.model.LoginInformation2;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.account.AccountVM;
import io.agora.rtc.Constants;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000OO0;
import p464o0Oooo.o000000O;
import p474o0o00.Oooo0;
import p474o0o00.o000oOoO;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.h0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/ChangePasswordActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "v", "", "onClick", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nChangePasswordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangePasswordActivity.kt\ncom/yalla/yalla/ui/activity/account/ChangePasswordActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,146:1\n22#2,2:147\n75#3,13:149\n107#4:162\n79#4,22:163\n107#4:185\n79#4,22:186\n107#4:208\n79#4,22:209\n107#4:231\n79#4,22:232\n*S KotlinDebug\n*F\n+ 1 ChangePasswordActivity.kt\ncom/yalla/yalla/ui/activity/account/ChangePasswordActivity\n*L\n34#1:147,2\n36#1:149,13\n70#1:162\n70#1:163,22\n71#1:185\n71#1:186,22\n84#1:208\n84#1:209,22\n85#1:231\n85#1:232,22\n*E\n"})
public final class ChangePasswordActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f25158OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f25160OooOo00;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25159OooOo0 = new o000O0Oo(Reflection.getOrCreateKotlinClass(h0.class), this, null);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25161OooOo0O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.ChangePasswordActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25166OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25166OooO0Oo;
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
                o000000O o000000o2 = o000000O.f46674OooO00o;
                LoginInformation.LoginToken loginToken = loginInformation3.token;
                MutableLiveData mutableLiveDataOooOOOO = o000000O.OooOOOO();
                String str = "";
                if (loginToken == null || (token = loginToken.getToken()) == null) {
                    token = "";
                }
                mutableLiveDataOooOOOO.setValue(token);
                MutableLiveData mutableLiveData = (MutableLiveData) o000000O.f46700OooOoo.getValue();
                if (loginToken == null || (tokenActivity = loginToken.getTokenActivity()) == null) {
                    tokenActivity = "";
                }
                mutableLiveData.setValue(tokenActivity);
                MutableLiveData mutableLiveDataOooOOOo = o000000O.OooOOOo();
                if (loginToken == null || (tokenChat = loginToken.getTokenChat()) == null) {
                    tokenChat = "";
                }
                mutableLiveDataOooOOOo.setValue(tokenChat);
                MutableLiveData mutableLiveData2 = (MutableLiveData) o000000O.f46703OooOooo.getValue();
                if (loginToken != null && (tokenRoom = loginToken.getTokenRoom()) != null) {
                    str = tokenRoom;
                }
                mutableLiveData2.setValue(str);
                LiveEventBus.get("ACCOUNT_CHANGE_PASSWORD").post(null);
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.Successfully);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
                ChangePasswordActivity.this.finish();
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
            ChangePasswordActivity.this.OooOo0();
            return Unit.INSTANCE;
        }
    }

    public static final void OooOo(ChangePasswordActivity changePasswordActivity) throws IllegalAccessException, InvocationTargetException {
        String string = changePasswordActivity.OooOoO0().f58017OooO0o0.getText().toString();
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
        String string3 = changePasswordActivity.OooOoO0().f58016OooO0o.getText().toString();
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
                changePasswordActivity.OooOoO0().f58013OooO0O0.setEnabled(true);
                changePasswordActivity.OooOoO0().f58013OooO0O0.setClickable(true);
                return;
            }
        }
        changePasswordActivity.OooOoO0().f58013OooO0O0.setEnabled(false);
        changePasswordActivity.OooOoO0().f58013OooO0O0.setClickable(false);
    }

    public final h0 OooOoO0() throws IllegalAccessException, InvocationTargetException {
        return (h0) this.f25159OooOo0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        int id = v.getId();
        boolean z = true;
        if (id != oO00O0oO.btn_submit) {
            if (id == oO00O0oO.iv_see_old) {
                boolean z2 = !this.f25158OooOOoo;
                this.f25158OooOOoo = z2;
                if (z2) {
                    OooOoO0().f58016OooO0o.setInputType(144);
                    OooOoO0().f58015OooO0Oo.setImageResource(oOo00OO0.eye1);
                } else {
                    OooOoO0().f58016OooO0o.setInputType(Constants.ERR_WATERMARK_READ);
                    OooOoO0().f58015OooO0Oo.setImageResource(oOo00OO0.eye2);
                }
                OooOoO0().f58016OooO0o.setTypeface(Typeface.DEFAULT);
                o000O000.OooO0OO(OooOoO0().f58016OooO0o);
                return;
            }
            if (id == oO00O0oO.iv_see_new) {
                boolean z3 = !this.f25160OooOo00;
                this.f25160OooOo00 = z3;
                if (z3) {
                    OooOoO0().f58017OooO0o0.setInputType(144);
                    OooOoO0().f58014OooO0OO.setImageResource(oOo00OO0.eye1);
                } else {
                    OooOoO0().f58017OooO0o0.setInputType(Constants.ERR_WATERMARK_READ);
                    OooOoO0().f58014OooO0OO.setImageResource(oOo00OO0.eye2);
                }
                OooOoO0().f58017OooO0o0.setTypeface(Typeface.DEFAULT);
                o000O000.OooO0OO(OooOoO0().f58017OooO0o0);
                return;
            }
            return;
        }
        String string = OooOoO0().f58016OooO0o.getText().toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z4 = false;
        while (i <= length) {
            boolean z5 = Intrinsics.compare((int) string.charAt(!z4 ? i : length), 32) <= 0;
            if (z4) {
                if (!z5) {
                    break;
                } else {
                    length--;
                }
            } else if (z5) {
                i++;
            } else {
                z4 = true;
            }
        }
        String string2 = string.subSequence(i, length + 1).toString();
        String string3 = OooOoO0().f58017OooO0o0.getText().toString();
        int length2 = string3.length() - 1;
        int i2 = 0;
        boolean z6 = false;
        while (i2 <= length2) {
            boolean z7 = Intrinsics.compare((int) string3.charAt(!z6 ? i2 : length2), 32) <= 0;
            if (z6) {
                if (!z7) {
                    break;
                } else {
                    length2--;
                }
            } else if (z7) {
                i2++;
            } else {
                z6 = true;
            }
        }
        String string4 = string3.subSequence(i2, length2 + 1).toString();
        if (OooOoO0().f58017OooO0o0.getText().toString().length() != string4.length()) {
            String string5 = getString(oO00OOo0.invalid_password);
            if (string5 != null && !StringsKt.isBlank(string5)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(string5, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        if (string4.length() < 6) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.new_password_err);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o2.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                return;
            }
        }
        if (!Intrinsics.areEqual(string4, string2)) {
            BaseActivityK.OooOo0o(this, null, 0L, 3);
            ((AccountVM) this.f25161OooOo0O.getValue()).userPasswordEdit(string2, string4).observe(this, new o0000OO0(new OooO00o(), null, new OooO0O0(), false, 10));
            return;
        }
        String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.new_and_old_pwd_err);
        if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
            z = false;
        }
        if (z) {
            return;
        }
        o000Oo0 o000oo0OooO00o3 = o000O00.OooO00o(strOooO0OO2, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o3.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o3);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO0().f58012OooO00o);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.change_password);
        }
        OooOOo0(1);
        OooOoO0().f58013OooO0O0.setOnClickListener(this);
        OooOoO0().f58015OooO0Oo.setOnClickListener(this);
        OooOoO0().f58014OooO0OO.setOnClickListener(this);
        OooOoO0().f58017OooO0o0.addTextChangedListener(new Oooo0(this));
        OooOoO0().f58016OooO0o.addTextChangedListener(new o000oOoO(this));
        OooOoO0().f58016OooO0o.setTypeface(Typeface.DEFAULT);
        OooOoO0().f58017OooO0o0.setTypeface(Typeface.DEFAULT);
    }
}
