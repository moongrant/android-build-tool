package p550o0oOOo;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0oo00 extends Handler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O f55921OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo00(o0O o0o, Looper looper) {
        super(looper);
        this.f55921OooO00o = o0o;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        o0O o0o = this.f55921OooO00o;
        o0o.getClass();
        int i = message.what;
        o0O.OooO00o oooO00o = null;
        if (i == 0) {
            o0O.OooO00o oooO00o2 = (o0O.OooO00o) message.obj;
            try {
                o0o.f55907OooO00o.queueInputBuffer(oooO00o2.f55913OooO00o, oooO00o2.f55914OooO0O0, oooO00o2.f55915OooO0OO, oooO00o2.f55918OooO0o0, oooO00o2.f55917OooO0o);
            } catch (RuntimeException e) {
                AtomicReference<RuntimeException> atomicReference = o0o.f55910OooO0Oo;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
            oooO00o = oooO00o2;
        } else if (i == 1) {
            o0O.OooO00o oooO00o3 = (o0O.OooO00o) message.obj;
            int i2 = oooO00o3.f55913OooO00o;
            int i3 = oooO00o3.f55914OooO0O0;
            MediaCodec.CryptoInfo cryptoInfo = oooO00o3.f55916OooO0Oo;
            long j = oooO00o3.f55918OooO0o0;
            int i4 = oooO00o3.f55917OooO0o;
            try {
                synchronized (o0O.f55906OooO0oo) {
                    o0o.f55907OooO00o.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                }
            } catch (RuntimeException e2) {
                AtomicReference<RuntimeException> atomicReference2 = o0o.f55910OooO0Oo;
                while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                }
            }
            oooO00o = oooO00o3;
        } else if (i != 2) {
            AtomicReference<RuntimeException> atomicReference3 = o0o.f55910OooO0Oo;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            o0o.f55912OooO0o0.OooO0O0();
        }
        if (oooO00o != null) {
            o0O.OooO0OO(oooO00o);
        }
    }
}
