package o000O0O0;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends Handler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f34193OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooOO0O oooOO0O, Looper looper) {
        super(looper);
        this.f34193OooO00o = oooOO0O;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        OooOO0O oooOO0O = this.f34193OooO00o;
        oooOO0O.getClass();
        int i = message.what;
        OooOO0O.OooO00o oooO00o = null;
        if (i == 0) {
            OooOO0O.OooO00o oooO00o2 = (OooOO0O.OooO00o) message.obj;
            try {
                oooOO0O.f34196OooO00o.queueInputBuffer(oooO00o2.f34202OooO00o, oooO00o2.f34203OooO0O0, oooO00o2.f34204OooO0OO, oooO00o2.f34207OooO0o0, oooO00o2.f34206OooO0o);
            } catch (RuntimeException e) {
                AtomicReference<RuntimeException> atomicReference = oooOO0O.f34199OooO0Oo;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
            oooO00o = oooO00o2;
        } else if (i == 1) {
            OooOO0O.OooO00o oooO00o3 = (OooOO0O.OooO00o) message.obj;
            int i2 = oooO00o3.f34202OooO00o;
            int i3 = oooO00o3.f34203OooO0O0;
            MediaCodec.CryptoInfo cryptoInfo = oooO00o3.f34205OooO0Oo;
            long j = oooO00o3.f34207OooO0o0;
            int i4 = oooO00o3.f34206OooO0o;
            try {
                synchronized (OooOO0O.f34195OooO0oo) {
                    oooOO0O.f34196OooO00o.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                }
            } catch (RuntimeException e2) {
                AtomicReference<RuntimeException> atomicReference2 = oooOO0O.f34199OooO0Oo;
                while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                }
            }
            oooO00o = oooO00o3;
        } else if (i != 2) {
            AtomicReference<RuntimeException> atomicReference3 = oooOO0O.f34199OooO0Oo;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            oooOO0O.f34201OooO0o0.OooO0Oo();
        }
        if (oooO00o != null) {
            OooOO0O.OooO0OO(oooO00o);
        }
    }
}
