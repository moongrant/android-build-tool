package p664o0oooOO;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0O0OoO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oO00OOOo f59892OooO0Oo = new oO00OOOo();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oO00O0o f59893OooO0o0;

    public oO0O0OoO(oO00O0o oo00o0o) {
        this.f59893OooO0o0 = oo00o0o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oO00OOO oo00oooOooO0O0 = this.f59892OooO0Oo.OooO0O0();
        if (oo00oooOooO0O0 == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f59893OooO0o0.OooO0OO(oo00oooOooO0O0);
    }
}
