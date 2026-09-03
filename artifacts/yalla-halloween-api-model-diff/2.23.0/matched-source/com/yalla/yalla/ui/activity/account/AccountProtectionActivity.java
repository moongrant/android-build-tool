package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.Window;
import android.widget.CompoundButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.account.AccountProtectionVM;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
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
import p157o00OoOO0.o0OO00O;
import p375o0OOoOO.o00000O0;
import p377o0OOoOo.o0000OO0;
import p402o0Oo0OOO.o00;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.s;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/AccountProtectionActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAccountProtectionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountProtectionActivity.kt\ncom/yalla/yalla/ui/activity/account/AccountProtectionActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,186:1\n22#2,2:187\n75#3,13:189\n*S KotlinDebug\n*F\n+ 1 AccountProtectionActivity.kt\ncom/yalla/yalla/ui/activity/account/AccountProtectionActivity\n*L\n40#1:187,2\n41#1:189,13\n*E\n"})
public final class AccountProtectionActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f25146OooOo0O = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public p474o0o00.OooOo00 f25148OooOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25147OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(s.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25149OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountProtectionVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.AccountProtectionActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.AccountProtectionActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.AccountProtectionActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25156OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25156OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25150OooO0Oo;

        public OooO00o(p474o0o00.OooOO0O function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25150OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25150OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25150OooO0Oo;
        }

        public final int hashCode() {
            return this.f25150OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25150OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f25152OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z) {
            super(1);
            this.f25152OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            int i = AccountProtectionActivity.f25146OooOo0O;
            AccountProtectionActivity.this.OooOoO().syncAccountProtection();
            String strOooO0OO = this.f25152OooO0o0 ? o0000.OooO0OO(oO00OOo0.account_login_protection_turn_on_success) : o0000.OooO0OO(oO00OOo0.account_login_protection_close_success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiError, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError error = apiError;
            Intrinsics.checkNotNullParameter(error, "it");
            int code = error.getCode();
            AccountProtectionActivity activity = AccountProtectionActivity.this;
            if (code == 1065) {
                int i = AccountProtectionActivity.f25146OooOo0O;
                activity.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                activity.startActivity(new Intent(activity, (Class<?>) TurnOnLoginProtectionActivity.class));
                o00.f44462OooO0O0.postValue(Boolean.FALSE);
            } else if (code != 1066) {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
            } else {
                int i2 = AccountProtectionActivity.f25146OooOo0O;
                activity.getClass();
                o0OO00O o0oo00o2 = new o0OO00O(activity);
                o0oo00o2.OooOOoo(oO00OOo0.account_login_protection_bind_phone);
                o0oo00o2.OooOo(true);
                o0oo00o2.OooOOOO(oO00OOo0.account_login_protection_bind_phone_confirm);
                o0oo00o2.OooOo0(new com.yalla.yalla.ui.activity.account.OooO00o(activity));
                o0oo00o2.OooOO0(p474o0o00.OooO0o.f47213OooO0Oo);
                o0oo00o2.OooOO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void OooOo(AccountProtectionActivity accountProtectionActivity) {
        accountProtectionActivity.getClass();
        BaseActivityK.OooOo0o(accountProtectionActivity, null, 0L, 3);
        accountProtectionActivity.OooOoO().getTrustDeviceList().observe(accountProtectionActivity, new o0000OO0(new p474o0o00.OooO(accountProtectionActivity), null, new p474o0o00.OooOO0(accountProtectionActivity), false, 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AccountProtectionVM OooOoO() {
        return (AccountProtectionVM) this.f25149OooOo00.getValue();
    }

    public final s OooOoO0() {
        return (s) this.f25147OooOOoo.getValue();
    }

    public final void OooOoOO(boolean z) {
        OooOoO().switchUserDevice(z ? 1 : 0).observe(this, new o0000OO0(new OooO0O0(z), new OooO0OO(), null, true, 4));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO0().f58768OooO00o);
        Window window = getWindow();
        if (window != null) {
            p370o0OOoO.OooOOO0.OooO0OO(window, 100);
        }
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            p370o0OOoO.OooOOO0.OooO0O0(headerLayout);
        }
        OooOOoo(oO00OOo0.account_login_protection);
        OooOOo0(1);
        p474o0o00.OooOo00 oooOo00 = new p474o0o00.OooOo00(this, oO00OO0O.account_item_account_protection);
        this.f25148OooOo0 = oooOo00;
        oooOo00.f10098OooO0o = new p474o0o00.OooO0O0(this, 0);
        OooOoO0().f58769OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView = OooOoO0().f58769OooO0O0;
        p474o0o00.OooOo00 oooOo01 = this.f25148OooOo0;
        if (oooOo01 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooOo01 = null;
        }
        recyclerView.setAdapter(oooOo01);
        OooOoO0().f58770OooO0OO.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o00.OooO0OO
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = AccountProtectionActivity.f25146OooOo0O;
                AccountProtectionActivity this$0 = this.f47212OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(Boolean.valueOf(z), o00.f44462OooO0O0.getValue())) {
                    return;
                }
                o0OO000.OooO00o("105056");
                if (z) {
                    this$0.OooOoOO(z);
                    return;
                }
                o0OO00O o0oo00o2 = new o0OO00O(this$0);
                o0oo00o2.OooOoO(o0000.OooO0OO(oO00OOo0.account_close_protect_title));
                o0oo00o2.OooOOoo(oO00OOo0.account_close_protect_content);
                o0oo00o2.OooOOOO(oO00OOo0.account_close_protect_confirm);
                o0oo00o2.OooOo0(new OooOo(this$0, z));
                o0oo00o2.OooOo0O(Oooo000.f47222OooO0Oo);
                o0oo00o2.OooOO0o();
            }
        });
        o00.f44462OooO0O0.observe(this, new OooO00o(new p474o0o00.OooOO0O(this)));
        LiveEventBus.get("TURN_ON_PROTECTION").observe(this, new p474o0o00.OooOOO0(this));
        LiveEventBus.get("DELETE_DEVICE_SUCCESS").observe(this, new p474o0o00.OooOOO(this));
        LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new p474o0o00.OooOOOO(this));
    }
}
