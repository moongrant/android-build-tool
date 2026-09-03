package p409o0Oo0Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o000oOoO f39144OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000oOoO f39145OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o000oOoO f39146OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o000oOoO f39147OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o000oOoO f39148OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o000oOoO[] f39149OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f39150OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f39151OooO0O0;

    static {
        o000oOoO o000oooo2 = new o000oOoO(0, false);
        f39144OooO0OO = o000oooo2;
        o000oOoO o000oooo3 = new o000oOoO(1, true);
        o000oOoO o000oooo4 = new o000oOoO(2, false);
        f39145OooO0Oo = o000oooo4;
        o000oOoO o000oooo5 = new o000oOoO(3, true);
        o000oOoO o000oooo6 = new o000oOoO(4, false);
        f39147OooO0o0 = o000oooo6;
        o000oOoO o000oooo7 = new o000oOoO(5, true);
        o000oOoO o000oooo8 = new o000oOoO(6, false);
        f39146OooO0o = o000oooo8;
        o000oOoO o000oooo9 = new o000oOoO(7, true);
        o000oOoO o000oooo10 = new o000oOoO(8, false);
        o000oOoO o000oooo11 = new o000oOoO(9, true);
        f39148OooO0oO = o000oooo11;
        f39149OooO0oo = new o000oOoO[]{o000oooo2, o000oooo3, o000oooo4, o000oooo5, o000oooo6, o000oooo7, o000oooo8, o000oooo9, o000oooo10, o000oooo11, new o000oOoO(10, false), new o000oOoO(10, true)};
    }

    public o000oOoO(int i, boolean z) {
        this.f39150OooO00o = i;
        this.f39151OooO0O0 = z;
    }

    public final boolean OooO00o(o000oOoO o000oooo2) {
        int i = this.f39150OooO00o;
        int i2 = o000oooo2.f39150OooO00o;
        return i < i2 || ((!this.f39151OooO0O0 || f39148OooO0oO == this) && i == i2);
    }

    public final o000oOoO OooO0O0() {
        if (!this.f39151OooO0O0) {
            return this;
        }
        o000oOoO o000oooo2 = f39149OooO0oo[this.f39150OooO00o - 1];
        return !o000oooo2.f39151OooO0O0 ? o000oooo2 : f39144OooO0OO;
    }
}
