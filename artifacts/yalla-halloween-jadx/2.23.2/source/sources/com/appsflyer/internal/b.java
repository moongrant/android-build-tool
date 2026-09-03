package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.facebook.appevents.AppEventsConstants;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
final class b {
    private static int AppsFlyer2dXConversionCallback = 0;
    private static int init = 1;
    private static char[] values = {24770, 58554, 26665, 60852, 28944, 63129, 31245, 65484, 17263, 51433, 19561, 53723, 21831, 56000, 24142, 41524, 10154, 43882, 12457, 46099, 14723, 48389, 745, 34426, 3044, 36690, 5324, 39011, 7622, 25014, 58672, 27309, 60966, 29574, '0', 'j', 33814, 2200, 36100, 4594, 38458, 6821, 40815, 9164, 43074, 11478, 45433, 13821, 47737, 43847, 12156, 41959, 9838, 47836, 15710, 38412, 4688, 40644, 6985, 34808, 'o', 36080, 2403, 46514, 15896, 47754, 10039, 41899, 11312, 43172, 21721, 53585};
    private static long AFKeystoreWrapper = 7346225891104818295L;
    private static int AFInAppEventParameterName = 0;
    private static char valueOf = 0;
    private static long AFInAppEventType = -8381164938660999162L;

    private static String AFInAppEventType(Context context) {
        int i = AppsFlyer2dXConversionCallback + 55;
        init = i % 128;
        int i2 = i % 2;
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            int i3 = AppsFlyer2dXConversionCallback + 111;
            init = i3 % 128;
            if (!(i3 % 2 == 0)) {
                return str;
            }
            throw null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static boolean valueOf(String str) {
        int i = AppsFlyer2dXConversionCallback + 47;
        init = i % 128;
        boolean z = true;
        try {
            if (i % 2 != 0) {
                Class.forName(str);
            } else {
                Class.forName(str);
                z = false;
            }
            return z;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x030d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0330  */
    @Nullable
    public static String values(Context context, long j) {
        String strIntern;
        String strValues;
        char c;
        String strValueOf;
        String strValueOf2;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb2.append((valueOf(valueOf((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24739), (KeyEvent.getMaxKeyCode() >> 16) + 34, ExpandableListView.getPackedPositionType(0L)).intern()) ? values("ဆ쌧Ụ记", "ᙣ⋈唾ߨ", 1025689622 - Color.rgb(0, 0, 0), "꽯", (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 59476)) : valueOf((char) (ImageFormat.getBitsPerPixel(0) + 1), -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34)).intern());
        StringBuilder sb4 = new StringBuilder();
        String packageName = context.getPackageName();
        String strValues2 = values(packageName);
        sb2.append(values("ဆ쌧Ụ记", "ᙣ⋈唾ߨ", TextUtils.getOffsetAfter("", 0) + 1042466838, "꽯", (char) (59477 - TextUtils.indexOf("", ""))).intern());
        sb4.append(strValues2);
        if ((valueOf(context) == null ? '2' : (char) 22) != '2') {
            sb2.append(values("ဆ쌧Ụ记", "ᙣ⋈唾ߨ", 1042466838 - Color.red(0), "꽯", (char) (View.MeasureSpec.getSize(0) + 59477)).intern());
            sb4.append(packageName);
        } else {
            int i = AppsFlyer2dXConversionCallback + 37;
            init = i % 128;
            int i2 = i % 2;
            sb2.append(valueOf((char) TextUtils.getOffsetAfter("", 0), -TextUtils.indexOf((CharSequence) "", '0', 0), 35 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
            sb4.append(packageName);
        }
        String strAFInAppEventType = AFInAppEventType(context);
        if (strAFInAppEventType == null) {
            sb2.append(valueOf((char) Color.argb(0, 0, 0, 0), -TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 34).intern());
            sb4.append(packageName);
        } else {
            sb2.append(values("ဆ쌧Ụ记", "ᙣ⋈唾ߨ", View.MeasureSpec.getMode(0) + 1042466838, "꽯", (char) (59478 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern());
            sb4.append(strAFInAppEventType);
        }
        sb4.append(Boolean.TRUE.toString());
        sb.append(sb4.toString());
        try {
            sb.append(new SimpleDateFormat(values("ဆ쌧Ụ记", "鮲㴾㿺ࠐ", ViewConfiguration.getMinimumFlingVelocity() >> 16, "덺㰂\uf6b8\u0883ᖗ⇷儼䝰绷쨮ꓳ⺇\ue5f1塘\ud979䗡뤘角", (char) (4159 - Color.alpha(0))).intern(), Locale.US).format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
            sb.append(j);
            sb3.append((valueOf(values("ဆ쌧Ụ记", "ᘛá碚\uebf7", TextUtils.indexOf((CharSequence) "", '0') + (-1711218409), "⧙\uda24ꥈ왓ี彾氨涉노ᚴ䲗襠怂\uf11a皹\ue2ccꛘ잷Ꮘ\uf08b꾺㴹ﶍ\ufae3뫠", (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern()) ? values("ဆ쌧Ụ记", "ᙣ⋈唾ߨ", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1042466837, "꽯", (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 59477)) : valueOf((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 1 - TextUtils.getOffsetAfter("", 0), 35 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern());
            if ((valueOf(values("ဆ쌧Ụ记", "ꊉ뇕\ue7da쐦", (-625879646) - (ViewConfiguration.getEdgeSlop() >> 16), "ᚍ潴氳ዼ쿔槝퉊櫱椮\uf4b6\uebc7ﺔ滎Ŝⴉ毁뉉쯚ヌ⢹夝潝\ue15c", (char) Color.alpha(0)).intern()) ? (char) 25 : Typography.greater) == 25) {
                int i3 = init + 45;
                AppsFlyer2dXConversionCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    strValues = values("ဆ쌧Ụ记", "ᙣ⋈唾ߨ", (ViewConfiguration.getPressedStateDuration() >> 16) + 1042466838, "꽯", (char) (59477 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                } else {
                    strIntern = values("ဆ쌧Ụ记", "ᙣ⋈唾ߨ", 1042466838 >> (ViewConfiguration.getPressedStateDuration() + 127), "꽯", (char) (59477 - (AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1)))).intern();
                }
                sb3.append(strIntern);
                if (valueOf(values("ဆ쌧Ụ记", "示\ue896㨊ꤟ", ViewConfiguration.getTapTimeout() >> 16, "빲䬨Ꮹ媙桡㟨\u20ce\udc08Ⴏ싕譌\ue245뮺\ue411跽蒉┌䴿븼\uec99", (char) View.resolveSize(0, 0)).intern())) {
                    c = 23;
                } else {
                    c = '\r';
                }
                if (c != '\r') {
                    strValueOf = values("ဆ쌧Ụ记", "ᙣ⋈唾ߨ", Drawable.resolveOpacity(0, 0) + 1042466838, "꽯", (char) (59477 - View.MeasureSpec.makeMeasureSpec(0, 0)));
                } else {
                    strValueOf = valueOf((char) (Color.rgb(0, 0, 0) + 16777216), AndroidCharacter.getMirror('0') - '/', TextUtils.indexOf((CharSequence) "", '0', 0) + 35);
                }
                sb3.append(strValueOf.intern());
                if (valueOf(values("ဆ쌧Ụ记", "迴\udbc3鬦蝌", View.MeasureSpec.getSize(0) + 651936655, "蠰啅燸梳絝糛垕̿✁\udc57ᔽﴼ鴂蒕鸉", (char) (19611 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).intern())) {
                    int i4 = AppsFlyer2dXConversionCallback + 79;
                    init = i4 % 128;
                    int i5 = i4 % 2;
                    strValueOf2 = values("ဆ쌧Ụ记", "ᙣ⋈唾ߨ", 1042466837 - TextUtils.indexOf((CharSequence) "", '0'), "꽯", (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 59477));
                } else {
                    strValueOf2 = valueOf((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1 - (ViewConfiguration.getPressedStateDuration() >> 16), 33 - TextUtils.lastIndexOf("", '0', 0, 0));
                }
                sb3.append(strValueOf2.intern());
                String strValueOf3 = af.valueOf(af.AFInAppEventType(sb.toString()));
                String string = sb2.toString();
                StringBuilder sb5 = new StringBuilder(strValueOf3);
                sb5.setCharAt(17, Integer.toString(Integer.parseInt(string, 2), 16).charAt(0));
                String string2 = sb5.toString();
                String string3 = sb3.toString();
                StringBuilder sb6 = new StringBuilder(string2);
                sb6.setCharAt(27, Integer.toString(Integer.parseInt(string3, 2), 16).charAt(0));
                return values(sb6.toString(), Long.valueOf(j));
            }
            strValues = valueOf((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 1 - View.MeasureSpec.makeMeasureSpec(0, 0), (Process.myPid() >> 22) + 34);
            strIntern = strValues.intern();
            sb3.append(strIntern);
            if (valueOf(values("ဆ쌧Ụ记", "示\ue896㨊ꤟ", ViewConfiguration.getTapTimeout() >> 16, "빲䬨Ꮹ媙桡㟨\u20ce\udc08Ⴏ싕譌\ue245뮺\ue411跽蒉┌䴿븼\uec99", (char) View.resolveSize(0, 0)).intern())) {
                c = 23;
            } else {
                c = '\r';
            }
            if (c != '\r') {
                strValueOf = values("ဆ쌧Ụ记", "ᙣ⋈唾ߨ", Drawable.resolveOpacity(0, 0) + 1042466838, "꽯", (char) (59477 - View.MeasureSpec.makeMeasureSpec(0, 0)));
            } else {
                strValueOf = valueOf((char) (Color.rgb(0, 0, 0) + 16777216), AndroidCharacter.getMirror('0') - '/', TextUtils.indexOf((CharSequence) "", '0', 0) + 35);
            }
            sb3.append(strValueOf.intern());
            if (valueOf(values("ဆ쌧Ụ记", "迴\udbc3鬦蝌", View.MeasureSpec.getSize(0) + 651936655, "蠰啅燸梳絝糛垕̿✁\udc57ᔽﴼ鴂蒕鸉", (char) (19611 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).intern())) {
                int i6 = AppsFlyer2dXConversionCallback + 79;
                init = i6 % 128;
                int i7 = i6 % 2;
                strValueOf2 = values("ဆ쌧Ụ记", "ᙣ⋈唾ߨ", 1042466837 - TextUtils.indexOf((CharSequence) "", '0'), "꽯", (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 59477));
            } else {
                strValueOf2 = valueOf((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1 - (ViewConfiguration.getPressedStateDuration() >> 16), 33 - TextUtils.lastIndexOf("", '0', 0, 0));
            }
            sb3.append(strValueOf2.intern());
            String strValueOf4 = af.valueOf(af.AFInAppEventType(sb.toString()));
            String string4 = sb2.toString();
            StringBuilder sb7 = new StringBuilder(strValueOf4);
            sb7.setCharAt(17, Integer.toString(Integer.parseInt(string4, 2), 16).charAt(0));
            String string5 = sb7.toString();
            String string6 = sb3.toString();
            StringBuilder sb8 = new StringBuilder(string5);
            sb8.setCharAt(27, Integer.toString(Integer.parseInt(string6, 2), 16).charAt(0));
            return values(sb8.toString(), Long.valueOf(j));
        } catch (PackageManager.NameNotFoundException unused) {
            return values("ဆ쌧Ụ记", "鿷\u2b74ጇ⋿", TextUtils.getTrimmedLength(""), "狟뫦ዥ渖脋┻煑\uf2f2ﺬ\ue37e툐鼰罼絕䇳甫멪瘖뤐⣒犤내곐呪鋹뭟ࡂ赚\ueedbᚦﺎ價", (char) (65303 - AndroidCharacter.getEastAsianWidth('0'))).intern();
        }
    }

    private static String valueOf(Context context) {
        String strGroup = null;
        if (System.getProperties().containsKey(valueOf((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, 35 - (Process.myTid() >> 22)).intern())) {
            try {
                Matcher matcher = Pattern.compile(values("ဆ쌧Ụ记", "㕇酱嘑瑯", Color.argb(0, 0, 0, 0), "䆷誇\ue617န튼鮾⸌䃄\u137d䶰", (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()).matcher(context.getCacheDir().getPath().replace(valueOf((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43880), 6 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 50 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), ""));
                strGroup = (matcher.find() ? '?' : (char) 23) != 23 ? matcher.group(1) : null;
                int i = init + 29;
                AppsFlyer2dXConversionCallback = i % 128;
                int i2 = i % 2;
            } catch (Exception e2) {
                if (ak.AFInAppEventType == null) {
                    ak.AFInAppEventType = new ak();
                }
                ak akVar = ak.AFInAppEventType;
                String strIntern = valueOf((char) (Color.rgb(0, 0, 0) + 16815695), 21 - AndroidCharacter.getEastAsianWidth('0'), TextUtils.indexOf((CharSequence) "", '0') + 56).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(values("ဆ쌧Ụ记", "䛿࿆馼\ue65e", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1139816890, "㴭癐䉙꼨ᥩ⅏➹秨䵖팟뵐葠\ue57e⅔加\ue412ꨵŜ䎃ટ㚫㕃䶹㙲컿惥ꑷ蟀帼豜\uf348⒁ᩢꩾ麳ᅿ跚捻뢎墕嬓", (char) (TextUtils.indexOf("", "", 0) + 24217)).intern());
                sb.append(e2);
                akVar.valueOf(null, strIntern, sb.toString());
                int i3 = init + 119;
                AppsFlyer2dXConversionCallback = i3 % 128;
                if ((i3 % 2 == 0 ? 'U' : (char) 1) == 'U') {
                    return null;
                }
                throw null;
            }
        }
        return strGroup;
    }

    public static class e extends HashMap<String, Object> {
        private static int AFInAppEventParameterName = 546913058;
        private static int AFKeystoreWrapper = 29;
        private static short[] AppsFlyer2dXConversionCallback = null;
        private static int onDeepLinkingNative = 1;
        private static int onInstallConversionDataLoadedNative = 0;
        private static int valueOf = 1687238226;
        private final Context AFInAppEventType;
        private final Map<String, Object> values;
        private static byte[] AFVersionDeclaration = {3, 12, -19, 1, 14, -8, 4, -11, 21, -7, 5, -10, 13, -17, 16, 0, 0, 0, -45, 1, -6, 5, -6, 6, -8, -4, -53, -15, 69, -26, -52, -1, 6, -11, 4, 11, 2, -21, 19, 69, -72, -12, 11, -14, 87, -69, -16, 9, 11, -21, 86, -70, 1, -6, 75, -71, -7, 5, -11, 19, -17, 13, -9, 9, -2, 71, -68, -1, -7, 3, 8, -5, 7, 1, -2, -52, 53, -8, -43, 52, -4, -1, 5, -53, 4, -4, 3, 1, -1, -13, -3, 1, 19, -17, 13, -11, 3, 8, -15, 82, 77, 74, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        private static int getLevel = 12;
        private static char[] init = {'Z', '[', 'k', 'N', '^', 'M', 'P', 'w', 'q', 'r', 'm', 'u', 'x', 'p', ',', 's', 'z', '~', 128, 133, 131, 't', 132, 'o', '|', '{', 'F', 127, 'X', 129, ':', '`', 'Q', 'e', 'O', 'T', 'S', 'D', 'B', 'n', Typography.less, '}', '=', Typography.greater, 'y'};
        private static boolean onAttributionFailureNative = true;
        private static boolean AFLogger$LogLevel = true;

        public static class a {
            Boolean AFInAppEventParameterName;
            public final String AFKeystoreWrapper;
            public final Boolean valueOf;

            public a() {
            }

            public a(String str, Boolean bool) {
                this.AFKeystoreWrapper = str;
                this.valueOf = bool;
            }

            @NonNull
            public static byte[] AFInAppEventType(@NonNull String str) throws Exception {
                return str.getBytes();
            }

            public static byte[] AFKeystoreWrapper(@NonNull byte[] bArr) throws Exception {
                for (int i = 0; i < bArr.length; i++) {
                    bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
                }
                return bArr;
            }

            @NonNull
            public static String values(@NonNull byte[] bArr) throws Exception {
                StringBuilder sb = new StringBuilder();
                for (byte b : bArr) {
                    String hexString = Integer.toHexString(b);
                    if (hexString.length() == 1) {
                        hexString = AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(hexString);
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            }
        }

        public e(Map<String, Object> map, Context context) {
            this.values = map;
            this.AFInAppEventType = context;
            put(AFInAppEventParameterName(), valueOf());
        }

        @NonNull
        private String AFInAppEventParameterName() {
            int i = onDeepLinkingNative + 99;
            onInstallConversionDataLoadedNative = i % 128;
            int i2 = i % 2;
            try {
                String string = Integer.toString(Build.VERSION.SDK_INT);
                String string2 = this.values.get(values((-546912961) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) ((Process.getThreadPriority(0) + 20) >> 6), (byte) (Color.rgb(0, 0, 0) + 16777216), TextUtils.indexOf("", "", 0, 0) - 17, View.MeasureSpec.makeMeasureSpec(0, 0) - 1687238226).intern()).toString();
                String string3 = this.values.get(values((-546912960) - Color.blue(0), (short) (Process.myTid() >> 22), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-24) - ExpandableListView.getPackedPositionGroup(0L), AndroidCharacter.getMirror('0') - 13943).intern()).toString();
                if (!(string3 != null)) {
                    int i3 = onDeepLinkingNative + 39;
                    onInstallConversionDataLoadedNative = i3 % 128;
                    string3 = (i3 % 2 != 0 ? AFKeystoreWrapper("\u0087\u0081\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 32248 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))) : AFKeystoreWrapper("\u0087\u0081\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern();
                    int i4 = onInstallConversionDataLoadedNative + 99;
                    onDeepLinkingNative = i4 % 128;
                    int i5 = i4 % 2;
                }
                StringBuilder sb = new StringBuilder(string2);
                sb.reverse();
                StringBuilder sbAFKeystoreWrapper = AFKeystoreWrapper(string, string3, sb.toString());
                int length = sbAFKeystoreWrapper.length();
                if (length > 4) {
                    sbAFKeystoreWrapper.delete(4, length);
                } else {
                    while (length < 4) {
                        length++;
                        sbAFKeystoreWrapper.append('1');
                    }
                }
                sbAFKeystoreWrapper.insert(0, AFKeystoreWrapper("\u008a\u0089\u0088", null, null, 127 - ExpandableListView.getPackedPositionGroup(0L)).intern());
                String string4 = sbAFKeystoreWrapper.toString();
                int i6 = onDeepLinkingNative + 27;
                onInstallConversionDataLoadedNative = i6 % 128;
                if (i6 % 2 == 0) {
                    return string4;
                }
                throw null;
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AFKeystoreWrapper("\u008f\u009b\u0091\u009a\u008c\u0093\u0099\u0089\u0098\u0097\u0089\u008f\u0096\u0093\u008c\u0095\u008f\u0094\u0089\u0088\u008f\u008a\u0089\u0088\u008f\u0090\u0091\u008c\u0093\u008b\u0092\u0089\u0091\u0089\u0090\u008f\u008e\u0089\u008d\u008c\u008b\u008a", null, null, 127 - Color.green(0)).intern());
                sb2.append(e);
                AFLogger.AFKeystoreWrapper(sb2.toString());
                return values(Color.blue(0) - 546912951, (short) (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (ViewConfiguration.getEdgeSlop() >> 16), (-22) - ((Process.getThreadPriority(0) + 20) >> 6), (-1687238211) - Color.green(0)).intern();
            }
        }

        private static StringBuilder AFKeystoreWrapper(@NonNull String... strArr) throws Exception {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < 3) {
                int i2 = onInstallConversionDataLoadedNative + 1;
                onDeepLinkingNative = i2 % 128;
                int i3 = i2 % 2;
                arrayList.add(Integer.valueOf(strArr[i].length()));
                i++;
                int i4 = onInstallConversionDataLoadedNative + 121;
                onDeepLinkingNative = i4 % 128;
                int i5 = i4 % 2;
            }
            Collections.sort(arrayList);
            int iIntValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb = new StringBuilder();
            int i6 = 0;
            while (true) {
                if (i6 >= iIntValue) {
                    int i7 = onInstallConversionDataLoadedNative + 121;
                    onDeepLinkingNative = i7 % 128;
                    int i8 = i7 % 2;
                    return sb;
                }
                Integer numValueOf = null;
                for (int i9 = 0; i9 < 3; i9++) {
                    int iCharAt = strArr[i9].charAt(i6);
                    if ((numValueOf == null ? (char) 4 : '=') == '=') {
                        iCharAt ^= numValueOf.intValue();
                    }
                    numValueOf = Integer.valueOf(iCharAt);
                }
                sb.append(Integer.toHexString(numValueOf.intValue()));
                i6++;
            }
        }

        /* JADX WARN: Code duplicated, block: B:26:0x01f7  */
        private String valueOf() {
            String string;
            int i;
            try {
                String string2 = this.values.get(values((-546912961) - TextUtils.indexOf("", "", 0, 0), (short) (ViewConfiguration.getTouchSlop() >> 8), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (-17) - (Process.myTid() >> 22), (-1687238227) - Process.getGidForName("")).intern()).toString();
                String string3 = this.values.get(AFKeystoreWrapper("\u0089\u0093\u008b\u0087\u0096\u0098\u0091\u009e\u008b\u009d\u0093\u009c\u0092\u008c\u008a", null, null, (-16777089) - Color.rgb(0, 0, 0)).intern()).toString();
                String strReplaceAll = values((-546913000) - AndroidCharacter.getEastAsianWidth('0'), (short) (PhoneNumberUtils.toaFromString("") - 129), (byte) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) - 23, Color.red(0) - 1687238205).intern().replaceAll(values((-546913012) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) Color.green(0), (byte) TextUtils.indexOf("", ""), TextUtils.indexOf("", "", 0) - 24, (-1687238201) - ExpandableListView.getPackedPositionGroup(0L)).intern(), "");
                StringBuilder sb = new StringBuilder();
                sb.append(string2);
                sb.append(string3);
                sb.append(strReplaceAll);
                String strAFInAppEventType = af.AFInAppEventType(sb.toString());
                StringBuilder sb2 = new StringBuilder("");
                sb2.append(strAFInAppEventType.substring(0, 16));
                string = sb2.toString();
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(values((-546912956) - TextUtils.getTrimmedLength(""), (short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) (AndroidCharacter.getEastAsianWidth('0') - 4), (Process.myPid() >> 22) + 15, (ViewConfiguration.getLongPressTimeout() >> 16) - 1687238197).intern());
                sb3.append(e);
                AFLogger.AFKeystoreWrapper(sb3.toString());
                StringBuilder sb4 = new StringBuilder("");
                sb4.append(values((-546912960) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) TextUtils.getCapsMode("", 0, 0), (-11) - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf("", "", 0) - 1687238154).intern());
                string = sb4.toString();
            }
            String str = string;
            try {
                Intent intentRegisterReceiver = this.AFInAppEventType.registerReceiver(null, new IntentFilter(AFKeystoreWrapper("\u0087¡¥\u0081\u0086¤£\u0083¢\u0085¡  \u0086\u0084\u009f\u0091\u009a\u008c\u0093\u0098\u008b\u009f\u0093\u0091\u0089\u0093\u0091\u008c\u009f\u008e\u008c\u009a\u0092\u008e\u0091\u008b", null, null, 127 - KeyEvent.getDeadChar(0, 0)).intern()));
                int intExtra = -2700;
                char c = 2;
                if (intentRegisterReceiver != null) {
                    int i2 = onInstallConversionDataLoadedNative + 3;
                    onDeepLinkingNative = i2 % 128;
                    int i3 = i2 % 2;
                    intExtra = intentRegisterReceiver.getIntExtra(values((-546912942) - ((Process.getThreadPriority(0) + 20) >> 6), (short) (ExpandableListView.getPackedPositionChild(0L) + 1), (byte) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getPressedStateDuration() >> 16) - 18, (-1687238137) - TextUtils.getTrimmedLength("")).intern(), -2700);
                    int i4 = onDeepLinkingNative + 83;
                    onInstallConversionDataLoadedNative = i4 % 128;
                    int i5 = i4 % 2;
                }
                String str2 = this.AFInAppEventType.getApplicationInfo().nativeLibraryDir;
                if (str2 == null) {
                    i = 0;
                } else {
                    if (!str2.contains(AFKeystoreWrapper("§¦\u0097", null, null, 126 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                        c = '>';
                    }
                    if (c != '>') {
                        i = 1;
                    } else {
                        i = 0;
                    }
                }
                int size = ((SensorManager) this.AFInAppEventType.getSystemService(AFKeystoreWrapper("\u0092\u009a\u009c\u0091\u0089\u009c", null, null, 127 - (Process.myPid() >> 22)).intern())).getSensorList(-1).size();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(AFKeystoreWrapper("¨", null, null, TextUtils.indexOf((CharSequence) "", '0', 0) + 128).intern());
                sb5.append(intExtra);
                sb5.append(values(View.resolveSize(0, 0) - 546913020, (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), Color.argb(0, 0, 0, 0) - 27, TextUtils.indexOf((CharSequence) "", '0', 0) - 1687238126).intern());
                sb5.append(i);
                sb5.append(values((-546913021) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) (AndroidCharacter.getEastAsianWidth('0') - 4), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 102 - PhoneNumberUtils.toaFromString(""), (-1687238126) - TextUtils.getCapsMode("", 0, 0)).intern());
                sb5.append(size);
                sb5.append(values((-546913020) - ExpandableListView.getPackedPositionType(0L), (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) - 27, (-1687238125) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
                sb5.append(this.values.size());
                String string4 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(a.values(a.AFKeystoreWrapper(a.AFInAppEventType(string4))));
                return sb6.toString();
            } catch (Exception e2) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(values((-563690172) - Color.rgb(0, 0, 0), (short) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (byte) TextUtils.getTrimmedLength(""), 15 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getOffsetBefore("", 0) - 1687238197).intern());
                sb7.append(e2);
                AFLogger.AFKeystoreWrapper(sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(AFKeystoreWrapper("\u00ad\u008b\u0093\u0096\u0098¬¬\u0099«\u0099«ª©ª©\u008a", null, null, 256 - PhoneNumberUtils.toaFromString("")).intern());
                return sb8.toString();
            }
        }

        private static String values(int i, short s, byte b, int i2, int i3) {
            int i4;
            int i5;
            StringBuilder sb = new StringBuilder();
            int i6 = AFKeystoreWrapper;
            int i7 = i2 + i6;
            int i8 = 0;
            int i9 = 1;
            boolean z = i7 == -1;
            if (z) {
                byte[] bArr = AFVersionDeclaration;
                i7 = (bArr != null ? ']' : 'U') != 'U' ? (byte) (bArr[valueOf + i3] + i6) : (short) (AppsFlyer2dXConversionCallback[valueOf + i3] + i6);
            }
            if (i7 > 0) {
                int i10 = ((i3 + i7) - 2) + valueOf;
                if (z) {
                    int i11 = onDeepLinkingNative + 51;
                    onInstallConversionDataLoadedNative = i11 % 128;
                    int i12 = i11 % 2;
                    i8 = 1;
                }
                int i13 = i10 + i8;
                char c = (char) (i + AFInAppEventParameterName);
                sb.append(c);
                while (i9 < i7) {
                    byte[] bArr2 = AFVersionDeclaration;
                    if ((bArr2 != null ? '#' : (char) 16) != '#') {
                        i4 = i13 - 1;
                        i5 = (short) (AppsFlyer2dXConversionCallback[i13] + s);
                    } else {
                        i4 = i13 - 1;
                        i5 = (byte) (bArr2[i13] + s);
                    }
                    c = (char) (c + (i5 ^ b));
                    i13 = i4;
                    sb.append(c);
                    i9++;
                    int i14 = onInstallConversionDataLoadedNative + 95;
                    onDeepLinkingNative = i14 % 128;
                    int i15 = i14 % 2;
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001d  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v1, types: [char[]] */
        /* JADX WARN: Type inference failed for: r7v2 */
        private static String AFKeystoreWrapper(String str, int[] iArr, String str2, int i) throws UnsupportedEncodingException {
            int i2 = onInstallConversionDataLoadedNative + 43;
            onDeepLinkingNative = i2 % 128;
            int i3 = 0;
            if (i2 % 2 == 0) {
                int i4 = 40 / 0;
                if ((str2 != 0 ? ']' : 'R') != 'R') {
                    str2 = str2.toCharArray();
                }
            } else if (str2 != 0) {
                str2 = str2.toCharArray();
            }
            char[] cArr = (char[]) str2;
            Object bytes = str;
            if (str != null) {
                bytes = str.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            char[] cArr2 = init;
            int i5 = getLevel;
            if (onAttributionFailureNative) {
                int length = bArr.length;
                char[] cArr3 = new char[length];
                int i6 = onDeepLinkingNative + 9;
                onInstallConversionDataLoadedNative = i6 % 128;
                int i7 = i6 % 2;
                while (true) {
                    if ((i3 < length ? '`' : Typography.less) != '`') {
                        break;
                    }
                    cArr3[i3] = (char) (cArr2[bArr[(length - 1) - i3] + i] - i5);
                    i3++;
                }
                String str3 = new String(cArr3);
                int i8 = onInstallConversionDataLoadedNative + 89;
                onDeepLinkingNative = i8 % 128;
                if (i8 % 2 != 0) {
                    return str3;
                }
                throw null;
            }
            if (AFLogger$LogLevel) {
                int length2 = cArr.length;
                char[] cArr4 = new char[length2];
                int i9 = onDeepLinkingNative + 29;
                onInstallConversionDataLoadedNative = i9 % 128;
                int i10 = i9 % 2;
                while (true) {
                    if ((i3 < length2 ? Typography.amp : (char) 24) != 24) {
                        cArr4[i3] = (char) (cArr2[cArr[(length2 - 1) - i3] - i] - i5);
                        i3++;
                    } else {
                        return new String(cArr4);
                    }
                }
            } else {
                int length3 = iArr.length;
                char[] cArr5 = new char[length3];
                int i11 = 0;
                while (true) {
                    if (i11 < length3) {
                        cArr5[i11] = (char) (cArr2[iArr[(length3 - 1) - i11] - i] - i5);
                        i11++;
                    } else {
                        return new String(cArr5);
                    }
                }
            }
        }
    }

    private static String valueOf(char c, int i, int i2) {
        char[] cArr = new char[i];
        int i3 = 0;
        while (true) {
            if ((i3 < i ? 'A' : 'U') != 'A') {
                return new String(cArr);
            }
            int i4 = AppsFlyer2dXConversionCallback;
            int i5 = i4 + 9;
            init = i5 % 128;
            int i6 = i5 % 2;
            cArr[i3] = (char) ((((long) values[i2 + i3]) ^ (((long) i3) * AFKeystoreWrapper)) ^ ((long) c));
            i3++;
            int i7 = i4 + 111;
            init = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private static String values(String str, Long l) {
        int i = AppsFlyer2dXConversionCallback;
        int i2 = i + 9;
        init = i2 % 128;
        int i3 = i2 % 2;
        if ((str != null ? 'b' : 'H') != 'H') {
            int i4 = i + 27;
            init = i4 % 128;
            int i5 = i4 % 2;
            if (l != null && str.length() == 32) {
                StringBuilder sb = new StringBuilder(str);
                String string = l.toString();
                int numericValue = 0;
                for (int i6 = 0; i6 < string.length(); i6++) {
                    numericValue += Character.getNumericValue(string.charAt(i6));
                }
                String hexString = Integer.toHexString(numericValue);
                sb.replace(7, hexString.length() + 7, hexString);
                long numericValue2 = 0;
                int i7 = 0;
                while (true) {
                    if (!(i7 < sb.length())) {
                        break;
                    }
                    int i8 = init + 111;
                    AppsFlyer2dXConversionCallback = i8 % 128;
                    int i9 = i8 % 2;
                    numericValue2 += (long) Character.getNumericValue(sb.charAt(i7));
                    i7++;
                }
                while (true) {
                    if (numericValue2 <= 100) {
                        break;
                    }
                    numericValue2 %= 100;
                }
                sb.insert(23, (int) numericValue2);
                if (numericValue2 < 10) {
                    sb.insert(23, valueOf((char) ExpandableListView.getPackedPositionGroup(0L), 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 34 - Color.alpha(0)).intern());
                }
                return sb.toString();
            }
        }
        return values("ဆ쌧Ụ记", "鿷\u2b74ጇ⋿", TextUtils.getOffsetBefore("", 0), "狟뫦ዥ渖脋┻煑\uf2f2ﺬ\ue37e툐鼰罼絕䇳甫멪瘖뤐⣒犤내곐呪鋹뭟ࡂ赚\ueedbᚦﺎ價", (char) (65299 - Color.alpha(0))).intern();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r14.contains(values("ဆ쌧Ụ记", "㸮⾗縜\ue97d", android.text.TextUtils.getTrimmedLength("") + 472880958, "ꈵ", (char) (32127 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern()) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        r14 = r14.split(values("ဆ쌧Ụ记", "\ue1d7ퟺ携ꃸ", (android.os.Process.getThreadPriority(0) + 20) >> 6, "뚘鵳", (char) (63588 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern());
        r0 = r14.length;
        r1 = new java.lang.StringBuilder();
        r0 = r0 - 1;
        r1.append(r14[r0]);
        r1.append(values("ဆ쌧Ụ记", "㸮⾗縜\ue97d", 472880958 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "ꈵ", (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 32126)).intern());
        r2 = com.appsflyer.internal.b.AppsFlyer2dXConversionCallback + 109;
        com.appsflyer.internal.b.init = r2 % 128;
        r2 = r2 % 2;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b3, code lost:
    
        if (r2 >= r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b5, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b7, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b8, code lost:
    
        if (r9 == true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ba, code lost:
    
        r9 = com.appsflyer.internal.b.init + 9;
        com.appsflyer.internal.b.AppsFlyer2dXConversionCallback = r9 % 128;
        r9 = r9 % 2;
        r1.append(r14[r2]);
        r1.append(values("ဆ쌧Ụ记", "㸮⾗縜\ue97d", android.view.KeyEvent.getDeadChar(0, 0) + 472880958, "ꈵ", (char) (32127 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)))).intern());
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e7, code lost:
    
        r1.append(r14[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f0, code lost:
    
        return r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if ((r14.contains(values("ဆ쌧Ụ记", "㸮⾗縜\ue97d", 472880958 - android.text.TextUtils.getTrimmedLength(""), "ꈵ", (char) (3788 % (android.media.AudioTrack.getMaxVolume() > 2.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 2.0f ? 0 : -1)))).intern())) != true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String values(String str) {
        int i = init + 3;
        AppsFlyer2dXConversionCallback = i % 128;
        if (i % 2 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v5, types: [char[]] */
    private static String values(String str, String str2, int i, String str3, char c) {
        int i2 = AppsFlyer2dXConversionCallback + 61;
        int i3 = i2 % 128;
        init = i3;
        int i4 = i2 % 2;
        char c2 = str3 != null ? '@' : (char) 17;
        Object charArray = str3;
        if (c2 != 17) {
            int i5 = i3 + 3;
            AppsFlyer2dXConversionCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 22 / 0;
                charArray = str3.toCharArray();
            } else {
                charArray = str3.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        if (!(str2 == 0)) {
            str2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) str2;
        Object charArray2 = str;
        if (str != null) {
            int i7 = init + 59;
            AppsFlyer2dXConversionCallback = i7 % 128;
            if ((i7 % 2 != 0 ? '\"' : '.') != '\"') {
                charArray2 = str.toCharArray();
            } else {
                str.toCharArray();
                throw null;
            }
        }
        char[] cArr3 = (char[]) cArr2.clone();
        char[] cArr4 = (char[]) ((char[]) charArray2).clone();
        cArr3[0] = (char) (c ^ cArr3[0]);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length = cArr.length;
        char[] cArr5 = new char[length];
        for (int i8 = 0; i8 < length; i8++) {
            ct.AFInAppEventParameterName(cArr3, cArr4, i8);
            cArr5[i8] = (char) (((((long) (cArr[i8] ^ cArr3[(i8 + 3) % 4])) ^ AFInAppEventType) ^ ((long) AFInAppEventParameterName)) ^ ((long) valueOf));
        }
        return new String(cArr5);
    }
}
