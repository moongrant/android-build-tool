package p061o0000o0O;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o0O0O00 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final EditText f34269OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO00o f34270OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f34271OooO0o0 = false;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f34272OooO0oO = true;

    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class OooO00o extends EmojiCompat.OooOO0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final WeakReference f34273OooO0Oo;

        public OooO00o(EditText editText) {
            this.f34273OooO0Oo = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.EmojiCompat.OooOO0
        public final void onInitialized() {
            Handler handler;
            super.onInitialized();
            EditText editText = (EditText) this.f34273OooO0Oo.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0O0O00.OooO00o((EditText) this.f34273OooO0Oo.get(), 1);
        }
    }

    public o0O0O00(EditText editText) {
        this.f34269OooO0Oo = editText;
    }

    public static void OooO00o(@Nullable EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat.OooO00o().OooO0oo(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f34269OooO0Oo;
        if (editText.isInEditMode()) {
            return;
        }
        if (!((this.f34272OooO0oO && (this.f34271OooO0o0 || EmojiCompat.OooO0OO())) ? false : true) && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iOooO0O0 = EmojiCompat.OooO00o().OooO0O0();
            if (iOooO0O0 != 0) {
                if (iOooO0O0 == 1) {
                    EmojiCompat.OooO00o().OooO0oO(i, i3 + i, (Spannable) charSequence);
                    return;
                } else if (iOooO0O0 != 3) {
                    return;
                }
            }
            EmojiCompat emojiCompatOooO00o = EmojiCompat.OooO00o();
            if (this.f34270OooO0o == null) {
                this.f34270OooO0o = new OooO00o(editText);
            }
            emojiCompatOooO00o.OooO(this.f34270OooO0o);
        }
    }
}
