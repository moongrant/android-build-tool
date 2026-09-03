package p606o0oo0O0o;

import OooO0OO.OooO0O0;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
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
import p028Oooo0oO.o0oOO;
import p031OoooO0.o0OoOo0;
import p423o0OoO0OO.o00O000o;
import p423o0OoO0OO.oo0o0O0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAppTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppTime.kt\ncom/yalla/yalla/util/time/AppTime\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,568:1\n1#2:569\n*E\n"})
public final class o0O0O0o0 {
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
            stringBuffer.append(j5 > 24 ? OooOOOO.OooO00o(o00O000o.OooO0O0(j5 - j2), CertificateUtil.DELIMITER) : OooOOOO.OooO00o(o00O000o.OooO0O0(j5), CertificateUtil.DELIMITER));
        }
        stringBuffer.append(o00O000o.OooO0O0(j6) + CertificateUtil.DELIMITER);
        stringBuffer.append(o00O000o.OooO0O0(j7));
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
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
                    Intrinsics.checkNotNullExpressionValue(timeZone2, "getTimeZone(...)");
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
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
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
        long jOooO00o = o0O0OOOo.OooO00o(j);
        long jOooO00o2 = o0O0OOOo.OooO00o(j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jOooO00o);
        Intrinsics.checkNotNullExpressionValue(calendar, "apply(...)");
        if (jOooO00o > jOooO00o2) {
            long j3 = jOooO00o - jOooO00o2;
            if (0 <= j3 && j3 < 10001) {
                return o0OoOo0.OooO0O0(oo0o0O0.OooO0O0(calendar), CertificateUtil.DELIMITER, oo0o0O0.OooO0OO(calendar));
            }
            String strOooO00o = oo0o0O0.OooO00o(calendar);
            String strOooO0Oo = oo0o0O0.OooO0Oo(calendar);
            String strOooO0o = oo0o0O0.OooO0o(calendar);
            String strOooO0O0 = oo0o0O0.OooO0O0(calendar);
            String strOooO0OO2 = oo0o0O0.OooO0OO(calendar);
            StringBuilder sb = new StringBuilder();
            sb.append(strOooO00o);
            sb.append("/");
            sb.append(strOooO0Oo);
            sb.append("/");
            sb.append(strOooO0o);
            return o0OoOo0.OooO0OO(sb, ZegoConstants.ZegoVideoDataAuxPublishingStream, strOooO0O0, CertificateUtil.DELIMITER, strOooO0OO2);
        }
        if (o0O0OOO0.OooO00o(jOooO00o, jOooO00o2)) {
            return o0OoOo0.OooO0O0(oo0o0O0.OooO0O0(calendar), CertificateUtil.DELIMITER, oo0o0O0.OooO0OO(calendar));
        }
        if (o0O0OOO0.OooO00o(jOooO00o, jOooO00o2 - 86400000)) {
            return o0000.OooO0OO(o000000.Yesterday) + ZegoConstants.ZegoVideoDataAuxPublishingStream + oo0o0O0.OooO0O0(calendar) + CertificateUtil.DELIMITER + oo0o0O0.OooO0OO(calendar);
        }
        if (!((o0O0OOO0.OooO0OO(jOooO00o, jOooO00o2) && o0O0OOO0.OooO0O0(2, jOooO00o, jOooO00o2)) && o0O0OOO0.OooO0O0(3, jOooO00o, jOooO00o2))) {
            if (o0O0OOO0.OooO0OO(jOooO00o, jOooO00o2)) {
                String strOooO00o2 = oo0o0O0.OooO00o(calendar);
                String strOooO0Oo2 = oo0o0O0.OooO0Oo(calendar);
                String strOooO0O1 = oo0o0O0.OooO0O0(calendar);
                String strOooO0OO3 = oo0o0O0.OooO0OO(calendar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strOooO00o2);
                sb2.append("/");
                sb2.append(strOooO0Oo2);
                sb2.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                sb2.append(strOooO0O1);
                return o0oOO.OooO0O0(sb2, CertificateUtil.DELIMITER, strOooO0OO3);
            }
            String strOooO00o3 = oo0o0O0.OooO00o(calendar);
            String strOooO0Oo3 = oo0o0O0.OooO0Oo(calendar);
            String strOooO0o2 = oo0o0O0.OooO0o(calendar);
            String strOooO0O2 = oo0o0O0.OooO0O0(calendar);
            String strOooO0OO4 = oo0o0O0.OooO0OO(calendar);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strOooO00o3);
            sb3.append("/");
            sb3.append(strOooO0Oo3);
            sb3.append("/");
            sb3.append(strOooO0o2);
            return o0OoOo0.OooO0OO(sb3, ZegoConstants.ZegoVideoDataAuxPublishingStream, strOooO0O2, CertificateUtil.DELIMITER, strOooO0OO4);
        }
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        switch (calendar.get(7)) {
            case 1:
                strOooO0OO = o0000.OooO0OO(o000000.Sunday);
                break;
            case 2:
                strOooO0OO = o0000.OooO0OO(o000000.Monday);
                break;
            case 3:
                strOooO0OO = o0000.OooO0OO(o000000.Tuesday);
                break;
            case 4:
                strOooO0OO = o0000.OooO0OO(o000000.Wednesday);
                break;
            case 5:
                strOooO0OO = o0000.OooO0OO(o000000.Thursday);
                break;
            case 6:
                strOooO0OO = o0000.OooO0OO(o000000.Friday);
                break;
            case 7:
                strOooO0OO = o0000.OooO0OO(o000000.Saturday);
                break;
            default:
                strOooO0OO = "";
                break;
        }
        return strOooO0OO + ZegoConstants.ZegoVideoDataAuxPublishingStream + oo0o0O0.OooO0O0(calendar) + CertificateUtil.DELIMITER + oo0o0O0.OooO0OO(calendar);
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
        Intrinsics.checkNotNullExpressionValue(calendar, "apply(...)");
        boolean zOooO00o = o0O0OOO0.OooO00o(j, jCurrentTimeMillis);
        boolean zOooO0OO = o0O0OOO0.OooO0OO(j, jCurrentTimeMillis);
        long jCurrentTimeMillis2 = (System.currentTimeMillis() - j) / (((long) 1) * 60000);
        if (jCurrentTimeMillis2 < 0 && jCurrentTimeMillis2 >= -60) {
            return o0000O.OooO00o(o0000.OooO0OO(o000000.event_starts_in_xxx_minutes), String.valueOf(Math.abs(jCurrentTimeMillis2)));
        }
        if (o0O0OOO0.OooO00o(j, System.currentTimeMillis() - 86400000)) {
            return o0000.OooO0OO(o000000.Yesterday) + o0000.OooO0OO(o000000.comma) + ZegoConstants.ZegoVideoDataAuxPublishingStream + oo0o0O0.OooO0O0(calendar) + CertificateUtil.DELIMITER + oo0o0O0.OooO0OO(calendar);
        }
        if (zOooO00o) {
            return o0000.OooO0OO(o000000.Today) + o0000.OooO0OO(o000000.comma) + ZegoConstants.ZegoVideoDataAuxPublishingStream + oo0o0O0.OooO0O0(calendar) + CertificateUtil.DELIMITER + oo0o0O0.OooO0OO(calendar);
        }
        if (o0O0OOO0.OooO00o(j, System.currentTimeMillis() + 86400000)) {
            return o0000.OooO0OO(o000000.Tomorrow) + o0000.OooO0OO(o000000.comma) + ZegoConstants.ZegoVideoDataAuxPublishingStream + oo0o0O0.OooO0O0(calendar) + CertificateUtil.DELIMITER + oo0o0O0.OooO0OO(calendar);
        }
        if (!zOooO0OO) {
            String strOooO0o0 = oo0o0O0.OooO0o0(calendar);
            int i2 = o000000.comma;
            String strOooO0OO = o0000.OooO0OO(i2);
            String strOooO00o = oo0o0O0.OooO00o(calendar);
            String strOooO0Oo = oo0o0O0.OooO0Oo(calendar);
            String strOooO0o = oo0o0O0.OooO0o(calendar);
            String strOooO0OO2 = o0000.OooO0OO(i2);
            String strOooO0O0 = oo0o0O0.OooO0O0(calendar);
            String strOooO0OO3 = oo0o0O0.OooO0OO(calendar);
            StringBuilder sb = new StringBuilder();
            sb.append(strOooO0o0);
            sb.append(strOooO0OO);
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb.append(strOooO00o);
            sb.append("/");
            OooO0O0.OooO00o(sb, strOooO0Oo, "/", strOooO0o, strOooO0OO2);
            return o0OoOo0.OooO0OO(sb, ZegoConstants.ZegoVideoDataAuxPublishingStream, strOooO0O0, CertificateUtil.DELIMITER, strOooO0OO3);
        }
        if (jCurrentTimeMillis > j) {
            String strOooO0o1 = oo0o0O0.OooO0o0(calendar);
            int i3 = o000000.comma;
            String strOooO0OO4 = o0000.OooO0OO(i3);
            String strOooO00o2 = oo0o0O0.OooO00o(calendar);
            String strOooO0Oo2 = oo0o0O0.OooO0Oo(calendar);
            String strOooO0OO5 = o0000.OooO0OO(i3);
            String strOooO0O1 = oo0o0O0.OooO0O0(calendar);
            String strOooO0OO6 = oo0o0O0.OooO0OO(calendar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strOooO0o1);
            sb2.append(strOooO0OO4);
            sb2.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb2.append(strOooO00o2);
            sb2.append("/");
            OooO0O0.OooO00o(sb2, strOooO0Oo2, strOooO0OO5, ZegoConstants.ZegoVideoDataAuxPublishingStream, strOooO0O1);
            return o0oOO.OooO0O0(sb2, CertificateUtil.DELIMITER, strOooO0OO6);
        }
        String strOooO0o2 = oo0o0O0.OooO0o0(calendar);
        int i4 = o000000.comma;
        String strOooO0OO7 = o0000.OooO0OO(i4);
        String strOooO00o3 = oo0o0O0.OooO00o(calendar);
        String strOooO0Oo3 = oo0o0O0.OooO0Oo(calendar);
        String strOooO0OO8 = o0000.OooO0OO(i4);
        String strOooO0O2 = oo0o0O0.OooO0O0(calendar);
        String strOooO0OO9 = oo0o0O0.OooO0OO(calendar);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strOooO0o2);
        sb3.append(strOooO0OO7);
        sb3.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb3.append(strOooO00o3);
        sb3.append("/");
        OooO0O0.OooO00o(sb3, strOooO0Oo3, strOooO0OO8, ZegoConstants.ZegoVideoDataAuxPublishingStream, strOooO0O2);
        return o0oOO.OooO0O0(sb3, CertificateUtil.DELIMITER, strOooO0OO9);
    }

    @NotNull
    public static void OooO0oO(long j, @Nullable Function3 function3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = o0O0OO0.f57399OooO00o;
        long j2 = (int) ((j - jCurrentTimeMillis) / 86400000);
        long j3 = j - (86400000 * j2);
        long j4 = (int) ((j3 - jCurrentTimeMillis) / 3600000);
        long j5 = (int) (((j3 - (3600000 * j4)) - jCurrentTimeMillis) / 60000);
        function3.invoke(Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j5));
        o00O000o.OooO0O0(j2);
        o00O000o.OooO0O0(j4);
        o00O000o.OooO0O0(j5);
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
        Intrinsics.checkNotNullExpressionValue(calendar, "apply(...)");
        long j2 = (jCurrentTimeMillis - j) / 86400000;
        if (o0O0OOO0.OooO00o(j, jCurrentTimeMillis) || j - jCurrentTimeMillis >= -10000) {
            return o0000.OooO0OO(o000000.Active_today);
        }
        if (j2 >= 0) {
            if (j2 <= 30) {
                return o0000O.OooO00o(o0000.OooO0OO(o000000.Active_XXX_days_ago), String.valueOf(j2));
            }
            return 31 <= j2 && j2 < 366 ? o0000O.OooO00o(o0000.OooO0OO(o000000.Active_XXX_months_ago), String.valueOf((int) (j2 / ((long) 30)))) : o0000O.OooO00o(o0000.OooO0OO(o000000.Active_XXX_years_ago), String.valueOf((int) (j2 / ((long) 365))));
        }
        return oo0o0O0.OooO00o(calendar) + "/" + oo0o0O0.OooO0Oo(calendar) + "/" + oo0o0O0.OooO0o(calendar);
    }
}
