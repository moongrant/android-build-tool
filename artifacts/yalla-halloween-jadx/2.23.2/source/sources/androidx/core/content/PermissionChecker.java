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
import o00000O.OooOOO;
import o00000O.OooOOO0;
import o000OO.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionChecker {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface PermissionResult {
    }

    public static int OooO00o(@NonNull Context context, @NonNull String str) {
        int iOooO0OO;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strOooO0Oo = OooOOO0.OooO0Oo(str);
        if (strOooO0Oo != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (!(Process.myUid() == iMyUid && OooO0OO.OooO00o(context.getPackageName(), packageName)) || Build.VERSION.SDK_INT < 29) {
                iOooO0OO = OooOOO0.OooO0OO((AppOpsManager) OooOOO0.OooO00o(context, AppOpsManager.class), strOooO0Oo, packageName);
            } else {
                AppOpsManager appOpsManagerOooO0OO = OooOOO.OooO0OO(context);
                iOooO0OO = OooOOO.OooO00o(appOpsManagerOooO0OO, strOooO0Oo, Binder.getCallingUid(), packageName);
                if (iOooO0OO == 0) {
                    iOooO0OO = OooOOO.OooO00o(appOpsManagerOooO0OO, strOooO0Oo, iMyUid, OooOOO.OooO0O0(context));
                }
            }
            if (iOooO0OO != 0) {
                return -2;
            }
        }
        return 0;
    }
}
