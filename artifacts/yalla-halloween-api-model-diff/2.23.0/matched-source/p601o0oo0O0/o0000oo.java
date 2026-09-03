package p601o0oo0O0;

import OooO0OO.OooO0O0;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.material.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000O;
import com.facebook.internal.security.CertificateUtil;
import com.zego.zegoavkit2.ZegoConstants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0O00o0;
import p031OoooO0.o0OoOo0;
import p417o0OoO0.o0000;
import p417o0OoO0.o000O00;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAppTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppTime.kt\ncom/yalla/yalla/util/time/AppTime\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,568:1\n1#2:569\n*E\n"})
public final class o0000oo {
    public static String OooO00o(long j) {
        StringBuffer stringBuffer = new StringBuffer();
        long j2 = 24;
        long j3 = (j / 86400000) % j2;
        long j4 = 60;
        long j5 = (j / 3600000) % j4;
        long j6 = (j / 60000) % j4;
        long j7 = (j / 1000) % j4;
        if (j3 > 0) {
            stringBuffer.append(j3 + ZegoConstants.ZegoVideoDataAuxPublishingStream);
        }
        if (j5 > 0) {
            stringBuffer.append(j5 > 24 ? OooOOOO.OooO00o(o0000.OooO0O0(j5 - j2), CertificateUtil.DELIMITER) : OooOOOO.OooO00o(o0000.OooO0O0(j5), CertificateUtil.DELIMITER));
        }
        stringBuffer.append(o0000.OooO0O0(j6) + CertificateUtil.DELIMITER);
        stringBuffer.append(o0000.OooO0O0(j7));
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    @NotNull
    public static String OooO0O0(long j, @NotNull String format, @Nullable String timeZone) {
        Intrinsics.checkNotNullParameter(format, "format");
        if (j > 0) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.ENGLISH);
                if (timeZone != null) {
                    Intrinsics.checkNotNullParameter(timeZone, "timeZone");
                    String upperCase = timeZone.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    TimeZone timeZone2 = TimeZone.getTimeZone(upperCase);
                    Intrinsics.checkNotNullExpressionValue(timeZone2, "getTimeZone(timeZone.uppercase())");
                    simpleDateFormat.setTimeZone(timeZone2);
                }
                int length = String.valueOf(System.currentTimeMillis()).length() - String.valueOf(j).length();
                int i = 1;
                if (1 <= length) {
                    while (true) {
                        j *= (long) 10;
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                String str = simpleDateFormat.format(Long.valueOf(j));
                Intrinsics.checkNotNullExpressionValue(str, "formatter.format(TimeFor…autoCompleteTime(millis))");
                return str;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    @NotNull
    public static String OooO0OO(long j, @NotNull String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return OooO0O0(j, format, null);
    }

    @NotNull
    public static String OooO0Oo(long j, long j2) {
        String strOooO0OO;
        long jOooO00o = o000OO.OooO00o(j);
        long jOooO00o2 = o000OO.OooO00o(j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jOooO00o);
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance().apply { timeInMillis = timeApp }");
        if (jOooO00o > jOooO00o2) {
            long j3 = jOooO00o - jOooO00o2;
            if (0 <= j3 && j3 < 10001) {
                return o0OoOo0.OooO00o(o000O00.OooO0O0(calendar), CertificateUtil.DELIMITER, o000O00.OooO0OO(calendar));
            }
            String strOooO00o = o000O00.OooO00o(calendar);
            String strOooO0Oo = o000O00.OooO0Oo(calendar);
            String strOooO0o = o000O00.OooO0o(calendar);
            String strOooO0O0 = o000O00.OooO0O0(calendar);
            String strOooO0OO2 = o000O00.OooO0OO(calendar);
            StringBuilder sb = new StringBuilder();
            sb.append(strOooO00o);
            sb.append("/");
            sb.append(strOooO0Oo);
            sb.append("/");
            sb.append(strOooO0o);
            return OooO00o.OooO0O0(sb, ZegoConstants.ZegoVideoDataAuxPublishingStream, strOooO0O0, CertificateUtil.DELIMITER, strOooO0OO2);
        }
        if (o0000O0O.OooO00o(jOooO00o, jOooO00o2)) {
            return o0OoOo0.OooO00o(o000O00.OooO0O0(calendar), CertificateUtil.DELIMITER, o000O00.OooO0OO(calendar));
        }
        if (o0000O0O.OooO00o(jOooO00o, jOooO00o2 - 86400000)) {
            return com.code.android.util.o0000.OooO0OO(oO00OOo0.Yesterday) + ZegoConstants.ZegoVideoDataAuxPublishingStream + o000O00.OooO0O0(calendar) + CertificateUtil.DELIMITER + o000O00.OooO0OO(calendar);
        }
        if (!((o0000O0O.OooO0OO(jOooO00o, jOooO00o2) && o0000O0O.OooO0O0(2, jOooO00o, jOooO00o2)) && o0000O0O.OooO0O0(3, jOooO00o, jOooO00o2))) {
            if (o0000O0O.OooO0OO(jOooO00o, jOooO00o2)) {
                String strOooO00o2 = o000O00.OooO00o(calendar);
                String strOooO0Oo2 = o000O00.OooO0Oo(calendar);
                String strOooO0O1 = o000O00.OooO0O0(calendar);
                String strOooO0OO3 = o000O00.OooO0OO(calendar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strOooO00o2);
                sb2.append("/");
                sb2.append(strOooO0Oo2);
                sb2.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                sb2.append(strOooO0O1);
                return o0O00o0.OooO0O0(sb2, CertificateUtil.DELIMITER, strOooO0OO3);
            }
            String strOooO00o3 = o000O00.OooO00o(calendar);
            String strOooO0Oo3 = o000O00.OooO0Oo(calendar);
            String strOooO0o2 = o000O00.OooO0o(calendar);
            String strOooO0O2 = o000O00.OooO0O0(calendar);
            String strOooO0OO4 = o000O00.OooO0OO(calendar);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strOooO00o3);
            sb3.append("/");
            sb3.append(strOooO0Oo3);
            sb3.append("/");
            sb3.append(strOooO0o2);
            return OooO00o.OooO0O0(sb3, ZegoConstants.ZegoVideoDataAuxPublishingStream, strOooO0O2, CertificateUtil.DELIMITER, strOooO0OO4);
        }
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        switch (calendar.get(7)) {
            case 1:
                strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Sunday);
                break;
            case 2:
                strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Monday);
                break;
            case 3:
                strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Tuesday);
                break;
            case 4:
                strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Wednesday);
                break;
            case 5:
                strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Thursday);
                break;
            case 6:
                strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Friday);
                break;
            case 7:
                strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Saturday);
                break;
            default:
                strOooO0OO = "";
                break;
        }
        return strOooO0OO + ZegoConstants.ZegoVideoDataAuxPublishingStream + o000O00.OooO0O0(calendar) + CertificateUtil.DELIMITER + o000O00.OooO0OO(calendar);
    }

    @NotNull
    public static String OooO0o(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int length = String.valueOf(System.currentTimeMillis()).length() - String.valueOf(j).length();
        if (1 <= length) {
            int i = 1;
            while (true) {
                j *= (long) 10;
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance().apply { timeInMillis = timeStart }");
        boolean zOooO00o = o0000O0O.OooO00o(j, jCurrentTimeMillis);
        boolean zOooO0OO = o0000O0O.OooO0OO(j, jCurrentTimeMillis);
        long jCurrentTimeMillis2 = (System.currentTimeMillis() - j) / (((long) 1) * 60000);
        if (jCurrentTimeMillis2 < 0 && jCurrentTimeMillis2 >= -60) {
            return o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.event_starts_in_xxx_minutes), String.valueOf(Math.abs(jCurrentTimeMillis2)));
        }
        if (o0000O0O.OooO00o(j, System.currentTimeMillis() - 86400000)) {
            return com.code.android.util.o0000.OooO0OO(oO00OOo0.Yesterday) + com.code.android.util.o0000.OooO0OO(oO00OOo0.comma) + ZegoConstants.ZegoVideoDataAuxPublishingStream + o000O00.OooO0O0(calendar) + CertificateUtil.DELIMITER + o000O00.OooO0OO(calendar);
        }
        if (zOooO00o) {
            return com.code.android.util.o0000.OooO0OO(oO00OOo0.Today) + com.code.android.util.o0000.OooO0OO(oO00OOo0.comma) + ZegoConstants.ZegoVideoDataAuxPublishingStream + o000O00.OooO0O0(calendar) + CertificateUtil.DELIMITER + o000O00.OooO0OO(calendar);
        }
        if (o0000O0O.OooO00o(j, System.currentTimeMillis() + 86400000)) {
            return com.code.android.util.o0000.OooO0OO(oO00OOo0.Tomorrow) + com.code.android.util.o0000.OooO0OO(oO00OOo0.comma) + ZegoConstants.ZegoVideoDataAuxPublishingStream + o000O00.OooO0O0(calendar) + CertificateUtil.DELIMITER + o000O00.OooO0OO(calendar);
        }
        if (!zOooO0OO) {
            String strOooO0o0 = o000O00.OooO0o0(calendar);
            int i2 = oO00OOo0.comma;
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(i2);
            String strOooO00o = o000O00.OooO00o(calendar);
            String strOooO0Oo = o000O00.OooO0Oo(calendar);
            String strOooO0o = o000O00.OooO0o(calendar);
            String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(i2);
            String strOooO0O0 = o000O00.OooO0O0(calendar);
            String strOooO0OO3 = o000O00.OooO0OO(calendar);
            StringBuilder sb = new StringBuilder();
            sb.append(strOooO0o0);
            sb.append(strOooO0OO);
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb.append(strOooO00o);
            sb.append("/");
            OooO0O0.OooO00o(sb, strOooO0Oo, "/", strOooO0o, strOooO0OO2);
            return OooO00o.OooO0O0(sb, ZegoConstants.ZegoVideoDataAuxPublishingStream, strOooO0O0, CertificateUtil.DELIMITER, strOooO0OO3);
        }
        if (jCurrentTimeMillis > j) {
            String strOooO0o1 = o000O00.OooO0o0(calendar);
            int i3 = oO00OOo0.comma;
            String strOooO0OO4 = com.code.android.util.o0000.OooO0OO(i3);
            String strOooO00o2 = o000O00.OooO00o(calendar);
            String strOooO0Oo2 = o000O00.OooO0Oo(calendar);
            String strOooO0OO5 = com.code.android.util.o0000.OooO0OO(i3);
            String strOooO0O1 = o000O00.OooO0O0(calendar);
            String strOooO0OO6 = o000O00.OooO0OO(calendar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strOooO0o1);
            sb2.append(strOooO0OO4);
            sb2.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb2.append(strOooO00o2);
            sb2.append("/");
            OooO0O0.OooO00o(sb2, strOooO0Oo2, strOooO0OO5, ZegoConstants.ZegoVideoDataAuxPublishingStream, strOooO0O1);
            return o0O00o0.OooO0O0(sb2, CertificateUtil.DELIMITER, strOooO0OO6);
        }
        String strOooO0o2 = o000O00.OooO0o0(calendar);
        int i4 = oO00OOo0.comma;
        String strOooO0OO7 = com.code.android.util.o0000.OooO0OO(i4);
        String strOooO00o3 = o000O00.OooO00o(calendar);
        String strOooO0Oo3 = o000O00.OooO0Oo(calendar);
        String strOooO0OO8 = com.code.android.util.o0000.OooO0OO(i4);
        String strOooO0O2 = o000O00.OooO0O0(calendar);
        String strOooO0OO9 = o000O00.OooO0OO(calendar);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strOooO0o2);
        sb3.append(strOooO0OO7);
        sb3.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb3.append(strOooO00o3);
        sb3.append("/");
        OooO0O0.OooO00o(sb3, strOooO0Oo3, strOooO0OO8, ZegoConstants.ZegoVideoDataAuxPublishingStream, strOooO0O2);
        return o0O00o0.OooO0O0(sb3, CertificateUtil.DELIMITER, strOooO0OO9);
    }

    @NotNull
    public static void OooO0oO(long j, @Nullable Function3 function3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = o0000O0.f56870OooO00o;
        long j2 = (int) ((j - jCurrentTimeMillis) / 86400000);
        long j3 = j - (86400000 * j2);
        long j4 = (int) ((j3 - jCurrentTimeMillis) / 3600000);
        long j5 = (int) (((j3 - (3600000 * j4)) - jCurrentTimeMillis) / 60000);
        function3.invoke(Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j5));
        o0000.OooO0O0(j2);
        o0000.OooO0O0(j4);
        o0000.OooO0O0(j5);
    }

    @NotNull
    public static String OooO0oo(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int length = String.valueOf(System.currentTimeMillis()).length() - String.valueOf(j).length();
        if (1 <= length) {
            int i = 1;
            while (true) {
                j *= (long) 10;
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance().apply { timeInMillis = timeOnLine }");
        long j2 = (jCurrentTimeMillis - j) / 86400000;
        if (o0000O0O.OooO00o(j, jCurrentTimeMillis) || j - jCurrentTimeMillis >= -10000) {
            return com.code.android.util.o0000.OooO0OO(oO00OOo0.Active_today);
        }
        if (j2 >= 0) {
            if (j2 <= 30) {
                return o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Active_XXX_days_ago), String.valueOf(j2));
            }
            return 31 <= j2 && j2 < 366 ? o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Active_XXX_months_ago), String.valueOf((int) (j2 / ((long) 30)))) : o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Active_XXX_years_ago), String.valueOf((int) (j2 / ((long) 365))));
        }
        return o000O00.OooO00o(calendar) + "/" + o000O00.OooO0Oo(calendar) + "/" + o000O00.OooO0o(calendar);
    }
}
