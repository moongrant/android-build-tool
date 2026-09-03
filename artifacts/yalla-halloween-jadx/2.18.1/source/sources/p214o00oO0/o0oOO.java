package p214o00oO0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class o0oOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f33539OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f33540OooO0O0 = new Handler(Looper.getMainLooper(), new OooO00o());

    public static final class OooO00o implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((o00OOOO0) message.obj).OooO00o();
            return true;
        }
    }

    public final synchronized void OooO00o(o00OOOO0<?> o00oooo1, boolean z) {
        if (this.f33539OooO00o || z) {
            this.f33540OooO0O0.obtainMessage(1, o00oooo1).sendToTarget();
        } else {
            this.f33539OooO00o = true;
            o00oooo1.OooO00o();
            this.f33539OooO00o = false;
        }
    }
}
