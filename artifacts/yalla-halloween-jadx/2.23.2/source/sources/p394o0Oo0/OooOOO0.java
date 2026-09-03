package p394o0Oo0;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import p394o0Oo0.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0<T extends OooOO0O> extends Handler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<T> f43617OooO00o;

    public OooOOO0(T t) {
        this.f43617OooO00o = new WeakReference<>(t);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        T t = this.f43617OooO00o.get();
        if (t != null) {
            t.OooO0Oo(message);
        }
    }
}
