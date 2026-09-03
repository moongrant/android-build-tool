package p103o000oo00;

import java.util.Arrays;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f35664OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f35665OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f35666OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public byte[] f35667OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f35668OooO0o0;

    public o000oOoO(int i) {
        this.f35664OooO00o = i;
        byte[] bArr = new byte[131];
        this.f35667OooO0Oo = bArr;
        bArr[2] = 1;
    }

    public final void OooO00o(int i, int i2, byte[] bArr) {
        if (this.f35665OooO0O0) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f35667OooO0Oo;
            int length = bArr2.length;
            int i4 = this.f35668OooO0o0;
            if (length < i4 + i3) {
                this.f35667OooO0Oo = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f35667OooO0Oo, this.f35668OooO0o0, i3);
            this.f35668OooO0o0 += i3;
        }
    }

    public final boolean OooO0O0(int i) {
        if (!this.f35665OooO0O0) {
            return false;
        }
        this.f35668OooO0o0 -= i;
        this.f35665OooO0O0 = false;
        this.f35666OooO0OO = true;
        return true;
    }

    public final void OooO0OO() {
        this.f35665OooO0O0 = false;
        this.f35666OooO0OO = false;
    }

    public final void OooO0Oo(int i) {
        o00Oo0.OooO0Oo(!this.f35665OooO0O0);
        boolean z = i == this.f35664OooO00o;
        this.f35665OooO0O0 = z;
        if (z) {
            this.f35668OooO0o0 = 3;
            this.f35666OooO0OO = false;
        }
    }
}
