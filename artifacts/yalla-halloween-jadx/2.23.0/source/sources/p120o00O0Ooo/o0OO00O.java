package p120o00O0Ooo;

import android.content.res.Resources;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O {
    public static final int OooO00o(float f) {
        Resources system = Resources.getSystem();
        Intrinsics.checkExpressionValueIsNotNull(system, "Resources.getSystem()");
        return (int) ((f * system.getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    @Nullable
    public static final String OooO0O0(@NotNull String str) {
        String strSubstring;
        if (TextUtils.isEmpty(str) || !StringsKt.OooO0o(str, ".")) {
            strSubstring = "";
        } else {
            int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(str, ".", 0, false, 6, (Object) null);
            int length = str.length();
            if (StringsKt.OooO0o(str, "?")) {
                length = StringsKt__StringsKt.lastIndexOf$default(str, "?", 0, false, 6, (Object) null);
            }
            if (iLastIndexOf$default <= -1 || iLastIndexOf$default > length) {
                strSubstring = "";
            } else {
                strSubstring = str.substring(iLastIndexOf$default, length);
                Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
        }
        if (strSubstring.length() <= 5) {
            return strSubstring;
        }
        return String.valueOf(((long) 10) + ((long) (Math.random() * ((double) 99)))) + "";
    }
}
