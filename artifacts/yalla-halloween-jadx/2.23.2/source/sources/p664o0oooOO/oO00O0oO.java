package p664o0oooOO;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBusException;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00O0oO extends Handler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO00OOOo f59863OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f59864OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO00O0o f59865OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f59866OooO0Oo;

    public oO00O0oO(oO00O0o oo00o0o, Looper looper) {
        super(looper);
        this.f59865OooO0OO = oo00o0o;
        this.f59864OooO0O0 = 10;
        this.f59863OooO00o = new oO00OOOo();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                oO00OOO oo00oooOooO0O0 = this.f59863OooO00o.OooO0O0();
                if (oo00oooOooO0O0 == null) {
                    synchronized (this) {
                        oo00oooOooO0O0 = this.f59863OooO00o.OooO0O0();
                        if (oo00oooOooO0O0 == null) {
                            this.f59866OooO0Oo = false;
                            return;
                        }
                    }
                }
                this.f59865OooO0OO.OooO0OO(oo00oooOooO0O0);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f59864OooO0O0);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f59866OooO0Oo = true;
        } catch (Throwable th) {
            this.f59866OooO0Oo = false;
            throw th;
        }
    }
}
