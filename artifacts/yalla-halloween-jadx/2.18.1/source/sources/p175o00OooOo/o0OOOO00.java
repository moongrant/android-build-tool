package p175o00OooOo;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.app.base.view.VerifyCodeView;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOOO00 implements View.OnTouchListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EditText f32751Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ VerifyCodeView f32752Oooo0oO;

    public o0OOOO00(VerifyCodeView verifyCodeView, EditText editText) {
        this.f32752Oooo0oO = verifyCodeView;
        this.f32751Oooo0o = editText;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f32752Oooo0oO.setInsertionDisabled(this.f32751Oooo0o);
        return false;
    }
}
