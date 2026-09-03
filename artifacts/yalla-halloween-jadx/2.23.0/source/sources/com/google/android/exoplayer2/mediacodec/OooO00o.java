package com.google.android.exoplayer2.mediacodec;

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
import com.google.android.exoplayer2.mediacodec.OooO00o;
import com.google.common.base.o0O0O00;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;
import p042OooooO0.o00OOO00;
import p206o00o0oOO.o0oOOo;
import p245o00oo0o.o00O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;
import p245o00oo0o.o0O000;
import p247o00oo0oO.o00OO0OO;
import p550o0oOOo.o0O;
import p550o0oOOo.o0O0o0;
import p550o0oOOo.o0O0oo00;
import p550o0oOOo.o0OO000;
import p550o0oOOo.o0oOo0O0;
import p550o0oOOo.oo0ooO;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(23)
@Deprecated
public final class OooO00o implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MediaCodec f12506OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OO000 f12507OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O f12508OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f12509OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f12510OooO0o = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f12511OooO0o0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0206OooO00o implements OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0O0O00<HandlerThread> f12512OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0O0O00<HandlerThread> f12513OooO0O0;

        public C0206OooO00o(final int i) {
            o0O0O00<HandlerThread> o0o0o00 = new o0O0O00() { // from class: o0oOOo.o0O0o000
                @Override // com.google.common.base.o0O0O00
                public final Object get() {
                    return new HandlerThread(OooO00o.OooOOOo(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
                }
            };
            o0O0O00<HandlerThread> o0o0o01 = new o0O0O00() { // from class: o0oOOo.o0O0o00O
                @Override // com.google.common.base.o0O0O00
                public final Object get() {
                    return new HandlerThread(OooO00o.OooOOOo(i, "ExoPlayer:MediaCodecQueueingThread:"));
                }
            };
            this.f12512OooO00o = o0o0o00;
            this.f12513OooO0O0 = o0o0o01;
        }

        @Override // com.google.android.exoplayer2.mediacodec.OooO0OO.OooO0O0
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final OooO00o OooO00o(OooO0OO.OooO00o oooO00o) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            String str = oooO00o.f12514OooO00o.f12519OooO00o;
            OooO00o oooO00o2 = null;
            try {
                o0O000.OooO00o("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    OooO00o oooO00o3 = new OooO00o(mediaCodecCreateByCodecName, this.f12512OooO00o.get(), this.f12513OooO0O0.get(), false);
                    try {
                        o0O000.OooO0O0();
                        OooO00o.OooOOOO(oooO00o3, oooO00o.f12515OooO0O0, oooO00o.f12517OooO0Oo, oooO00o.f12518OooO0o0);
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
        this.f12506OooO00o = mediaCodec;
        this.f12507OooO0O0 = new o0OO000(handlerThread);
        this.f12508OooO0OO = new o0O(mediaCodec, handlerThread2);
        this.f12509OooO0Oo = z;
    }

    public static void OooOOOO(OooO00o oooO00o, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        o0OO000 o0oo000 = oooO00o.f12507OooO0O0;
        o00O000o.OooO0Oo(o0oo000.f55925OooO0OO == null);
        HandlerThread handlerThread = o0oo000.f55924OooO0O0;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = oooO00o.f12506OooO00o;
        mediaCodec.setCallback(o0oo000, handler);
        o0oo000.f55925OooO0OO = handler;
        o0O000.OooO00o("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        o0O000.OooO0O0();
        o0O o0o = oooO00o.f12508OooO0OO;
        if (!o0o.f55911OooO0o) {
            HandlerThread handlerThread2 = o0o.f55908OooO0O0;
            handlerThread2.start();
            o0o.f55909OooO0OO = new o0O0oo00(o0o, handlerThread2.getLooper());
            o0o.f55911OooO0o = true;
        }
        o0O000.OooO00o("startCodec");
        mediaCodec.start();
        o0O000.OooO0O0();
        oooO00o.f12510OooO0o = 1;
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

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void OooO(int i, long j) {
        this.f12506OooO00o.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final MediaFormat OooO00o() {
        MediaFormat mediaFormat;
        o0OO000 o0oo000 = this.f12507OooO0O0;
        synchronized (o0oo000.f55923OooO00o) {
            mediaFormat = o0oo000.f55930OooO0oo;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void OooO0O0(final OooO0OO.InterfaceC0207OooO0OO interfaceC0207OooO0OO, Handler handler) {
        OooOOo0();
        this.f12506OooO00o.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: o0oOOo.oo0OOoo
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.f55941OooO00o.getClass();
                o00OO0OO.OooO0OO oooO0OO = (o00OO0OO.OooO0OO) interfaceC0207OooO0OO;
                oooO0OO.getClass();
                if (o0O00.f40595OooO00o >= 30) {
                    oooO0OO.OooO00o(j);
                } else {
                    Handler handler2 = oooO0OO.f40792OooO0Oo;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void OooO0OO(int i) {
        OooOOo0();
        this.f12506OooO00o.setVideoScalingMode(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    @Nullable
    public final ByteBuffer OooO0Oo(int i) {
        return this.f12506OooO00o.getInputBuffer(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void OooO0o() {
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void OooO0o0(Surface surface) {
        OooOOo0();
        this.f12506OooO00o.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void OooO0oO(Bundle bundle) {
        OooOOo0();
        this.f12506OooO00o.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void OooO0oo(long j, int i, int i2, int i3) {
        o0O.OooO00o oooO00o;
        o0O o0o = this.f12508OooO0OO;
        o0o.OooO0O0();
        ArrayDeque<o0O.OooO00o> arrayDeque = o0O.f55905OooO0oO;
        synchronized (arrayDeque) {
            oooO00o = arrayDeque.isEmpty() ? new o0O.OooO00o() : arrayDeque.removeFirst();
        }
        oooO00o.f55913OooO00o = i;
        oooO00o.f55914OooO0O0 = 0;
        oooO00o.f55915OooO0OO = i2;
        oooO00o.f55918OooO0o0 = j;
        oooO00o.f55917OooO0o = i3;
        o0O0oo00 o0o0oo00 = o0o.f55909OooO0OO;
        int i4 = o0O00.f40595OooO00o;
        o0o0oo00.obtainMessage(0, oooO00o).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final int OooOO0() {
        int i;
        this.f12508OooO0OO.OooO0O0();
        o0OO000 o0oo000 = this.f12507OooO0O0;
        synchronized (o0oo000.f55923OooO00o) {
            i = -1;
            if (!(o0oo000.f55932OooOO0O > 0 || o0oo000.f55933OooOO0o)) {
                IllegalStateException illegalStateException = o0oo000.f55934OooOOO0;
                if (illegalStateException != null) {
                    o0oo000.f55934OooOOO0 = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = o0oo000.f55931OooOO0;
                if (codecException != null) {
                    o0oo000.f55931OooOO0 = null;
                    throw codecException;
                }
                oo0ooO oo0ooo = o0oo000.f55926OooO0Oo;
                int i2 = oo0ooo.f55948OooO0OO;
                if (!(i2 == 0)) {
                    if (i2 == 0) {
                        throw new NoSuchElementException();
                    }
                    int[] iArr = oo0ooo.f55949OooO0Oo;
                    int i3 = oo0ooo.f55946OooO00o;
                    int i4 = iArr[i3];
                    oo0ooo.f55946OooO00o = oo0ooo.f55950OooO0o0 & (i3 + 1);
                    oo0ooo.f55948OooO0OO = i2 - 1;
                    i = i4;
                }
            }
        }
        return i;
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final int OooOO0O(MediaCodec.BufferInfo bufferInfo) {
        this.f12508OooO0OO.OooO0O0();
        o0OO000 o0oo000 = this.f12507OooO0O0;
        synchronized (o0oo000.f55923OooO00o) {
            if (o0oo000.f55932OooOO0O > 0 || o0oo000.f55933OooOO0o) {
                return -1;
            }
            IllegalStateException illegalStateException = o0oo000.f55934OooOOO0;
            if (illegalStateException != null) {
                o0oo000.f55934OooOOO0 = null;
                throw illegalStateException;
            }
            MediaCodec.CodecException codecException = o0oo000.f55931OooOO0;
            if (codecException != null) {
                o0oo000.f55931OooOO0 = null;
                throw codecException;
            }
            oo0ooO oo0ooo = o0oo000.f55928OooO0o0;
            int i = oo0ooo.f55948OooO0OO;
            if (i == 0) {
                return -1;
            }
            if (i == 0) {
                throw new NoSuchElementException();
            }
            int[] iArr = oo0ooo.f55949OooO0Oo;
            int i2 = oo0ooo.f55946OooO00o;
            int i3 = iArr[i2];
            oo0ooo.f55946OooO00o = oo0ooo.f55950OooO0o0 & (i2 + 1);
            oo0ooo.f55948OooO0OO = i - 1;
            if (i3 >= 0) {
                o00O000o.OooO0o0(o0oo000.f55930OooO0oo);
                MediaCodec.BufferInfo bufferInfoRemove = o0oo000.f55927OooO0o.remove();
                bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
            } else if (i3 == -2) {
                o0oo000.f55930OooO0oo = o0oo000.f55929OooO0oO.remove();
            }
            return i3;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void OooOO0o(int i, o0oOOo o0oooo, long j) {
        o0O.OooO00o oooO00o;
        o0O o0o = this.f12508OooO0OO;
        o0o.OooO0O0();
        ArrayDeque<o0O.OooO00o> arrayDeque = o0O.f55905OooO0oO;
        synchronized (arrayDeque) {
            oooO00o = arrayDeque.isEmpty() ? new o0O.OooO00o() : arrayDeque.removeFirst();
        }
        oooO00o.f55913OooO00o = i;
        oooO00o.f55914OooO0O0 = 0;
        oooO00o.f55915OooO0OO = 0;
        oooO00o.f55918OooO0o0 = j;
        oooO00o.f55917OooO0o = 0;
        int i2 = o0oooo.f39430OooO0o;
        MediaCodec.CryptoInfo cryptoInfo = oooO00o.f55916OooO0Oo;
        cryptoInfo.numSubSamples = i2;
        int[] iArr = o0oooo.f39429OooO0Oo;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = o0oooo.f39431OooO0o0;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = o0oooo.f39427OooO0O0;
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
        byte[] bArr2 = o0oooo.f39426OooO00o;
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
        cryptoInfo.mode = o0oooo.f39428OooO0OO;
        if (o0O00.f40595OooO00o >= 24) {
            o0oOo0O0.OooO00o();
            cryptoInfo.setPattern(o0O0o0.OooO00o(o0oooo.f39432OooO0oO, o0oooo.f39433OooO0oo));
        }
        o0o.f55909OooO0OO.obtainMessage(1, oooO00o).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    @Nullable
    public final ByteBuffer OooOOO(int i) {
        return this.f12506OooO00o.getOutputBuffer(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void OooOOO0(int i, boolean z) {
        this.f12506OooO00o.releaseOutputBuffer(i, z);
    }

    public final void OooOOo0() {
        if (this.f12509OooO0Oo) {
            try {
                o0O o0o = this.f12508OooO0OO;
                o00O0 o00o1 = o0o.f55912OooO0o0;
                o00o1.OooO00o();
                o0O0oo00 o0o0oo00 = o0o.f55909OooO0OO;
                o0o0oo00.getClass();
                o0o0oo00.obtainMessage(2).sendToTarget();
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

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void flush() {
        this.f12508OooO0OO.OooO00o();
        this.f12506OooO00o.flush();
        o0OO000 o0oo000 = this.f12507OooO0O0;
        synchronized (o0oo000.f55923OooO00o) {
            o0oo000.f55932OooOO0O++;
            Handler handler = o0oo000.f55925OooO0OO;
            int i = o0O00.f40595OooO00o;
            handler.post(new o00OOO00(o0oo000, 1));
        }
        this.f12506OooO00o.start();
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void release() {
        try {
            if (this.f12510OooO0o == 1) {
                o0O o0o = this.f12508OooO0OO;
                if (o0o.f55911OooO0o) {
                    o0o.OooO00o();
                    o0o.f55908OooO0O0.quit();
                }
                o0o.f55911OooO0o = false;
                o0OO000 o0oo000 = this.f12507OooO0O0;
                synchronized (o0oo000.f55923OooO00o) {
                    o0oo000.f55933OooOO0o = true;
                    o0oo000.f55924OooO0O0.quit();
                    o0oo000.OooO00o();
                }
            }
            this.f12510OooO0o = 2;
            if (this.f12511OooO0o0) {
                return;
            }
            this.f12506OooO00o.release();
            this.f12511OooO0o0 = true;
        } catch (Throwable th) {
            if (!this.f12511OooO0o0) {
                this.f12506OooO00o.release();
                this.f12511OooO0o0 = true;
            }
            throw th;
        }
    }
}
