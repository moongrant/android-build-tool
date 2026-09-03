package p368o0OOo0oO;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o00Oo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile boolean f43986OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile boolean f43987OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Thread f43988OooO0o0;

    public abstract void OooO0O0();

    public abstract void OooO0OO();

    public void OooO0Oo() {
        this.f43986OooO0Oo = true;
        Thread thread = this.f43988OooO0o0;
        if (thread != null) {
            thread.interrupt();
        }
    }

    public abstract void OooO0o0();

    @Override // java.lang.Runnable
    public final void run() {
        this.f43987OooO0o = true;
        OooO0OO();
        this.f43988OooO0o0 = Thread.currentThread();
        while (!this.f43986OooO0Oo) {
            OooO0o0();
        }
        if (!this.f43986OooO0Oo) {
            this.f43986OooO0Oo = true;
        }
        this.f43987OooO0o = false;
        OooO0O0();
        this.f43988OooO0o0 = null;
    }
}
