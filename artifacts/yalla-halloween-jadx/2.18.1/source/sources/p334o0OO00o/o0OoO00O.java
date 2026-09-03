package p334o0OO00o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoO00O implements o0oO0Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0oO0Ooo[] f37436OooO00o;

    public o0OoO00O(o0oO0Ooo... o0oo0oooArr) {
        this.f37436OooO00o = o0oo0oooArr;
    }

    @Override // p334o0OO00o.o0oO0Ooo
    public final o0O00OOO OooO00o(Class cls) {
        o0oO0Ooo[] o0oo0oooArr = this.f37436OooO00o;
        for (int i = 0; i < 2; i++) {
            o0oO0Ooo o0oo0ooo2 = o0oo0oooArr[i];
            if (o0oo0ooo2.OooO0O0(cls)) {
                return o0oo0ooo2.OooO00o(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p334o0OO00o.o0oO0Ooo
    public final boolean OooO0O0(Class cls) {
        o0oO0Ooo[] o0oo0oooArr = this.f37436OooO00o;
        for (int i = 0; i < 2; i++) {
            if (o0oo0oooArr[i].OooO0O0(cls)) {
                return true;
            }
        }
        return false;
    }
}
