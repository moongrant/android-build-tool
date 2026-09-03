package androidx.work;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Worker f11482OooO0Oo;

    public OooO0o(Worker worker) {
        this.f11482OooO0Oo = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Worker worker = this.f11482OooO0Oo;
        try {
            worker.f11484OooO0oo.OooO(worker.OooO0oO());
        } catch (Throwable th) {
            worker.f11484OooO0oo.OooOO0(th);
        }
    }
}
