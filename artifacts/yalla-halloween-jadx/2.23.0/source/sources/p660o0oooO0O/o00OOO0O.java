package p660o0oooO0O;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBusException;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OOO0O extends Handler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00OOOOo f60285OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f60286OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00OOO00 f60287OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f60288OooO0Oo;

    public o00OOO0O(o00OOO00 o00ooo01, Looper looper) {
        super(looper);
        this.f60287OooO0OO = o00ooo01;
        this.f60286OooO0O0 = 10;
        this.f60285OooO00o = new o00OOOOo();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                o00OOOO0 o00oooo0OooO0O0 = this.f60285OooO00o.OooO0O0();
                if (o00oooo0OooO0O0 == null) {
                    synchronized (this) {
                        o00oooo0OooO0O0 = this.f60285OooO00o.OooO0O0();
                        if (o00oooo0OooO0O0 == null) {
                            this.f60288OooO0Oo = false;
                            return;
                        }
                    }
                }
                this.f60287OooO0OO.OooO0OO(o00oooo0OooO0O0);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f60286OooO0O0);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f60288OooO0Oo = true;
        } catch (Throwable th) {
            this.f60288OooO0Oo = false;
            throw th;
        }
    }
}
