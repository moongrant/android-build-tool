package com.common.support.networkstate;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/common/support/networkstate/NetworkState;", "", "isConnected", "", "networkType", "Lcom/common/support/networkstate/NetworkType;", "(ZLcom/common/support/networkstate/NetworkType;)V", "()Z", "getNetworkType", "()Lcom/common/support/networkstate/NetworkType;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "networkstate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class NetworkState {
    private final boolean isConnected;

    @NotNull
    private final NetworkType networkType;

    public NetworkState(boolean z, @NotNull NetworkType networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        this.isConnected = z;
        this.networkType = networkType;
    }

    public static /* synthetic */ NetworkState copy$default(NetworkState networkState, boolean z, NetworkType networkType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = networkState.isConnected;
        }
        if ((i & 2) != 0) {
            networkType = networkState.networkType;
        }
        return networkState.copy(z, networkType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NetworkType getNetworkType() {
        return this.networkType;
    }

    @NotNull
    public final NetworkState copy(boolean isConnected, @NotNull NetworkType networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        return new NetworkState(isConnected, networkType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) other;
        return this.isConnected == networkState.isConnected && this.networkType == networkState.networkType;
    }

    @NotNull
    public final NetworkType getNetworkType() {
        return this.networkType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public int hashCode() {
        boolean z = this.isConnected;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.networkType.hashCode() + (r0 * 31);
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    @NotNull
    public String toString() {
        return "NetworkState(isConnected=" + this.isConnected + ", networkType=" + this.networkType + ')';
    }

    public /* synthetic */ NetworkState(boolean z, NetworkType networkType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? NetworkType.NETWORK_NONE : networkType);
    }
}
