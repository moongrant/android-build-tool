package p578o0oOoOo0;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import com.yalla.yalla.ui.view.rich_edit_text.EmojiFaceEditText;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ooOOO00O implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EmojiFaceEditText f56522OooO0Oo;

    public ooOOO00O(EmojiFaceEditText emojiFaceEditText) {
        this.f56522OooO0Oo = emojiFaceEditText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@NotNull Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        if (i2 == 1 && i3 == 0) {
            EmojiFaceEditText emojiFaceEditText = this.f56522OooO0Oo;
            int i4 = i + 1;
            oO0OO00[] oo0oo00Arr = (oO0OO00[]) emojiFaceEditText.getEditableText().getSpans(i4, i4, oO0OO00.class);
            emojiFaceEditText.f30740OooOO0o = oo0oo00Arr != null ? (oO0OO00) ArraysKt.getOrNull(oo0oo00Arr, 0) : null;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        EmojiFaceEditText emojiFaceEditText = this.f56522OooO0Oo;
        if (!emojiFaceEditText.getIgnoreReplace()) {
            emojiFaceEditText.ignoreReplace = true;
            emojiFaceEditText.OooO0Oo("init");
            int i4 = i3 + i;
            CharSequence charSequenceSubSequence = charSequence.subSequence(i, i4);
            emojiFaceEditText.OooO0Oo("subSequence");
            SpannableStringBuilder spannableStringBuilderOooO0OO = emojiFaceEditText.OooO0OO(charSequenceSubSequence);
            if (spannableStringBuilderOooO0OO != null) {
                emojiFaceEditText.getEditableText().delete(i, i4);
                emojiFaceEditText.getEditableText().insert(i, spannableStringBuilderOooO0OO);
            }
            emojiFaceEditText.ignoreReplace = false;
        }
        oO0OO00 oo0oo00 = emojiFaceEditText.f30740OooOO0o;
        if (oo0oo00 != null) {
            emojiFaceEditText.f30740OooOO0o = null;
            int spanStart = emojiFaceEditText.getEditableText().getSpanStart(oo0oo00);
            int spanEnd = emojiFaceEditText.getEditableText().getSpanEnd(oo0oo00);
            if (spanStart < 0 || spanEnd < 0) {
                return;
            }
            emojiFaceEditText.getEditableText().delete(spanStart, spanEnd);
        }
    }
}
