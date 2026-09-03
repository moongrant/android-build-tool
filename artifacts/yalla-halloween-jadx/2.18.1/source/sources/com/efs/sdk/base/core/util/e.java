package com.efs.sdk.base.core.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static String a = null;
    private static List<Integer> b = null;
    private static long c = -1;

    public static int a() {
        return Process.myPid();
    }

    public static String b() {
        String str = a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strA = a(Process.myPid());
        a = strA;
        return strA;
    }

    public static String a(int i) {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + i + "/cmdline")));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i2 = bufferedReader2.read();
                    if (i2 <= 0) {
                        sb.trimToSize();
                        String string = sb.toString();
                        try {
                            bufferedReader2.close();
                            return string;
                        } catch (Throwable th) {
                            th.printStackTrace();
                            return string;
                        }
                    }
                    sb.append((char) i2);
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                try {
                    d.b("efs.base", "get process name error", th);
                    return "";
                } finally {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static boolean a(Context context, String str) {
        try {
            int i = Integer.parseInt(str);
            List<Integer> list = b;
            boolean z = false;
            if (list != null && !list.isEmpty() && c > 0 && System.currentTimeMillis() - c <= AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED) {
                z = true;
            }
            if (!z) {
                List<Integer> list2 = b;
                if (list2 != null) {
                    list2.clear();
                } else {
                    b = new ArrayList();
                }
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
                    while (it.hasNext()) {
                        b.add(Integer.valueOf(it.next().pid));
                    }
                }
                c = System.currentTimeMillis();
            }
            return b.contains(Integer.valueOf(i));
        } catch (Throwable th) {
            d.b("efs.base", "Process exist judge error", th);
            return true;
        }
    }
}
