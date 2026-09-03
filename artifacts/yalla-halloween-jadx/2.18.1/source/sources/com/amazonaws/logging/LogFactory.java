package com.amazonaws.logging;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class LogFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Map<String, Log> f10443OooO00o = new HashMap();

    public enum Level {
        ALL(Integer.MIN_VALUE),
        TRACE(0),
        DEBUG(1),
        INFO(2),
        WARN(3),
        ERROR(4),
        OFF(Integer.MAX_VALUE);

        private int value;

        Level(int i) {
            this.value = i;
        }
    }

    public static synchronized Log OooO00o(Class cls) {
        return OooO0O0(OooO0OO(cls.getSimpleName()));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.amazonaws.logging.Log>] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.HashMap, java.util.Map<java.lang.String, com.amazonaws.logging.Log>] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.HashMap, java.util.Map<java.lang.String, com.amazonaws.logging.Log>] */
    public static synchronized Log OooO0O0(String str) {
        Log androidLog;
        Log apacheCommonsLogging;
        Exception e;
        String strOooO0OO = OooO0OO(str);
        androidLog = (Log) f10443OooO00o.get(strOooO0OO);
        if (androidLog == null) {
            boolean z = false;
            try {
                Class.forName("org.apache.commons.logging.LogFactory");
                z = true;
            } catch (ClassNotFoundException unused) {
            } catch (Exception e2) {
                android.util.Log.e("LogFactory", e2.getMessage());
            }
            if (z) {
                try {
                    apacheCommonsLogging = new ApacheCommonsLogging(strOooO0OO);
                    try {
                        f10443OooO00o.put(strOooO0OO, apacheCommonsLogging);
                    } catch (Exception e3) {
                        e = e3;
                        android.util.Log.w("LogFactory", "Could not create log from org.apache.commons.logging.LogFactory", e);
                    }
                } catch (Exception e4) {
                    apacheCommonsLogging = androidLog;
                    e = e4;
                }
                androidLog = apacheCommonsLogging;
            }
            if (androidLog == null) {
                androidLog = new AndroidLog(strOooO0OO);
                f10443OooO00o.put(strOooO0OO, androidLog);
            }
        }
        return androidLog;
    }

    public static String OooO0OO(String str) {
        boolean z;
        if (str.length() <= 23) {
            return str;
        }
        try {
            Class.forName("org.apache.commons.logging.LogFactory");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        } catch (Exception e) {
            android.util.Log.e("LogFactory", e.getMessage());
            z = false;
        }
        if (z) {
            new ApacheCommonsLogging("LogFactory").OooO("Truncating log tag length as it exceed 23, the limit imposed by Android on certain API Levels");
        } else {
            android.util.Log.w("LogFactory", "Truncating log tag length as it exceed 23, the limit imposed by Android on certain API Levels");
        }
        return str.substring(0, 23);
    }
}
