package p506o0o00oOo;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p475o0Ooooo0.o0O00oO0;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50592OooO0Oo;

    public u(UserInfoEditActivity userInfoEditActivity) {
        this.f50592OooO0Oo = userInfoEditActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@NotNull Editable s) {
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(s, "s");
        int length = s.toString().length();
        String string = s.toString();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        String string2 = !Intrinsics.areEqual(string, o0O00oO0.OooOOoo().getValue()) ? s.toString() : null;
        UserInfoEditActivity userInfoEditActivity = this.f50592OooO0Oo;
        userInfoEditActivity.f26825OooOoO = string2;
        TextView textView = userInfoEditActivity.OooOoO().f45666OooOO0o;
        if (OooOo00.OooO0o0()) {
            sb = new StringBuilder("24/");
            sb.append(length);
        } else {
            sb = new StringBuilder();
            sb.append(length);
            sb.append("/24");
        }
        textView.setText(sb.toString());
        userInfoEditActivity.Oooo000();
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
