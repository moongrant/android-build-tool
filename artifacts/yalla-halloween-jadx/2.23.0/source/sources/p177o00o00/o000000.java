package p177o00o00;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000 extends o0OOO0o {
    public o000000(o0O0O00 o0o0o00, o0ooOOo o0ooooo, long j) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(o0ooooo.f38577OooO00o ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = (j * ((long) o0ooooo.f38580OooO0Oo)) + o0ooooo.f38578OooO0O0;
        this.f38572OooO00o = o0o0o00.OooOOo0(byteBufferAllocate, j2);
        o0o0o00.OooO0OO(byteBufferAllocate, 8 + j2, 8);
        this.f38573OooO0O0 = byteBufferAllocate.getLong();
        o0o0o00.OooO0OO(byteBufferAllocate, 16 + j2, 8);
        this.f38574OooO0OO = byteBufferAllocate.getLong();
        o0o0o00.OooO0OO(byteBufferAllocate, j2 + 40, 8);
        this.f38575OooO0Oo = byteBufferAllocate.getLong();
    }
}
