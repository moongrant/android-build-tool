package p557o0oOOooO;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00o0o extends InputConnectionWrapper {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EditTextSpan f56178OooO00o;

    public oOo00o0o(InputConnection inputConnection, EditTextSpan editTextSpan) {
        super(inputConnection, true);
        this.f56178OooO00o = editTextSpan;
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
            EditTextSpan editTextSpan = this.f56178OooO00o;
            if (editTextSpan.getSpanManager() != null) {
                int selectionStart = editTextSpan.getSelectionStart();
                oOo00ooO ooo00oooOooO0Oo = editTextSpan.getSpanManager().OooO0Oo(selectionStart, editTextSpan.getSelectionEnd());
                if (ooo00oooOooO0Oo == null) {
                    editTextSpan.setSelected(false);
                    return super.sendKeyEvent(keyEvent);
                }
                if (editTextSpan.isSelected() || selectionStart == ooo00oooOooO0Oo.f56183OooO0oO) {
                    editTextSpan.setSelected(false);
                    return super.sendKeyEvent(keyEvent);
                }
                editTextSpan.setSelected(true);
                editTextSpan.getSpanManager().f56177OooO0O0 = ooo00oooOooO0Oo;
                setSelection(ooo00oooOooO0Oo.f56184OooO0oo, ooo00oooOooO0Oo.f56183OooO0oO);
                return super.sendKeyEvent(keyEvent);
            }
        }
        return super.sendKeyEvent(keyEvent);
    }
}
