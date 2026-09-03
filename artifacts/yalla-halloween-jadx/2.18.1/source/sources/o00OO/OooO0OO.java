package o00OO;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import o00OO.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO<T extends OooO0O0> extends Handler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<T> f31172OooO00o;

    public OooO0OO(T t) {
        this.f31172OooO00o = new WeakReference<>(t);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        T t = this.f31172OooO00o.get();
        if (t != null) {
            t.OooO0O0(message);
        }
    }
}
