package com.yalla.support.common.util;

import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 {
    @NotNull
    public static final ClickableSpan OooO00o(@NotNull TextView textView, @NotNull String string, @NotNull Function1<? super View, Unit> clickListener) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "text");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default(text, string, 0, false, 6, (Object) null);
        int length = string.length() + iIndexOf$default;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText());
        Oooo000 oooo000 = new Oooo000(clickListener);
        if (iIndexOf$default >= 0) {
            spannableStringBuilder.setSpan(oooo000, iIndexOf$default, length, 33);
        }
        textView.setText(spannableStringBuilder);
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (OooOO0.f20505OooO0O0 == null) {
            OooOO0.f20505OooO0O0 = new OooOO0();
        }
        textView.setMovementMethod(OooOO0.f20505OooO0O0);
        textView.setHighlightColor(0);
        return oooo000;
    }

    public static final void OooO0O0(@NotNull TextView textView, int i, @NotNull String... strings) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText());
        for (String str : strings) {
            try {
                CharSequence text = textView.getText();
                Intrinsics.checkNotNullExpressionValue(text, "text");
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
