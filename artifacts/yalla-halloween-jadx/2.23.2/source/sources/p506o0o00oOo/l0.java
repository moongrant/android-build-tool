package p506o0o00oOo;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.user.UserInfoEditBioActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o0OOO0o;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditBioActivity f50424OooO0Oo;

    public l0(UserInfoEditBioActivity userInfoEditBioActivity) {
        this.f50424OooO0Oo = userInfoEditBioActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@NotNull Editable s) {
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(s, "s");
        int length = s.toString().length();
        int i = UserInfoEditBioActivity.f26846OooOo;
        UserInfoEditBioActivity userInfoEditBioActivity = this.f50424OooO0Oo;
        TextView textView = userInfoEditBioActivity.OooOoO().f45684OooO0OO;
        if (OooOo00.OooO0o0()) {
            sb = new StringBuilder("60/");
            sb.append(length);
        } else {
            sb = new StringBuilder();
            sb.append(length);
            sb.append("/60");
        }
        textView.setText(sb.toString());
        userInfoEditBioActivity.f26850OooOo0O = StringsKt.trim((CharSequence) userInfoEditBioActivity.OooOoO().f45683OooO0O0.getText().toString()).toString();
        String str = userInfoEditBioActivity.f26851OooOo0o;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oldStringSign");
            str = null;
        }
        String str3 = userInfoEditBioActivity.f26850OooOo0O;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringSign");
        } else {
            str2 = str3;
        }
        if (Intrinsics.areEqual(str, str2)) {
            TextView textView2 = userInfoEditBioActivity.f26848OooOo0;
            if (textView2 != null) {
                textView2.setEnabled(false);
            }
            TextView textView3 = userInfoEditBioActivity.f26848OooOo0;
            if (textView3 != null) {
                textView3.setTextColor(o0000.OooO00o(o0OOO0o.color_999999));
                return;
            }
            return;
        }
        TextView textView4 = userInfoEditBioActivity.f26848OooOo0;
        if (textView4 != null) {
            textView4.setEnabled(true);
        }
        TextView textView5 = userInfoEditBioActivity.f26848OooOo0;
        if (textView5 != null) {
            textView5.setTextColor(o0000.OooO00o(o0OOO0o.color_00d8c9));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s, "s");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s, "s");
    }
}
