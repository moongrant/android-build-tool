package p496o0o00o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p464o0Oooo.o000000O;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00O0oO implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49140OooO0Oo;

    public oO00O0oO(UserInfoEditActivity userInfoEditActivity) {
        this.f49140OooO0Oo = userInfoEditActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@NotNull Editable s) {
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(s, "s");
        int length = s.toString().length();
        String string = s.toString();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        String string2 = !Intrinsics.areEqual(string, o000000O.OooOOoo().getValue()) ? s.toString() : null;
        UserInfoEditActivity userInfoEditActivity = this.f49140OooO0Oo;
        userInfoEditActivity.f27290OooOoO = string2;
        TextView textView = userInfoEditActivity.OooOoO().f58086OooOO0o;
        if (OooO.OooO0o0()) {
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
