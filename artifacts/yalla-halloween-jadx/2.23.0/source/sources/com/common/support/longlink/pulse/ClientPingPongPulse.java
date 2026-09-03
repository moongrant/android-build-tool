package com.common.support.longlink.pulse;

import com.common.support.longlink.Protocol;
import com.common.support.longlink.ScopedLongLink;
import com.common.support.longlink.log.LoggerKt;
import com.common.support.longlink.receiver.OnPulseMessageReceivedListener;
import com.common.support.longlink.receiver.Receiver;
import com.common.support.longlink.sender.Sender;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003BK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/common/support/longlink/pulse/ClientPingPongPulse;", "IN", "OUT", "Lcom/common/support/longlink/pulse/ClientPingPulse;", "longLink", "Lcom/common/support/longlink/ScopedLongLink;", "pulseAdapter", "Lcom/common/support/longlink/pulse/PulseAdapter;", "sender", "Lcom/common/support/longlink/sender/Sender;", "receiver", "Lcom/common/support/longlink/receiver/Receiver;", "protocol", "Lcom/common/support/longlink/Protocol;", "(Lcom/common/support/longlink/ScopedLongLink;Lcom/common/support/longlink/pulse/PulseAdapter;Lcom/common/support/longlink/sender/Sender;Lcom/common/support/longlink/receiver/Receiver;Lcom/common/support/longlink/Protocol;)V", "pulseMonitor", "Lcom/common/support/longlink/pulse/PulseTimeoutMonitor;", ViewHierarchyConstants.TAG_KEY, "", "getTag$longlink_release", "()Ljava/lang/String;", "setTag$longlink_release", "(Ljava/lang/String;)V", "pong", "", "start", "stop", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ClientPingPongPulse<IN, OUT> extends ClientPingPulse<IN, OUT> {

    @NotNull
    private final PulseTimeoutMonitor<IN> pulseMonitor;

    @NotNull
    private String tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientPingPongPulse(@NotNull ScopedLongLink<IN> longLink, @NotNull PulseAdapter pulseAdapter, @NotNull Sender<IN> sender, @NotNull Receiver<OUT> receiver, @NotNull Protocol<IN, OUT> protocol) {
        super(longLink, pulseAdapter, sender, protocol);
        Intrinsics.checkNotNullParameter(longLink, "longLink");
        Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.tag = String.valueOf(Reflection.getOrCreateKotlinClass(protocol.getClass()).getSimpleName());
        this.pulseMonitor = new PulseTimeoutMonitor<>(longLink, pulseAdapter.getPulseTimeoutMillis(), new Function0<Unit>(this) { // from class: com.common.support.longlink.pulse.ClientPingPongPulse$pulseMonitor$1
            final /* synthetic */ ClientPingPongPulse<IN, OUT> this$0;

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
        receiver.setOnPulseMessageReceivedListener(new OnPulseMessageReceivedListener<OUT>(this) { // from class: com.common.support.longlink.pulse.ClientPingPongPulse.1
            final /* synthetic */ ClientPingPongPulse<IN, OUT> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.common.support.longlink.receiver.OnPulseMessageReceivedListener
            public void onMessage(OUT pulseMessage) {
                LoggerKt.logD(this.this$0.getTag(), "Received pong message!");
                this.this$0.pong();
            }
        });
    }

    @Override // com.common.support.longlink.pulse.ClientPingPulse, com.common.support.longlink.pulse.AbstractPulse
    @NotNull
    /* JADX INFO: renamed from: getTag$longlink_release, reason: from getter */
    public String getTag() {
        return this.tag;
    }

    @Override // com.common.support.longlink.pulse.ClientPingPulse, com.common.support.longlink.pulse.Pulse
    public void pong() {
        this.pulseMonitor.onBeat();
    }

    @Override // com.common.support.longlink.pulse.ClientPingPulse, com.common.support.longlink.pulse.AbstractPulse
    public void setTag$longlink_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tag = str;
    }

    @Override // com.common.support.longlink.pulse.ClientPingPulse, com.common.support.longlink.pulse.AbstractPulse, com.common.support.longlink.pulse.Pulse
    public void start() {
        super.start();
        this.pulseMonitor.start();
    }

    @Override // com.common.support.longlink.pulse.ClientPingPulse, com.common.support.longlink.pulse.AbstractPulse, com.common.support.longlink.pulse.Pulse
    public void stop() {
        super.stop();
        this.pulseMonitor.stop();
    }
}
