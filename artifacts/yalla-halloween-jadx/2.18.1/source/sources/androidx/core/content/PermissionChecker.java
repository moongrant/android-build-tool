package androidx.core.content;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o000OO0O.OooO0OO;
import p070o0000ooO.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionChecker {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface PermissionResult {
    }

    public static int OooO00o(@NonNull Context context, @NonNull String str) {
        int iOooO00o;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        int i = Build.VERSION.SDK_INT;
        String strOooO0Oo = i >= 23 ? o0Oo0oo.OooO00o.OooO0Oo(str) : null;
        if (strOooO0Oo != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (!(Process.myUid() == iMyUid && OooO0OO.OooO00o(context.getPackageName(), packageName)) || i < 29) {
                iOooO00o = o0Oo0oo.OooO00o(context, strOooO0Oo, packageName);
            } else {
                AppOpsManager appOpsManagerOooO0OO = o0Oo0oo.OooO0O0.OooO0OO(context);
                iOooO00o = o0Oo0oo.OooO0O0.OooO00o(appOpsManagerOooO0OO, strOooO0Oo, Binder.getCallingUid(), packageName);
                if (iOooO00o == 0) {
                    iOooO00o = o0Oo0oo.OooO0O0.OooO00o(appOpsManagerOooO0OO, strOooO0Oo, iMyUid, o0Oo0oo.OooO0O0.OooO0O0(context));
                }
            }
            if (iOooO00o != 0) {
                return -2;
            }
        }
        return 0;
    }
}
