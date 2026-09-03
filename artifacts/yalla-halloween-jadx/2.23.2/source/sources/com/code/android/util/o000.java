package com.code.android.util;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o000 {
    @NotNull
    public static final void OooO00o(@NotNull TextView textView, @NotNull String string, @NotNull Function1 clickListener) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default(text, string, 0, false, 6, (Object) null);
        int length = string.length() + iIndexOf$default;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText());
        o0000OO0 o0000oo1 = new o0000OO0(clickListener);
        if (iIndexOf$default >= 0) {
            spannableStringBuilder.setSpan(o0000oo1, iIndexOf$default, length, 33);
        }
        textView.setText(spannableStringBuilder);
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (oo000o.f13478OooO0O0 == null) {
            oo000o.f13478OooO0O0 = new oo000o();
        }
        textView.setMovementMethod(oo000o.f13478OooO0O0);
        textView.setHighlightColor(0);
    }

    public static final void OooO0O0(@NotNull TextView textView, int i, @NotNull String... strings) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText());
        for (String str : strings) {
            try {
                CharSequence text = textView.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default(text, str, 0, false, 6, (Object) null);
                if (iIndexOf$default >= 0) {
                    int length = str.length() + iIndexOf$default;
                    if (length > textView.getText().length()) {
                        length = textView.getText().length();
                    }
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(i), iIndexOf$default, length, 33);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        textView.setText(spannableStringBuilder);
    }
}
