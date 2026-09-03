package p522o0o0O0o;

import com.weieyu.yalla.R;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OOO {
    @NotNull
    public static final String OooO00o(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        String strValueOf = String.valueOf(calendar.get(5));
        if (strValueOf.length() != 1) {
            return strValueOf;
        }
        return '0' + strValueOf;
    }

    @NotNull
    public static final String OooO0O0(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        String strValueOf = String.valueOf(calendar.get(11));
        if (strValueOf.length() != 1) {
            return strValueOf;
        }
        return '0' + strValueOf;
    }

    @NotNull
    public static final String OooO0OO(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        String strValueOf = String.valueOf(calendar.get(12));
        if (strValueOf.length() != 1) {
            return strValueOf;
        }
        return '0' + strValueOf;
    }

    @NotNull
    public static final String OooO0Oo(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        String strValueOf = String.valueOf(calendar.get(2) + 1);
        if (strValueOf.length() != 1) {
            return strValueOf;
        }
        return '0' + strValueOf;
    }

    public static String OooO0o(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        String strValueOf = String.valueOf(calendar.get(1));
        String strSubstring = strValueOf.substring(strValueOf.length() - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @NotNull
    public static final String OooO0o0(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        switch (calendar.get(7)) {
            case 1:
                return o000O0O0.OooO0OO(R.string.Sun);
            case 2:
                return o000O0O0.OooO0OO(R.string.Mon);
            case 3:
                return o000O0O0.OooO0OO(R.string.Tue);
            case 4:
                return o000O0O0.OooO0OO(R.string.Wed);
            case 5:
                return o000O0O0.OooO0OO(R.string.Thu);
            case 6:
                return o000O0O0.OooO0OO(R.string.Fri);
            case 7:
                return o000O0O0.OooO0OO(R.string.Sat);
            default:
                return "";
        }
    }
}
