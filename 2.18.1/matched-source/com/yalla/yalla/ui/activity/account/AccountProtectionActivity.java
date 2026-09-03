package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.HeaderLayout;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.TrustedDevice;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.account.AccountProtectionVM;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0o0000.OooOOOO;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o00O0O;
import p142o00OOooO.o00Oo0;
import p143o00OOooo.o00OOO0;
import p143o00OOooo.o00OOOO0;
import p163o00OoOo.o00O00O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p478o0OooooO.oO0OoOO0;
import p518o0o0O00o.o000;
import p534o0o0OOo0.o00OO00O;
import p534o0o0OOo0.o00OO0O0;
import p534o0o0OOo0.o00OO0OO;
import p649o0ooOOoo.h6;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/AccountProtectionActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class AccountProtectionActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final /* synthetic */ int f21711OooooO0 = 0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f21712OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(h6.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21713Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountProtectionVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.AccountProtectionActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f21722Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21722Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<TrustedDevice> f21714Ooooo0o;

    public static final class OooO00o extends Lambda implements Function1<List<TrustedDevice>, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<TrustedDevice> list) {
            List<TrustedDevice> list2 = list;
            p188o00o00o0.OooO0OO<TrustedDevice> oooO0OO = AccountProtectionActivity.this.f21714Ooooo0o;
            if (oooO0OO == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO = null;
            }
            oooO0OO.setNewData(list2);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ApiResult<List<TrustedDevice>>, Unit> {
        public OooO0O0() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0043  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<TrustedDevice>> apiResult) {
            ApiResult<List<TrustedDevice>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            AccountProtectionActivity.this.OooOoO();
            if (it.isSuccess()) {
                List<TrustedDevice> data = it.getData();
                if ((data != null ? data.size() : 0) > 0) {
                    TextView textView = AccountProtectionActivity.this.OooOoo().f49521OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTrustedDevice");
                    oOO00O.OooO(textView);
                    RecyclerView recyclerView = AccountProtectionActivity.this.OooOoo().f49519OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvTrustedDevice");
                    oOO00O.OooO(recyclerView);
                } else {
                    TextView textView2 = AccountProtectionActivity.this.OooOoo().f49521OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvTrustedDevice");
                    oOO00O.OooO0O0(textView2);
                    RecyclerView recyclerView2 = AccountProtectionActivity.this.OooOoo().f49519OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.rvTrustedDevice");
                    oOO00O.OooO0O0(recyclerView2);
                }
            } else {
                TextView textView3 = AccountProtectionActivity.this.OooOoo().f49521OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTrustedDevice");
                oOO00O.OooO0O0(textView3);
                RecyclerView recyclerView3 = AccountProtectionActivity.this.OooOoo().f49519OooO0O0;
                Intrinsics.checkNotNullExpressionValue(recyclerView3, "binding.rvTrustedDevice");
                oOO00O.OooO0O0(recyclerView3);
            }
            p188o00o00o0.OooO0OO<TrustedDevice> oooO0OO = AccountProtectionActivity.this.f21714Ooooo0o;
            if (oooO0OO == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO = null;
            }
            oooO0OO.setLoadComplete(it.isSuccess());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f21718Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z) {
            super(1);
            this.f21718Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            AccountProtectionActivity accountProtectionActivity = AccountProtectionActivity.this;
            int i = AccountProtectionActivity.f21711OooooO0;
            accountProtectionActivity.OooOooo().getAccountPrivacy();
            ToastUtil.f12567OooO00o.OooO0O0(this.f21718Oooo0oO ? o000O0O0.OooO0OO(R.string.account_login_protection_turn_on_success) : o000O0O0.OooO0OO(R.string.account_login_protection_close_success));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiError, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError error = apiError;
            Intrinsics.checkNotNullParameter(error, "it");
            int code2 = error.getCode();
            if (code2 == 1065) {
                AccountProtectionActivity activity = AccountProtectionActivity.this;
                int i = AccountProtectionActivity.f21711OooooO0;
                Intrinsics.checkNotNullParameter(activity, "activity");
                activity.startActivity(new Intent(activity, (Class<?>) TurnOnLoginProtectionActivity.class));
                o000 o000Var = o000.f42171OooO00o;
                MutableLiveData<Pair<Boolean, Boolean>> mutableLiveData = o000.f42172OooO0O0;
                Boolean bool = Boolean.FALSE;
                mutableLiveData.postValue(new Pair<>(bool, bool));
            } else if (code2 != 1066) {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
            } else {
                AccountProtectionActivity accountProtectionActivity = AccountProtectionActivity.this;
                int i2 = AccountProtectionActivity.f21711OooooO0;
                oo0oOO0 oo0ooo0 = new oo0oOO0(accountProtectionActivity);
                oo0ooo0.OooOo0(R.string.account_login_protection_bind_phone);
                oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
                oo0ooo0.OooOOOo(R.string.account_login_protection_bind_phone_confirm);
                oo0ooo0.OooOo0o(new o00OO00O(accountProtectionActivity));
                oo0ooo0.OooOO0O(o00OO0O0.f43526Oooo0o);
                oo0ooo0.OooOOO0();
            }
            return Unit.INSTANCE;
        }
    }

    public final h6 OooOoo() {
        return (h6) this.f21712OoooOoo.getValue();
    }

    public final void OooOooO(boolean z) {
        if (z) {
            BaseActivityK.OooOoo0(this, null, 0L, 3, null);
            OooOooo().getTrustDeviceList().observe(this, new OooOo(new OooO00o(), null, new OooO0O0(), false, 10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AccountProtectionVM OooOooo() {
        return (AccountProtectionVM) this.f21713Ooooo00.getValue();
    }

    public final void Oooo000(boolean z) {
        OooOooo().switchUserDevice(z ? 1 : 0).observe(this, new OooOo(new OooO0OO(z), new OooO0o(), null, true, 4));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f49518OooO00o);
        Window window = getWindow();
        if (window != null) {
            oO0OoOO0.OooO0Oo(window, 100);
        }
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            oO0OoOO0.OooO0OO(headerLayout);
        }
        OooOo(R.string.account_login_protection);
        int i = 1;
        OooOo0O(1);
        o00OO0OO o00oo0oo = new o00OO0OO(this);
        this.f21714Ooooo0o = o00oo0oo;
        int i2 = 3;
        o00oo0oo.setOnItemClickListener(new o00Oo0(this, i2));
        OooOoo().f49519OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView = OooOoo().f49519OooO0O0;
        p188o00o00o0.OooO0OO<TrustedDevice> oooO0OO = this.f21714Ooooo0o;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        recyclerView.setAdapter(oooO0OO);
        OooOoo().f49520OooO0OO.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o0OOo0.o00OO000
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AccountProtectionActivity this$0 = this.f43524OooO00o;
                int i3 = AccountProtectionActivity.f21711OooooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o000 o000Var = o000.f42171OooO00o;
                Pair<Boolean, Boolean> value = o000.f42172OooO0O0.getValue();
                if (value != null && z == value.getFirst().booleanValue()) {
                    return;
                }
                o0O00000.OooO0OO("Me_account_authentication");
                if (z) {
                    this$0.Oooo000(z);
                    return;
                }
                oo0oOO0 oo0ooo0 = new oo0oOO0(this$0);
                oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.account_close_protect_title));
                oo0ooo0.OooOo0(R.string.account_close_protect_content);
                oo0ooo0.OooOOOo(R.string.account_close_protect_confirm);
                oo0ooo0.OooOo0o(new oo0O(this$0, z));
                oo0ooo0.OooOo(o00OO.f43523Oooo0o);
                oo0ooo0.OooOOO0();
            }
        });
        o000 o000Var = o000.f42171OooO00o;
        int i3 = 2;
        o000.f42172OooO0O0.observe(this, new o00OOO0(this, i3));
        LiveEventBus.get("TURN_ON_PROTECTION").observe(this, new o00OOOO0(this, i3));
        LiveEventBus.get("DELETE_DEVICE_SUCCESS").observe(this, new o00O00O(this, i));
        LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new o00O0O(this, i2));
    }
}
