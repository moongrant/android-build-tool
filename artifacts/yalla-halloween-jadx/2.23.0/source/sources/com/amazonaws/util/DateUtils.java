package com.amazonaws.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class DateUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final TimeZone f9578OooO00o = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap f9579OooO0O0 = new HashMap();

    public static Date OooO00o(Date date) {
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }

    public static ThreadLocal<SimpleDateFormat> OooO0O0(final String str) {
        HashMap map = f9579OooO0O0;
        ThreadLocal<SimpleDateFormat> threadLocal = (ThreadLocal) map.get(str);
        if (threadLocal == null) {
            synchronized (map) {
                threadLocal = (ThreadLocal) map.get(str);
                if (threadLocal == null) {
                    threadLocal = new ThreadLocal<SimpleDateFormat>() { // from class: com.amazonaws.util.DateUtils.1
                        @Override // java.lang.ThreadLocal
                        public final SimpleDateFormat initialValue() {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
                            simpleDateFormat.setTimeZone(DateUtils.f9578OooO00o);
                            simpleDateFormat.setLenient(false);
                            return simpleDateFormat;
                        }
                    };
                    map.put(str, threadLocal);
                }
            }
        }
        return threadLocal;
    }

    public static Date OooO0OO(String str, String str2) {
        try {
            return OooO0O0(str).get().parse(str2);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Date OooO0Oo(String str) {
        try {
            return OooO0OO("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", str);
        } catch (IllegalArgumentException unused) {
            return OooO0OO("yyyy-MM-dd'T'HH:mm:ss'Z'", str);
        }
    }

    public static Date OooO0o0(String str) {
        return OooO0OO("EEE, dd MMM yyyy HH:mm:ss z", str);
    }
}
