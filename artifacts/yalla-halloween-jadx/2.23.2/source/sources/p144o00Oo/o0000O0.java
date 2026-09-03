package p144o00Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f37544OooO0Oo;

    public o0000O0(o0000O0O o0000o0o2) {
        this.f37544OooO0Oo = o0000o0o2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0000O0O o0000o0o2 = this.f37544OooO0Oo;
        while (!o0000o0o2.f37549OooO0o) {
            try {
                o0000o0o2.OooO0O0((o0000O0O.OooO00o) o0000o0o2.f37548OooO0Oo.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
