package oO0OOo0O;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooOOO0 f52797Oooo0o = new OooOOO0();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooO0OO f52798Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public volatile boolean f52799Oooo0oo;

    public OooO0O0(OooO0OO oooO0OO) {
        this.f52798Oooo0oO = oooO0OO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooOO0O oooOO0OOooO0O0;
        while (true) {
            try {
                try {
                    OooOOO0 oooOOO0 = this.f52797Oooo0o;
                    synchronized (oooOOO0) {
                        if (oooOOO0.f52832OooO00o == null) {
                            oooOOO0.wait(1000);
                        }
                        oooOO0OOooO0O0 = oooOOO0.OooO0O0();
                    }
                    if (oooOO0OOooO0O0 == null) {
                        synchronized (this) {
                            oooOO0OOooO0O0 = this.f52797Oooo0o.OooO0O0();
                            if (oooOO0OOooO0O0 == null) {
                                this.f52799Oooo0oo = false;
                                this.f52799Oooo0oo = false;
                                return;
                            }
                        }
                    }
                    this.f52798Oooo0oO.OooO0O0(oooOO0OOooO0O0);
                } catch (InterruptedException e) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e);
                    this.f52799Oooo0oo = false;
                    return;
                }
            } catch (Throwable th) {
                this.f52799Oooo0oo = false;
                throw th;
            }
        }
    }
}
