package p474o0o00;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.ui.activity.account.ChangePasswordActivity;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ChangePasswordActivity f47221OooO0Oo;

    public Oooo0(ChangePasswordActivity changePasswordActivity) {
        this.f47221OooO0Oo = changePasswordActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@NotNull Editable s) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(s, "s");
        ChangePasswordActivity.OooOo(this.f47221OooO0Oo);
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
