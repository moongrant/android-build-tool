package p660o0oooO0O;

/* JADX INFO: loaded from: classes5.dex */
public final class oo0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OOOOo f60316OooO0Oo = new o00OOOOo();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00OOO00 f60317OooO0o0;

    public oo0O(o00OOO00 o00ooo01) {
        this.f60317OooO0o0 = o00ooo01;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00OOOO0 o00oooo0OooO0O0 = this.f60316OooO0Oo.OooO0O0();
        if (o00oooo0OooO0O0 == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f60317OooO0o0.OooO0OO(o00oooo0OooO0O0);
    }
}
