package com.google.android.material.datepicker;

import android.os.Build;
import androidx.annotation.Nullable;
import com.zego.zegoavkit2.ZegoConstants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O {
    public static o000OO.OooO0o<String, String> OooO00o(@Nullable Long l, @Nullable Long l2) {
        o000OO.OooO0o<String, String> oooO0o;
        o000OO.OooO0o<String, String> oooO0o2;
        if (l == null && l2 == null) {
            return new o000OO.OooO0o<>(null, null);
        }
        if (l == null) {
            oooO0o2 = new o000OO.OooO0o<>(null, OooO0O0(l2.longValue()));
        } else {
            if (l2 != null) {
                Calendar calendarOooO0oo = o0000.OooO0oo();
                Calendar calendarOooO = o0000.OooO(null);
                calendarOooO.setTimeInMillis(l.longValue());
                Calendar calendarOooO2 = o0000.OooO(null);
                calendarOooO2.setTimeInMillis(l2.longValue());
                if (calendarOooO.get(1) == calendarOooO2.get(1)) {
                    oooO0o = calendarOooO.get(1) == calendarOooO0oo.get(1) ? new o000OO.OooO0o<>(OooO0OO(l.longValue(), Locale.getDefault()), OooO0OO(l2.longValue(), Locale.getDefault())) : new o000OO.OooO0o<>(OooO0OO(l.longValue(), Locale.getDefault()), OooO0Oo(l2.longValue(), Locale.getDefault()));
                } else {
                    oooO0o = new o000OO.OooO0o<>(OooO0Oo(l.longValue(), Locale.getDefault()), OooO0Oo(l2.longValue(), Locale.getDefault()));
                }
                return oooO0o;
            }
            oooO0o2 = new o000OO.OooO0o<>(OooO0O0(l.longValue()), null);
        }
        return oooO0o2;
    }

    public static String OooO0O0(long j) {
        Calendar calendarOooO0oo = o0000.OooO0oo();
        Calendar calendarOooO = o0000.OooO(null);
        calendarOooO.setTimeInMillis(j);
        return calendarOooO0oo.get(1) == calendarOooO.get(1) ? OooO0OO(j, Locale.getDefault()) : OooO0Oo(j, Locale.getDefault());
    }

    public static String OooO0OO(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return o0000.OooO0OO("MMMd", locale).format(new Date(j));
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) o0000.OooO0oO(2, locale);
        String pattern = simpleDateFormat.toPattern();
        int iOooO0O0 = o0000.OooO0O0(1, 0, pattern, "yY");
        if (iOooO0O0 < pattern.length()) {
            int iOooO0O1 = o0000.OooO0O0(1, iOooO0O0, pattern, "EMd");
            pattern = pattern.replace(pattern.substring(o0000.OooO0O0(-1, iOooO0O0, pattern, iOooO0O1 < pattern.length() ? "EMd," : "EMd") + 1, iOooO0O1), ZegoConstants.ZegoVideoDataAuxPublishingStream).trim();
        }
        simpleDateFormat.applyPattern(pattern);
        return simpleDateFormat.format(new Date(j));
    }

    public static String OooO0Oo(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? o0000.OooO0OO("yMMMd", locale).format(new Date(j)) : o0000.OooO0oO(2, locale).format(new Date(j));
    }
}
