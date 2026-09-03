package p226o00oOOoO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class o0o0Oo extends o00OOOOo {
    public o0o0Oo(o0O0o o0o0o, o00Oo00 o00oo00, long j, int i) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(o00oo00.f39720OooO00o ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i * 8));
        this.f39718OooO00o = o0o0o.OooOOo(byteBufferAllocate, j2);
        this.f39719OooO0O0 = o0o0o.OooOOo(byteBufferAllocate, j2 + 4);
    }
}
