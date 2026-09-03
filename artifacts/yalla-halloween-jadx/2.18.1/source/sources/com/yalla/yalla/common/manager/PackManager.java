package com.yalla.yalla.common.manager;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0013\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/common/manager/PackManager;", "", "()V", "GOOGLE_GMS", "", "GOOGLE_VENDING", "HUAWEI_HwId", "YallaChat_PackageName", "goToAppStore", "", d.R, "Landroid/content/Context;", "packageName", "isHaveGooglePlay", "", "isHaveHuaWeiPay", "isInstalled", "isInstalledYallaChat", "toGooglePlay", "toYallaChatGoogleStore", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PackManager {
    public static final int $stable = 0;

    @NotNull
    private static final String GOOGLE_GMS = "com.google.android.gms";

    @NotNull
    private static final String GOOGLE_VENDING = "com.android.vending";

    @NotNull
    private static final String HUAWEI_HwId = "com.huawei.hwid";

    @NotNull
    public static final PackManager INSTANCE = new PackManager();

    @NotNull
    private static final String YallaChat_PackageName = "com.yallatech.yallachat";

    private PackManager() {
    }

    public static /* synthetic */ void toGooglePlay$default(PackManager packManager, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        packManager.toGooglePlay(context, str);
    }

    public final void goToAppStore(@Nullable Context context) {
        if (context != null) {
            PackManager packManager = INSTANCE;
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "it.packageName");
            packManager.goToAppStore(context, packageName);
        }
    }

    public final boolean isHaveGooglePlay(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return isInstalled(context, "com.android.vending") && isInstalled(context, "com.google.android.gms");
    }

    public final boolean isHaveHuaWeiPay(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return isInstalled(context, HUAWEI_HwId);
    }

    public final boolean isInstalled(@NotNull Context context, @Nullable String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = false;
        if (packageName != null) {
            try {
                List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
                Intrinsics.checkNotNullExpressionValue(installedPackages, "packageManager.getInstalledPackages(0)");
                Iterator<T> it = installedPackages.iterator();
                while (it.hasNext()) {
                    String str = ((PackageInfo) it.next()).packageName;
                    Intrinsics.checkNotNullExpressionValue(str, "packageInfo.packageName");
                    if (StringsKt__StringsKt.contains(str, packageName, true)) {
                        z = true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return z;
    }

    public final boolean isInstalledYallaChat() {
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        return isInstalled(contextOooO0O0, YallaChat_PackageName);
    }

    public final void toGooglePlay(@NotNull Context context, @Nullable String packageName) {
        Uri uri;
        Uri uri2;
        Intent intent;
        boolean z;
        Uri uri3;
        Uri uri4;
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z2 = true;
        try {
            try {
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.android.vending");
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.activities.LaunchUrlHandlerActivity"));
                    if (packageName == null || packageName.length() == 0) {
                        uri4 = Uri.parse("market://details?id=" + context.getPackageName());
                    } else {
                        uri4 = Uri.parse("market://details?id=" + packageName);
                    }
                    launchIntentForPackage.setData(uri4);
                    context.startActivity(launchIntentForPackage);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
                if (packageName != null && packageName.length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("http://play.google.com/store/apps/details?id=");
                    sbOooO0o0.append(context.getPackageName());
                    uri3 = Uri.parse(sbOooO0o0.toString());
                } else {
                    uri3 = Uri.parse("http://play.google.com/store/apps/details?id=" + packageName);
                }
                intent = new Intent("android.intent.action.VIEW", uri3);
                context.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
                if (packageName != null && packageName.length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("http://play.google.com/store/apps/details?id=");
                    sbOooO0o1.append(context.getPackageName());
                    uri2 = Uri.parse(sbOooO0o1.toString());
                } else {
                    uri2 = Uri.parse("http://play.google.com/store/apps/details?id=" + packageName);
                }
                intent = new Intent("android.intent.action.VIEW", uri2);
            }
        } catch (Throwable th) {
            if (packageName != null && packageName.length() != 0) {
                z2 = false;
            }
            if (z2) {
                StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("http://play.google.com/store/apps/details?id=");
                sbOooO0o2.append(context.getPackageName());
                uri = Uri.parse(sbOooO0o2.toString());
            } else {
                uri = Uri.parse("http://play.google.com/store/apps/details?id=" + packageName);
            }
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
            throw th;
        }
    }

    public final void toYallaChatGoogleStore() {
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        goToAppStore(contextOooO0O0, YallaChat_PackageName);
    }

    public final void goToAppStore(@Nullable Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (context != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            try {
                intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                intent.setData(Uri.parse("market://details?id=" + packageName));
                intent.setPackage("com.android.vending");
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(intent);
                } else {
                    intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + context.getPackageName()));
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        context.startActivity(intent);
                    } else {
                        INSTANCE.toGooglePlay(context, packageName);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + context.getPackageName()));
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(intent);
                } else {
                    INSTANCE.toGooglePlay(context, packageName);
                }
            }
        }
    }

    public final void toGooglePlay(@NotNull Context context) {
        Intent intent;
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            try {
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.android.vending");
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.activities.LaunchUrlHandlerActivity"));
                    launchIntentForPackage.setData(Uri.parse("market://details?id=" + context.getPackageName()));
                    context.startActivity(launchIntentForPackage);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("http://play.google.com/store/apps/details?id=");
                sbOooO0o0.append(context.getPackageName());
                intent = new Intent("android.intent.action.VIEW", Uri.parse(sbOooO0o0.toString()));
                context.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("http://play.google.com/store/apps/details?id=");
                sbOooO0o1.append(context.getPackageName());
                intent = new Intent("android.intent.action.VIEW", Uri.parse(sbOooO0o1.toString()));
            }
        } catch (Throwable th) {
            StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("http://play.google.com/store/apps/details?id=");
            sbOooO0o2.append(context.getPackageName());
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sbOooO0o2.toString())));
            throw th;
        }
    }
}
