package o0O0000O;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends o0O00000.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f35035OooO00o;

    public OooO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35035OooO00o = context;
    }

    @Override // o0O00000.OooO00o
    public final void OooO00o(@NotNull o0O00.OooO00o model) {
        NetworkInfo networkInfo;
        Intrinsics.checkNotNullParameter(model, "model");
        String property = System.getProperty("http.proxyHost");
        if (property == null) {
            property = "unknown host";
        }
        String property2 = System.getProperty("http.proxyPort");
        if (property2 == null) {
            property2 = "-1";
        }
        String str = property + ':' + property2;
        Objects.requireNonNull(model);
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        model.f35025OooO0oo = str;
        Object systemService = this.f35035OooO00o.getSystemService("connectivity");
        if (!(systemService instanceof ConnectivityManager) || (networkInfo = ((ConnectivityManager) systemService).getNetworkInfo(17)) == null) {
            return;
        }
        networkInfo.isConnected();
    }
}
