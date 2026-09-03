package p211o00oO0;

import java.util.Arrays;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f39597OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f39598OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f39599OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public byte[] f39600OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f39601OooO0o0;

    public Oooo000(int i) {
        this.f39597OooO00o = i;
        byte[] bArr = new byte[131];
        this.f39600OooO0Oo = bArr;
        bArr[2] = 1;
    }

    public final void OooO00o(int i, int i2, byte[] bArr) {
        if (this.f39598OooO0O0) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f39600OooO0Oo;
            int length = bArr2.length;
            int i4 = this.f39601OooO0o0;
            if (length < i4 + i3) {
                this.f39600OooO0Oo = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f39600OooO0Oo, this.f39601OooO0o0, i3);
            this.f39601OooO0o0 += i3;
        }
    }

    public final boolean OooO0O0(int i) {
        if (!this.f39598OooO0O0) {
            return false;
        }
        this.f39601OooO0o0 -= i;
        this.f39598OooO0O0 = false;
        this.f39599OooO0OO = true;
        return true;
    }

    public final void OooO0OO() {
        this.f39598OooO0O0 = false;
        this.f39599OooO0OO = false;
    }

    public final void OooO0Oo(int i) {
        o00O000o.OooO0Oo(!this.f39598OooO0O0);
        boolean z = i == this.f39597OooO00o;
        this.f39598OooO0O0 = z;
        if (z) {
            this.f39601OooO0o0 = 3;
            this.f39599OooO0OO = false;
        }
    }
}
