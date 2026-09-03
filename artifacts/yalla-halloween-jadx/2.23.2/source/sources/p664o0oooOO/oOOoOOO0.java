package p664o0oooOO;

/* JADX INFO: loaded from: classes5.dex */
public final class oOOoOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f59894OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO00Oo00 f59895OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile boolean f59896OooO0OO = true;

    public oOOoOOO0(Object obj, oO00Oo00 oo00oo00) {
        this.f59894OooO00o = obj;
        this.f59895OooO0O0 = oo00oo00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oOOoOOO0)) {
            return false;
        }
        oOOoOOO0 ooooooo0 = (oOOoOOO0) obj;
        return this.f59894OooO00o == ooooooo0.f59894OooO00o && this.f59895OooO0O0.equals(ooooooo0.f59895OooO0O0);
    }

    public final int hashCode() {
        return this.f59895OooO0O0.f59890OooO0o.hashCode() + this.f59894OooO00o.hashCode();
    }
}
