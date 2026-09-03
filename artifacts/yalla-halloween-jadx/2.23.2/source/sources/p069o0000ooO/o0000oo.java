package p069o0000ooO;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.UnstableApi;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.google.common.base.OooO0OO;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes.dex */
public final class o0000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ArrayList<OooO00o> f33821OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f33822OooO0O0 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static final class OooO00o {
    }

    @VisibleForTesting
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f33823OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f33824OooO0O0;

        public OooO0O0(int i, int i2) {
            this.f33823OooO00o = i;
            this.f33824OooO0O0 = i2;
        }

        public final int OooO00o() {
            int i = this.f33824OooO0O0;
            if (i == 2) {
                return 10;
            }
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i == 42) {
                return 16;
            }
            if (i != 22) {
                return i != 23 ? 0 : 15;
            }
            return Pow2.MAX_POW2;
        }
    }

    @UnstableApi
    public static boolean OooO(@Nullable String str) {
        return ViewHierarchyConstants.TEXT_KEY.equals(OooO0o(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    @UnstableApi
    public static boolean OooO00o(@Nullable String str, @Nullable String str2) {
        OooO0O0 OooO0o1;
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
                return (str2 == null || (OooO0o1 = OooO0o0(str2)) == null || (iOooO00o = OooO0o1.OooO00o()) == 0 || iOooO00o == 16) ? false : true;
            default:
                return false;
        }
    }

    @UnstableApi
    public static int OooO0O0(String str, @Nullable String str2) {
        OooO0O0 OooO0o1;
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (OooO0o1 = OooO0o0(str2)) == null) {
                    return 0;
                }
                return OooO0o1.OooO00o();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    @Nullable
    @UnstableApi
    public static String OooO0OO(@Nullable String str) {
        OooO0O0 OooO0o1;
        String strOooO0Oo = null;
        if (str == null) {
            return null;
        }
        String strOooO00o = OooO0OO.OooO00o(str.trim());
        if (strOooO00o.startsWith("avc1") || strOooO00o.startsWith("avc3")) {
            return "video/avc";
        }
        if (strOooO00o.startsWith("hev1") || strOooO00o.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strOooO00o.startsWith("dvav") || strOooO00o.startsWith("dva1") || strOooO00o.startsWith("dvhe") || strOooO00o.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strOooO00o.startsWith("av01")) {
            return "video/av01";
        }
        if (strOooO00o.startsWith("vp9") || strOooO00o.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strOooO00o.startsWith("vp8") || strOooO00o.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strOooO00o.startsWith("mp4a")) {
            if (strOooO00o.startsWith("mp4a.") && (OooO0o1 = OooO0o0(strOooO00o)) != null) {
                strOooO0Oo = OooO0Oo(OooO0o1.f33823OooO00o);
            }
            return strOooO0Oo == null ? "audio/mp4a-latm" : strOooO0Oo;
        }
        if (strOooO00o.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strOooO00o.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strOooO00o.startsWith("ac-3") || strOooO00o.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strOooO00o.startsWith("ec-3") || strOooO00o.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strOooO00o.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strOooO00o.startsWith("ac-4") || strOooO00o.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strOooO00o.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strOooO00o.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strOooO00o.startsWith("dtsh") || strOooO00o.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strOooO00o.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strOooO00o.startsWith("opus")) {
            return "audio/opus";
        }
        if (strOooO00o.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strOooO00o.startsWith("flac")) {
            return "audio/flac";
        }
        if (strOooO00o.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strOooO00o.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strOooO00o.contains("cea708")) {
            return "application/cea-708";
        }
        if (strOooO00o.contains("eia608") || strOooO00o.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList<OooO00o> arrayList = f33821OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).getClass();
            if (strOooO00o.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    @Nullable
    @UnstableApi
    public static String OooO0Oo(int i) {
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
    @UnstableApi
    public static String OooO0o(@Nullable String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    @Nullable
    @VisibleForTesting
    public static OooO0O0 OooO0o0(String str) {
        Matcher matcher = f33822OooO0O0.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new OooO0O0(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @UnstableApi
    public static int OooO0oO(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (OooO0oo(str)) {
            return 1;
        }
        if (OooOO0(str)) {
            return 2;
        }
        if (OooO(str)) {
            return 3;
        }
        if ("image".equals(OooO0o(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList<OooO00o> arrayList = f33821OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    @UnstableApi
    public static boolean OooO0oo(@Nullable String str) {
        return "audio".equals(OooO0o(str));
    }

    @UnstableApi
    public static boolean OooOO0(@Nullable String str) {
        return AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO.equals(OooO0o(str));
    }
}
