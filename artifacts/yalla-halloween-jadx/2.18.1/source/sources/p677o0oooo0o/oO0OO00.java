package p677o0oooo0o;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class oO0OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OutputStream f52151OooO00o;

    public class OooO00o extends oO0OO00 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f52152OooO0O0;

        public OooO00o(OutputStream outputStream) {
            super(outputStream);
            this.f52152OooO0O0 = true;
        }

        @Override // p677o0oooo0o.oO0OO00
        public final void OooO0OO(int i) throws IOException {
            if (this.f52152OooO0O0) {
                this.f52152OooO0O0 = false;
            } else {
                super.OooO0OO(i);
            }
        }
    }

    public oO0OO00(OutputStream outputStream) {
        this.f52151OooO00o = outputStream;
    }

    public void OooO(oO0O00o0 oo0o00o0) throws IOException {
        if (oo0o00o0 == null) {
            throw new IOException("null object detected");
        }
        oo0o00o0.OooO0O0().OooOO0(this);
    }

    public oO0OO00 OooO00o() {
        return new oOOOoo00(this.f52151OooO00o);
    }

    public oO0OO00 OooO0O0() {
        return new c(this.f52151OooO00o);
    }

    public void OooO0OO(int i) throws IOException {
        this.f52151OooO00o.write(i);
    }

    public final void OooO0Oo(byte[] bArr) throws IOException {
        this.f52151OooO00o.write(bArr);
    }

    public final void OooO0o(int i, byte[] bArr) throws IOException {
        OooO0OO(i);
        OooO0oo(bArr.length);
        OooO0Oo(bArr);
    }

    public final void OooO0o0(int i, int i2, byte[] bArr) throws IOException {
        OooOO0(i, i2);
        OooO0oo(bArr.length);
        OooO0Oo(bArr);
    }

    public final void OooO0oO(oO0OO0O oo0oo0o) throws IOException {
        oo0oo0o.OooOO0(new OooO00o(this.f52151OooO00o));
    }

    public final void OooO0oo(int i) throws IOException {
        if (i <= 127) {
            OooO0OO((byte) i);
            return;
        }
        int i2 = i;
        int i3 = 1;
        while (true) {
            i2 >>>= 8;
            if (i2 == 0) {
                break;
            } else {
                i3++;
            }
        }
        OooO0OO((byte) (i3 | 128));
        for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
            OooO0OO((byte) (i >> i4));
        }
    }

    public final void OooOO0(int i, int i2) throws IOException {
        if (i2 < 31) {
            OooO0OO(i | i2);
            return;
        }
        OooO0OO(i | 31);
        if (i2 < 128) {
            OooO0OO(i2);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 4;
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        } while (i2 > 127);
        this.f52151OooO00o.write(bArr, i3, 5 - i3);
    }
}
