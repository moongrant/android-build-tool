package oO0OOo0O;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBusException;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Handler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0 f52791OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f52792OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0OO f52793OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f52794OooO0Oo;

    public OooO(OooO0OO oooO0OO, Looper looper) {
        super(looper);
        this.f52793OooO0OO = oooO0OO;
        this.f52792OooO0O0 = 10;
        this.f52791OooO00o = new OooOOO0();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                OooOO0O oooOO0OOooO0O0 = this.f52791OooO00o.OooO0O0();
                if (oooOO0OOooO0O0 == null) {
                    synchronized (this) {
                        oooOO0OOooO0O0 = this.f52791OooO00o.OooO0O0();
                        if (oooOO0OOooO0O0 == null) {
                            this.f52794OooO0Oo = false;
                            return;
                        }
                    }
                }
                this.f52793OooO0OO.OooO0O0(oooOO0OOooO0O0);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f52792OooO0O0);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f52794OooO0Oo = true;
        } catch (Throwable th) {
            this.f52794OooO0Oo = false;
            throw th;
        }
    }
}
