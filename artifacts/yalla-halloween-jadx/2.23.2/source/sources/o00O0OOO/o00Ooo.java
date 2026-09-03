package o00O0OOO;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import androidx.work.WorkManager;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "ProcessUtils")
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final String f36299OooO00o;

    static {
        String strOooO0o = p115o00O00oO.o0Oo0oo.OooO0o("ProcessUtils");
        Intrinsics.checkNotNullExpressionValue(strOooO0o, "tagWithPrefix(\"ProcessUtils\")");
        f36299OooO00o = strOooO0o;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    public static final boolean OooO00o(@NotNull Context context, @NotNull androidx.work.OooO00o configuration) {
        String strOooO00o;
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            strOooO00o = OooO00o.f36275OooO00o.OooO00o();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, WorkManager.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, new Object[0]);
                Intrinsics.checkNotNull(objInvoke);
                if (objInvoke instanceof String) {
                    strOooO00o = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    Object systemService = context.getSystemService("activity");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!(((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid));
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strOooO00o = runningAppProcessInfo.processName;
                        } else {
                            strOooO00o = null;
                        }
                    } else {
                        strOooO00o = null;
                    }
                }
            } catch (Throwable th) {
                if (((o00O00oO.o0Oo0oo.OooO00o) p115o00O00oO.o0Oo0oo.OooO0Oo()).f36159OooO0OO <= 3) {
                    Log.d(f36299OooO00o, "Unable to check ActivityThread for processName", th);
                }
            }
        }
        configuration.getClass();
        return Intrinsics.areEqual(strOooO00o, context.getApplicationInfo().processName);
    }
}
