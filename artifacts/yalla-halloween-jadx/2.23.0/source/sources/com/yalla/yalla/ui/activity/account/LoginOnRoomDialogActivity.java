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
import com.code.android.util.o000O0Oo;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.api.old.ApiEvent;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity;
import com.yalla.yalla.ui.vm.account.LoginVM;
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
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p402o0Oo0OOO.o00O0000;
import p417o0OoO0.o000O0o;
import p474o0o00.o00;
import p474o0o00.o000O;
import p474o0o00.o000OO00;
import p474o0o00.o000OOo0;
import p474o0o00.o0O0ooO;
import p584o0oOooO0.oO000o00;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p599o0oo00oo.o0000O;
import p599o0oo00oo.o000OO;
import p641o0ooOOOO.y;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/LoginOnRoomDialogActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLoginOnRoomDialogActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginOnRoomDialogActivity.kt\ncom/yalla/yalla/ui/activity/account/LoginOnRoomDialogActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,156:1\n22#2,2:157\n75#3,13:159\n*S KotlinDebug\n*F\n+ 1 LoginOnRoomDialogActivity.kt\ncom/yalla/yalla/ui/activity/account/LoginOnRoomDialogActivity\n*L\n35#1:157,2\n37#1:159,13\n*E\n"})
public final class LoginOnRoomDialogActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f25197OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25198OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(y.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f25200OooOo00 = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25199OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(LoginVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25205OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25205OooO0Oo;
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

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25202OooO0Oo;

        public OooO0O0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25202OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25202OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25202OooO0Oo;
        }

        public final int hashCode() {
            return this.f25202OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25202OooO0Oo.invoke(obj);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity
    public final void OooOOo() {
    }

    public final y OooOo() {
        return (y) this.f25198OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(oO000o00.anim_empty, oO000o00.alpha_out);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((OpenAuthManager) this.f25200OooOo00.getValue()).OooO0oO(i, i2, intent);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOo().f59363OooO0Oo) ? true : Intrinsics.areEqual(view, OooOo().f59360OooO00o)) {
            o0OO000.OooO00o("102177");
            finish();
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f59361OooO0O0)) {
            o0OO000.OooO00o("102175");
            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
            ApiEvent.OooO0OO(2);
            ((OpenAuthManager) this.f25200OooOo00.getValue()).OooO00o();
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f59362OooO0OO)) {
            o0OO000.OooO00o("102176");
            o000O00O o000o00o3 = o000O0O0.f44226OooO00o;
            ApiEvent.OooO0OO(1);
            ClientCodeType clientCodeType = ClientCodeType.Login;
            o0000O startForResultManagerCallback = new o0000O() { // from class: o0o00.o000O0Oo
                @Override // p599o0oo00oo.o0000O
                public final void onActivityResult(int i, Intent intent) {
                    int i2 = LoginOnRoomDialogActivity.f25197OooOo0O;
                    LoginOnRoomDialogActivity this$0 = this.f47248OooO00o;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.finish();
                }
            };
            Intrinsics.checkNotNullParameter(startForResultManagerCallback, "startForResultManagerCallback");
            Bundle bundle = new Bundle();
            bundle.putString("PHONE_NUMBER", null);
            bundle.putSerializable("TYPE_ACCOUNT", clientCodeType);
            o000OO o000oo2 = new o000OO(this);
            o000oo2.OooO00o(bundle);
            o000oo2.f56864OooO0O0 = PhoneNumberActivity.class;
            o000oo2.OooO0O0(startForResultManagerCallback);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f59360OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        p370o0OOoO.OooOOO0.OooO0OO(window, 0);
        OooOo().f59363OooO0Oo.setOnClickListener(this);
        OooOo().f59360OooO00o.setOnClickListener(this);
        OooOo().f59361OooO0O0.setOnClickListener(this);
        OooOo().f59362OooO0OO.setOnClickListener(this);
        TextView textView = OooOo().f59364OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTermsService");
        int i = oO00OOo0.terms_service;
        o000O0o.OooO00o(textView, o0000.OooO0OO(i), new o000OOo0(this));
        TextView textView2 = OooOo().f59364OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvTermsService");
        int i2 = oO00OOo0.privacy_policy;
        o000O0o.OooO00o(textView2, o0000.OooO0OO(i2), new o00(this));
        TextView textView3 = OooOo().f59364OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTermsService");
        o000O0o.OooO0Oo(textView3, o0000.OooO00o(oO00O0o.color_e9a711), o0000.OooO0OO(i), o0000.OooO0OO(i2));
        o00O0000.OooO00o();
        o00O0000.f44476OooO00o.observe(this, new OooO0O0(new p474o0o00.o00O0000(this)));
        o00O0000.f44481OooO0o0.observe(this, new OooO0O0(new o0O0ooO(this)));
        Lazy lazy = this.f25200OooOo00;
        ((OpenAuthManager) lazy.getValue()).f24730OooO0O0 = new p474o0o00.o000O0O0(this);
        ((OpenAuthManager) lazy.getValue()).f24732OooO0Oo = new o000O(this);
        ((OpenAuthManager) lazy.getValue()).f24731OooO0OO = new o000OO00(this);
    }
}
