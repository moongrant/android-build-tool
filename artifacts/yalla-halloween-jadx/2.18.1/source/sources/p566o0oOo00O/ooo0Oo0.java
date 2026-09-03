package p566o0oOo00O;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ooo0Oo0 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditRemarkActivity f45404Oooo0o;

    public ooo0Oo0(UserInfoEditRemarkActivity userInfoEditRemarkActivity) {
        this.f45404Oooo0o = userInfoEditRemarkActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        UserInfoEditRemarkActivity userInfoEditRemarkActivity = this.f45404Oooo0o;
        UserInfoEditRemarkActivity.OooO00o oooO00o = UserInfoEditRemarkActivity.f23529OooooOO;
        userInfoEditRemarkActivity.OooOooO(charSequence);
    }
}
