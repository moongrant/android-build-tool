package o000O00O;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f28088OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o f28089OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f28090OooO0OO;

    public interface OooO00o {
        void onCancel();
    }

    public final void OooO00o() {
        synchronized (this) {
            if (this.f28088OooO00o) {
                return;
            }
            this.f28088OooO00o = true;
            this.f28090OooO0OO = true;
            OooO00o oooO00o = this.f28089OooO0O0;
            if (oooO00o != null) {
                try {
                    oooO00o.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f28090OooO0OO = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f28090OooO0OO = false;
                notifyAll();
            }
        }
    }

    public final void OooO0O0(@Nullable OooO00o oooO00o) {
        synchronized (this) {
            while (this.f28090OooO0OO) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f28089OooO0O0 == oooO00o) {
                return;
            }
            this.f28089OooO0O0 = oooO00o;
            if (this.f28088OooO00o) {
                oooO00o.onCancel();
            }
        }
    }
}
