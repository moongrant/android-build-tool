package p239o00oo000;

import java.io.IOException;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O00;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOo implements o00O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O0O00 f40368OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f40369OooO0O0;

    public OooOo(o00O00o0 o00o00o1, long j) {
        this.f40368OooO00o = o00o00o1;
        o00O000o.OooO00o(o00o00o1.f39532OooO0Oo >= j);
        this.f40369OooO0O0 = j;
    }

    @Override // p209o00o0oo0.o00O0O00
    public final void OooO(int i) throws IOException {
        this.f40368OooO00o.OooO(i);
    }

    @Override // p209o00o0oo0.o00O0O00
    public final void OooO0O0(int i, int i2, byte[] bArr) throws IOException {
        this.f40368OooO00o.OooO0O0(i, i2, bArr);
    }

    @Override // p209o00o0oo0.o00O0O00
    public final boolean OooO0Oo(byte[] bArr, int i, int i2, boolean z) {
        return this.f40368OooO00o.OooO0Oo(bArr, i, i2, z);
    }

    @Override // p209o00o0oo0.o00O0O00
    public final void OooO0o() {
        this.f40368OooO00o.OooO0o();
    }

    @Override // p209o00o0oo0.o00O0O00
    public final boolean OooO0oO(byte[] bArr, int i, int i2, boolean z) {
        return this.f40368OooO00o.OooO0oO(bArr, i, i2, z);
    }

    @Override // p209o00o0oo0.o00O0O00
    public final long OooO0oo() {
        return this.f40368OooO00o.OooO0oo() - this.f40369OooO0O0;
    }

    @Override // p209o00o0oo0.o00O0O00
    public final void OooOO0(int i) throws IOException {
        this.f40368OooO00o.OooOO0(i);
    }

    @Override // p209o00o0oo0.o00O0O00
    public final long getLength() {
        return this.f40368OooO00o.getLength() - this.f40369OooO0O0;
    }

    @Override // p209o00o0oo0.o00O0O00
    public final long getPosition() {
        return this.f40368OooO00o.getPosition() - this.f40369OooO0O0;
    }

    @Override // p244o00oo0Oo.o00
    public final int read(byte[] bArr, int i, int i2) {
        return this.f40368OooO00o.read(bArr, i, i2);
    }

    @Override // p209o00o0oo0.o00O0O00
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f40368OooO00o.readFully(bArr, i, i2);
    }
}
