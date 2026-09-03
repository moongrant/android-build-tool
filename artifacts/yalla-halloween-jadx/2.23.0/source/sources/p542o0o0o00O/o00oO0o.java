package p542o0o0o00O;

import com.common.support.longlink.pulse.PulseAdapter;
import com.common.support.longlink.pulse.PulseStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o implements PulseAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final PulseStrategy f55793OooO00o = PulseStrategy.CLIENT_PING_PONG;

    @Override // com.common.support.longlink.pulse.PulseAdapter
    @NotNull
    public final PulseStrategy getPulseStrategy() {
        return this.f55793OooO00o;
    }

    @Override // com.common.support.longlink.pulse.PulseAdapter
    public final long getPulseTimeoutMillis() {
        return 45000L;
    }

    @Override // com.common.support.longlink.pulse.PulseAdapter
    public final boolean isLazyStart() {
        return false;
    }

    @Override // com.common.support.longlink.pulse.PulseAdapter
    public final long pulseInterval() {
        return 20000L;
    }
}
