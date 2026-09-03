package p423o0OoO0OO;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o0OOO0o;
import p568o0oOo0o.o0OOO00;
import p590o0oOooo0.oOOo0000;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextViewExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextViewExt.kt\ncom/yalla/yalla/ext/TextViewExtKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,338:1\n215#2,2:339\n*S KotlinDebug\n*F\n+ 1 TextViewExt.kt\ncom/yalla/yalla/ext/TextViewExtKt\n*L\n333#1:339,2\n*E\n"})
public final class o00O0O0O {
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
        o00O0O0 o00o0o0 = new o00O0O0(clickListener);
        if (iIndexOf$default != -1 && length != -1) {
            spannableStringBuilder.setSpan(o00o0o0, iIndexOf$default, length, 33);
        }
        textView.setText(spannableStringBuilder);
        if (oOOo0000.f57237OooO0O0 == null) {
            oOOo0000.f57237OooO0O0 = new oOOo0000();
        }
        textView.setMovementMethod(oOOo0000.f57237OooO0O0);
        textView.setHighlightColor(o00O0OOO.OooO00o(o0OOO0o.transparent, textView));
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
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(i), iIndexOf$default, length, 33);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        textView.setText(spannableStringBuilder);
    }

    public static final void OooO0OO(@NotNull TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText());
        if (textView.length() > 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, textView.length(), 33);
        }
        textView.setText(spannableStringBuilder);
    }

    public static final void OooO0Oo(@NotNull TextView textView, int i, @NotNull String... strings) {
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

    @NotNull
    public static final void OooO0o(@NotNull TextView textView, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (OooOo00.OooO0o0()) {
            textView.setCompoundDrawables(drawable, null, null, null);
        } else {
            textView.setCompoundDrawables(null, null, drawable, null);
        }
    }

    public static final void OooO0o0(@Nullable TextView textView, @NotNull FragmentActivity activity, @NotNull String copied) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(copied, "copied");
        o00O00OO.OooO00o(activity, o0OOO00.OooO00o(activity, textView, false, null), copied);
    }

    @NotNull
    public static final void OooO0oO(@NotNull TextView textView, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (OooOo00.OooO0o0()) {
            textView.setCompoundDrawables(null, null, drawable, null);
        } else {
            textView.setCompoundDrawables(drawable, null, null, null);
        }
    }
}
