package o000O00O;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 {

    @RequiresApi(24)
    public static class OooO00o {
        @DoNotInline
        public static boolean OooO00o(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean OooO00o(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return OooO00o.OooO00o(context);
        }
        return true;
    }
}
