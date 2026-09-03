package p566o0oOo0o;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import com.yalla.yalla.ui.view.rich_edit_text.EmojiFaceEditText;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0O implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EmojiFaceEditText f56210OooO0Oo;

    public o00O0O(EmojiFaceEditText emojiFaceEditText) {
        this.f56210OooO0Oo = emojiFaceEditText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@NotNull Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        if (i2 == 1 && i3 == 0) {
            EmojiFaceEditText emojiFaceEditText = this.f56210OooO0Oo;
            int i4 = i + 1;
            o00Ooo[] o00oooArr = (o00Ooo[]) emojiFaceEditText.getEditableText().getSpans(i4, i4, o00Ooo.class);
            emojiFaceEditText.f31281OooOO0o = o00oooArr != null ? (o00Ooo) ArraysKt.getOrNull(o00oooArr, 0) : null;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        EmojiFaceEditText emojiFaceEditText = this.f56210OooO0Oo;
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
        o00Ooo o00ooo2 = emojiFaceEditText.f31281OooOO0o;
        if (o00ooo2 != null) {
            emojiFaceEditText.f31281OooOO0o = null;
            int spanStart = emojiFaceEditText.getEditableText().getSpanStart(o00ooo2);
            int spanEnd = emojiFaceEditText.getEditableText().getSpanEnd(o00ooo2);
            if (spanStart < 0 || spanEnd < 0) {
                return;
            }
            emojiFaceEditText.getEditableText().delete(spanStart, spanEnd);
        }
    }
}
