package o0OO0o00;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f37970Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Callable f37971Oooo0oO;

    public oo0o0Oo(o0OO00O o0oo00o2, Callable callable) {
        this.f37970Oooo0o = o0oo00o2;
        this.f37971Oooo0oO = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f37970Oooo0o.OooO0O0(this.f37971Oooo0oO.call());
        } catch (Exception e) {
            this.f37970Oooo0o.OooO00o(e);
        } catch (Throwable th) {
            this.f37970Oooo0o.OooO00o(new RuntimeException(th));
        }
    }
}
