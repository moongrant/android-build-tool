package p245o00oo0o;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.ComposerKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.Log;
import com.google.common.base.OooO;
import com.google.common.base.OooO0OO;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import com.zego.zegoliveroom.constants.ZegoConstants;
import io.agora.rtc.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import net.sqlcipher.database.SQLiteDatabase;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p039OoooOoo.o00OO;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Pattern f40594OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int f40595OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f40596OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String f40597OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String f40598OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final byte[] f40599OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f40600OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Pattern f40601OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Pattern f40602OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Pattern f40603OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public static HashMap<String, String> f40604OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String[] f40605OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final int[] f40606OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String[] f40607OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final int[] f40608OooOOOO;

    @RequiresApi(21)
    public static final class OooO00o {
        @DoNotInline
        public static Drawable OooO00o(Context context, Resources resources, @DrawableRes int i) {
            return resources.getDrawable(i, context.getTheme());
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f40595OooO00o = i;
        String str = Build.DEVICE;
        f40596OooO0O0 = str;
        String str2 = Build.MANUFACTURER;
        f40597OooO0OO = str2;
        String str3 = Build.MODEL;
        f40598OooO0Oo = str3;
        f40600OooO0o0 = str + ", " + str3 + ", " + str2 + ", " + i;
        f40599OooO0o = new byte[0];
        f40601OooO0oO = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f40602OooO0oo = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f40594OooO = Pattern.compile("%([A-Fa-f0-9]{2})");
        f40603OooOO0 = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f40605OooOO0o = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f40607OooOOO0 = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f40606OooOOO = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f40608OooOOOO = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, IZegoLiveEventCallback.StreamEvent.RetryPlayFail, 144, Constants.ERR_PUBLISH_STREAM_CDN_ERROR, 158, Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED, 140, 139, Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 171, 172, 165, 162, 143, 136, Constants.ERR_WATERMARK_READ, 134, 147, 148, Constants.ERR_MODULE_NOT_FOUND, Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, Constants.ERR_PUBLISH_STREAM_NOT_FOUND, Constants.ERR_PUBLISH_STREAM_FORMAT_NOT_SUPPORTED, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, ComposerKt.reuseKey, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, Constants.ERR_ALREADY_IN_RECORDING, 167, 178, 181, 188, 187, TextFieldImplKt.AnimationDuration, 145, Constants.ERR_PUBLISH_STREAM_NUM_REACH_LIMIT, 159, 138, ZegoConstants.RoomError.SessionError, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, SQLiteDatabase.MAX_SQL_CACHE_SIZE, 253, 244, 243};
    }

    public static int OooO(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static boolean OooO00o(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int OooO0O0(long[] jArr, long j, boolean z) {
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        do {
            iBinarySearch++;
            if (iBinarySearch >= jArr.length) {
                break;
            }
        } while (jArr[iBinarySearch] == j);
        return z ? iBinarySearch - 1 : iBinarySearch;
    }

    public static int OooO0OO(List list, Long l, boolean z) {
        int i;
        int iBinarySearch = Collections.binarySearch(list, l);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (((Comparable) list.get(iBinarySearch)).compareTo(l) == 0);
            i = iBinarySearch + 1;
        }
        return z ? Math.max(0, i) : i;
    }

    public static int OooO0Oo(o00OO000 o00oo001, long j) {
        int i = o00oo001.f40572OooO00o - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            if (o00oo001.OooO0O0(i3) < j) {
                i2 = i3 + 1;
            } else {
                i = i3 - 1;
            }
        }
        int i4 = i + 1;
        if (i4 < o00oo001.f40572OooO00o && o00oo001.OooO0O0(i4) == j) {
            return i4;
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public static int OooO0o(long[] jArr, long j, boolean z) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j);
            i = iBinarySearch + 1;
        }
        return z ? Math.max(0, i) : i;
    }

    public static int OooO0o0(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (iArr[iBinarySearch] == i);
            i2 = z ? iBinarySearch + 1 : iBinarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static void OooO0oO(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float OooO0oo(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public static long OooOO0(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static Handler OooOO0O(@Nullable Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        o00O000o.OooO0o0(looperMyLooper);
        return new Handler(looperMyLooper, callback);
    }

    public static String OooOO0o(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    @SuppressLint({"InlinedApi"})
    public static int OooOOO(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (f40595OooO00o >= 32) {
                    return 737532;
                }
                return 6396;
            case 12:
                return 743676;
        }
    }

    public static String OooOOO0(byte[] bArr) {
        return new String(bArr, OooO.f19059OooO0OO);
    }

    public static Drawable OooOOOO(Context context, Resources resources, @DrawableRes int i) {
        return f40595OooO00o >= 21 ? OooO00o.OooO00o(context, resources, i) : resources.getDrawable(i);
    }

    public static int OooOOOo(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static long OooOOo(long j, float f) {
        return f == 1.0f ? j : Math.round(j * ((double) f));
    }

    public static int OooOOo0(@Nullable String str) {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            int i = Integer.parseInt(str2);
            return z ? -i : i;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long OooOOoo(long j) {
        return j == -9223372036854775807L ? System.currentTimeMillis() : j + SystemClock.elapsedRealtime();
    }

    public static String OooOo(StringBuilder sb, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        String str = j < 0 ? "-" : "";
        long jAbs = (Math.abs(j) + 500) / 1000;
        long j2 = jAbs % 60;
        long j3 = (jAbs / 60) % 60;
        long j4 = jAbs / 3600;
        sb.setLength(0);
        return j4 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j3), Long.valueOf(j2)).toString();
    }

    public static int OooOo0(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    public static int OooOo00(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static long OooOo0O(long j, float f) {
        return f == 1.0f ? j : Math.round(j / ((double) f));
    }

    public static int OooOo0o(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    @Nullable
    public static String OooOoO(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            Log.OooO0Oo("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    public static String[] OooOoO0() {
        String[] strArrSplit;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i = f40595OooO00o;
        if (i >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArrSplit = new String[]{i >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            strArrSplit[i2] = Oooo0OO(strArrSplit[i2]);
        }
        return strArrSplit;
    }

    public static String OooOoOO(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return NewFriendsOld.State_Default;
            case 1:
                return "audio";
            case 2:
                return AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO;
            case 3:
                return ViewHierarchyConstants.TEXT_KEY;
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i >= 10000 ? OooO0OO.OooO00o.OooO00o("custom (", i, ")") : "?";
        }
    }

    public static boolean OooOoo(@Nullable Player player) {
        if (!player.Oooo0O0(1)) {
            return false;
        }
        player.pause();
        return true;
    }

    public static byte[] OooOoo0(String str) {
        return str.getBytes(OooO.f19059OooO0OO);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    public static boolean OooOooO(@Nullable Player player) {
        boolean z;
        int iOooOOoo = player.OooOOoo();
        if (iOooOOoo != 1 || !player.Oooo0O0(2)) {
            if (iOooOOoo == 4 && player.Oooo0O0(4)) {
                player.OooO0o();
            } else {
                z = false;
            }
            if (player.Oooo0O0(1)) {
                return z;
            }
            player.OooO0O0();
            return true;
        }
        player.OooO0OO();
        z = true;
        if (player.Oooo0O0(1)) {
            return z;
        }
        player.OooO0O0();
        return true;
    }

    public static int OooOooo(Uri uri, @Nullable String str) {
        int i;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme != null && OooO0OO.OooO00o("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            String strOooO0O0 = OooO0OO.OooO0O0(lastPathSegment.substring(iLastIndexOf + 1));
            strOooO0O0.getClass();
            switch (strOooO0O0.hashCode()) {
                case 104579:
                    if (strOooO0O0.equals("ism")) {
                    }
                    break;
                case 108321:
                    if (strOooO0O0.equals("mpd")) {
                    }
                    break;
                case 3242057:
                    if (strOooO0O0.equals("isml")) {
                    }
                    break;
                case 3299913:
                    if (strOooO0O0.equals("m3u8")) {
                    }
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                */
            /*
                Method dump skipped, instruction units count: 284
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p245o00oo0o.o0O00.OooOooo(android.net.Uri, java.lang.String):int");
        }

        public static void Oooo(long[] jArr, long j) {
            int i = 0;
            if (j >= AnimationKt.MillisToNanos && j % AnimationKt.MillisToNanos == 0) {
                long j2 = j / AnimationKt.MillisToNanos;
                while (i < jArr.length) {
                    jArr[i] = jArr[i] / j2;
                    i++;
                }
                return;
            }
            if (j >= AnimationKt.MillisToNanos || AnimationKt.MillisToNanos % j != 0) {
                double d = AnimationKt.MillisToNanos / j;
                while (i < jArr.length) {
                    jArr[i] = (long) (jArr[i] * d);
                    i++;
                }
                return;
            }
            long j3 = AnimationKt.MillisToNanos / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j3;
                i++;
            }
        }

        public static boolean Oooo0(Context context) {
            UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
            return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
        }

        public static boolean Oooo000(o00Oo00 o00oo00, o00Oo00 o00oo01, @Nullable Inflater inflater) {
            int i = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
            if (i <= 0) {
                return false;
            }
            if (o00oo01.f40591OooO00o.length < i) {
                o00oo01.OooO00o(i * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            byte[] bArr = o00oo00.f40591OooO00o;
            int i2 = o00oo00.f40592OooO0O0;
            inflater.setInput(bArr, i2, o00oo00.f40593OooO0OO - i2);
            int iInflate = 0;
            while (true) {
                try {
                    byte[] bArr2 = o00oo01.f40591OooO00o;
                    iInflate += inflater.inflate(bArr2, iInflate, bArr2.length - iInflate);
                    if (inflater.finished()) {
                        o00oo01.Oooo000(iInflate);
                        inflater.reset();
                        return true;
                    }
                    if (!inflater.needsDictionary() && !inflater.needsInput()) {
                        byte[] bArr3 = o00oo01.f40591OooO00o;
                        if (iInflate == bArr3.length) {
                            o00oo01.OooO00o(bArr3.length * 2);
                        }
                    }
                    inflater.reset();
                    return false;
                } catch (DataFormatException unused) {
                    inflater.reset();
                    return false;
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            }
        }

        public static String Oooo00O(int i) {
            return Integer.toString(i, 36);
        }

        public static boolean Oooo00o(int i) {
            return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
        }

        public static long Oooo0O0(long j) {
            return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
        }

        public static String Oooo0OO(String str) {
            if (str == null) {
                return null;
            }
            String strReplace = str.replace('_', '-');
            if (!strReplace.isEmpty() && !strReplace.equals("und")) {
                str = strReplace;
            }
            String strOooO0O0 = OooO0OO.OooO0O0(str);
            int i = 0;
            String str2 = strOooO0O0.split("-", 2)[0];
            if (f40604OooOO0O == null) {
                String[] iSOLanguages = Locale.getISOLanguages();
                int length = iSOLanguages.length;
                String[] strArr = f40605OooOO0o;
                HashMap<String, String> map = new HashMap<>(length + strArr.length);
                for (String str3 : iSOLanguages) {
                    try {
                        String iSO3Language = new Locale(str3).getISO3Language();
                        if (!TextUtils.isEmpty(iSO3Language)) {
                            map.put(iSO3Language, str3);
                        }
                    } catch (MissingResourceException unused) {
                    }
                }
                for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                    map.put(strArr[i2], strArr[i2 + 1]);
                }
                f40604OooOO0O = map;
            }
            String str4 = f40604OooOO0O.get(str2);
            if (str4 != null) {
                StringBuilder sbOooO00o = o00OO.OooO00o(str4);
                sbOooO00o.append(strOooO0O0.substring(str2.length()));
                strOooO0O0 = sbOooO00o.toString();
                str2 = str4;
            }
            if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
                return strOooO0O0;
            }
            while (true) {
                String[] strArr2 = f40607OooOOO0;
                if (i >= strArr2.length) {
                    return strOooO0O0;
                }
                if (strOooO0O0.startsWith(strArr2[i])) {
                    return strArr2[i + 1] + strOooO0O0.substring(strArr2[i].length());
                }
                i += 2;
            }
        }

        public static long Oooo0o(String str) throws ParserException {
            int i;
            Matcher matcher = f40601OooO0oO.matcher(str);
            if (!matcher.matches()) {
                throw ParserException.OooO00o("Invalid date/time format: " + str, null);
            }
            if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                i = 0;
            } else {
                i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i != 0 ? timeInMillis - (((long) i) * 60000) : timeInMillis;
        }

        public static Object[] Oooo0o0(int i, Object[] objArr) {
            o00O000o.OooO00o(i <= objArr.length);
            return Arrays.copyOf(objArr, i);
        }

        public static void Oooo0oO(Handler handler, Runnable runnable) {
            if (handler.getLooper().getThread().isAlive()) {
                if (handler.getLooper() == Looper.myLooper()) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
            }
        }

        public static long Oooo0oo(long j, long j2, long j3) {
            if (j3 >= j2 && j3 % j2 == 0) {
                return j / (j3 / j2);
            }
            if (j3 < j2 && j2 % j3 == 0) {
                return (j2 / j3) * j;
            }
            return (long) (j * (j2 / j3));
        }

        public static String OoooO(byte[] bArr) {
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (int i = 0; i < bArr.length; i++) {
                sb.append(Character.forDigit((bArr[i] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i] & 15, 16));
            }
            return sb.toString();
        }

        public static String[] OoooO0(String str) {
            return str.split("/", -1);
        }

        @EnsuresNonNullIf(expression = {"#1"}, result = false)
        public static boolean OoooO00(@Nullable Player player) {
            return player == null || !player.OooOOO() || player.OooOOoo() == 1 || player.OooOOoo() == 4;
        }

        public static String[] OoooO0O(@Nullable String str) {
            return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
        }

        public static long OoooOO0(long j) {
            return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
        }
    }
