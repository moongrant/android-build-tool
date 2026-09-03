package com.amazonaws.logging;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class LogFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap f9131OooO00o = new HashMap();

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

    public static synchronized Log OooO0O0(String str) {
        Log androidLog;
        boolean z;
        String strOooO0OO = OooO0OO(str);
        HashMap map = f9131OooO00o;
        androidLog = (Log) map.get(strOooO0OO);
        if (androidLog == null) {
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
                try {
                    ApacheCommonsLogging apacheCommonsLogging = new ApacheCommonsLogging(strOooO0OO);
                    try {
                        map.put(strOooO0OO, apacheCommonsLogging);
                        androidLog = apacheCommonsLogging;
                    } catch (Exception e2) {
                        e = e2;
                        androidLog = apacheCommonsLogging;
                        android.util.Log.w("LogFactory", "Could not create log from org.apache.commons.logging.LogFactory", e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            if (androidLog == null) {
                androidLog = new AndroidLog(strOooO0OO);
                f9131OooO00o.put(strOooO0OO, androidLog);
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
