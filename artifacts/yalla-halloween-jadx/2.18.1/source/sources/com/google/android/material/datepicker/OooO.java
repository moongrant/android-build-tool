package com.google.android.material.datepicker;

import android.os.Build;
import com.zego.zegoavkit2.ZegoConstants;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {
    public static String OooO00o(long j) {
        Calendar calendarOooO0oo = o000OOo.OooO0oo();
        Calendar calendarOooO = o000OOo.OooO(null);
        calendarOooO.setTimeInMillis(j);
        return calendarOooO0oo.get(1) == calendarOooO.get(1) ? OooO0O0(j, Locale.getDefault()) : OooO0Oo(j, Locale.getDefault());
    }

    public static String OooO0O0(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return o000OOo.OooO0OO("MMMd", locale).format(new Date(j));
        }
        AtomicReference<o0O0O00> atomicReference = o000OOo.f16989OooO00o;
        DateFormat dateInstance = DateFormat.getDateInstance(2, locale);
        dateInstance.setTimeZone(o000OOo.OooO0oO());
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) dateInstance;
        String pattern = simpleDateFormat.toPattern();
        int iOooO0O0 = o000OOo.OooO0O0(pattern, "yY", 1, 0);
        if (iOooO0O0 < pattern.length()) {
            int iOooO0O1 = o000OOo.OooO0O0(pattern, "EMd", 1, iOooO0O0);
            pattern = pattern.replace(pattern.substring(o000OOo.OooO0O0(pattern, iOooO0O1 < pattern.length() ? "EMd," : "EMd", -1, iOooO0O0) + 1, iOooO0O1), ZegoConstants.ZegoVideoDataAuxPublishingStream).trim();
        }
        simpleDateFormat.applyPattern(pattern);
        return simpleDateFormat.format(new Date(j));
    }

    public static String OooO0OO(long j) {
        Locale locale = Locale.getDefault();
        if (Build.VERSION.SDK_INT >= 24) {
            return o000OOo.OooO0OO("MMMEd", locale).format(new Date(j));
        }
        AtomicReference<o0O0O00> atomicReference = o000OOo.f16989OooO00o;
        DateFormat dateInstance = DateFormat.getDateInstance(0, locale);
        dateInstance.setTimeZone(o000OOo.OooO0oO());
        return dateInstance.format(new Date(j));
    }

    public static String OooO0Oo(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return o000OOo.OooO0OO("yMMMd", locale).format(new Date(j));
        }
        AtomicReference<o0O0O00> atomicReference = o000OOo.f16989OooO00o;
        DateFormat dateInstance = DateFormat.getDateInstance(2, locale);
        dateInstance.setTimeZone(o000OOo.OooO0oO());
        return dateInstance.format(new Date(j));
    }

    public static String OooO0o0(long j) {
        Locale locale = Locale.getDefault();
        if (Build.VERSION.SDK_INT >= 24) {
            return o000OOo.OooO0OO("yMMMEd", locale).format(new Date(j));
        }
        AtomicReference<o0O0O00> atomicReference = o000OOo.f16989OooO00o;
        DateFormat dateInstance = DateFormat.getDateInstance(0, locale);
        dateInstance.setTimeZone(o000OOo.OooO0oO());
        return dateInstance.format(new Date(j));
    }
}
