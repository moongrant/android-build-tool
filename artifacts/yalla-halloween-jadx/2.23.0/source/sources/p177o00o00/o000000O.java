package p177o00o00;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O extends o0Oo0oo {
    public o000000O(o0O0O00 o0o0o00, o0ooOOo o0ooooo) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(o0ooooo.f38577OooO00o ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f38576OooO00o = o0o0o00.OooOOo0(byteBufferAllocate, o0ooooo.f38579OooO0OO + ((long) (0 * o0ooooo.f38581OooO0o)) + 28);
    }
}
