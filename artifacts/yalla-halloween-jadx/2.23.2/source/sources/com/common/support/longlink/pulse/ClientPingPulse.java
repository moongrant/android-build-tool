package com.common.support.longlink.pulse;

import com.common.support.longlink.Protocol;
import com.common.support.longlink.ScopedLongLink;
import com.common.support.longlink.log.LoggerKt;
import com.common.support.longlink.sender.Sender;
import com.common.support.utils.LoopTask;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u000e\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/common/support/longlink/pulse/ClientPingPulse;", "IN", "OUT", "Lcom/common/support/longlink/pulse/AbstractPulse;", "longLink", "Lcom/common/support/longlink/ScopedLongLink;", "pulseAdapter", "Lcom/common/support/longlink/pulse/PulseAdapter;", "sender", "Lcom/common/support/longlink/sender/Sender;", "protocol", "Lcom/common/support/longlink/Protocol;", "(Lcom/common/support/longlink/ScopedLongLink;Lcom/common/support/longlink/pulse/PulseAdapter;Lcom/common/support/longlink/sender/Sender;Lcom/common/support/longlink/Protocol;)V", "pulseTask", "com/common/support/longlink/pulse/ClientPingPulse$pulseTask$1", "Lcom/common/support/longlink/pulse/ClientPingPulse$pulseTask$1;", ViewHierarchyConstants.TAG_KEY, "", "getTag$longlink_release", "()Ljava/lang/String;", "setTag$longlink_release", "(Ljava/lang/String;)V", "ping", "", "pong", "start", "stop", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class ClientPingPulse<IN, OUT> extends AbstractPulse {

    @NotNull
    private final ScopedLongLink<IN> longLink;

    @NotNull
    private final Protocol<IN, OUT> protocol;

    @NotNull
    private final PulseAdapter pulseAdapter;

    @NotNull
    private final ClientPingPulse$pulseTask$1 pulseTask;

    @NotNull
    private final Sender<IN> sender;

    @NotNull
    private String tag;

    /* JADX WARN: Type inference failed for: r3v5, types: [com.common.support.longlink.pulse.ClientPingPulse$pulseTask$1] */
    public ClientPingPulse(@NotNull ScopedLongLink<IN> longLink, @NotNull PulseAdapter pulseAdapter, @NotNull Sender<IN> sender, @NotNull Protocol<IN, OUT> protocol) {
        Intrinsics.checkNotNullParameter(longLink, "longLink");
        Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.longLink = longLink;
        this.pulseAdapter = pulseAdapter;
        this.sender = sender;
        this.protocol = protocol;
        this.tag = String.valueOf(Reflection.getOrCreateKotlinClass(protocol.getClass()).getSimpleName());
        final CoroutineScope longLinkScope = longLink.getLongLinkScope();
        this.pulseTask = new LoopTask(this, longLinkScope) { // from class: com.common.support.longlink.pulse.ClientPingPulse$pulseTask$1
            final /* synthetic */ ClientPingPulse<IN, OUT> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.common.support.utils.LoopTask
            public long delayed() {
                return ((ClientPingPulse) this.this$0).pulseAdapter.pulseInterval();
            }

            @Override // com.common.support.utils.LoopTask
            public void task() {
                this.this$0.ping();
            }
        };
    }

    @Override // com.common.support.longlink.pulse.AbstractPulse
    @NotNull
    /* JADX INFO: renamed from: getTag$longlink_release, reason: from getter */
    public String getTag() {
        return this.tag;
    }

    @Override // com.common.support.longlink.pulse.Pulse
    public void ping() {
        IN inPingMessage = this.protocol.pingMessage();
        if (inPingMessage == null) {
            throw new IllegalArgumentException("Make sure you have override pingMessage method of PulseAdapter");
        }
        this.sender.send(inPingMessage);
        LoggerKt.logD(getTag(), "Ping message sent!");
    }

    @Override // com.common.support.longlink.pulse.Pulse
    public void pong() {
    }

    @Override // com.common.support.longlink.pulse.AbstractPulse
    public void setTag$longlink_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tag = str;
    }

    @Override // com.common.support.longlink.pulse.AbstractPulse, com.common.support.longlink.pulse.Pulse
    public void start() {
        super.start();
        run();
    }

    @Override // com.common.support.longlink.pulse.AbstractPulse, com.common.support.longlink.pulse.Pulse
    public void stop() {
        super.stop();
        close();
    }
}
