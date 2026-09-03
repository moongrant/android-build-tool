package p358o0OOOoo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f42940OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f42941OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f42942OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f42943OooO0Oo = 0;

    public o0OoOo0(int i) {
        this.f42941OooO0O0 = i;
        this.f42940OooO00o = new byte[i];
    }

    public final int OooO00o(boolean z) {
        int i;
        int i2 = this.f42941OooO0O0;
        if (!z) {
            int i3 = this.f42943OooO0Oo;
            int i4 = this.f42942OooO0OO;
            if (i3 > i4) {
                return i3 - i4;
            }
            if (i3 < i4) {
                return (i3 - i4) + i2;
            }
            return 0;
        }
        int i5 = this.f42943OooO0Oo;
        int i6 = this.f42942OooO0OO;
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
