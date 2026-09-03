package p070o0000ooO;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f27984OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final NotificationManager f27985OooO0O0;

    static {
        new HashSet();
    }

    public o0000Ooo(Context context) {
        this.f27984OooO00o = context;
        this.f27985OooO0O0 = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean OooO00o() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f27985OooO0O0.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f27984OooO00o.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f27984OooO00o.getApplicationInfo();
        String packageName = this.f27984OooO00o.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
