package p214o00oO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00OO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O00o0 f33400Oooo0o;

    public o00O00OO(o00O00o0 o00o00o1) {
        this.f33400Oooo0o = o00o00o1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00O00o0 o00o00o1 = this.f33400Oooo0o;
        while (!o00o00o1.f33405OooO0o) {
            try {
                o00o00o1.OooO0O0((o00O00o0.OooO00o) o00o00o1.f33404OooO0Oo.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
