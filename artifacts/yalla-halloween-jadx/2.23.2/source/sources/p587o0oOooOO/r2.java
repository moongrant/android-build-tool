package p587o0oOooOO;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.ui.view.VerifyCodeView;

/* JADX INFO: loaded from: classes4.dex */
public final class r2 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VerifyCodeView f56966OooO0Oo;

    public r2(VerifyCodeView verifyCodeView) {
        this.f56966OooO0Oo = verifyCodeView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = VerifyCodeView.f30271OooOOO;
        VerifyCodeView verifyCodeView = this.f56966OooO0Oo;
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
