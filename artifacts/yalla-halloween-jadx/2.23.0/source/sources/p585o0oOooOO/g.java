package p585o0oOooOO;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends InputConnectionWrapper {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EditTextSpan f56767OooO00o;

    public g(InputConnection inputConnection, EditTextSpan editTextSpan) {
        super(inputConnection, true);
        this.f56767OooO00o = editTextSpan;
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
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
            EditTextSpan editTextSpan = this.f56767OooO00o;
            if (editTextSpan.getSpanManager() != null) {
                int selectionStart = editTextSpan.getSelectionStart();
                h hVarOooO0Oo = editTextSpan.getSpanManager().OooO0Oo(selectionStart, editTextSpan.getSelectionEnd());
                if (hVarOooO0Oo == null) {
                    editTextSpan.setSelected(false);
                    return super.sendKeyEvent(keyEvent);
                }
                if (editTextSpan.isSelected() || selectionStart == hVarOooO0Oo.f56772OooO0oO) {
                    editTextSpan.setSelected(false);
                    return super.sendKeyEvent(keyEvent);
                }
                editTextSpan.setSelected(true);
                editTextSpan.getSpanManager().f56775OooO0O0 = hVarOooO0Oo;
                setSelection(hVarOooO0Oo.f56773OooO0oo, hVarOooO0Oo.f56772OooO0oO);
                return super.sendKeyEvent(keyEvent);
            }
        }
        return super.sendKeyEvent(keyEvent);
    }
}
