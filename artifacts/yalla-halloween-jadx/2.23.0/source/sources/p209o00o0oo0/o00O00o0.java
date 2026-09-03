package p209o00o0oo0;

import com.google.android.exoplayer2.upstream.OooO00o;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p203o00o0o0o.o00OOO0;
import p244o00oo0Oo.o00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O00o0 implements o00O0O00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00 f39530OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39531OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f39532OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f39533OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f39535OooO0oO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public byte[] f39534OooO0o0 = new byte[65536];

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f39529OooO00o = new byte[4096];

    static {
        o00OOO0.OooO00o("goog.exo.extractor");
    }

    public o00O00o0(OooO00o oooO00o, long j, long j2) {
        this.f39530OooO0O0 = oooO00o;
        this.f39532OooO0Oo = j;
        this.f39531OooO0OO = j2;
    }

    @Override // p209o00o0oo0.o00O0O00
    public final void OooO(int i) throws IOException {
        OooOO0o(i, false);
    }

    @Override // p209o00o0oo0.o00O0O00
    public final void OooO0O0(int i, int i2, byte[] bArr) throws IOException {
        OooO0Oo(bArr, i, i2, false);
    }

    @Override // p209o00o0oo0.o00O0O00
    public final boolean OooO0Oo(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!OooOO0o(i2, z)) {
            return false;
        }
        System.arraycopy(this.f39534OooO0o0, this.f39533OooO0o - i2, bArr, i, i2);
        return true;
    }

    @Override // p209o00o0oo0.o00O0O00
    public final void OooO0o() {
        this.f39533OooO0o = 0;
    }

    @Override // p209o00o0oo0.o00O0O00
    public final boolean OooO0oO(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int iMin;
        int i3 = this.f39535OooO0oO;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f39534OooO0o0, 0, bArr, i, iMin);
            OooOOo0(iMin);
        }
        int iOooOOOO = iMin;
        while (iOooOOOO < i2 && iOooOOOO != -1) {
            iOooOOOO = OooOOOO(bArr, i, i2, iOooOOOO, z);
        }
        if (iOooOOOO != -1) {
            this.f39532OooO0Oo += (long) iOooOOOO;
        }
        return iOooOOOO != -1;
    }

    @Override // p209o00o0oo0.o00O0O00
    public final long OooO0oo() {
        return this.f39532OooO0Oo + ((long) this.f39533OooO0o);
    }

    @Override // p209o00o0oo0.o00O0O00
    public final void OooOO0(int i) throws IOException {
        int iMin = Math.min(this.f39535OooO0oO, i);
        OooOOo0(iMin);
        int iOooOOOO = iMin;
        while (iOooOOOO < i && iOooOOOO != -1) {
            iOooOOOO = OooOOOO(this.f39529OooO00o, -iOooOOOO, Math.min(i, this.f39529OooO00o.length + iOooOOOO), iOooOOOO, false);
        }
        if (iOooOOOO != -1) {
            this.f39532OooO0Oo += (long) iOooOOOO;
        }
    }

    public final boolean OooOO0o(int i, boolean z) throws IOException {
        OooOOO0(i);
        int iOooOOOO = this.f39535OooO0oO - this.f39533OooO0o;
        while (iOooOOOO < i) {
            iOooOOOO = OooOOOO(this.f39534OooO0o0, this.f39533OooO0o, i, iOooOOOO, z);
            if (iOooOOOO == -1) {
                return false;
            }
            this.f39535OooO0oO = this.f39533OooO0o + iOooOOOO;
        }
        this.f39533OooO0o += i;
        return true;
    }

    public final int OooOOO(int i, int i2, byte[] bArr) throws IOException {
        int iMin;
        OooOOO0(i2);
        int i3 = this.f39535OooO0oO;
        int i4 = this.f39533OooO0o;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = OooOOOO(this.f39534OooO0o0, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f39535OooO0oO += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.f39534OooO0o0, this.f39533OooO0o, bArr, i, iMin);
        this.f39533OooO0o += iMin;
        return iMin;
    }

    public final void OooOOO0(int i) {
        int i2 = this.f39533OooO0o + i;
        byte[] bArr = this.f39534OooO0o0;
        if (i2 > bArr.length) {
            this.f39534OooO0o0 = Arrays.copyOf(this.f39534OooO0o0, o0O00.OooO(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int OooOOOO(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f39530OooO0O0.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final int OooOOOo(int i) throws IOException {
        int iMin = Math.min(this.f39535OooO0oO, i);
        OooOOo0(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f39529OooO00o;
            iMin = OooOOOO(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        if (iMin != -1) {
            this.f39532OooO0Oo += (long) iMin;
        }
        return iMin;
    }

    public final void OooOOo0(int i) {
        int i2 = this.f39535OooO0oO - i;
        this.f39535OooO0oO = i2;
        this.f39533OooO0o = 0;
        byte[] bArr = this.f39534OooO0o0;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f39534OooO0o0 = bArr2;
    }

    @Override // p209o00o0oo0.o00O0O00
    public final long getLength() {
        return this.f39531OooO0OO;
    }

    @Override // p209o00o0oo0.o00O0O00
    public final long getPosition() {
        return this.f39532OooO0Oo;
    }

    @Override // p244o00oo0Oo.o00
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f39535OooO0oO;
        int iOooOOOO = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f39534OooO0o0, 0, bArr, i, iMin);
            OooOOo0(iMin);
            iOooOOOO = iMin;
        }
        if (iOooOOOO == 0) {
            iOooOOOO = OooOOOO(bArr, i, i2, 0, true);
        }
        if (iOooOOOO != -1) {
            this.f39532OooO0Oo += (long) iOooOOOO;
        }
        return iOooOOOO;
    }

    @Override // p209o00o0oo0.o00O0O00
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        OooO0oO(bArr, i, i2, false);
    }
}
