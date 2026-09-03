package p531o0o0OOO0;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import o0O000O.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00O00 implements OooOO0<Integer, Integer> {
    @Override // o0O000O.OooOO0
    public final Integer OooO00o() {
        return 100;
    }

    @Override // o0O000O.OooOO0
    public final byte[] OooO0O0(Integer num) {
        return new byte[]{-65, 0, (byte) num.intValue()};
    }

    @Override // o0O000O.OooOO0
    public final boolean OooO0OO(Integer num) {
        return num.intValue() == 100;
    }

    @Override // o0O000O.OooOO0
    public final Integer OooO0Oo(byte[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return Integer.valueOf(message[2] & UByte.MAX_VALUE);
    }

    @Override // o0O000O.OooOO0
    public final void OooO0o0() {
        Intrinsics.checkNotNullParameter(this, "this");
    }
}
