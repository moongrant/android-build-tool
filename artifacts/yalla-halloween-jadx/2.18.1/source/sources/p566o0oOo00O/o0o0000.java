package p566o0oOo00O;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.user.UserInfoEditBioActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0o0000 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditBioActivity f45338Oooo0o;

    public o0o0000(UserInfoEditBioActivity userInfoEditBioActivity) {
        this.f45338Oooo0o = userInfoEditBioActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@NotNull Editable s) {
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(s, "s");
        int length = s.toString().length();
        UserInfoEditBioActivity userInfoEditBioActivity = this.f45338Oooo0o;
        UserInfoEditBioActivity.OooO00o oooO00o = UserInfoEditBioActivity.f23522OooooOO;
        TextView textView = userInfoEditBioActivity.OooOooo().f50622OooO0OO;
        if (oo000o.OooO0o0()) {
            sb = new StringBuilder();
            sb.append("60/");
            sb.append(length);
        } else {
            sb = new StringBuilder();
            sb.append(length);
            sb.append("/60");
        }
        textView.setText(sb.toString());
        UserInfoEditBioActivity userInfoEditBioActivity2 = this.f45338Oooo0o;
        userInfoEditBioActivity2.f23525Ooooo0o = StringsKt.trim((CharSequence) userInfoEditBioActivity2.OooOooo().f50621OooO0O0.getText().toString()).toString();
        String str = userInfoEditBioActivity2.f23526OooooO0;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oldStringSign");
            str = null;
        }
        String str3 = userInfoEditBioActivity2.f23525Ooooo0o;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringSign");
        } else {
            str2 = str3;
        }
        if (Intrinsics.areEqual(str, str2)) {
            TextView textView2 = userInfoEditBioActivity2.f23524Ooooo00;
            if (textView2 != null) {
                textView2.setEnabled(false);
            }
            TextView textView3 = userInfoEditBioActivity2.f23524Ooooo00;
            if (textView3 != null) {
                textView3.setTextColor(o000O0O0.OooO00o(R.color.color_999999));
                return;
            }
            return;
        }
        TextView textView4 = userInfoEditBioActivity2.f23524Ooooo00;
        if (textView4 != null) {
            textView4.setEnabled(true);
        }
        TextView textView5 = userInfoEditBioActivity2.f23524Ooooo00;
        if (textView5 != null) {
            textView5.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
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
