package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;
import o00000O.o00oO0o;
import p004OooO0oO.o000oOoO;
import p063o0000oO.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class ContextCompat {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f5271OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f5272OooO0O0 = new Object();

    @RequiresApi(24)
    public static class OooO {
        @DoNotInline
        public static Context OooO00o(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @DoNotInline
        public static File OooO0O0(Context context) {
            return context.getDataDir();
        }

        @DoNotInline
        public static boolean OooO0OO(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    @RequiresApi(16)
    public static class OooO00o {
        @DoNotInline
        public static void OooO00o(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        @DoNotInline
        public static void OooO0O0(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    @RequiresApi(19)
    public static class OooO0O0 {
        @DoNotInline
        public static File[] OooO00o(Context context) {
            return context.getExternalCacheDirs();
        }

        @DoNotInline
        public static File[] OooO0O0(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        @DoNotInline
        public static File[] OooO0OO(Context context) {
            return context.getObbDirs();
        }
    }

    @RequiresApi(21)
    public static class OooO0OO {
        @DoNotInline
        public static File OooO00o(Context context) {
            return context.getCodeCacheDir();
        }

        @DoNotInline
        public static Drawable OooO0O0(Context context, int i) {
            return context.getDrawable(i);
        }

        @DoNotInline
        public static File OooO0OO(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    @RequiresApi(23)
    public static class OooO0o {
        @DoNotInline
        public static int OooO00o(Context context, int i) {
            return context.getColor(i);
        }

        @DoNotInline
        public static <T> T OooO0O0(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @DoNotInline
        public static String OooO0OO(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    @RequiresApi(26)
    public static class OooOO0 {
        @DoNotInline
        public static Intent OooO00o(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            if ((i & 4) == 0 || str != null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
            }
            Object obj = ContextCompat.f5271OooO00o;
            String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (PermissionChecker.OooO00o(context, str2) == 0) {
                return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
            }
            throw new RuntimeException(o000oOoO.OooO00o("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
        }

        @DoNotInline
        public static ComponentName OooO0O0(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    @RequiresApi(28)
    public static class OooOO0O {
        @DoNotInline
        public static Executor OooO00o(Context context) {
            return context.getMainExecutor();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface RegisterReceiverFlags {
    }

    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public static int OooO00o(@NonNull Context context, @NonNull String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (BuildCompat.OooO0OO() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new o00oO0o(context).OooO00o() ? 0 : -1;
    }

    @Nullable
    public static ColorStateList OooO0O0(@ColorRes int i, @NonNull Context context) {
        ColorStateList colorStateListOooO00o;
        ColorStateList colorStateList;
        androidx.core.content.res.OooO00o.OooO0OO oooO0OO;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        androidx.core.content.res.OooO00o.OooO0o oooO0o = new androidx.core.content.res.OooO00o.OooO0o(resources, theme);
        synchronized (androidx.core.content.res.OooO00o.f5290OooO0OO) {
            SparseArray<androidx.core.content.res.OooO00o.OooO0OO> sparseArray = androidx.core.content.res.OooO00o.f5289OooO0O0.get(oooO0o);
            colorStateListOooO00o = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (oooO0OO = sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (!oooO0OO.f5292OooO0O0.equals(resources.getConfiguration()) || (!(theme == null && oooO0OO.f5293OooO0OO == 0) && (theme == null || oooO0OO.f5293OooO0OO != theme.hashCode()))) {
                sparseArray.remove(i);
                colorStateList = null;
            } else {
                colorStateList = oooO0OO.f5291OooO00o;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5288OooO00o;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (!(i2 >= 28 && i2 <= 31)) {
            try {
                colorStateListOooO00o = p058o0000Ooo.o000oOoO.OooO00o(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListOooO00o == null) {
            return androidx.core.content.res.OooO00o.OooO0O0.OooO0O0(resources, i, theme);
        }
        androidx.core.content.res.OooO00o.OooO00o(oooO0o, i, colorStateListOooO00o, theme);
        return colorStateListOooO00o;
    }

    @NonNull
    public static Executor OooO0OO(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 28 ? OooOO0O.OooO00o(context) : new o0OOO0o(new Handler(context.getMainLooper()));
    }
}
