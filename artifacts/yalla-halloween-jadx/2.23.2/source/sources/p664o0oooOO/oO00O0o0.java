package p664o0oooOO;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00O0o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oO00OOOo f59860OooO0Oo = new oO00OOOo();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile boolean f59861OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oO00O0o f59862OooO0o0;

    public oO00O0o0(oO00O0o oo00o0o) {
        this.f59862OooO0o0 = oo00o0o;
    }

    public final void OooO00o(Object obj, oOOoOOO0 ooooooo0) {
        oO00OOO oo00oooOooO00o = oO00OOO.OooO00o(obj, ooooooo0);
        synchronized (this) {
            this.f59860OooO0Oo.OooO00o(oo00oooOooO00o);
            if (!this.f59861OooO0o) {
                this.f59861OooO0o = true;
                this.f59862OooO0o0.f59841OooO.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    oO00OOO oo00oooOooO0OO = this.f59860OooO0Oo.OooO0OO();
                    if (oo00oooOooO0OO == null) {
                        synchronized (this) {
                            oo00oooOooO0OO = this.f59860OooO0Oo.OooO0O0();
                            if (oo00oooOooO0OO == null) {
                                this.f59861OooO0o = false;
                                this.f59861OooO0o = false;
                                return;
                            }
                        }
                    }
                    this.f59862OooO0o0.OooO0OO(oo00oooOooO0OO);
                } catch (InterruptedException e) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e);
                    this.f59861OooO0o = false;
                    return;
                }
            } catch (Throwable th) {
                this.f59861OooO0o = false;
                throw th;
            }
        }
    }
}
