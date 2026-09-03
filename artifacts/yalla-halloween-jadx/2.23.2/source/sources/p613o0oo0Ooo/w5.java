package p613o0oo0Ooo;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.compose.compiler.plugins.kotlin.lower.OooO0O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.util.EvaJniUtil;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.DurationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045Oooooo.o000000O;
import p073o000O0oo.o0000O00;
import p612o0oo0OoO.r5;
import p618o0oo0o0o.o0oOo0O0;
import p620o0oo0oO0.o00;

/* JADX INFO: loaded from: classes4.dex */
public final class w5 extends s5 implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public SurfaceTexture f57500OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f57501OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f57502OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f57503OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f57504OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f57505OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f57506OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public MediaFormat f57507OooOOo0;

    public static final class OooO00o extends Lambda implements Function0<MediaCodec.BufferInfo> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f57508OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MediaCodec.BufferInfo invoke() {
            return new MediaCodec.BufferInfo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(@NotNull r5 playerEva) {
        super(playerEva);
        Intrinsics.checkNotNullParameter(playerEva, "playerEva");
        this.f57501OooOO0o = LazyKt.lazy(OooO00o.f57508OooO0Oo);
    }

    public final void OooO0Oo() {
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("destroyInner", "msg");
        Handler handler = this.f57486OooO0o0.f57510OooO0O0;
        if (handler != null) {
            handler.post(new o000000O(this, 4));
        }
    }

    public final void OooO0o(final MediaCodec mediaCodec, final MediaExtractor mediaExtractor) {
        Handler handler = this.f57486OooO0o0.f57510OooO0O0;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o0oo0Ooo.v5
                @Override // java.lang.Runnable
                public final void run() {
                    w5 this$0 = this.f57497OooO0Oo;
                    MediaCodec mediaCodec2 = mediaCodec;
                    MediaExtractor mediaExtractor2 = mediaExtractor;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    EvaJniUtil evaJniUtil = EvaJniUtil.f32437OooO00o;
                    evaJniUtil.renderClearFrame(this$0.f57484OooO0Oo.f57461OooO0O0);
                    try {
                        Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                        Intrinsics.checkNotNullParameter("release", "msg");
                        if (mediaCodec2 != null) {
                            mediaCodec2.stop();
                            mediaCodec2.release();
                        }
                        if (mediaExtractor2 != null) {
                            mediaExtractor2.release();
                        }
                        SurfaceTexture surfaceTexture = this$0.f57500OooOO0O;
                        if (surfaceTexture != null) {
                            surfaceTexture.release();
                        }
                        this$0.f57500OooOO0O = null;
                        o00 o00Var = (o00) this$0.f57489OooOO0.getValue();
                        o00Var.f57575OooO0O0 = 0L;
                        o00Var.f57576OooO0OO = 0L;
                        this$0.f57484OooO0Oo.f57478OooOo.OooO0OO();
                        r5 r5Var = this$0.f57484OooO0Oo;
                        r5Var.f57472OooOOO0 = -1;
                        evaJniUtil.releaseTexture(r5Var.f57461OooO0O0);
                    } catch (Throwable tr) {
                        String msg = "release e=" + tr;
                        Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                        Intrinsics.checkNotNullParameter(msg, "msg");
                        Intrinsics.checkNotNullParameter(tr, "tr");
                    }
                    this$0.f57488OooO0oo = false;
                    this$0.onVideoComplete();
                    if (this$0.f57503OooOOO0) {
                        this$0.OooO0Oo();
                    }
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:101:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:105:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:107:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:109:0x0311  */
    /* JADX WARN: Code duplicated, block: B:110:0x0316  */
    /* JADX WARN: Code duplicated, block: B:114:0x032a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x031d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x022e A[EDGE_INSN: B:130:0x022e->B:82:0x022e BREAK  A[LOOP:2: B:72:0x01ed->B:81:0x0226], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:33:0x0102  */
    /* JADX WARN: Code duplicated, block: B:34:0x010b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0110  */
    /* JADX WARN: Code duplicated, block: B:43:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x014a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0156  */
    /* JADX WARN: Code duplicated, block: B:48:0x0162  */
    /* JADX WARN: Code duplicated, block: B:49:0x0164  */
    /* JADX WARN: Code duplicated, block: B:51:0x0168  */
    /* JADX WARN: Code duplicated, block: B:54:0x0171  */
    /* JADX WARN: Code duplicated, block: B:56:0x0193  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x01af  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:76:0x0201  */
    /* JADX WARN: Code duplicated, block: B:83:0x023b  */
    /* JADX WARN: Code duplicated, block: B:87:0x024d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0251  */
    /* JADX WARN: Code duplicated, block: B:92:0x0259 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x028b A[LOOP:1: B:95:0x0285->B:97:0x028b, LOOP_END] */
    public final void OooO0oo(MediaCodec mediaCodec, MediaExtractor mediaExtractor) {
        int sampleTime;
        boolean z;
        w5 w5Var;
        w5 w5Var2;
        Lazy lazy;
        int iDequeueOutputBuffer;
        int i;
        boolean z2;
        boolean z3;
        Lazy lazy2;
        Lazy lazy3;
        r5 r5Var;
        boolean z4;
        o0oOo0O0 o0ooo0o1;
        Iterator<T> it;
        boolean z5;
        int i2;
        o00 o00Var;
        long j;
        long j2;
        boolean z6;
        long j3;
        long j4;
        long j5;
        long j6;
        long jNanoTime;
        long j7;
        long j8;
        boolean z7;
        MediaFormat outputFormat;
        MediaExtractor mediaExtractor2 = mediaExtractor;
        ByteBuffer[] inputBuffers = mediaCodec.getInputBuffers();
        Intrinsics.checkNotNullExpressionValue(inputBuffers, "decoder.inputBuffers");
        r5 r5Var2 = this.f57484OooO0Oo;
        int i3 = 0;
        if (r5Var2.f57477OooOOoo > 0) {
            sampleTime = ((int) (mediaExtractor.getSampleTime() / ((long) (DurationKt.NANOS_IN_MILLIS / r5Var2.f57466OooO0oO)))) - 1;
            String msg = "decode frameIndex: " + sampleTime;
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter(msg, "msg");
        } else {
            sampleTime = 0;
        }
        int i4 = sampleTime;
        boolean z8 = false;
        int i5 = 0;
        boolean z9 = false;
        boolean z10 = false;
        w5 w5Var3 = this;
        while (!z9) {
            if (w5Var3.f57483OooO) {
                Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                Intrinsics.checkNotNullParameter("stop decode", "msg");
                OooO0o(mediaCodec, mediaExtractor);
                return;
            }
            if (!w5Var3.f57506OooOOo) {
                if (!z8) {
                    int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L);
                    if (iDequeueInputBuffer >= 0) {
                        int sampleData = mediaExtractor2.readSampleData(inputBuffers[iDequeueInputBuffer], i3);
                        if (sampleData < 0) {
                            w5Var3 = w5Var3;
                            inputBuffers = inputBuffers;
                            i4 = i4;
                            mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                            Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                            Intrinsics.checkNotNullParameter("decode EOS", "msg");
                            z = true;
                            i5 = i5;
                        } else {
                            int i6 = i5;
                            mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, mediaExtractor.getSampleTime(), 0);
                            String msg2 = OooO0O0.OooO0O0("submitted frame ", i6, " to dec, size=", sampleData);
                            Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                            Intrinsics.checkNotNullParameter(msg2, "msg");
                            i5 = i6 + 1;
                            mediaExtractor.advance();
                        }
                        if (z9) {
                            w5Var = w5Var3;
                        } else {
                            w5Var2 = w5Var3;
                            lazy = w5Var2.f57501OooOO0o;
                            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer((MediaCodec.BufferInfo) lazy.getValue(), 10000L);
                            if (iDequeueOutputBuffer == -1) {
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter("no output from decoder available", "msg");
                            } else if (iDequeueOutputBuffer == -3) {
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter("decoder output buffers changed", "msg");
                            } else {
                                if (iDequeueOutputBuffer == -2) {
                                    outputFormat = mediaCodec.getOutputFormat();
                                    w5Var2.f57507OooOOo0 = outputFormat;
                                    if (outputFormat != null) {
                                        try {
                                            outputFormat.getInteger("stride");
                                            outputFormat.getInteger("slice-height");
                                        } catch (Throwable tr) {
                                            String msg3 = String.valueOf(tr);
                                            Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                            Intrinsics.checkNotNullParameter(msg3, "msg");
                                            Intrinsics.checkNotNullParameter(tr, "tr");
                                        }
                                    }
                                    String msg4 = "decoder output format changed: " + w5Var2.f57507OooOOo0;
                                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                    Intrinsics.checkNotNullParameter(msg4, "msg");
                                } else {
                                    if (iDequeueOutputBuffer >= 0) {
                                        throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("unexpected result from decoder.dequeueOutputBuffer: ", iDequeueOutputBuffer));
                                    }
                                    if ((((MediaCodec.BufferInfo) lazy.getValue()).flags & 4) != 0) {
                                        i = w5Var2.f57487OooO0oO - 1;
                                        w5Var2.f57487OooO0oO = i;
                                        r5Var2.OooO0o0(i);
                                        if (w5Var2.f57487OooO0oO <= 0) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        z9 = z7;
                                    } else {
                                        i = 0;
                                    }
                                    z2 = !z9;
                                    z3 = z;
                                    lazy2 = w5Var2.f57489OooOO0;
                                    if (z2) {
                                        i5 = i5;
                                        o00Var = (o00) lazy2.getValue();
                                        lazy3 = lazy2;
                                        j = ((MediaCodec.BufferInfo) lazy.getValue()).presentationTimeUs;
                                        r5Var = r5Var2;
                                        j2 = o00Var.f57576OooO0OO;
                                        if (j2 == 0) {
                                            o00Var.f57576OooO0OO = System.nanoTime() / ((long) 1000);
                                            o00Var.f57575OooO0O0 = j;
                                            iDequeueOutputBuffer = iDequeueOutputBuffer;
                                            z2 = z2;
                                            i4 = i4;
                                            w5Var3 = w5Var2;
                                        } else {
                                            z6 = o00Var.f57578OooO0o0;
                                            j3 = o00Var.f57574OooO00o;
                                            if (z6) {
                                                o00Var.f57575OooO0O0 = j - (j3 / ((long) 30));
                                                o00Var.f57578OooO0o0 = false;
                                            }
                                            j4 = o00Var.f57577OooO0Oo;
                                            if (j4 == 0) {
                                                j4 = j - o00Var.f57575OooO0O0;
                                            }
                                            if (j4 < 0) {
                                                j4 = 0;
                                            } else if (j4 > ((long) 10) * j3) {
                                                j4 = ((long) 5) * j3;
                                            }
                                            j5 = j2 + j4;
                                            j6 = 1000;
                                            jNanoTime = System.nanoTime() / j6;
                                            while (true) {
                                                j7 = j4;
                                                if (jNanoTime < j5 - ((long) 100)) {
                                                    break;
                                                }
                                                j8 = j5 - jNanoTime;
                                                if (j8 > 500000) {
                                                    j8 = 500000;
                                                }
                                                try {
                                                    Thread.sleep(j8 / j6, ((int) (j8 % j6)) * 1000);
                                                } catch (InterruptedException tr2) {
                                                    String msg5 = "e=" + tr2;
                                                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.SpeedControlUtil", ViewHierarchyConstants.TAG_KEY);
                                                    Intrinsics.checkNotNullParameter(msg5, "msg");
                                                    Intrinsics.checkNotNullParameter(tr2, "tr");
                                                }
                                                jNanoTime = System.nanoTime() / j6;
                                                j4 = j7;
                                            }
                                            o00Var.f57576OooO0OO += j7;
                                            o00Var.f57575OooO0O0 += j7;
                                        }
                                        boolean z11 = w5Var3.f57505OooOOOo;
                                        if (z2 || z11) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                        mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, z4);
                                        if (i4 == 0 && !z10) {
                                            onVideoStart();
                                        }
                                        r5Var2 = r5Var;
                                        o0ooo0o1 = r5Var2.f57478OooOo;
                                        o0ooo0o1.getClass();
                                        StringBuilder sb = new StringBuilder("onDecoding decodeIndex=");
                                        int i7 = i4;
                                        sb.append(i7);
                                        String msg6 = sb.toString();
                                        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
                                        Intrinsics.checkNotNullParameter(msg6, "msg");
                                        o0ooo0o1.f57554OooO0o0 = i7;
                                        it = o0ooo0o1.f57551OooO0OO.iterator();
                                        while (it.hasNext()) {
                                            ((com.yy.yyeva.mix.OooO00o) it.next()).getClass();
                                        }
                                        w5Var3.onVideoRender(i7, r5Var2.f57482OooOo0o.f57454OooO0O0);
                                        i4 = i7 + 1;
                                        String msg7 = "decode frameIndex=" + i4;
                                        Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                        Intrinsics.checkNotNullParameter(msg7, "msg");
                                        if (i > 0) {
                                            Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                            Intrinsics.checkNotNullParameter("Reached EOD, looping", "msg");
                                            o0ooo0o1.getClass();
                                            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
                                            Intrinsics.checkNotNullParameter("onLoopStart", "msg");
                                            o0ooo0o1.f57552OooO0Oo = 0;
                                            o0ooo0o1.f57554OooO0o0 = 0;
                                            mediaExtractor2 = mediaExtractor;
                                            mediaExtractor2.seekTo(0L, 2);
                                            mediaCodec.flush();
                                            o00 o00Var2 = (o00) lazy3.getValue();
                                            o00Var2.f57575OooO0O0 = 0L;
                                            o00Var2.f57576OooO0OO = 0L;
                                            onVideoRestart();
                                            i4 = 0;
                                            z10 = true;
                                            z5 = false;
                                        } else {
                                            mediaExtractor2 = mediaExtractor;
                                            z5 = z3;
                                        }
                                        if (z9) {
                                            i2 = 0;
                                        } else if (r5Var2.f57481OooOo0O) {
                                            mediaCodec.stop();
                                            mediaCodec.release();
                                            if (mediaExtractor2 != null) {
                                                mediaExtractor.release();
                                            }
                                            o00 o00Var3 = (o00) lazy3.getValue();
                                            o00Var3.f57575OooO0O0 = 0L;
                                            o00Var3.f57576OooO0OO = 0L;
                                            o0ooo0o1.OooO0OO();
                                            i2 = 0;
                                            w5Var3.f57488OooO0oo = false;
                                        } else {
                                            i2 = 0;
                                            OooO0o(mediaCodec, mediaExtractor);
                                        }
                                        boolean z12 = z5;
                                        i3 = i2;
                                        z8 = z12;
                                    } else {
                                        lazy3 = lazy2;
                                        iDequeueOutputBuffer = iDequeueOutputBuffer;
                                        z2 = z2;
                                        i5 = i5;
                                        r5Var = r5Var2;
                                    }
                                    w5Var3 = this;
                                    boolean z13 = w5Var3.f57505OooOOOo;
                                    if (z2) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, z4);
                                    if (i4 == 0) {
                                        onVideoStart();
                                    }
                                    r5Var2 = r5Var;
                                    o0ooo0o1 = r5Var2.f57478OooOo;
                                    o0ooo0o1.getClass();
                                    StringBuilder sb2 = new StringBuilder("onDecoding decodeIndex=");
                                    int i8 = i4;
                                    sb2.append(i8);
                                    String msg8 = sb2.toString();
                                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
                                    Intrinsics.checkNotNullParameter(msg8, "msg");
                                    o0ooo0o1.f57554OooO0o0 = i8;
                                    it = o0ooo0o1.f57551OooO0OO.iterator();
                                    while (it.hasNext()) {
                                        ((com.yy.yyeva.mix.OooO00o) it.next()).getClass();
                                    }
                                    w5Var3.onVideoRender(i8, r5Var2.f57482OooOo0o.f57454OooO0O0);
                                    i4 = i8 + 1;
                                    String msg9 = "decode frameIndex=" + i4;
                                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                    Intrinsics.checkNotNullParameter(msg9, "msg");
                                    if (i > 0) {
                                        Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                        Intrinsics.checkNotNullParameter("Reached EOD, looping", "msg");
                                        o0ooo0o1.getClass();
                                        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
                                        Intrinsics.checkNotNullParameter("onLoopStart", "msg");
                                        o0ooo0o1.f57552OooO0Oo = 0;
                                        o0ooo0o1.f57554OooO0o0 = 0;
                                        mediaExtractor2 = mediaExtractor;
                                        mediaExtractor2.seekTo(0L, 2);
                                        mediaCodec.flush();
                                        o00 o00Var4 = (o00) lazy3.getValue();
                                        o00Var4.f57575OooO0O0 = 0L;
                                        o00Var4.f57576OooO0OO = 0L;
                                        onVideoRestart();
                                        i4 = 0;
                                        z10 = true;
                                        z5 = false;
                                    } else {
                                        mediaExtractor2 = mediaExtractor;
                                        z5 = z3;
                                    }
                                    if (z9) {
                                        i2 = 0;
                                    } else if (r5Var2.f57481OooOo0O) {
                                        mediaCodec.stop();
                                        mediaCodec.release();
                                        if (mediaExtractor2 != null) {
                                            mediaExtractor.release();
                                        }
                                        o00 o00Var5 = (o00) lazy3.getValue();
                                        o00Var5.f57575OooO0O0 = 0L;
                                        o00Var5.f57576OooO0OO = 0L;
                                        o0ooo0o1.OooO0OO();
                                        i2 = 0;
                                        w5Var3.f57488OooO0oo = false;
                                    } else {
                                        i2 = 0;
                                        OooO0o(mediaCodec, mediaExtractor);
                                    }
                                    boolean z14 = z5;
                                    i3 = i2;
                                    z8 = z14;
                                }
                                r5Var2 = r5Var2;
                                mediaExtractor2 = mediaExtractor2;
                                inputBuffers = inputBuffers;
                                i5 = i5;
                            }
                            w5Var = w5Var2;
                        }
                        i3 = 0;
                        z8 = z;
                        w5Var3 = w5Var;
                        r5Var2 = r5Var2;
                        mediaExtractor2 = mediaExtractor2;
                        inputBuffers = inputBuffers;
                        i5 = i5;
                    } else {
                        Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                        Intrinsics.checkNotNullParameter("input buffer not available", "msg");
                    }
                }
                z = z8;
                if (z9) {
                    w5Var2 = w5Var3;
                    lazy = w5Var2.f57501OooOO0o;
                    iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer((MediaCodec.BufferInfo) lazy.getValue(), 10000L);
                    if (iDequeueOutputBuffer == -1) {
                        Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                        Intrinsics.checkNotNullParameter("no output from decoder available", "msg");
                    } else if (iDequeueOutputBuffer == -3) {
                        Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                        Intrinsics.checkNotNullParameter("decoder output buffers changed", "msg");
                    } else {
                        if (iDequeueOutputBuffer == -2) {
                            outputFormat = mediaCodec.getOutputFormat();
                            w5Var2.f57507OooOOo0 = outputFormat;
                            if (outputFormat != null) {
                                outputFormat.getInteger("stride");
                                outputFormat.getInteger("slice-height");
                            }
                            String msg10 = "decoder output format changed: " + w5Var2.f57507OooOOo0;
                            Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                            Intrinsics.checkNotNullParameter(msg10, "msg");
                        } else {
                            if (iDequeueOutputBuffer >= 0) {
                                throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("unexpected result from decoder.dequeueOutputBuffer: ", iDequeueOutputBuffer));
                            }
                            if ((((MediaCodec.BufferInfo) lazy.getValue()).flags & 4) != 0) {
                                i = w5Var2.f57487OooO0oO - 1;
                                w5Var2.f57487OooO0oO = i;
                                r5Var2.OooO0o0(i);
                                if (w5Var2.f57487OooO0oO <= 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                z9 = z7;
                            } else {
                                i = 0;
                            }
                            z2 = !z9;
                            z3 = z;
                            lazy2 = w5Var2.f57489OooOO0;
                            if (z2) {
                                i5 = i5;
                                o00Var = (o00) lazy2.getValue();
                                lazy3 = lazy2;
                                j = ((MediaCodec.BufferInfo) lazy.getValue()).presentationTimeUs;
                                r5Var = r5Var2;
                                j2 = o00Var.f57576OooO0OO;
                                if (j2 == 0) {
                                    o00Var.f57576OooO0OO = System.nanoTime() / ((long) 1000);
                                    o00Var.f57575OooO0O0 = j;
                                    iDequeueOutputBuffer = iDequeueOutputBuffer;
                                    z2 = z2;
                                    i4 = i4;
                                    w5Var3 = w5Var2;
                                } else {
                                    z6 = o00Var.f57578OooO0o0;
                                    j3 = o00Var.f57574OooO00o;
                                    if (z6) {
                                        o00Var.f57575OooO0O0 = j - (j3 / ((long) 30));
                                        o00Var.f57578OooO0o0 = false;
                                    }
                                    j4 = o00Var.f57577OooO0Oo;
                                    if (j4 == 0) {
                                        j4 = j - o00Var.f57575OooO0O0;
                                    }
                                    if (j4 < 0) {
                                        j4 = 0;
                                    } else if (j4 > ((long) 10) * j3) {
                                        j4 = ((long) 5) * j3;
                                    }
                                    j5 = j2 + j4;
                                    j6 = 1000;
                                    jNanoTime = System.nanoTime() / j6;
                                    while (true) {
                                        j7 = j4;
                                        if (jNanoTime < j5 - ((long) 100)) {
                                            break;
                                            break;
                                        }
                                        j8 = j5 - jNanoTime;
                                        if (j8 > 500000) {
                                            j8 = 500000;
                                        }
                                        Thread.sleep(j8 / j6, ((int) (j8 % j6)) * 1000);
                                        jNanoTime = System.nanoTime() / j6;
                                        j4 = j7;
                                    }
                                    o00Var.f57576OooO0OO += j7;
                                    o00Var.f57575OooO0O0 += j7;
                                }
                                boolean z15 = w5Var3.f57505OooOOOo;
                                if (z2) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, z4);
                                if (i4 == 0) {
                                    onVideoStart();
                                }
                                r5Var2 = r5Var;
                                o0ooo0o1 = r5Var2.f57478OooOo;
                                o0ooo0o1.getClass();
                                StringBuilder sb3 = new StringBuilder("onDecoding decodeIndex=");
                                int i9 = i4;
                                sb3.append(i9);
                                String msg11 = sb3.toString();
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter(msg11, "msg");
                                o0ooo0o1.f57554OooO0o0 = i9;
                                it = o0ooo0o1.f57551OooO0OO.iterator();
                                while (it.hasNext()) {
                                    ((com.yy.yyeva.mix.OooO00o) it.next()).getClass();
                                }
                                w5Var3.onVideoRender(i9, r5Var2.f57482OooOo0o.f57454OooO0O0);
                                i4 = i9 + 1;
                                String msg12 = "decode frameIndex=" + i4;
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter(msg12, "msg");
                                if (i > 0) {
                                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                    Intrinsics.checkNotNullParameter("Reached EOD, looping", "msg");
                                    o0ooo0o1.getClass();
                                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
                                    Intrinsics.checkNotNullParameter("onLoopStart", "msg");
                                    o0ooo0o1.f57552OooO0Oo = 0;
                                    o0ooo0o1.f57554OooO0o0 = 0;
                                    mediaExtractor2 = mediaExtractor;
                                    mediaExtractor2.seekTo(0L, 2);
                                    mediaCodec.flush();
                                    o00 o00Var6 = (o00) lazy3.getValue();
                                    o00Var6.f57575OooO0O0 = 0L;
                                    o00Var6.f57576OooO0OO = 0L;
                                    onVideoRestart();
                                    i4 = 0;
                                    z10 = true;
                                    z5 = false;
                                } else {
                                    mediaExtractor2 = mediaExtractor;
                                    z5 = z3;
                                }
                                if (z9) {
                                    i2 = 0;
                                } else if (r5Var2.f57481OooOo0O) {
                                    mediaCodec.stop();
                                    mediaCodec.release();
                                    if (mediaExtractor2 != null) {
                                        mediaExtractor.release();
                                    }
                                    o00 o00Var7 = (o00) lazy3.getValue();
                                    o00Var7.f57575OooO0O0 = 0L;
                                    o00Var7.f57576OooO0OO = 0L;
                                    o0ooo0o1.OooO0OO();
                                    i2 = 0;
                                    w5Var3.f57488OooO0oo = false;
                                } else {
                                    i2 = 0;
                                    OooO0o(mediaCodec, mediaExtractor);
                                }
                                boolean z16 = z5;
                                i3 = i2;
                                z8 = z16;
                            } else {
                                lazy3 = lazy2;
                                iDequeueOutputBuffer = iDequeueOutputBuffer;
                                z2 = z2;
                                i5 = i5;
                                r5Var = r5Var2;
                            }
                            w5Var3 = this;
                            boolean z17 = w5Var3.f57505OooOOOo;
                            if (z2) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, z4);
                            if (i4 == 0) {
                                onVideoStart();
                            }
                            r5Var2 = r5Var;
                            o0ooo0o1 = r5Var2.f57478OooOo;
                            o0ooo0o1.getClass();
                            StringBuilder sb4 = new StringBuilder("onDecoding decodeIndex=");
                            int i10 = i4;
                            sb4.append(i10);
                            String msg13 = sb4.toString();
                            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
                            Intrinsics.checkNotNullParameter(msg13, "msg");
                            o0ooo0o1.f57554OooO0o0 = i10;
                            it = o0ooo0o1.f57551OooO0OO.iterator();
                            while (it.hasNext()) {
                                ((com.yy.yyeva.mix.OooO00o) it.next()).getClass();
                            }
                            w5Var3.onVideoRender(i10, r5Var2.f57482OooOo0o.f57454OooO0O0);
                            i4 = i10 + 1;
                            String msg14 = "decode frameIndex=" + i4;
                            Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                            Intrinsics.checkNotNullParameter(msg14, "msg");
                            if (i > 0) {
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter("Reached EOD, looping", "msg");
                                o0ooo0o1.getClass();
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter("onLoopStart", "msg");
                                o0ooo0o1.f57552OooO0Oo = 0;
                                o0ooo0o1.f57554OooO0o0 = 0;
                                mediaExtractor2 = mediaExtractor;
                                mediaExtractor2.seekTo(0L, 2);
                                mediaCodec.flush();
                                o00 o00Var8 = (o00) lazy3.getValue();
                                o00Var8.f57575OooO0O0 = 0L;
                                o00Var8.f57576OooO0OO = 0L;
                                onVideoRestart();
                                i4 = 0;
                                z10 = true;
                                z5 = false;
                            } else {
                                mediaExtractor2 = mediaExtractor;
                                z5 = z3;
                            }
                            if (z9) {
                                i2 = 0;
                            } else if (r5Var2.f57481OooOo0O) {
                                mediaCodec.stop();
                                mediaCodec.release();
                                if (mediaExtractor2 != null) {
                                    mediaExtractor.release();
                                }
                                o00 o00Var9 = (o00) lazy3.getValue();
                                o00Var9.f57575OooO0O0 = 0L;
                                o00Var9.f57576OooO0OO = 0L;
                                o0ooo0o1.OooO0OO();
                                i2 = 0;
                                w5Var3.f57488OooO0oo = false;
                            } else {
                                i2 = 0;
                                OooO0o(mediaCodec, mediaExtractor);
                            }
                            boolean z18 = z5;
                            i3 = i2;
                            z8 = z18;
                        }
                        r5Var2 = r5Var2;
                        mediaExtractor2 = mediaExtractor2;
                        inputBuffers = inputBuffers;
                        i5 = i5;
                    }
                    w5Var = w5Var2;
                } else {
                    w5Var = w5Var3;
                }
                i3 = 0;
                z8 = z;
                w5Var3 = w5Var;
                r5Var2 = r5Var2;
                mediaExtractor2 = mediaExtractor2;
                inputBuffers = inputBuffers;
                i5 = i5;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(@Nullable SurfaceTexture surfaceTexture) {
        if (this.f57483OooO) {
            return;
        }
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onFrameAvailable", "msg");
        Handler handler = this.f57486OooO0o0.f57510OooO0O0;
        if (handler != null) {
            handler.post(new o0000O00(this, 2));
        }
    }
}
