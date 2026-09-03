package p127o00O0oo;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f36753OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f36754OooO0O0 = new Handler(Looper.getMainLooper(), new OooO00o());

    public static final class OooO00o implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((o0000) message.obj).OooO00o();
            return true;
        }
    }

    public final synchronized void OooO00o(o0000<?> o0000Var, boolean z) {
        if (this.f36753OooO00o || z) {
            this.f36754OooO0O0.obtainMessage(1, o0000Var).sendToTarget();
        } else {
            this.f36753OooO00o = true;
            o0000Var.OooO00o();
            this.f36753OooO00o = false;
        }
    }
}
