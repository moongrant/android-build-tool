package p516o0o0O000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 {
    public static boolean OooO00o(Context context) {
        String strTrim;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String str;
        String packageName = context.getPackageName();
        String str2 = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            strTrim = bufferedReader.readLine().trim();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
            strTrim = "";
        }
        if (TextUtils.isEmpty(strTrim)) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                    int iMyPid = Process.myPid();
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strTrim = "";
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (next.pid == iMyPid && (str = next.processName) != null) {
                            strTrim = str;
                            break;
                        }
                    }
                } else {
                    strTrim = "";
                    break;
                }
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(strTrim)) {
                try {
                    Field field = context.getClass().getField("mLoadedApk");
                    field.setAccessible(true);
                    Object obj = field.get(context);
                    Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    str2 = (String) obj2.getClass().getDeclaredMethod("getProcessName", new Class[0]).invoke(obj2, new Object[0]);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                strTrim = str2;
            }
        }
        return packageName.equals(strTrim);
    }
}
