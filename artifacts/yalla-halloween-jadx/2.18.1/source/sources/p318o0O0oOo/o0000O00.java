package p318o0O0oOo;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f36695OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f36696OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f36697OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f36698OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f36699OooO0o0;

    public o0000O00() {
        int[] iArr = new int[16];
        this.f36698OooO0Oo = iArr;
        this.f36699OooO0o0 = iArr.length - 1;
    }

    public final void OooO00o(int i) {
        int i2 = this.f36697OooO0OO;
        int[] iArr = this.f36698OooO0Oo;
        if (i2 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i3 = this.f36695OooO00o;
            int i4 = length2 - i3;
            System.arraycopy(iArr, i3, iArr2, 0, i4);
            System.arraycopy(this.f36698OooO0Oo, 0, iArr2, i4, i3);
            this.f36695OooO00o = 0;
            this.f36696OooO0O0 = this.f36697OooO0OO - 1;
            this.f36698OooO0Oo = iArr2;
            this.f36699OooO0o0 = length - 1;
        }
        int i5 = (this.f36696OooO0O0 + 1) & this.f36699OooO0o0;
        this.f36696OooO0O0 = i5;
        this.f36698OooO0Oo[i5] = i;
        this.f36697OooO0OO++;
    }

    public final int OooO0O0() {
        int i = this.f36697OooO0OO;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f36698OooO0Oo;
        int i2 = this.f36695OooO00o;
        int i3 = iArr[i2];
        this.f36695OooO00o = (i2 + 1) & this.f36699OooO0o0;
        this.f36697OooO0OO = i - 1;
        return i3;
    }
}
