package p175o00OooOo;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.app.base.view.VerifyCodeView;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0OO implements View.OnKeyListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VerifyCodeView f32750Oooo0o;

    public o0OOO0OO(VerifyCodeView verifyCodeView) {
        this.f32750Oooo0o = verifyCodeView;
    }

    @Override // android.view.View.OnKeyListener
    public final synchronized boolean onKey(View view, int i, KeyEvent keyEvent) {
        int currentAmount;
        if (i == 67) {
            try {
                if (keyEvent.getAction() == 0 && (currentAmount = this.f32750Oooo0o.getCurrentAmount()) > 0 && currentAmount < this.f32750Oooo0o.getChildCount()) {
                    ((EditText) this.f32750Oooo0o.getChildAt(currentAmount - 1)).setText("");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i == 66 && keyEvent.getAction() == 0) {
            VerifyCodeView.OooO00o(this.f32750Oooo0o);
        }
        return false;
    }
}
