package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import com.yalla.yalla.ui.vm.account.AccountVM;
import java.io.Serializable;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p474o0o00.o00Oo0;
import p474o0o00.o00Ooo;
import p474o0o00.o00oO0o;
import p474o0o00.o0ooOOo;
import p474o0o00.oo000o;
import p539o0o0OoOO.v2;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.u;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/DeleteAccountCheckActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeleteAccountCheckActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeleteAccountCheckActivity.kt\ncom/yalla/yalla/ui/activity/account/DeleteAccountCheckActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,197:1\n22#2,2:198\n75#3,13:200\n*S KotlinDebug\n*F\n+ 1 DeleteAccountCheckActivity.kt\ncom/yalla/yalla/ui/activity/account/DeleteAccountCheckActivity\n*L\n38#1:198,2\n39#1:200,13\n*E\n"})
public final class DeleteAccountCheckActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f25168OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public v2 f25170OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public AccountBindInfo f25171OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public ImageView f25173OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OpenAuthManager f25174OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25169OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(u.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25172OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25177OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25177OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public final u OooOo() {
        return (u) this.f25169OooOOoo.getValue();
    }

    public final void OooOoO0(ImageView imageView) {
        if (Intrinsics.areEqual(imageView, this.f25173OooOo0O)) {
            imageView.setImageResource(oOo00OO0.icon_delete_account_select);
            OooOo().f58915OooOO0O.setEnabled(false);
            imageView = null;
        } else {
            imageView.setImageResource(oOo00OO0.icon_delete_account_select1);
            ImageView imageView2 = this.f25173OooOo0O;
            if (imageView2 != null) {
                imageView2.setImageResource(oOo00OO0.icon_delete_account_select);
            }
            OooOo().f58915OooOO0O.setEnabled(true);
        }
        this.f25173OooOo0O = imageView;
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        OpenAuthManager openAuthManager = this.f25174OooOo0o;
        if (openAuthManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            openAuthManager = null;
        }
        openAuthManager.OooO0oO(i, i2, intent);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f58906OooO00o);
        OpenAuthManager openAuthManager = new OpenAuthManager(this);
        this.f25174OooOo0o = openAuthManager;
        openAuthManager.f24730OooO0O0 = new o00Oo0(this);
        OpenAuthManager openAuthManager2 = this.f25174OooOo0o;
        v2 v2Var = null;
        if (openAuthManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            openAuthManager2 = null;
        }
        openAuthManager2.f24732OooO0Oo = new o00Ooo(this);
        OpenAuthManager openAuthManager3 = this.f25174OooOo0o;
        if (openAuthManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            openAuthManager3 = null;
        }
        openAuthManager3.f24731OooO0OO = new oo000o(this);
        v2.OooO00o oooO00o = new v2.OooO00o();
        oooO00o.f55731OooO00o = o0000O0.OooO00o(6);
        oooO00o.f55732OooO0O0 = o0000.OooO00o(oO00O0o.color_alpha_26);
        oooO00o.f55733OooO0OO = o0000O0.OooO00o(4);
        this.f25170OooOo = new v2(oooO00o.f55734OooO0Oo, oooO00o.f55731OooO00o, oooO00o.f55732OooO0O0, oooO00o.f55733OooO0OO);
        OooOOoo(oO00OOo0.delete_account);
        OooOOo0(1);
        Serializable serializableExtra = getIntent().getSerializableExtra("LOGIN_PLATFORM_DATA");
        if (serializableExtra instanceof AccountBindInfo) {
            this.f25171OooOo0 = (AccountBindInfo) serializableExtra;
        }
        AccountBindInfo accountBindInfo = this.f25171OooOo0;
        if (accountBindInfo == null) {
            return;
        }
        OooOo().f58915OooOO0O.setEnabled(false);
        if ((accountBindInfo.getIsFb().length() > 0) && !Intrinsics.areEqual(accountBindInfo.getIsFb(), AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            ConstraintLayout constraintLayout = OooOo().f58907OooO0O0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.flCheckFacebook");
            o000OO00.OooOOOO(constraintLayout);
            OooOo().f58907OooO0O0.setLayerType(1, null);
            ConstraintLayout constraintLayout2 = OooOo().f58907OooO0O0;
            v2 v2Var2 = this.f25170OooOo;
            if (v2Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("drawable");
                v2Var2 = null;
            }
            WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOOo0(constraintLayout2, v2Var2);
            OooOo().f58916OooOO0o.setText(accountBindInfo.getAccount(4));
            OooOo().f58907OooO0O0.setOnClickListener(new com.google.android.material.search.OooOo00(this, 1));
        }
        if ((accountBindInfo.getIsYc().length() > 0) && !Intrinsics.areEqual(accountBindInfo.getIsYc(), AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            ConstraintLayout constraintLayout3 = OooOo().f58909OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.flCheckYallaChat");
            o000OO00.OooOOOO(constraintLayout3);
            OooOo().f58909OooO0Oo.setLayerType(1, null);
            ConstraintLayout constraintLayout4 = OooOo().f58909OooO0Oo;
            v2 v2Var3 = this.f25170OooOo;
            if (v2Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("drawable");
                v2Var3 = null;
            }
            WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOOo0(constraintLayout4, v2Var3);
            OooOo().f58917OooOOO.setText(accountBindInfo.getAccount(12));
            OooOo().f58909OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: o0o00.o0OoOo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = DeleteAccountCheckActivity.f25168OooOoO0;
                    DeleteAccountCheckActivity this$0 = this.f47337OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    ImageView imageView = this$0.OooOo().f58905OooO;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivSelectYallaChat");
                    this$0.OooOoO0(imageView);
                }
            });
        }
        if ((accountBindInfo.getIsTt().length() > 0) && !Intrinsics.areEqual(accountBindInfo.getIsTt(), AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            ConstraintLayout constraintLayout5 = OooOo().f58908OooO0OO;
            Intrinsics.checkNotNullExpressionValue(constraintLayout5, "binding.flCheckTwitter");
            o000OO00.OooOOOO(constraintLayout5);
            OooOo().f58908OooO0OO.setLayerType(1, null);
            ConstraintLayout constraintLayout6 = OooOo().f58908OooO0OO;
            v2 v2Var4 = this.f25170OooOo;
            if (v2Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("drawable");
            } else {
                v2Var = v2Var4;
            }
            WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap3 = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOOo0(constraintLayout6, v2Var);
            OooOo().f58918OooOOO0.setText(accountBindInfo.getAccount(9));
            OooOo().f58908OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0o00.o00O0O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = DeleteAccountCheckActivity.f25168OooOoO0;
                    DeleteAccountCheckActivity this$0 = this.f47266OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    ImageView imageView = this$0.OooOo().f58912OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivSelectTwitter");
                    this$0.OooOoO0(imageView);
                }
            });
        }
        StateButton stateButton = OooOo().f58915OooOO0O;
        Intrinsics.checkNotNullExpressionValue(stateButton, "binding.tvDeleteAccountNext");
        o000OO00.OooO(stateButton, new o00oO0o(this));
        TextView textView = OooOo().f58914OooOO0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvCancel");
        o000OO00.OooO(textView, new o0ooOOo(this));
    }
}
