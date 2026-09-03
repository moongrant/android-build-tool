package p076o000Oo;

import java.io.IOException;
import o000OOoO.OooOO0O;
import o000OOoO.Oooo000;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo000 f34770OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f34771OooO0O0;

    public OooOo(OooOO0O oooOO0O, long j) {
        this.f34770OooO00o = oooOO0O;
        o00Oo0.OooO00o(oooOO0O.f34678OooO0Oo >= j);
        this.f34771OooO0O0 = j;
    }

    @Override // o000OOoO.Oooo000
    public final void OooO(int i) throws IOException {
        this.f34770OooO00o.OooO(i);
    }

    @Override // o000OOoO.Oooo000
    public final void OooO0O0(int i, int i2, byte[] bArr) throws IOException {
        this.f34770OooO00o.OooO0O0(i, i2, bArr);
    }

    @Override // o000OOoO.Oooo000
    public final boolean OooO0OO(byte[] bArr, int i, int i2, boolean z) {
        return this.f34770OooO00o.OooO0OO(bArr, i, i2, z);
    }

    @Override // o000OOoO.Oooo000
    public final boolean OooO0o(byte[] bArr, int i, int i2, boolean z) {
        return this.f34770OooO00o.OooO0o(bArr, i, i2, z);
    }

    @Override // o000OOoO.Oooo000
    public final void OooO0o0() {
        this.f34770OooO00o.OooO0o0();
    }

    @Override // o000OOoO.Oooo000
    public final long OooO0oo() {
        return this.f34770OooO00o.OooO0oo() - this.f34771OooO0O0;
    }

    @Override // o000OOoO.Oooo000
    public final void OooOO0(int i) throws IOException {
        this.f34770OooO00o.OooOO0(i);
    }

    @Override // o000OOoO.Oooo000
    public final long getLength() {
        return this.f34770OooO00o.getLength() - this.f34771OooO0O0;
    }

    @Override // o000OOoO.Oooo000
    public final long getPosition() {
        return this.f34770OooO00o.getPosition() - this.f34771OooO0O0;
    }

    @Override // p069o0000ooO.o00000O0
    public final int read(byte[] bArr, int i, int i2) {
        return this.f34770OooO00o.read(bArr, i, i2);
    }

    @Override // o000OOoO.Oooo000
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f34770OooO00o.readFully(bArr, i, i2);
    }
}
