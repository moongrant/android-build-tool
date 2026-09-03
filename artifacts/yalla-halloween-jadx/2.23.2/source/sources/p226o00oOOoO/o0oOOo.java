package p226o00oOOoO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oOOo extends o00Oo00 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0O0o f39732OooO0oO;

    public o0oOOo(boolean z, o0O0o o0o0o) throws IOException {
        this.f39720OooO00o = z;
        this.f39732OooO0oO = o0o0o;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        o0o0o.OooO0oO(byteBufferAllocate, 16L);
        o0o0o.OooO0OO(byteBufferAllocate, 32L, 8);
        this.f39721OooO0O0 = byteBufferAllocate.getLong();
        o0o0o.OooO0OO(byteBufferAllocate, 40L, 8);
        this.f39722OooO0OO = byteBufferAllocate.getLong();
        this.f39723OooO0Oo = o0o0o.OooO0oO(byteBufferAllocate, 54L);
        this.f39725OooO0o0 = o0o0o.OooO0oO(byteBufferAllocate, 56L);
        this.f39724OooO0o = o0o0o.OooO0oO(byteBufferAllocate, 58L);
        o0o0o.OooO0oO(byteBufferAllocate, 60L);
        o0o0o.OooO0oO(byteBufferAllocate, 62L);
    }

    @Override // p226o00oOOoO.o00Oo00
    public final o00OOOOo OooO00o(int i, long j) throws IOException {
        return new o00OOOO0(this.f39732OooO0oO, this, j, i);
    }

    @Override // p226o00oOOoO.o00Oo00
    public final o0oOO OooO0O0(long j) throws IOException {
        return new o0O00000(this.f39732OooO0oO, this, j);
    }

    @Override // p226o00oOOoO.o00Oo00
    public final o0O00o0 OooO0OO() throws IOException {
        return new o0O000(this.f39732OooO0oO, this);
    }
}
