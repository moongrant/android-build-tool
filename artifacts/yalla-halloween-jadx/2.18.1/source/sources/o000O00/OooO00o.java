package o000O00;

import android.net.ConnectivityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(16)
public final class OooO00o {
    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    @DoNotInline
    public static boolean OooO00o(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
