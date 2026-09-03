package p605o0oo0O0O;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.animation.core.AnimationKt;
import com.code.android.util.OooOo00;
import com.facebook.appevents.AppEventsConstants;
import com.squareup.wire.internal.MathMethodsKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f57394OooO00o = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static String OooO(String str) {
        return str != null ? Pattern.compile("\n").matcher(str).replaceAll("") : str;
    }

    public static SpannableStringBuilder OooO00o(int i, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        try {
            int iIndexOf = str.indexOf(str2);
            if (iIndexOf >= 0) {
                int length = str2.length() + iIndexOf;
                if (length > str.length()) {
                    length = str.length();
                }
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i), iIndexOf, length, 33);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return spannableStringBuilder;
    }

    public static SpannableString OooO0O0(int i, String str, String str2) {
        SpannableString spannableString = new SpannableString(OooOo00.OooO00o(str) ? "" : str);
        if (!OooOo00.OooO00o(str) && !OooOo00.OooO00o(str2)) {
            try {
                Matcher matcher = Pattern.compile(str2.toLowerCase()).matcher(str.toLowerCase());
                while (matcher.find()) {
                    spannableString.setSpan(new ForegroundColorSpan(i), matcher.start(), matcher.end(), 33);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return spannableString;
    }

    public static String OooO0OO(Long l) {
        return OooO0Oo("" + l);
    }

    public static String OooO0Oo(String str) {
        if (TextUtils.isEmpty(str)) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        String strTrim = str.trim();
        int i = 1;
        String str2 = String.format(Locale.ENGLISH, "%s", strTrim);
        int length = strTrim.length();
        if (length <= 3) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = length / 3;
        int i3 = length % 3;
        if (i3 != 0) {
            sb.append(str2.substring(0, i3));
            sb.append(",");
        }
        while (i <= i2) {
            int i4 = i3 + 3;
            sb.append(str2.substring(i3, i4));
            if (i != i2) {
                sb.append(",");
            }
            i++;
            i3 = i4;
        }
        return sb.toString();
    }

    public static String OooO0o(long j, boolean z) {
        if (j >= MathMethodsKt.NANOS_PER_SECOND) {
            BigDecimal scale = new BigDecimal(String.valueOf(j / 1.0E9d)).setScale(1, RoundingMode.DOWN);
            if (z && scale.floatValue() < 0.0f) {
                return "0.0";
            }
            return scale.floatValue() + "B";
        }
        if (j >= AnimationKt.MillisToNanos) {
            BigDecimal scale2 = new BigDecimal(String.valueOf(j / 1000000.0d)).setScale(1, RoundingMode.DOWN);
            if (z && scale2.floatValue() < 0.0f) {
                return "0.0";
            }
            return scale2.floatValue() + "M";
        }
        if (j < 1000) {
            if (z && j < 0) {
                return AppEventsConstants.EVENT_PARAM_VALUE_NO;
            }
            return j + "";
        }
        BigDecimal scale3 = new BigDecimal(String.valueOf(j / 1000.0d)).setScale(1, RoundingMode.DOWN);
        if (z && scale3.floatValue() < 0.0f) {
            return "0.0";
        }
        return scale3.floatValue() + "K";
    }

    public static String OooO0o0(long j) {
        float f;
        float f2;
        float f3;
        if (j > 999900000) {
            String str = String.format(Locale.ENGLISH, "%.1f", Double.valueOf(Math.ceil((j * 10.0d) / 1.0E9d) / 10.0d));
            if (str != null) {
                try {
                    f3 = Float.parseFloat(str);
                } catch (Exception unused) {
                    f3 = 0.0f;
                }
            } else {
                f3 = 0.0f;
            }
            return OooOOOO.OooO00o(f3 >= 0.0f ? str : "0.0", "B");
        }
        if (j > 999900) {
            String str2 = String.format(Locale.ENGLISH, "%.1f", Double.valueOf(Math.ceil((j * 10.0d) / 1000000.0d) / 10.0d));
            if (str2 != null) {
                try {
                    f2 = Float.parseFloat(str2);
                } catch (Exception unused2) {
                    f2 = 0.0f;
                }
            } else {
                f2 = 0.0f;
            }
            return OooOOOO.OooO00o(f2 >= 0.0f ? str2 : "0.0", "M");
        }
        if (j >= 1000) {
            String str3 = String.format(Locale.ENGLISH, "%.1f", Float.valueOf((float) (Math.ceil((j * 10.0f) / 1000.0f) / 10.0d)));
            if (str3 != null) {
                try {
                    f = Float.parseFloat(str3);
                } catch (Exception unused3) {
                    f = 0.0f;
                }
            } else {
                f = 0.0f;
            }
            return OooOOOO.OooO00o(f >= 0.0f ? str3 : "0.0", "K");
        }
        if (j < 0) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        return j + "";
    }

    public static StringBuffer OooO0oO(String... strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : strArr) {
            stringBuffer.append(str);
        }
        return stringBuffer;
    }

    public static final boolean OooO0oo(String str) {
        return str == null || str.length() == 0;
    }

    public static double OooOO0(String str) {
        if (str == null) {
            return 0.0d;
        }
        try {
            return Double.valueOf(str).doubleValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    public static int OooOO0O(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.valueOf(str).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static long OooOO0o(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }
}
