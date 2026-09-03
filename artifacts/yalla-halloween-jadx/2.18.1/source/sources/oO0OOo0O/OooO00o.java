package oO0OOo0O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooOOO0 f52795Oooo0o = new OooOOO0();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooO0OO f52796Oooo0oO;

    public OooO00o(OooO0OO oooO0OO) {
        this.f52796Oooo0oO = oooO0OO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooOO0O oooOO0OOooO0O0 = this.f52795Oooo0o.OooO0O0();
        if (oooOO0OOooO0O0 == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f52796Oooo0oO.OooO0O0(oooOO0OOooO0O0);
    }
}
