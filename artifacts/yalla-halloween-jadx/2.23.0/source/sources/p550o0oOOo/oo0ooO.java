package p550o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oo0ooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f55946OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f55947OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f55948OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f55949OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f55950OooO0o0;

    public oo0ooO() {
        int[] iArr = new int[16];
        this.f55949OooO0Oo = iArr;
        this.f55950OooO0o0 = iArr.length - 1;
    }

    public final void OooO00o(int i) {
        int i2 = this.f55948OooO0OO;
        int[] iArr = this.f55949OooO0Oo;
        if (i2 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i3 = this.f55946OooO00o;
            int i4 = length2 - i3;
            System.arraycopy(iArr, i3, iArr2, 0, i4);
            System.arraycopy(this.f55949OooO0Oo, 0, iArr2, i4, i3);
            this.f55946OooO00o = 0;
            this.f55947OooO0O0 = this.f55948OooO0OO - 1;
            this.f55949OooO0Oo = iArr2;
            this.f55950OooO0o0 = length - 1;
        }
        int i5 = (this.f55947OooO0O0 + 1) & this.f55950OooO0o0;
        this.f55947OooO0O0 = i5;
        this.f55949OooO0Oo[i5] = i;
        this.f55948OooO0OO++;
    }
}
