package p254o00ooO0O;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o00000OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O00 {
    @Nullable
    public static final o00000O0 OooO00o(@NotNull String str) {
        long jOooO0OO;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (StringsKt.OooOoOO(str, "#")) {
                String strSubstring = str.substring(1, str.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                if (strSubstring.length() == 6) {
                    jOooO0OO = o00000OO.OooO0OO(new BigInteger("FF" + strSubstring, 16).longValue());
                } else {
                    jOooO0OO = o00000OO.OooO0OO(new BigInteger(strSubstring, 16).longValue());
                }
            } else if (StringsKt.OooOoOO(str, "0x") || StringsKt.OooOoOO(str, "0X")) {
                String strSubstring2 = str.substring(2, str.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                if (strSubstring2.length() == 6) {
                    jOooO0OO = o00000OO.OooO0OO(new BigInteger("FF" + strSubstring2, 16).longValue());
                } else {
                    jOooO0OO = o00000OO.OooO0OO(new BigInteger(strSubstring2, 16).longValue());
                }
            } else {
                jOooO0OO = o00000OO.OooO0OO(new BigInteger(str, 16).longValue());
            }
            return new o00000O0(jOooO0OO);
        } catch (Exception unused) {
            return null;
        }
    }
}
