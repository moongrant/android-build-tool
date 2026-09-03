package p302o0O0o00;

import java.util.Arrays;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f36068OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f36069OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f36070OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public byte[] f36071OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f36072OooO0o0;

    public o00(int i) {
        this.f36068OooO00o = i;
        byte[] bArr = new byte[131];
        this.f36071OooO0Oo = bArr;
        bArr[2] = 1;
    }

    public final void OooO00o(byte[] bArr, int i, int i2) {
        if (this.f36069OooO0O0) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f36071OooO0Oo;
            int length = bArr2.length;
            int i4 = this.f36072OooO0o0;
            if (length < i4 + i3) {
                this.f36071OooO0Oo = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f36071OooO0Oo, this.f36072OooO0o0, i3);
            this.f36072OooO0o0 += i3;
        }
    }

    public final boolean OooO0O0(int i) {
        if (!this.f36069OooO0O0) {
            return false;
        }
        this.f36072OooO0o0 -= i;
        this.f36069OooO0O0 = false;
        this.f36070OooO0OO = true;
        return true;
    }

    public final void OooO0OO() {
        this.f36069OooO0O0 = false;
        this.f36070OooO0OO = false;
    }

    public final void OooO0Oo(int i) {
        o00000O0.OooO0Oo(!this.f36069OooO0O0);
        boolean z = i == this.f36068OooO00o;
        this.f36069OooO0O0 = z;
        if (z) {
            this.f36072OooO0o0 = 3;
            this.f36070OooO0OO = false;
        }
    }
}
