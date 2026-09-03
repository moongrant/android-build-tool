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
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000O0Oo;
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
import p367o0OOo0o0.Oooo000;
import p375o0OOoOO.o00000O0;
import p377o0OOoOo.o0000OO0;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p402o0Oo0OOO.o00O0000;
import p402o0Oo0OOO.o00O000o;
import p408o0Oo0o0O.o00Oo0;
import p474o0o00.o00OO;
import p474o0o00.o00OOO0;
import p474o0o00.o00OOO00;
import p474o0o00.o00OOOO0;
import p474o0o00.o00OOOOo;
import p474o0o00.o00Oo00;
import p474o0o00.o0o0Oo;
import p474o0o00.oo0O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p599o0oo00oo.o0000O;
import p599o0oo00oo.o000OO;
import p641o0ooOOOO.z;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/PhoneNumberActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhoneNumberActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneNumberActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,430:1\n22#2,2:431\n75#3,13:433\n75#3,13:446\n49#4:459\n65#4,16:460\n93#4,3:476\n*S KotlinDebug\n*F\n+ 1 PhoneNumberActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneNumberActivity\n*L\n75#1:431,2\n82#1:433,13\n84#1:446,13\n216#1:459\n216#1:460,16\n216#1:476,3\n*E\n"})
public final class PhoneNumberActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f25262OooOoO = 0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public ClientCodeType f25266OooOo00;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public String f25269OooOoO0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25263OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(z.class), this, null);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25265OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PhNumberVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.PhoneNumberActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25274OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25274OooO0Oo;
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
    public final ViewModelLazy f25267OooOo0O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(LoginVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.PhoneNumberActivity$special$$inlined$viewModels$default$5
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
        public final /* synthetic */ Function0 f25278OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25278OooO0Oo;
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
    public String f25268OooOo0o = "";

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f25264OooOo = LazyKt.lazy(new OooO0OO());

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
        public final /* synthetic */ Function1 f25271OooO0Oo;

        public OooO0o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25271OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25271OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25271OooO0Oo;
        }

        public final int hashCode() {
            return this.f25271OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25271OooO0Oo.invoke(obj);
        }
    }

    public static final void OooOo(final PhoneNumberActivity phoneNumberActivity) {
        Snackbar snackbarOooO0oo = Snackbar.OooO0oo(phoneNumberActivity.OooOoO().f59420OooO00o, oO00OOo0.login_feedback_tips);
        snackbarOooO0oo.OooO(oO00OOo0.feedback, new View.OnClickListener() { // from class: o0o00.o00OO0O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = PhoneNumberActivity.f25262OooOoO;
                PhoneNumberActivity this$0 = this.f47276OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0OO000.OooO00o("101060");
                o00O000o.f44496OooO0oO.observe(this$0, new oo00oO(this$0));
            }
        });
        snackbarOooO0oo.f17799OooOO0O = 5000;
        snackbarOooO0oo.OooOO0();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity
    public final boolean OooOOOo() {
        return false;
    }

    public final z OooOoO() {
        return (z) this.f25263OooOOoo.getValue();
    }

    public final OpenAuthManager OooOoO0() {
        return (OpenAuthManager) this.f25264OooOo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PhNumberVM OooOoOO() {
        return (PhNumberVM) this.f25265OooOo0.getValue();
    }

    public final void OooOoo() {
        String string = StringsKt.trim((CharSequence) OooOoO().f59422OooO0OO.getText().toString()).toString();
        Button button = OooOoO().f59421OooO0O0;
        int length = string.length();
        button.setEnabled(5 <= length && length < 21);
        if (com.code.android.util.OooOo00.OooO0O0(string)) {
            OooOoO().f59423OooO0Oo.setVisibility(0);
            OooOoO().f59423OooO0Oo.setClickable(true);
        } else {
            OooOoO().f59423OooO0Oo.setClickable(false);
            OooOoO().f59423OooO0Oo.setVisibility(4);
        }
    }

    public final void OooOoo0(CountryItemData countryItemData) {
        if (countryItemData == null) {
            return;
        }
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this);
        oooO00o.f43911OooO0OO = countryItemData.getIcon();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(OooOoO().f59425OooO0o0);
        OooOoOO().saveCountryData(countryItemData);
        OooOoO().f59427OooO0oo.setText(countryItemData.getCountryCode());
        this.f25269OooOoO0 = countryItemData.getIsoCode();
        OooOoo();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        OooOoO0().OooO0oO(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoO().f59423OooO0Oo)) {
            OooOoO().f59422OooO0OO.setText("");
            return;
        }
        int i = 1;
        if (Intrinsics.areEqual(view, OooOoO().f59426OooO0oO)) {
            o0OO000.OooO00o("101053");
            o000OO o000oo2 = new o000OO(this);
            o000oo2.f56864OooO0O0 = PhoneCountryCodeSelectActivity.class;
            Bundle bundle = new Bundle();
            ClientCodeType clientCodeType = this.f25266OooOo00;
            bundle.putInt("source", clientCodeType != null ? clientCodeType.getSource() : 1);
            o000oo2.OooO00o(bundle);
            o000oo2.OooO0O0(new o0000O() { // from class: o0o00.o00OO00O
                @Override // p599o0oo00oo.o0000O
                public final void onActivityResult(int i2, Intent intent) {
                    int i3 = PhoneNumberActivity.f25262OooOoO;
                    PhoneNumberActivity this$0 = this.f47275OooO00o;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (intent != null) {
                        Parcelable parcelableExtra = intent.getParcelableExtra("DATA");
                        this$0.OooOoo0(parcelableExtra instanceof CountryItemData ? (CountryItemData) parcelableExtra : null);
                    }
                }
            });
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO().f59421OooO0O0)) {
            ClientCodeType clientCodeType2 = ClientCodeType.Register;
            ClientCodeType clientCodeType3 = this.f25266OooOo00;
            if (clientCodeType2 == clientCodeType3 || ClientCodeType.Login == clientCodeType3) {
                o0OO000.OooO00o("101052");
                o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
                ApiEvent.OooO00o(40);
            }
            String string = StringsKt.trim((CharSequence) OooOoO().f59422OooO0OO.getText().toString()).toString();
            EditText view2 = OooOoO().f59422OooO0OO;
            Intrinsics.checkNotNullExpressionValue(view2, "binding.etPhoneNumber");
            Intrinsics.checkNotNullParameter(view2, "view");
            Context context = view2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            p367o0OOo0o0.OooOO0O.OooO00o(view2.getContext().getApplicationContext(), new Handler(), Oooo000.OooO00o(context), view2.getWindowToken(), 0);
            if (StringsKt.isBlank(string)) {
                String string2 = getString(oO00OOo0.input_number);
                if (string2 != null && !StringsKt.isBlank(string2)) {
                    i = 0;
                }
                if (i != 0) {
                    return;
                }
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(string2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    return;
                }
            }
            if (StringsKt.Oooo00o(string, AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                string = string.substring(1);
                Intrinsics.checkNotNullExpressionValue(string, "this as java.lang.String).substring(startIndex)");
            }
            String string3 = StringsKt.trim((CharSequence) OooOoO().f59427OooO0oo.getText().toString()).toString();
            String strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(string3, string);
            if (this.f25266OooOo00 != ClientCodeType.Change || !com.code.android.util.OooOo00.OooO0O0(this.f25268OooOo0o) || !Intrinsics.areEqual(this.f25268OooOo0o, strOooO00o)) {
                BaseActivityK.OooOo0o(this, null, 0L, 3);
                OooOoOO().checkPhoneRegister(strOooO00o, string3).observe(this, new o0000OO0(new com.yalla.yalla.ui.activity.account.OooO0o(this, strOooO00o, string3), new oo0O(this), new o00OO(this), true));
            } else {
                ApiError error = new ApiError(1016, null, null, 6, null);
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        ClientCodeType clientCodeType;
        super.onCreate(bundle);
        setContentView(OooOoO().f59420OooO00o);
        String stringExtra = getIntent().getStringExtra("PHONE_NUMBER");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f25268OooOo0o = stringExtra;
        Serializable serializableExtra = getIntent().getSerializableExtra("TYPE_ACCOUNT");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.data.constant.ClientCodeType");
        ClientCodeType clientCodeType2 = (ClientCodeType) serializableExtra;
        this.f25266OooOo00 = clientCodeType2;
        ClientCodeType clientCodeType3 = ClientCodeType.Register;
        if (clientCodeType3 == clientCodeType2 || ClientCodeType.Login == clientCodeType2) {
            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
            ApiEvent.OooO00o(30);
        }
        OooOOo0(1);
        OooOoOO().initPhoneAreaCodeInfo(this.f25266OooOo00);
        OooOoo0(OooOoOO().getPhoneAreaCodeInfo());
        OooOoO().f59423OooO0Oo.setOnClickListener(this);
        OooOoO().f59426OooO0oO.setOnClickListener(this);
        OooOoO().f59424OooO0o.setColor(o0000.OooO00o(oO00O0o.color_FFB7B7B7));
        ClientCodeType clientCodeType4 = this.f25266OooOo00;
        int i = clientCodeType4 == null ? -1 : OooO0O0.$EnumSwitchMapping$0[clientCodeType4.ordinal()];
        if (i == 1) {
            OooOo00(com.code.android.util.o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.user_login_in_step), "1"));
            OooOoO().f59421OooO0O0.setText(oO00OOo0.Next);
            o00O0000.OooO00o();
            o00O0000.f44480OooO0o.observe(this, new OooO0o(new o00Oo00(this)));
        } else if (i == 2) {
            OooOOoo(oO00OOo0.title_Phone_changePhone);
            OooOoO().f59428OooOO0.setText(oO00OOo0.tips_Phone_TellUs);
        } else if (i == 3 || i == 4) {
            OooOOoo(oO00OOo0.title_Phone_connectPhone);
            OooOoO().f59428OooOO0.setText(oO00OOo0.verify_phone_number_tips);
        } else if (i != 5) {
            OooOOoo(oO00OOo0.title_Verify_Phone_Number);
        } else {
            OooOo00(com.code.android.util.o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.sign_up_step), "1"));
            OooOoO().f59428OooOO0.setText(oO00OOo0.sign_up_tips);
        }
        OooOoO().f59421OooO0O0.setOnClickListener(this);
        EditText editText = OooOoO().f59422OooO0OO;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.etPhoneNumber");
        editText.addTextChangedListener(new o00OOOOo(this));
        String strOooO0o0 = this.f25266OooOo00 == clientCodeType3 ? o00Oo0.OooO00o().OooO0o0("signInNumber", "") : o00Oo0.OooO00o().OooO0o0("loginPhoneNumber", "");
        if ((!StringsKt.isBlank(strOooO0o0)) && ((clientCodeType = this.f25266OooOo00) == clientCodeType3 || clientCodeType == ClientCodeType.Login)) {
            OooOoO().f59422OooO0OO.setText(strOooO0o0);
            OooOoO().f59422OooO0OO.setSelection(strOooO0o0.length());
        } else {
            OooOoO().f59424OooO0o.OooO00o();
            EditText view = OooOoO().f59422OooO0OO;
            Intrinsics.checkNotNullExpressionValue(view, "binding.etPhoneNumber");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
        }
        LiveEventBus.get("LOGIN_RESULT").observe(this, new o00OOO00(this));
        LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new o00OOO0(this));
        OooOoO0().f24730OooO0O0 = new OooO(this);
        OooOoO0().f24732OooO0Oo = new o0o0Oo(this);
        OooOoO0().f24731OooO0OO = new o00OOOO0(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        EditText view = OooOoO().f59422OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "binding.etPhoneNumber");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
    }
}
