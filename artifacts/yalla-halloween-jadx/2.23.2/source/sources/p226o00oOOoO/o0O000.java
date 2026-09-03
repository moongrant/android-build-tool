package p226o00oOOoO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000 extends o0O00o0 {
    public o0O000(o0O0o o0o0o, o00Oo00 o00oo00) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(o00oo00.f39720OooO00o ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f39726OooO00o = o0o0o.OooOOo(byteBufferAllocate, o00oo00.f39722OooO0OO + ((long) (0 * o00oo00.f39724OooO0o)) + 44);
    }
}
