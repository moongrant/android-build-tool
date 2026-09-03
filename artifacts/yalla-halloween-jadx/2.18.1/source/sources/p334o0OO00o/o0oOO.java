package p334o0OO00o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f37446OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f37447OooO0O0;

    public o0oOO(Object obj, int i) {
        this.f37446OooO00o = obj;
        this.f37447OooO0O0 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0oOO)) {
            return false;
        }
        o0oOO o0ooo2 = (o0oOO) obj;
        return this.f37446OooO00o == o0ooo2.f37446OooO00o && this.f37447OooO0O0 == o0ooo2.f37447OooO0O0;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f37446OooO00o) * 65535) + this.f37447OooO0O0;
    }
}
