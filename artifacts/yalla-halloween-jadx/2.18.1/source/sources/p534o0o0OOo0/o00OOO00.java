package p534o0o0OOo0;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.ui.activity.account.ChangePasswordActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO00 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ChangePasswordActivity f43528Oooo0o;

    public o00OOO00(ChangePasswordActivity changePasswordActivity) {
        this.f43528Oooo0o = changePasswordActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@NotNull Editable s) {
        Intrinsics.checkNotNullParameter(s, "s");
        ChangePasswordActivity.OooOoo(this.f43528Oooo0o);
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
