package com.common.support.longlink.pulse;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\r\u001a\u00020\nH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/common/support/longlink/pulse/PulseAdapter;", "", "isLazyStart", "", "()Z", "pulseStrategy", "Lcom/common/support/longlink/pulse/PulseStrategy;", "getPulseStrategy", "()Lcom/common/support/longlink/pulse/PulseStrategy;", "pulseTimeoutMillis", "", "getPulseTimeoutMillis", "()J", "pulseInterval", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface PulseAdapter {
    @NotNull
    PulseStrategy getPulseStrategy();

    long getPulseTimeoutMillis();

    boolean isLazyStart();

    long pulseInterval();
}
