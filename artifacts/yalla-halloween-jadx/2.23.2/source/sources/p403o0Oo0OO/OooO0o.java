package p403o0Oo0OO;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO0o implements InputFilter {
    public OooO0o() {
        Pattern.compile("^[一-龥a-zA-Z0-9]+$");
        Pattern.compile("((?! [一-龥aa-zA-Z0-9]).)");
    }

    @Override // android.text.InputFilter
    @Nullable
    public final CharSequence filter(@Nullable CharSequence charSequence, int i, int i2, @Nullable Spanned spanned, int i3, int i4) {
        String strValueOf = String.valueOf(charSequence);
        SpannableString spannableString = new SpannableString(charSequence);
        Object[] spans = spannableString.getSpans(0, spannableString.length(), Object.class);
        if (spans != null) {
            for (Object obj : spans) {
                if (obj instanceof UnderlineSpan) {
                    String strReplace = new Regex("\n").replace(strValueOf, "");
                    if (Intrinsics.areEqual(strReplace, strValueOf)) {
                        return charSequence;
                    }
                    SpannableString spannableString2 = new SpannableString(strReplace);
                    spannableString2.setSpan(new UnderlineSpan(), 0, strReplace.length(), 33);
                    return spannableString2;
                }
            }
        }
        return charSequence;
    }
}
