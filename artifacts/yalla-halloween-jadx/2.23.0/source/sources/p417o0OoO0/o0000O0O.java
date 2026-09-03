package p417o0OoO0;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Looper;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.compose.material.TextFieldImplKt;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p579o0oOoo.oO000Oo0;
import p579o0oOoo.oO00o000;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nStringExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExt.kt\ncom/yalla/yalla/ext/StringExtKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,379:1\n13724#2,3:380\n*S KotlinDebug\n*F\n+ 1 StringExt.kt\ncom/yalla/yalla/ext/StringExtKt\n*L\n192#1:380,3\n*E\n"})
public final class o0000O0O {

    public static final class OooO00o extends ClickableSpan {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f45497OooO0Oo;

        public OooO00o(Function0<Unit> function0) {
            this.f45497OooO0Oo = function0;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(@NotNull View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            this.f45497OooO0Oo.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(@NotNull TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "textPaint");
            textPaint.setUnderlineText(false);
        }
    }

    @NotNull
    public static final SpannableStringBuilder OooO(@Nullable String str, @Nullable Integer num, @Nullable Function0<Unit> function0) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!(str == null || str.length() == 0)) {
            spannableStringBuilder.append((CharSequence) str);
            int length = str.length();
            if (num != null && num.intValue() > 0) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(o0000.OooO00o(num.intValue())), 0, length, 33);
            }
            if (function0 != null) {
                spannableStringBuilder.setSpan(new OooO00o(function0), 0, length, 17);
            }
        }
        return spannableStringBuilder;
    }

    public static final void OooO00o(@Nullable Activity activity, @Nullable String str, @NotNull String copiedTips) {
        Intrinsics.checkNotNullParameter(copiedTips, "copiedTips");
        if (activity != null) {
            boolean z = true;
            if (str == null || str.length() == 0) {
                return;
            }
            Object systemService = activity.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(TextFieldImplKt.LabelId, str));
            if (copiedTips != null && !StringsKt.isBlank(copiedTips)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(copiedTips, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strOooO0Oo = OooOOOO.OooO0Oo(str);
        Intrinsics.checkNotNullExpressionValue(strOooO0Oo, "fmtMicrometer(this)");
        return strOooO0Oo;
    }

    @NotNull
    public static final Spanned OooO0OO(int i, @NotNull String str, @NotNull String color) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(color, "color");
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        if (i != 0) {
            int i2 = 0;
            if (i > 0) {
                while (i2 < i) {
                    stringBuffer.append("<big>");
                    stringBuffer2.append("</big>");
                    i2++;
                }
            } else {
                int i3 = -i;
                while (i2 < i3) {
                    stringBuffer.append("<small>");
                    stringBuffer2.append("</small>");
                    i2++;
                }
            }
        }
        Spanned spannedFromHtml = Html.fromHtml("<font \" color=\"" + color + "\">" + ((Object) stringBuffer) + str + ((Object) stringBuffer2) + "</font>");
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(\"<font \\\" color…ead$this$sizeEnd</font>\")");
        return spannedFromHtml;
    }

    public static final boolean OooO0Oo(@Nullable String str) {
        return !(str == null || str.length() == 0) && (StringsKt.Oooo00o(str, "http") || StringsKt.Oooo00o(str, "https") || StringsKt.Oooo00o(str, "/http") || StringsKt.Oooo00o(str, "/https"));
    }

    @Deprecated(message = "")
    public static final boolean OooO0o(@Nullable String str) {
        if (str != null) {
            Intrinsics.checkNotNull(str);
            if (StringsKt.trim((CharSequence) str).toString().length() > 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean OooO0o0(@Nullable String str) {
        if (str == null) {
            return false;
        }
        try {
            if (!(str.length() > 0)) {
                return false;
            }
            Intrinsics.checkNotNullParameter(str, "<this>");
            String strOooO0oo = OooO0oo(str);
            Intrinsics.checkNotNullParameter("http", "<this>");
            return StringsKt.Oooo00o(strOooO0oo, OooO0oo("http"));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static final boolean OooO0oO(@Nullable String str) {
        if (str == null) {
            return false;
        }
        try {
            if (!(str.length() > 0)) {
                return false;
            }
            Intrinsics.checkNotNullParameter(str, "<this>");
            String strOooO0oo = OooO0oo(str);
            Intrinsics.checkNotNullParameter(".svga", "<this>");
            return StringsKt.OooOO0O(strOooO0oo, OooO0oo(".svga"));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @NotNull
    public static final String OooO0oo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase(oO00o000.OooO00o());
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @NotNull
    public static final String OooOO0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strOooO0O0 = oO000Oo0.OooO0O0(str);
        Intrinsics.checkNotNullExpressionValue(strOooO0O0, "utf8ToUnicode(this)");
        return strOooO0O0;
    }

    @NotNull
    public static final String OooOO0O(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase(oO00o000.OooO00o());
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
