package p615o0oo0o0o;

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.media.OooO00o;
import android.view.Surface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p059o0000o.o000000;
import p607o0oo0OOo.m1;
import p608o0oo0Oo.o00000O0;
import p608o0oo0Oo.o0000oo;
import p609o0oo0OoO.p1;
import p614o0oo0o0O.o000O0O0;

/* JADX INFO: loaded from: classes5.dex */
public final class oOO00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f57053OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final m1 f57054OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public MediaExtractor f57055OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public MediaCodec f57056OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public AudioTrack f57057OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f57058OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0000oo f57059OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f57060OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f57061OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f57062OooOO0;

    public oOO00O(@NotNull m1 playerEva) {
        Intrinsics.checkNotNullParameter(playerEva, "playerEva");
        this.f57054OooO00o = playerEva;
        this.f57059OooO0o0 = new o0000oo();
    }

    public final void OooO00o() {
        if (this.f57054OooO00o.f56954OooOOO) {
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AudioPlayer", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("destroyThread", "msg");
            o0000oo o0000ooVar = this.f57059OooO0o0;
            Handler handler = o0000ooVar.f56994OooO0O0;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = o0000ooVar.f56993OooO00o;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            o0000ooVar.f56993OooO00o = null;
        }
    }

    public final void OooO0O0() {
        try {
            MediaCodec mediaCodec = this.f57056OooO0OO;
            if (mediaCodec != null) {
                mediaCodec.stop();
                mediaCodec.release();
            }
            this.f57056OooO0OO = null;
            MediaExtractor mediaExtractor = this.f57055OooO0O0;
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
            this.f57055OooO0O0 = null;
            AudioTrack audioTrack = this.f57057OooO0Oo;
            if (audioTrack != null) {
                audioTrack.pause();
                audioTrack.flush();
                audioTrack.stop();
                audioTrack.release();
            }
            this.f57057OooO0Oo = null;
        } catch (Throwable tr) {
            String msg = "release exception=" + tr;
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AudioPlayer", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter(msg, "msg");
            Intrinsics.checkNotNullParameter(tr, "tr");
        }
        this.f57058OooO0o = false;
        if (this.f57053OooO) {
            OooO00o();
        }
    }

    public final void OooO0OO(@NotNull p1 evaFileContainer) {
        Intrinsics.checkNotNullParameter(evaFileContainer, "evaFileContainer");
        this.f57061OooO0oo = false;
        this.f57053OooO = false;
        o0000oo o0000ooVar = this.f57059OooO0o0;
        if (o00000O0.OooO00o.OooO00o(o0000ooVar, "anim_audio_thread")) {
            if (this.f57058OooO0o) {
                this.f57061OooO0oo = true;
            }
            this.f57058OooO0o = true;
            Handler handler = o0000ooVar.f56994OooO0O0;
            if (handler != null) {
                handler.post(new o000000(2, this, evaFileContainer));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:72:0x0209  */
    /* JADX WARN: Code duplicated, block: B:78:0x021a  */
    /* JADX WARN: Code duplicated, block: B:89:0x022b A[SYNTHETIC] */
    public final void OooO0Oo(p1 evaFile) throws IOException {
        int i;
        long j;
        MediaCodec.BufferInfo bufferInfo;
        int iDequeueOutputBuffer;
        boolean z;
        int i2;
        int iDequeueInputBuffer;
        long j2;
        o000O0O0 o000o0o1 = o000O0O0.f57020OooO00o;
        Intrinsics.checkNotNullParameter(evaFile, "evaFile");
        MediaExtractor extractor = new MediaExtractor();
        evaFile.OooO0OO(extractor);
        this.f57055OooO0O0 = extractor;
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        int trackCount = extractor.getTrackCount();
        int i3 = 0;
        while (true) {
            if (i3 >= trackCount) {
                i3 = -1;
                break;
            }
            MediaFormat trackFormat = extractor.getTrackFormat(i3);
            Intrinsics.checkNotNullExpressionValue(trackFormat, "extractor.getTrackFormat(i)");
            String string = trackFormat.getString("mime");
            if (string == null) {
                string = "";
            }
            if (StringsKt.Oooo00o(string, "audio/")) {
                String msg = "Extractor selected track " + i3 + " (" + string + "): " + trackFormat;
                Intrinsics.checkNotNullParameter("EvaAnimPlayer.MediaUtil", ViewHierarchyConstants.TAG_KEY);
                Intrinsics.checkNotNullParameter(msg, "msg");
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AudioPlayer", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("cannot find audio track", "msg");
            OooO0O0();
            return;
        }
        extractor.selectTrack(i3);
        MediaFormat trackFormat2 = extractor.getTrackFormat(i3);
        Intrinsics.checkNotNullExpressionValue(trackFormat2, "extractor.getTrackFormat(audioIndex)");
        String string2 = trackFormat2.getString("mime");
        String str = string2 != null ? string2 : "";
        String msg2 = "audio mime=".concat(str);
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AudioPlayer", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg2, "msg");
        if (!o000O0O0.f57020OooO00o.OooO00o(str)) {
            String msg3 = "mime=" + str + " not support";
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AudioPlayer", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter(msg3, "msg");
            OooO0O0();
            return;
        }
        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(str);
        mediaCodecCreateDecoderByType.configure(trackFormat2, (Surface) null, (MediaCrypto) null, 0);
        m1 m1Var = this.f57054OooO00o;
        if (m1Var.f56960OooOOoo > 0) {
            do {
                j2 = m1Var.f56963OooOo00;
            } while (j2 == 0);
            extractor.seekTo(j2, 2);
            String msg4 = "startPoint " + m1Var.f56960OooOOoo + ", sampleTime：" + extractor.getSampleTime();
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AudioPlayer", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter(msg4, "msg");
            extractor.advance();
        }
        mediaCodecCreateDecoderByType.start();
        Intrinsics.checkNotNullExpressionValue(mediaCodecCreateDecoderByType, "createDecoderByType(mime…        start()\n        }");
        this.f57056OooO0OO = mediaCodecCreateDecoderByType;
        ByteBuffer[] inputBuffers = mediaCodecCreateDecoderByType.getInputBuffers();
        Intrinsics.checkNotNullExpressionValue(inputBuffers, "decoder.inputBuffers");
        ByteBuffer[] outputBuffers = mediaCodecCreateDecoderByType.getOutputBuffers();
        String str2 = "decoder.outputBuffers";
        Intrinsics.checkNotNullExpressionValue(outputBuffers, "decoder.outputBuffers");
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        int integer = trackFormat2.getInteger("sample-rate");
        int integer2 = trackFormat2.getInteger("channel-count");
        switch (integer2) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 12;
                break;
            case 3:
                i = 28;
                break;
            case 4:
                i = 204;
                break;
            case 5:
                i = 220;
                break;
            case 6:
                i = 252;
                break;
            case 7:
                i = 1276;
                break;
            default:
                throw new RuntimeException(OooO00o.OooO00o("Unsupported channel count: ", integer2));
        }
        float f = m1Var.f56951OooOO0;
        if (!(f == 1.0f)) {
            integer = (int) (integer * f);
        }
        AudioTrack audioTrack = new AudioTrack(3, integer, i, 2, AudioTrack.getMinBufferSize(integer, i, 2), 1);
        this.f57057OooO0Oo = audioTrack;
        if (audioTrack.getState() != 1) {
            OooO0O0();
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AudioPlayer", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("init audio track failure", "msg");
            return;
        }
        audioTrack.play();
        boolean z2 = false;
        ByteBuffer[] byteBufferArr = outputBuffers;
        while (!this.f57061OooO0oo) {
            if (!this.f57062OooOO0) {
                if (!z2 && (iDequeueInputBuffer = mediaCodecCreateDecoderByType.dequeueInputBuffer(1000L)) >= 0) {
                    ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
                    byteBuffer.clear();
                    int sampleData = extractor.readSampleData(byteBuffer, 0);
                    if (sampleData < 0) {
                        bufferInfo2 = bufferInfo2;
                        inputBuffers = inputBuffers;
                        str2 = str2;
                        mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                        j = 0;
                        z2 = true;
                    } else {
                        mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, 0L, 0);
                        extractor.advance();
                    }
                    bufferInfo = bufferInfo2;
                    iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, j);
                    if (iDequeueOutputBuffer == -2) {
                        ByteBuffer[] outputBuffers2 = mediaCodecCreateDecoderByType.getOutputBuffers();
                        Intrinsics.checkNotNullExpressionValue(outputBuffers2, str2);
                        byteBufferArr = outputBuffers2;
                    }
                    if (iDequeueOutputBuffer >= 0) {
                        ByteBuffer byteBuffer2 = byteBufferArr[iDequeueOutputBuffer];
                        byte[] bArr = new byte[bufferInfo.size];
                        byteBuffer2.get(bArr);
                        byteBuffer2.clear();
                        z = false;
                        audioTrack.write(bArr, 0, bufferInfo.size);
                        mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    } else {
                        z = false;
                    }
                    if (z2 && (bufferInfo.flags & 4) != 0) {
                        i2 = this.f57060OooO0oO - 1;
                        this.f57060OooO0oO = i2;
                        if (i2 > 0) {
                            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AudioPlayer", ViewHierarchyConstants.TAG_KEY);
                            Intrinsics.checkNotNullParameter("decode finish", "msg");
                            OooO0O0();
                            OooO0O0();
                        }
                        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AudioPlayer", ViewHierarchyConstants.TAG_KEY);
                        Intrinsics.checkNotNullParameter("Reached EOS, looping -> playLoop", "msg");
                        extractor.seekTo(j, 2);
                        mediaCodecCreateDecoderByType.flush();
                        z2 = z;
                    }
                    str2 = str2;
                    bufferInfo2 = bufferInfo;
                    inputBuffers = inputBuffers;
                }
                j = 0;
                bufferInfo = bufferInfo2;
                iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, j);
                if (iDequeueOutputBuffer == -2) {
                    ByteBuffer[] outputBuffers3 = mediaCodecCreateDecoderByType.getOutputBuffers();
                    Intrinsics.checkNotNullExpressionValue(outputBuffers3, str2);
                    byteBufferArr = outputBuffers3;
                }
                if (iDequeueOutputBuffer >= 0) {
                    ByteBuffer byteBuffer3 = byteBufferArr[iDequeueOutputBuffer];
                    byte[] bArr2 = new byte[bufferInfo.size];
                    byteBuffer3.get(bArr2);
                    byteBuffer3.clear();
                    z = false;
                    audioTrack.write(bArr2, 0, bufferInfo.size);
                    mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                } else {
                    z = false;
                }
                if (z2) {
                    i2 = this.f57060OooO0oO - 1;
                    this.f57060OooO0oO = i2;
                    if (i2 > 0) {
                        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AudioPlayer", ViewHierarchyConstants.TAG_KEY);
                        Intrinsics.checkNotNullParameter("decode finish", "msg");
                        OooO0O0();
                        OooO0O0();
                    }
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.AudioPlayer", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter("Reached EOS, looping -> playLoop", "msg");
                    extractor.seekTo(j, 2);
                    mediaCodecCreateDecoderByType.flush();
                    z2 = z;
                }
                str2 = str2;
                bufferInfo2 = bufferInfo;
                inputBuffers = inputBuffers;
            }
        }
        OooO0O0();
    }
}
