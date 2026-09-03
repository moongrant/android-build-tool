package p539o0o0OoOO;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.yalla.yalla.ui.view.VerifyCodeView;

/* JADX INFO: loaded from: classes5.dex */
public final class n3 implements View.OnKeyListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VerifyCodeView f55604OooO0Oo;

    public n3(VerifyCodeView verifyCodeView) {
        this.f55604OooO0Oo = verifyCodeView;
    }

    @Override // android.view.View.OnKeyListener
    public final synchronized boolean onKey(View view, int i, KeyEvent keyEvent) {
        int currentAmount;
        if (i == 67) {
            try {
                if (keyEvent.getAction() == 0 && (currentAmount = this.f55604OooO0Oo.getCurrentAmount()) > 0 && currentAmount < this.f55604OooO0Oo.getChildCount()) {
                    ((EditText) this.f55604OooO0Oo.getChildAt(currentAmount - 1)).setText("");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i == 66 && keyEvent.getAction() == 0) {
            VerifyCodeView.OooO00o(this.f55604OooO0Oo);
        }
        return false;
    }
}
