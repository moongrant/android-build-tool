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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p381o0OOoOOO.o00O00o0;
import p386o0OOoo0O.o0OoOo0;
import p407o0Oo0OOO.o000O0O0;
import p490o0o00O0.OooOo;
import p490o0o00O0.Oooo000;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OO00O;
import p585o0oOoo00.o000000;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/AccountProtectionActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAccountProtectionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountProtectionActivity.kt\ncom/yalla/yalla/ui/activity/account/AccountProtectionActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,186:1\n22#2,2:187\n75#3,13:189\n*S KotlinDebug\n*F\n+ 1 AccountProtectionActivity.kt\ncom/yalla/yalla/ui/activity/account/AccountProtectionActivity\n*L\n40#1:187,2\n41#1:189,13\n*E\n"})
public final class AccountProtectionActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f24692OooOo0O = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Oooo000 f24694OooOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24693OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o000O0O0.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24695OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountProtectionVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.AccountProtectionActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f24704OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24704OooO0Oo;
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
                int i = AccountProtectionActivity.f24692OooOo0O;
                activity.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                activity.startActivity(new Intent(activity, (Class<?>) TurnOnLoginProtectionActivity.class));
                o000000.f56592OooO0O0.postValue(Boolean.FALSE);
            } else if (code != 1066) {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p383o0OOoOo0.Oooo000(error, null), 3, null);
            } else {
                int i2 = AccountProtectionActivity.f24692OooOo0O;
                activity.getClass();
                o000O o000o = new o000O(activity);
                o000o.OooOOoo(o000OOo.account_login_protection_bind_phone);
                o000o.OooOo(true);
                o000o.OooOOOO(o000OOo.account_login_protection_bind_phone_confirm);
                o000o.OooOo0(new com.yalla.yalla.ui.activity.account.OooO00o(activity));
                o000o.OooOO0(p490o0o00O0.OooOo00.f48738OooO0Oo);
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
            Oooo000 oooo000 = AccountProtectionActivity.this.f24694OooOo0;
            if (oooo000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooo000 = null;
            }
            oooo000.OooOoO0(list2);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ApiResult<List<TrustedDevice>>, Unit> {
        public OooO0O0() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0040  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<TrustedDevice>> apiResult) {
            ApiResult<List<TrustedDevice>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            AccountProtectionActivity accountProtectionActivity = AccountProtectionActivity.this;
            accountProtectionActivity.OooOo0();
            if (it.isSuccess()) {
                List<TrustedDevice> data = it.getData();
                if ((data != null ? data.size() : 0) > 0) {
                    TextView tvTrustedDevice = accountProtectionActivity.OooOo().f44218OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(tvTrustedDevice, "tvTrustedDevice");
                    com.code.android.util.o000O.OooOOOO(tvTrustedDevice);
                    RecyclerView rvTrustedDevice = accountProtectionActivity.OooOo().f44216OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(rvTrustedDevice, "rvTrustedDevice");
                    com.code.android.util.o000O.OooOOOO(rvTrustedDevice);
                } else {
                    TextView tvTrustedDevice2 = accountProtectionActivity.OooOo().f44218OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(tvTrustedDevice2, "tvTrustedDevice");
                    com.code.android.util.o000O.OooO0OO(tvTrustedDevice2);
                    RecyclerView rvTrustedDevice2 = accountProtectionActivity.OooOo().f44216OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(rvTrustedDevice2, "rvTrustedDevice");
                    com.code.android.util.o000O.OooO0OO(rvTrustedDevice2);
                }
            } else {
                TextView tvTrustedDevice3 = accountProtectionActivity.OooOo().f44218OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(tvTrustedDevice3, "tvTrustedDevice");
                com.code.android.util.o000O.OooO0OO(tvTrustedDevice3);
                RecyclerView rvTrustedDevice3 = accountProtectionActivity.OooOo().f44216OooO0O0;
                Intrinsics.checkNotNullExpressionValue(rvTrustedDevice3, "rvTrustedDevice");
                com.code.android.util.o000O.OooO0OO(rvTrustedDevice3);
            }
            Oooo000 oooo000 = accountProtectionActivity.f24694OooOo0;
            if (oooo000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooo000 = null;
            }
            oooo000.Oooo0O0(it.isSuccess());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f24699OooO0Oo;

        public OooO0OO(OooOo function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24699OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f24699OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24699OooO0Oo;
        }

        public final int hashCode() {
            return this.f24699OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24699OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO0o extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f24701OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f24701OooO0o0 = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            int i = AccountProtectionActivity.f24692OooOo0O;
            ((AccountProtectionVM) AccountProtectionActivity.this.f24695OooOo00.getValue()).syncAccountProtection();
            String strOooO0OO = this.f24701OooO0o0 ? o0000.OooO0OO(o000OOo.account_login_protection_turn_on_success) : o0000.OooO0OO(o000OOo.account_login_protection_close_success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final o000O0O0 OooOo() {
        return (o000O0O0) this.f24693OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO(boolean z) {
        ((AccountProtectionVM) this.f24695OooOo00.getValue()).switchUserDevice(z ? 1 : 0).observe(this, new o0OoOo0(new OooO0o(z), new OooO(), null, true, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO0() {
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        ((AccountProtectionVM) this.f24695OooOo00.getValue()).getTrustDeviceList().observe(this, new o0OoOo0(new OooO00o(), null, new OooO0O0(), false, 10));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44215OooO00o);
        Window window = getWindow();
        if (window != null) {
            o00O00o0.OooO0OO(window, 100);
        }
        HeaderLayout headerLayout = this.f22289OooOO0;
        if (headerLayout != null) {
            o00O00o0.OooO0O0(headerLayout);
        }
        OooOOoo(o000OOo.account_login_protection);
        OooOOo0(1);
        Oooo000 oooo000 = new Oooo000(this, o0OO00O.account_item_account_protection);
        this.f24694OooOo0 = oooo000;
        oooo000.f13187OooO0o = new p490o0o00O0.OooOOO(this);
        OooOo().f44216OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView = OooOo().f44216OooO0O0;
        Oooo000 oooo001 = this.f24694OooOo0;
        if (oooo001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooo001 = null;
        }
        recyclerView.setAdapter(oooo001);
        OooOo().f44217OooO0OO.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o00O0.OooOOOO
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = AccountProtectionActivity.f24692OooOo0O;
                AccountProtectionActivity this$0 = this.f48736OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(Boolean.valueOf(z), o000000.f56592OooO0O0.getValue())) {
                    return;
                }
                h0.OooO0O0("105056");
                if (z) {
                    this$0.OooOoO(z);
                    return;
                }
                o000O o000o = new o000O(this$0);
                o000o.OooOoO(o0000.OooO0OO(o000OOo.account_close_protect_title));
                o000o.OooOOoo(o000OOo.account_close_protect_content);
                o000o.OooOOOO(o000OOo.account_close_protect_confirm);
                o000o.OooOo0(new Oooo0(this$0, z));
                o000o.OooOo0O(o000oOoO.f48776OooO0Oo);
                o000o.OooOO0o();
            }
        });
        o000000.f56592OooO0O0.observe(this, new OooO0OO(new OooOo(this)));
        int i = 0;
        LiveEventBus.get("TURN_ON_PROTECTION").observe(this, new p490o0o00O0.OooOO0(this, i));
        LiveEventBus.get("DELETE_DEVICE_SUCCESS").observe(this, new p490o0o00O0.OooOO0O(this, i));
        LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new p490o0o00O0.OooOOO0(this, i));
    }
}
