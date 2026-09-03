package p420o0Oo0ooO;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00o0 extends Handler {
    public oO00o0(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        sendMessageDelayed(obtainMessage(), 1000L);
    }
}
