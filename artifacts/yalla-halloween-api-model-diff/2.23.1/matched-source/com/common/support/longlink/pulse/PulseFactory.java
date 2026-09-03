package com.common.support.longlink.pulse;

import com.common.support.longlink.Protocol;
import com.common.support.longlink.ScopedLongLink;
import com.common.support.longlink.receiver.Receiver;
import com.common.support.longlink.sender.Sender;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004JL\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¨\u0006\u0011"}, d2 = {"Lcom/common/support/longlink/pulse/PulseFactory;", "IN", "OUT", "", "()V", "createPulse", "Lcom/common/support/longlink/pulse/Pulse;", "longLink", "Lcom/common/support/longlink/ScopedLongLink;", "pulseAdapter", "Lcom/common/support/longlink/pulse/PulseAdapter;", "sender", "Lcom/common/support/longlink/sender/Sender;", "receiver", "Lcom/common/support/longlink/receiver/Receiver;", "protocol", "Lcom/common/support/longlink/Protocol;", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PulseFactory<IN, OUT> {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PulseStrategy.values().length];
            iArr[PulseStrategy.CLIENT_PING_PONG.ordinal()] = 1;
            iArr[PulseStrategy.SERVER_PING_PONG.ordinal()] = 2;
            iArr[PulseStrategy.CLIENT_PING.ordinal()] = 3;
            iArr[PulseStrategy.SERVER_PING.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final Pulse createPulse(@NotNull ScopedLongLink<IN> longLink, @NotNull PulseAdapter pulseAdapter, @NotNull Sender<IN> sender, @NotNull Receiver<OUT> receiver, @NotNull Protocol<IN, OUT> protocol) {
        Pulse clientPingPongPulse;
        Intrinsics.checkNotNullParameter(longLink, "longLink");
        Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        int i = WhenMappings.$EnumSwitchMapping$0[pulseAdapter.getPulseStrategy().ordinal()];
        if (i == 1) {
            clientPingPongPulse = new ClientPingPongPulse(longLink, pulseAdapter, sender, receiver, protocol);
        } else {
            if (i != 2) {
                if (i == 3) {
                    return new ClientPingPulse(longLink, pulseAdapter, sender, protocol);
                }
                if (i == 4) {
                    return new ServerPingPulse(longLink, pulseAdapter, receiver);
                }
                throw new NoWhenBranchMatchedException();
            }
            clientPingPongPulse = new ServerPingPongPulse(longLink, pulseAdapter, sender, receiver, protocol);
        }
        return clientPingPongPulse;
    }
}
