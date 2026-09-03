package p177o00o00;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00O extends o0ooOOo {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0O0O00 f38571OooO0oO;

    public o0OO00O(boolean z, o0O0O00 o0o0o00) throws IOException {
        this.f38577OooO00o = z;
        this.f38571OooO0oO = o0o0o00;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        o0o0o00.OooO0oO(byteBufferAllocate, 16L);
        this.f38578OooO0O0 = o0o0o00.OooOOo0(byteBufferAllocate, 28L);
        this.f38579OooO0OO = o0o0o00.OooOOo0(byteBufferAllocate, 32L);
        this.f38580OooO0Oo = o0o0o00.OooO0oO(byteBufferAllocate, 42L);
        this.f38582OooO0o0 = o0o0o00.OooO0oO(byteBufferAllocate, 44L);
        this.f38581OooO0o = o0o0o00.OooO0oO(byteBufferAllocate, 46L);
        o0o0o00.OooO0oO(byteBufferAllocate, 48L);
        o0o0o00.OooO0oO(byteBufferAllocate, 50L);
    }

    @Override // p177o00o00.o0ooOOo
    public final o00oO0o OooO00o(int i, long j) throws IOException {
        return new o00Ooo(this.f38571OooO0oO, this, j, i);
    }

    @Override // p177o00o00.o0ooOOo
    public final o0OOO0o OooO0O0(long j) throws IOException {
        return new o000OOo(this.f38571OooO0oO, this, j);
    }

    @Override // p177o00o00.o0ooOOo
    public final o0Oo0oo OooO0OO() throws IOException {
        return new o000000O(this.f38571OooO0oO, this);
    }
}
