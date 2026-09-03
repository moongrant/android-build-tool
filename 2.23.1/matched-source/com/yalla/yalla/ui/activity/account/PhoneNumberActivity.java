package com.yalla.yalla.ui.activity.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
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
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.snackbar.Snackbar;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.api.old.ApiEvent;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.user.CountryItemData;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.vm.account.LoginVM;
import com.yalla.yalla.ui.vm.account.PhNumberVM;
import java.io.Serializable;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p370o0OOo0Oo.Oooo000;
import p373o0OOo0oO.o00Oo0;
import p373o0OOo0oO.o0OOO0o;
import p386o0OOoo0O.o0OoOo0;
import p386o0OOoo0O.o0ooOOo;
import p386o0OOoo0O.oo0o0Oo;
import p407o0Oo0OOO.o00oOoo;
import p490o0o00O0.o00O;
import p490o0o00O0.o00OO000;
import p490o0o00O0.o00OO0OO;
import p490o0o00O0.o00OOO0;
import p490o0o00O0.o00OOO00;
import p490o0o00O0.o00OOO0O;
import p490o0o00O0.o0o0Oo;
import p490o0o00O0.oo0O;
import p490o0o00O0.oo0oOO0;
import p565o0oOo000.o000OOo;
import p585o0oOoo00.o000000O;
import p593o0oOoooO.h0;
import p604o0oo00oo.o000;
import p604o0oo00oo.o000O000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/PhoneNumberActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPhoneNumberActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneNumberActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,430:1\n22#2,2:431\n75#3,13:433\n75#3,13:446\n49#4:459\n65#4,16:460\n93#4,3:476\n*S KotlinDebug\n*F\n+ 1 PhoneNumberActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneNumberActivity\n*L\n75#1:431,2\n82#1:433,13\n84#1:446,13\n216#1:459\n216#1:460,16\n216#1:476,3\n*E\n"})
public final class PhoneNumberActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f24809OooOoO = 0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public ClientCodeType f24813OooOo00;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public String f24816OooOoO0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24810OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o00oOoo.class), this, null);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24812OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PhNumberVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.PhoneNumberActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f24821OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24821OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24814OooOo0O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(LoginVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.PhoneNumberActivity$special$$inlined$viewModels$default$5
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.PhoneNumberActivity$special$$inlined$viewModels$default$4
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.PhoneNumberActivity$special$$inlined$viewModels$default$6

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f24825OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24825OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public String f24815OooOo0o = "";

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f24811OooOo = LazyKt.lazy(new OooO0OO());

    @SourceDebugExtension({"SMAP\nPhoneNumberActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneNumberActivity$Companion\n+ 2 ActivityExt.kt\ncom/yalla/yalla/ext/ActivityExtKt\n*L\n1#1,430:1\n17#2,5:431\n*S KotlinDebug\n*F\n+ 1 PhoneNumberActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneNumberActivity$Companion\n*L\n411#1:431,5\n*E\n"})
    public static final class OooO00o {
        public static void OooO00o(@NotNull BaseActivityK context, @Nullable String str, @Nullable ClientCodeType clientCodeType) {
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
            try {
                iArr[ClientCodeType.Login.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClientCodeType.Change.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClientCodeType.BingingPhone.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClientCodeType.TunOnProtectionBingingPhone.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClientCodeType.Register.ordinal()] = 5;
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
            return new OpenAuthManager(PhoneNumberActivity.this);
        }
    }

    public static final class OooO0o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f24818OooO0Oo;

        public OooO0o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24818OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f24818OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24818OooO0Oo;
        }

        public final int hashCode() {
            return this.f24818OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24818OooO0Oo.invoke(obj);
        }
    }

    public static final void OooOo(PhoneNumberActivity phoneNumberActivity) {
        Snackbar snackbarOooO0oo = Snackbar.OooO0oo(phoneNumberActivity.OooOoO().f44372OooO00o, o000OOo.login_feedback_tips);
        snackbarOooO0oo.OooO(o000OOo.feedback, new o00OO000(phoneNumberActivity, 0));
        snackbarOooO0oo.f17327OooOO0O = 5000;
        snackbarOooO0oo.OooOO0();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity
    public final boolean OooOOOo() {
        return false;
    }

    public final o00oOoo OooOoO() {
        return (o00oOoo) this.f24810OooOOoo.getValue();
    }

    public final OpenAuthManager OooOoO0() {
        return (OpenAuthManager) this.f24811OooOo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PhNumberVM OooOoOO() {
        return (PhNumberVM) this.f24812OooOo0.getValue();
    }

    public final void OooOoo() {
        String string = StringsKt.trim((CharSequence) OooOoO().f44374OooO0OO.getText().toString()).toString();
        Button button = OooOoO().f44373OooO0O0;
        int length = string.length();
        button.setEnabled(5 <= length && length < 21);
        if (com.code.android.util.OooOo00.OooO0O0(string)) {
            OooOoO().f44375OooO0Oo.setVisibility(0);
            OooOoO().f44375OooO0Oo.setClickable(true);
        } else {
            OooOoO().f44375OooO0Oo.setClickable(false);
            OooOoO().f44375OooO0Oo.setVisibility(4);
        }
    }

    public final void OooOoo0(CountryItemData countryItemData) {
        if (countryItemData == null) {
            return;
        }
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this);
        oooO00o.f43127OooO0OO = countryItemData.getIcon();
        oooO00o.f43125OooO00o = 0;
        oooO00o.OooO0Oo(OooOoO().f44377OooO0o0);
        OooOoOO().saveCountryData(countryItemData);
        OooOoO().f44379OooO0oo.setText(countryItemData.getCountryCode());
        this.f24816OooOoO0 = countryItemData.getIsoCode();
        OooOoo();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        OooOoO0().OooO0oO(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p402o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoO().f44375OooO0Oo)) {
            OooOoO().f44374OooO0OO.setText("");
            return;
        }
        int i = 1;
        if (Intrinsics.areEqual(view, OooOoO().f44378OooO0oO)) {
            h0.OooO0O0("101053");
            o000 o000Var = new o000(this);
            o000Var.f56955OooO0O0 = PhoneCountryCodeSelectActivity.class;
            Bundle bundle = new Bundle();
            ClientCodeType clientCodeType = this.f24813OooOo00;
            bundle.putInt("source", clientCodeType != null ? clientCodeType.getSource() : 1);
            o000Var.OooO00o(bundle);
            o000Var.OooO0O0(new o000O000() { // from class: o0o00O0.o00O0OOO
                @Override // p604o0oo00oo.o000O000
                public final void onActivityResult(int i2, Intent intent) {
                    int i3 = PhoneNumberActivity.f24809OooOoO;
                    PhoneNumberActivity this$0 = this.f48795OooO00o;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (intent != null) {
                        Parcelable parcelableExtra = intent.getParcelableExtra("DATA");
                        this$0.OooOoo0(parcelableExtra instanceof CountryItemData ? (CountryItemData) parcelableExtra : null);
                    }
                }
            });
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f44373OooO0O0)) {
            ClientCodeType clientCodeType2 = ClientCodeType.Register;
            ClientCodeType clientCodeType3 = this.f24813OooOo00;
            if (clientCodeType2 == clientCodeType3 || ClientCodeType.Login == clientCodeType3) {
                h0.OooO0O0("101052");
                o0ooOOo o0ooooo = oo0o0Oo.f43479OooO00o;
                ApiEvent.OooO00o(40);
            }
            String string = StringsKt.trim((CharSequence) OooOoO().f44374OooO0OO.getText().toString()).toString();
            EditText view2 = OooOoO().f44374OooO0OO;
            Intrinsics.checkNotNullExpressionValue(view2, "etPhoneNumber");
            Intrinsics.checkNotNullParameter(view2, "view");
            Context context = view2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            o00Oo0.OooO00o(view2.getContext().getApplicationContext(), new Handler(), o0OOO0o.OooO00o(context), view2.getWindowToken(), 0);
            if (StringsKt.isBlank(string)) {
                String string2 = getString(o000OOo.input_number);
                if (string2 != null && !StringsKt.isBlank(string2)) {
                    i = 0;
                }
                if (i != 0) {
                    return;
                }
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(string2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                    return;
                }
            }
            if (StringsKt.Oooo00o(string, AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                string = string.substring(1);
                Intrinsics.checkNotNullExpressionValue(string, "this as java.lang.String).substring(startIndex)");
            }
            String string3 = StringsKt.trim((CharSequence) OooOoO().f44379OooO0oo.getText().toString()).toString();
            String strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(string3, string);
            if (this.f24813OooOo00 != ClientCodeType.Change || !com.code.android.util.OooOo00.OooO0O0(this.f24815OooOo0o) || !Intrinsics.areEqual(this.f24815OooOo0o, strOooO00o)) {
                BaseActivityK.OooOo0o(this, null, 0L, 3);
                OooOoOO().checkPhoneRegister(strOooO00o, string3).observe(this, new o0OoOo0(new com.yalla.yalla.ui.activity.account.OooO0o(this, strOooO00o, string3), new o00OO0OO(this), new oo0O(this), true));
            } else {
                ApiError error = new ApiError(1016, null, null, 6, null);
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p383o0OOoOo0.Oooo000(error, null), 3, null);
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        ClientCodeType clientCodeType;
        super.onCreate(bundle);
        setContentView(OooOoO().f44372OooO00o);
        String stringExtra = getIntent().getStringExtra("PHONE_NUMBER");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f24815OooOo0o = stringExtra;
        Serializable serializableExtra = getIntent().getSerializableExtra("TYPE_ACCOUNT");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.data.constant.ClientCodeType");
        ClientCodeType clientCodeType2 = (ClientCodeType) serializableExtra;
        this.f24813OooOo00 = clientCodeType2;
        ClientCodeType clientCodeType3 = ClientCodeType.Register;
        if (clientCodeType3 == clientCodeType2 || ClientCodeType.Login == clientCodeType2) {
            o0ooOOo o0ooooo = oo0o0Oo.f43479OooO00o;
            ApiEvent.OooO00o(30);
        }
        OooOOo0(1);
        OooOoOO().initPhoneAreaCodeInfo(this.f24813OooOo00);
        OooOoo0(OooOoOO().getPhoneAreaCodeInfo());
        OooOoO().f44375OooO0Oo.setOnClickListener(this);
        OooOoO().f44378OooO0oO.setOnClickListener(this);
        OooOoO().f44376OooO0o.setColor(o0000.OooO00o(p565o0oOo000.o0ooOOo.color_FFB7B7B7));
        ClientCodeType clientCodeType4 = this.f24813OooOo00;
        int i = clientCodeType4 == null ? -1 : OooO0O0.$EnumSwitchMapping$0[clientCodeType4.ordinal()];
        if (i == 1) {
            OooOo00(o0000O.OooO00o(o0000.OooO0OO(o000OOo.user_login_in_step), "1"));
            OooOoO().f44373OooO0O0.setText(o000OOo.Next);
            o000000O.OooO00o();
            o000000O.f56597OooO0o.observe(this, new OooO0o(new o0o0Oo(this)));
        } else if (i == 2) {
            OooOOoo(o000OOo.title_Phone_changePhone);
            OooOoO().f44380OooOO0.setText(o000OOo.tips_Phone_TellUs);
        } else if (i == 3 || i == 4) {
            OooOOoo(o000OOo.title_Phone_connectPhone);
            OooOoO().f44380OooOO0.setText(o000OOo.verify_phone_number_tips);
        } else if (i != 5) {
            OooOOoo(o000OOo.title_Verify_Phone_Number);
        } else {
            OooOo00(o0000O.OooO00o(o0000.OooO0OO(o000OOo.sign_up_step), "1"));
            OooOoO().f44380OooOO0.setText(o000OOo.sign_up_tips);
        }
        OooOoO().f44373OooO0O0.setOnClickListener(this);
        EditText etPhoneNumber = OooOoO().f44374OooO0OO;
        Intrinsics.checkNotNullExpressionValue(etPhoneNumber, "etPhoneNumber");
        etPhoneNumber.addTextChangedListener(new o00OOO0O(this));
        String strOooO0o0 = this.f24813OooOo00 == clientCodeType3 ? p417o0Oo0oO0.o00Oo0.OooO00o().OooO0o0("signInNumber", "") : p417o0Oo0oO0.o00Oo0.OooO00o().OooO0o0("loginPhoneNumber", "");
        if ((!StringsKt.isBlank(strOooO0o0)) && ((clientCodeType = this.f24813OooOo00) == clientCodeType3 || clientCodeType == ClientCodeType.Login)) {
            OooOoO().f44374OooO0OO.setText(strOooO0o0);
            OooOoO().f44374OooO0OO.setSelection(strOooO0o0.length());
        } else {
            OooOoO().f44376OooO0o.OooO00o();
            EditText view = OooOoO().f44374OooO0OO;
            Intrinsics.checkNotNullExpressionValue(view, "etPhoneNumber");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
        }
        int i2 = 0;
        LiveEventBus.get("LOGIN_RESULT").observe(this, new oo0oOO0(this, i2));
        LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new o00O(this, i2));
        OooOoO0().f24277OooO0O0 = new OooO(this);
        OooOoO0().f24279OooO0Oo = new o00OOO00(this);
        OooOoO0().f24278OooO0OO = new o00OOO0(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        EditText view = OooOoO().f44374OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "etPhoneNumber");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
    }
}
