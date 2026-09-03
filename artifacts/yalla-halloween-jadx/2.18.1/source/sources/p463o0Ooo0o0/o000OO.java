package p463o0Ooo0o0;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO implements InputFilter {
    @Override // android.text.InputFilter
    @NotNull
    public final CharSequence filter(@Nullable CharSequence charSequence, int i, int i2, @Nullable Spanned spanned, int i3, int i4) {
        String strReplace;
        return (charSequence == null || (strReplace = new Regex("\n").replace(charSequence, "")) == null) ? "" : strReplace;
    }
}
