package p150o00Oo0Oo;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.app.base.framework.view.editTextSpan.EditTextSpan;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EditTextSpan f32177OooO00o;

    public OooOo00(InputConnection inputConnection, EditTextSpan editTextSpan) {
        super(inputConnection, true);
        this.f32177OooO00o = editTextSpan;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        if (i == 1 && i2 == 0) {
            return sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67));
        }
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67 || this.f32177OooO00o.getSpanManager() == null) {
            return super.sendKeyEvent(keyEvent);
        }
        int selectionStart = this.f32177OooO00o.getSelectionStart();
        OooOo oooOoOooO0o0 = this.f32177OooO00o.getSpanManager().OooO0o0(selectionStart, this.f32177OooO00o.getSelectionEnd());
        if (oooOoOooO0o0 == null) {
            this.f32177OooO00o.setSelected(false);
            return super.sendKeyEvent(keyEvent);
        }
        if (this.f32177OooO00o.isSelected() || selectionStart == oooOoOooO0o0.f32171Oooo) {
            this.f32177OooO00o.setSelected(false);
            return super.sendKeyEvent(keyEvent);
        }
        this.f32177OooO00o.setSelected(true);
        this.f32177OooO00o.getSpanManager().f32179OooO0O0 = oooOoOooO0o0;
        setSelection(oooOoOooO0o0.f32176OoooO00, oooOoOooO0o0.f32171Oooo);
        return super.sendKeyEvent(keyEvent);
    }
}
