package p054o00000oo;

import android.view.inputmethod.ExtractedText;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o00000O.o0OO00O;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00o0 {
    @NotNull
    public static final ExtractedText OooO00o(@NotNull oo0oOO0 oo0ooo0) {
        Intrinsics.checkNotNullParameter(oo0ooo0, "<this>");
        ExtractedText extractedText = new ExtractedText();
        String str = oo0ooo0.f27236OooO00o.f26756Oooo0o;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = o0OO00O.OooO0oO(oo0ooo0.f27237OooO0O0);
        extractedText.selectionEnd = o0OO00O.OooO0o(oo0ooo0.f27237OooO0O0);
        extractedText.flags = !StringsKt__StringsKt.contains$default((CharSequence) oo0ooo0.f27236OooO00o.f26756Oooo0o, '\n', false, 2, (Object) null) ? 1 : 0;
        return extractedText;
    }
}
