package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f4319Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f4320Oooo0oO;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f4319Oooo0o = i;
        this.f4320Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4319Oooo0o) {
            case 0:
                ((ComponentActivity) this.f4320Oooo0oO).invalidateMenu();
                break;
            default:
                com.google.firebase.installations.OooO00o oooO00o = (com.google.firebase.installations.OooO00o) this.f4320Oooo0oO;
                Object obj = com.google.firebase.installations.OooO00o.f19120OooOOO0;
                oooO00o.OooO00o(false);
                break;
        }
    }
}
