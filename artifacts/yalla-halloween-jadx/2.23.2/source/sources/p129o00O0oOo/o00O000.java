package p129o00O0oOo;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"MissingPermission"})
public final class o00O000 implements o00oOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ConnectivityManager f36746OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00oOoo.OooO00o f36747OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooO00o f36748OooO0OO;

    public static final class OooO00o extends ConnectivityManager.NetworkCallback {
        public OooO00o() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@NotNull Network network) {
            o00O000.OooO0O0(o00O000.this, network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NotNull Network network) {
            o00O000.OooO0O0(o00O000.this, network, false);
        }
    }

    public o00O000(@NotNull ConnectivityManager connectivityManager, @NotNull o00oOoo.OooO00o oooO00o) {
        this.f36746OooO00o = connectivityManager;
        this.f36747OooO0O0 = oooO00o;
        OooO00o oooO00o2 = new OooO00o();
        this.f36748OooO0OO = oooO00o2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), oooO00o2);
    }

    public static final void OooO0O0(o00O000 o00o001, Network network, boolean z) {
        boolean z2;
        boolean z3 = false;
        for (Network network2 : o00o001.f36746OooO00o.getAllNetworks()) {
            if (Intrinsics.areEqual(network2, network)) {
                z2 = z;
            } else {
                NetworkCapabilities networkCapabilities = o00o001.f36746OooO00o.getNetworkCapabilities(network2);
                z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z2) {
                z3 = true;
                break;
            }
        }
        o00o001.f36747OooO0O0.OooO00o(z3);
    }

    @Override // p129o00O0oOo.o00oOoo
    public final boolean OooO00o() {
        ConnectivityManager connectivityManager = this.f36746OooO00o;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // p129o00O0oOo.o00oOoo
    public final void shutdown() {
        this.f36746OooO00o.unregisterNetworkCallback(this.f36748OooO0OO);
    }
}
