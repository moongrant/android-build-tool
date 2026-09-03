package p516o0o0O000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class Oooo000 {
    public static final boolean OooO00o(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 16384);
            if (!Intrinsics.areEqual(packageName, "com.android.vending")) {
                return packageInfo != null;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.example.android"));
            intent.setPackage("com.android.vending");
            return (packageInfo == null || packageManager.resolveActivity(intent, 65536) == null) ? false : true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static final void OooO0O0(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void OooO0OO(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Uri uri = Uri.parse("market://details?id=" + packageName);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(\"market://details?id=$packageName\")");
        OooO0O0(context, uri);
    }
}
