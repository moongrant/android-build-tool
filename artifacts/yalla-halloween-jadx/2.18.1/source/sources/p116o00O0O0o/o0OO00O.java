package p116o00O0O0o;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@SuppressLint({"MissingPermission"})
public final class o0OO00O implements o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ConnectivityManager f30546OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo.OooO00o f30547OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooO00o f30548OooO0OO;

    public static final class OooO00o extends ConnectivityManager.NetworkCallback {
        public OooO00o() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            o0OO00O.OooO0O0(o0OO00O.this, network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            o0OO00O.OooO0O0(o0OO00O.this, network, false);
        }
    }

    public o0OO00O(@NotNull ConnectivityManager connectivityManager, @NotNull o0Oo0oo.OooO00o listener) {
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30546OooO00o = connectivityManager;
        this.f30547OooO0O0 = listener;
        OooO00o oooO00o = new OooO00o();
        this.f30548OooO0OO = oooO00o;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), oooO00o);
    }

    public static final void OooO0O0(o0OO00O o0oo00o2, Network network, boolean z) {
        boolean z2;
        Network[] allNetworks = o0oo00o2.f30546OooO00o.getAllNetworks();
        Intrinsics.checkNotNullExpressionValue(allNetworks, "connectivityManager.allNetworks");
        boolean z3 = false;
        for (Network it : allNetworks) {
            if (Intrinsics.areEqual(it, network)) {
                z2 = z;
            } else {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                NetworkCapabilities networkCapabilities = o0oo00o2.f30546OooO00o.getNetworkCapabilities(it);
                z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z2) {
                z3 = true;
                break;
            }
        }
        o0oo00o2.f30547OooO0O0.OooO00o(z3);
    }

    @Override // p116o00O0O0o.o0Oo0oo
    public final boolean OooO00o() {
        Network[] allNetworks = this.f30546OooO00o.getAllNetworks();
        Intrinsics.checkNotNullExpressionValue(allNetworks, "connectivityManager.allNetworks");
        for (Network it : allNetworks) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            NetworkCapabilities networkCapabilities = this.f30546OooO00o.getNetworkCapabilities(it);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // p116o00O0O0o.o0Oo0oo
    public final void shutdown() {
        this.f30546OooO00o.unregisterNetworkCallback(this.f30548OooO0OO);
    }
}
