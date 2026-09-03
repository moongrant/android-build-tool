package p254o00ooOO0;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.internal.base.zaq;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0oOO0 extends zaq {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zabi f41020OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(zabi zabiVar, Looper looper) {
        super(looper);
        this.f41020OooO00o = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Lock lock;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                throw ((RuntimeException) message.obj);
            }
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GACStateManager", sb.toString());
            return;
        }
        o00O0OOO o00o0ooo2 = (o00O0OOO) message.obj;
        zabi zabiVar = this.f41020OooO00o;
        o00o0ooo2.getClass();
        zabiVar.f14865OooO0Oo.lock();
        try {
            if (zabiVar.f14873OooOOO != o00o0ooo2.f40963OooO00o) {
                lock = zabiVar.f14865OooO0Oo;
            } else {
                o00o0ooo2.OooO00o();
                lock = zabiVar.f14865OooO0Oo;
            }
            lock.unlock();
        } catch (Throwable th) {
            zabiVar.f14865OooO0Oo.unlock();
            throw th;
        }
    }
}
