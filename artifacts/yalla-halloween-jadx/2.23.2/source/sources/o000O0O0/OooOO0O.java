package o000O0O0;

import android.media.MediaCodec;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import p080o000OoO.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    public static final ArrayDeque<OooO00o> f34194OooO0oO = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Object f34195OooO0oo = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MediaCodec f34196OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HandlerThread f34197OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooOO0 f34198OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicReference<RuntimeException> f34199OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f34200OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oo0o0Oo f34201OooO0o0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f34202OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f34203OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f34204OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f34205OooO0Oo = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f34206OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f34207OooO0o0;
    }

    public OooOO0O(MediaCodec mediaCodec, HandlerThread handlerThread) {
        oo0o0Oo oo0o0oo = new oo0o0Oo();
        this.f34196OooO00o = mediaCodec;
        this.f34197OooO0O0 = handlerThread;
        this.f34201OooO0o0 = oo0o0oo;
        this.f34199OooO0Oo = new AtomicReference<>();
    }

    public static void OooO0OO(OooO00o oooO00o) {
        ArrayDeque<OooO00o> arrayDeque = f34194OooO0oO;
        synchronized (arrayDeque) {
            arrayDeque.add(oooO00o);
        }
    }

    public final void OooO00o() {
        if (this.f34200OooO0o) {
            try {
                OooOO0 oooOO1 = this.f34198OooO0OO;
                oooOO1.getClass();
                oooOO1.removeCallbacksAndMessages(null);
                oo0o0Oo oo0o0oo = this.f34201OooO0o0;
                oo0o0oo.OooO0O0();
                OooOO0 oooOO2 = this.f34198OooO0OO;
                oooOO2.getClass();
                oooOO2.obtainMessage(2).sendToTarget();
                oo0o0oo.OooO00o();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void OooO0O0() {
        RuntimeException andSet = this.f34199OooO0Oo.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }
}
