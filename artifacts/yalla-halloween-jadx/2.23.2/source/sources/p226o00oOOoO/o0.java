package p226o00oOOoO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends o0oOO {
    public o0(o0O0o o0o0o, o00Oo00 o00oo00, long j) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(o00oo00.f39720OooO00o ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = (j * ((long) o00oo00.f39723OooO0Oo)) + o00oo00.f39721OooO0O0;
        this.f39728OooO00o = o0o0o.OooOOo(byteBufferAllocate, j2);
        this.f39729OooO0O0 = o0o0o.OooOOo(byteBufferAllocate, 4 + j2);
        this.f39730OooO0OO = o0o0o.OooOOo(byteBufferAllocate, 8 + j2);
        this.f39731OooO0Oo = o0o0o.OooOOo(byteBufferAllocate, j2 + 20);
    }
}
