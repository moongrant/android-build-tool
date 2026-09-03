package com.common.support.utils;

import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\b\u0010\u0019\u001a\u00020\u001aH\u0002\u001a\n\u0010\u001b\u001a\u00020\u001c*\u00020\u0002\u001a\u0012\u0010\u001b\u001a\u00020\u001c*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001a\u001a\n\u0010\u001e\u001a\u00020\u001a*\u00020\u0002\u001a\u0012\u0010\u001e\u001a\u00020\u001a*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001a\u001a\u0012\u0010\u001f\u001a\u00020 *\u00020\u00022\u0006\u0010!\u001a\u00020 \u001a\u0014\u0010\"\u001a\u0004\u0018\u00010#*\u00020\u00022\u0006\u0010$\u001a\u00020 \u001a\n\u0010%\u001a\u00020&*\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u001a*\u00020\u00022\u0006\u0010(\u001a\u00020 \"\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"clipboardManager", "Landroid/content/ClipboardManager;", "Landroid/content/Context;", "getClipboardManager", "(Landroid/content/Context;)Landroid/content/ClipboardManager;", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager", "(Landroid/content/Context;)Landroid/view/inputmethod/InputMethodManager;", "keyguardManager", "Landroid/app/KeyguardManager;", "getKeyguardManager", "(Landroid/content/Context;)Landroid/app/KeyguardManager;", "notificationManager", "Landroid/app/NotificationManager;", "getNotificationManager", "(Landroid/content/Context;)Landroid/app/NotificationManager;", "telephonyManager", "Landroid/telephony/TelephonyManager;", "getTelephonyManager", "(Landroid/content/Context;)Landroid/telephony/TelephonyManager;", "windowManager", "Landroid/view/WindowManager;", "getWindowManager", "(Landroid/content/Context;)Landroid/view/WindowManager;", "retrieveProcessName", "", "appVersionCode", "", RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME, "appVersionName", "color", "", "colorRes", "drawable", "Landroid/graphics/drawable/Drawable;", "drawableRes", "isMainProcess", "", "string", "stringRes", "utils_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ContextExtensionsKt {
    public static final long appVersionCode(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        return appVersionCode(context, packageName);
    }

    @NotNull
    public static final String appVersionName(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        return appVersionName(context, packageName);
    }

    public static final int color(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5298OooO00o;
        return androidx.core.content.res.OooO00o.OooO0O0.OooO00o(resources, i, theme);
    }

    @Nullable
    public static final Drawable drawable(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5298OooO00o;
        return androidx.core.content.res.OooO00o.C0121OooO00o.OooO00o(resources, i, theme);
    }

    @Nullable
    public static final ClipboardManager getClipboardManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("clipboard");
        if (systemService instanceof ClipboardManager) {
            return (ClipboardManager) systemService;
        }
        return null;
    }

    @Nullable
    public static final InputMethodManager getInputMethodManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            return (InputMethodManager) systemService;
        }
        return null;
    }

    @Nullable
    public static final KeyguardManager getKeyguardManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("keyguard");
        if (systemService instanceof KeyguardManager) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    @Nullable
    public static final NotificationManager getNotificationManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("notification");
        if (systemService instanceof NotificationManager) {
            return (NotificationManager) systemService;
        }
        return null;
    }

    @Nullable
    public static final TelephonyManager getTelephonyManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            return (TelephonyManager) systemService;
        }
        return null;
    }

    @Nullable
    public static final WindowManager getWindowManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("window");
        if (systemService instanceof WindowManager) {
            return (WindowManager) systemService;
        }
        return null;
    }

    public static final boolean isMainProcess(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String strRetrieveProcessName = retrieveProcessName();
        if (TextUtils.isEmpty(strRetrieveProcessName)) {
            return true;
        }
        return Intrinsics.areEqual(strRetrieveProcessName, context.getPackageName());
    }

    private static final String retrieveProcessName() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(OooO0OO.OooO00o.OooO00o("/proc/", Process.myPid(), "/cmdline")), "iso-8859-1"));
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                int i = bufferedReader.read();
                if (i <= 0) {
                    sb.trimToSize();
                    String string = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "{\n    val stringBuilder …ingBuilder.toString()\n  }");
                    return string;
                }
                sb.append((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    @NotNull
    public static final String string(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String string = context.getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(stringRes)");
        return string;
    }

    public static final long appVersionCode(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (StringsKt.isBlank(packageName)) {
            return -1L;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "packageManager");
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return -1L;
            }
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    @NotNull
    public static final String appVersionName(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String str = "";
        if (!StringsKt.isBlank(packageName)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "packageManager");
                PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                if (packageInfo == null) {
                    return "";
                }
                str = packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
            Intrinsics.checkNotNullExpressionValue(str, "try {\n    val pm: Packag…ntStackTrace()\n    \"\"\n  }");
        }
        return str;
    }
}
