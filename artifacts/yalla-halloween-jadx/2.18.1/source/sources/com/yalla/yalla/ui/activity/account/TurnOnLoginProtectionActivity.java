package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.account.TurnOnLoginProtectionVM;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00O000o;
import p478o0OooooO.oO0OoOO0;
import p501o0o00o.o0000O;
import p534o0o0OOo0.oO0Oo0oo;
import p534o0o0OOo0.oO0o0o;
import p649o0ooOOoo.t6;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/TurnOnLoginProtectionActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TurnOnLoginProtectionActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final /* synthetic */ int f21879OooooO0 = 0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public Pair<String, String> f21880OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21881Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TurnOnLoginProtectionVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.TurnOnLoginProtectionActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.TurnOnLoginProtectionActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.TurnOnLoginProtectionActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f21885Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21885Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final o00O000o f21882Ooooo0o = new o00O000o(Reflection.getOrCreateKotlinClass(t6.class), this, null);

    public final t6 OooOoo() {
        return (t6) this.f21882Ooooo0o.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        Pair<String, String> pair = this.f21880OoooOoo;
        if (pair != null) {
            String str = pair.getFirst() + pair.getSecond();
            String first = pair.getFirst();
            ClientCodeType clientCodeType = ClientCodeType.TurnOnProtection;
            int i = (112 & 16) != 0 ? -1 : 0;
            Intrinsics.checkNotNullParameter(this, "context");
            Intent intent = new Intent(this, (Class<?>) SmsCodeActivity.class);
            intent.putExtra("PHONE_NUMBER", str);
            intent.putExtra("COUNTRY_AREA_CODE", first);
            intent.putExtra("TYPE_ACCOUNT", clientCodeType);
            intent.putExtra("TYPE_UNBIND", i);
            intent.putExtra("DELETE_REASON_TYPE", (Parcelable) null);
            intent.putExtra("IS_ACTIVATE", 0);
            startActivity(intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50629OooO00o);
        Window window = getWindow();
        if (window != null) {
            oO0OoOO0.OooO0Oo(window, 100);
        }
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            oO0OoOO0.OooO0OO(headerLayout);
        }
        OooOo(R.string.account_turn_on_login_protection_title);
        OooOo0O(1);
        OooOoo().f50630OooO0O0.setOnClickListener(this);
        BaseActivityK.OooOoo0(this, null, 0L, 3, null);
        ((TurnOnLoginProtectionVM) this.f21881Ooooo00.getValue()).getAccountBindInfo().observe(this, new OooOo(new oO0o0o(this), new p534o0o0OOo0.oO0OoOO0(this), new oO0Oo0oo(this), false, 8));
        LiveEventBus.get("TURN_ON_PROTECTION").observe(this, new o0000O(this, 2));
    }
}
