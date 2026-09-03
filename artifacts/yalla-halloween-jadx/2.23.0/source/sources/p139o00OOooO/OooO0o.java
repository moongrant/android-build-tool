package p139o00OOooO;

import androidx.annotation.IntRange;
import androidx.camera.core.impl.OooOOOO;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p136o00OOOo0.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {
    @NotNull
    public static final String OooO00o(@IntRange(from = 1, to = 50) int i, @Nullable String str) {
        String strOooO0Oo;
        String strConcat;
        if (str != null && (strOooO0Oo = OooO0Oo(str)) != null && (strConcat = strOooO0Oo.concat("?imageMogr2")) != null) {
            String str2 = strConcat + "/blur/" + i + "x50";
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    @NotNull
    public static final String OooO0O0(int i, @Nullable String str) {
        return OooO0OO(OooO0Oo(str)) + "/1/w/" + i + "/h/" + i;
    }

    public static final String OooO0OO(String str) {
        return StringsKt.OooO0o(str, "?imageView2") ? str : OooOOOO.OooO00o(str, "?imageView2");
    }

    @NotNull
    public static final String OooO0Oo(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return "";
        }
        String string = new StringBuffer(str).toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer(this).toString()");
        String str2 = OooOO0.f37360OooO0o;
        String str3 = str2 + "/" + str2 + "/";
        if (StringsKt.Oooo00o(string, str3)) {
            string = new Regex(str3).replace(string, OooOO0.f37360OooO0o);
        }
        if (!StringsKt__StringsJVMKt.startsWith(string, "http", true)) {
            string = OooOOOO.OooO00o(OooOO0.f37360OooO0o, string);
        }
        return StringsKt.OooO0o(string, "?") ? StringsKt.removeRange((CharSequence) string, StringsKt__StringsKt.indexOf$default((CharSequence) string, "?", 0, false, 6, (Object) null), string.length()).toString() : string;
    }

    @NotNull
    public static final String OooO0o(@Nullable String str) {
        String strOooO0Oo;
        String strRemovePrefix;
        return (str == null || (strOooO0Oo = OooO0Oo(str)) == null || (strRemovePrefix = StringsKt.removePrefix(strOooO0Oo, (CharSequence) OooOO0.f37360OooO0o)) == null) ? "" : strRemovePrefix;
    }

    @NotNull
    public static final String OooO0o0(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return "";
        }
        String strOooO0OO = OooO0OO(str);
        return StringsKt.OooOO0O(strOooO0OO, "?imageView2") ? OooOOOO.OooO00o(strOooO0OO, "/0/format/png") : OooOOOO.OooO00o(strOooO0OO, "/format/png");
    }

    @NotNull
    public static final String OooO0oO(int i, int i2, @Nullable String str) {
        String strOooO0Oo = OooO0Oo(str);
        if (!StringsKt.OooO0o(strOooO0Oo, "?imageMogr2")) {
            strOooO0Oo = OooOOOO.OooO00o(strOooO0Oo, "?imageMogr2");
        }
        return strOooO0Oo + "/thumbnail/" + i + "/x/" + i2;
    }

    @NotNull
    public static final String OooO0oo(int i, int i2, @Nullable String str) {
        return OooO0OO(OooO0Oo(str)) + "/3/w/" + i + "/h/" + i2;
    }
}
