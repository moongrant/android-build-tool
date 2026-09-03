package p256o00ooOO0;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.internal.base.zaq;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OOO extends zaq {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zabe f40288OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(zabe zabeVar, Looper looper) {
        super(looper);
        this.f40288OooO00o = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        zabe zabeVar = this.f40288OooO00o;
        if (i == 1) {
            Lock lock = zabeVar.f14366OooO0O0;
            lock.lock();
            try {
                if (zabeVar.OooO0O0()) {
                    zabeVar.OooO0Oo();
                }
                return;
            } finally {
                lock.unlock();
            }
        }
        if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GoogleApiClientImpl", sb.toString());
            return;
        }
        zabeVar.f14366OooO0O0.lock();
        try {
            if (zabeVar.f14365OooO) {
                zabeVar.OooO0Oo();
            }
        } finally {
            zabeVar.f14366OooO0O0.unlock();
        }
    }
}
