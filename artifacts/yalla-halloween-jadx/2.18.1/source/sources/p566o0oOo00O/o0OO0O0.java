package p566o0oOo00O;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p168o00Ooo0.oo000o;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO0O0 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f45325Oooo0o;

    public o0OO0O0(UserInfoEditActivity userInfoEditActivity) {
        this.f45325Oooo0o = userInfoEditActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@NotNull Editable s) {
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(s, "s");
        int length = s.toString().length();
        this.f45325Oooo0o.f23500Oooooo = !Intrinsics.areEqual(s.toString(), OooOOO.f41216OooO00o.OooOoO().getValue()) ? s.toString() : null;
        TextView textView = this.f45325Oooo0o.OooOooo().f50502OooOO0o;
        if (oo000o.OooO0o0()) {
            sb = new StringBuilder();
            sb.append("24/");
            sb.append(length);
        } else {
            sb = new StringBuilder();
            sb.append(length);
            sb.append("/24");
        }
        textView.setText(sb.toString());
        this.f45325Oooo0o.Oooo0o0();
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
