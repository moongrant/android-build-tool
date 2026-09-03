package p423o0OoO0OO;

import android.view.View;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nViewFun.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewFun.kt\ncom/yalla/yalla/ext/ViewFunKt\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,83:1\n1098#2:84\n1098#2:85\n*S KotlinDebug\n*F\n+ 1 ViewFun.kt\ncom/yalla/yalla/ext/ViewFunKt\n*L\n42#1:84\n72#1:85\n*E\n"})
public final class oo0oOO0 {
    @NotNull
    public static final AnnotatedString OooO00o(long j, @NotNull String origin, @NotNull String replace) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(replace, "replace");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) origin, replace, 0, false, 6, (Object) null);
        int length = replace.length() + iIndexOf$default;
        if (iIndexOf$default < 0 || length > origin.length()) {
            return new AnnotatedString(origin, null, null, 6, null);
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(origin);
        builder.addStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), iIndexOf$default, length);
        return builder.toAnnotatedString();
    }

    public static final void OooO0O0(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.getLayoutParams().height = i;
        view.requestLayout();
    }

    public static final void OooO0OO(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.getLayoutParams().width = i;
        view.requestLayout();
    }
}
