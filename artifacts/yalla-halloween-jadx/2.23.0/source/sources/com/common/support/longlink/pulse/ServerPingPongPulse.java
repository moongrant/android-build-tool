package com.common.support.longlink.pulse;

import com.common.support.longlink.Protocol;
import com.common.support.longlink.ScopedLongLink;
import com.common.support.longlink.log.LoggerKt;
import com.common.support.longlink.receiver.Receiver;
import com.common.support.longlink.sender.Sender;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003BK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/common/support/longlink/pulse/ServerPingPongPulse;", "IN", "OUT", "Lcom/common/support/longlink/pulse/ServerPingPulse;", "longLink", "Lcom/common/support/longlink/ScopedLongLink;", "pulseAdapter", "Lcom/common/support/longlink/pulse/PulseAdapter;", "sender", "Lcom/common/support/longlink/sender/Sender;", "receiver", "Lcom/common/support/longlink/receiver/Receiver;", "protocol", "Lcom/common/support/longlink/Protocol;", "(Lcom/common/support/longlink/ScopedLongLink;Lcom/common/support/longlink/pulse/PulseAdapter;Lcom/common/support/longlink/sender/Sender;Lcom/common/support/longlink/receiver/Receiver;Lcom/common/support/longlink/Protocol;)V", ViewHierarchyConstants.TAG_KEY, "", "getTag$longlink_release", "()Ljava/lang/String;", "setTag$longlink_release", "(Ljava/lang/String;)V", "ping", "", "pong", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ServerPingPongPulse<IN, OUT> extends ServerPingPulse<IN, OUT> {

    @NotNull
    private final Protocol<IN, OUT> protocol;

    @NotNull
    private final Sender<IN> sender;

    @NotNull
    private String tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerPingPongPulse(@NotNull ScopedLongLink<IN> longLink, @NotNull PulseAdapter pulseAdapter, @NotNull Sender<IN> sender, @NotNull Receiver<OUT> receiver, @NotNull Protocol<IN, OUT> protocol) {
        super(longLink, pulseAdapter, receiver);
        Intrinsics.checkNotNullParameter(longLink, "longLink");
        Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.sender = sender;
        this.protocol = protocol;
        this.tag = String.valueOf(Reflection.getOrCreateKotlinClass(protocol.getClass()).getSimpleName());
    }

    @Override // com.common.support.longlink.pulse.AbstractPulse
    @NotNull
    /* JADX INFO: renamed from: getTag$longlink_release, reason: from getter */
    public String getTag() {
        return this.tag;
    }

    @Override // com.common.support.longlink.pulse.ServerPingPulse, com.common.support.longlink.pulse.Pulse
    public void ping() {
        super.ping();
        pong();
    }

    @Override // com.common.support.longlink.pulse.ServerPingPulse, com.common.support.longlink.pulse.Pulse
    public void pong() {
        IN inPongMessage = this.protocol.pongMessage();
        if (inPongMessage == null) {
            throw new IllegalArgumentException("Make sure you have override pongMessage method of PulseAdapter");
        }
        this.sender.send(inPongMessage);
        LoggerKt.logD(getTag(), "Pong message sent!");
    }

    @Override // com.common.support.longlink.pulse.AbstractPulse
    public void setTag$longlink_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tag = str;
    }
}
