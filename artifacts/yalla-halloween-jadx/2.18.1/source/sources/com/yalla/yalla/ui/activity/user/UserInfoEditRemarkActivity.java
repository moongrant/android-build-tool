package com.yalla.yalla.ui.activity.user;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p566o0oOo00O.o;
import p566o0oOo00O.o0oo0000;
import p566o0oOo00O.ooo0Oo0;
import p649o0ooOOoo.nh;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserInfoEditRemarkActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserInfoEditRemarkActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23529OooooOO = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23530OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(nh.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23531Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23536Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23536Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public UserInfoModel f23532Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public TextView f23533OooooO0;

    public static final class OooO00o {
        public final void OooO00o(@NotNull Context context, @NotNull UserInfoModel userInfo) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            Intent intent = new Intent(context, (Class<?>) UserInfoEditRemarkActivity.class);
            intent.putExtra("user", userInfo);
            context.startActivity(intent);
        }
    }

    public final nh OooOoo() {
        return (nh) this.f23530OoooOoo.getValue();
    }

    public final void OooOooO(CharSequence charSequence) {
        UserInfoModel userInfoModel = this.f23532Ooooo0o;
        if (userInfoModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfo");
            userInfoModel = null;
        }
        boolean z = true;
        boolean z2 = !Intrinsics.areEqual(userInfoModel.getMemoName(), charSequence != null ? charSequence.toString() : null);
        TextView textView = this.f23533OooooO0;
        if (textView != null) {
            textView.setEnabled(z2);
        }
        TextView textView2 = this.f23533OooooO0;
        if (textView2 != null) {
            textView2.setTextColor(o000O0O0.OooO00o(z2 ? R.color.color_white : R.color.color_white_50));
        }
        TextView textView3 = OooOoo().f50127OooO0o0;
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence != null ? charSequence.length() : 0);
        sb.append("/24");
        textView3.setText(sb.toString());
        ImageView imageView = OooOoo().f50125OooO0OO;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        }
        imageView.setVisibility(z ? 4 : 0);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoo().f50125OooO0OO)) {
            OooOoo().f50124OooO0O0.setText("");
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50123OooO00o);
        Serializable serializableExtra = getIntent().getSerializableExtra("user");
        if (serializableExtra == null) {
            finish();
            return;
        }
        Intrinsics.checkNotNull(serializableExtra);
        this.f23532Ooooo0o = (UserInfoModel) serializableExtra;
        OooOo(R.string.User_Edit_Remark_title);
        HeaderLayout headerLayout = this.f11463OoooO;
        UserInfoModel userInfoModel = null;
        this.f23533OooooO0 = headerLayout != null ? headerLayout.OooOoo0(R.string.Save, new o(this)) : null;
        EditText editText = OooOoo().f50124OooO0O0;
        UserInfoModel userInfoModel2 = this.f23532Ooooo0o;
        if (userInfoModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfo");
            userInfoModel2 = null;
        }
        editText.setText(userInfoModel2.getMemoName());
        EditText editText2 = OooOoo().f50124OooO0O0;
        Intrinsics.checkNotNullExpressionValue(editText2, "binding.etText");
        editText2.addTextChangedListener(new ooo0Oo0(this));
        TextView textView = OooOoo().f50126OooO0Oo;
        StringBuilder sb = new StringBuilder();
        sb.append(o000O0O0.OooO0OO(R.string.User_Edit_Remark_name));
        sb.append(' ');
        UserInfoModel userInfoModel3 = this.f23532Ooooo0o;
        if (userInfoModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfo");
            userInfoModel3 = null;
        }
        sb.append(userInfoModel3.getUserName());
        textView.setText(sb.toString());
        UserInfoModel userInfoModel4 = this.f23532Ooooo0o;
        if (userInfoModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfo");
            userInfoModel4 = null;
        }
        OooOooO(userInfoModel4.getMemoName());
        OooOoo().f50124OooO0O0.post(new o0oo0000(this, 0));
        OooOoo().f50125OooO0OO.setOnClickListener(this);
        EditText editText3 = OooOoo().f50124OooO0O0;
        UserInfoModel userInfoModel5 = this.f23532Ooooo0o;
        if (userInfoModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfo");
        } else {
            userInfoModel = userInfoModel5;
        }
        editText3.setSelection(userInfoModel.getMemoName().length());
    }
}
