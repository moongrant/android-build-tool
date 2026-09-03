package p660o0oooO0O;

/* JADX INFO: loaded from: classes5.dex */
public final class oo00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f60313OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0oOO f60314OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile boolean f60315OooO0OO = true;

    public oo00oO(Object obj, o0oOO o0ooo2) {
        this.f60313OooO00o = obj;
        this.f60314OooO0O0 = o0ooo2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oo00oO)) {
            return false;
        }
        oo00oO oo00oo = (oo00oO) obj;
        return this.f60313OooO00o == oo00oo.f60313OooO00o && this.f60314OooO0O0.equals(oo00oo.f60314OooO0O0);
    }

    public final int hashCode() {
        return this.f60314OooO0O0.f60311OooO0o.hashCode() + this.f60313OooO00o.hashCode();
    }
}
