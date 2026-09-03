package p480o0o000O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.longlink.Protocol;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO0 implements Protocol<Integer, Integer> {
    @Override // com.common.support.longlink.Protocol
    public final boolean isPulseMessage(Integer num) {
        return num.intValue() == 100;
    }

    @Override // com.common.support.longlink.Protocol
    public final byte[] pack(Integer num) {
        return new byte[]{-65, 0, (byte) num.intValue()};
    }

    @Override // com.common.support.longlink.Protocol
    public final Integer pingMessage() {
        return 100;
    }

    @Override // com.common.support.longlink.Protocol
    public final Integer pongMessage() {
        return (Integer) Protocol.DefaultImpls.pongMessage(this);
    }

    @Override // com.common.support.longlink.Protocol
    public final Integer unpack(byte[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return Integer.valueOf(message[2] & UByte.MAX_VALUE);
    }
}
