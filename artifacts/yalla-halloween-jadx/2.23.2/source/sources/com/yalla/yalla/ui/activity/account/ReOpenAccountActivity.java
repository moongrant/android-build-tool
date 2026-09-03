package com.yalla.yalla.ui.activity.account;

import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.model.LoginModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiError1069;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.account.LoginVM;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p379o0OOoOOO.oOO00O;
import p384o0OOoo0O.o000oOoO;
import p405o0Oo0OOO.o00O00;
import p491o0o00O0o.o0oO0Ooo;
import p562o0oOo000.o000000;
import p590o0oOooo0.O0000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/ReOpenAccountActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nReOpenAccountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReOpenAccountActivity.kt\ncom/yalla/yalla/ui/activity/account/ReOpenAccountActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,101:1\n22#2,2:102\n75#3,13:104\n*S KotlinDebug\n*F\n+ 1 ReOpenAccountActivity.kt\ncom/yalla/yalla/ui/activity/account/ReOpenAccountActivity\n*L\n36#1:102,2\n37#1:104,13\n*E\n"})
public final class ReOpenAccountActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f24833OooOo0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24834OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o00O00.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24835OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(LoginVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.ReOpenAccountActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.ReOpenAccountActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.ReOpenAccountActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f24841OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24841OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO00o extends Lambda implements Function1<LoginModel, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LoginModel loginModel) {
            String strOooO0OO = o0000.OooO0OO(o000000.account_active_account);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            ReOpenAccountActivity.this.finish();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ApiError, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError error = apiError;
            Intrinsics.checkNotNullParameter(error, "it");
            int i = ReOpenAccountActivity.f24833OooOo0;
            ReOpenAccountActivity reOpenAccountActivity = ReOpenAccountActivity.this;
            reOpenAccountActivity.getClass();
            if (error.getCode() == 1069) {
                try {
                    Function2<? super String, ? super Throwable, Unit> function2 = com.code.android.json.OooO00o.f13206OooO00o;
                    ApiError1069 apiError1069 = (ApiError1069) com.code.android.json.OooO00o.OooO0OO(ApiError1069.class, error.getMessage());
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) String.valueOf(apiError1069 != null ? apiError1069.getData() : null), new String[]{","}, false, 0, 6, (Object) null);
                    if ((!listSplit$default.isEmpty()) && (!StringsKt.isBlank((CharSequence) listSplit$default.get(0)))) {
                        int i2 = SmsCodeActivity.f24843Oooo0;
                        SmsCodeActivity.OooO00o.OooO00o(reOpenAccountActivity, (String) listSplit$default.get(0), (String) listSplit$default.get(1), ClientCodeType.LoginVerification, 0, null, 1, null, false, 432);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p381o0OOoOo0.Oooo000(error, null), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiResult<LoginModel>, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<LoginModel> apiResult) {
            ApiResult<LoginModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            ReOpenAccountActivity.this.OooOo0();
            return Unit.INSTANCE;
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity
    public final boolean OooOOOo() {
        return false;
    }

    public final o00O00 OooOo() {
        return (o00O00) this.f24834OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOo().f44256OooO0O0)) {
            o0oo0000.OooO00o.OooO0O0("101055");
            BaseActivityK.OooOo0o(this, null, 0L, 3);
            ((LoginVM) this.f24835OooOo00.getValue()).activeAccount().observe(this, new o000oOoO(new OooO00o(), new OooO0O0(), new OooO0OO(), false, 8));
        } else if (Intrinsics.areEqual(view, OooOo().f44257OooO0OO)) {
            O0000000.OooO0O0(this);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44255OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        oOO00O.OooO0OO(window, 51);
        LiveEventBus.get("LOGIN_RESULT").observe(this, new o0oO0Ooo(this, 0));
        OooOo().f44256OooO0O0.setOnClickListener(this);
        OooOo().f44257OooO0OO.setOnClickListener(this);
    }
}
