package p319o0O0oOo;

import Oooo000.o00O0O;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.umeng.analytics.pro.ak;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import com.zego.zegoliveroom.constants.ZegoConstants;
import io.agora.rtc.Constants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import net.sqlcipher.database.SQLiteDatabase;
import o0OOOO0o.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String[] f36679OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int f36680OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f36681OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String f36682OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String f36683OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final byte[] f36684OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f36685OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public static HashMap<String, String> f36686OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String[] f36687OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final int[] f36688OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final int[] f36689OooOO0O;

    static {
        int i = "R".equals(Build.VERSION.CODENAME) ? 30 : Build.VERSION.SDK_INT;
        f36680OooO00o = i;
        String str = Build.DEVICE;
        f36681OooO0O0 = str;
        String str2 = Build.MANUFACTURER;
        f36682OooO0OO = str2;
        String str3 = Build.MODEL;
        f36683OooO0Oo = str3;
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str2, o0OO00O.OooO00o(str3, o0OO00O.OooO00o(str, 17))));
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        f36685OooO0o0 = sb.toString();
        f36684OooO0o = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f36687OooO0oo = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", ak.ae, "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f36679OooO = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f36688OooOO0 = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f36689OooOO0O = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, IZegoLiveEventCallback.StreamEvent.PlayFail, IZegoLiveEventCallback.StreamEvent.RetryPlayFail, 144, Constants.ERR_PUBLISH_STREAM_CDN_ERROR, 158, Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED, 140, 139, Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, IZegoLiveEventCallback.StreamEvent.PlayEnd, 219, 220, 213, 210, KotlinVersion.MAX_COMPONENT_VALUE, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 171, 172, 165, 162, 143, 136, Constants.ERR_WATERMARK_READ, 134, 147, 148, Constants.ERR_MODULE_NOT_FOUND, Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, Constants.ERR_PUBLISH_STREAM_NOT_FOUND, Constants.ERR_PUBLISH_STREAM_FORMAT_NOT_SUPPORTED, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, Constants.ERR_ALREADY_IN_RECORDING, 167, 178, 181, 188, 187, 150, 145, Constants.ERR_PUBLISH_STREAM_NUM_REACH_LIMIT, 159, 138, ZegoConstants.RoomError.SessionError, 132, 131, 222, 217, 208, 215, 194, 197, IZegoLiveEventCallback.StreamEvent.RetryPlaySuccess, IZegoLiveEventCallback.StreamEvent.RetryPlayStart, 230, 225, 232, 239, SQLiteDatabase.MAX_SQL_CACHE_SIZE, 253, 244, 243};
    }

    public static long OooO(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
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

    public static int OooO0OO(o0000O0O o0000o0o2, long j) {
        int i = o0000o0o2.f36705OooO00o - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            if (o0000o0o2.OooO0O0(i3) < j) {
                i2 = i3 + 1;
            } else {
                i = i3 - 1;
            }
        }
        int i4 = i + 1;
        if (i4 < o0000o0o2.f36705OooO00o && o0000o0o2.OooO0O0(i4) == j) {
            return i4;
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public static int OooO0Oo(int[] iArr, int i) {
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            return -(iBinarySearch + 2);
        }
        do {
            iBinarySearch--;
            if (iBinarySearch < 0) {
                break;
            }
        } while (iArr[iBinarySearch] == i);
        return iBinarySearch;
    }

    public static void OooO0o(@Nullable Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static int OooO0o0(long[] jArr, long j, boolean z) {
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

    public static float OooO0oO(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public static int OooO0oo(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static Handler OooOO0() {
        return new Handler(OooOOOo(), null);
    }

    public static String OooOO0O(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String OooOO0o(byte[] bArr) {
        return new String(bArr, OooO0o.f38252OooO0OO);
    }

    public static int OooOOO(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return IZegoLiveEventCallback.StreamEvent.RetryPlaySuccess;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f36680OooO00o;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static String OooOOO0(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, OooO0o.f38252OooO0OO);
    }

    public static Point OooOOOO(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Objects.requireNonNull(windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        int i = f36680OooO00o;
        if (i <= 29 && defaultDisplay.getDisplayId() == 0 && OooOoOO(context)) {
            if ("Sony".equals(f36682OooO0OO) && f36683OooO0Oo.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            String strOooOo0o = i < 28 ? OooOo0o("sys.display-size") : OooOo0o("vendor.display-size");
            if (!TextUtils.isEmpty(strOooOo0o)) {
                try {
                    String[] strArrSplit = strOooOo0o.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i2 = Integer.parseInt(strArrSplit[0]);
                        int i3 = Integer.parseInt(strArrSplit[1]);
                        if (i2 > 0 && i3 > 0) {
                            return new Point(i2, i3);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String strValueOf = String.valueOf(strOooOo0o);
                Log.e("Util", strValueOf.length() != 0 ? "Invalid display size: ".concat(strValueOf) : new String("Invalid display size: "));
            }
        }
        Point point = new Point();
        int i4 = f36680OooO00o;
        if (i4 >= 23) {
            Display.Mode mode = defaultDisplay.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        }
        if (i4 >= 17) {
            defaultDisplay.getRealSize(point);
            return point;
        }
        defaultDisplay.getSize(point);
        return point;
    }

    public static Looper OooOOOo() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static int OooOOo(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type != 4 && type != 5) {
                    if (type != 6) {
                        return type != 9 ? 8 : 7;
                    }
                    return 5;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                    return 3;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                case 17:
                    return 4;
                case 13:
                    return 5;
                case 16:
                case 19:
                default:
                    return 6;
                case 18:
                    return 2;
                case 20:
                    return f36680OooO00o >= 29 ? 9 : 0;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public static long OooOOo0(long j, float f) {
        return f == 1.0f ? j : Math.round(j * ((double) f));
    }

    public static int OooOOoo(int i) {
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

    public static String OooOo(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        String str2 = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str2, o0OO00O.OooO00o(str, "player".length() + 38)));
        sb.append("player");
        sb.append("/");
        sb.append(str);
        sb.append(" (Linux;Android ");
        return o00O0O.OooO00o(sb, str2, ") ", "ExoPlayerLib/2.12.1");
    }

    public static int OooOo0(int i) {
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

    public static int OooOo00(int i, int i2) {
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

    public static String[] OooOo0O() {
        String[] strArrSplit;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i = f36680OooO00o;
        if (i >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            String[] strArr = new String[1];
            Locale locale = configuration.locale;
            strArr[0] = i >= 21 ? locale.toLanguageTag() : locale.toString();
            strArrSplit = strArr;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            strArrSplit[i2] = OooOoo0(strArrSplit[i2]);
        }
        return strArrSplit;
    }

    @Nullable
    public static String OooOo0o(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            o0000O0.OooO0O0("Util", str.length() != 0 ? "Failed to read system property ".concat(str) : new String("Failed to read system property "), e);
            return null;
        }
    }

    public static boolean OooOoO(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    public static byte[] OooOoO0(String str) {
        return str.getBytes(OooO0o.f38252OooO0OO);
    }

    public static boolean OooOoOO(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static <T> T[] OooOoo(T[] tArr, int i) {
        o00000O0.OooO00o(i <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i);
    }

    public static String OooOoo0(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !"und".equals(strReplace)) {
            str = strReplace;
        }
        String strOooo0 = Oooo0(str);
        int i = 0;
        String str2 = strOooo0.split("-", 2)[0];
        if (f36686OooO0oO == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f36687OooO0oo.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            int i2 = 0;
            while (true) {
                String[] strArr = f36687OooO0oo;
                if (i2 >= strArr.length) {
                    break;
                }
                map.put(strArr[i2], strArr[i2 + 1]);
                i2 += 2;
            }
            f36686OooO0oO = map;
        }
        String str4 = f36686OooO0oO.get(str2);
        if (str4 != null) {
            String strValueOf = String.valueOf(strOooo0.substring(str2.length()));
            strOooo0 = strValueOf.length() != 0 ? str4.concat(strValueOf) : new String(str4);
            str2 = str4;
        }
        if (!"no".equals(str2) && !ak.aC.equals(str2) && !"zh".equals(str2)) {
            return strOooo0;
        }
        while (true) {
            String[] strArr2 = f36679OooO;
            if (i >= strArr2.length) {
                return strOooo0;
            }
            if (strOooo0.startsWith(strArr2[i])) {
                String strValueOf2 = String.valueOf(strArr2[i + 1]);
                String strValueOf3 = String.valueOf(strOooo0.substring(strArr2[i].length()));
                return strValueOf3.length() != 0 ? strValueOf2.concat(strValueOf3) : new String(strValueOf2);
            }
            i += 2;
        }
    }

    public static boolean OooOooO(Handler handler, Runnable runnable) {
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static long OooOooo(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return (j2 / j3) * j;
        }
        return (long) (j * (j2 / j3));
    }

    public static String Oooo0(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    public static void Oooo000(long[] jArr, long j) {
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long j2 = j / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j2;
                i++;
            }
            return;
        }
        if (j >= 1000000 || 1000000 % j != 0) {
            double d = 1000000 / j;
            while (i < jArr.length) {
                jArr[i] = (long) (jArr[i] * d);
                i++;
            }
            return;
        }
        long j3 = 1000000 / j;
        while (i < jArr.length) {
            jArr[i] = jArr[i] * j3;
            i++;
        }
    }

    @Nullable
    public static ComponentName Oooo00O(Context context, Intent intent) {
        return f36680OooO00o >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    public static byte[] Oooo00o(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static long Oooo0O0(int i) {
        return ((long) i) & 4294967295L;
    }
}
