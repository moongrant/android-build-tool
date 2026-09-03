package p660o0oooO0O;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OOOOo f60258OooO0Oo = new o00OOOOo();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile boolean f60259OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00OOO00 f60260OooO0o0;

    public o00OO(o00OOO00 o00ooo01) {
        this.f60260OooO0o0 = o00ooo01;
    }

    public final void OooO00o(Object obj, oo00oO oo00oo) {
        o00OOOO0 o00oooo0OooO00o = o00OOOO0.OooO00o(obj, oo00oo);
        synchronized (this) {
            this.f60258OooO0Oo.OooO00o(o00oooo0OooO00o);
            if (!this.f60259OooO0o) {
                this.f60259OooO0o = true;
                this.f60260OooO0o0.f60266OooO.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    o00OOOO0 o00oooo0OooO0OO = this.f60258OooO0Oo.OooO0OO();
                    if (o00oooo0OooO0OO == null) {
                        synchronized (this) {
                            o00oooo0OooO0OO = this.f60258OooO0Oo.OooO0O0();
                            if (o00oooo0OooO0OO == null) {
                                this.f60259OooO0o = false;
                                this.f60259OooO0o = false;
                                return;
                            }
                        }
                    }
                    this.f60260OooO0o0.OooO0OO(o00oooo0OooO0OO);
                } catch (InterruptedException e) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e);
                    this.f60259OooO0o = false;
                    return;
                }
            } catch (Throwable th) {
                this.f60259OooO0o = false;
                throw th;
            }
        }
    }
}
