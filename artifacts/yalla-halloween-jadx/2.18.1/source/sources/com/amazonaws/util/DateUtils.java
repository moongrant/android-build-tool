package com.amazonaws.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class DateUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final TimeZone f11175OooO00o = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Map<String, ThreadLocal<SimpleDateFormat>> f11176OooO0O0 = new HashMap();

    public static Date OooO00o(Date date) {
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }

    public static String OooO0O0(String str, Date date) {
        return OooO0Oo(str).get().format(date);
    }

    public static String OooO0OO(Date date) {
        return OooO0O0("EEE, dd MMM yyyy HH:mm:ss z", date);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.ThreadLocal<java.text.SimpleDateFormat>>] */
    public static ThreadLocal<SimpleDateFormat> OooO0Oo(final String str) {
        ?? r0 = f11176OooO0O0;
        ThreadLocal<SimpleDateFormat> threadLocal = (ThreadLocal) r0.get(str);
        if (threadLocal == null) {
            synchronized (r0) {
                threadLocal = (ThreadLocal) r0.get(str);
                if (threadLocal == null) {
                    threadLocal = new ThreadLocal<SimpleDateFormat>() { // from class: com.amazonaws.util.DateUtils.1
                        @Override // java.lang.ThreadLocal
                        public final SimpleDateFormat initialValue() {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
                            simpleDateFormat.setTimeZone(DateUtils.f11175OooO00o);
                            simpleDateFormat.setLenient(false);
                            return simpleDateFormat;
                        }
                    };
                    r0.put(str, threadLocal);
                }
            }
        }
        return threadLocal;
    }

    public static Date OooO0o(String str) {
        try {
            return OooO0o0("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", str);
        } catch (IllegalArgumentException unused) {
            return OooO0o0("yyyy-MM-dd'T'HH:mm:ss'Z'", str);
        }
    }

    public static Date OooO0o0(String str, String str2) {
        try {
            return OooO0Oo(str).get().parse(str2);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Date OooO0oO(String str) {
        return OooO0o0("EEE, dd MMM yyyy HH:mm:ss z", str);
    }
}
