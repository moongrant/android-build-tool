package p534o0o0OOo0;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0O0 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f43576Oooo0o;

    public o0OO0O0(PhoneNumberActivity phoneNumberActivity) {
        this.f43576Oooo0o = phoneNumberActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        PhoneNumberActivity phoneNumberActivity = this.f43576Oooo0o;
        PhoneNumberActivity.OooO00o oooO00o = PhoneNumberActivity.f21819OooooOO;
        phoneNumberActivity.Oooo000();
    }
}
