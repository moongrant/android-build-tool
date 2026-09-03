package p296o0O0OoO0;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p318o0O0oOo.o000OOo0;
import p709oo0oOOo.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 implements o000oOoO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0O f35892OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f35893OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f35894OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f35895OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f35897OooO0oO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public byte[] f35896OooO0o0 = new byte[65536];

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f35891OooO00o = new byte[4096];

    public Oooo000(OooOO0O oooOO0O, long j, long j2) {
        this.f35892OooO0O0 = oooOO0O;
        this.f35894OooO0Oo = j;
        this.f35893OooO0OO = j2;
    }

    @Override // p296o0O0OoO0.o000oOoO
    public final void OooO() {
        this.f35895OooO0o = 0;
    }

    @Override // p296o0O0OoO0.o000oOoO
    public final long OooO00o() {
        return this.f35893OooO0OO;
    }

    @Override // p296o0O0OoO0.o000oOoO
    public final boolean OooO0O0(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int iMin;
        int i3 = this.f35897OooO0oO;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f35896OooO0o0, 0, bArr, i, iMin);
            OooOOoo(iMin);
        }
        int iOooOOo = iMin;
        while (iOooOOo < i2 && iOooOOo != -1) {
            iOooOOo = OooOOo(bArr, i, i2, iOooOOo, z);
        }
        OooOOOo(iOooOOo);
        return iOooOOo != -1;
    }

    @Override // p296o0O0OoO0.o000oOoO
    public final boolean OooO0OO(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!OooOOOO(i2, z)) {
            return false;
        }
        System.arraycopy(this.f35896OooO0o0, this.f35895OooO0o - i2, bArr, i, i2);
        return true;
    }

    @Override // p296o0O0OoO0.o000oOoO
    public final long OooO0Oo() {
        return this.f35894OooO0Oo + ((long) this.f35895OooO0o);
    }

    @Override // p296o0O0OoO0.o000oOoO
    public final void OooO0o0(int i) throws IOException {
        OooOOOO(i, false);
    }

    @Override // p296o0O0OoO0.o000oOoO
    public final int OooO0oO(byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        OooOOo0(i2);
        int i3 = this.f35897OooO0oO;
        int i4 = this.f35895OooO0o;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = OooOOo(this.f35896OooO0o0, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f35897OooO0oO += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.f35896OooO0o0, this.f35895OooO0o, bArr, i, iMin);
        this.f35895OooO0o += iMin;
        return iMin;
    }

    @Override // p296o0O0OoO0.o000oOoO
    public final void OooOO0(int i) throws IOException {
        int iMin = Math.min(this.f35897OooO0oO, i);
        OooOOoo(iMin);
        int iOooOOo = iMin;
        while (iOooOOo < i && iOooOOo != -1) {
            iOooOOo = OooOOo(this.f35891OooO00o, -iOooOOo, Math.min(i, this.f35891OooO00o.length + iOooOOo), iOooOOo, false);
        }
        OooOOOo(iOooOOo);
    }

    @Override // p296o0O0OoO0.o000oOoO
    public final int OooOOO() throws IOException {
        int iMin = Math.min(this.f35897OooO0oO, 1);
        OooOOoo(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f35891OooO00o;
            iMin = OooOOo(bArr, 0, Math.min(1, bArr.length), 0, true);
        }
        OooOOOo(iMin);
        return iMin;
    }

    @Override // p296o0O0OoO0.o000oOoO
    public final void OooOOO0(byte[] bArr, int i, int i2) throws IOException {
        OooO0OO(bArr, i, i2, false);
    }

    public final boolean OooOOOO(int i, boolean z) throws IOException {
        OooOOo0(i);
        int iOooOOo = this.f35897OooO0oO - this.f35895OooO0o;
        while (iOooOOo < i) {
            iOooOOo = OooOOo(this.f35896OooO0o0, this.f35895OooO0o, i, iOooOOo, z);
            if (iOooOOo == -1) {
                return false;
            }
            this.f35897OooO0oO = this.f35895OooO0o + iOooOOo;
        }
        this.f35895OooO0o += i;
        return true;
    }

    public final void OooOOOo(int i) {
        if (i != -1) {
            this.f35894OooO0Oo += (long) i;
        }
    }

    public final int OooOOo(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f35892OooO0O0.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void OooOOo0(int i) {
        int i2 = this.f35895OooO0o + i;
        byte[] bArr = this.f35896OooO0o0;
        if (i2 > bArr.length) {
            this.f35896OooO0o0 = Arrays.copyOf(this.f35896OooO0o0, o000OOo0.OooO0oo(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final void OooOOoo(int i) {
        int i2 = this.f35897OooO0oO - i;
        this.f35897OooO0oO = i2;
        this.f35895OooO0o = 0;
        byte[] bArr = this.f35896OooO0o0;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f35896OooO0o0 = bArr2;
    }

    @Override // p296o0O0OoO0.o000oOoO
    public final long getPosition() {
        return this.f35894OooO0Oo;
    }

    @Override // p296o0O0OoO0.o000oOoO, p709oo0oOOo.OooOO0O
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f35897OooO0oO;
        int iOooOOo = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f35896OooO0o0, 0, bArr, i, iMin);
            OooOOoo(iMin);
            iOooOOo = iMin;
        }
        if (iOooOOo == 0) {
            iOooOOo = OooOOo(bArr, i, i2, 0, true);
        }
        OooOOOo(iOooOOo);
        return iOooOOo;
    }

    @Override // p296o0O0OoO0.o000oOoO
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        OooO0O0(bArr, i, i2, false);
    }
}
