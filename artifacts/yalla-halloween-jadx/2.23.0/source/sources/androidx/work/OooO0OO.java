package androidx.work;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Worker f8390OooO0Oo;

    public OooO0OO(Worker worker) {
        this.f8390OooO0Oo = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Worker worker = this.f8390OooO0Oo;
        try {
            worker.f8392OooO.OooO0oo(worker.OooO0oo());
        } catch (Throwable th) {
            worker.f8392OooO.OooOO0(th);
        }
    }
}
