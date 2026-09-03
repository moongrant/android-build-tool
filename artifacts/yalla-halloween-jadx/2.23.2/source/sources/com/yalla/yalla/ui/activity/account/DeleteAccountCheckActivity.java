package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.code.android.util.o000O0;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import com.yalla.yalla.ui.vm.account.AccountVM;
import java.io.Serializable;
import java.util.WeakHashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o000OO00;
import p491o0o00O0o.o000;
import p491o0o00O0o.o0000O;
import p491o0o00O0o.o0000O0;
import p491o0o00O0o.o0000O0O;
import p491o0o00O0o.o0000OO0;
import p491o0o00O0o.o000OO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p587o0oOooOO.z1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/DeleteAccountCheckActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDeleteAccountCheckActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeleteAccountCheckActivity.kt\ncom/yalla/yalla/ui/activity/account/DeleteAccountCheckActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,219:1\n22#2,2:220\n75#3,13:222\n*S KotlinDebug\n*F\n+ 1 DeleteAccountCheckActivity.kt\ncom/yalla/yalla/ui/activity/account/DeleteAccountCheckActivity\n*L\n40#1:220,2\n41#1:222,13\n*E\n"})
public final class DeleteAccountCheckActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f24708OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public z1 f24710OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public AccountBindInfo f24711OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public ImageView f24713OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OpenAuthManager f24714OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24709OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o000OO00.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24712OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f24718OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24718OooO0Oo;
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
        public final /* synthetic */ Function1 f24715OooO0Oo;

        public OooO00o(o0000O0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24715OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f24715OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24715OooO0Oo;
        }

        public final int hashCode() {
            return this.f24715OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24715OooO0Oo.invoke(obj);
        }
    }

    public final o000OO00 OooOo() {
        return (o000OO00) this.f24709OooOOoo.getValue();
    }

    public final void OooOoO0(ImageView imageView) {
        if (Intrinsics.areEqual(imageView, this.f24713OooOo0O)) {
            imageView.setImageResource(o0Oo0oo.icon_delete_account_select);
            OooOo().f44231OooOO0O.setEnabled(false);
            imageView = null;
        } else {
            imageView.setImageResource(o0Oo0oo.icon_delete_account_select1);
            ImageView imageView2 = this.f24713OooOo0O;
            if (imageView2 != null) {
                imageView2.setImageResource(o0Oo0oo.icon_delete_account_select);
            }
            OooOo().f44231OooOO0O.setEnabled(true);
        }
        this.f24713OooOo0O = imageView;
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        OpenAuthManager openAuthManager = this.f24714OooOo0o;
        if (openAuthManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            openAuthManager = null;
        }
        openAuthManager.OooO0oO(i, i2, intent);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44222OooO00o);
        OpenAuthManager openAuthManager = new OpenAuthManager(this);
        this.f24714OooOo0o = openAuthManager;
        openAuthManager.f24267OooO0O0 = new o0000O0O(this);
        OpenAuthManager openAuthManager2 = this.f24714OooOo0o;
        z1 z1Var = null;
        if (openAuthManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            openAuthManager2 = null;
        }
        openAuthManager2.f24269OooO0Oo = new o000OO(this);
        OpenAuthManager openAuthManager3 = this.f24714OooOo0o;
        if (openAuthManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            openAuthManager3 = null;
        }
        openAuthManager3.f24268OooO0OO = new o0000O(this);
        z1.OooO00o oooO00o = new z1.OooO00o();
        oooO00o.f57068OooO00o = com.code.android.util.o0000O0.OooO00o(6);
        oooO00o.f57069OooO0O0 = o0000.OooO00o(o0OOO0o.color_alpha_26);
        oooO00o.f57070OooO0OO = com.code.android.util.o0000O0.OooO00o(4);
        this.f24710OooOo = new z1(oooO00o.f57071OooO0Oo, oooO00o.f57068OooO00o, oooO00o.f57069OooO0O0, oooO00o.f57070OooO0OO);
        OooOOoo(o000000.delete_account);
        OooOOo0(1);
        Serializable serializableExtra = getIntent().getSerializableExtra("LOGIN_PLATFORM_DATA");
        if (serializableExtra instanceof AccountBindInfo) {
            this.f24711OooOo0 = (AccountBindInfo) serializableExtra;
        }
        AccountBindInfo accountBindInfo = this.f24711OooOo0;
        if (accountBindInfo == null) {
            return;
        }
        OooOo().f44231OooOO0O.setEnabled(false);
        if ((accountBindInfo.getIsFb().length() > 0) && !Intrinsics.areEqual(accountBindInfo.getIsFb(), AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            ConstraintLayout flCheckFacebook = OooOo().f44223OooO0O0;
            Intrinsics.checkNotNullExpressionValue(flCheckFacebook, "flCheckFacebook");
            o000O.OooOOOO(flCheckFacebook);
            OooOo().f44223OooO0O0.setLayerType(1, null);
            ConstraintLayout constraintLayout = OooOo().f44223OooO0O0;
            z1 z1Var2 = this.f24710OooOo;
            if (z1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("drawable");
                z1Var2 = null;
            }
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOOo0(constraintLayout, z1Var2);
            OooOo().f44232OooOO0o.setText(accountBindInfo.getAccount(4));
            OooOo().f44223OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0o00O0o.o0000
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = DeleteAccountCheckActivity.f24708OooOoO0;
                    DeleteAccountCheckActivity this$0 = this.f48935OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    ImageView ivSelectFacebook = this$0.OooOo().f44227OooO0o0;
                    Intrinsics.checkNotNullExpressionValue(ivSelectFacebook, "ivSelectFacebook");
                    this$0.OooOoO0(ivSelectFacebook);
                }
            });
        }
        if ((accountBindInfo.getIsYc().length() > 0) && !Intrinsics.areEqual(accountBindInfo.getIsYc(), AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            ConstraintLayout flCheckYallaChat = OooOo().f44225OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(flCheckYallaChat, "flCheckYallaChat");
            o000O.OooOOOO(flCheckYallaChat);
            OooOo().f44225OooO0Oo.setLayerType(1, null);
            ConstraintLayout constraintLayout2 = OooOo().f44225OooO0Oo;
            z1 z1Var3 = this.f24710OooOo;
            if (z1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("drawable");
                z1Var3 = null;
            }
            WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOOo0(constraintLayout2, z1Var3);
            OooOo().f44233OooOOO.setText(accountBindInfo.getAccount(12));
            OooOo().f44225OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: o0o00O0o.o0000O00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = DeleteAccountCheckActivity.f24708OooOoO0;
                    DeleteAccountCheckActivity this$0 = this.f48944OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    ImageView ivSelectYallaChat = this$0.OooOo().f44221OooO;
                    Intrinsics.checkNotNullExpressionValue(ivSelectYallaChat, "ivSelectYallaChat");
                    this$0.OooOoO0(ivSelectYallaChat);
                }
            });
        }
        if ((accountBindInfo.getIsTt().length() > 0) && !Intrinsics.areEqual(accountBindInfo.getIsTt(), AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            ConstraintLayout flCheckTwitter = OooOo().f44224OooO0OO;
            Intrinsics.checkNotNullExpressionValue(flCheckTwitter, "flCheckTwitter");
            o000O.OooOOOO(flCheckTwitter);
            OooOo().f44224OooO0OO.setLayerType(1, null);
            ConstraintLayout constraintLayout3 = OooOo().f44224OooO0OO;
            z1 z1Var4 = this.f24710OooOo;
            if (z1Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("drawable");
            } else {
                z1Var = z1Var4;
            }
            WeakHashMap<View, o000OOo0> weakHashMap3 = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOOo0(constraintLayout3, z1Var);
            OooOo().f44234OooOOO0.setText(accountBindInfo.getAccount(9));
            OooOo().f44224OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0o00O0o.o0000oo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = DeleteAccountCheckActivity.f24708OooOoO0;
                    DeleteAccountCheckActivity this$0 = this.f48949OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    ImageView ivSelectTwitter = this$0.OooOo().f44228OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(ivSelectTwitter, "ivSelectTwitter");
                    this$0.OooOoO0(ivSelectTwitter);
                }
            });
        }
        StateButton tvDeleteAccountNext = OooOo().f44231OooOO0O;
        Intrinsics.checkNotNullExpressionValue(tvDeleteAccountNext, "tvDeleteAccountNext");
        o000O.OooO(tvDeleteAccountNext, new o0000OO0(this));
        TextView tvCancel = OooOo().f44230OooOO0;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        o000O.OooO(tvCancel, new o000(this));
    }
}
