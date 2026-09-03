package p357o0OOOoo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f43743OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f43744OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f43745OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f43746OooO0Oo = 0;

    public OooOo(int i) {
        this.f43744OooO0O0 = i;
        this.f43743OooO00o = new byte[i];
    }

    public final int OooO00o(boolean z) {
        int i;
        int i2 = this.f43744OooO0O0;
        if (!z) {
            int i3 = this.f43746OooO0Oo;
            int i4 = this.f43745OooO0OO;
            if (i3 > i4) {
                return i3 - i4;
            }
            if (i3 < i4) {
                return (i3 - i4) + i2;
            }
            return 0;
        }
        int i5 = this.f43746OooO0Oo;
        int i6 = this.f43745OooO0OO;
        if (i5 > i6) {
            i = (i6 - i5) + i2;
        } else {
            if (i5 >= i6) {
                return i2 - 1;
            }
            i = i6 - i5;
        }
        return i - 1;
    }
}
