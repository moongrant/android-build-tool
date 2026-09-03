package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.api.old.ApiEvent;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.repository.AppConfigRepo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity;
import com.yalla.yalla.ui.vm.account.LoginVM;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p379o0OOoOOO.oOO00O;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p405o0Oo0OOO.o0O0ooO;
import p423o0OoO0OO.o00O0O0O;
import p491o0o00O0o.o00O;
import p491o0o00O0o.o00O0OO;
import p491o0o00O0o.o00O0OO0;
import p491o0o00O0o.o00O0OOO;
import p491o0o00O0o.o00OO000;
import p491o0o00O0o.oo0o0O0;
import p491o0o00O0o.oo0oOO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.oo000o;
import p583o0oOoo00.o000000O;
import p650o0ooo.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/LoginOnRoomDialogActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoginOnRoomDialogActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginOnRoomDialogActivity.kt\ncom/yalla/yalla/ui/activity/account/LoginOnRoomDialogActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,164:1\n22#2,2:165\n75#3,13:167\n*S KotlinDebug\n*F\n+ 1 LoginOnRoomDialogActivity.kt\ncom/yalla/yalla/ui/activity/account/LoginOnRoomDialogActivity\n*L\n37#1:165,2\n39#1:167,13\n*E\n"})
public final class LoginOnRoomDialogActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f24738OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24739OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o0O0ooO.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f24741OooOo00 = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24740OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(LoginVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f24747OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24747OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO00o extends Lambda implements Function0<OpenAuthManager> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OpenAuthManager invoke() {
            return new OpenAuthManager(LoginOnRoomDialogActivity.this);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Boolean, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            Intrinsics.checkNotNull(bool2);
            boolean zBooleanValue = bool2.booleanValue();
            LoginOnRoomDialogActivity fragmentActivity = LoginOnRoomDialogActivity.this;
            if (zBooleanValue) {
                int i = o000000.facebook_update_dialog_login_Content;
                Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
                o000O o000o = new o000O(fragmentActivity);
                o000o.OooOoO0(o000000.facebook_update_dialog_Title);
                o000o.OooOOoo(i);
                o000o.OooOo(true);
                o000o.OooOOOO(o000000.facebook_update_dialog_Update);
                o000o.OooOo0(o0O00o0.f58639OooO0Oo);
                o000o.OooOO0o();
            } else {
                int i2 = LoginOnRoomDialogActivity.f24738OooOo0O;
                ((OpenAuthManager) fragmentActivity.f24741OooOo00.getValue()).OooO00o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f24744OooO0Oo;

        public OooO0OO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24744OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f24744OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24744OooO0Oo;
        }

        public final int hashCode() {
            return this.f24744OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24744OooO0Oo.invoke(obj);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity
    public final void OooOOo() {
    }

    public final o0O0ooO OooOo() {
        return (o0O0ooO) this.f24739OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(oo000o.anim_empty, oo000o.alpha_out);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((OpenAuthManager) this.f24741OooOo00.getValue()).OooO0oO(i, i2, intent);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOo().f44550OooO0Oo) ? true : Intrinsics.areEqual(view, OooOo().f44547OooO00o)) {
            o0oo0000.OooO00o.OooO0O0("102177");
            finish();
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f44548OooO0O0)) {
            o0oo0000.OooO00o.OooO0O0("102175");
            o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
            ApiEvent.OooO0OO(2);
            AppConfigRepo.f24292OooO00o.getClass();
            AppConfigRepo.f24293OooO0O0.observe(this, new OooO0OO(new OooO0O0()));
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f44549OooO0OO)) {
            o0oo0000.OooO00o.OooO0O0("102176");
            o00oO0o o00oo0o3 = o0OO00O.f43462OooO00o;
            ApiEvent.OooO0OO(1);
            ClientCodeType clientCodeType = ClientCodeType.Login;
            p604o0oo0O0.Oooo000 startForResultManagerCallback = new p604o0oo0O0.Oooo000() { // from class: o0o00O0o.o00O0O0O
                @Override // p604o0oo0O0.Oooo000
                public final void onActivityResult(int i, Intent intent) {
                    int i2 = LoginOnRoomDialogActivity.f24738OooOo0O;
                    LoginOnRoomDialogActivity this$0 = this.f48979OooO00o;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.finish();
                }
            };
            Intrinsics.checkNotNullParameter(startForResultManagerCallback, "startForResultManagerCallback");
            Bundle bundle = new Bundle();
            bundle.putString("PHONE_NUMBER", null);
            bundle.putSerializable("TYPE_ACCOUNT", clientCodeType);
            p604o0oo0O0.OooOo oooOo = new p604o0oo0O0.OooOo(this);
            oooOo.OooO00o(bundle);
            oooOo.f57388OooO0O0 = PhoneNumberActivity.class;
            oooOo.OooO0O0(startForResultManagerCallback);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44547OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        oOO00O.OooO0OO(window, 0);
        OooOo().f44550OooO0Oo.setOnClickListener(this);
        OooOo().f44547OooO00o.setOnClickListener(this);
        OooOo().f44548OooO0O0.setOnClickListener(this);
        OooOo().f44549OooO0OO.setOnClickListener(this);
        TextView tvTermsService = OooOo().f44551OooO0o0;
        Intrinsics.checkNotNullExpressionValue(tvTermsService, "tvTermsService");
        int i = o000000.terms_service;
        o00O0O0O.OooO00o(tvTermsService, o0000.OooO0OO(i), new o00O0OOO(this));
        TextView tvTermsService2 = OooOo().f44551OooO0o0;
        Intrinsics.checkNotNullExpressionValue(tvTermsService2, "tvTermsService");
        int i2 = o000000.privacy_policy;
        o00O0O0O.OooO00o(tvTermsService2, o0000.OooO0OO(i2), new oo0oOO0(this));
        TextView tvTermsService3 = OooOo().f44551OooO0o0;
        Intrinsics.checkNotNullExpressionValue(tvTermsService3, "tvTermsService");
        o00O0O0O.OooO0Oo(tvTermsService3, o0000.OooO00o(o0OOO0o.color_e9a711), o0000.OooO0OO(i), o0000.OooO0OO(i2));
        o000000O.OooO00o();
        o000000O.f56636OooO00o.observe(this, new OooO0OO(new o00O(this)));
        o000000O.f56641OooO0o0.observe(this, new OooO0OO(new o00OO000(this)));
        Lazy lazy = this.f24741OooOo00;
        ((OpenAuthManager) lazy.getValue()).f24267OooO0O0 = new o00O0OO0(this);
        ((OpenAuthManager) lazy.getValue()).f24269OooO0Oo = new oo0o0O0(this);
        ((OpenAuthManager) lazy.getValue()).f24268OooO0OO = new o00O0OO(this);
    }
}
