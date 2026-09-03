package p337o0OO0ooO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f43367OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f43368OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f43369OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int[] f43370OooO0Oo = new int[10];

    public final int OooO00o(int i) {
        int i2 = 1 << i;
        int i3 = (this.f43369OooO0OO & i2) != 0 ? 2 : 0;
        return (i2 & this.f43368OooO0O0) != 0 ? i3 | 1 : i3;
    }

    public final int OooO0O0() {
        if ((this.f43367OooO00o & 128) != 0) {
            return this.f43370OooO0Oo[7];
        }
        return 65536;
    }

    public final void OooO0OO(int i, int i2, int i3) {
        int[] iArr = this.f43370OooO0Oo;
        if (i >= iArr.length) {
            return;
        }
        int i4 = 1 << i;
        this.f43367OooO00o |= i4;
        if ((i2 & 1) != 0) {
            this.f43368OooO0O0 |= i4;
        } else {
            this.f43368OooO0O0 &= ~i4;
        }
        if ((i2 & 2) != 0) {
            this.f43369OooO0OO |= i4;
        } else {
            this.f43369OooO0OO &= ~i4;
        }
        iArr[i] = i3;
    }
}
