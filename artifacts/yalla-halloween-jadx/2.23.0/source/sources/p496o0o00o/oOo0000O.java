package p496o0o00o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.user.UserInfoEditBioActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00O0o;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0000O implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditBioActivity f49182OooO0Oo;

    public oOo0000O(UserInfoEditBioActivity userInfoEditBioActivity) {
        this.f49182OooO0Oo = userInfoEditBioActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@NotNull Editable s) {
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(s, "s");
        int length = s.toString().length();
        int i = UserInfoEditBioActivity.f27311OooOo;
        UserInfoEditBioActivity userInfoEditBioActivity = this.f49182OooO0Oo;
        TextView textView = userInfoEditBioActivity.OooOoO().f58147OooO0OO;
        if (OooO.OooO0o0()) {
            sb = new StringBuilder("60/");
            sb.append(length);
        } else {
            sb = new StringBuilder();
            sb.append(length);
            sb.append("/60");
        }
        textView.setText(sb.toString());
        userInfoEditBioActivity.f27315OooOo0O = StringsKt.trim((CharSequence) userInfoEditBioActivity.OooOoO().f58146OooO0O0.getText().toString()).toString();
        String str = userInfoEditBioActivity.f27316OooOo0o;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oldStringSign");
            str = null;
        }
        String str3 = userInfoEditBioActivity.f27315OooOo0O;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringSign");
        } else {
            str2 = str3;
        }
        if (Intrinsics.areEqual(str, str2)) {
            TextView textView2 = userInfoEditBioActivity.f27313OooOo0;
            if (textView2 != null) {
                textView2.setEnabled(false);
            }
            TextView textView3 = userInfoEditBioActivity.f27313OooOo0;
            if (textView3 != null) {
                textView3.setTextColor(o0000.OooO00o(oO00O0o.color_999999));
                return;
            }
            return;
        }
        TextView textView4 = userInfoEditBioActivity.f27313OooOo0;
        if (textView4 != null) {
            textView4.setEnabled(true);
        }
        TextView textView5 = userInfoEditBioActivity.f27313OooOo0;
        if (textView5 != null) {
            textView5.setTextColor(o0000.OooO00o(oO00O0o.color_00d8c9));
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
