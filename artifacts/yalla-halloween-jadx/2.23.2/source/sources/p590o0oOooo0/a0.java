package p590o0oOooo0;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.util.NetWorkState;
import org.jetbrains.annotations.NotNull;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class a0 {
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    @NotNull
    public static NetWorkState OooO00o() {
        NetworkInfo.State state;
        NetWorkState netWorkState = NetWorkState.NONE;
        App app = App.f22232OooO0o;
        NetworkInfo.State state2 = null;
        if (app != null) {
            Object systemService = app.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                connectivityManager.getActiveNetworkInfo();
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                NetworkInfo.State state3 = networkInfo != null ? networkInfo.getState() : null;
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
                state2 = networkInfo2 != null ? networkInfo2.getState() : null;
                NetworkInfo.State state4 = NetworkInfo.State.CONNECTED;
                if (state3 == state4) {
                    netWorkState = NetWorkState.WIFI;
                } else if (state2 == state4) {
                    netWorkState = NetWorkState.MOBILE;
                }
                state = state2;
                state2 = state3;
            } else {
                state = null;
            }
        } else {
            state = null;
        }
        o0000O00.OooO("connectState \n wifiState = " + state2 + " \n mobileState = " + state + " \n connectState = " + netWorkState);
        return netWorkState;
    }
}
