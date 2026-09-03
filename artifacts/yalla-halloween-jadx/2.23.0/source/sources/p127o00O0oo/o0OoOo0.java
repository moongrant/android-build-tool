package p127o00O0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O f36935OooO0Oo;

    public o0OoOo0(o00O0O o00o0o2) {
        this.f36935OooO0Oo = o00o0o2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00O0O o00o0o2 = this.f36935OooO0Oo;
        while (!o00o0o2.f36826OooO0o) {
            try {
                o00o0o2.OooO0O0((o00O0O.OooO00o) o00o0o2.f36825OooO0Oo.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
