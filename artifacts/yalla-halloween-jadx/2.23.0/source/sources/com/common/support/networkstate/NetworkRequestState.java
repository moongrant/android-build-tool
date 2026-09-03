package com.common.support.networkstate;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0002\b\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0002\b\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/common/support/networkstate/NetworkRequestState;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/common/support/networkstate/NetworkStateUtil$NetworkStateChangeListener;", "(Lcom/common/support/networkstate/NetworkStateUtil$NetworkStateChangeListener;)V", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "getNetworkCallback", "()Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback$delegate", "Lkotlin/Lazy;", "subscribe", "", "connectivityManager", "Landroid/net/ConnectivityManager;", "subscribe$networkstate_release", "unsubscribe", "unsubscribe$networkstate_release", "networkstate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NetworkRequestState {

    @NotNull
    private final NetworkStateUtil.NetworkStateChangeListener listener;

    /* JADX INFO: renamed from: networkCallback$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy networkCallback;

    public NetworkRequestState(@NotNull NetworkStateUtil.NetworkStateChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.networkCallback = LazyKt.lazy(new Function0<NetworkRequestState$networkCallback$2.AnonymousClass1>() { // from class: com.common.support.networkstate.NetworkRequestState$networkCallback$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v0, types: [com.common.support.networkstate.NetworkRequestState$networkCallback$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AnonymousClass1 invoke() {
                final NetworkRequestState networkRequestState = this.this$0;
                return new ConnectivityManager.NetworkCallback() { // from class: com.common.support.networkstate.NetworkRequestState$networkCallback$2.1
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onAvailable(@NotNull Network network) {
                        Intrinsics.checkNotNullParameter(network, "network");
                        super.onAvailable(network);
                        networkRequestState.listener.onStateChange(true);
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onLost(@NotNull Network network) {
                        Intrinsics.checkNotNullParameter(network, "network");
                        super.onLost(network);
                        networkRequestState.listener.onStateChange(false);
                    }
                };
            }
        });
    }

    private final ConnectivityManager.NetworkCallback getNetworkCallback() {
        return (ConnectivityManager.NetworkCallback) this.networkCallback.getValue();
    }

    public final void subscribe$networkstate_release(@Nullable ConnectivityManager connectivityManager) {
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
        if (connectivityManager == null) {
            return;
        }
        connectivityManager.registerNetworkCallback(networkRequestBuild, getNetworkCallback());
    }

    public final void unsubscribe$networkstate_release(@Nullable ConnectivityManager connectivityManager) {
        if (connectivityManager == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(getNetworkCallback());
        } catch (IllegalArgumentException unused) {
        }
    }
}
