package p677o0oooo0o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends l {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f52120Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f52121Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f52122OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f52123OoooO00;

    public i(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.f52123OoooO00 = false;
        this.f52122OoooO0 = true;
        this.f52121Oooo0oo = inputStream.read();
        int i2 = inputStream.read();
        this.f52120Oooo = i2;
        if (i2 < 0) {
            throw new EOFException();
        }
        OooO0Oo();
    }

    public final boolean OooO0Oo() {
        if (!this.f52123OoooO00 && this.f52122OoooO0 && this.f52121Oooo0oo == 0 && this.f52120Oooo == 0) {
            this.f52123OoooO00 = true;
            OooO0O0();
        }
        return this.f52123OoooO00;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (OooO0Oo()) {
            return -1;
        }
        int i = this.f52127Oooo0o.read();
        if (i < 0) {
            throw new EOFException();
        }
        int i2 = this.f52121Oooo0oo;
        this.f52121Oooo0oo = this.f52120Oooo;
        this.f52120Oooo = i;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f52122OoooO0 || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.f52123OoooO00) {
            return -1;
        }
        int i3 = this.f52127Oooo0o.read(bArr, i + 2, i2 - 2);
        if (i3 < 0) {
            throw new EOFException();
        }
        bArr[i] = (byte) this.f52121Oooo0oo;
        bArr[i + 1] = (byte) this.f52120Oooo;
        this.f52121Oooo0oo = this.f52127Oooo0o.read();
        int i4 = this.f52127Oooo0o.read();
        this.f52120Oooo = i4;
        if (i4 >= 0) {
            return i3 + 2;
        }
        throw new EOFException();
    }
}
