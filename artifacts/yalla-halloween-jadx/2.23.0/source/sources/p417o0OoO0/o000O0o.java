package p417o0OoO0;

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
import p558o0oOo0.oo00o;
import p579o0oOoo.oOOoOOO0;
import p584o0oOooO0.oO00O0o;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextViewExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextViewExt.kt\ncom/yalla/yalla/ext/TextViewExtKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,338:1\n215#2,2:339\n*S KotlinDebug\n*F\n+ 1 TextViewExt.kt\ncom/yalla/yalla/ext/TextViewExtKt\n*L\n333#1:339,2\n*E\n"})
public final class o000O0o {
    @NotNull
    public static final void OooO00o(@NotNull TextView textView, @NotNull String string, @NotNull Function1 clickListener) {
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
        o000O000 o000o001 = new o000O000(clickListener);
        if (iIndexOf$default != -1 && length != -1) {
            spannableStringBuilder.setSpan(o000o001, iIndexOf$default, length, 33);
        }
        textView.setText(spannableStringBuilder);
        if (oOOoOOO0.f56695OooO0O0 == null) {
            oOOoOOO0.f56695OooO0O0 = new oOOoOOO0();
        }
        textView.setMovementMethod(oOOoOOO0.f56695OooO0O0);
        textView.setHighlightColor(o000O0.OooO00o(oO00O0o.transparent, textView));
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
    public static final void OooO0o(@NotNull TextView textView, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (OooO.OooO0o0()) {
            textView.setCompoundDrawables(drawable, null, null, null);
        } else {
            textView.setCompoundDrawables(null, null, drawable, null);
        }
    }

    public static final void OooO0o0(@Nullable TextView textView, @NotNull FragmentActivity activity, @NotNull String copied) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(copied, "copied");
        o0000O0O.OooO00o(activity, oo00o.OooO00o(activity, textView, false, null), copied);
    }

    @NotNull
    public static final void OooO0oO(@NotNull TextView textView, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (OooO.OooO0o0()) {
            textView.setCompoundDrawables(null, null, drawable, null);
        } else {
            textView.setCompoundDrawables(drawable, null, null, null);
        }
    }
}
