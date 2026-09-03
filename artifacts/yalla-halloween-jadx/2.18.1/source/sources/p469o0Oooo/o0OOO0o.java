package p469o0Oooo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0OOO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public volatile boolean f40603Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Thread f40604Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public volatile boolean f40605Oooo0oo;

    public abstract void OooO0O0();

    public abstract void OooO0OO();

    public void OooO0Oo() {
        this.f40603Oooo0o = true;
        Thread thread = this.f40604Oooo0oO;
        if (thread != null) {
            thread.interrupt();
        }
    }

    public abstract void OooO0o0();

    @Override // java.lang.Runnable
    public final void run() {
        this.f40605Oooo0oo = true;
        OooO0OO();
        this.f40604Oooo0oO = Thread.currentThread();
        while (!this.f40603Oooo0o) {
            OooO0o0();
        }
        if (!this.f40603Oooo0o) {
            this.f40603Oooo0o = true;
        }
        this.f40605Oooo0oo = false;
        OooO0O0();
        this.f40604Oooo0oO = null;
    }
}
