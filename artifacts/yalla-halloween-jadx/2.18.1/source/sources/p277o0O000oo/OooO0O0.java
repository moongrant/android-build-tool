package p277o0O000oo;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f35096OooO00o;

    public OooO0O0(OooO0OO oooO0OO) {
        this.f35096OooO00o = oooO0OO;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onAvailable(network);
        this.f35096OooO00o.f35097OooO00o.OooO00o(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onLost(network);
        this.f35096OooO00o.f35097OooO00o.OooO00o(false);
    }
}
