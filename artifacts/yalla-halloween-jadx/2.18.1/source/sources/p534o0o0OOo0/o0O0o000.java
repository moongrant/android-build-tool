package p534o0o0OOo0;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0o000 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f43562Oooo0o;

    public o0O0o000(PasswordActivity passwordActivity) {
        this.f43562Oooo0o = passwordActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        PasswordActivity passwordActivity = this.f43562Oooo0o;
        PasswordActivity.OooO00o oooO00o = PasswordActivity.f21781OoooooO;
        String string = StringsKt.trim((CharSequence) passwordActivity.OooOooO().f49908OooO0OO.getText().toString()).toString();
        this.f43562Oooo0o.OooOooO().f49907OooO0O0.setEnabled(OooO0OO.OooO0O0(string) && string.length() >= 6 && string.length() <= 24);
        if (OooO0OO.OooO0O0(string)) {
            this.f43562Oooo0o.OooOooO().f49909OooO0Oo.setVisibility(0);
            this.f43562Oooo0o.OooOooO().f49909OooO0Oo.setClickable(true);
        } else {
            this.f43562Oooo0o.OooOooO().f49909OooO0Oo.setClickable(false);
            this.f43562Oooo0o.OooOooO().f49909OooO0Oo.setVisibility(4);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
