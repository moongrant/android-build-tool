package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f4335Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f4336OoooO00;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f4335Oooo = i;
        this.f4336OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4335Oooo) {
            case 0:
                ((ComponentActivity) this.f4336OoooO00).invalidateMenu();
                break;
            default:
                com.google.firebase.installations.OooO00o oooO00o = (com.google.firebase.installations.OooO00o) this.f4336OoooO00;
                Object obj = com.google.firebase.installations.OooO00o.f19139OooOOO0;
                oooO00o.OooO00o(false);
                break;
        }
    }
}
