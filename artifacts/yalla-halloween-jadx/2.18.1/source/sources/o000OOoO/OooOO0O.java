package o000OOoO;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooOO0O implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final EditText f28309Oooo0o;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooO00o f28311Oooo0oo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final boolean f28310Oooo0oO = false;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f28308Oooo = true;

    @RequiresApi(19)
    public static class OooO00o extends EmojiCompat.OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Reference<EditText> f28312OooO00o;

        public OooO00o(EditText editText) {
            this.f28312OooO00o = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.EmojiCompat.OooO
        public final void OooO0O0() {
            OooOO0O.OooO00o(this.f28312OooO00o.get(), 1);
        }
    }

    public OooOO0O(EditText editText) {
        this.f28309Oooo0o = editText;
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
        if (this.f28309Oooo0o.isInEditMode()) {
            return;
        }
        if (!((this.f28308Oooo && (this.f28310Oooo0oO || EmojiCompat.OooO0OO())) ? false : true) && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iOooO0O0 = EmojiCompat.OooO00o().OooO0O0();
            if (iOooO0O0 != 0) {
                if (iOooO0O0 == 1) {
                    EmojiCompat.OooO00o().OooO((Spannable) charSequence, i, i3 + i);
                    return;
                } else if (iOooO0O0 != 3) {
                    return;
                }
            }
            EmojiCompat emojiCompatOooO00o = EmojiCompat.OooO00o();
            if (this.f28311Oooo0oo == null) {
                this.f28311Oooo0oo = new OooO00o(this.f28309Oooo0o);
            }
            emojiCompatOooO00o.OooOO0(this.f28311Oooo0oo);
        }
    }
}
