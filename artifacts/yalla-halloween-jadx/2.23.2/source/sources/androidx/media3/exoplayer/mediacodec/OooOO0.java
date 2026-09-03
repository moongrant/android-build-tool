package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.nio.ByteBuffer;
import p080o000OoO.o00;
import p080o000OoO.o000OO0O;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOO0 implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MediaCodec f7762OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public ByteBuffer[] f7763OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public ByteBuffer[] f7764OooO0OO;

    public static class OooO00o implements OooO0OO.OooO0O0 {
        public static MediaCodec OooO0O0(OooO0OO.OooO00o oooO00o) throws IOException {
            oooO00o.f7749OooO00o.getClass();
            String str = oooO00o.f7749OooO00o.f7754OooO00o;
            o000OO0O.OooO00o("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            o000OO0O.OooO0O0();
            return mediaCodecCreateByCodecName;
        }
    }

    public OooOO0(MediaCodec mediaCodec) {
        this.f7762OooO00o = mediaCodec;
        if (o00.f34910OooO00o < 21) {
            this.f7763OooO0O0 = mediaCodec.getInputBuffers();
            this.f7764OooO0OO = mediaCodec.getOutputBuffers();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void OooO(long j, int i, int i2, int i3) {
        this.f7762OooO00o.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    @RequiresApi(23)
    public final void OooO00o(final OooO0OO.InterfaceC0149OooO0OO interfaceC0149OooO0OO, Handler handler) {
        this.f7762OooO00o.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: o000O0O0.o00O0O
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.f34234OooO00o.getClass();
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
        return this.f7762OooO00o.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void OooO0OO(int i) {
        this.f7762OooO00o.setVideoScalingMode(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    @Nullable
    public final ByteBuffer OooO0Oo(int i) {
        return o00.f34910OooO00o >= 21 ? this.f7762OooO00o.getInputBuffer(i) : this.f7763OooO0O0[i];
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void OooO0o() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    @RequiresApi(23)
    public final void OooO0o0(Surface surface) {
        this.f7762OooO00o.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void OooO0oO(int i, o000O00.OooO oooO, long j) {
        this.f7762OooO00o.queueSecureInputBuffer(i, 0, oooO.f33919OooO, j, 0);
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    @RequiresApi(19)
    public final void OooO0oo(Bundle bundle) {
        this.f7762OooO00o.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    @RequiresApi(21)
    public final void OooOO0(int i, long j) {
        this.f7762OooO00o.releaseOutputBuffer(i, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final int OooOO0O() {
        return this.f7762OooO00o.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final int OooOO0o(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f7762OooO00o;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && o00.f34910OooO00o < 21) {
                this.f7764OooO0OO = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    @Nullable
    public final ByteBuffer OooOOO(int i) {
        return o00.f34910OooO00o >= 21 ? this.f7762OooO00o.getOutputBuffer(i) : this.f7764OooO0OO[i];
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void OooOOO0(int i, boolean z) {
        this.f7762OooO00o.releaseOutputBuffer(i, z);
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void flush() {
        this.f7762OooO00o.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO
    public final void release() {
        this.f7763OooO0O0 = null;
        this.f7764OooO0OO = null;
        this.f7762OooO00o.release();
    }
}
