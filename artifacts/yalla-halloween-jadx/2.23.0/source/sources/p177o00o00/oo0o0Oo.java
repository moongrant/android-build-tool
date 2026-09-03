package p177o00o00;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0Oo extends o0ooOOo {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0O0O00 f38583OooO0oO;

    public oo0o0Oo(boolean z, o0O0O00 o0o0o00) throws IOException {
        this.f38577OooO00o = z;
        this.f38583OooO0oO = o0o0o00;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        o0o0o00.OooO0oO(byteBufferAllocate, 16L);
        o0o0o00.OooO0OO(byteBufferAllocate, 32L, 8);
        this.f38578OooO0O0 = byteBufferAllocate.getLong();
        o0o0o00.OooO0OO(byteBufferAllocate, 40L, 8);
        this.f38579OooO0OO = byteBufferAllocate.getLong();
        this.f38580OooO0Oo = o0o0o00.OooO0oO(byteBufferAllocate, 54L);
        this.f38582OooO0o0 = o0o0o00.OooO0oO(byteBufferAllocate, 56L);
        this.f38581OooO0o = o0o0o00.OooO0oO(byteBufferAllocate, 58L);
        o0o0o00.OooO0oO(byteBufferAllocate, 60L);
        o0o0o00.OooO0oO(byteBufferAllocate, 62L);
    }

    @Override // p177o00o00.o0ooOOo
    public final o00oO0o OooO00o(int i, long j) throws IOException {
        return new oo000o(this.f38583OooO0oO, this, j, i);
    }

    @Override // p177o00o00.o0ooOOo
    public final o0OOO0o OooO0O0(long j) throws IOException {
        return new o000000(this.f38583OooO0oO, this, j);
    }

    @Override // p177o00o00.o0ooOOo
    public final o0Oo0oo OooO0OO() throws IOException {
        return new o00000(this.f38583OooO0oO, this);
    }
}
