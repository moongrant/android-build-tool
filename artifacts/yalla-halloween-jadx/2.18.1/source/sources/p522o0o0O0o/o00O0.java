package p522o0o0O0o;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.code.android.util.ToastUtil;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o000O0O0;
import p516o0o0O000.o000oOoO;
import p617o0oo0o.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0 {

    public static final class OooO00o extends ClickableSpan {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f42993Oooo0o;

        public OooO00o(Function0<Unit> function0) {
            this.f42993Oooo0o = function0;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(@NotNull View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            this.f42993Oooo0o.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(@NotNull TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "textPaint");
            textPaint.setUnderlineText(false);
        }
    }

    @NotNull
    public static final String OooO(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strOooO0O0 = o000oOoO.OooO0O0(str);
        Intrinsics.checkNotNullExpressionValue(strOooO0O0, "utf8ToUnicode(this)");
        return strOooO0O0;
    }

    public static final void OooO00o(@Nullable String str, @Nullable Context context, @NotNull String copiedTips) {
        Intrinsics.checkNotNullParameter(copiedTips, "copiedTips");
        if (context != null) {
            if (str == null || str.length() == 0) {
                return;
            }
            Object systemService = context.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Label", str));
            ToastUtil.f12567OooO00o.OooO0O0(copiedTips);
        }
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strOooO0Oo = o0O0O00.OooO0Oo(str);
        Intrinsics.checkNotNullExpressionValue(strOooO0Oo, "fmtMicrometer(this)");
        return strOooO0Oo;
    }

    @NotNull
    public static final Spanned OooO0OO(@NotNull String str, @NotNull String color, int i) {
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
        if (str == null || str.length() == 0) {
            return false;
        }
        return StringsKt.OooOoOO(str, "http") || StringsKt.OooOoOO(str, "https") || StringsKt.OooOoOO(str, "/http") || StringsKt.OooOoOO(str, "/https");
    }

    @NotNull
    public static final String OooO0o(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase(o00000O0.OooO00o());
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public static final boolean OooO0o0(@Nullable String str) {
        if (str != null) {
            Intrinsics.checkNotNull(str);
            if (StringsKt.trim((CharSequence) str).toString().length() > 0) {
                return true;
            }
        }
        return false;
    }

    public static String OooO0oO(String str) {
        Intrinsics.checkNotNullParameter("", NewFriendsOld.State_Default);
        return str == null || str.length() == 0 ? "" : str;
    }

    @NotNull
    public static final SpannableStringBuilder OooO0oo(@Nullable String str, @Nullable Integer num, @Nullable Function0<Unit> function0) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!(str == null || str.length() == 0)) {
            spannableStringBuilder.append((CharSequence) str);
            int length = str.length();
            if (num != null && num.intValue() > 0) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(o000O0O0.OooO00o(num.intValue())), 0, length, 33);
            }
            if (function0 != null) {
                spannableStringBuilder.setSpan(new OooO00o(function0), 0, length, 17);
            }
        }
        return spannableStringBuilder;
    }

    @NotNull
    public static final String OooOO0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase(o00000O0.OooO00o());
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
