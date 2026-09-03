package p394o0Oo00oO;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import p394o0Oo00oO.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000<T extends o000OOo> extends Handler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<T> f44406OooO00o;

    public o000000(T t) {
        this.f44406OooO00o = new WeakReference<>(t);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        T t = this.f44406OooO00o.get();
        if (t != null) {
            t.OooO0Oo(message);
        }
    }
}
