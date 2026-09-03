package o00O0OO0;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f36261OooO00o;

    public OooOOO(OooOOOO oooOOOO) {
        this.f36261OooO00o = oooOOOO;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities capabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        o0Oo0oo.OooO0Oo().OooO00o(OooOo00.f36266OooO00o, "Network capabilities changed: " + capabilities);
        OooOOOO oooOOOO = this.f36261OooO00o;
        oooOOOO.OooO0OO(OooOo00.OooO00o(oooOOOO.f36263OooO0o));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        o0Oo0oo.OooO0Oo().OooO00o(OooOo00.f36266OooO00o, "Network connection lost");
        OooOOOO oooOOOO = this.f36261OooO00o;
        oooOOOO.OooO0OO(OooOo00.OooO00o(oooOOOO.f36263OooO0o));
    }
}
