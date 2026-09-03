package p585o0oOooOO;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnectionWrapper;
import com.yalla.support.emojifaceutil.EmojiEditText;
import com.yalla.yalla.ui.view.editTextSpan.MessageEditText;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends InputConnectionWrapper {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MessageEditText f56780OooO00o;

    public n(EmojiEditText.OooO0O0 oooO0O0, MessageEditText messageEditText) {
        super(oooO0O0, true);
        this.f56780OooO00o = messageEditText;
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
            MessageEditText messageEditText = this.f56780OooO00o;
            if (messageEditText.getSpanManager() != null) {
                int selectionStart = messageEditText.getSelectionStart();
                h hVarOooO0Oo = messageEditText.getSpanManager().OooO0Oo(selectionStart, messageEditText.getSelectionEnd());
                if (hVarOooO0Oo == null) {
                    messageEditText.setSelected(false);
                    return super.sendKeyEvent(keyEvent);
                }
                if (messageEditText.isSelected() || selectionStart == hVarOooO0Oo.f56772OooO0oO) {
                    messageEditText.setSelected(false);
                    return super.sendKeyEvent(keyEvent);
                }
                messageEditText.setSelected(true);
                messageEditText.getSpanManager().f56775OooO0O0 = hVarOooO0Oo;
                setSelection(hVarOooO0Oo.f56773OooO0oo, hVarOooO0Oo.f56772OooO0oO);
                return super.sendKeyEvent(keyEvent);
            }
        }
        return super.sendKeyEvent(keyEvent);
    }
}
