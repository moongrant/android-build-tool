package p417o0OoO0;

import com.code.android.util.o0OoOo0;
import com.facebook.appevents.AppEventsConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 {
    @NotNull
    public static final String OooO00o(int i, @Nullable String str) {
        int iOooO0o0 = i - o0OoOo0.OooO0o0(0, str != null ? Integer.valueOf(str.length()) : null);
        if (iOooO0o0 <= 0) {
            return ((str == null || str.length() == 0) ? 1 : 0) != 0 ? "" : str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < iOooO0o0; i2++) {
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

    public static final boolean OooO0OO(@Nullable Integer num) {
        return num != null && num.intValue() == 1;
    }
}
