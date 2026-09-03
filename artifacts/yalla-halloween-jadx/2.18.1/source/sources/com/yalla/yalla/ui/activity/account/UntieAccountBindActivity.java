package com.yalla.yalla.ui.activity.account;

import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.account.AccountVM;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00O0OO0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p255o00ooO0o.oo0oOO0;
import p437o0OoOOOo.o0O0O0Oo;
import p501o0o00o.o0000OO0;
import p524o0o0O0oO.oo00oO;
import p649o0ooOOoo.u6;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/UntieAccountBindActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UntieAccountBindActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final /* synthetic */ int f21887OooooOO = 0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f21888OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(u6.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21889Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.UntieAccountBindActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f21896Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21896Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public AccountBindInfo f21890Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f21891OooooO0;

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            UntieAccountBindActivity untieAccountBindActivity = UntieAccountBindActivity.this;
            int i = UntieAccountBindActivity.f21887OooooOO;
            Objects.requireNonNull(untieAccountBindActivity);
            BaseActivityK.OooOoo0(untieAccountBindActivity, null, 0L, 3, null);
            ((AccountVM) untieAccountBindActivity.f21889Ooooo00.getValue()).untieAccountBind(untieAccountBindActivity.f21891OooooO0).observe(untieAccountBindActivity, new o00O0OO0(untieAccountBindActivity, 3));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            UntieAccountBindActivity untieAccountBindActivity = UntieAccountBindActivity.this;
            int i = UntieAccountBindActivity.f21887OooooOO;
            TextView textView = untieAccountBindActivity.OooOoo().f50678OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvUntieBindResult");
            oOO00O.OooO(textView);
            return Unit.INSTANCE;
        }
    }

    public final u6 OooOoo() {
        return (u6) this.f21888OoooOoo.getValue();
    }

    public final void OooOooO() {
        String strOooO0OO;
        oo0oOO0 oo0ooo0 = new oo0oOO0(this);
        String strOooO0OO2 = o000O0O0.OooO0OO(R.string.Sure_to_unbind_your_XXX_account);
        String[] strArr = new String[1];
        int i = this.f21891OooooO0;
        if (i == 4) {
            strOooO0OO = o000O0O0.OooO0OO(R.string.single_third_facebook);
        } else if (i == 5) {
            strOooO0OO = o000O0O0.OooO0OO(R.string.single_third_weChat);
        } else if (i == 7) {
            strOooO0OO = o000O0O0.OooO0OO(R.string.single_third_instagram);
        } else if (i != 9) {
            strOooO0OO = i != 12 ? OooOoo().f50679OooO0o0.getText().toString() : o000O0O0.OooO0OO(R.string.single_third_yallachat);
        } else {
            strOooO0OO = o000O0O0.OooO0OO(R.string.single_third_twitter);
        }
        strArr[0] = strOooO0OO;
        oo0ooo0.OooOo0O(OooOo.OooO00o(strOooO0OO2, strArr));
        oo0ooo0.OooOo0o(new OooO00o());
        oo0ooo0.OooOo(new OooO0O0());
        oo0ooo0.OooOOO0();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        String strOooO0OO;
        int i;
        super.onCreate(bundle);
        setContentView(OooOoo().f50675OooO00o);
        Serializable serializableExtra = getIntent().getSerializableExtra("LOGIN_PLATFORM_DATA");
        if (serializableExtra instanceof AccountBindInfo) {
            this.f21890Ooooo0o = (AccountBindInfo) serializableExtra;
        }
        int intExtra = getIntent().getIntExtra("UNTIE_TYPE", this.f21891OooooO0);
        this.f21891OooooO0 = intExtra;
        if (intExtra == 4) {
            OooOo(R.string.single_third_facebook);
            AccountBindInfo accountBindInfo = this.f21890Ooooo0o;
            if (accountBindInfo == null || (strOooO0OO = accountBindInfo.getAccount(intExtra)) == null) {
                strOooO0OO = o000O0O0.OooO0OO(R.string.single_third_facebook);
            }
            i = R.drawable.icon_unbind_facebook;
        } else if (intExtra == 5) {
            OooOo(R.string.single_third_weChat);
            AccountBindInfo accountBindInfo2 = this.f21890Ooooo0o;
            if (accountBindInfo2 == null || (strOooO0OO = accountBindInfo2.getAccount(intExtra)) == null) {
                strOooO0OO = o000O0O0.OooO0OO(R.string.single_third_weChat);
            }
            i = R.drawable.icon_unbind_wechat;
        } else if (intExtra == 7) {
            OooOo(R.string.single_third_instagram);
            AccountBindInfo accountBindInfo3 = this.f21890Ooooo0o;
            if (accountBindInfo3 == null || (strOooO0OO = accountBindInfo3.getAccount(intExtra)) == null) {
                strOooO0OO = o000O0O0.OooO0OO(R.string.single_third_instagram);
            }
            i = R.drawable.icon_unbind_instagram;
        } else {
            if (intExtra != 9) {
                if (intExtra == 12) {
                    OooOo(R.string.single_third_yallachat);
                    AccountBindInfo accountBindInfo4 = this.f21890Ooooo0o;
                    if (accountBindInfo4 == null || (strOooO0OO = accountBindInfo4.getAccount(intExtra)) == null) {
                        strOooO0OO = o000O0O0.OooO0OO(R.string.single_third_yallachat);
                    }
                    i = R.drawable.icon_unbind_yallachat;
                }
                TextView textView = OooOoo().f50678OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.tvUntieBindResult");
                oOO00O.OooO0O0(textView);
                int i2 = 1;
                OooOoo().f50677OooO0OO.setOnClickListener(new o0O0O0Oo(this, i2));
                LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new oo00oO(this, i2));
                LiveEventBus.get("EVENTMSG_UNBIND", Boolean.TYPE).observe(this, new o0000OO0(this, 2));
            }
            OooOo(R.string.single_third_twitter);
            AccountBindInfo accountBindInfo5 = this.f21890Ooooo0o;
            if (accountBindInfo5 == null || (strOooO0OO = accountBindInfo5.getAccount(intExtra)) == null) {
                strOooO0OO = o000O0O0.OooO0OO(R.string.single_third_twitter);
            }
            i = R.drawable.icon_unbind_twitter;
        }
        OooOoo().f50679OooO0o0.setText(strOooO0OO);
        OooOoo().f50676OooO0O0.setImageResource(i);
        TextView textView2 = OooOoo().f50678OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvUntieBindResult");
        oOO00O.OooO0O0(textView2);
        int i3 = 1;
        OooOoo().f50677OooO0OO.setOnClickListener(new o0O0O0Oo(this, i3));
        LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new oo00oO(this, i3));
        LiveEventBus.get("EVENTMSG_UNBIND", Boolean.TYPE).observe(this, new o0000OO0(this, 2));
    }
}
