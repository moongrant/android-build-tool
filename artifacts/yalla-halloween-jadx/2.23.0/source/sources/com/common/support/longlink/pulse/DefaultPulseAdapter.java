package com.common.support.longlink.pulse;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/common/support/longlink/pulse/DefaultPulseAdapter;", "Lcom/common/support/longlink/pulse/PulseAdapter;", "()V", "isLazyStart", "", "()Z", "pulseStrategy", "Lcom/common/support/longlink/pulse/PulseStrategy;", "getPulseStrategy", "()Lcom/common/support/longlink/pulse/PulseStrategy;", "pulseTimeoutMillis", "", "getPulseTimeoutMillis", "()J", "pulseInterval", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class DefaultPulseAdapter implements PulseAdapter {
    private final boolean isLazyStart;

    @NotNull
    private final PulseStrategy pulseStrategy = PulseStrategy.SERVER_PING;

    @Override // com.common.support.longlink.pulse.PulseAdapter
    @NotNull
    public PulseStrategy getPulseStrategy() {
        return this.pulseStrategy;
    }

    @Override // com.common.support.longlink.pulse.PulseAdapter
    public long getPulseTimeoutMillis() {
        return 15000L;
    }

    @Override // com.common.support.longlink.pulse.PulseAdapter
    /* JADX INFO: renamed from: isLazyStart, reason: from getter */
    public boolean getIsLazyStart() {
        return this.isLazyStart;
    }

    @Override // com.common.support.longlink.pulse.PulseAdapter
    public long pulseInterval() {
        return 5000L;
    }
}
