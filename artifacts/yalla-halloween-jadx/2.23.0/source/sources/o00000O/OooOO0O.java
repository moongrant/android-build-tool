package o00000O;

import android.app.AppOpsManager;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class OooOO0O {
    @DoNotInline
    public static int OooO00o(@Nullable AppOpsManager appOpsManager, @NonNull String str, int i, @NonNull String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    @NonNull
    @DoNotInline
    public static String OooO0O0(@NonNull Context context) {
        return context.getOpPackageName();
    }

    @Nullable
    @DoNotInline
    public static AppOpsManager OooO0OO(@NonNull Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
