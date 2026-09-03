package com.common.support.longlink.pulse;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\nJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/common/support/longlink/pulse/Pulse;", "", "ping", "", "pong", "setOnPulseTimeoutListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/common/support/longlink/pulse/Pulse$OnPulseTimeoutListener;", "start", "stop", "OnPulseTimeoutListener", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Pulse {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/common/support/longlink/pulse/Pulse$OnPulseTimeoutListener;", "", "onPulseTimeout", "", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnPulseTimeoutListener {
        void onPulseTimeout();
    }

    void ping();

    void pong();

    void setOnPulseTimeoutListener(@NotNull OnPulseTimeoutListener listener);

    void start();

    void stop();
}
