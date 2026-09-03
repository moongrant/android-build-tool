package p417o0OoO0;

import com.code.android.util.o0000;
import com.facebook.appevents.AppEventsConstants;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00 {
    @NotNull
    public static final String OooO00o(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        String strValueOf = String.valueOf(calendar.get(5));
        return strValueOf.length() == 1 ? AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(strValueOf) : strValueOf;
    }

    @NotNull
    public static final String OooO0O0(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        String strValueOf = String.valueOf(calendar.get(11));
        return strValueOf.length() == 1 ? AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(strValueOf) : strValueOf;
    }

    @NotNull
    public static final String OooO0OO(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        String strValueOf = String.valueOf(calendar.get(12));
        return strValueOf.length() == 1 ? AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(strValueOf) : strValueOf;
    }

    @NotNull
    public static final String OooO0Oo(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        String strValueOf = String.valueOf(calendar.get(2) + 1);
        return strValueOf.length() == 1 ? AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(strValueOf) : strValueOf;
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
                return o0000.OooO0OO(oO00OOo0.Sun);
            case 2:
                return o0000.OooO0OO(oO00OOo0.Mon);
            case 3:
                return o0000.OooO0OO(oO00OOo0.Tue);
            case 4:
                return o0000.OooO0OO(oO00OOo0.Wed);
            case 5:
                return o0000.OooO0OO(oO00OOo0.Thu);
            case 6:
                return o0000.OooO0OO(oO00OOo0.Fri);
            case 7:
                return o0000.OooO0OO(oO00OOo0.Sat);
            default:
                return "";
        }
    }
}
