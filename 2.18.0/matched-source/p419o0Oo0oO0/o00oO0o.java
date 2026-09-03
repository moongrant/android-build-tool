package p419o0Oo0oO0;

import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f39603OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f39604OooO0O0 = false;

    public static boolean OooO00o(String str) {
        return str != null && str.startsWith(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
    }

    public static String OooO0O0(String str) {
        try {
            int iLastIndexOf = str.lastIndexOf(".");
            if (iLastIndexOf > 0) {
                String strSubstring = str.substring(iLastIndexOf);
                switch (strSubstring) {
                    case ".png":
                    case ".PNG":
                    case ".jpg":
                    case ".jpeg":
                    case ".JPEG":
                    case ".WEBP":
                    case ".bmp":
                    case ".BMP":
                    case ".webp":
                    case ".gif":
                    case ".GIF":
                        return strSubstring;
                }
            }
            return ".png";
        } catch (Exception e) {
            e.printStackTrace();
            return ".png";
        }
    }

    public static boolean OooO0OO(String str) {
        return str != null && (str.equals("image/gif") || str.equals("image/GIF"));
    }

    public static boolean OooO0Oo(String str) {
        return (!TextUtils.isEmpty(str) && str.startsWith("http")) || str.startsWith("https");
    }

    public static int OooO0o(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int OooO0o0(String str, int i) {
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static int OooO0oO(String str, int i) {
        char cCharAt;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\t')) {
            i++;
        }
        return i;
    }
}
