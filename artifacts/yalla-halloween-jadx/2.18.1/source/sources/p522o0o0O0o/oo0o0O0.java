package p522o0o0O0o;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.weieyu.yalla.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.oo000o;
import p185o00o00O0.OooO0O0;
import p254o00ooO0O.o000O0O0;
import p516o0o0O000.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0O0 {
    @NotNull
    public static final TextView OooO00o(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawables(null, null, null, null);
        return textView;
    }

    @NotNull
    public static final ClickableSpan OooO0O0(@NotNull TextView textView, @NotNull String string, @NotNull Function1<? super View, Unit> clickListener) {
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
        o00O0OO0 o00o0oo1 = new o00O0OO0(clickListener);
        if (iIndexOf$default != -1 && length != -1) {
            spannableStringBuilder.setSpan(o00o0oo1, iIndexOf$default, length, 33);
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(o0OO00O.f42117OooO0O0.OooO00o());
        textView.setHighlightColor(o000O0O0.OooO00o(R.color.transparent));
        return o00o0oo1;
    }

    public static final void OooO0OO(@NotNull TextView textView, @NotNull String[] strings, int i) {
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
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(i), iIndexOf$default, length, 33);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        textView.setText(spannableStringBuilder);
    }

    public static final void OooO0Oo(@NotNull TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText());
        if (textView.length() > 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, textView.length(), 33);
        }
        textView.setText(spannableStringBuilder);
    }

    public static final void OooO0o(@Nullable TextView textView, @NotNull Activity activity, @NotNull String copied) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(copied, "copied");
        o00O0.OooO00o(textView != null ? OooO0O0.OooO00o(activity, textView, false, null) : "", activity, copied);
    }

    public static final void OooO0o0(@NotNull TextView textView, @NotNull String[] strings, int i) {
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

    @NotNull
    public static final TextView OooO0oO(@NotNull TextView textView, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (oo000o.OooO0o0()) {
            textView.setCompoundDrawables(drawable, null, null, null);
        } else {
            textView.setCompoundDrawables(null, null, drawable, null);
        }
        return textView;
    }

    @NotNull
    public static final TextView OooO0oo(@NotNull TextView textView, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (oo000o.OooO0o0()) {
            textView.setCompoundDrawables(null, null, drawable, null);
        } else {
            textView.setCompoundDrawables(drawable, null, null, null);
        }
        return textView;
    }
}
