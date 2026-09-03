package com.common.support.apm.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.compose.foundation.layout.OooO0O0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/common/support/apm/utils/AppUtil;", "", "()V", "getDeviceInfo", "", "getVersionCode", "", "context", "Landroid/content/Context;", "getVersionName", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AppUtil {

    @NotNull
    public static final AppUtil INSTANCE = new AppUtil();

    private AppUtil() {
    }

    @NotNull
    public final String getDeviceInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) Build.DEVICE);
        sb.append(' ');
        sb.append((Object) Build.MODEL);
        sb.append("(Api ");
        return OooO0O0.OooO00o(sb, Build.VERSION.SDK_INT, ')');
    }

    public final long getVersionCode(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "packageManager.getPackag…o(context.packageName, 0)");
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0L;
        }
    }

    @NotNull
    public final String getVersionName(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "packageManager.getPackag…o(context.packageName, 0)");
            String str = packageInfo.versionName;
            Intrinsics.checkNotNullExpressionValue(str, "packageInfo.versionName");
            return str;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }
}
