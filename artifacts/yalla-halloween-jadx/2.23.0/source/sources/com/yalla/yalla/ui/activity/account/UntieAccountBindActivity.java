package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.vm.account.AccountVM;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p464o0Oooo.o000000O;
import p474o0o00.o0OO0;
import p474o0o00.o0OO00o0;
import p474o0o00.o0OO0O0;
import p474o0o00.oo0ooO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.e0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/UntieAccountBindActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUntieAccountBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UntieAccountBindActivity.kt\ncom/yalla/yalla/ui/activity/account/UntieAccountBindActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,200:1\n22#2,2:201\n75#3,13:203\n*S KotlinDebug\n*F\n+ 1 UntieAccountBindActivity.kt\ncom/yalla/yalla/ui/activity/account/UntieAccountBindActivity\n*L\n39#1:201,2\n40#1:203,13\n*E\n"})
public final class UntieAccountBindActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f25342OooOo = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public AccountBindInfo f25344OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f25346OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25343OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(e0.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25345OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.UntieAccountBindActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25351OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25351OooO0Oo;
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
    public final Lazy f25347OooOo0o = LazyKt.lazy(new OooO0O0());

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

    public final OpenAuthManager OooOo() {
        return (OpenAuthManager) this.f25347OooOo0o.getValue();
    }

    public final e0 OooOoO0() {
        return (e0) this.f25343OooOOoo.getValue();
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
        setContentView(OooOoO0().f57786OooO00o);
        Serializable serializableExtra = getIntent().getSerializableExtra("LOGIN_PLATFORM_DATA");
        if (serializableExtra instanceof AccountBindInfo) {
            this.f25344OooOo0 = (AccountBindInfo) serializableExtra;
        }
        int intExtra = getIntent().getIntExtra("UNTIE_TYPE", this.f25346OooOo0O);
        this.f25346OooOo0O = intExtra;
        if (intExtra == 4) {
            int i2 = oO00OOo0.single_third_facebook;
            OooOOoo(i2);
            AccountBindInfo accountBindInfo = this.f25344OooOo0;
            if (accountBindInfo == null || (strOooO0OO = accountBindInfo.getAccount(intExtra)) == null) {
                strOooO0OO = o0000.OooO0OO(i2);
            }
            i = oOo00OO0.icon_unbind_facebook;
        } else {
            if (intExtra != 9) {
                if (intExtra == 12) {
                    int i3 = oO00OOo0.single_third_yallachat;
                    OooOOoo(i3);
                    AccountBindInfo accountBindInfo2 = this.f25344OooOo0;
                    if (accountBindInfo2 == null || (strOooO0OO = accountBindInfo2.getAccount(intExtra)) == null) {
                        strOooO0OO = o0000.OooO0OO(i3);
                    }
                    i = oOo00OO0.icon_unbind_yallachat;
                }
                TextView textView = OooOoO0().f57789OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.tvUntieBindResult");
                o000OO00.OooO0OO(textView);
                OooOoO0().f57788OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0o00.o0OO000o
                    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v13, types: [boolean, int] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String strOooO0OO2;
                        boolean z;
                        int i4;
                        int i5 = UntieAccountBindActivity.f25342OooOo;
                        UntieAccountBindActivity this$0 = this.f47327OooO0Oo;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AccountBindInfo accountBindInfo3 = this$0.f25344OooOo0;
                        if (accountBindInfo3 == null) {
                            return;
                        }
                        Intrinsics.checkNotNull(accountBindInfo3);
                        String msg = accountBindInfo3.getIsPh();
                        Intrinsics.checkNotNullParameter(msg, "msg");
                        if (!((TextUtils.isEmpty(msg) || Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, msg)) ? false : true)) {
                            AccountBindInfo accountBindInfo4 = this$0.f25344OooOo0;
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
                                o0OO00O o0oo00o2 = new o0OO00O(this$0);
                                o000000O o000000o2 = o000000O.f46674OooO00o;
                                o0oo00o2.OooOOoo(o000000O.OooOoO0() ? oO00OOo0.unbind_account_explanation : oO00OOo0.unbind_account_explanation_no_phone);
                                o0oo00o2.OooOo(true);
                                o0oo00o2.OooOo0(new o0OO00OO(this$0));
                                o0oo00o2.OooOO0o();
                                return;
                            }
                        }
                        o0OO00O o0oo00o3 = new o0OO00O(this$0);
                        String strOooO0OO3 = o0000.OooO0OO(oO00OOo0.sure_unbind_account);
                        String[] strArr = new String[1];
                        int i7 = this$0.f25346OooOo0O;
                        if (i7 == 4) {
                            strOooO0OO2 = o0000.OooO0OO(oO00OOo0.single_third_facebook);
                        } else if (i7 == 5) {
                            strOooO0OO2 = o0000.OooO0OO(oO00OOo0.single_third_weChat);
                        } else if (i7 == 7) {
                            strOooO0OO2 = o0000.OooO0OO(oO00OOo0.single_third_instagram);
                        } else if (i7 != 9) {
                            strOooO0OO2 = i7 != 12 ? this$0.OooOoO0().f57790OooO0o0.getText().toString() : o0000.OooO0OO(oO00OOo0.single_third_yallachat);
                        } else {
                            strOooO0OO2 = o0000.OooO0OO(oO00OOo0.single_third_twitter);
                        }
                        strArr[0] = strOooO0OO2;
                        o0oo00o3.OooOo00(o0000O.OooO00o(strOooO0OO3, strArr));
                        o0oo00o3.OooOOOO(oO00OOo0.Unbind);
                        o0oo00o3.OooOo0(new o0OO0o00(this$0));
                        o0oo00o3.OooOo(true);
                        o0oo00o3.OooOO0o();
                    }
                });
                OooOo().f24730OooO0O0 = new o0OO00o0(this);
                OooOo().f24732OooO0Oo = new o0OO0(this);
                OooOo().f24731OooO0OO = new o0OO0O0(this);
                LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new oo0ooO(this));
            }
            int i4 = oO00OOo0.single_third_twitter;
            OooOOoo(i4);
            AccountBindInfo accountBindInfo3 = this.f25344OooOo0;
            if (accountBindInfo3 == null || (strOooO0OO = accountBindInfo3.getAccount(intExtra)) == null) {
                strOooO0OO = o0000.OooO0OO(i4);
            }
            i = oOo00OO0.icon_unbind_twitter;
        }
        OooOoO0().f57790OooO0o0.setText(strOooO0OO);
        OooOoO0().f57787OooO0O0.setImageResource(i);
        TextView textView2 = OooOoO0().f57789OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvUntieBindResult");
        o000OO00.OooO0OO(textView2);
        OooOoO0().f57788OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0o00.o0OO000o
            /* JADX WARN: Code duplicated, block: B:23:0x004d  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v13, types: [boolean, int] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strOooO0OO2;
                boolean z;
                int i5;
                int i6 = UntieAccountBindActivity.f25342OooOo;
                UntieAccountBindActivity this$0 = this.f47327OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                AccountBindInfo accountBindInfo4 = this$0.f25344OooOo0;
                if (accountBindInfo4 == null) {
                    return;
                }
                Intrinsics.checkNotNull(accountBindInfo4);
                String msg = accountBindInfo4.getIsPh();
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (!((TextUtils.isEmpty(msg) || Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, msg)) ? false : true)) {
                    AccountBindInfo accountBindInfo5 = this$0.f25344OooOo0;
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
                        o0OO00O o0oo00o2 = new o0OO00O(this$0);
                        o000000O o000000o2 = o000000O.f46674OooO00o;
                        o0oo00o2.OooOOoo(o000000O.OooOoO0() ? oO00OOo0.unbind_account_explanation : oO00OOo0.unbind_account_explanation_no_phone);
                        o0oo00o2.OooOo(true);
                        o0oo00o2.OooOo0(new o0OO00OO(this$0));
                        o0oo00o2.OooOO0o();
                        return;
                    }
                }
                o0OO00O o0oo00o3 = new o0OO00O(this$0);
                String strOooO0OO3 = o0000.OooO0OO(oO00OOo0.sure_unbind_account);
                String[] strArr = new String[1];
                int i8 = this$0.f25346OooOo0O;
                if (i8 == 4) {
                    strOooO0OO2 = o0000.OooO0OO(oO00OOo0.single_third_facebook);
                } else if (i8 == 5) {
                    strOooO0OO2 = o0000.OooO0OO(oO00OOo0.single_third_weChat);
                } else if (i8 == 7) {
                    strOooO0OO2 = o0000.OooO0OO(oO00OOo0.single_third_instagram);
                } else if (i8 != 9) {
                    strOooO0OO2 = i8 != 12 ? this$0.OooOoO0().f57790OooO0o0.getText().toString() : o0000.OooO0OO(oO00OOo0.single_third_yallachat);
                } else {
                    strOooO0OO2 = o0000.OooO0OO(oO00OOo0.single_third_twitter);
                }
                strArr[0] = strOooO0OO2;
                o0oo00o3.OooOo00(o0000O.OooO00o(strOooO0OO3, strArr));
                o0oo00o3.OooOOOO(oO00OOo0.Unbind);
                o0oo00o3.OooOo0(new o0OO0o00(this$0));
                o0oo00o3.OooOo(true);
                o0oo00o3.OooOO0o();
            }
        });
        OooOo().f24730OooO0O0 = new o0OO00o0(this);
        OooOo().f24732OooO0Oo = new o0OO0(this);
        OooOo().f24731OooO0OO = new o0OO0O0(this);
        LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new oo0ooO(this));
    }
}
