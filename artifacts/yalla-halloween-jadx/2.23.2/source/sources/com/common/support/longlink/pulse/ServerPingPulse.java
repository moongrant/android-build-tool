package com.common.support.longlink.pulse;

import com.common.support.longlink.ScopedLongLink;
import com.common.support.longlink.receiver.OnPulseMessageReceivedListener;
import com.common.support.longlink.receiver.Receiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/common/support/longlink/pulse/ServerPingPulse;", "IN", "OUT", "Lcom/common/support/longlink/pulse/AbstractPulse;", "longLink", "Lcom/common/support/longlink/ScopedLongLink;", "pulseAdapter", "Lcom/common/support/longlink/pulse/PulseAdapter;", "receiver", "Lcom/common/support/longlink/receiver/Receiver;", "(Lcom/common/support/longlink/ScopedLongLink;Lcom/common/support/longlink/pulse/PulseAdapter;Lcom/common/support/longlink/receiver/Receiver;)V", "pulseMonitor", "Lcom/common/support/longlink/pulse/PulseTimeoutMonitor;", "ping", "", "pong", "start", "stop", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class ServerPingPulse<IN, OUT> extends AbstractPulse {

    @NotNull
    private final PulseTimeoutMonitor<IN> pulseMonitor;

    public ServerPingPulse(@NotNull ScopedLongLink<IN> longLink, @NotNull PulseAdapter pulseAdapter, @NotNull Receiver<OUT> receiver) {
        Intrinsics.checkNotNullParameter(longLink, "longLink");
        Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        this.pulseMonitor = new PulseTimeoutMonitor<>(longLink, pulseAdapter.getPulseTimeoutMillis(), new Function0<Unit>(this) { // from class: com.common.support.longlink.pulse.ServerPingPulse$pulseMonitor$1
            final /* synthetic */ ServerPingPulse<IN, OUT> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Pulse.OnPulseTimeoutListener pulseTimeoutListener = this.this$0.getPulseTimeoutListener();
                if (pulseTimeoutListener == null) {
                    return;
                }
                pulseTimeoutListener.onPulseTimeout();
            }
        });
        receiver.setOnPulseMessageReceivedListener(new OnPulseMessageReceivedListener<OUT>(this) { // from class: com.common.support.longlink.pulse.ServerPingPulse.1
            final /* synthetic */ ServerPingPulse<IN, OUT> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.common.support.longlink.receiver.OnPulseMessageReceivedListener
            public void onMessage(OUT pulseMessage) {
                this.this$0.ping();
            }
        });
    }

    @Override // com.common.support.longlink.pulse.Pulse
    public void ping() {
        this.pulseMonitor.onBeat();
    }

    @Override // com.common.support.longlink.pulse.Pulse
    public void pong() {
    }

    @Override // com.common.support.longlink.pulse.AbstractPulse, com.common.support.longlink.pulse.Pulse
    public void start() {
        super.start();
        this.pulseMonitor.start();
    }

    @Override // com.common.support.longlink.pulse.AbstractPulse, com.common.support.longlink.pulse.Pulse
    public void stop() {
        super.stop();
        this.pulseMonitor.stop();
    }
}
