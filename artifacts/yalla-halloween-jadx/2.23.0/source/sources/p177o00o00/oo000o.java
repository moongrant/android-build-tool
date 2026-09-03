package p177o00o00;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o extends o00oO0o {
    public oo000o(o0O0O00 o0o0o00, o0ooOOo o0ooooo, long j, int i) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(o0ooooo.f38577OooO00o ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i * 16));
        o0o0o00.OooO0OO(byteBufferAllocate, j2, 8);
        this.f38568OooO00o = byteBufferAllocate.getLong();
        o0o0o00.OooO0OO(byteBufferAllocate, j2 + 8, 8);
        this.f38569OooO0O0 = byteBufferAllocate.getLong();
    }
}
