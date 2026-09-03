package androidx.multidex;

import OooO00o.OooO00o;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.File;
import java.util.Set;
import p085o000Ooo0.OooO;

/* JADX INFO: loaded from: classes.dex */
public class MultiDexApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        Set<File> set = OooO.f28392OooO00o;
        Log.i("MultiDex", "Installing application");
        try {
            if (OooO.f28393OooO0O0) {
                Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
                return;
            }
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException e) {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            } else {
                OooO.OooO0OO(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
                Log.i("MultiDex", "install done");
            }
        } catch (Exception e2) {
            Log.e("MultiDex", "MultiDex installation failure", e2);
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("MultiDex installation failed (");
            sbOooO0o0.append(e2.getMessage());
            sbOooO0o0.append(").");
            throw new RuntimeException(sbOooO0o0.toString());
        }
    }
}
