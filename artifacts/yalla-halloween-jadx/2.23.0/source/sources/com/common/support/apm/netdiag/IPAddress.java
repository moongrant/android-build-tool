package com.common.support.apm.netdiag;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/common/support/apm/netdiag/IPAddress;", "", "ip", "", "(Ljava/lang/String;)V", "getIp", "()Ljava/lang/String;", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class IPAddress {

    @NotNull
    private final String ip;

    public IPAddress(@NotNull String ip) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        this.ip = ip;
    }

    @NotNull
    public final String getIp() {
        return this.ip;
    }
}
