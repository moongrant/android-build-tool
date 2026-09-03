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
import com.code.android.util.o000O0Oo;
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
import p157o00OoOO0.o0OO00O;
import p377o0OOoOo.o000O000;
import p496o0o00o.oOo0000O;
import p496o0o00o.oOo000Oo;
import p496o0o00o.oOo000o0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.ia;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserInfoEditBioActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUserInfoEditBioActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoEditBioActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoEditBioActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,128:1\n22#2,2:129\n75#3,13:131\n*S KotlinDebug\n*F\n+ 1 UserInfoEditBioActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoEditBioActivity\n*L\n34#1:129,2\n35#1:131,13\n*E\n"})
public final class UserInfoEditBioActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f27311OooOo = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public TextView f27313OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public String f27315OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f27316OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27312OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(ia.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27314OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditBioActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f27321OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27321OooO0Oo;
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
        UserInfoEditVM userInfoEditVM = (UserInfoEditVM) userInfoEditBioActivity.f27314OooOo00.getValue();
        String str = userInfoEditBioActivity.f27315OooOo0O;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringSign");
            str = null;
        }
        o000O000.OooO0Oo(UserInfoEditVM.userEdit$default(userInfoEditVM, null, null, null, null, null, str, null, null, 223, null), userInfoEditBioActivity, false, null, null, new oOo000o0(userInfoEditBioActivity), 14);
    }

    public final ia OooOoO() {
        return (ia) this.f27312OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.f27315OooOo0O = StringsKt.trim((CharSequence) OooOoO().f58146OooO0O0.getText().toString()).toString();
        String str = this.f27316OooOo0o;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oldStringSign");
            str = null;
        }
        String str3 = this.f27315OooOo0O;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringSign");
        } else {
            str2 = str3;
        }
        if (Intrinsics.areEqual(str, str2)) {
            super.onBackPressed();
            return;
        }
        o0OO00O o0oo00o2 = new o0OO00O(this);
        o0oo00o2.OooOOoo(oO00OOo0.UserInfoBio_ChangeBio_HintContent);
        o0oo00o2.OooOOOO(oO00OOo0.Save);
        o0oo00o2.OooOo0(new OooO00o());
        String string = getString(oO00OOo0.Discard);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.Discard)");
        o0oo00o2.OooOo0o(string);
        o0oo00o2.OooOo0O(new OooO0O0());
        o0oo00o2.OooOO0o();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO().f58145OooO00o);
        String stringExtra = getIntent().getStringExtra("bio");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f27315OooOo0O = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("bio");
        this.f27316OooOo0o = stringExtra2 != null ? stringExtra2 : "";
        OooOOoo(oO00OOo0.Userinfo_edit_bio);
        OooOOo0(1);
        HeaderLayout headerLayout = this.f22755OooOO0;
        String str = null;
        TextView textViewOooOoO0 = headerLayout != null ? headerLayout.OooOoO0(oO00OOo0.Save, new oOo000Oo(this)) : null;
        this.f27313OooOo0 = textViewOooOoO0;
        if (textViewOooOoO0 != null) {
            textViewOooOoO0.setTextColor(o0000.OooO00o(oO00O0o.color_999999));
        }
        OooOoO().f58146OooO0O0.addTextChangedListener(new oOo0000O(this));
        EditText editText = OooOoO().f58146OooO0O0;
        String str2 = this.f27315OooOo0O;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringSign");
        } else {
            str = str2;
        }
        editText.setText(str);
        com.android.billingclient.api.o000O000.OooO0OO(OooOoO().f58146OooO0O0);
        EditText view = OooOoO().f58146OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "binding.etText");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = p367o0OOo0o0.Oooo000.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
    }
}
