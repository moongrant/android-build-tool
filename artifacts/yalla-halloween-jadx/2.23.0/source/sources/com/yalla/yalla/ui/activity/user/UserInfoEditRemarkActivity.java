package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
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
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.Serializable;
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
import p200o00o0o.o0ooOOo;
import p496o0o00o.oO0;
import p496o0o00o.oO0O000;
import p496o0o00o.oO0O000o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.da;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserInfoEditRemarkActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUserInfoEditRemarkActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoEditRemarkActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoEditRemarkActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,102:1\n22#2,2:103\n75#3,13:105\n49#4:118\n65#4,16:119\n93#4,3:135\n*S KotlinDebug\n*F\n+ 1 UserInfoEditRemarkActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoEditRemarkActivity\n*L\n28#1:103,2\n29#1:105,13\n64#1:118\n64#1:119,16\n64#1:135,3\n*E\n"})
public final class UserInfoEditRemarkActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f27323OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public UserInfoModel f27325OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public TextView f27327OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27324OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(da.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27326OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f27331OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27331OooO0Oo;
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
        public final /* synthetic */ Function1 f27328OooO0Oo;

        public OooO00o(oO0O000o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27328OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27328OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27328OooO0Oo;
        }

        public final int hashCode() {
            return this.f27328OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27328OooO0Oo.invoke(obj);
        }
    }

    public final da OooOo() {
        return (da) this.f27324OooOOoo.getValue();
    }

    public final void OooOoO0(CharSequence charSequence) {
        UserInfoModel userInfoModel = this.f27325OooOo0;
        if (userInfoModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfo");
            userInfoModel = null;
        }
        boolean z = true;
        boolean z2 = !Intrinsics.areEqual(userInfoModel.getMemoName(), charSequence != null ? charSequence.toString() : null);
        TextView textView = this.f27327OooOo0O;
        if (textView != null) {
            textView.setEnabled(z2);
        }
        TextView textView2 = this.f27327OooOo0O;
        if (textView2 != null) {
            textView2.setTextColor(o0000.OooO00o(z2 ? oO00O0o.color_white : oO00O0o.color_white_50));
        }
        OooOo().f57754OooO0o0.setText((charSequence != null ? charSequence.length() : 0) + "/24");
        ImageView imageView = OooOo().f57752OooO0OO;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        }
        imageView.setVisibility(z ? 4 : 0);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOo().f57752OooO0OO)) {
            OooOo().f57751OooO0O0.setText("");
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f57750OooO00o);
        Serializable serializableExtra = getIntent().getSerializableExtra("user");
        if (serializableExtra == null) {
            finish();
            return;
        }
        Intrinsics.checkNotNull(serializableExtra);
        this.f27325OooOo0 = (UserInfoModel) serializableExtra;
        OooOOoo(oO00OOo0.User_Edit_Remark_title);
        HeaderLayout headerLayout = this.f22755OooOO0;
        UserInfoModel userInfoModel = null;
        this.f27327OooOo0O = headerLayout != null ? headerLayout.OooOoO0(oO00OOo0.Save, new oO0O000(this)) : null;
        EditText editText = OooOo().f57751OooO0O0;
        UserInfoModel userInfoModel2 = this.f27325OooOo0;
        if (userInfoModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfo");
            userInfoModel2 = null;
        }
        editText.setText(userInfoModel2.getMemoName());
        EditText editText2 = OooOo().f57751OooO0O0;
        Intrinsics.checkNotNullExpressionValue(editText2, "binding.etText");
        editText2.addTextChangedListener(new oO0(this));
        TextView textView = OooOo().f57753OooO0Oo;
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.User_Edit_Remark_name);
        UserInfoModel userInfoModel3 = this.f27325OooOo0;
        if (userInfoModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfo");
            userInfoModel3 = null;
        }
        textView.setText(strOooO0OO + ZegoConstants.ZegoVideoDataAuxPublishingStream + userInfoModel3.getUserName());
        UserInfoModel userInfoModel4 = this.f27325OooOo0;
        if (userInfoModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfo");
            userInfoModel4 = null;
        }
        OooOoO0(userInfoModel4.getMemoName());
        OooOo().f57751OooO0O0.post(new o0ooOOo(this, 2));
        OooOo().f57752OooO0OO.setOnClickListener(this);
        EditText editText3 = OooOo().f57751OooO0O0;
        UserInfoModel userInfoModel5 = this.f27325OooOo0;
        if (userInfoModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfo");
        } else {
            userInfoModel = userInfoModel5;
        }
        editText3.setSelection(userInfoModel.getMemoName().length());
    }
}
