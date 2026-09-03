package p331o0O0oooO;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.internal.base.zaq;
import o00O00O.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0oo0o extends zaq {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zabe f37114OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo0o(zabe zabeVar, Looper looper) {
        super(looper);
        this.f37114OooO00o = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                OooO0OO.OooO0O0(31, "Unknown message id: ", i, "GoogleApiClientImpl");
                return;
            } else {
                zabe.OooO0OO(this.f37114OooO00o);
                return;
            }
        }
        zabe zabeVar = this.f37114OooO00o;
        zabeVar.f15343OooO0O0.lock();
        try {
            if (zabeVar.OooO0Oo()) {
                zabeVar.OooO0o();
            }
        } finally {
            zabeVar.f15343OooO0O0.unlock();
        }
    }
}
