package p226o00oOOoO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOOO0 extends o00OOOOo {
    public o00OOOO0(o0O0o o0o0o, o00Oo00 o00oo00, long j, int i) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(o00oo00.f39720OooO00o ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i * 16));
        o0o0o.OooO0OO(byteBufferAllocate, j2, 8);
        this.f39718OooO00o = byteBufferAllocate.getLong();
        o0o0o.OooO0OO(byteBufferAllocate, j2 + 8, 8);
        this.f39719OooO0O0 = byteBufferAllocate.getLong();
    }
}
