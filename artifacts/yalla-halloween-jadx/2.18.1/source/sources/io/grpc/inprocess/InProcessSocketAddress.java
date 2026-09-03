package io.grpc.inprocess;

import java.net.SocketAddress;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class InProcessSocketAddress extends SocketAddress {
    public final boolean equals(Object obj) {
        if (!(obj instanceof InProcessSocketAddress)) {
            return false;
        }
        Objects.requireNonNull((InProcessSocketAddress) obj);
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return null;
    }
}
