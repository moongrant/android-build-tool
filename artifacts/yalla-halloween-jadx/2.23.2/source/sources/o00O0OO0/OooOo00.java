package o00O0OO0;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p067o0000oo.o000000O;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final String f36266OooO00o;

    static {
        String strOooO0o = o0Oo0oo.OooO0o("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(strOooO0o, "tagWithPrefix(\"NetworkStateTracker\")");
        f36266OooO00o = strOooO0o;
    }

    @NotNull
    public static final o00O0O0O.OooO0O0 OooO00o(@NotNull ConnectivityManager connectivityManager) {
        boolean zOooO0O0;
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilitiesOooO00o = o00O0OOO.Oooo0.OooO00o(connectivityManager, o00O0OOO.o000oOoO.OooO00o(connectivityManager));
            zOooO0O0 = networkCapabilitiesOooO00o != null ? o00O0OOO.Oooo0.OooO0O0(networkCapabilitiesOooO00o, 16) : false;
        } catch (SecurityException e) {
            o0Oo0oo.OooO0Oo().OooO0OO(f36266OooO00o, "Unable to validate active network", e);
        }
        return new o00O0O0O.OooO0O0(z, zOooO0O0, o000000O.OooO00o(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
