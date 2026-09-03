package p277o0O000oo;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO.OooO00o f35097OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f35098OooO0O0;

    public static final class OooO00o extends Lambda implements Function0<OooO0O0> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO0O0 invoke() {
            return new OooO0O0(OooO0OO.this);
        }
    }

    public OooO0OO(@NotNull OooO.OooO00o listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f35097OooO00o = listener;
        this.f35098OooO0O0 = LazyKt.lazy(new OooO00o());
    }

    public final void OooO00o(@Nullable ConnectivityManager connectivityManager) {
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
        if (connectivityManager == null) {
            return;
        }
        connectivityManager.registerNetworkCallback(networkRequestBuild, (ConnectivityManager.NetworkCallback) this.f35098OooO0O0.getValue());
    }
}
