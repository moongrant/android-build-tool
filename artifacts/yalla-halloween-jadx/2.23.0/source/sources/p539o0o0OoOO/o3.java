package p539o0o0OoOO;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.yalla.yalla.ui.view.VerifyCodeView;

/* JADX INFO: loaded from: classes5.dex */
public final class o3 implements View.OnTouchListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EditText f55609OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ VerifyCodeView f55610OooO0o0;

    public o3(VerifyCodeView verifyCodeView, EditText editText) {
        this.f55610OooO0o0 = verifyCodeView;
        this.f55609OooO0Oo = editText;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f55610OooO0o0.setInsertionDisabled(this.f55609OooO0Oo);
        return false;
    }
}
