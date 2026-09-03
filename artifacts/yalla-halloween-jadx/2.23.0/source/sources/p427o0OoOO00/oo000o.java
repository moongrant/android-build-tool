package p427o0OoOO00;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nPackManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackManager.kt\ncom/yalla/yalla/manager/PackManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1855#2,2:162\n1#3:164\n*S KotlinDebug\n*F\n+ 1 PackManager.kt\ncom/yalla/yalla/manager/PackManager\n*L\n25#1:162,2\n*E\n"})
public final class oo000o {
    public static void OooO00o(@Nullable Context context) {
        if (context != null) {
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "it.packageName");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
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
                        OooO0Oo(context, packageName);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + context.getPackageName()));
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(intent);
                } else {
                    OooO0Oo(context, packageName);
                }
            }
        }
    }

    public static boolean OooO0O0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return OooO0OO(context, "com.android.vending") && OooO0OO(context, "com.google.android.gms");
    }

    public static boolean OooO0OO(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = false;
        try {
            List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
            Intrinsics.checkNotNullExpressionValue(installedPackages, "packageManager.getInstalledPackages(0)");
            Iterator<T> it = installedPackages.iterator();
            while (it.hasNext()) {
                String str2 = ((PackageInfo) it.next()).packageName;
                Intrinsics.checkNotNullExpressionValue(str2, "packageInfo.packageName");
                if (StringsKt__StringsKt.contains(str2, str, true)) {
                    z = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return z;
    }

    public static void OooO0Oo(@NotNull Context context, @Nullable String str) {
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
                    if (str == null || str.length() == 0) {
                        uri4 = Uri.parse("market://details?id=" + context.getPackageName());
                    } else {
                        uri4 = Uri.parse("market://details?id=" + str);
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
                if (str != null && str.length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    uri3 = Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName());
                } else {
                    uri3 = Uri.parse("http://play.google.com/store/apps/details?id=" + str);
                }
                intent = new Intent("android.intent.action.VIEW", uri3);
                context.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
                if (str != null && str.length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    uri2 = Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName());
                } else {
                    uri2 = Uri.parse("http://play.google.com/store/apps/details?id=" + str);
                }
                intent = new Intent("android.intent.action.VIEW", uri2);
            }
        } catch (Throwable th) {
            if (str != null && str.length() != 0) {
                z2 = false;
            }
            if (z2) {
                uri = Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName());
            } else {
                uri = Uri.parse("http://play.google.com/store/apps/details?id=" + str);
            }
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
            throw th;
        }
    }
}
