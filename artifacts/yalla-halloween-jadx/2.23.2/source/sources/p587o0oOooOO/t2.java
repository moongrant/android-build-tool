package p587o0oOooOO;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.yalla.yalla.ui.view.VerifyCodeView;

/* JADX INFO: loaded from: classes4.dex */
public final class t2 implements View.OnTouchListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EditText f56989OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ VerifyCodeView f56990OooO0o0;

    public t2(VerifyCodeView verifyCodeView, EditText editText) {
        this.f56990OooO0o0 = verifyCodeView;
        this.f56989OooO0Oo = editText;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f56990OooO0o0.setInsertionDisabled(this.f56989OooO0Oo);
        return false;
    }
}
