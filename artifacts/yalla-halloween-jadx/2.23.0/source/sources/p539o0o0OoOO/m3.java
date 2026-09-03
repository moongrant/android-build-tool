package p539o0o0OoOO;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.ui.view.VerifyCodeView;

/* JADX INFO: loaded from: classes5.dex */
public final class m3 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VerifyCodeView f55599OooO0Oo;

    public m3(VerifyCodeView verifyCodeView) {
        this.f55599OooO0Oo = verifyCodeView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = VerifyCodeView.f30816OooOOO;
        VerifyCodeView verifyCodeView = this.f55599OooO0Oo;
        verifyCodeView.OooO0OO();
        VerifyCodeView.OooO00o(verifyCodeView);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
