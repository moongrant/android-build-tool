package p319o0O0oOo;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.exoplayer2.audio.AacUtil;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ArrayList<OooO00o> f36697OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f36698OooO0O0 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static final class OooO00o {
    }

    @VisibleForTesting
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f36699OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f36700OooO0O0;

        public OooO0O0(int i, int i2) {
            this.f36699OooO00o = i;
            this.f36700OooO0O0 = i2;
        }
    }

    public static boolean OooO(@Nullable String str) {
        return AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO.equals(OooO0o0(str));
    }

    public static boolean OooO00o(@Nullable String str, @Nullable String str2) {
        OooO0O0 oooO0O0OooO0Oo;
        int iOooO00o;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (oooO0O0OooO0Oo = OooO0Oo(str2)) == null || (iOooO00o = AacUtil.OooO00o(oooO0O0OooO0Oo.f36700OooO0O0)) == 0 || iOooO00o == 16) ? false : true;
            default:
                return false;
        }
    }

    public static int OooO0O0(String str, @Nullable String str2) {
        OooO0O0 oooO0O0OooO0Oo;
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (oooO0O0OooO0Oo = OooO0Oo(str2)) == null) {
                    return 0;
                }
                return AacUtil.OooO00o(oooO0O0OooO0Oo.f36700OooO0O0);
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    @Nullable
    public static String OooO0OO(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    @Nullable
    @VisibleForTesting
    public static OooO0O0 OooO0Oo(String str) {
        Matcher matcher = f36698OooO0O0.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        Objects.requireNonNull(strGroup);
        String strGroup2 = matcher.group(2);
        try {
            return new OooO0O0(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static int OooO0o(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (OooO0oO(str)) {
            return 1;
        }
        if (OooO(str)) {
            return 2;
        }
        if (OooO0oo(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 4;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 5;
        }
        int size = f36697OooO00o.size();
        for (int i = 0; i < size; i++) {
            Objects.requireNonNull(f36697OooO00o.get(i));
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    @Nullable
    public static String OooO0o0(@Nullable String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static boolean OooO0oO(@Nullable String str) {
        return "audio".equals(OooO0o0(str));
    }

    public static boolean OooO0oo(@Nullable String str) {
        return ViewHierarchyConstants.TEXT_KEY.equals(OooO0o0(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }
}
