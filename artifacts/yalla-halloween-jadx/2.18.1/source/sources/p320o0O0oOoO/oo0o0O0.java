package p320o0O0oOoO;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.facebook.appevents.OooOOO0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DummySurface;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.google.android.gms.common.Scopes;
import com.uc.crashsdk.export.LogType;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import p168o00Ooo0.Oooo000;
import p294o0O0Oo0o.o0O0O00;
import p301o0O0Oooo.o00;
import p303o0O0o00o.OooOOOO;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000oo;
import p318o0O0oOo.o000O;
import p318o0O0oOo.o000OO;
import p318o0O0oOo.o000OOo0;
import p466o0OooO0.o0000O0O;
import p466o0OooO0.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0O0 extends MediaCodecRenderer {

    /* JADX INFO: renamed from: o000o0o, reason: collision with root package name */
    public static final int[] f36834o000o0o = {1920, 1600, 1440, LogType.UNEXP_ANR, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: o000o0oO, reason: collision with root package name */
    @Nullable
    public static final Method f36835o000o0oO;

    /* JADX INFO: renamed from: o000o0oo, reason: collision with root package name */
    public static boolean f36836o000o0oo;

    /* JADX INFO: renamed from: o000oOoo, reason: collision with root package name */
    public static boolean f36837o000oOoo;

    /* JADX INFO: renamed from: o000O, reason: collision with root package name */
    public int f36838o000O;

    /* JADX INFO: renamed from: o000O0, reason: collision with root package name */
    public OooO00o f36839o000O0;

    /* JADX INFO: renamed from: o000O00, reason: collision with root package name */
    public final int f36840o000O00;

    /* JADX INFO: renamed from: o000O00O, reason: collision with root package name */
    public final boolean f36841o000O00O;

    /* JADX INFO: renamed from: o000O0O, reason: collision with root package name */
    public final o00OOO0O.OooO00o f36842o000O0O;

    /* JADX INFO: renamed from: o000O0O0, reason: collision with root package name */
    public Surface f36843o000O0O0;

    /* JADX INFO: renamed from: o000O0Oo, reason: collision with root package name */
    public boolean f36844o000O0Oo;

    /* JADX INFO: renamed from: o000O0o, reason: collision with root package name */
    public final Context f36845o000O0o;

    /* JADX INFO: renamed from: o000O0o0, reason: collision with root package name */
    public float f36846o000O0o0;

    /* JADX INFO: renamed from: o000O0oO, reason: collision with root package name */
    public DummySurface f36847o000O0oO;

    /* JADX INFO: renamed from: o000O0oo, reason: collision with root package name */
    public boolean f36848o000O0oo;

    /* JADX INFO: renamed from: o000OO00, reason: collision with root package name */
    public boolean f36849o000OO00;

    /* JADX INFO: renamed from: o000OO0O, reason: collision with root package name */
    public boolean f36850o000OO0O;

    /* JADX INFO: renamed from: o000OO0o, reason: collision with root package name */
    public boolean f36851o000OO0o;

    /* JADX INFO: renamed from: o000OOO, reason: collision with root package name */
    public long f36852o000OOO;

    /* JADX INFO: renamed from: o000OOo0, reason: collision with root package name */
    public long f36853o000OOo0;

    /* JADX INFO: renamed from: o000OOoO, reason: collision with root package name */
    public long f36854o000OOoO;

    /* JADX INFO: renamed from: o000Oo, reason: collision with root package name */
    public long f36855o000Oo;
    public final long o000Oo0;

    /* JADX INFO: renamed from: o000Oo00, reason: collision with root package name */
    public int f36856o000Oo00;

    /* JADX INFO: renamed from: o000Oo0O, reason: collision with root package name */
    public int f36857o000Oo0O;

    /* JADX INFO: renamed from: o000Oo0o, reason: collision with root package name */
    public int f36858o000Oo0o;

    /* JADX INFO: renamed from: o000OoOO, reason: collision with root package name */
    public long f36859o000OoOO;

    /* JADX INFO: renamed from: o000OoOo, reason: collision with root package name */
    public int f36860o000OoOo;

    /* JADX INFO: renamed from: o000Ooo, reason: collision with root package name */
    public final o00O f36861o000Ooo;

    /* JADX INFO: renamed from: o000Ooo0, reason: collision with root package name */
    public int f36862o000Ooo0;

    /* JADX INFO: renamed from: o000OooO, reason: collision with root package name */
    public int f36863o000OooO;

    /* JADX INFO: renamed from: o000Oooo, reason: collision with root package name */
    public int f36864o000Oooo;

    /* JADX INFO: renamed from: o000o00, reason: collision with root package name */
    public float f36865o000o00;

    /* JADX INFO: renamed from: o000o000, reason: collision with root package name */
    public float f36866o000o000;

    /* JADX INFO: renamed from: o000o00O, reason: collision with root package name */
    public int f36867o000o00O;

    /* JADX INFO: renamed from: o000o00o, reason: collision with root package name */
    public int f36868o000o00o;

    /* JADX INFO: renamed from: o000o0O, reason: collision with root package name */
    public boolean f36869o000o0O;

    /* JADX INFO: renamed from: o000o0O0, reason: collision with root package name */
    public float f36870o000o0O0;

    /* JADX INFO: renamed from: o000o0OO, reason: collision with root package name */
    public int f36871o000o0OO;

    /* JADX INFO: renamed from: o000o0Oo, reason: collision with root package name */
    @Nullable
    public OooO0O0 f36872o000o0Oo;

    /* JADX INFO: renamed from: o000o0o0, reason: collision with root package name */
    @Nullable
    public oo0oOO0 f36873o000o0o0;

    /* JADX INFO: renamed from: o0OoO0o, reason: collision with root package name */
    public boolean f36874o0OoO0o;

    /* JADX INFO: renamed from: oooo00o, reason: collision with root package name */
    public int f36875oooo00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f36876OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f36877OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f36878OooO0OO;

        public OooO00o(int i, int i2, int i3) {
            this.f36876OooO00o = i;
            this.f36877OooO0O0 = i2;
            this.f36878OooO0OO = i3;
        }
    }

    @RequiresApi(23)
    public final class OooO0O0 implements MediaCodec.OnFrameRenderedListener, Handler.Callback {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Handler f36879Oooo0o;

        public OooO0O0(MediaCodec mediaCodec) {
            int i = o000OOo0.f36740OooO00o;
            Looper looperMyLooper = Looper.myLooper();
            o00000O0.OooO0o(looperMyLooper);
            Handler handler = new Handler(looperMyLooper, this);
            this.f36879Oooo0o = handler;
            mediaCodec.setOnFrameRenderedListener(this, handler);
        }

        public final void OooO00o(long j) {
            oo0o0O0 oo0o0o0 = oo0o0O0.this;
            if (this != oo0o0o0.f36872o000o0Oo) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                oo0o0o0.f14396o0000oO0 = true;
                return;
            }
            try {
                oo0o0o0.o00000oo(j);
            } catch (ExoPlaybackException e) {
                oo0o0O0.this.f14398o0000oOo = e;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            OooO00o((o000OOo0.Oooo0O0(message.arg1) << 32) | o000OOo0.Oooo0O0(message.arg2));
            return true;
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            if (o000OOo0.f36740OooO00o >= 30) {
                OooO00o(j);
            } else {
                this.f36879Oooo0o.sendMessageAtFrontOfQueue(Message.obtain(this.f36879Oooo0o, 0, (int) (j >> 32), (int) j));
            }
        }
    }

    static {
        Method method;
        if (o000OOo0.f36740OooO00o >= 30) {
            try {
                method = Surface.class.getMethod("setFrameRate", Float.TYPE, Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                method = null;
            }
        } else {
            method = null;
        }
        f36835o000o0oO = method;
    }

    public oo0o0O0(Context context, com.google.android.exoplayer2.mediacodec.OooO0O0 oooO0O0, @Nullable Handler handler, @Nullable o00OOO0O o00ooo0o2) {
        super(2, oooO0O0, 30.0f);
        this.o000Oo0 = 5000L;
        this.f36840o000O00 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f36845o000O0o = applicationContext;
        this.f36861o000Ooo = new o00O(applicationContext);
        this.f36842o000O0O = new o00OOO0O.OooO00o(handler, o00ooo0o2);
        this.f36841o000O00O = "NVIDIA".equals(o000OOo0.f36742OooO0OO);
        this.f36853o000OOo0 = -9223372036854775807L;
        this.f36862o000Ooo0 = -1;
        this.f36863o000OooO = -1;
        this.f36866o000o000 = -1.0f;
        this.f36838o000O = 1;
        o0O0O00();
    }

    public static List<com.google.android.exoplayer2.mediacodec.OooO00o> o00000(com.google.android.exoplayer2.mediacodec.OooO0O0 oooO0O0, Format format, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException {
        Pair<Integer, Integer> pairOooO0OO;
        String str = format.f13131OoooOOo;
        if (str == null) {
            return Collections.emptyList();
        }
        List<com.google.android.exoplayer2.mediacodec.OooO00o> listOooO00o = oooO0O0.OooO00o(str, z, z2);
        Pattern pattern = MediaCodecUtil.f14427OooO00o;
        ArrayList arrayList = new ArrayList(listOooO00o);
        MediaCodecUtil.OooOO0(arrayList, new p192o00o0O0.o00000O0(format));
        if ("video/dolby-vision".equals(str) && (pairOooO0OO = MediaCodecUtil.OooO0OO(format)) != null) {
            int iIntValue = ((Integer) pairOooO0OO.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                arrayList.addAll(oooO0O0.OooO00o("video/hevc", z, z2));
            } else if (iIntValue == 512) {
                arrayList.addAll(oooO0O0.OooO00o("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:602:0x0816  */
    /* JADX WARN: Code duplicated, block: B:6:0x0018  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public static boolean o000000O() {
        /*
            Method dump skipped, instruction units count: 3014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p320o0O0oOoO.oo0o0O0.o000000O():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static int o000000o(com.google.android.exoplayer2.mediacodec.OooO00o oooO00o, String str, int i, int i2) {
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        Objects.requireNonNull(str);
        int i4 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                i3 = i * i2;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                i3 = i * i2;
                return (i3 * 3) / (i4 * 2);
            case "video/avc":
                String str2 = o000OOo0.f36743OooO0Oo;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(o000OOo0.f36742OooO0OO) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && oooO00o.f14439OooO0o)))) {
                    return -1;
                }
                i3 = (((i2 + 16) - 1) / 16) * (((i + 16) - 1) / 16) * 16 * 16;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            default:
                return -1;
        }
    }

    public static boolean o00000O(long j) {
        return j < -30000;
    }

    public static int o00000O0(com.google.android.exoplayer2.mediacodec.OooO00o oooO00o, Format format) {
        if (format.f13132OoooOo0 == -1) {
            return o000000o(oooO00o, format.f13131OoooOOo, format.f13136Ooooo0o, format.f13137OooooO0);
        }
        int size = format.f13133OoooOoO.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += format.f13133OoooOoO.get(i).length;
        }
        return format.f13132OoooOo0 + length;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public final boolean OooO0O0() {
        DummySurface dummySurface;
        if (super.OooO0O0() && (this.f36849o000OO00 || (((dummySurface = this.f36847o000O0oO) != null && this.f36843o000O0O0 == dummySurface) || this.f14420oo000o == null || this.f36869o000o0O))) {
            this.f36853o000OOo0 = -9223372036854775807L;
            return true;
        }
        if (this.f36853o000OOo0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f36853o000OOo0) {
            return true;
        }
        this.f36853o000OOo0 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.OooOo.OooO0O0
    public final void OooOOOo(int i, @Nullable Object obj) throws ExoPlaybackException {
        Surface surface;
        if (i != 1) {
            if (i != 4) {
                if (i == 6) {
                    this.f36873o000o0o0 = (oo0oOO0) obj;
                    return;
                }
                return;
            } else {
                int iIntValue = ((Integer) obj).intValue();
                this.f36838o000O = iIntValue;
                MediaCodec mediaCodec = this.f14420oo000o;
                if (mediaCodec != null) {
                    mediaCodec.setVideoScalingMode(iIntValue);
                    return;
                }
                return;
            }
        }
        Surface surface2 = (Surface) obj;
        if (surface2 == null) {
            DummySurface dummySurface = this.f36847o000O0oO;
            if (dummySurface != null) {
                surface = surface2;
                surface = dummySurface;
            } else {
                com.google.android.exoplayer2.mediacodec.OooO00o oooO00o = this.f14413o0OO00O;
                if (oooO00o != null && o0000O0(oooO00o)) {
                    surface = surface2;
                    surface = surface2;
                    surface = surface2;
                    DummySurface dummySurfaceOooO0OO = DummySurface.OooO0OO(this.f36845o000O0o, oooO00o.f14439OooO0o);
                    this.f36847o000O0oO = dummySurfaceOooO0OO;
                    surface = dummySurfaceOooO0OO;
                }
            }
        }
        surface = surface2;
        surface = surface2;
        surface = surface2;
        surface = surface2;
        surface = surface2;
        surface = surface2;
        if (this.f36843o000O0O0 == surface) {
            if (surface == null || surface == this.f36847o000O0oO) {
                return;
            }
            o0000Ooo();
            if (this.f36848o000O0oo) {
                o00OOO0O.OooO00o oooO00o2 = this.f36842o000O0O;
                Surface surface3 = this.f36843o000O0O0;
                Handler handler = oooO00o2.f36830OooO00o;
                if (handler != null) {
                    handler.post(new oo0O(oooO00o2, surface3));
                    return;
                }
                return;
            }
            return;
        }
        o000OOo();
        this.f36843o000O0O0 = surface;
        this.f36848o000O0oo = false;
        o0000O(true);
        int i2 = this.f13206OoooO00;
        MediaCodec mediaCodec2 = this.f14420oo000o;
        if (mediaCodec2 != null) {
            if (o000OOo0.f36740OooO00o < 23 || surface == null || this.f36844o000O0Oo) {
                o00O0O();
                OoooOoo();
            } else {
                mediaCodec2.setOutputSurface(surface);
            }
        }
        if (surface == null || surface == this.f36847o000O0oO) {
            o0O0O00();
            oo0o0Oo();
            return;
        }
        o0000Ooo();
        oo0o0Oo();
        if (i2 == 2) {
            o0000oo();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.Renderer
    public final void OooOOo(float f) throws ExoPlaybackException {
        this.f14411o00ooo = f;
        if (this.f14420oo000o != null && this.f14385o0000OOO != 3 && this.f13206OoooO00 != 0) {
            o0OOO0o();
        }
        o0000O(false);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.OooO0o
    public final void OooOoOO() {
        o00OOO0O.OooO00o oooO00o;
        o0O0O00 o0o0o00;
        o0O0O00();
        oo0o0Oo();
        this.f36848o000O0oo = false;
        o00O o00o2 = this.f36861o000Ooo;
        if (o00o2.f36771OooO00o != null) {
            o00O.OooO00o oooO00o2 = o00o2.f36773OooO0OO;
            if (oooO00o2 != null) {
                oooO00o2.f36782OooO00o.unregisterDisplayListener(oooO00o2);
            }
            o00o2.f36772OooO0O0.f36787Oooo0oO.sendEmptyMessage(2);
        }
        this.f36872o000o0Oo = null;
        try {
            super.OooOoOO();
            oooO00o = this.f36842o000O0O;
            o0o0o00 = this.f14400o0000oo0;
            Objects.requireNonNull(oooO00o);
            synchronized (o0o0o00) {
            }
        } finally {
            oooO00o = this.f36842o000O0O;
            o0o0o00 = this.f14400o0000oo0;
            Objects.requireNonNull(oooO00o);
            synchronized (o0o0o00) {
                Handler handler = oooO00o.f36830OooO00o;
                if (handler != null) {
                    handler.post(new OooOOO0(oooO00o, o0o0o00, 1));
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.OooO0o
    public final void OooOoo(long j, boolean z) throws ExoPlaybackException {
        super.OooOoo(j, z);
        oo0o0Oo();
        this.f36852o000OOO = -9223372036854775807L;
        this.f36857o000Oo0O = 0;
        if (z) {
            o0000oo();
        } else {
            this.f36853o000OOo0 = -9223372036854775807L;
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoo0(boolean z) throws ExoPlaybackException {
        this.f14400o0000oo0 = new o0O0O00();
        int i = this.f36871o000o0OO;
        o000O0Oo o000o0oo2 = this.f13203Oooo0oo;
        Objects.requireNonNull(o000o0oo2);
        int i2 = o000o0oo2.f40538OooO00o;
        this.f36871o000o0OO = i2;
        this.f36869o000o0O = i2 != 0;
        if (i2 != i) {
            o00O0O();
        }
        final o00OOO0O.OooO00o oooO00o = this.f36842o000O0O;
        final o0O0O00 o0o0o00 = this.f14400o0000oo0;
        Handler handler = oooO00o.f36830OooO00o;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o0O0oOoO.o00OOO0
                @Override // java.lang.Runnable
                public final void run() {
                    o00OOO0O.OooO00o oooO00o2 = oooO00o;
                    o0O0O00 o0o0o01 = o0o0o00;
                    o00OOO0O o00ooo0o2 = oooO00o2.f36831OooO0O0;
                    int i3 = o000OOo0.f36740OooO00o;
                    o00ooo0o2.Oooo(o0o0o01);
                }
            });
        }
        o00O o00o2 = this.f36861o000Ooo;
        o00o2.f36770OooO = false;
        if (o00o2.f36771OooO00o != null) {
            o00o2.f36772OooO0O0.f36787Oooo0oO.sendEmptyMessage(1);
            o00O.OooO00o oooO00o2 = o00o2.f36773OooO0OO;
            if (oooO00o2 != null) {
                oooO00o2.f36782OooO00o.registerDisplayListener(oooO00o2, null);
            }
            o00o2.OooO0O0();
        }
        this.f36874o0OoO0o = z;
        this.f36851o000OO0o = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.OooO0o
    public final void OooOooO() {
        try {
            try {
                Oooo0o();
                o00O0O();
                o00oO0o(null);
                DummySurface dummySurface = this.f36847o000O0oO;
                if (dummySurface != null) {
                    if (this.f36843o000O0O0 == dummySurface) {
                        this.f36843o000O0O0 = null;
                    }
                    dummySurface.release();
                    this.f36847o000O0oO = null;
                }
            } catch (Throwable th) {
                o00oO0o(null);
                throw th;
            }
        } catch (Throwable th2) {
            DummySurface dummySurface2 = this.f36847o000O0oO;
            if (dummySurface2 != null) {
                if (this.f36843o000O0O0 == dummySurface2) {
                    this.f36843o000O0O0 = null;
                }
                dummySurface2.release();
                this.f36847o000O0oO = null;
            }
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOooo() {
        this.f36856o000Oo00 = 0;
        this.f36854o000OOoO = SystemClock.elapsedRealtime();
        this.f36855o000Oo = SystemClock.elapsedRealtime() * 1000;
        this.f36859o000OoOO = 0L;
        this.f36860o000OoOo = 0;
        o0000O(false);
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void Oooo000() {
        this.f36853o000OOo0 = -9223372036854775807L;
        o00000OO();
        final int i = this.f36860o000OoOo;
        if (i != 0) {
            final o00OOO0O.OooO00o oooO00o = this.f36842o000O0O;
            final long j = this.f36859o000OoOO;
            Handler handler = oooO00o.f36830OooO00o;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o0O0oOoO.o00OO0OO
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00OOO0O.OooO00o oooO00o2 = oooO00o;
                        long j2 = j;
                        int i2 = i;
                        o00OOO0O o00ooo0o2 = oooO00o2.f36831OooO0O0;
                        int i3 = o000OOo0.f36740OooO00o;
                        o00ooo0o2.OoooO0O(j2, i2);
                    }
                });
            }
            this.f36859o000OoOO = 0L;
            this.f36860o000OoOo = 0;
        }
        o000OOo();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final int Oooo0O0(com.google.android.exoplayer2.mediacodec.OooO00o oooO00o, Format format, Format format2) {
        if (!oooO00o.OooO0o(format, format2, true)) {
            return 0;
        }
        int i = format2.f13136Ooooo0o;
        OooO00o oooO00o2 = this.f36839o000O0;
        if (i > oooO00o2.f36876OooO00o || format2.f13137OooooO0 > oooO00o2.f36877OooO0O0 || o00000O0(oooO00o, format2) > this.f36839o000O0.f36878OooO0OO) {
            return 0;
        }
        return format.OooO0O0(format2) ? 3 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0131  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Oooo0OO(com.google.android.exoplayer2.mediacodec.OooO00o oooO00o, OooOOOO oooOOOO, Format format, @Nullable MediaCrypto mediaCrypto, float f) {
        String str;
        OooO00o oooO00o2;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z;
        Pair<Integer, Integer> pairOooO0OO;
        int iO000000o;
        String str2 = oooO00o.f14437OooO0OO;
        Format[] formatArr = this.f13207OoooO0O;
        Objects.requireNonNull(formatArr);
        int iMax = format.f13136Ooooo0o;
        int iMax2 = format.f13137OooooO0;
        int iO00000O0 = o00000O0(oooO00o, format);
        boolean z2 = false;
        if (formatArr.length == 1) {
            if (iO00000O0 != -1 && (iO000000o = o000000o(oooO00o, format.f13131OoooOOo, format.f13136Ooooo0o, format.f13137OooooO0)) != -1) {
                iO00000O0 = Math.min((int) (iO00000O0 * 1.5f), iO000000o);
            }
            oooO00o2 = new OooO00o(iMax, iMax2, iO00000O0);
            str = str2;
        } else {
            int length = formatArr.length;
            int i = 0;
            boolean z3 = false;
            while (i < length) {
                Format format2 = formatArr[i];
                if (oooO00o.OooO0o(format, format2, z2)) {
                    int i2 = format2.f13136Ooooo0o;
                    z3 |= i2 == -1 || format2.f13137OooooO0 == -1;
                    iMax = Math.max(iMax, i2);
                    iMax2 = Math.max(iMax2, format2.f13137OooooO0);
                    iO00000O0 = Math.max(iO00000O0, o00000O0(oooO00o, format2));
                }
                i++;
                z2 = false;
            }
            if (z3) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(iMax);
                sb.append("x");
                sb.append(iMax2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                int i3 = format.f13137OooooO0;
                int i4 = format.f13136Ooooo0o;
                boolean z4 = i3 > i4;
                int i5 = z4 ? i3 : i4;
                if (z4) {
                    i3 = i4;
                }
                float f2 = i3 / i5;
                int[] iArr = f36834o000o0o;
                int i6 = 0;
                while (true) {
                    Point pointOooO00o = null;
                    if (i6 < 9) {
                        int i7 = iArr[i6];
                        int[] iArr2 = iArr;
                        int i8 = (int) (i7 * f2);
                        if (i7 > i5 && i8 > i3) {
                            int i9 = i3;
                            float f3 = f2;
                            if (o000OOo0.f36740OooO00o >= 21) {
                                int i10 = z4 ? i8 : i7;
                                if (!z4) {
                                    i7 = i8;
                                }
                                MediaCodecInfo.CodecCapabilities codecCapabilities = oooO00o.f14438OooO0Oo;
                                if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                                    pointOooO00o = com.google.android.exoplayer2.mediacodec.OooO00o.OooO00o(videoCapabilities, i10, i7);
                                }
                                Point point2 = pointOooO00o;
                                pointOooO00o = point2;
                                str = str2;
                                if (oooO00o.OooO0oO(point2.x, point2.y, format.f13138OooooOO)) {
                                    point = pointOooO00o;
                                } else {
                                    i6++;
                                    iArr = iArr2;
                                    i3 = i9;
                                    f2 = f3;
                                    str2 = str;
                                }
                            } else {
                                str = str2;
                                try {
                                    int i11 = (((i7 + 16) - 1) / 16) * 16;
                                    int i12 = (((i8 + 16) - 1) / 16) * 16;
                                    if (i11 * i12 <= MediaCodecUtil.OooO()) {
                                        int i13 = z4 ? i12 : i11;
                                        if (!z4) {
                                            i11 = i12;
                                        }
                                        point = new Point(i13, i11);
                                    } else {
                                        i6++;
                                        iArr = iArr2;
                                        i3 = i9;
                                        f2 = f3;
                                        str2 = str;
                                    }
                                } catch (MediaCodecUtil.DecoderQueryException unused) {
                                    point = pointOooO00o;
                                }
                            }
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            iO00000O0 = Math.max(iO00000O0, o000000o(oooO00o, format.f13131OoooOOo, iMax, iMax2));
                            StringBuilder sb2 = new StringBuilder(57);
                            sb2.append("Codec max resolution adjusted to: ");
                            sb2.append(iMax);
                            sb2.append("x");
                            sb2.append(iMax2);
                            Log.w("MediaCodecVideoRenderer", sb2.toString());
                        }
                    }
                    str = str2;
                    point = pointOooO00o;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        iO00000O0 = Math.max(iO00000O0, o000000o(oooO00o, format.f13131OoooOOo, iMax, iMax2));
                        StringBuilder sb3 = new StringBuilder(57);
                        sb3.append("Codec max resolution adjusted to: ");
                        sb3.append(iMax);
                        sb3.append("x");
                        sb3.append(iMax2);
                        Log.w("MediaCodecVideoRenderer", sb3.toString());
                    }
                }
            } else {
                str = str2;
            }
            oooO00o2 = new OooO00o(iMax, iMax2, iO00000O0);
        }
        this.f36839o000O0 = oooO00o2;
        boolean z5 = this.f36841o000O00O;
        int i14 = this.f36871o000o0OO;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, format.f13136Ooooo0o);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, format.f13137OooooO0);
        Oooo000.OooO0O0(mediaFormat, format.f13133OoooOoO);
        float f4 = format.f13138OooooOO;
        if (f4 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f4);
        }
        Oooo000.OooO00o(mediaFormat, "rotation-degrees", format.f13139OooooOo);
        ColorInfo colorInfo = format.f13143Ooooooo;
        if (colorInfo != null) {
            Oooo000.OooO00o(mediaFormat, "color-transfer", colorInfo.f14898Oooo0oo);
            Oooo000.OooO00o(mediaFormat, "color-standard", colorInfo.f14896Oooo0o);
            Oooo000.OooO00o(mediaFormat, "color-range", colorInfo.f14897Oooo0oO);
            byte[] bArr = colorInfo.f14895Oooo;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(format.f13131OoooOOo) && (pairOooO0OO = MediaCodecUtil.OooO0OO(format)) != null) {
            Oooo000.OooO00o(mediaFormat, Scopes.PROFILE, ((Integer) pairOooO0OO.first).intValue());
        }
        mediaFormat.setInteger("max-width", oooO00o2.f36876OooO00o);
        mediaFormat.setInteger("max-height", oooO00o2.f36877OooO0O0);
        Oooo000.OooO00o(mediaFormat, "max-input-size", oooO00o2.f36878OooO0OO);
        int i15 = o000OOo0.f36740OooO00o;
        if (i15 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z5) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i14 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i14);
        }
        if (this.f36843o000O0O0 == null) {
            if (!o0000O0(oooO00o)) {
                throw new IllegalStateException();
            }
            if (this.f36847o000O0oO == null) {
                this.f36847o000O0oO = DummySurface.OooO0OO(this.f36845o000O0o, oooO00o.f14439OooO0o);
            }
            this.f36843o000O0O0 = this.f36847o000O0oO;
        }
        oooOOOO.OooO0Oo(mediaFormat, this.f36843o000O0O0, mediaCrypto);
        if (i15 < 23 || !this.f36869o000o0O) {
            return;
        }
        this.f36872o000o0Oo = new OooO0O0(oooOOOO.OooO0oO());
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final MediaCodecDecoderException Oooo0o0(Throwable th, @Nullable com.google.android.exoplayer2.mediacodec.OooO00o oooO00o) {
        return new MediaCodecVideoDecoderException(th, oooO00o, this.f36843o000O0O0);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean OoooOO0() {
        return this.f36869o000o0O && o000OOo0.f36740OooO00o < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final List<com.google.android.exoplayer2.mediacodec.OooO00o> OoooOOO(com.google.android.exoplayer2.mediacodec.OooO0O0 oooO0O0, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException {
        return o00000(oooO0O0, format, z, this.f36869o000o0O);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    public final void OoooOo0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.f36850o000OO0O) {
            ByteBuffer byteBuffer = decoderInputBuffer.f13645OoooO00;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    MediaCodec mediaCodec = this.f14420oo000o;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    mediaCodec.setParameters(bundle);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Ooooo0o(final String str, final long j, final long j2) {
        final o00OOO0O.OooO00o oooO00o = this.f36842o000O0O;
        Handler handler = oooO00o.f36830OooO00o;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o0O0oOoO.o00OOO00
                @Override // java.lang.Runnable
                public final void run() {
                    o00OOO0O.OooO00o oooO00o2 = oooO00o;
                    String str2 = str;
                    long j3 = j;
                    long j4 = j2;
                    o00OOO0O o00ooo0o2 = oooO00o2.f36831OooO0O0;
                    int i = o000OOo0.f36740OooO00o;
                    o00ooo0o2.OooOO0(str2, j3, j4);
                }
            });
        }
        this.f36844o000O0Oo = o000000(str);
        com.google.android.exoplayer2.mediacodec.OooO00o oooO00o2 = this.f14413o0OO00O;
        Objects.requireNonNull(oooO00o2);
        boolean z = false;
        if (o000OOo0.f36740OooO00o >= 29 && "video/x-vnd.on2.vp9".equals(oooO00o2.f14436OooO0O0)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : oooO00o2.OooO0OO()) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.f36850o000OO0O = z;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void OooooO0(o0000O0O o0000o0o2) throws ExoPlaybackException {
        super.OooooO0(o0000o0o2);
        final o00OOO0O.OooO00o oooO00o = this.f36842o000O0O;
        final Format format = o0000o0o2.f40508OooO0O0;
        Handler handler = oooO00o.f36830OooO00o;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o0O0oOoO.o00OO
                @Override // java.lang.Runnable
                public final void run() {
                    o00OOO0O.OooO00o oooO00o2 = oooO00o;
                    Format format2 = format;
                    o00OOO0O o00ooo0o2 = oooO00o2.f36831OooO0O0;
                    int i = o000OOo0.f36740OooO00o;
                    o00ooo0o2.Oooo000(format2);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void OooooOO(Format format, @Nullable MediaFormat mediaFormat) {
        MediaCodec mediaCodec = this.f14420oo000o;
        if (mediaCodec != null) {
            mediaCodec.setVideoScalingMode(this.f36838o000O);
        }
        if (this.f36869o000o0O) {
            this.f36862o000Ooo0 = format.f13136Ooooo0o;
            this.f36863o000OooO = format.f13137OooooO0;
        } else {
            Objects.requireNonNull(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f36862o000Ooo0 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
            this.f36863o000OooO = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
        }
        float f = format.f13141Oooooo0;
        this.f36866o000o000 = f;
        if (o000OOo0.f36740OooO00o >= 21) {
            int i = format.f13139OooooOo;
            if (i == 90 || i == 270) {
                int i2 = this.f36862o000Ooo0;
                this.f36862o000Ooo0 = this.f36863o000OooO;
                this.f36863o000OooO = i2;
                this.f36866o000o000 = 1.0f / f;
            }
        } else {
            this.f36864o000Oooo = format.f13139OooooOo;
        }
        this.f36865o000o00 = format.f13138OooooOO;
        o0000O(false);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public final void OooooOo(long j) {
        super.OooooOo(j);
        if (this.f36869o000o0O) {
            return;
        }
        this.f36858o000Oo0o--;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public final void Oooooo(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        boolean z = this.f36869o000o0O;
        if (!z) {
            this.f36858o000Oo0o++;
        }
        if (o000OOo0.f36740OooO00o >= 23 || !z) {
            return;
        }
        o00000oo(decoderInputBuffer.f13640Oooo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Oooooo0() {
        oo0o0Oo();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean Ooooooo(long j, long j2, @Nullable MediaCodec mediaCodec, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException {
        boolean z3;
        long j4;
        long j5;
        boolean z4;
        boolean z5;
        long j6;
        Objects.requireNonNull(mediaCodec);
        if (this.f36852o000OOO == -9223372036854775807L) {
            this.f36852o000OOO = j;
        }
        long j7 = this.f14366o000;
        long j8 = j3 - j7;
        if (z && !z2) {
            o0000O0O(mediaCodec, i);
            return true;
        }
        long j9 = j3 - j;
        if (this.f36843o000O0O0 == this.f36847o000O0oO) {
            if (!o00000O(j9)) {
                return false;
            }
            o0000O0O(mediaCodec, i);
            o0000OO0(j9);
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j10 = jElapsedRealtime - this.f36855o000Oo;
        boolean z6 = this.f13206OoooO00 == 2;
        boolean z7 = this.f36851o000OO0o ? !this.f36849o000OO00 : z6 || this.f36874o0OoO0o;
        if (this.f36853o000OOo0 != -9223372036854775807L || j < j7) {
            z3 = false;
        } else {
            if (!z7) {
                if (z6) {
                    if (o00000O(j9) && j10 > 100000) {
                    }
                }
                z3 = false;
            }
            z3 = true;
        }
        if (z3) {
            long jNanoTime = System.nanoTime();
            o00000oO(j8, jNanoTime, format);
            if (o000OOo0.f36740OooO00o >= 21) {
                o0000O00(mediaCodec, i, jNanoTime);
            } else {
                o0000(mediaCodec, i);
            }
            o0000OO0(j9);
            return true;
        }
        if (!z6 || j == this.f36852o000OOO) {
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        long j11 = ((j9 - (jElapsedRealtime - j2)) * 1000) + jNanoTime2;
        o00O o00o2 = this.f36861o000Ooo;
        long j12 = j3 * 1000;
        if (o00o2.f36770OooO) {
            if (j3 != o00o2.f36775OooO0o) {
                o00o2.f36781OooOO0o++;
                o00o2.f36777OooO0oO = o00o2.f36778OooO0oo;
            }
            long j13 = o00o2.f36781OooOO0o;
            if (j13 >= 6) {
                long j14 = o00o2.f36777OooO0oO + ((j12 - o00o2.f36780OooOO0O) / j13);
                if (o00o2.OooO00o(j14, j11)) {
                    o00o2.f36770OooO = false;
                } else {
                    j5 = (o00o2.f36779OooOO0 + j14) - o00o2.f36780OooOO0O;
                    j4 = j14;
                }
            } else if (o00o2.OooO00o(j12, j11)) {
                o00o2.f36770OooO = false;
            }
            j4 = j12;
            j5 = j11;
        } else {
            j4 = j12;
            j5 = j11;
        }
        if (!o00o2.f36770OooO) {
            o00o2.f36780OooOO0O = j12;
            o00o2.f36779OooOO0 = j11;
            o00o2.f36781OooOO0o = 0L;
            o00o2.f36770OooO = true;
        }
        o00o2.f36775OooO0o = j3;
        o00o2.f36778OooO0oo = j4;
        o00O.OooO0O0 oooO0O0 = o00o2.f36772OooO0O0;
        if (oooO0O0 != null && o00o2.f36774OooO0Oo != -9223372036854775807L) {
            long j15 = oooO0O0.f36786Oooo0o;
            if (j15 != -9223372036854775807L) {
                long j16 = o00o2.f36774OooO0Oo;
                long j17 = (((j5 - j15) / j16) * j16) + j15;
                if (j5 <= j17) {
                    j6 = j17 - j16;
                } else {
                    j6 = j17;
                    j17 = j16 + j17;
                }
                if (j17 - j5 >= j5 - j6) {
                    j17 = j6;
                }
                j5 = j17 - o00o2.f36776OooO0o0;
            }
        }
        long j18 = (j5 - jNanoTime2) / 1000;
        boolean z8 = this.f36853o000OOo0 != -9223372036854775807L;
        if (((j18 > (-500000L) ? 1 : (j18 == (-500000L) ? 0 : -1)) < 0) && !z2) {
            SampleStream sampleStream = this.f13205OoooO0;
            Objects.requireNonNull(sampleStream);
            int iOooO0OO = sampleStream.OooO0OO(j - this.f13204OoooO);
            if (iOooO0OO == 0) {
                z5 = false;
            } else {
                Objects.requireNonNull(this.f14400o0000oo0);
                int i4 = this.f36858o000Oo0o + iOooO0OO;
                if (!z8) {
                    o000OO(i4);
                }
                OoooO0();
                z5 = true;
            }
            if (z5) {
                return false;
            }
        }
        if (o00000O(j18) && !z2) {
            if (z8) {
                o0000O0O(mediaCodec, i);
                z4 = true;
            } else {
                o000O.OooO00o("dropVideoBuffer");
                mediaCodec.releaseOutputBuffer(i, false);
                o000O.OooO0O0();
                z4 = true;
                o000OO(1);
            }
            o0000OO0(j18);
            return z4;
        }
        if (o000OOo0.f36740OooO00o >= 21) {
            if (j18 >= 50000) {
                return false;
            }
            o00000oO(j8, j5, format);
            o0000O00(mediaCodec, i, j5);
            o0000OO0(j18);
            return true;
        }
        if (j18 >= 30000) {
            return false;
        }
        if (j18 > 11000) {
            try {
                Thread.sleep((j18 - 10000) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        o00000oO(j8, j5, format);
        o0000(mediaCodec, i);
        o0000OO0(j18);
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    public final void o0000(MediaCodec mediaCodec, int i) {
        o00000o0();
        o000O.OooO00o("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        o000O.OooO0O0();
        this.f36855o000Oo = SystemClock.elapsedRealtime() * 1000;
        Objects.requireNonNull(this.f14400o0000oo0);
        this.f36857o000Oo0O = 0;
        o00000Oo();
    }

    public final boolean o000000(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (oo0o0O0.class) {
            if (!f36836o000o0oo) {
                f36837o000oOoo = o000000O();
                f36836o000o0oo = true;
            }
        }
        return f36837o000oOoo;
    }

    public final void o00000OO() {
        if (this.f36856o000Oo00 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            final long j = jElapsedRealtime - this.f36854o000OOoO;
            final o00OOO0O.OooO00o oooO00o = this.f36842o000O0O;
            final int i = this.f36856o000Oo00;
            Handler handler = oooO00o.f36830OooO00o;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o0O0oOoO.o00OO0O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00OOO0O.OooO00o oooO00o2 = oooO00o;
                        int i2 = i;
                        long j2 = j;
                        o00OOO0O o00ooo0o2 = oooO00o2.f36831OooO0O0;
                        int i3 = o000OOo0.f36740OooO00o;
                        o00ooo0o2.OooOoO0(i2, j2);
                    }
                });
            }
            this.f36856o000Oo00 = 0;
            this.f36854o000OOoO = jElapsedRealtime;
        }
    }

    public final void o00000Oo() {
        this.f36851o000OO0o = true;
        if (this.f36849o000OO00) {
            return;
        }
        this.f36849o000OO00 = true;
        o00OOO0O.OooO00o oooO00o = this.f36842o000O0O;
        Surface surface = this.f36843o000O0O0;
        Handler handler = oooO00o.f36830OooO00o;
        if (handler != null) {
            handler.post(new oo0O(oooO00o, surface));
        }
        this.f36848o000O0oo = true;
    }

    public final void o00000o0() {
        int i = this.f36862o000Ooo0;
        if (i == -1 && this.f36863o000OooO == -1) {
            return;
        }
        if (this.f36867o000o00O == i && this.f36868o000o00o == this.f36863o000OooO && this.f36875oooo00o == this.f36864o000Oooo && this.f36870o000o0O0 == this.f36866o000o000) {
            return;
        }
        o00OOO0O.OooO00o oooO00o = this.f36842o000O0O;
        int i2 = this.f36863o000OooO;
        int i3 = this.f36864o000Oooo;
        float f = this.f36866o000o000;
        Handler handler = oooO00o.f36830OooO00o;
        if (handler != null) {
            handler.post(new o00OO00O(oooO00o, i, i2, i3, f));
        }
        this.f36867o000o00O = this.f36862o000Ooo0;
        this.f36868o000o00o = this.f36863o000OooO;
        this.f36875oooo00o = this.f36864o000Oooo;
        this.f36870o000o0O0 = this.f36866o000o000;
    }

    public final void o00000oO(long j, long j2, Format format) {
        oo0oOO0 oo0ooo0 = this.f36873o000o0o0;
        if (oo0ooo0 != null) {
            oo0ooo0.OooO00o();
        }
    }

    public final void o00000oo(long j) throws ExoPlaybackException {
        o0OO00O(j);
        o00000o0();
        Objects.requireNonNull(this.f14400o0000oo0);
        o00000Oo();
        OooooOo(j);
    }

    public final void o0000O(boolean z) {
        Surface surface;
        if (o000OOo0.f36740OooO00o < 30 || (surface = this.f36843o000O0O0) == null || surface == this.f36847o000O0oO) {
            return;
        }
        float f = this.f13206OoooO00 == 2 && (this.f36865o000o00 > (-1.0f) ? 1 : (this.f36865o000o00 == (-1.0f) ? 0 : -1)) != 0 ? this.f36865o000o00 * this.f14411o00ooo : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (this.f36846o000O0o0 != f || z) {
            this.f36846o000O0o0 = f;
            o0000oO(surface, f);
        }
    }

    public final boolean o0000O0(com.google.android.exoplayer2.mediacodec.OooO00o oooO00o) {
        return o000OOo0.f36740OooO00o >= 23 && !this.f36869o000o0O && !o000000(oooO00o.f14435OooO00o) && (!oooO00o.f14439OooO0o || DummySurface.OooO0O0(this.f36845o000O0o));
    }

    @RequiresApi(21)
    public final void o0000O00(MediaCodec mediaCodec, int i, long j) {
        o00000o0();
        o000O.OooO00o("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        o000O.OooO0O0();
        this.f36855o000Oo = SystemClock.elapsedRealtime() * 1000;
        Objects.requireNonNull(this.f14400o0000oo0);
        this.f36857o000Oo0O = 0;
        o00000Oo();
    }

    public final void o0000O0O(MediaCodec mediaCodec, int i) {
        o000O.OooO00o("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        o000O.OooO0O0();
        Objects.requireNonNull(this.f14400o0000oo0);
    }

    public final void o0000OO0(long j) {
        Objects.requireNonNull(this.f14400o0000oo0);
        this.f36859o000OoOO += j;
        this.f36860o000OoOo++;
    }

    public final void o0000Ooo() {
        int i = this.f36867o000o00O;
        if (i == -1 && this.f36868o000o00o == -1) {
            return;
        }
        o00OOO0O.OooO00o oooO00o = this.f36842o000O0O;
        int i2 = this.f36868o000o00o;
        int i3 = this.f36875oooo00o;
        float f = this.f36870o000o0O0;
        Handler handler = oooO00o.f36830OooO00o;
        if (handler != null) {
            handler.post(new o00OO00O(oooO00o, i, i2, i3, f));
        }
    }

    @RequiresApi(30)
    public final void o0000oO(Surface surface, float f) {
        Method method = f36835o000o0oO;
        if (method == null) {
            Log.e("MediaCodecVideoRenderer", "Failed to call Surface.setFrameRate (method does not exist)");
        }
        try {
            method.invoke(surface, Float.valueOf(f), Integer.valueOf(f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 0 : 1));
        } catch (Exception e) {
            o0000oo.OooO0O0("MediaCodecVideoRenderer", "Failed to call Surface.setFrameRate", e);
        }
    }

    public final void o0000oo() {
        this.f36853o000OOo0 = this.o000Oo0 > 0 ? SystemClock.elapsedRealtime() + this.o000Oo0 : -9223372036854775807L;
    }

    public final void o000OO(int i) {
        o0O0O00 o0o0o00 = this.f14400o0000oo0;
        Objects.requireNonNull(o0o0o00);
        this.f36856o000Oo00 += i;
        int i2 = this.f36857o000Oo0O + i;
        this.f36857o000Oo0O = i2;
        o0o0o00.f35836OooO00o = Math.max(i2, o0o0o00.f35836OooO00o);
        int i3 = this.f36840o000O00;
        if (i3 <= 0 || this.f36856o000Oo00 < i3) {
            return;
        }
        o00000OO();
    }

    public final void o000OOo() {
        Surface surface;
        if (o000OOo0.f36740OooO00o < 30 || (surface = this.f36843o000O0O0) == null || surface == this.f36847o000O0oO || this.f36846o000O0o0 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return;
        }
        this.f36846o000O0o0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        o0000oO(surface, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final float o000oOoO(float f, Format[] formatArr) {
        float fMax = -1.0f;
        for (Format format : formatArr) {
            float f2 = format.f13138OooooOO;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public final void o00Ooo() {
        super.o00Ooo();
        this.f36858o000Oo0o = 0;
    }

    public final void o0O0O00() {
        this.f36867o000o00O = -1;
        this.f36868o000o00o = -1;
        this.f36870o000o0O0 = -1.0f;
        this.f36875oooo00o = -1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean o0ooOO0(com.google.android.exoplayer2.mediacodec.OooO00o oooO00o) {
        return this.f36843o000O0O0 != null || o0000O0(oooO00o);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final int o0ooOoO(com.google.android.exoplayer2.mediacodec.OooO0O0 oooO0O0, Format format) throws MediaCodecUtil.DecoderQueryException {
        int i = 0;
        if (!o000OO.OooO(format.f13131OoooOOo)) {
            return 0;
        }
        boolean z = format.f13134OoooOoo != null;
        List<com.google.android.exoplayer2.mediacodec.OooO00o> listO00000 = o00000(oooO0O0, format, z, false);
        if (z && listO00000.isEmpty()) {
            listO00000 = o00000(oooO0O0, format, false, false);
        }
        if (listO00000.isEmpty()) {
            return 1;
        }
        Class<? extends p301o0O0Oooo.o000OOo0> cls = format.f13149o00ooo;
        if (!(cls == null || o00.class.equals(cls))) {
            return 2;
        }
        com.google.android.exoplayer2.mediacodec.OooO00o oooO00o = listO00000.get(0);
        boolean zOooO0Oo = oooO00o.OooO0Oo(format);
        int i2 = oooO00o.OooO0o0(format) ? 16 : 8;
        if (zOooO0Oo) {
            List<com.google.android.exoplayer2.mediacodec.OooO00o> listO00001 = o00000(oooO0O0, format, z, true);
            if (!listO00001.isEmpty()) {
                com.google.android.exoplayer2.mediacodec.OooO00o oooO00o2 = listO00001.get(0);
                if (oooO00o2.OooO0Oo(format) && oooO00o2.OooO0o0(format)) {
                    i = 32;
                }
            }
        }
        return (zOooO0Oo ? 4 : 3) | i2 | i;
    }

    public final void oo0o0Oo() {
        MediaCodec mediaCodec;
        this.f36849o000OO00 = false;
        if (o000OOo0.f36740OooO00o < 23 || !this.f36869o000o0O || (mediaCodec = this.f14420oo000o) == null) {
            return;
        }
        this.f36872o000o0Oo = new OooO0O0(mediaCodec);
    }
}
