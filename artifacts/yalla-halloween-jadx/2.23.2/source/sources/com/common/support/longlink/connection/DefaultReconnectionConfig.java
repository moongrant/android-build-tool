package com.common.support.longlink.connection;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/common/support/longlink/connection/DefaultReconnectionConfig;", "Lcom/common/support/longlink/connection/ReconnectionConfig;", "()V", "maxReconnectionGap", "", "getMaxReconnectionGap", "()J", "maxReconnectionTimes", "", "getMaxReconnectionTimes", "()I", "beforeReconnection", "", "retryTimes", "reconnectionGap", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class DefaultReconnectionConfig implements ReconnectionConfig {
    private final long maxReconnectionGap = 8000;
    private final int maxReconnectionTimes = -1;

    @Override // com.common.support.longlink.connection.ReconnectionConfig
    public void beforeReconnection(int retryTimes) {
    }

    @Override // com.common.support.longlink.connection.ReconnectionConfig
    public long getMaxReconnectionGap() {
        return this.maxReconnectionGap;
    }

    @Override // com.common.support.longlink.connection.ReconnectionConfig
    public int getMaxReconnectionTimes() {
        return this.maxReconnectionTimes;
    }

    @Override // com.common.support.longlink.connection.ReconnectionConfig
    public long reconnectionGap(int retryTimes) {
        return RangesKt.coerceAtMost(((long) retryTimes) * 2000, 8000L);
    }
}
