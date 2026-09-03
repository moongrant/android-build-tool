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
import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.account.AccountVM;
import java.io.Serializable;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o000O0O0.o00000O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p508o0o00oOo.o000OO00;
import p534o0o0OOo0.o00OOO0O;
import p534o0o0OOo0.o00OOOO0;
import p534o0o0OOo0.o00OOOOo;
import p534o0o0OOo0.o00Oo00;
import p534o0o0OOo0.o0O00o0;
import p534o0o0OOo0.o0o0Oo;
import p534o0o0OOo0.o0oOO;
import p534o0o0OOo0.o0oOOo;
import p534o0o0OOo0.oo00oO;
import p649o0ooOOoo.j6;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/DeleteAccountCheckActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class DeleteAccountCheckActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f21734Oooooo0 = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f21735OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(j6.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21736Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f21743Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21743Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public AccountBindInfo f21737Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public ImageView f21738OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public OpenAuthManager f21739OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public o000OO00 f21740OooooOo;

    public static final class OooO00o {
    }

    public final j6 OooOoo() {
        return (j6) this.f21735OoooOoo.getValue();
    }

    public final void OooOooO(ImageView imageView) {
        if (Intrinsics.areEqual(imageView, this.f21738OooooO0)) {
            imageView.setImageResource(R.drawable.icon_delete_account_select);
            OooOoo().f49718OooOO0o.setEnabled(false);
            imageView = null;
        } else {
            imageView.setImageResource(R.drawable.icon_delete_account_select1);
            ImageView imageView2 = this.f21738OooooO0;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.icon_delete_account_select);
            }
            OooOoo().f49718OooOO0o.setEnabled(true);
        }
        this.f21738OooooO0 = imageView;
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        OpenAuthManager openAuthManager = this.f21739OooooOO;
        if (openAuthManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            openAuthManager = null;
        }
        openAuthManager.OooO0oO(i, i2, intent);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f49708OooO00o);
        OpenAuthManager openAuthManager = new OpenAuthManager(this);
        this.f21739OooooOO = openAuthManager;
        openAuthManager.f21648OooO0O0 = new o00Oo00(this);
        OpenAuthManager openAuthManager2 = this.f21739OooooOO;
        o000OO00 o000oo01 = null;
        if (openAuthManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            openAuthManager2 = null;
        }
        openAuthManager2.f21650OooO0Oo = new o0oOO(this);
        OpenAuthManager openAuthManager3 = this.f21739OooooOO;
        if (openAuthManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            openAuthManager3 = null;
        }
        openAuthManager3.f21649OooO0OO = new o0O00o0(this);
        o000OO00.OooO00o oooO00o = new o000OO00.OooO00o();
        oooO00o.f41870OooO00o = OooOo00.OooO00o(6.0f);
        oooO00o.f41871OooO0O0 = OooOOO.OooO00o(R.color.color_alpha_26);
        oooO00o.f41872OooO0OO = OooOo00.OooO00o(4.0f);
        this.f21740OooooOo = new o000OO00(oooO00o.f41873OooO0Oo, oooO00o.f41870OooO00o, oooO00o.f41871OooO0O0, oooO00o.f41872OooO0OO);
        OooOo(R.string.delete_account);
        OooOo0O(1);
        Serializable serializableExtra = getIntent().getSerializableExtra("LOGIN_PLATFORM_DATA");
        if (serializableExtra instanceof AccountBindInfo) {
            this.f21737Ooooo0o = (AccountBindInfo) serializableExtra;
        }
        AccountBindInfo accountBindInfo = this.f21737Ooooo0o;
        if (accountBindInfo == null) {
            return;
        }
        int i = 0;
        OooOoo().f49718OooOO0o.setEnabled(false);
        if ((accountBindInfo.getIsFb().length() > 0) && !Intrinsics.areEqual(accountBindInfo.getIsFb(), AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            ConstraintLayout constraintLayout = OooOoo().f49709OooO0O0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.flCheckFacebook");
            oOO00O.OooO(constraintLayout);
            OooOoo().f49709OooO0O0.setLayerType(1, null);
            ConstraintLayout constraintLayout2 = OooOoo().f49709OooO0O0;
            o000OO00 o000oo02 = this.f21740OooooOo;
            if (o000oo02 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("drawable");
                o000oo02 = null;
            }
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOo0(constraintLayout2, o000oo02);
            OooOoo().f49720OooOOO0.setText(accountBindInfo.getAccount(4));
            OooOoo().f49709OooO0O0.setOnClickListener(new o00OOO0O(this, i));
        }
        if ((accountBindInfo.getIsYc().length() > 0) && !Intrinsics.areEqual(accountBindInfo.getIsYc(), AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            ConstraintLayout constraintLayout3 = OooOoo().f49713OooO0o0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.flCheckYallaChat");
            oOO00O.OooO(constraintLayout3);
            OooOoo().f49713OooO0o0.setLayerType(1, null);
            ConstraintLayout constraintLayout4 = OooOoo().f49713OooO0o0;
            o000OO00 o000oo03 = this.f21740OooooOo;
            if (o000oo03 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("drawable");
                o000oo03 = null;
            }
            WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOo0(constraintLayout4, o000oo03);
            OooOoo().f49722OooOOOo.setText(accountBindInfo.getAccount(12));
            OooOoo().f49713OooO0o0.setOnClickListener(new o0o0Oo(this, i));
        }
        if ((accountBindInfo.getIsTt().length() > 0) && !Intrinsics.areEqual(accountBindInfo.getIsTt(), AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            ConstraintLayout constraintLayout5 = OooOoo().f49710OooO0OO;
            Intrinsics.checkNotNullExpressionValue(constraintLayout5, "binding.flCheckTwitter");
            oOO00O.OooO(constraintLayout5);
            OooOoo().f49710OooO0OO.setLayerType(1, null);
            ConstraintLayout constraintLayout6 = OooOoo().f49710OooO0OO;
            o000OO00 o000oo04 = this.f21740OooooOo;
            if (o000oo04 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("drawable");
                o000oo04 = null;
            }
            WeakHashMap<View, o00000O> weakHashMap3 = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOo0(constraintLayout6, o000oo04);
            OooOoo().f49719OooOOO.setText(accountBindInfo.getAccount(9));
            OooOoo().f49710OooO0OO.setOnClickListener(new o00OOOOo(this, 0));
        }
        if ((accountBindInfo.getIsWx().length() > 0) && !Intrinsics.areEqual(accountBindInfo.getIsWx(), AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            ConstraintLayout constraintLayout7 = OooOoo().f49711OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout7, "binding.flCheckWeChat");
            oOO00O.OooO(constraintLayout7);
            OooOoo().f49711OooO0Oo.setLayerType(1, null);
            ConstraintLayout constraintLayout8 = OooOoo().f49711OooO0Oo;
            o000OO00 o000oo05 = this.f21740OooooOo;
            if (o000oo05 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("drawable");
            } else {
                o000oo01 = o000oo05;
            }
            WeakHashMap<View, o00000O> weakHashMap4 = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOo0(constraintLayout8, o000oo01);
            OooOoo().f49721OooOOOO.setText(accountBindInfo.getAccount(5));
            OooOoo().f49711OooO0Oo.setOnClickListener(new o00OOOO0(this, 0));
        }
        StateButton stateButton = OooOoo().f49718OooOO0o;
        Intrinsics.checkNotNullExpressionValue(stateButton, "binding.tvDeleteAccountNext");
        oOO00O.OooO0oO(stateButton, new oo00oO(this));
        TextView textView = OooOoo().f49717OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvCancel");
        oOO00O.OooO0oO(textView, new o0oOOo(this));
    }
}
