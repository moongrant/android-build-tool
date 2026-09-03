package p226o00oOOoO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00000 extends o0oOO {
    public o0O00000(o0O0o o0o0o, o00Oo00 o00oo00, long j) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(o00oo00.f39720OooO00o ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = (j * ((long) o00oo00.f39723OooO0Oo)) + o00oo00.f39721OooO0O0;
        this.f39728OooO00o = o0o0o.OooOOo(byteBufferAllocate, j2);
        o0o0o.OooO0OO(byteBufferAllocate, 8 + j2, 8);
        this.f39729OooO0O0 = byteBufferAllocate.getLong();
        o0o0o.OooO0OO(byteBufferAllocate, 16 + j2, 8);
        this.f39730OooO0OO = byteBufferAllocate.getLong();
        o0o0o.OooO0OO(byteBufferAllocate, j2 + 40, 8);
        this.f39731OooO0Oo = byteBufferAllocate.getLong();
    }
}
