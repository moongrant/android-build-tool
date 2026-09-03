package com.yalla.yalla.ui.activity.user;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o0000;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p255o00ooO0o.oo0oOO0;
import p516o0o0O000.o000oOoO;
import p566o0oOo00O.o0OOo000;
import p566o0oOo00O.o0o0000;
import p566o0oOo00O.oO0Oo;
import p649o0ooOOoo.sh;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserInfoEditBioActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserInfoEditBioActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23522OooooOO = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23523OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(sh.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public TextView f23524Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public String f23525Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public String f23526OooooO0;

    public static final class OooO00o {
        @JvmStatic
        public final void OooO00o(@NotNull Context context, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) UserInfoEditBioActivity.class);
            intent.putExtra("bio", str);
            context.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            UserInfoEditBioActivity.OooOooO(UserInfoEditBioActivity.this);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            UserInfoEditBioActivity.super.onBackPressed();
            return Unit.INSTANCE;
        }
    }

    public static final void OooOooO(UserInfoEditBioActivity userInfoEditBioActivity) {
        Objects.requireNonNull(userInfoEditBioActivity);
        HashMap map = new HashMap();
        String str = userInfoEditBioActivity.f23525Ooooo0o;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringSign");
            str = null;
        }
        String strOooO0O0 = o000oOoO.OooO0O0(str);
        Intrinsics.checkNotNullExpressionValue(strOooO0O0, "utf8ToUnicode(stringSign)");
        map.put("sign", strOooO0O0);
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        o00000OO.f32209OooO0OO.OooO0O0(userInfoEditBioActivity, map, new oO0Oo(userInfoEditBioActivity, userInfoEditBioActivity));
    }

    public final sh OooOooo() {
        return (sh) this.f23523OoooOoo.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.f23525Ooooo0o = StringsKt.trim((CharSequence) OooOooo().f50621OooO0O0.getText().toString()).toString();
        String str = this.f23526OooooO0;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oldStringSign");
            str = null;
        }
        String str3 = this.f23525Ooooo0o;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringSign");
        } else {
            str2 = str3;
        }
        if (Intrinsics.areEqual(str, str2)) {
            super.onBackPressed();
            return;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(this);
        oo0ooo0.OooOo0(R.string.UserInfoBio_ChangeBio_HintContent);
        oo0ooo0.OooOOOo(R.string.Save);
        oo0ooo0.OooOo0o(new OooO0O0());
        String string = getString(R.string.Discard);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.Discard)");
        oo0ooo0.OooOoO0(string);
        oo0ooo0.OooOo(new OooO0OO());
        oo0ooo0.OooOOO0();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooo().f50620OooO00o);
        String stringExtra = getIntent().getStringExtra("bio");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f23525Ooooo0o = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("bio");
        this.f23526OooooO0 = stringExtra2 != null ? stringExtra2 : "";
        OooOo(R.string.Userinfo_edit_bio);
        OooOo0O(1);
        HeaderLayout headerLayout = this.f11463OoooO;
        String str = null;
        TextView textViewOooOoo0 = headerLayout != null ? headerLayout.OooOoo0(R.string.Save, new o0OOo000(this)) : null;
        this.f23524Ooooo00 = textViewOooOoo0;
        if (textViewOooOoo0 != null) {
            textViewOooOoo0.setTextColor(o000O0O0.OooO00o(R.color.color_999999));
        }
        OooOooo().f50621OooO0O0.addTextChangedListener(new o0o0000(this));
        EditText editText = OooOooo().f50621OooO0O0;
        String str2 = this.f23525Ooooo0o;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringSign");
        } else {
            str = str2;
        }
        editText.setText(str);
        o0000.OooOO0(OooOooo().f50621OooO0O0);
        EditText editText2 = OooOooo().f50621OooO0O0;
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        inputMethodManager.showSoftInput(editText2, 2);
        inputMethodManager.toggleSoftInput(2, 1);
    }
}
