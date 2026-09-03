package p479o0o000OO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.longlink.pulse.PulseAdapter;
import com.common.support.longlink.pulse.PulseStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00Ooo implements PulseAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00Ooo f47680OooO00o = new o00Ooo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final PulseStrategy f47681OooO0O0 = PulseStrategy.CLIENT_PING;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f47682OooO0OO = 35000;

    @Override // com.common.support.longlink.pulse.PulseAdapter
    @NotNull
    public final PulseStrategy getPulseStrategy() {
        return f47681OooO0O0;
    }

    @Override // com.common.support.longlink.pulse.PulseAdapter
    public final long getPulseTimeoutMillis() {
        return f47682OooO0OO;
    }

    @Override // com.common.support.longlink.pulse.PulseAdapter
    public final boolean isLazyStart() {
        return false;
    }

    @Override // com.common.support.longlink.pulse.PulseAdapter
    public final long pulseInterval() {
        return 15000L;
    }
}
