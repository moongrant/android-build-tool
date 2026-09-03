package p206o00o0oOO;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class o00OOOOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f39410OooO0Oo;

    public final boolean OooO0o(int i) {
        return (this.f39410OooO0Oo & i) == i;
    }

    public final void OooO0o0(int i) {
        this.f39410OooO0Oo = i | this.f39410OooO0Oo;
    }

    public final boolean OooO0oO() {
        return OooO0o(Integer.MIN_VALUE);
    }
}
