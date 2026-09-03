package oO0OOo0O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooOO0O f52832OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOO0O f52833OooO0O0;

    public final synchronized void OooO00o(OooOO0O oooOO0O) {
        OooOO0O oooOO0O2 = this.f52833OooO0O0;
        if (oooOO0O2 != null) {
            oooOO0O2.f52828OooO0OO = oooOO0O;
            this.f52833OooO0O0 = oooOO0O;
        } else {
            if (this.f52832OooO00o != null) {
                throw new IllegalStateException("Head present, but no tail");
            }
            this.f52833OooO0O0 = oooOO0O;
            this.f52832OooO00o = oooOO0O;
        }
        notifyAll();
    }

    public final synchronized OooOO0O OooO0O0() {
        OooOO0O oooOO0O;
        oooOO0O = this.f52832OooO00o;
        if (oooOO0O != null) {
            OooOO0O oooOO0O2 = oooOO0O.f52828OooO0OO;
            this.f52832OooO00o = oooOO0O2;
            if (oooOO0O2 == null) {
                this.f52833OooO0O0 = null;
            }
        }
        return oooOO0O;
    }
}
