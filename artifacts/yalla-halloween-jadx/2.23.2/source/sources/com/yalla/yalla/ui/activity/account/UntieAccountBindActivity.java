package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O;
import com.code.android.util.o000O0;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.vm.account.AccountVM;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oOO00O;
import p475o0Ooooo0.o0O00oO0;
import p491o0o00O0o.o0OO;
import p491o0o00O0o.o0OOOO00;
import p491o0o00O0o.o0OOOO0o;
import p491o0o00O0o.o0OOo000;
import p491o0o00O0o.o0oo0000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/UntieAccountBindActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUntieAccountBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UntieAccountBindActivity.kt\ncom/yalla/yalla/ui/activity/account/UntieAccountBindActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,210:1\n22#2,2:211\n75#3,13:213\n*S KotlinDebug\n*F\n+ 1 UntieAccountBindActivity.kt\ncom/yalla/yalla/ui/activity/account/UntieAccountBindActivity\n*L\n41#1:211,2\n42#1:213,13\n*E\n"})
public final class UntieAccountBindActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f24887OooOo = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public AccountBindInfo f24889OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f24891OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24888OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oOO00O.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24890OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.UntieAccountBindActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.UntieAccountBindActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.UntieAccountBindActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f24897OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24897OooO0Oo;
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
    public final Lazy f24892OooOo0o = LazyKt.lazy(new OooO0O0());

    public static final class OooO00o {
        public static void OooO00o(@NotNull ScreenNavigationActivity activity, @Nullable AccountBindInfo accountBindInfo, int i) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (accountBindInfo == null) {
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) UntieAccountBindActivity.class);
            intent.putExtra("LOGIN_PLATFORM_DATA", accountBindInfo);
            intent.putExtra("UNTIE_TYPE", i);
            activity.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<OpenAuthManager> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OpenAuthManager invoke() {
            return new OpenAuthManager(UntieAccountBindActivity.this);
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f24894OooO0Oo;

        public OooO0OO(o0oo0000 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24894OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f24894OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24894OooO0Oo;
        }

        public final int hashCode() {
            return this.f24894OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24894OooO0Oo.invoke(obj);
        }
    }

    public final OpenAuthManager OooOo() {
        return (OpenAuthManager) this.f24892OooOo0o.getValue();
    }

    public final oOO00O OooOoO0() {
        return (oOO00O) this.f24888OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        OooOo().OooO0oO(i, i2, intent);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        String strOooO0OO;
        int i;
        super.onCreate(bundle);
        setContentView(OooOoO0().f45035OooO00o);
        Serializable serializableExtra = getIntent().getSerializableExtra("LOGIN_PLATFORM_DATA");
        if (serializableExtra instanceof AccountBindInfo) {
            this.f24889OooOo0 = (AccountBindInfo) serializableExtra;
        }
        int intExtra = getIntent().getIntExtra("UNTIE_TYPE", this.f24891OooOo0O);
        this.f24891OooOo0O = intExtra;
        if (intExtra == 4) {
            int i2 = o000000.single_third_facebook;
            OooOOoo(i2);
            AccountBindInfo accountBindInfo = this.f24889OooOo0;
            if (accountBindInfo == null || (strOooO0OO = accountBindInfo.getAccount(intExtra)) == null) {
                strOooO0OO = o0000.OooO0OO(i2);
            }
            i = o0Oo0oo.icon_unbind_facebook;
        } else {
            if (intExtra != 9) {
                if (intExtra == 12) {
                    int i3 = o000000.single_third_yallachat;
                    OooOOoo(i3);
                    AccountBindInfo accountBindInfo2 = this.f24889OooOo0;
                    if (accountBindInfo2 == null || (strOooO0OO = accountBindInfo2.getAccount(intExtra)) == null) {
                        strOooO0OO = o0000.OooO0OO(i3);
                    }
                    i = o0Oo0oo.icon_unbind_yallachat;
                }
                TextView tvUntieBindResult = OooOoO0().f45038OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(tvUntieBindResult, "tvUntieBindResult");
                o000O.OooO0OO(tvUntieBindResult);
                OooOoO0().f45037OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0o00O0o.o0OOO00
                    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v16, types: [boolean, int] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String strOooO0OO2;
                        boolean z;
                        int i4;
                        int i5 = UntieAccountBindActivity.f24887OooOo;
                        UntieAccountBindActivity this$0 = this.f49049OooO0Oo;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AccountBindInfo accountBindInfo3 = this$0.f24889OooOo0;
                        if (accountBindInfo3 == null) {
                            return;
                        }
                        Intrinsics.checkNotNull(accountBindInfo3);
                        String msg = accountBindInfo3.getIsPh();
                        Intrinsics.checkNotNullParameter(msg, "msg");
                        if (!((TextUtils.isEmpty(msg) || Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, msg)) ? false : true)) {
                            AccountBindInfo accountBindInfo4 = this$0.f24889OooOo0;
                            if (accountBindInfo4 != null) {
                                ?? IsBindYallaChat = accountBindInfo4.isBindYallaChat();
                                if (accountBindInfo4.isBindFacebook()) {
                                    i4 = IsBindYallaChat;
                                    i4 = IsBindYallaChat + 1;
                                }
                                i4 = IsBindYallaChat;
                                int i6 = i4;
                                if (accountBindInfo4.isBindTwitter()) {
                                    i6 = i4 + 1;
                                }
                                if (i6 >= 2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (!z) {
                                p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(this$0);
                                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                                o000o.OooOOoo(((Boolean) o0O00oO0.f47984OoooOo0.getValue()).booleanValue() ? o000000.unbind_account_explanation : o000000.unbind_account_explanation_no_phone);
                                o000o.OooOo(true);
                                o000o.OooOo0(new o0OOO0OO(this$0));
                                o000o.OooOO0o();
                                return;
                            }
                        }
                        p205o00o0o0o.o000O o000o2 = new p205o00o0o0o.o000O(this$0);
                        String strOooO0OO3 = o0000.OooO0OO(o000000.sure_unbind_account);
                        String[] strArr = new String[1];
                        int i7 = this$0.f24891OooOo0O;
                        if (i7 == 4) {
                            strOooO0OO2 = o0000.OooO0OO(o000000.single_third_facebook);
                        } else if (i7 == 5) {
                            strOooO0OO2 = o0000.OooO0OO(o000000.single_third_weChat);
                        } else if (i7 == 7) {
                            strOooO0OO2 = o0000.OooO0OO(o000000.single_third_instagram);
                        } else if (i7 != 9) {
                            strOooO0OO2 = i7 != 12 ? this$0.OooOoO0().f45039OooO0o0.getText().toString() : o0000.OooO0OO(o000000.single_third_yallachat);
                        } else {
                            strOooO0OO2 = o0000.OooO0OO(o000000.single_third_twitter);
                        }
                        strArr[0] = strOooO0OO2;
                        o000o2.OooOo00(o0000O.OooO00o(strOooO0OO3, strArr));
                        o000o2.OooOOOO(o000000.Unbind);
                        o000o2.OooOo0(new oO0Oo(this$0));
                        o000o2.OooOo(true);
                        o000o2.OooOO0o();
                    }
                });
                OooOo().f24267OooO0O0 = new o0OOOO00(this);
                OooOo().f24269OooO0Oo = new o0OOOO0o(this);
                OooOo().f24268OooO0OO = new o0OOo000(this);
                LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new o0OO(0, this));
            }
            int i4 = o000000.single_third_twitter;
            OooOOoo(i4);
            AccountBindInfo accountBindInfo3 = this.f24889OooOo0;
            if (accountBindInfo3 == null || (strOooO0OO = accountBindInfo3.getAccount(intExtra)) == null) {
                strOooO0OO = o0000.OooO0OO(i4);
            }
            i = o0Oo0oo.icon_unbind_twitter;
        }
        OooOoO0().f45039OooO0o0.setText(strOooO0OO);
        OooOoO0().f45036OooO0O0.setImageResource(i);
        TextView tvUntieBindResult2 = OooOoO0().f45038OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvUntieBindResult2, "tvUntieBindResult");
        o000O.OooO0OO(tvUntieBindResult2);
        OooOoO0().f45037OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0o00O0o.o0OOO00
            /* JADX WARN: Code duplicated, block: B:23:0x004d  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v16, types: [boolean, int] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strOooO0OO2;
                boolean z;
                int i5;
                int i6 = UntieAccountBindActivity.f24887OooOo;
                UntieAccountBindActivity this$0 = this.f49049OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                AccountBindInfo accountBindInfo4 = this$0.f24889OooOo0;
                if (accountBindInfo4 == null) {
                    return;
                }
                Intrinsics.checkNotNull(accountBindInfo4);
                String msg = accountBindInfo4.getIsPh();
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (!((TextUtils.isEmpty(msg) || Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, msg)) ? false : true)) {
                    AccountBindInfo accountBindInfo5 = this$0.f24889OooOo0;
                    if (accountBindInfo5 != null) {
                        ?? IsBindYallaChat = accountBindInfo5.isBindYallaChat();
                        if (accountBindInfo5.isBindFacebook()) {
                            i5 = IsBindYallaChat;
                            i5 = IsBindYallaChat + 1;
                        }
                        i5 = IsBindYallaChat;
                        int i7 = i5;
                        if (accountBindInfo5.isBindTwitter()) {
                            i7 = i5 + 1;
                        }
                        if (i7 >= 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (!z) {
                        p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(this$0);
                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                        o000o.OooOOoo(((Boolean) o0O00oO0.f47984OoooOo0.getValue()).booleanValue() ? o000000.unbind_account_explanation : o000000.unbind_account_explanation_no_phone);
                        o000o.OooOo(true);
                        o000o.OooOo0(new o0OOO0OO(this$0));
                        o000o.OooOO0o();
                        return;
                    }
                }
                p205o00o0o0o.o000O o000o2 = new p205o00o0o0o.o000O(this$0);
                String strOooO0OO3 = o0000.OooO0OO(o000000.sure_unbind_account);
                String[] strArr = new String[1];
                int i8 = this$0.f24891OooOo0O;
                if (i8 == 4) {
                    strOooO0OO2 = o0000.OooO0OO(o000000.single_third_facebook);
                } else if (i8 == 5) {
                    strOooO0OO2 = o0000.OooO0OO(o000000.single_third_weChat);
                } else if (i8 == 7) {
                    strOooO0OO2 = o0000.OooO0OO(o000000.single_third_instagram);
                } else if (i8 != 9) {
                    strOooO0OO2 = i8 != 12 ? this$0.OooOoO0().f45039OooO0o0.getText().toString() : o0000.OooO0OO(o000000.single_third_yallachat);
                } else {
                    strOooO0OO2 = o0000.OooO0OO(o000000.single_third_twitter);
                }
                strArr[0] = strOooO0OO2;
                o000o2.OooOo00(o0000O.OooO00o(strOooO0OO3, strArr));
                o000o2.OooOOOO(o000000.Unbind);
                o000o2.OooOo0(new oO0Oo(this$0));
                o000o2.OooOo(true);
                o000o2.OooOO0o();
            }
        });
        OooOo().f24267OooO0O0 = new o0OOOO00(this);
        OooOo().f24269OooO0Oo = new o0OOOO0o(this);
        OooOo().f24268OooO0OO = new o0OOo000(this);
        LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new o0OO(0, this));
    }
}
