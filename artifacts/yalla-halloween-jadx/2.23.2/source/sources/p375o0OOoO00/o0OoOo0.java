package p375o0OOoO00;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0OoOo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile boolean f43236OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile boolean f43237OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Thread f43238OooO0o0;

    public abstract void OooO0O0();

    public abstract void OooO0OO();

    public void OooO0Oo() {
        this.f43236OooO0Oo = true;
        Thread thread = this.f43238OooO0o0;
        if (thread != null) {
            thread.interrupt();
        }
    }

    public abstract void OooO0o0();

    @Override // java.lang.Runnable
    public final void run() {
        this.f43237OooO0o = true;
        OooO0OO();
        this.f43238OooO0o0 = Thread.currentThread();
        while (!this.f43236OooO0Oo) {
            OooO0o0();
        }
        if (!this.f43236OooO0Oo) {
            this.f43236OooO0Oo = true;
        }
        this.f43237OooO0o = false;
        OooO0O0();
        this.f43238OooO0o0 = null;
    }
}
