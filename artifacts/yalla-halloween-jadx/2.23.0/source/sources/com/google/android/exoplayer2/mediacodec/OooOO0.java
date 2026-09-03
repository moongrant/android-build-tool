package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.nio.ByteBuffer;
import p206o00o0oOO.o0oOOo;
import p245o00oo0o.o0O00;
import p245o00oo0o.o0O000;
import p247o00oo0oO.o00OO0OO;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOO0 implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MediaCodec f12527OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public ByteBuffer[] f12528OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public ByteBuffer[] f12529OooO0OO;

    public static class OooO00o implements OooO0OO.OooO0O0 {
        public static MediaCodec OooO0O0(OooO0OO.OooO00o oooO00o) throws IOException {
            oooO00o.f12514OooO00o.getClass();
            String str = oooO00o.f12514OooO00o.f12519OooO00o;
            o0O000.OooO00o("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            o0O000.OooO0O0();
            return mediaCodecCreateByCodecName;
        }
    }

    public OooOO0(MediaCodec mediaCodec) {
        this.f12527OooO00o = mediaCodec;
        if (o0O00.f40595OooO00o < 21) {
            this.f12528OooO0O0 = mediaCodec.getInputBuffers();
            this.f12529OooO0OO = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    @RequiresApi(21)
    public final void OooO(int i, long j) {
        this.f12527OooO00o.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final MediaFormat OooO00o() {
        return this.f12527OooO00o.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    @RequiresApi(23)
    public final void OooO0O0(final OooO0OO.InterfaceC0207OooO0OO interfaceC0207OooO0OO, Handler handler) {
        this.f12527OooO00o.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: o0oOOo.o0OOO0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.f55938OooO00o.getClass();
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
        this.f12527OooO00o.setVideoScalingMode(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    @Nullable
    public final ByteBuffer OooO0Oo(int i) {
        return o0O00.f40595OooO00o >= 21 ? this.f12527OooO00o.getInputBuffer(i) : this.f12528OooO0O0[i];
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void OooO0o() {
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    @RequiresApi(23)
    public final void OooO0o0(Surface surface) {
        this.f12527OooO00o.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    @RequiresApi(19)
    public final void OooO0oO(Bundle bundle) {
        this.f12527OooO00o.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void OooO0oo(long j, int i, int i2, int i3) {
        this.f12527OooO00o.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final int OooOO0() {
        return this.f12527OooO00o.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final int OooOO0O(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f12527OooO00o;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && o0O00.f40595OooO00o < 21) {
                this.f12529OooO0OO = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void OooOO0o(int i, o0oOOo o0oooo, long j) {
        this.f12527OooO00o.queueSecureInputBuffer(i, 0, o0oooo.f39425OooO, j, 0);
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    @Nullable
    public final ByteBuffer OooOOO(int i) {
        return o0O00.f40595OooO00o >= 21 ? this.f12527OooO00o.getOutputBuffer(i) : this.f12529OooO0OO[i];
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void OooOOO0(int i, boolean z) {
        this.f12527OooO00o.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void flush() {
        this.f12527OooO00o.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO
    public final void release() {
        this.f12528OooO0O0 = null;
        this.f12529OooO0OO = null;
        this.f12527OooO00o.release();
    }
}
