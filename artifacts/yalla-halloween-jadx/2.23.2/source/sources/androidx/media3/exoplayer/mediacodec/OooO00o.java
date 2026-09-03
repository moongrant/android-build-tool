package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.o000O;
import com.google.common.base.o000OOo;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;
import o000O0O0.OooOO0O;
import o000O0O0.OooOOO0;
import o000O0O0.OooOo00;
import p080o000OoO.o00;
import p080o000OoO.o000OO0O;
import p080o000OoO.o00Oo0;
import p080o000OoO.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
public final class OooO00o implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MediaCodec f7741OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO0 f7742OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0O f7743OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f7744OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f7745OooO0o = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f7746OooO0o0;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.mediacodec.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0148OooO00o implements OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000OOo<HandlerThread> f7747OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000OOo<HandlerThread> f7748OooO0O0;

        public C0148OooO00o(final int i) {
            o000OOo<HandlerThread> o000ooo2 = new o000OOo() { // from class: o000O0O0.OooO0O0
                @Override // com.google.common.base.o000OOo
                public final Object get() {
                    return new HandlerThread(androidx.media3.exoplayer.mediacodec.OooO00o.OooOOOo(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
                }
            };
            o000OOo<HandlerThread> o000ooo3 = new o000OOo() { // from class: o000O0O0.OooO0OO
                @Override // com.google.common.base.o000OOo
                public final Object get() {
                    return new HandlerThread(androidx.media3.exoplayer.mediacodec.OooO00o.OooOOOo(i, "ExoPlayer:MediaCodecQueueingThread:"));
                }
            };
            this.f7747OooO00o = o000ooo2;
            this.f7748OooO0O0 = o000ooo3;
        }

        @Override // androidx.media3.exoplayer.mediacodec.OooO0OO.OooO0O0
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final OooO00o OooO00o(OooO0OO.OooO00o oooO00o) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            String str = oooO00o.f7749OooO00o.f7754OooO00o;
            OooO00o oooO00o2 = null;
            try {
                o000OO0O.OooO00o("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    OooO00o oooO00o3 = new OooO00o(mediaCodecCreateByCodecName, this.f7747OooO00o.get(), this.f7748OooO0O0.get(), false);
                    try {
                        o000OO0O.OooO0O0();
                        OooO00o.OooOOOO(oooO00o3, oooO00o.f7750OooO0O0, oooO00o.f7752OooO0Oo, oooO00o.f7753OooO0o0);
                        return oooO00o3;
                    } catch (Exception e) {
                        e = e;
                        oooO00o2 = oooO00o3;
                        if (oooO00o2 != null) {
                            oooO00o2.release();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    public OooO00o(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.f7741OooO00o = mediaCodec;
        this.f7742OooO0O0 = new OooOOO0(handlerThread);
        this.f7743OooO0OO = new OooOO0O(mediaCodec, handlerThread2);
        this.f7744OooO0Oo = z;
    }

    public static void OooOOOO(OooO00o oooO00o, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        OooOOO0 oooOOO0 = oooO00o.f7742OooO0O0;
        o00Oo0.OooO0Oo(oooOOO0.f34214OooO0OO == null);
        HandlerThread handlerThread = oooOOO0.f34213OooO0O0;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = oooO00o.f7741OooO00o;
        mediaCodec.setCallback(oooOOO0, handler);
        oooOOO0.f34214OooO0OO = handler;
        o000OO0O.OooO00o("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        o000OO0O.OooO0O0();
        OooOO0O oooOO0O = oooO00o.f7743OooO0OO;
        if (!oooOO0O.f34200OooO0o) {
            HandlerThread handlerThread2 = oooOO0O.f34197OooO0O0;
            handlerThread2.start();
            oooOO0O.f34198OooO0OO = new o000O0O0.OooOO0(oooOO0O, handlerThread2.getLooper());
            oooOO0O.f34200OooO0o = true;
        }
        o000OO0O.OooO00o("startCodec");
        mediaCodec.start();
        o000OO0O.OooO0O0();
        oooO00o.f7745OooO0o = 1;
    }

    public static String OooOOOo(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void OooO(long j, int i, int i2, int i3) {
        OooOO0O.OooO00o oooO00o;
        OooOO0O oooOO0O = this.f7743OooO0OO;
        oooOO0O.OooO0O0();
        ArrayDeque<OooOO0O.OooO00o> arrayDeque = OooOO0O.f34194OooO0oO;
        synchronized (arrayDeque) {
            oooO00o = arrayDeque.isEmpty() ? new OooOO0O.OooO00o() : arrayDeque.removeFirst();
        }
        oooO00o.f34202OooO00o = i;
        oooO00o.f34203OooO0O0 = 0;
        oooO00o.f34204OooO0OO = i2;
        oooO00o.f34207OooO0o0 = j;
        oooO00o.f34206OooO0o = i3;
        o000O0O0.OooOO0 oooOO1 = oooOO0O.f34198OooO0OO;
        int i4 = o00.f34910OooO00o;
        oooOO1.obtainMessage(0, oooO00o).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void OooO00o(final OooO0OO.InterfaceC0149OooO0OO interfaceC0149OooO0OO, Handler handler) {
        OooOOo0();
        this.f7741OooO00o.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: o000O0O0.OooO00o
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.f34189OooO00o.getClass();
                o000OOO.OooO.OooO0OO oooO0OO = (o000OOO.OooO.OooO0OO) interfaceC0149OooO0OO;
                oooO0OO.getClass();
                if (o00.f34910OooO00o >= 30) {
                    oooO0OO.OooO00o(j);
                } else {
                    Handler handler2 = oooO0OO.f34516OooO0Oo;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final MediaFormat OooO0O0() {
        MediaFormat mediaFormat;
        OooOOO0 oooOOO0 = this.f7742OooO0O0;
        synchronized (oooOOO0.f34212OooO00o) {
            mediaFormat = oooOOO0.f34219OooO0oo;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void OooO0OO(int i) {
        OooOOo0();
        this.f7741OooO00o.setVideoScalingMode(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    @Nullable
    public final ByteBuffer OooO0Oo(int i) {
        return this.f7741OooO00o.getInputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void OooO0o() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void OooO0o0(Surface surface) {
        OooOOo0();
        this.f7741OooO00o.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void OooO0oO(int i, o000O00.OooO oooO, long j) {
        OooOO0O.OooO00o oooO00o;
        OooOO0O oooOO0O = this.f7743OooO0OO;
        oooOO0O.OooO0O0();
        ArrayDeque<OooOO0O.OooO00o> arrayDeque = OooOO0O.f34194OooO0oO;
        synchronized (arrayDeque) {
            oooO00o = arrayDeque.isEmpty() ? new OooOO0O.OooO00o() : arrayDeque.removeFirst();
        }
        oooO00o.f34202OooO00o = i;
        oooO00o.f34203OooO0O0 = 0;
        oooO00o.f34204OooO0OO = 0;
        oooO00o.f34207OooO0o0 = j;
        oooO00o.f34206OooO0o = 0;
        int i2 = oooO.f33924OooO0o;
        MediaCodec.CryptoInfo cryptoInfo = oooO00o.f34205OooO0Oo;
        cryptoInfo.numSubSamples = i2;
        int[] iArr = oooO.f33923OooO0Oo;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = oooO.f33925OooO0o0;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = oooO.f33921OooO0O0;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = oooO.f33920OooO00o;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = oooO.f33922OooO0OO;
        if (o00.f34910OooO00o >= 24) {
            o000O0O0.OooO.OooO00o();
            cryptoInfo.setPattern(o000O0O0.OooO0o.OooO00o(oooO.f33926OooO0oO, oooO.f33927OooO0oo));
        }
        oooOO0O.f34198OooO0OO.obtainMessage(1, oooO00o).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void OooO0oo(Bundle bundle) {
        OooOOo0();
        this.f7741OooO00o.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void OooOO0(int i, long j) {
        this.f7741OooO00o.releaseOutputBuffer(i, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final int OooOO0O() {
        int i;
        this.f7743OooO0OO.OooO0O0();
        OooOOO0 oooOOO0 = this.f7742OooO0O0;
        synchronized (oooOOO0.f34212OooO00o) {
            IllegalStateException illegalStateException = oooOOO0.f34223OooOOO0;
            if (illegalStateException != null) {
                oooOOO0.f34223OooOOO0 = null;
                throw illegalStateException;
            }
            MediaCodec.CodecException codecException = oooOOO0.f34220OooOO0;
            if (codecException != null) {
                oooOOO0.f34220OooOO0 = null;
                throw codecException;
            }
            i = -1;
            if (!(oooOOO0.f34221OooOO0O > 0 || oooOOO0.f34222OooOO0o)) {
                OooOo00 oooOo00 = oooOOO0.f34215OooO0Oo;
                int i2 = oooOo00.f34229OooO0OO;
                if (!(i2 == 0)) {
                    if (i2 == 0) {
                        throw new NoSuchElementException();
                    }
                    int[] iArr = oooOo00.f34230OooO0Oo;
                    int i3 = oooOo00.f34227OooO00o;
                    int i4 = iArr[i3];
                    oooOo00.f34227OooO00o = oooOo00.f34231OooO0o0 & (i3 + 1);
                    oooOo00.f34229OooO0OO = i2 - 1;
                    i = i4;
                }
            }
        }
        return i;
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final int OooOO0o(MediaCodec.BufferInfo bufferInfo) {
        this.f7743OooO0OO.OooO0O0();
        OooOOO0 oooOOO0 = this.f7742OooO0O0;
        synchronized (oooOOO0.f34212OooO00o) {
            IllegalStateException illegalStateException = oooOOO0.f34223OooOOO0;
            if (illegalStateException != null) {
                oooOOO0.f34223OooOOO0 = null;
                throw illegalStateException;
            }
            MediaCodec.CodecException codecException = oooOOO0.f34220OooOO0;
            if (codecException != null) {
                oooOOO0.f34220OooOO0 = null;
                throw codecException;
            }
            if (oooOOO0.f34221OooOO0O > 0 || oooOOO0.f34222OooOO0o) {
                return -1;
            }
            OooOo00 oooOo00 = oooOOO0.f34217OooO0o0;
            int i = oooOo00.f34229OooO0OO;
            if (i == 0) {
                return -1;
            }
            if (i == 0) {
                throw new NoSuchElementException();
            }
            int[] iArr = oooOo00.f34230OooO0Oo;
            int i2 = oooOo00.f34227OooO00o;
            int i3 = iArr[i2];
            oooOo00.f34227OooO00o = oooOo00.f34231OooO0o0 & (i2 + 1);
            oooOo00.f34229OooO0OO = i - 1;
            if (i3 >= 0) {
                o00Oo0.OooO0o(oooOOO0.f34219OooO0oo);
                MediaCodec.BufferInfo bufferInfoRemove = oooOOO0.f34216OooO0o.remove();
                bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
            } else if (i3 == -2) {
                oooOOO0.f34219OooO0oo = oooOOO0.f34218OooO0oO.remove();
            }
            return i3;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    @Nullable
    public final ByteBuffer OooOOO(int i) {
        return this.f7741OooO00o.getOutputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void OooOOO0(int i, boolean z) {
        this.f7741OooO00o.releaseOutputBuffer(i, z);
    }

    public final void OooOOo0() {
        if (this.f7744OooO0Oo) {
            try {
                OooOO0O oooOO0O = this.f7743OooO0OO;
                oo0o0Oo oo0o0oo = oooOO0O.f34201OooO0o0;
                oo0o0oo.OooO0O0();
                o000O0O0.OooOO0 oooOO1 = oooOO0O.f34198OooO0OO;
                oooOO1.getClass();
                oooOO1.obtainMessage(2).sendToTarget();
                oo0o0oo.OooO00o();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void flush() {
        this.f7743OooO0OO.OooO00o();
        this.f7741OooO00o.flush();
        OooOOO0 oooOOO0 = this.f7742OooO0O0;
        synchronized (oooOOO0.f34212OooO00o) {
            oooOOO0.f34221OooOO0O++;
            Handler handler = oooOOO0.f34214OooO0OO;
            int i = o00.f34910OooO00o;
            handler.post(new o000O(oooOOO0, 1));
        }
        this.f7741OooO00o.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void release() {
        try {
            if (this.f7745OooO0o == 1) {
                OooOO0O oooOO0O = this.f7743OooO0OO;
                if (oooOO0O.f34200OooO0o) {
                    oooOO0O.OooO00o();
                    oooOO0O.f34197OooO0O0.quit();
                }
                oooOO0O.f34200OooO0o = false;
                OooOOO0 oooOOO0 = this.f7742OooO0O0;
                synchronized (oooOOO0.f34212OooO00o) {
                    oooOOO0.f34222OooOO0o = true;
                    oooOOO0.f34213OooO0O0.quit();
                    oooOOO0.OooO00o();
                }
            }
            this.f7745OooO0o = 2;
            if (this.f7746OooO0o0) {
                return;
            }
            this.f7741OooO00o.release();
            this.f7746OooO0o0 = true;
        } catch (Throwable th) {
            if (!this.f7746OooO0o0) {
                this.f7741OooO00o.release();
                this.f7746OooO0o0 = true;
            }
            throw th;
        }
    }
}
