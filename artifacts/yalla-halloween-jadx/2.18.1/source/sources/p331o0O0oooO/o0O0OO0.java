package p331o0O0oooO;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.internal.base.zaq;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import o00O00O.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0OO0 extends zaq {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zabi f37100OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OO0(zabi zabiVar, Looper looper) {
        super(looper);
        this.f37100OooO00o = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Lock lock;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                throw ((RuntimeException) message.obj);
            }
            OooO0OO.OooO0O0(31, "Unknown message id: ", i, "GACStateManager");
            return;
        }
        o0O0O0o0 o0o0o0o0 = (o0O0O0o0) message.obj;
        zabi zabiVar = this.f37100OooO00o;
        Objects.requireNonNull(o0o0o0o0);
        zabiVar.f15367OooO00o.lock();
        try {
            if (zabiVar.f15376OooOO0O != o0o0o0o0.f37099OooO00o) {
                lock = zabiVar.f15367OooO00o;
            } else {
                o0o0o0o0.OooO00o();
                lock = zabiVar.f15367OooO00o;
            }
            lock.unlock();
        } catch (Throwable th) {
            zabiVar.f15367OooO00o.unlock();
            throw th;
        }
    }
}
