package p303o0O0o00o;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p294o0O0Oo0o.o0OO00O;
import p318o0O0oOo.o0000Ooo;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
public final class OooOO0O implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MediaCodec f36211OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HandlerThread f36212OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO00o f36213OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicReference<RuntimeException> f36214OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f36215OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000Ooo f36216OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f36217OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    public static final ArrayDeque<OooO0O0> f36210OooO0oo = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Object f36209OooO = new Object();

    public class OooO00o extends Handler {
        public OooO00o(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            OooO0O0 oooO0O0;
            OooOO0O oooOO0O = OooOO0O.this;
            Objects.requireNonNull(oooOO0O);
            int i = message.what;
            if (i == 0) {
                oooO0O0 = (OooO0O0) message.obj;
                try {
                    oooOO0O.f36211OooO00o.queueInputBuffer(oooO0O0.f36219OooO00o, oooO0O0.f36220OooO0O0, oooO0O0.f36221OooO0OO, oooO0O0.f36224OooO0o0, oooO0O0.f36223OooO0o);
                } catch (RuntimeException e) {
                    oooOO0O.OooO0oo(e);
                }
            } else if (i != 1) {
                if (i != 2) {
                    oooOO0O.OooO0oo(new IllegalStateException(String.valueOf(message.what)));
                } else {
                    oooOO0O.f36216OooO0o0.OooO0O0();
                }
                oooO0O0 = null;
            } else {
                oooO0O0 = (OooO0O0) message.obj;
                int i2 = oooO0O0.f36219OooO00o;
                int i3 = oooO0O0.f36220OooO0O0;
                MediaCodec.CryptoInfo cryptoInfo = oooO0O0.f36222OooO0Oo;
                long j = oooO0O0.f36224OooO0o0;
                int i4 = oooO0O0.f36223OooO0o;
                try {
                    if (oooOO0O.f36215OooO0o) {
                        synchronized (OooOO0O.f36209OooO) {
                            oooOO0O.f36211OooO00o.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                        }
                    } else {
                        oooOO0O.f36211OooO00o.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                    }
                } catch (RuntimeException e2) {
                    oooOO0O.OooO0oo(e2);
                }
            }
            if (oooO0O0 != null) {
                ArrayDeque<OooO0O0> arrayDeque = OooOO0O.f36210OooO0oo;
                synchronized (arrayDeque) {
                    arrayDeque.add(oooO0O0);
                }
            }
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f36219OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f36220OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f36221OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f36222OooO0Oo = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f36223OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f36224OooO0o0;
    }

    public OooOO0O(MediaCodec mediaCodec, int i) {
        StringBuilder sb = new StringBuilder("ExoPlayer:MediaCodecBufferEnqueuer:");
        boolean z = true;
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        HandlerThread handlerThread = new HandlerThread(sb.toString());
        o0000Ooo o0000ooo = new o0000Ooo();
        this.f36211OooO00o = mediaCodec;
        this.f36212OooO0O0 = handlerThread;
        this.f36216OooO0o0 = o0000ooo;
        this.f36214OooO0Oo = new AtomicReference<>();
        String strOooo0 = o000OOo0.Oooo0(o000OOo0.f36742OooO0OO);
        if (!strOooo0.contains("samsung") && !strOooo0.contains("motorola")) {
            z = false;
        }
        this.f36215OooO0o = z;
    }

    @Nullable
    public static byte[] OooO0OO(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    @Nullable
    public static int[] OooO0Oo(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static OooO0O0 OooO0o() {
        ArrayDeque<OooO0O0> arrayDeque = f36210OooO0oo;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new OooO0O0();
            }
            return arrayDeque.removeFirst();
        }
    }

    @Override // p303o0O0o00o.OooOo
    public final void OooO00o(int i, o0OO00O o0oo00o2, long j) {
        OooO0oO();
        OooO0O0 oooO0O0OooO0o = OooO0o();
        oooO0O0OooO0o.f36219OooO00o = i;
        oooO0O0OooO0o.f36220OooO0O0 = 0;
        oooO0O0OooO0o.f36221OooO0OO = 0;
        oooO0O0OooO0o.f36224OooO0o0 = j;
        oooO0O0OooO0o.f36223OooO0o = 0;
        MediaCodec.CryptoInfo cryptoInfo = oooO0O0OooO0o.f36222OooO0Oo;
        cryptoInfo.numSubSamples = o0oo00o2.f35842OooO0o;
        cryptoInfo.numBytesOfClearData = OooO0Oo(o0oo00o2.f35841OooO0Oo, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = OooO0Oo(o0oo00o2.f35843OooO0o0, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrOooO0OO = OooO0OO(o0oo00o2.f35839OooO0O0, cryptoInfo.key);
        Objects.requireNonNull(bArrOooO0OO);
        cryptoInfo.key = bArrOooO0OO;
        byte[] bArrOooO0OO2 = OooO0OO(o0oo00o2.f35838OooO00o, cryptoInfo.iv);
        Objects.requireNonNull(bArrOooO0OO2);
        cryptoInfo.iv = bArrOooO0OO2;
        cryptoInfo.mode = o0oo00o2.f35840OooO0OO;
        if (o000OOo0.f36740OooO00o >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(o0oo00o2.f35844OooO0oO, o0oo00o2.f35845OooO0oo));
        }
        this.f36213OooO0OO.obtainMessage(1, oooO0O0OooO0o).sendToTarget();
    }

    @Override // p303o0O0o00o.OooOo
    public final void OooO0O0(int i, int i2, long j, int i3) {
        OooO0oO();
        OooO0O0 oooO0O0OooO0o = OooO0o();
        oooO0O0OooO0o.f36219OooO00o = i;
        oooO0O0OooO0o.f36220OooO0O0 = 0;
        oooO0O0OooO0o.f36221OooO0OO = i2;
        oooO0O0OooO0o.f36224OooO0o0 = j;
        oooO0O0OooO0o.f36223OooO0o = i3;
        OooO00o oooO00o = this.f36213OooO0OO;
        int i4 = o000OOo0.f36740OooO00o;
        oooO00o.obtainMessage(0, oooO0O0OooO0o).sendToTarget();
    }

    public final void OooO0o0() throws InterruptedException {
        OooO00o oooO00o = this.f36213OooO0OO;
        int i = o000OOo0.f36740OooO00o;
        oooO00o.removeCallbacksAndMessages(null);
        this.f36216OooO0o0.OooO00o();
        oooO00o.obtainMessage(2).sendToTarget();
        o0000Ooo o0000ooo = this.f36216OooO0o0;
        synchronized (o0000ooo) {
            while (!o0000ooo.f36704OooO00o) {
                o0000ooo.wait();
            }
        }
        OooO0oO();
    }

    public final void OooO0oO() {
        RuntimeException andSet = this.f36214OooO0Oo.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @VisibleForTesting
    public final void OooO0oo(RuntimeException runtimeException) {
        this.f36214OooO0Oo.set(runtimeException);
    }

    @Override // p303o0O0o00o.OooOo
    public final void flush() {
        if (this.f36217OooO0oO) {
            try {
                OooO0o0();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // p303o0O0o00o.OooOo
    public final void shutdown() {
        if (this.f36217OooO0oO) {
            flush();
            this.f36212OooO0O0.quit();
        }
        this.f36217OooO0oO = false;
    }

    @Override // p303o0O0o00o.OooOo
    public final void start() {
        if (this.f36217OooO0oO) {
            return;
        }
        this.f36212OooO0O0.start();
        this.f36213OooO0OO = new OooO00o(this.f36212OooO0O0.getLooper());
        this.f36217OooO0oO = true;
    }
}
