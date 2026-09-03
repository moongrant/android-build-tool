package o00000O;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {

    @RequiresApi(16)
    public static class OooO00o {
        @DoNotInline
        public static Intent OooO00o(Activity activity) {
            return activity.getParentActivityIntent();
        }

        @DoNotInline
        public static boolean OooO0O0(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        @DoNotInline
        public static boolean OooO0OO(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    @Nullable
    public static Intent OooO00o(@NonNull Activity activity) {
        Intent intentOooO00o = OooO00o.OooO00o(activity);
        if (intentOooO00o != null) {
            return intentOooO00o;
        }
        try {
            String strOooO0OO = OooO0OO(activity, activity.getComponentName());
            if (strOooO0OO == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, strOooO0OO);
            try {
                return OooO0OO(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strOooO0OO + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Nullable
    public static Intent OooO0O0(@NonNull Context context, @NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strOooO0OO = OooO0OO(context, componentName);
        if (strOooO0OO == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strOooO0OO);
        return OooO0OO(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    @Nullable
    public static String OooO0OO(@NonNull Context context, @NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            i = 269222528;
        } else {
            i = i2 >= 24 ? 787072 : 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }
}
