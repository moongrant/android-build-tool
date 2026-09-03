package p650o0ooo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMoveRoomDialogUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoveRoomDialogUtil.kt\ncom/yalla/yalla/ui/dialog/MoveRoomDialogUtil\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,175:1\n1098#2:176\n*S KotlinDebug\n*F\n+ 1 MoveRoomDialogUtil.kt\ncom/yalla/yalla/ui/dialog/MoveRoomDialogUtil\n*L\n162#1:176\n*E\n"})
public final class O0O0 {
    public static final AnnotatedString OooO00o(String str, String str2, long j, long j2) {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        int length = str2.length() + iIndexOf$default;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(str);
        builder.addStyle(new SpanStyle(ColorKt.Color(j), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, ColorKt.Color(j2), (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63486, (DefaultConstructorMarker) null), iIndexOf$default, length);
        return builder.toAnnotatedString();
    }
}
