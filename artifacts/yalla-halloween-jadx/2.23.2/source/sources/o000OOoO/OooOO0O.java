package o000OOoO;

import androidx.media3.common.util.UnstableApi;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p069o0000ooO.o0000;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOO0O implements Oooo000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final p069o0000ooO.o00000O0 f34676OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f34677OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f34678OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f34679OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f34681OooO0oO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public byte[] f34680OooO0o0 = new byte[65536];

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f34675OooO00o = new byte[4096];

    static {
        o0000.OooO00o("media3.extractor");
    }

    public OooOO0O(androidx.media3.datasource.OooO00o oooO00o, long j, long j2) {
        this.f34676OooO0O0 = oooO00o;
        this.f34678OooO0Oo = j;
        this.f34677OooO0OO = j2;
    }

    @Override // o000OOoO.Oooo000
    public final void OooO(int i) throws IOException {
        OooOO0o(i, false);
    }

    @Override // o000OOoO.Oooo000
    public final void OooO0O0(int i, int i2, byte[] bArr) throws IOException {
        OooO0OO(bArr, i, i2, false);
    }

    @Override // o000OOoO.Oooo000
    public final boolean OooO0OO(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!OooOO0o(i2, z)) {
            return false;
        }
        System.arraycopy(this.f34680OooO0o0, this.f34679OooO0o - i2, bArr, i, i2);
        return true;
    }

    @Override // o000OOoO.Oooo000
    public final boolean OooO0o(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int iMin;
        int i3 = this.f34681OooO0oO;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f34680OooO0o0, 0, bArr, i, iMin);
            OooOOo0(iMin);
        }
        int iOooOOOO = iMin;
        while (iOooOOOO < i2 && iOooOOOO != -1) {
            iOooOOOO = OooOOOO(bArr, i, i2, iOooOOOO, z);
        }
        if (iOooOOOO != -1) {
            this.f34678OooO0Oo += (long) iOooOOOO;
        }
        return iOooOOOO != -1;
    }

    @Override // o000OOoO.Oooo000
    public final void OooO0o0() {
        this.f34679OooO0o = 0;
    }

    @Override // o000OOoO.Oooo000
    public final long OooO0oo() {
        return this.f34678OooO0Oo + ((long) this.f34679OooO0o);
    }

    @Override // o000OOoO.Oooo000
    public final void OooOO0(int i) throws IOException {
        int iMin = Math.min(this.f34681OooO0oO, i);
        OooOOo0(iMin);
        int iOooOOOO = iMin;
        while (iOooOOOO < i && iOooOOOO != -1) {
            iOooOOOO = OooOOOO(this.f34675OooO00o, -iOooOOOO, Math.min(i, this.f34675OooO00o.length + iOooOOOO), iOooOOOO, false);
        }
        if (iOooOOOO != -1) {
            this.f34678OooO0Oo += (long) iOooOOOO;
        }
    }

    public final boolean OooOO0o(int i, boolean z) throws IOException {
        OooOOO0(i);
        int iOooOOOO = this.f34681OooO0oO - this.f34679OooO0o;
        while (iOooOOOO < i) {
            iOooOOOO = OooOOOO(this.f34680OooO0o0, this.f34679OooO0o, i, iOooOOOO, z);
            if (iOooOOOO == -1) {
                return false;
            }
            this.f34681OooO0oO = this.f34679OooO0o + iOooOOOO;
        }
        this.f34679OooO0o += i;
        return true;
    }

    public final int OooOOO(int i, int i2, byte[] bArr) throws IOException {
        int iMin;
        OooOOO0(i2);
        int i3 = this.f34681OooO0oO;
        int i4 = this.f34679OooO0o;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = OooOOOO(this.f34680OooO0o0, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f34681OooO0oO += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.f34680OooO0o0, this.f34679OooO0o, bArr, i, iMin);
        this.f34679OooO0o += iMin;
        return iMin;
    }

    public final void OooOOO0(int i) {
        int i2 = this.f34679OooO0o + i;
        byte[] bArr = this.f34680OooO0o0;
        if (i2 > bArr.length) {
            this.f34680OooO0o0 = Arrays.copyOf(this.f34680OooO0o0, o00.OooO(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int OooOOOO(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f34676OooO0O0.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final int OooOOOo(int i) throws IOException {
        int iMin = Math.min(this.f34681OooO0oO, i);
        OooOOo0(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f34675OooO00o;
            iMin = OooOOOO(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        if (iMin != -1) {
            this.f34678OooO0Oo += (long) iMin;
        }
        return iMin;
    }

    public final void OooOOo0(int i) {
        int i2 = this.f34681OooO0oO - i;
        this.f34681OooO0oO = i2;
        this.f34679OooO0o = 0;
        byte[] bArr = this.f34680OooO0o0;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f34680OooO0o0 = bArr2;
    }

    @Override // o000OOoO.Oooo000
    public final long getLength() {
        return this.f34677OooO0OO;
    }

    @Override // o000OOoO.Oooo000
    public final long getPosition() {
        return this.f34678OooO0Oo;
    }

    @Override // p069o0000ooO.o00000O0
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f34681OooO0oO;
        int iOooOOOO = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f34680OooO0o0, 0, bArr, i, iMin);
            OooOOo0(iMin);
            iOooOOOO = iMin;
        }
        if (iOooOOOO == 0) {
            iOooOOOO = OooOOOO(bArr, i, i2, 0, true);
        }
        if (iOooOOOO != -1) {
            this.f34678OooO0Oo += (long) iOooOOOO;
        }
        return iOooOOOO;
    }

    @Override // o000OOoO.Oooo000
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        OooO0o(bArr, i, i2, false);
    }
}
