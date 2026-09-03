package p168o00Ooo0;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooO0OO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f32652OooO00o = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final boolean OooO(String str) {
        return str == null || str.length() == 0;
    }

    public static SpannableStringBuilder OooO00o(String str, String str2, int i) {
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
        SpannableString spannableString = new SpannableString(OooO0OO.OooO00o(str) ? "" : str);
        if (!OooO0OO.OooO00o(str) && !OooO0OO.OooO00o(str2)) {
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

    public static String OooO0o(long j) {
        if (j > 999900000) {
            String str = String.format(Locale.ENGLISH, "%.1f", Double.valueOf(Math.ceil((j * 10.0d) / 1.0E9d) / 10.0d));
            return OooOo00.OooO0Oo(OooO.OooO0OO(str) >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? str : "0.0", "B");
        }
        if (j > 999900) {
            String str2 = String.format(Locale.ENGLISH, "%.1f", Double.valueOf(Math.ceil((j * 10.0d) / 1000000.0d) / 10.0d));
            return OooOo00.OooO0Oo(OooO.OooO0OO(str2) >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? str2 : "0.0", "M");
        }
        if (j >= 1000) {
            String str3 = String.format(Locale.ENGLISH, "%.1f", Float.valueOf((float) (Math.ceil((j * 10.0f) / 1000.0f) / 10.0d)));
            return OooOo00.OooO0Oo(OooO.OooO0OO(str3) >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? str3 : "0.0", "K");
        }
        if (j < 0) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        return j + "";
    }

    public static String OooO0o0(String str) {
        if (str == null) {
            return null;
        }
        return OooO0o.OooO0OO.OooO00o("\u202d", str, "\u202c");
    }

    public static String OooO0oO(long j, boolean z) {
        if (j >= 1000000000) {
            BigDecimal scale = new BigDecimal(String.valueOf(j / 1.0E9d)).setScale(1, RoundingMode.DOWN);
            if (z && scale.floatValue() < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                return "0.0";
            }
            return scale.floatValue() + "B";
        }
        if (j >= 1000000) {
            BigDecimal scale2 = new BigDecimal(String.valueOf(j / 1000000.0d)).setScale(1, RoundingMode.DOWN);
            if (z && scale2.floatValue() < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
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
        if (z && scale3.floatValue() < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return "0.0";
        }
        return scale3.floatValue() + "K";
    }

    public static StringBuffer OooO0oo(String... strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : strArr) {
            stringBuffer.append(str);
        }
        return stringBuffer;
    }

    public static String OooOO0(String str) {
        return str != null ? Pattern.compile("\n").matcher(str).replaceAll("") : str;
    }

    public static double OooOO0O(String str) {
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

    public static int OooOO0o(String str) {
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

    public static long OooOOO0(String str) {
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
