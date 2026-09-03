package oO0OOo0O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f52840OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOOO f52841OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile boolean f52842OooO0OO = true;

    public OooOo(Object obj, OooOOOO oooOOOO) {
        this.f52840OooO00o = obj;
        this.f52841OooO0O0 = oooOOOO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        return this.f52840OooO00o == oooOo.f52840OooO00o && this.f52841OooO0O0.equals(oooOo.f52841OooO0O0);
    }

    public final int hashCode() {
        return this.f52841OooO0O0.f52838OooO0o.hashCode() + this.f52840OooO00o.hashCode();
    }
}
