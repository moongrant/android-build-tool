package p621o0oo0o0o;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p279o0O00OoO.OooO;
import p496o0o00OOo.o000oOoO;
import p522o0o0O0o.o00O0OOO;
import p522o0o0O0o.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O0 f48624OooO00o = new o00O0();

    public static String OooO00o(long j) {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        long j2 = 24;
        long j3 = (j / 86400000) % j2;
        long j4 = 60;
        long j5 = (j / 3600000) % j4;
        long j6 = (j / 60000) % j4;
        long j7 = (j / 1000) % j4;
        if (j3 > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(j3);
            sb.append(' ');
            stringBuffer.append(sb.toString());
        }
        if (j5 > 0) {
            if (j5 > 24) {
                str = oOO00O.OooO0O0(j5 - j2) + ':';
            } else {
                str = oOO00O.OooO0O0(j5) + ':';
            }
            stringBuffer.append(str);
        }
        int i = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        stringBuffer.append(oOO00O.OooO0O0(j6) + ':');
        stringBuffer.append(oOO00O.OooO0O0(j7));
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    @NotNull
    public final String OooO(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (o000oOoO.OooO00o(j, OooO.OooO00o()) == 3) {
            j *= (long) 1000;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance().apply { timeInMillis = timeOnLine }");
        long j2 = (jCurrentTimeMillis - j) / 86400000;
        if (o00O0O0.f48625OooO00o.OooO00o(j, jCurrentTimeMillis) || j - jCurrentTimeMillis >= -10000) {
            return o000O0O0.OooO0OO(R.string.Active_today);
        }
        if (j2 >= 0) {
            if (j2 <= 30) {
                return OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Active_XXX_days_ago), String.valueOf(j2));
            }
            return (31L > j2 ? 1 : (31L == j2 ? 0 : -1)) <= 0 && (j2 > 366L ? 1 : (j2 == 366L ? 0 : -1)) < 0 ? OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Active_XXX_months_ago), String.valueOf((int) (j2 / ((long) 30)))) : OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Active_XXX_years_ago), String.valueOf((int) (j2 / ((long) 365))));
        }
        return o00O0OOO.OooO00o(calendar) + '/' + o00O0OOO.OooO0Oo(calendar) + '/' + o00O0OOO.OooO0o(calendar);
    }

    @NotNull
    public final String OooO0O0(long j, @NotNull String format, @Nullable String timeZone) {
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
                if (String.valueOf(System.currentTimeMillis()).length() - String.valueOf(j).length() == 3) {
                    j *= (long) 1000;
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
    public final String OooO0OO(long j, @NotNull String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return OooO0O0(j, format, null);
    }

    @NotNull
    public final String OooO0Oo(long j, long j2) {
        String strOooO0OO;
        long j3 = j;
        long j4 = j2;
        if (o000oOoO.OooO00o(j3, OooO.OooO00o()) == 3) {
            j3 *= (long) 1000;
        }
        if (o000oOoO.OooO00o(j4, OooO.OooO00o()) == 3) {
            j4 *= (long) 1000;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j3);
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance().apply { timeInMillis = timeApp }");
        if (j3 > j4) {
            long j5 = j3 - j4;
            if (0 <= j5 && j5 < 10001) {
                return o00O0OOO.OooO0O0(calendar) + ':' + o00O0OOO.OooO0OO(calendar);
            }
            return o00O0OOO.OooO00o(calendar) + '/' + o00O0OOO.OooO0Oo(calendar) + '/' + o00O0OOO.OooO0o(calendar) + ' ' + o00O0OOO.OooO0O0(calendar) + ':' + o00O0OOO.OooO0OO(calendar);
        }
        o00O0O0 o00o0o0 = o00O0O0.f48625OooO00o;
        if (o00o0o0.OooO00o(j3, j4)) {
            return o00O0OOO.OooO0O0(calendar) + ':' + o00O0OOO.OooO0OO(calendar);
        }
        if (o00o0o0.OooO00o(j3, j4 - 86400000)) {
            return o000O0O0.OooO0OO(R.string.Yesterday) + ' ' + o00O0OOO.OooO0O0(calendar) + ':' + o00O0OOO.OooO0OO(calendar);
        }
        if (!((o00o0o0.OooO0OO(j3, j4) && o00o0o0.OooO0O0(2, j3, j4)) && o00o0o0.OooO0O0(3, j3, j4))) {
            if (o00o0o0.OooO0OO(j3, j4)) {
                return o00O0OOO.OooO00o(calendar) + '/' + o00O0OOO.OooO0Oo(calendar) + ' ' + o00O0OOO.OooO0O0(calendar) + ':' + o00O0OOO.OooO0OO(calendar);
            }
            return o00O0OOO.OooO00o(calendar) + '/' + o00O0OOO.OooO0Oo(calendar) + '/' + o00O0OOO.OooO0o(calendar) + ' ' + o00O0OOO.OooO0O0(calendar) + ':' + o00O0OOO.OooO0OO(calendar);
        }
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        switch (calendar.get(7)) {
            case 1:
                strOooO0OO = o000O0O0.OooO0OO(R.string.Sunday);
                break;
            case 2:
                strOooO0OO = o000O0O0.OooO0OO(R.string.Monday);
                break;
            case 3:
                strOooO0OO = o000O0O0.OooO0OO(R.string.Tuesday);
                break;
            case 4:
                strOooO0OO = o000O0O0.OooO0OO(R.string.Wednesday);
                break;
            case 5:
                strOooO0OO = o000O0O0.OooO0OO(R.string.Thursday);
                break;
            case 6:
                strOooO0OO = o000O0O0.OooO0OO(R.string.Friday);
                break;
            case 7:
                strOooO0OO = o000O0O0.OooO0OO(R.string.Saturday);
                break;
            default:
                strOooO0OO = "";
                break;
        }
        sb.append(strOooO0OO);
        sb.append(' ');
        sb.append(o00O0OOO.OooO0O0(calendar));
        sb.append(':');
        sb.append(o00O0OOO.OooO0OO(calendar));
        return sb.toString();
    }

    @NotNull
    public final String OooO0o(long j, long j2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (o000oOoO.OooO00o(j, OooO.OooO00o()) == 3) {
            j *= (long) 1000;
        }
        if (o000oOoO.OooO00o(j2, OooO.OooO00o()) == 3) {
            j2 *= (long) 1000;
        }
        o00O0O0 o00o0o0 = o00O0O0.f48625OooO00o;
        boolean zOooO00o = o00o0o0.OooO00o(j, j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance().apply { timeInMillis = timeStart }");
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        Intrinsics.checkNotNullExpressionValue(calendar2, "getInstance().apply { timeInMillis = timeEnd }");
        boolean zOooO0OO = o00o0o0.OooO0OO(j, jCurrentTimeMillis);
        boolean zOooO0OO2 = o00o0o0.OooO0OO(j2, jCurrentTimeMillis);
        if (zOooO00o) {
            if (zOooO0OO) {
                return o00O0OOO.OooO0o0(calendar) + o000O0O0.OooO0OO(R.string.comma) + ' ' + o00O0OOO.OooO00o(calendar) + '/' + o00O0OOO.OooO0Oo(calendar) + o000O0O0.OooO0OO(R.string.comma) + ' ' + o00O0OOO.OooO0O0(calendar) + ':' + o00O0OOO.OooO0OO(calendar) + " - " + o00O0OOO.OooO0O0(calendar2) + ':' + o00O0OOO.OooO0OO(calendar2);
            }
            return o00O0OOO.OooO0o0(calendar) + o000O0O0.OooO0OO(R.string.comma) + ' ' + o00O0OOO.OooO00o(calendar) + '/' + o00O0OOO.OooO0Oo(calendar) + '/' + o00O0OOO.OooO0o(calendar) + o000O0O0.OooO0OO(R.string.comma) + ' ' + o00O0OOO.OooO0O0(calendar) + ':' + o00O0OOO.OooO0OO(calendar) + " - " + o00O0OOO.OooO0O0(calendar2) + ':' + o00O0OOO.OooO0OO(calendar2);
        }
        if (zOooO0OO && zOooO0OO2) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("");
            sbOooO0o0.append(o00O0OOO.OooO00o(calendar));
            sbOooO0o0.append('/');
            sbOooO0o0.append(o00O0OOO.OooO0Oo(calendar));
            sbOooO0o0.append(o000O0O0.OooO0OO(R.string.comma));
            sbOooO0o0.append(' ');
            sbOooO0o0.append(o00O0OOO.OooO0O0(calendar));
            sbOooO0o0.append(':');
            sbOooO0o0.append(o00O0OOO.OooO0OO(calendar));
            sbOooO0o0.append(" - ");
            sbOooO0o0.append(o00O0OOO.OooO00o(calendar2));
            sbOooO0o0.append('/');
            sbOooO0o0.append(o00O0OOO.OooO0Oo(calendar2));
            sbOooO0o0.append(o000O0O0.OooO0OO(R.string.comma));
            sbOooO0o0.append(' ');
            sbOooO0o0.append(o00O0OOO.OooO0O0(calendar2));
            sbOooO0o0.append(':');
            sbOooO0o0.append(o00O0OOO.OooO0OO(calendar2));
            return sbOooO0o0.toString();
        }
        if (zOooO0OO || zOooO0OO2) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("");
            sbOooO0o1.append(o00O0OOO.OooO00o(calendar));
            sbOooO0o1.append('/');
            sbOooO0o1.append(o00O0OOO.OooO0Oo(calendar));
            sbOooO0o1.append(o000O0O0.OooO0OO(R.string.comma));
            sbOooO0o1.append(' ');
            sbOooO0o1.append(o00O0OOO.OooO0O0(calendar));
            sbOooO0o1.append(':');
            sbOooO0o1.append(o00O0OOO.OooO0OO(calendar));
            sbOooO0o1.append(" - ");
            sbOooO0o1.append(o00O0OOO.OooO00o(calendar2));
            sbOooO0o1.append('/');
            sbOooO0o1.append(o00O0OOO.OooO0Oo(calendar2));
            sbOooO0o1.append('/');
            sbOooO0o1.append(o00O0OOO.OooO0o(calendar2));
            sbOooO0o1.append(o000O0O0.OooO0OO(R.string.comma));
            sbOooO0o1.append(' ');
            sbOooO0o1.append(o00O0OOO.OooO0O0(calendar2));
            sbOooO0o1.append(':');
            sbOooO0o1.append(o00O0OOO.OooO0OO(calendar2));
            return sbOooO0o1.toString();
        }
        StringBuilder sbOooO0o2 = OooO00o.OooO0o0("");
        sbOooO0o2.append(o00O0OOO.OooO00o(calendar));
        sbOooO0o2.append('/');
        sbOooO0o2.append(o00O0OOO.OooO0Oo(calendar));
        sbOooO0o2.append('/');
        sbOooO0o2.append(o00O0OOO.OooO0o(calendar));
        sbOooO0o2.append(o000O0O0.OooO0OO(R.string.comma));
        sbOooO0o2.append(' ');
        sbOooO0o2.append(o00O0OOO.OooO0O0(calendar));
        sbOooO0o2.append(':');
        sbOooO0o2.append(o00O0OOO.OooO0OO(calendar));
        sbOooO0o2.append(" - ");
        sbOooO0o2.append(o00O0OOO.OooO00o(calendar2));
        sbOooO0o2.append('/');
        sbOooO0o2.append(o00O0OOO.OooO0Oo(calendar2));
        sbOooO0o2.append('/');
        sbOooO0o2.append(o00O0OOO.OooO0o(calendar2));
        sbOooO0o2.append(o000O0O0.OooO0OO(R.string.comma));
        sbOooO0o2.append(' ');
        sbOooO0o2.append(o00O0OOO.OooO0O0(calendar2));
        sbOooO0o2.append(':');
        sbOooO0o2.append(o00O0OOO.OooO0OO(calendar2));
        return sbOooO0o2.toString();
    }

    @NotNull
    public final String OooO0oO(long j) {
        long j2 = j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (o000oOoO.OooO00o(j2, OooO.OooO00o()) == 3) {
            j2 *= (long) 1000;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance().apply { timeInMillis = timeStart }");
        o00O0O0 o00o0o0 = o00O0O0.f48625OooO00o;
        boolean zOooO00o = o00o0o0.OooO00o(j2, jCurrentTimeMillis);
        boolean zOooO0OO = o00o0o0.OooO0OO(j2, jCurrentTimeMillis);
        long jCurrentTimeMillis2 = (System.currentTimeMillis() - j2) / (((long) 1) * 60000);
        if (jCurrentTimeMillis2 < 0 && jCurrentTimeMillis2 >= -60) {
            return OooOo.OooO00o(o000O0O0.OooO0OO(R.string.event_starts_in_xxx_minutes), String.valueOf(Math.abs(jCurrentTimeMillis2)));
        }
        if (o00o0o0.OooO00o(j2, System.currentTimeMillis() - 86400000)) {
            return o000O0O0.OooO0OO(R.string.Yesterday) + o000O0O0.OooO0OO(R.string.comma) + ' ' + o00O0OOO.OooO0O0(calendar) + ':' + o00O0OOO.OooO0OO(calendar);
        }
        if (zOooO00o) {
            return o000O0O0.OooO0OO(R.string.Today) + o000O0O0.OooO0OO(R.string.comma) + ' ' + o00O0OOO.OooO0O0(calendar) + ':' + o00O0OOO.OooO0OO(calendar);
        }
        if (o00o0o0.OooO00o(j2, System.currentTimeMillis() + 86400000)) {
            return o000O0O0.OooO0OO(R.string.Tomorrow) + o000O0O0.OooO0OO(R.string.comma) + ' ' + o00O0OOO.OooO0O0(calendar) + ':' + o00O0OOO.OooO0OO(calendar);
        }
        if (!zOooO0OO) {
            return o00O0OOO.OooO0o0(calendar) + o000O0O0.OooO0OO(R.string.comma) + ' ' + o00O0OOO.OooO00o(calendar) + '/' + o00O0OOO.OooO0Oo(calendar) + '/' + o00O0OOO.OooO0o(calendar) + o000O0O0.OooO0OO(R.string.comma) + ' ' + o00O0OOO.OooO0O0(calendar) + ':' + o00O0OOO.OooO0OO(calendar);
        }
        if (jCurrentTimeMillis > j2) {
            return o00O0OOO.OooO0o0(calendar) + o000O0O0.OooO0OO(R.string.comma) + ' ' + o00O0OOO.OooO00o(calendar) + '/' + o00O0OOO.OooO0Oo(calendar) + o000O0O0.OooO0OO(R.string.comma) + ' ' + o00O0OOO.OooO0O0(calendar) + ':' + o00O0OOO.OooO0OO(calendar);
        }
        return o00O0OOO.OooO0o0(calendar) + o000O0O0.OooO0OO(R.string.comma) + ' ' + o00O0OOO.OooO00o(calendar) + '/' + o00O0OOO.OooO0Oo(calendar) + o000O0O0.OooO0OO(R.string.comma) + ' ' + o00O0OOO.OooO0O0(calendar) + ':' + o00O0OOO.OooO0OO(calendar);
    }

    @NotNull
    public final String OooO0oo(long j, @Nullable Function3<? super Long, ? super Long, ? super Long, Unit> function3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        o00O0O00 o00o0o01 = o00O0O00.f48626OooO00o;
        long j2 = (int) ((j - jCurrentTimeMillis) / 86400000);
        long j3 = j - (86400000 * j2);
        long j4 = (int) ((j3 - jCurrentTimeMillis) / 3600000);
        long j5 = (int) (((j3 - (3600000 * j4)) - jCurrentTimeMillis) / 60000);
        function3.invoke(Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j5));
        return oOO00O.OooO0O0(j2) + ':' + oOO00O.OooO0O0(j4) + ':' + oOO00O.OooO0O0(j5);
    }
}
