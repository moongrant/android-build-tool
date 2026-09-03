package p226o00oOOoO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class oo00oO extends o00Oo00 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0O0o f39733OooO0oO;

    public oo00oO(boolean z, o0O0o o0o0o) throws IOException {
        this.f39720OooO00o = z;
        this.f39733OooO0oO = o0o0o;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        o0o0o.OooO0oO(byteBufferAllocate, 16L);
        this.f39721OooO0O0 = o0o0o.OooOOo(byteBufferAllocate, 28L);
        this.f39722OooO0OO = o0o0o.OooOOo(byteBufferAllocate, 32L);
        this.f39723OooO0Oo = o0o0o.OooO0oO(byteBufferAllocate, 42L);
        this.f39725OooO0o0 = o0o0o.OooO0oO(byteBufferAllocate, 44L);
        this.f39724OooO0o = o0o0o.OooO0oO(byteBufferAllocate, 46L);
        o0o0o.OooO0oO(byteBufferAllocate, 48L);
        o0o0o.OooO0oO(byteBufferAllocate, 50L);
    }

    @Override // p226o00oOOoO.o00Oo00
    public final o00OOOOo OooO00o(int i, long j) throws IOException {
        return new o0o0Oo(this.f39733OooO0oO, this, j, i);
    }

    @Override // p226o00oOOoO.o00Oo00
    public final o0oOO OooO0O0(long j) throws IOException {
        return new o0(this.f39733OooO0oO, this, j);
    }

    @Override // p226o00oOOoO.o00Oo00
    public final o0O00o0 OooO0OO() throws IOException {
        return new o0O0000O(this.f39733OooO0oO, this);
    }
}
