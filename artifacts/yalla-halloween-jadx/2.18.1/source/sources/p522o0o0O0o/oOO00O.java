package p522o0o0O0o;

import com.facebook.appevents.AppEventsConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO00O {
    @NotNull
    public static final String OooO00o(@Nullable String str, int i) {
        int iOooO0Oo = i - OooO0Oo(str != null ? Integer.valueOf(str.length()) : null, 0);
        if (iOooO0Oo <= 0) {
            return ((str == null || str.length() == 0) ? 1 : 0) != 0 ? "" : str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < iOooO0Oo; i2++) {
            stringBuffer.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
        return ((Object) stringBuffer) + str;
    }

    @NotNull
    public static final String OooO0O0(long j) {
        StringBuffer stringBuffer = new StringBuffer();
        if (String.valueOf(j).length() < 2) {
            stringBuffer.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
        stringBuffer.append(String.valueOf(j));
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "numberStr.toString()");
        return string;
    }

    public static boolean OooO0OO(Boolean bool) {
        if (bool == null) {
            return false;
        }
        Intrinsics.checkNotNull(bool);
        return bool.booleanValue();
    }

    public static final int OooO0Oo(@Nullable Integer num, int i) {
        if (num == null) {
            return i;
        }
        Intrinsics.checkNotNull(num);
        return num.intValue();
    }

    public static long OooO0o(Long l) {
        if (l == null) {
            return 0L;
        }
        Intrinsics.checkNotNull(l);
        return l.longValue();
    }

    public static int OooO0o0(Long l) {
        if (l == null) {
            return 0;
        }
        Intrinsics.checkNotNull(l);
        return (int) l.longValue();
    }
}
