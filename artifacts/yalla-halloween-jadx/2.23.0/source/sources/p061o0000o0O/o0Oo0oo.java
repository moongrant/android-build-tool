package p061o0000o0O;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o0Oo0oo implements InputFilter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextView f34278OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o f34279OooO0O0;

    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class OooO00o extends EmojiCompat.OooOO0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final WeakReference f34280OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final WeakReference f34281OooO0o0;

        public OooO00o(TextView textView, o0Oo0oo o0oo0oo2) {
            this.f34280OooO0Oo = new WeakReference(textView);
            this.f34281OooO0o0 = new WeakReference(o0oo0oo2);
        }

        @Override // androidx.emoji2.text.EmojiCompat.OooOO0
        public final void onInitialized() {
            Handler handler;
            super.onInitialized();
            TextView textView = (TextView) this.f34280OooO0Oo.get();
            if (textView == null || (handler = textView.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            CharSequence text;
            CharSequence charSequenceOooO0oo;
            InputFilter[] filters;
            TextView textView = (TextView) this.f34280OooO0Oo.get();
            InputFilter inputFilter = (InputFilter) this.f34281OooO0o0.get();
            boolean z = false;
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                for (InputFilter inputFilter2 : filters) {
                    if (inputFilter2 == inputFilter) {
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

    public o0Oo0oo(@NonNull TextView textView) {
        this.f34278OooO00o = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f34278OooO00o;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iOooO0O0 = EmojiCompat.OooO00o().OooO0O0();
        if (iOooO0O0 != 0) {
            boolean z = true;
            if (iOooO0O0 == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return EmojiCompat.OooO00o().OooO0oO(0, charSequence.length(), charSequence);
            }
            if (iOooO0O0 != 3) {
                return charSequence;
            }
        }
        EmojiCompat emojiCompatOooO00o = EmojiCompat.OooO00o();
        if (this.f34279OooO0O0 == null) {
            this.f34279OooO0O0 = new OooO00o(textView, this);
        }
        emojiCompatOooO00o.OooO(this.f34279OooO0O0);
        return charSequence;
    }
}
