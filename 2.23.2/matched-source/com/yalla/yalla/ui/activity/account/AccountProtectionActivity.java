package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.TrustedDevice;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.account.AccountProtectionVM;
import java.util.List;
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
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p379o0OOoOOO.oOO00O;
import p384o0OOoo0O.o000oOoO;
import p405o0Oo0OOO.o000O0O0;
import p491o0o00O0o.o000000O;
import p491o0o00O0o.o000OOo;
import p491o0o00O0o.o0OO00O;
import p491o0o00O0o.o0OOO0o;
import p491o0o00O0o.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p583o0oOoo00.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/AccountProtectionActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAccountProtectionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountProtectionActivity.kt\ncom/yalla/yalla/ui/activity/account/AccountProtectionActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,186:1\n22#2,2:187\n75#3,13:189\n*S KotlinDebug\n*F\n+ 1 AccountProtectionActivity.kt\ncom/yalla/yalla/ui/activity/account/AccountProtectionActivity\n*L\n40#1:187,2\n41#1:189,13\n*E\n"})
public final class AccountProtectionActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f24684OooOo0O = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o000000O f24686OooOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24685OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o000O0O0.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24687OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountProtectionVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.AccountProtectionActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f24696OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24696OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO extends Lambda implements Function1<ApiError, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError error = apiError;
            Intrinsics.checkNotNullParameter(error, "it");
            int code = error.getCode();
            AccountProtectionActivity activity = AccountProtectionActivity.this;
            if (code == 1065) {
                int i = AccountProtectionActivity.f24684OooOo0O;
                activity.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                activity.startActivity(new Intent(activity, (Class<?>) TurnOnLoginProtectionActivity.class));
                o000000.f56635OooO0O0.postValue(Boolean.FALSE);
            } else if (code != 1066) {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p381o0OOoOo0.Oooo000(error, null), 3, null);
            } else {
                int i2 = AccountProtectionActivity.f24684OooOo0O;
                activity.getClass();
                o000O o000o = new o000O(activity);
                o000o.OooOOoo(p562o0oOo000.o000000.account_login_protection_bind_phone);
                o000o.OooOo(true);
                o000o.OooOOOO(p562o0oOo000.o000000.account_login_protection_bind_phone_confirm);
                o000o.OooOo0(new com.yalla.yalla.ui.activity.account.OooO00o(activity));
                o000o.OooOO0(o000OOo.f48964OooO0Oo);
                o000o.OooOO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<List<TrustedDevice>, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<TrustedDevice> list) {
            List<TrustedDevice> list2 = list;
            o000000O o000000o2 = AccountProtectionActivity.this.f24686OooOo0;
            if (o000000o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o000000o2 = null;
            }
            o000000o2.OooOoO0(list2);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ApiResult<List<TrustedDevice>>, Unit> {
        public OooO0O0() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x003f  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<TrustedDevice>> apiResult) {
            ApiResult<List<TrustedDevice>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            AccountProtectionActivity accountProtectionActivity = AccountProtectionActivity.this;
            accountProtectionActivity.OooOo0();
            if (it.isSuccess()) {
                List<TrustedDevice> data = it.getData();
                if ((data != null ? data.size() : 0) > 0) {
                    TextView tvTrustedDevice = accountProtectionActivity.OooOo().f44220OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(tvTrustedDevice, "tvTrustedDevice");
                    com.code.android.util.o000O.OooOOOO(tvTrustedDevice);
                    RecyclerView rvTrustedDevice = accountProtectionActivity.OooOo().f44218OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(rvTrustedDevice, "rvTrustedDevice");
                    com.code.android.util.o000O.OooOOOO(rvTrustedDevice);
                } else {
                    TextView tvTrustedDevice2 = accountProtectionActivity.OooOo().f44220OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(tvTrustedDevice2, "tvTrustedDevice");
                    com.code.android.util.o000O.OooO0OO(tvTrustedDevice2);
                    RecyclerView rvTrustedDevice2 = accountProtectionActivity.OooOo().f44218OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(rvTrustedDevice2, "rvTrustedDevice");
                    com.code.android.util.o000O.OooO0OO(rvTrustedDevice2);
                }
            } else {
                TextView tvTrustedDevice3 = accountProtectionActivity.OooOo().f44220OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(tvTrustedDevice3, "tvTrustedDevice");
                com.code.android.util.o000O.OooO0OO(tvTrustedDevice3);
                RecyclerView rvTrustedDevice3 = accountProtectionActivity.OooOo().f44218OooO0O0;
                Intrinsics.checkNotNullExpressionValue(rvTrustedDevice3, "rvTrustedDevice");
                com.code.android.util.o000O.OooO0OO(rvTrustedDevice3);
            }
            o000000O o000000o2 = accountProtectionActivity.f24686OooOo0;
            if (o000000o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o000000o2 = null;
            }
            o000000o2.Oooo0O0(it.isSuccess());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f24691OooO0Oo;

        public OooO0OO(p491o0o00O0o.o000000 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24691OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f24691OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24691OooO0Oo;
        }

        public final int hashCode() {
            return this.f24691OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24691OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO0o extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f24693OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f24693OooO0o0 = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            int i = AccountProtectionActivity.f24684OooOo0O;
            ((AccountProtectionVM) AccountProtectionActivity.this.f24687OooOo00.getValue()).syncAccountProtection();
            String strOooO0OO = this.f24693OooO0o0 ? o0000.OooO0OO(p562o0oOo000.o000000.account_login_protection_turn_on_success) : o0000.OooO0OO(p562o0oOo000.o000000.account_login_protection_close_success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final o000O0O0 OooOo() {
        return (o000O0O0) this.f24685OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO(boolean z) {
        ((AccountProtectionVM) this.f24687OooOo00.getValue()).switchUserDevice(z ? 1 : 0).observe(this, new o000oOoO(new OooO0o(z), new OooO(), null, true, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO0() {
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        ((AccountProtectionVM) this.f24687OooOo00.getValue()).getTrustDeviceList().observe(this, new o000oOoO(new OooO00o(), null, new OooO0O0(), false, 10));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44217OooO00o);
        Window window = getWindow();
        if (window != null) {
            oOO00O.OooO0OO(window, 100);
        }
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            oOO00O.OooO0O0(headerLayout);
        }
        OooOOoo(p562o0oOo000.o000000.account_login_protection);
        OooOOo0(1);
        o000000O o000000o2 = new o000000O(this, oo0o0Oo.account_item_account_protection);
        this.f24686OooOo0 = o000000o2;
        int i = 0;
        o000000o2.f13176OooO0o = new p491o0o00O0o.oo0o0Oo(this, i);
        OooOo().f44218OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView = OooOo().f44218OooO0O0;
        o000000O o000000o3 = this.f24686OooOo0;
        if (o000000o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000000o3 = null;
        }
        recyclerView.setAdapter(o000000o3);
        OooOo().f44219OooO0OO.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o00O0o.o0O0O00
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i2 = AccountProtectionActivity.f24684OooOo0O;
                AccountProtectionActivity this$0 = this.f49017OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(Boolean.valueOf(z), o000000.f56635OooO0O0.getValue())) {
                    return;
                }
                OooO00o.OooO0O0("105056");
                if (z) {
                    this$0.OooOoO(z);
                    return;
                }
                o000O o000o = new o000O(this$0);
                o000o.OooOoO(o0000.OooO0OO(p562o0oOo000.o000000.account_close_protect_title));
                o000o.OooOOoo(p562o0oOo000.o000000.account_close_protect_content);
                o000o.OooOOOO(p562o0oOo000.o000000.account_close_protect_confirm);
                o000o.OooOo0(new o00000(this$0, z));
                o000o.OooOo0O(o00000O0.f48940OooO0Oo);
                o000o.OooOO0o();
            }
        });
        o000000.f56635OooO0O0.observe(this, new OooO0OO(new p491o0o00O0o.o000000(this)));
        LiveEventBus.get("TURN_ON_PROTECTION").observe(this, new o0OOO0o(this, i));
        LiveEventBus.get("DELETE_DEVICE_SUCCESS").observe(this, new o0Oo0oo(this, i));
        LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new o0OO00O(this, i));
    }
}
