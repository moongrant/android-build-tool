package com.yalla.yalla.ui.activity.user;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p405o0Oo0OOO.x1;
import p506o0o00oOo.k0;
import p506o0o00oOo.l0;
import p506o0o00oOo.m0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p590o0oOooo0.oOO0Oo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserInfoEditBioActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUserInfoEditBioActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoEditBioActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoEditBioActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,128:1\n22#2,2:129\n75#3,13:131\n*S KotlinDebug\n*F\n+ 1 UserInfoEditBioActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoEditBioActivity\n*L\n34#1:129,2\n35#1:131,13\n*E\n"})
public final class UserInfoEditBioActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f26846OooOo = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public TextView f26848OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public String f26850OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f26851OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26847OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(x1.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26849OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditBioActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditBioActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditBioActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26856OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26856OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            UserInfoEditBioActivity.OooOoO0(UserInfoEditBioActivity.this);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            UserInfoEditBioActivity.super.onBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOoO0(UserInfoEditBioActivity userInfoEditBioActivity) {
        UserInfoEditVM userInfoEditVM = (UserInfoEditVM) userInfoEditBioActivity.f26849OooOo00.getValue();
        String str = userInfoEditBioActivity.f26850OooOo0O;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringSign");
            str = null;
        }
        p384o0OOoo0O.o00O0O.OooO0Oo(UserInfoEditVM.userEdit$default(userInfoEditVM, null, null, null, null, null, str, null, null, 223, null), userInfoEditBioActivity, false, null, null, new m0(userInfoEditBioActivity), 14);
    }

    public final x1 OooOoO() {
        return (x1) this.f26847OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.f26850OooOo0O = StringsKt.trim((CharSequence) OooOoO().f45683OooO0O0.getText().toString()).toString();
        String str = this.f26851OooOo0o;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oldStringSign");
            str = null;
        }
        String str3 = this.f26850OooOo0O;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringSign");
        } else {
            str2 = str3;
        }
        if (Intrinsics.areEqual(str, str2)) {
            super.onBackPressed();
            return;
        }
        o000O o000o = new o000O(this);
        o000o.OooOOoo(o000000.UserInfoBio_ChangeBio_HintContent);
        o000o.OooOOOO(o000000.Save);
        o000o.OooOo0(new OooO00o());
        String string = getString(o000000.Discard);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        o000o.OooOo0o(string);
        o000o.OooOo0O(new OooO0O0());
        o000o.OooOO0o();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO().f45682OooO00o);
        String stringExtra = getIntent().getStringExtra("bio");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f26850OooOo0O = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("bio");
        this.f26851OooOo0o = stringExtra2 != null ? stringExtra2 : "";
        OooOOoo(o000000.Userinfo_edit_bio);
        OooOOo0(1);
        HeaderLayout headerLayout = this.f22282OooOO0;
        String str = null;
        TextView textViewOooOoO0 = headerLayout != null ? headerLayout.OooOoO0(o000000.Save, new k0(this)) : null;
        this.f26848OooOo0 = textViewOooOoO0;
        if (textViewOooOoO0 != null) {
            textViewOooOoO0.setTextColor(o0000.OooO00o(o0OOO0o.color_999999));
        }
        OooOoO().f45683OooO0O0.addTextChangedListener(new l0(this));
        EditText editText = OooOoO().f45683OooO0O0;
        String str2 = this.f26850OooOo0O;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringSign");
        } else {
            str = str2;
        }
        editText.setText(str);
        oOO0Oo00.OooO0Oo(OooOoO().f45683OooO0O0);
        EditText view = OooOoO().f45683OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "etText");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = p371o0OOo0oO.o0OOO0o.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
    }
}
