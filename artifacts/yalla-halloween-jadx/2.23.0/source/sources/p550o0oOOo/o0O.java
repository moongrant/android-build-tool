package p550o0oOOo;

import android.media.MediaCodec;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import p245o00oo0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(23)
@Deprecated
public final class o0O {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    public static final ArrayDeque<OooO00o> f55905OooO0oO = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Object f55906OooO0oo = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MediaCodec f55907OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HandlerThread f55908OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0O0oo00 f55909OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicReference<RuntimeException> f55910OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f55911OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00O0 f55912OooO0o0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f55913OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f55914OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f55915OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f55916OooO0Oo = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f55917OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f55918OooO0o0;
    }

    public o0O(MediaCodec mediaCodec, HandlerThread handlerThread) {
        o00O0 o00o1 = new o00O0();
        this.f55907OooO00o = mediaCodec;
        this.f55908OooO0O0 = handlerThread;
        this.f55912OooO0o0 = o00o1;
        this.f55910OooO0Oo = new AtomicReference<>();
    }

    public static void OooO0OO(OooO00o oooO00o) {
        ArrayDeque<OooO00o> arrayDeque = f55905OooO0oO;
        synchronized (arrayDeque) {
            arrayDeque.add(oooO00o);
        }
    }

    public final void OooO00o() {
        if (this.f55911OooO0o) {
            try {
                o0O0oo00 o0o0oo00 = this.f55909OooO0OO;
                o0o0oo00.getClass();
                o0o0oo00.removeCallbacksAndMessages(null);
                o00O0 o00o1 = this.f55912OooO0o0;
                o00o1.OooO00o();
                o0O0oo00 o0o0oo01 = this.f55909OooO0OO;
                o0o0oo01.getClass();
                o0o0oo01.obtainMessage(2).sendToTarget();
                synchronized (o00o1) {
                    while (!o00o1.f40556OooO00o) {
                        o00o1.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void OooO0O0() {
        RuntimeException andSet = this.f55910OooO0Oo.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }
}
