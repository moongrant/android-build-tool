package o000OOoO;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooO0o implements InputFilter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextView f28299OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o f28300OooO0O0;

    @RequiresApi(19)
    public static class OooO00o extends EmojiCompat.OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Reference<TextView> f28301OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Reference<OooO0o> f28302OooO0O0;

        public OooO00o(TextView textView, OooO0o oooO0o) {
            this.f28301OooO00o = new WeakReference(textView);
            this.f28302OooO0O0 = new WeakReference(oooO0o);
        }

        @Override // androidx.emoji2.text.EmojiCompat.OooO
        public final void OooO0O0() {
            CharSequence text;
            CharSequence charSequenceOooO0oo;
            InputFilter[] filters;
            TextView textView = this.f28301OooO00o.get();
            OooO0o oooO0o = this.f28302OooO0O0.get();
            boolean z = false;
            if (oooO0o != null && textView != null && (filters = textView.getFilters()) != null) {
                for (InputFilter inputFilter : filters) {
                    if (inputFilter == oooO0o) {
                        z = true;
                        break;
                    }
                }
            }
            if (z && textView.isAttachedToWindow() && text != (charSequenceOooO0oo = EmojiCompat.OooO00o().OooO0oo((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceOooO0oo);
                int selectionEnd = Selection.getSelectionEnd(charSequenceOooO0oo);
                textView.setText(charSequenceOooO0oo);
                if (charSequenceOooO0oo instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequenceOooO0oo;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public OooO0o(@NonNull TextView textView) {
        this.f28299OooO00o = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f28299OooO00o.isInEditMode()) {
            return charSequence;
        }
        int iOooO0O0 = EmojiCompat.OooO00o().OooO0O0();
        if (iOooO0O0 != 0) {
            boolean z = true;
            if (iOooO0O0 == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f28299OooO00o.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return EmojiCompat.OooO00o().OooO(charSequence, 0, charSequence.length());
            }
            if (iOooO0O0 != 3) {
                return charSequence;
            }
        }
        EmojiCompat emojiCompatOooO00o = EmojiCompat.OooO00o();
        if (this.f28300OooO0O0 == null) {
            this.f28300OooO0O0 = new OooO00o(this.f28299OooO00o, this);
        }
        emojiCompatOooO00o.OooOO0(this.f28300OooO0O0);
        return charSequence;
    }
}
