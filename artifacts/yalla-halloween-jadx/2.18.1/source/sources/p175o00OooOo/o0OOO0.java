package p175o00OooOo;

import android.text.Editable;
import android.text.TextWatcher;
import com.app.base.view.VerifyCodeView;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VerifyCodeView f32748Oooo0o;

    public o0OOO0(VerifyCodeView verifyCodeView) {
        this.f32748Oooo0o = verifyCodeView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        VerifyCodeView verifyCodeView = this.f32748Oooo0o;
        int i = VerifyCodeView.f12141OoooOOO;
        verifyCodeView.OooO0OO();
        VerifyCodeView.OooO00o(this.f32748Oooo0o);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
