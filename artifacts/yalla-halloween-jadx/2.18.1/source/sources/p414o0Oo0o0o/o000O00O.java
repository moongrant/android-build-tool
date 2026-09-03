package p414o0Oo0o0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f39542OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f39543OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f39544OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int[] f39545OooO0Oo = new int[10];

    public final int OooO00o(int i) {
        int i2 = 1 << i;
        int i3 = (this.f39544OooO0OO & i2) != 0 ? 2 : 0;
        return (i2 & this.f39543OooO0O0) != 0 ? i3 | 1 : i3;
    }

    public final int OooO0O0() {
        if ((this.f39542OooO00o & 128) != 0) {
            return this.f39545OooO0Oo[7];
        }
        return 65536;
    }

    public final boolean OooO0OO(int i) {
        return ((1 << i) & this.f39542OooO00o) != 0;
    }

    public final o000O00O OooO0Oo(int i, int i2, int i3) {
        int[] iArr = this.f39545OooO0Oo;
        if (i >= iArr.length) {
            return this;
        }
        int i4 = 1 << i;
        this.f39542OooO00o |= i4;
        if ((i2 & 1) != 0) {
            this.f39543OooO0O0 |= i4;
        } else {
            this.f39543OooO0O0 &= ~i4;
        }
        if ((i2 & 2) != 0) {
            this.f39544OooO0OO |= i4;
        } else {
            this.f39544OooO0OO &= ~i4;
        }
        iArr[i] = i3;
        return this;
    }
}
