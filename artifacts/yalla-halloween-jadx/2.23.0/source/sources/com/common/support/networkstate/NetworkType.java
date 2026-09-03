package com.common.support.networkstate;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/common/support/networkstate/NetworkType;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "NETWORK_NONE", "NETWORK_UNKNOWN", "NETWORK_WIFI", "NETWORK_2G", "NETWORK_3G", "NETWORK_4G", "NETWORK_5G", "networkstate_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum NetworkType {
    NETWORK_NONE(-1),
    NETWORK_UNKNOWN(0),
    NETWORK_WIFI(1),
    NETWORK_2G(2),
    NETWORK_3G(3),
    NETWORK_4G(4),
    NETWORK_5G(5);

    private final int type;

    NetworkType(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }
}
