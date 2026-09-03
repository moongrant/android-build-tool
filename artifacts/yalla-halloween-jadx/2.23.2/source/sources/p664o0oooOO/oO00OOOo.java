package p664o0oooOO;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00OOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public oO00OOO f59873OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public oO00OOO f59874OooO0O0;

    public final synchronized void OooO00o(oO00OOO oo00ooo) {
        oO00OOO oo00ooo2 = this.f59874OooO0O0;
        if (oo00ooo2 != null) {
            oo00ooo2.f59872OooO0OO = oo00ooo;
            this.f59874OooO0O0 = oo00ooo;
        } else {
            if (this.f59873OooO00o != null) {
                throw new IllegalStateException("Head present, but no tail");
            }
            this.f59874OooO0O0 = oo00ooo;
            this.f59873OooO00o = oo00ooo;
        }
        notifyAll();
    }

    public final synchronized oO00OOO OooO0O0() {
        oO00OOO oo00ooo;
        oo00ooo = this.f59873OooO00o;
        if (oo00ooo != null) {
            oO00OOO oo00ooo2 = oo00ooo.f59872OooO0OO;
            this.f59873OooO00o = oo00ooo2;
            if (oo00ooo2 == null) {
                this.f59874OooO0O0 = null;
            }
        }
        return oo00ooo;
    }

    public final synchronized oO00OOO OooO0OO() throws InterruptedException {
        if (this.f59873OooO00o == null) {
            wait(1000);
        }
        return OooO0O0();
    }
}
