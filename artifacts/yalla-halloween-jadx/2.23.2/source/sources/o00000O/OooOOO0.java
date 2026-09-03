package o00000O;

import android.app.AppOpsManager;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class OooOOO0 {
    @DoNotInline
    public static <T> T OooO00o(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    @DoNotInline
    public static int OooO0O0(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    @DoNotInline
    public static int OooO0OO(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    @DoNotInline
    public static String OooO0Oo(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
