package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static AtomicReference<o0O0O00> f16989OooO00o = new AtomicReference<>();

    public static Calendar OooO(@Nullable Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(OooO0oO());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    public static long OooO00o(long j) {
        Calendar calendarOooO = OooO(null);
        calendarOooO.setTimeInMillis(j);
        return OooO0Oo(calendarOooO).getTimeInMillis();
    }

    public static int OooO0O0(@NonNull String str, @NonNull String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0 || i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) != '\'');
            }
            i2 += i;
        }
        return i2;
    }

    @TargetApi(24)
    public static DateFormat OooO0OO(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton;
    }

    public static Calendar OooO0Oo(Calendar calendar) {
        Calendar calendarOooO = OooO(calendar);
        Calendar calendarOooO2 = OooO(null);
        calendarOooO2.set(calendarOooO.get(1), calendarOooO.get(2), calendarOooO.get(5));
        return calendarOooO2;
    }

    public static String OooO0o(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(p337o0OO0o0.OooOo.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(p337o0OO0o0.OooOo.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(p337o0OO0o0.OooOo.mtrl_picker_text_input_day_abbr);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    public static SimpleDateFormat OooO0o0() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(OooO0oO());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static java.util.TimeZone OooO0oO() {
        return java.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar OooO0oo() {
        o0O0O00 o0o0o00 = f16989OooO00o.get();
        if (o0o0o00 == null) {
            o0o0o00 = o0O0O00.f17003OooO0OO;
        }
        java.util.TimeZone timeZone = o0o0o00.f17005OooO0O0;
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = o0o0o00.f17004OooO00o;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(OooO0oO());
        return calendar;
    }
}
