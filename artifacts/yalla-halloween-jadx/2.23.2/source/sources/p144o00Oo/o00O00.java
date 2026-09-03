package p144o00Oo;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f37702OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f37703OooO0O0 = new Handler(Looper.getMainLooper(), new OooO00o());

    public static final class OooO00o implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((o00oOoo) message.obj).OooO00o();
            return true;
        }
    }

    public final synchronized void OooO00o(o00oOoo<?> o00oooo2, boolean z) {
        if (this.f37702OooO00o || z) {
            this.f37703OooO0O0.obtainMessage(1, o00oooo2).sendToTarget();
        } else {
            this.f37702OooO00o = true;
            o00oooo2.OooO00o();
            this.f37702OooO00o = false;
        }
    }
}
