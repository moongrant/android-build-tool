package p557o0oOOooO;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnectionWrapper;
import com.yalla.support.emojifaceutil.EmojiEditText;
import com.yalla.yalla.ui.view.editTextSpan.MessageEditText;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O000 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MessageEditText f56169OooO00o;

    public oO0O000(EmojiEditText.OooO0O0 oooO0O0, MessageEditText messageEditText) {
        super(oooO0O0, true);
        this.f56169OooO00o = messageEditText;
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
            MessageEditText messageEditText = this.f56169OooO00o;
            if (messageEditText.getSpanManager() != null) {
                int selectionStart = messageEditText.getSelectionStart();
                oOo00ooO ooo00oooOooO0Oo = messageEditText.getSpanManager().OooO0Oo(selectionStart, messageEditText.getSelectionEnd());
                if (ooo00oooOooO0Oo == null) {
                    messageEditText.setSelected(false);
                    return super.sendKeyEvent(keyEvent);
                }
                if (messageEditText.isSelected() || selectionStart == ooo00oooOooO0Oo.f56183OooO0oO) {
                    messageEditText.setSelected(false);
                    return super.sendKeyEvent(keyEvent);
                }
                messageEditText.setSelected(true);
                messageEditText.getSpanManager().f56177OooO0O0 = ooo00oooOooO0Oo;
                setSelection(ooo00oooOooO0Oo.f56184OooO0oo, ooo00oooOooO0Oo.f56183OooO0oO);
                return super.sendKeyEvent(keyEvent);
            }
        }
        return super.sendKeyEvent(keyEvent);
    }
}
