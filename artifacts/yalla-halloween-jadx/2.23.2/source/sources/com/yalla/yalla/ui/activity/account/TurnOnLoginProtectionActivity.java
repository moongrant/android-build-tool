package com.yalla.yalla.ui.activity.account;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.mixedroom.o0ooOOo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.account.TurnOnLoginProtectionVM;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p379o0OOoOOO.oOO00O;
import p384o0OOoo0O.o000oOoO;
import p405o0Oo0OOO.o00O00O;
import p491o0o00O0o.o0OO0o;
import p491o0o00O0o.o0OO0o00;
import p491o0o00O0o.o0OO0oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/TurnOnLoginProtectionActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTurnOnLoginProtectionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TurnOnLoginProtectionActivity.kt\ncom/yalla/yalla/ui/activity/account/TurnOnLoginProtectionActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,99:1\n75#2,13:100\n22#3,2:113\n*S KotlinDebug\n*F\n+ 1 TurnOnLoginProtectionActivity.kt\ncom/yalla/yalla/ui/activity/account/TurnOnLoginProtectionActivity\n*L\n30#1:100,13\n31#1:113,2\n*E\n"})
public final class TurnOnLoginProtectionActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f24879OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public Pair<String, String> f24880OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24882OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TurnOnLoginProtectionVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.TurnOnLoginProtectionActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f24885OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24885OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final o000O0 f24881OooOo0 = new o000O0(Reflection.getOrCreateKotlinClass(o00O00O.class), this, null);

    public final o00O00O OooOo() {
        return (o00O00O) this.f24881OooOo0.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        Pair<String, String> pair = this.f24880OooOOoo;
        if (pair != null) {
            String first = pair.getFirst();
            String second = pair.getSecond();
            StringBuilder sb = new StringBuilder();
            sb.append((Object) first);
            sb.append((Object) second);
            SmsCodeActivity.OooO00o.OooO00o(this, sb.toString(), pair.getFirst(), ClientCodeType.TurnOnProtection, 0, null, 0, null, false, 496);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44282OooO00o);
        Window window = getWindow();
        if (window != null) {
            oOO00O.OooO0OO(window, 100);
        }
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            oOO00O.OooO0O0(headerLayout);
        }
        OooOOoo(o000000.account_turn_on_login_protection_title);
        OooOOo0(1);
        OooOo().f44283OooO0O0.setOnClickListener(this);
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        ((TurnOnLoginProtectionVM) this.f24882OooOo00.getValue()).getAccountBindInfo().observe(this, new o000oOoO(new o0OO0o00(this), new o0OO0o(this), new o0OO0oO0(this), false, 8));
        LiveEventBus.get("TURN_ON_PROTECTION").observe(this, new o0ooOOo(this, 1));
    }
}
