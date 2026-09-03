package p256o00ooOO0;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.internal.base.zaq;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO000 extends zaq {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zabi f40291OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(zabi zabiVar, Looper looper) {
        super(looper);
        this.f40291OooO00o = zabiVar;
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
        o00O o00o2 = (o00O) message.obj;
        zabi zabiVar = this.f40291OooO00o;
        o00o2.getClass();
        zabiVar.f14389OooO0Oo.lock();
        try {
            if (zabiVar.f14397OooOOO != o00o2.f40263OooO00o) {
                lock = zabiVar.f14389OooO0Oo;
            } else {
                o00o2.OooO00o();
                lock = zabiVar.f14389OooO0Oo;
            }
            lock.unlock();
        } catch (Throwable th) {
            zabiVar.f14389OooO0Oo.unlock();
            throw th;
        }
    }
}
