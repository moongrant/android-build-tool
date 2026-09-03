package p177o00o00;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo extends o0OOO0o {
    public o000OOo(o0O0O00 o0o0o00, o0ooOOo o0ooooo, long j) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(o0ooooo.f38577OooO00o ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = (j * ((long) o0ooooo.f38580OooO0Oo)) + o0ooooo.f38578OooO0O0;
        this.f38572OooO00o = o0o0o00.OooOOo0(byteBufferAllocate, j2);
        this.f38573OooO0O0 = o0o0o00.OooOOo0(byteBufferAllocate, 4 + j2);
        this.f38574OooO0OO = o0o0o00.OooOOo0(byteBufferAllocate, 8 + j2);
        this.f38575OooO0Oo = o0o0o00.OooOOo0(byteBufferAllocate, j2 + 20);
    }
}
