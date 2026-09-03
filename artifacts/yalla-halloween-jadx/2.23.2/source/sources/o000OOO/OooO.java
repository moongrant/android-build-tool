package o000OOO;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.o00Ooo;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.Scopes;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import io.agora.rtc.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import o000O00O.o00O;
import o000O00O.o00O0000;
import o000O00O.o00OO000;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.conscrypt.PSKKeyManager;
import p037OoooOo0.o0O0ooO;
import p069o0000ooO.o00000OO;
import p069o0000ooO.o0000oo;
import p080o000OoO.o00;
import p080o000OoO.o000OO0O;
import p080o000OoO.o000Oo0;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO extends MediaCodecRenderer {

    /* JADX INFO: renamed from: o000O0O, reason: collision with root package name */
    public static boolean f34476o000O0O;

    /* JADX INFO: renamed from: o000O0o, reason: collision with root package name */
    public static final int[] f34477o000O0o = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: o000Ooo, reason: collision with root package name */
    public static boolean f34478o000Ooo;

    /* JADX INFO: renamed from: o000, reason: collision with root package name */
    public int f34479o000;

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public OooO0O0 f34480o0000;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public final Context f34481o00000O;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public final OooOOOO f34482o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public final o0OoOo0.OooO00o f34483o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public final OooO0o f34484o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public final int f34485o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public final boolean f34486o00000oo;

    /* JADX INFO: renamed from: o0000O, reason: collision with root package name */
    public boolean f34487o0000O;

    /* JADX INFO: renamed from: o0000O0, reason: collision with root package name */
    @Nullable
    public PlaceholderSurface f34488o0000O0;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public boolean f34489o0000O00;

    /* JADX INFO: renamed from: o0000O0O, reason: collision with root package name */
    public boolean f34490o0000O0O;

    /* JADX INFO: renamed from: o0000OO, reason: collision with root package name */
    public boolean f34491o0000OO;

    /* JADX INFO: renamed from: o0000OO0, reason: collision with root package name */
    public boolean f34492o0000OO0;

    /* JADX INFO: renamed from: o0000OOO, reason: collision with root package name */
    public long f34493o0000OOO;

    /* JADX INFO: renamed from: o0000OOo, reason: collision with root package name */
    public long f34494o0000OOo;

    /* JADX INFO: renamed from: o0000Oo, reason: collision with root package name */
    public int f34495o0000Oo;

    /* JADX INFO: renamed from: o0000Oo0, reason: collision with root package name */
    public long f34496o0000Oo0;

    /* JADX INFO: renamed from: o0000OoO, reason: collision with root package name */
    public int f34497o0000OoO;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public final long f34498o0000Ooo;

    /* JADX INFO: renamed from: o0000o, reason: collision with root package name */
    public long f34499o0000o;

    /* JADX INFO: renamed from: o0000o0, reason: collision with root package name */
    public int f34500o0000o0;

    /* JADX INFO: renamed from: o0000o0O, reason: collision with root package name */
    public long f34501o0000o0O;

    /* JADX INFO: renamed from: o0000o0o, reason: collision with root package name */
    public long f34502o0000o0o;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    @Nullable
    public Surface f34503o0000oO;

    /* JADX INFO: renamed from: o0000oO0, reason: collision with root package name */
    public int f34504o0000oO0;

    /* JADX INFO: renamed from: o0000oOO, reason: collision with root package name */
    public long f34505o0000oOO;

    /* JADX INFO: renamed from: o0000oOo, reason: collision with root package name */
    public o00Ooo f34506o0000oOo;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public boolean f34507o0000oo;

    /* JADX INFO: renamed from: o0000oo0, reason: collision with root package name */
    @Nullable
    public o00Ooo f34508o0000oo0;

    /* JADX INFO: renamed from: o0000ooO, reason: collision with root package name */
    public boolean f34509o0000ooO;

    /* JADX INFO: renamed from: o000O000, reason: collision with root package name */
    @Nullable
    public OooO0OO f34510o000O000;

    /* JADX INFO: renamed from: o000OO, reason: collision with root package name */
    public int f34511o000OO;

    /* JADX INFO: renamed from: o000OoO, reason: collision with root package name */
    @Nullable
    public OooOO0O f34512o000OoO;

    @RequiresApi(26)
    public static final class OooO00o {
        @DoNotInline
        public static boolean OooO00o(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f34513OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f34514OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f34515OooO0OO;

        public OooO0O0(int i, int i2, int i3) {
            this.f34513OooO00o = i;
            this.f34514OooO0O0 = i2;
            this.f34515OooO0OO = i3;
        }
    }

    @RequiresApi(23)
    public final class OooO0OO implements androidx.media3.exoplayer.mediacodec.OooO0OO.InterfaceC0149OooO0OO, Handler.Callback {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Handler f34516OooO0Oo;

        public OooO0OO(androidx.media3.exoplayer.mediacodec.OooO0OO oooO0OO) {
            Handler handlerOooOO0o = o00.OooOO0o(this);
            this.f34516OooO0Oo = handlerOooOO0o;
            oooO0OO.OooO00o(this, handlerOooOO0o);
        }

        public final void OooO00o(long j) {
            OooO oooO = OooO.this;
            if (this != oooO.f34510o000O000 || oooO.f7677Oooo0o == null) {
                return;
            }
            if (j == LongCompanionObject.MAX_VALUE) {
                oooO.f7713o0O0O00 = true;
                return;
            }
            try {
                oooO.o0OO00O(j);
                oooO.o00000O(oooO.f34506o0000oOo);
                oooO.f7701o000000.f33964OooO0o0++;
                oooO.o00000O0();
                oooO.Oooooo(j);
            } catch (ExoPlaybackException e) {
                oooO.f7704o000OOo = e;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i = message.arg1;
            int i2 = message.arg2;
            int i3 = o00.f34910OooO00o;
            OooO00o(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
            return true;
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOOO f34519OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO f34520OooO0O0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public CopyOnWriteArrayList<o00000OO> f34523OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Handler f34524OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Pair<Long, androidx.media3.common.OooOO0> f34525OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public Pair<Surface, o000Oo0> f34526OooO0oo;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f34528OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f34529OooOO0o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayDeque<Long> f34521OooO0OO = new ArrayDeque<>();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ArrayDeque<Pair<Long, androidx.media3.common.OooOO0>> f34522OooO0Oo = new ArrayDeque<>();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f34518OooO = -1;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f34527OooOO0 = true;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final o00Ooo f34531OooOOO0 = o00Ooo.f6864OooO0oo;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public long f34530OooOOO = -9223372036854775807L;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public long f34532OooOOOO = -9223372036854775807L;

        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static Constructor<?> f34533OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public static Method f34534OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public static Method f34535OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static Constructor<?> f34536OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public static Method f34537OooO0o0;

            @EnsuresNonNull({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod", "videoFrameProcessorFactoryBuilderConstructor", "buildVideoFrameProcessorFactoryMethod"})
            public static void OooO00o() throws Exception {
                if (f34533OooO00o == null || f34534OooO0O0 == null || f34535OooO0OO == null) {
                    Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                    f34533OooO00o = cls.getConstructor(new Class[0]);
                    f34534OooO0O0 = cls.getMethod("setRotationDegrees", Float.TYPE);
                    f34535OooO0OO = cls.getMethod("build", new Class[0]);
                }
                if (f34536OooO0Oo == null || f34537OooO0o0 == null) {
                    Class<?> cls2 = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    f34536OooO0Oo = cls2.getConstructor(new Class[0]);
                    f34537OooO0o0 = cls2.getMethod("build", new Class[0]);
                }
            }
        }

        public OooO0o(OooOOOO oooOOOO, OooO oooO) {
            this.f34519OooO00o = oooOOOO;
            this.f34520OooO0O0 = oooO;
        }

        public final void OooO00o() {
            o00Oo0.OooO0o(null);
            throw null;
        }

        public final boolean OooO0O0() {
            return false;
        }

        public final boolean OooO0OO(androidx.media3.common.OooOO0 oooOO1, long j, boolean z) {
            o00Oo0.OooO0o(null);
            o00Oo0.OooO0Oo(this.f34518OooO != -1);
            throw null;
        }

        public final void OooO0Oo(long j) {
            o00Oo0.OooO0o(null);
            throw null;
        }

        public final void OooO0o() {
            throw null;
        }

        public final void OooO0o0(long j, long j2) {
            o00Oo0.OooO0o(null);
            while (true) {
                ArrayDeque<Long> arrayDeque = this.f34521OooO0OO;
                if (arrayDeque.isEmpty()) {
                    return;
                }
                OooO oooO = this.f34520OooO0O0;
                boolean z = oooO.f7201OooOO0 == 2;
                Long lPeek = arrayDeque.peek();
                lPeek.getClass();
                long jLongValue = lPeek.longValue();
                long j3 = jLongValue + this.f34532OooOOOO;
                long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                long j4 = (long) ((j3 - j) / ((double) oooO.f7676Oooo0OO));
                if (z) {
                    j4 -= jElapsedRealtime - j2;
                }
                if (oooO.o00000oO(j, j4)) {
                    OooO0Oo(-1L);
                    return;
                }
                if (!z || j == oooO.f34493o0000OOO || j4 > 50000) {
                    return;
                }
                OooOOOO oooOOOO = this.f34519OooO00o;
                oooOOOO.OooO0OO(j3);
                long jOooO00o = oooOOOO.OooO00o((j4 * 1000) + System.nanoTime());
                long jNanoTime = (jOooO00o - System.nanoTime()) / 1000;
                oooO.getClass();
                if (jNanoTime < -30000) {
                    OooO0Oo(-2L);
                } else {
                    ArrayDeque<Pair<Long, androidx.media3.common.OooOO0>> arrayDeque2 = this.f34522OooO0Oo;
                    if (!arrayDeque2.isEmpty() && j3 > ((Long) arrayDeque2.peek().first).longValue()) {
                        this.f34525OooO0oO = arrayDeque2.remove();
                    }
                    this.f34520OooO0O0.o00000OO(jLongValue, jOooO00o, (androidx.media3.common.OooOO0) this.f34525OooO0oO.second);
                    if (this.f34530OooOOO >= j3) {
                        this.f34530OooOOO = -9223372036854775807L;
                        oooO.o00000O(this.f34531OooOOO0);
                    }
                    OooO0Oo(jOooO00o);
                }
            }
        }

        public final void OooO0oO(androidx.media3.common.OooOO0 oooOO1) {
            throw null;
        }

        public final void OooO0oo(Surface surface, o000Oo0 o000oo1) {
            Pair<Surface, o000Oo0> pair = this.f34526OooO0oo;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((o000Oo0) this.f34526OooO0oo.second).equals(o000oo1)) {
                return;
            }
            this.f34526OooO0oo = Pair.create(surface, o000oo1);
            if (OooO0O0()) {
                throw null;
            }
        }
    }

    public OooO(Context context, androidx.media3.exoplayer.mediacodec.OooO0O0 oooO0O0, boolean z, @Nullable Handler handler, @Nullable androidx.media3.exoplayer.OooO.OooO0O0 oooO0O1) {
        super(2, oooO0O0, z, 30.0f);
        this.f34498o0000Ooo = 5000L;
        this.f34485o00000oO = 50;
        Context applicationContext = context.getApplicationContext();
        this.f34481o00000O = applicationContext;
        OooOOOO oooOOOO = new OooOOOO(applicationContext);
        this.f34482o00000OO = oooOOOO;
        this.f34483o00000Oo = new o0OoOo0.OooO00o(handler, oooO0O1);
        this.f34484o00000o0 = new OooO0o(oooOOOO, this);
        this.f34486o00000oo = "NVIDIA".equals(o00.f34912OooO0OO);
        this.f34494o0000OOo = -9223372036854775807L;
        this.f34511o000OO = 1;
        this.f34506o0000oOo = o00Ooo.f6864OooO0oo;
        this.f34479o000 = 0;
        this.f34508o0000oo0 = null;
    }

    public static int o000000(androidx.media3.common.OooOO0 oooOO1, androidx.media3.exoplayer.mediacodec.OooO0o oooO0o) {
        int i;
        int iIntValue;
        int i2 = oooOO1.f6419OooOo00;
        if (i2 == -1 || (i = oooOO1.f6418OooOo0) == -1) {
            return -1;
        }
        String str = oooOO1.f6412OooOOOO;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> pairOooO0Oo = MediaCodecUtil.OooO0Oo(oooOO1);
            str = (pairOooO0Oo == null || !((iIntValue = ((Integer) pairOooO0Oo.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                return ((i2 * i) * 3) / 4;
            case "video/hevc":
                return Math.max(2097152, ((i2 * i) * 3) / 4);
            case "video/avc":
                String str2 = o00.f34913OooO0Oo;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(o00.f34912OooO0OO) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && oooO0o.f7758OooO0o)))) {
                    return -1;
                }
                return (((((((i + 16) - 1) / 16) * (((i2 + 16) - 1) / 16)) * 16) * 16) * 3) / 4;
            case "video/x-vnd.on2.vp9":
                return ((i2 * i) * 3) / 8;
            default:
                return -1;
        }
    }

    public static List<androidx.media3.exoplayer.mediacodec.OooO0o> o000000O(Context context, androidx.media3.exoplayer.mediacodec.OooO oooO, androidx.media3.common.OooOO0 oooOO1, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException {
        List<androidx.media3.exoplayer.mediacodec.OooO0o> listOooO00o;
        List<androidx.media3.exoplayer.mediacodec.OooO0o> listOooO00o2;
        String str = oooOO1.f6412OooOOOO;
        if (str == null) {
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
            return o0O00.f19060OooO0oo;
        }
        if (o00.f34910OooO00o >= 26 && "video/dolby-vision".equals(str) && !OooO00o.OooO00o(context)) {
            String strOooO0O0 = MediaCodecUtil.OooO0O0(oooOO1);
            if (strOooO0O0 == null) {
                ImmutableList.OooO0O0 oooO0O1 = ImmutableList.f18681OooO0o0;
                listOooO00o2 = o0O00.f19060OooO0oo;
            } else {
                listOooO00o2 = oooO.OooO00o(strOooO0O0, z, z2);
            }
            if (!listOooO00o2.isEmpty()) {
                return listOooO00o2;
            }
        }
        Pattern pattern = MediaCodecUtil.f7732OooO00o;
        List<androidx.media3.exoplayer.mediacodec.OooO0o> listOooO00o3 = oooO.OooO00o(oooOO1.f6412OooOOOO, z, z2);
        String strOooO0O1 = MediaCodecUtil.OooO0O0(oooOO1);
        if (strOooO0O1 == null) {
            ImmutableList.OooO0O0 oooO0O2 = ImmutableList.f18681OooO0o0;
            listOooO00o = o0O00.f19060OooO0oo;
        } else {
            listOooO00o = oooO.OooO00o(strOooO0O1, z, z2);
        }
        ImmutableList.OooO0O0 oooO0O3 = ImmutableList.f18681OooO0o0;
        ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
        oooO00o.OooO0o(listOooO00o3);
        oooO00o.OooO0o(listOooO00o);
        return oooO00o.OooO0oo();
    }

    public static int o000000o(androidx.media3.common.OooOO0 oooOO1, androidx.media3.exoplayer.mediacodec.OooO0o oooO0o) {
        if (oooOO1.f6413OooOOOo == -1) {
            return o000000(oooOO1, oooO0o);
        }
        List<byte[]> list = oooOO1.f6415OooOOo0;
        int size = list.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += list.get(i).length;
        }
        return oooOO1.f6413OooOOOo + length;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean o000OOo() {
        int i = o00.f34910OooO00o;
        byte b = 7;
        if (i <= 28) {
            String str = o00.f34911OooO0O0;
            str.getClass();
            switch (str) {
                case "dangal":
                case "dangalFHD":
                case "dangalUHD":
                case "oneday":
                case "aquaman":
                case "magnolia":
                case "once":
                case "machuca":
                    return true;
            }
        }
        if (i <= 27 && "HWEML".equals(o00.f34911OooO0O0)) {
            return true;
        }
        String str2 = o00.f34913OooO0Oo;
        str2.getClass();
        switch (str2) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                return true;
            default:
                if (i <= 26) {
                    String str3 = o00.f34911OooO0O0;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                                b = -1;
                            }
                            break;
                        case -1936688066:
                            b = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b = !str3.equals("XT1663") ? (byte) -1 : (byte) 12;
                            break;
                        case -1680025915:
                            b = !str3.equals("ComioS1") ? (byte) -1 : (byte) 13;
                            break;
                        case -1615810839:
                            b = !str3.equals("Phantom6") ? (byte) -1 : (byte) 14;
                            break;
                        case -1600724499:
                            b = !str3.equals("pacificrim") ? (byte) -1 : (byte) 15;
                            break;
                        case -1554255044:
                            b = !str3.equals("vernee_M5") ? (byte) -1 : (byte) 16;
                            break;
                        case -1481772737:
                            b = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b = !str3.equals("panell_ds") ? (byte) -1 : (byte) 18;
                            break;
                        case -1481772729:
                            b = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 20;
                            break;
                        case -1217592143:
                            b = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 21;
                            break;
                        case -1180384755:
                            b = !str3.equals("iris60") ? (byte) -1 : (byte) 22;
                            break;
                        case -1139198265:
                            b = !str3.equals("Slate_Pro") ? (byte) -1 : (byte) 23;
                            break;
                        case -1052835013:
                            b = !str3.equals("namath") ? (byte) -1 : (byte) 24;
                            break;
                        case -993250464:
                            b = !str3.equals("A10-70F") ? (byte) -1 : (byte) 25;
                            break;
                        case -993250458:
                            b = !str3.equals("A10-70L") ? (byte) -1 : (byte) 26;
                            break;
                        case -965403638:
                            b = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b = !str3.equals("tcl_eu") ? (byte) -1 : (byte) 29;
                            break;
                        case -842500323:
                            b = !str3.equals("nicklaus_f") ? (byte) -1 : (byte) 30;
                            break;
                        case -821392978:
                            b = !str3.equals("A7000-a") ? (byte) -1 : (byte) 31;
                            break;
                        case -797483286:
                            b = !str3.equals("SVP-DTV15") ? (byte) -1 : (byte) 32;
                            break;
                        case -794946968:
                            b = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b = !str3.equals("whyred") ? (byte) -1 : (byte) 34;
                            break;
                        case -782144577:
                            b = !str3.equals("OnePlus5T") ? (byte) -1 : (byte) 35;
                            break;
                        case -575125681:
                            b = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 42;
                            break;
                        case -56598463:
                            b = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b = !str3.equals("C1") ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b = !str3.equals("V5") ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b = !str3.equals("b5") ? (byte) -1 : (byte) 48;
                            break;
                        case 3483:
                            b = !str3.equals("mh") ? (byte) -1 : (byte) 49;
                            break;
                        case 73405:
                            b = !str3.equals("JGZ") ? (byte) -1 : (byte) 50;
                            break;
                        case 75537:
                            b = !str3.equals("M04") ? (byte) -1 : (byte) 51;
                            break;
                        case 75739:
                            b = !str3.equals("M5c") ? (byte) -1 : (byte) 52;
                            break;
                        case 76779:
                            b = !str3.equals("MX6") ? (byte) -1 : (byte) 53;
                            break;
                        case 78669:
                            b = !str3.equals("P85") ? (byte) -1 : (byte) 54;
                            break;
                        case 79305:
                            b = !str3.equals("PLE") ? (byte) -1 : (byte) 55;
                            break;
                        case 80618:
                            b = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b = !str3.equals("Z80") ? (byte) -1 : (byte) 57;
                            break;
                        case 98846:
                            b = !str3.equals("cv1") ? (byte) -1 : (byte) 58;
                            break;
                        case 98848:
                            b = !str3.equals("cv3") ? (byte) -1 : (byte) 59;
                            break;
                        case 99329:
                            b = !str3.equals("deb") ? (byte) -1 : (byte) 60;
                            break;
                        case 101481:
                            b = !str3.equals("flo") ? (byte) -1 : Base64.padSymbol;
                            break;
                        case 1513190:
                            b = !str3.equals("1601") ? (byte) -1 : (byte) 62;
                            break;
                        case 1514184:
                            b = !str3.equals("1713") ? (byte) -1 : (byte) 63;
                            break;
                        case 1514185:
                            b = !str3.equals("1714") ? (byte) -1 : (byte) 64;
                            break;
                        case 2133089:
                            b = !str3.equals("F01H") ? (byte) -1 : (byte) 65;
                            break;
                        case 2133091:
                            b = !str3.equals("F01J") ? (byte) -1 : (byte) 66;
                            break;
                        case 2133120:
                            b = !str3.equals("F02H") ? (byte) -1 : (byte) 67;
                            break;
                        case 2133151:
                            b = !str3.equals("F03H") ? (byte) -1 : (byte) 68;
                            break;
                        case 2133182:
                            b = !str3.equals("F04H") ? (byte) -1 : (byte) 69;
                            break;
                        case 2133184:
                            b = !str3.equals("F04J") ? (byte) -1 : (byte) 70;
                            break;
                        case 2436959:
                            b = !str3.equals("P681") ? (byte) -1 : (byte) 71;
                            break;
                        case 2463773:
                            b = !str3.equals("Q350") ? (byte) -1 : (byte) 72;
                            break;
                        case 2464648:
                            b = !str3.equals("Q427") ? (byte) -1 : (byte) 73;
                            break;
                        case 2689555:
                            b = !str3.equals("XE2X") ? (byte) -1 : (byte) 74;
                            break;
                        case 3154429:
                            b = !str3.equals("fugu") ? (byte) -1 : (byte) 75;
                            break;
                        case 3284551:
                            b = !str3.equals("kate") ? (byte) -1 : (byte) 76;
                            break;
                        case 3351335:
                            b = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b = !str3.equals("p212") ? (byte) -1 : (byte) 78;
                            break;
                        case 41325051:
                            b = !str3.equals("MEIZU_M5") ? (byte) -1 : (byte) 79;
                            break;
                        case 51349633:
                            b = !str3.equals("601LV") ? (byte) -1 : (byte) 80;
                            break;
                        case 51350594:
                            b = !str3.equals("602LV") ? (byte) -1 : (byte) 81;
                            break;
                        case 55178625:
                            b = !str3.equals("Aura_Note_2") ? (byte) -1 : (byte) 82;
                            break;
                        case 61542055:
                            b = !str3.equals("A1601") ? (byte) -1 : (byte) 83;
                            break;
                        case 65355429:
                            b = !str3.equals("E5643") ? (byte) -1 : (byte) 84;
                            break;
                        case 66214468:
                            b = !str3.equals("F3111") ? (byte) -1 : (byte) 85;
                            break;
                        case 66214470:
                            b = !str3.equals("F3113") ? (byte) -1 : (byte) 86;
                            break;
                        case 66214473:
                            b = !str3.equals("F3116") ? (byte) -1 : (byte) 87;
                            break;
                        case 66215429:
                            b = !str3.equals("F3211") ? (byte) -1 : (byte) 88;
                            break;
                        case 66215431:
                            b = !str3.equals("F3213") ? (byte) -1 : (byte) 89;
                            break;
                        case 66215433:
                            b = !str3.equals("F3215") ? (byte) -1 : (byte) 90;
                            break;
                        case 66216390:
                            b = !str3.equals("F3311") ? (byte) -1 : (byte) 91;
                            break;
                        case 76402249:
                            b = !str3.equals("PRO7S") ? (byte) -1 : (byte) 92;
                            break;
                        case 76404105:
                            b = !str3.equals("Q4260") ? (byte) -1 : (byte) 93;
                            break;
                        case 76404911:
                            b = !str3.equals("Q4310") ? (byte) -1 : (byte) 94;
                            break;
                        case 80963634:
                            b = !str3.equals("V23GB") ? (byte) -1 : (byte) 95;
                            break;
                        case 82882791:
                            b = !str3.equals("X3_HK") ? (byte) -1 : (byte) 96;
                            break;
                        case 98715550:
                            b = !str3.equals("i9031") ? (byte) -1 : (byte) 97;
                            break;
                        case 101370885:
                            b = !str3.equals("l5460") ? (byte) -1 : (byte) 98;
                            break;
                        case 102844228:
                            b = !str3.equals("le_x6") ? (byte) -1 : (byte) 99;
                            break;
                        case 165221241:
                            b = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b = !str3.equals("CPY83_I00") ? (byte) -1 : (byte) 101;
                            break;
                        case 245388979:
                            b = !str3.equals("marino_f") ? (byte) -1 : (byte) 102;
                            break;
                        case 287431619:
                            b = !str3.equals("griffin") ? (byte) -1 : (byte) 103;
                            break;
                        case 307593612:
                            b = !str3.equals("A7010a48") ? (byte) -1 : (byte) 104;
                            break;
                        case 308517133:
                            b = !str3.equals("A7020a48") ? (byte) -1 : (byte) 105;
                            break;
                        case 316215098:
                            b = !str3.equals("TB3-730F") ? (byte) -1 : (byte) 106;
                            break;
                        case 316215116:
                            b = !str3.equals("TB3-730X") ? (byte) -1 : (byte) 107;
                            break;
                        case 316246811:
                            b = !str3.equals("TB3-850F") ? (byte) -1 : (byte) 108;
                            break;
                        case 316246818:
                            b = !str3.equals("TB3-850M") ? (byte) -1 : (byte) 109;
                            break;
                        case 407160593:
                            b = !str3.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 110;
                            break;
                        case 507412548:
                            b = !str3.equals("QM16XE_U") ? (byte) -1 : (byte) 111;
                            break;
                        case 793982701:
                            b = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 112;
                            break;
                        case 794038622:
                            b = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 114;
                            break;
                        case 835649806:
                            b = !str3.equals("manning") ? (byte) -1 : (byte) 115;
                            break;
                        case 917340916:
                            b = !str3.equals("A7000plus") ? (byte) -1 : (byte) 116;
                            break;
                        case 958008161:
                            b = !str3.equals("j2xlteins") ? (byte) -1 : (byte) 117;
                            break;
                        case 1060579533:
                            b = !str3.equals("panell_d") ? (byte) -1 : (byte) 118;
                            break;
                        case 1150207623:
                            b = !str3.equals("LS-5017") ? (byte) -1 : (byte) 119;
                            break;
                        case 1176899427:
                            b = !str3.equals("itel_S41") ? (byte) -1 : (byte) 120;
                            break;
                        case 1280332038:
                            b = !str3.equals("hwALE-H") ? (byte) -1 : (byte) 121;
                            break;
                        case 1306947716:
                            b = !str3.equals("EverStar_S") ? (byte) -1 : (byte) 122;
                            break;
                        case 1349174697:
                            b = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : (byte) 123;
                            break;
                        case 1522194893:
                            b = !str3.equals("woods_f") ? (byte) -1 : (byte) 124;
                            break;
                        case 1691543273:
                            b = !str3.equals("CPH1609") ? (byte) -1 : (byte) 125;
                            break;
                        case 1691544261:
                            b = !str3.equals("CPH1715") ? (byte) -1 : (byte) 126;
                            break;
                        case 1709443163:
                            b = !str3.equals("iball8735_9806") ? (byte) -1 : ByteCompanionObject.MAX_VALUE;
                            break;
                        case 1865889110:
                            b = !str3.equals("santoni") ? (byte) -1 : ByteCompanionObject.MIN_VALUE;
                            break;
                        case 1906253259:
                            b = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            str2.getClass();
                            if (!str2.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case Constants.ERR_WATERMARK_READ /* 129 */:
                        case Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED /* 130 */:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                            return true;
                    }
                }
                return false;
        }
    }

    public static boolean o0O0O00(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (OooO.class) {
            if (!f34478o000Ooo) {
                f34476o000O0O = o000OOo();
                f34478o000Ooo = true;
            }
        }
        return f34476o000O0O;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public final boolean OooO0Oo() {
        PlaceholderSurface placeholderSurface;
        if (super.OooO0Oo()) {
            OooO0o oooO0o = this.f34484o00000o0;
            if (oooO0o.OooO0O0()) {
                Pair<Surface, o000Oo0> pair = oooO0o.f34526OooO0oo;
                if (pair == null || !((o000Oo0) pair.second).equals(o000Oo0.f34984OooO0OO)) {
                    if (!this.f34487o0000O) {
                    }
                    this.f34494o0000OOo = -9223372036854775807L;
                    return true;
                }
            } else if (!this.f34487o0000O || (((placeholderSurface = this.f34488o0000O0) != null && this.f34503o0000oO == placeholderSurface) || this.f7677Oooo0o == null || this.f34509o0000ooO)) {
                this.f34494o0000OOo = -9223372036854775807L;
                return true;
            }
        }
        if (this.f34494o0000OOo == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f34494o0000OOo) {
            return true;
        }
        this.f34494o0000OOo = -9223372036854775807L;
        return false;
    }

    @Override // androidx.media3.exoplayer.OooO0O0, androidx.media3.exoplayer.Renderer
    public final boolean OooO0o0() {
        boolean z = this.f7714o0OO00O;
        OooO0o oooO0o = this.f34484o00000o0;
        return oooO0o.OooO0O0() ? z & oooO0o.f34529OooOO0o : z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.media3.exoplayer.mediacodec.OooO0OO] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o000OOO.OooO$OooO0o] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.media3.exoplayer.video.PlaceholderSurface] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.exoplayer.OooO0O0, androidx.media3.exoplayer.OooOOO.OooO0O0
    public final void OooOO0o(int i, @Nullable Object obj) throws ExoPlaybackException {
        ?? OooO0OO2;
        Surface surface;
        Surface surface2;
        OooOOOO oooOOOO = this.f34482o00000OO;
        ?? r1 = this.f34484o00000o0;
        if (i != 1) {
            if (i == 7) {
                this.f34512o000OoO = (OooOO0O) obj;
                return;
            }
            if (i == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.f34479o000 != iIntValue) {
                    this.f34479o000 = iIntValue;
                    if (this.f34509o0000ooO) {
                        o00Ooo();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 4) {
                int iIntValue2 = ((Integer) obj).intValue();
                this.f34511o000OO = iIntValue2;
                androidx.media3.exoplayer.mediacodec.OooO0OO oooO0OO = this.f7677Oooo0o;
                if (oooO0OO != null) {
                    oooO0OO.OooO0OO(iIntValue2);
                    return;
                }
                return;
            }
            if (i == 5) {
                int iIntValue3 = ((Integer) obj).intValue();
                if (oooOOOO.f34561OooOO0 == iIntValue3) {
                    return;
                }
                oooOOOO.f34561OooOO0 = iIntValue3;
                oooOOOO.OooO0o0(true);
                return;
            }
            if (i == 13) {
                obj.getClass();
                List list = (List) obj;
                CopyOnWriteArrayList<o00000OO> copyOnWriteArrayList = r1.f34523OooO0o;
                if (copyOnWriteArrayList == null) {
                    r1.f34523OooO0o = new CopyOnWriteArrayList<>(list);
                    return;
                } else {
                    copyOnWriteArrayList.clear();
                    r1.f34523OooO0o.addAll(list);
                    return;
                }
            }
            if (i != 14) {
                return;
            }
            obj.getClass();
            o000Oo0 o000oo1 = (o000Oo0) obj;
            if (o000oo1.f34985OooO00o == 0 || o000oo1.f34986OooO0O0 == 0 || (surface2 = this.f34503o0000oO) == null) {
                return;
            }
            r1.OooO0oo(surface2, o000oo1);
            return;
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            OooO0OO2 = 0;
        }
        if (OooO0OO2 == 0) {
            PlaceholderSurface placeholderSurface = this.f34488o0000O0;
            if (placeholderSurface != null) {
                OooO0OO2 = surface;
                OooO0OO2 = placeholderSurface;
            } else {
                androidx.media3.exoplayer.mediacodec.OooO0o oooO0o = this.f7681OoooO;
                if (oooO0o != null && o00000oo(oooO0o)) {
                    OooO0OO2 = surface;
                    OooO0OO2 = PlaceholderSurface.OooO0OO(this.f34481o00000O, oooO0o.f7758OooO0o);
                    this.f34488o0000O0 = OooO0OO2;
                }
            }
        }
        OooO0OO2 = surface;
        OooO0OO2 = surface;
        OooO0OO2 = surface;
        Surface surface3 = this.f34503o0000oO;
        o0OoOo0.OooO00o oooO00o = this.f34483o00000Oo;
        if (surface3 == OooO0OO2) {
            if (OooO0OO2 == 0 || OooO0OO2 == this.f34488o0000O0) {
                return;
            }
            o00Ooo o00ooo2 = this.f34508o0000oo0;
            if (o00ooo2 != null) {
                oooO00o.OooO0O0(o00ooo2);
            }
            if (this.f34490o0000O0O) {
                Surface surface4 = this.f34503o0000oO;
                Handler handler = oooO00o.f34593OooO00o;
                if (handler != null) {
                    handler.post(new OooOo(oooO00o, surface4, SystemClock.elapsedRealtime()));
                    return;
                }
                return;
            }
            return;
        }
        this.f34503o0000oO = OooO0OO2;
        oooOOOO.getClass();
        ?? r7 = OooO0OO2 instanceof PlaceholderSurface ? 0 : OooO0OO2;
        if (oooOOOO.f34558OooO0o0 != r7) {
            oooOOOO.OooO0O0();
            oooOOOO.f34558OooO0o0 = r7;
            oooOOOO.OooO0o0(true);
        }
        this.f34490o0000O0O = false;
        int i2 = this.f7201OooOO0;
        ?? r0 = this.f7677Oooo0o;
        if (r0 != 0 && !r1.OooO0O0()) {
            if (o00.f34910OooO00o < 23 || OooO0OO2 == 0 || this.f34489o0000O00) {
                o00Ooo();
                OoooOoO();
            } else {
                r0.OooO0o0(OooO0OO2);
            }
        }
        if (OooO0OO2 == 0 || OooO0OO2 == this.f34488o0000O0) {
            this.f34508o0000oo0 = null;
            oo0o0Oo();
            if (r1.OooO0O0()) {
                r1.getClass();
                throw null;
            }
            return;
        }
        o00Ooo o00ooo3 = this.f34508o0000oo0;
        if (o00ooo3 != null) {
            oooO00o.OooO0O0(o00ooo3);
        }
        oo0o0Oo();
        if (i2 == 2) {
            long j = this.f34498o0000Ooo;
            this.f34494o0000OOo = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
        if (r1.OooO0O0()) {
            r1.OooO0oo(OooO0OO2, o000Oo0.f34984OooO0OO);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.OooO0O0, androidx.media3.exoplayer.Renderer
    public final void OooOOo(float f, float f2) throws ExoPlaybackException {
        super.OooOOo(f, f2);
        OooOOOO oooOOOO = this.f34482o00000OO;
        oooOOOO.f34552OooO = f;
        oooOOOO.f34565OooOOO0 = 0L;
        oooOOOO.f34567OooOOOo = -1L;
        oooOOOO.f34564OooOOO = -1L;
        oooOOOO.OooO0o0(false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    @CallSuper
    public final void OooOo00(long j, long j2) throws ExoPlaybackException {
        super.OooOo00(j, j2);
        OooO0o oooO0o = this.f34484o00000o0;
        if (oooO0o.OooO0O0()) {
            oooO0o.OooO0o0(j, j2);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.OooO0O0
    public final void OooOoOO() {
        o0OoOo0.OooO00o oooO00o = this.f34483o00000Oo;
        this.f34508o0000oo0 = null;
        oo0o0Oo();
        this.f34490o0000O0O = false;
        this.f34510o000O000 = null;
        try {
            super.OooOoOO();
            o000O00O.OooOo oooOo = this.f7701o000000;
            oooO00o.getClass();
            synchronized (oooOo) {
            }
            Handler handler = oooO00o.f34593OooO00o;
            if (handler != null) {
                handler.post(new OooOO0O.OooO0OO(2, oooO00o, oooOo));
            }
        } finally {
            oooO00o.OooO00o(this.f7701o000000);
            oooO00o.OooO0O0(o00Ooo.f6864OooO0oo);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.OooO0O0
    public final void OooOoo(long j, boolean z) throws ExoPlaybackException {
        super.OooOoo(j, z);
        OooO0o oooO0o = this.f34484o00000o0;
        if (oooO0o.OooO0O0()) {
            oooO0o.OooO00o();
        }
        oo0o0Oo();
        OooOOOO oooOOOO = this.f34482o00000OO;
        oooOOOO.f34565OooOOO0 = 0L;
        oooOOOO.f34567OooOOOo = -1L;
        oooOOOO.f34564OooOOO = -1L;
        this.f34501o0000o0O = -9223372036854775807L;
        this.f34493o0000OOO = -9223372036854775807L;
        this.f34497o0000OoO = 0;
        if (!z) {
            this.f34494o0000OOo = -9223372036854775807L;
        } else {
            long j2 = this.f34498o0000Ooo;
            this.f34494o0000OOo = j2 > 0 ? SystemClock.elapsedRealtime() + j2 : -9223372036854775807L;
        }
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void OooOoo0(boolean z, boolean z2) throws ExoPlaybackException {
        this.f7701o000000 = new o000O00O.OooOo();
        o00OO000 o00oo001 = this.f7199OooO0oO;
        o00oo001.getClass();
        boolean z3 = o00oo001.f34128OooO00o;
        o00Oo0.OooO0Oo((z3 && this.f34479o000 == 0) ? false : true);
        if (this.f34509o0000ooO != z3) {
            this.f34509o0000ooO = z3;
            o00Ooo();
        }
        o000O00O.OooOo oooOo = this.f7701o000000;
        o0OoOo0.OooO00o oooO00o = this.f34483o00000Oo;
        Handler handler = oooO00o.f34593OooO00o;
        if (handler != null) {
            handler.post(new OooOO0.OooO00o(2, oooO00o, oooOo));
        }
        this.f34492o0000OO0 = z2;
        this.f34491o0000OO = false;
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    @TargetApi(17)
    public final void OooOooo() {
        OooO0o oooO0o = this.f34484o00000o0;
        try {
            try {
                Oooo0o();
                o00Ooo();
                DrmSession drmSession = this.f7673Oooo00O;
                if (drmSession != null) {
                    drmSession.OooO0o0(null);
                }
                this.f7673Oooo00O = null;
                if (oooO0o.OooO0O0()) {
                    oooO0o.OooO0o();
                }
                PlaceholderSurface placeholderSurface = this.f34488o0000O0;
                if (placeholderSurface != null) {
                    if (this.f34503o0000oO == placeholderSurface) {
                        this.f34503o0000oO = null;
                    }
                    placeholderSurface.release();
                    this.f34488o0000O0 = null;
                }
            } catch (Throwable th) {
                DrmSession drmSession2 = this.f7673Oooo00O;
                if (drmSession2 != null) {
                    drmSession2.OooO0o0(null);
                }
                this.f7673Oooo00O = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (oooO0o.OooO0O0()) {
                oooO0o.OooO0o();
            }
            PlaceholderSurface placeholderSurface2 = this.f34488o0000O0;
            if (placeholderSurface2 != null) {
                if (this.f34503o0000oO == placeholderSurface2) {
                    this.f34503o0000oO = null;
                }
                placeholderSurface2.release();
                this.f34488o0000O0 = null;
            }
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void Oooo000() {
        this.f34495o0000Oo = 0;
        this.f34496o0000Oo0 = SystemClock.elapsedRealtime();
        this.f34502o0000o0o = SystemClock.elapsedRealtime() * 1000;
        this.f34499o0000o = 0L;
        this.f34504o0000oO0 = 0;
        OooOOOO oooOOOO = this.f34482o00000OO;
        oooOOOO.f34556OooO0Oo = true;
        oooOOOO.f34565OooOOO0 = 0L;
        oooOOOO.f34567OooOOOo = -1L;
        oooOOOO.f34564OooOOO = -1L;
        OooOOOO.OooO0O0 oooO0O0 = oooOOOO.f34554OooO0O0;
        if (oooO0O0 != null) {
            OooOOOO.OooO oooO = oooOOOO.f34555OooO0OO;
            oooO.getClass();
            oooO.f34572OooO0o0.sendEmptyMessage(1);
            oooO0O0.OooO00o(new OooOOO0(oooOOOO));
        }
        oooOOOO.OooO0o0(false);
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void Oooo00O() {
        this.f34494o0000OOo = -9223372036854775807L;
        o00000();
        final int i = this.f34504o0000oO0;
        if (i != 0) {
            final long j = this.f34499o0000o;
            final o0OoOo0.OooO00o oooO00o = this.f34483o00000Oo;
            Handler handler = oooO00o.f34593OooO00o;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o000OOO.Oooo000
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0OoOo0.OooO00o oooO00o2 = oooO00o;
                        oooO00o2.getClass();
                        int i2 = o00.f34910OooO00o;
                        oooO00o2.f34594OooO0O0.OooOOOO(i, j);
                    }
                });
            }
            this.f34499o0000o = 0L;
            this.f34504o0000oO0 = 0;
        }
        OooOOOO oooOOOO = this.f34482o00000OO;
        oooOOOO.f34556OooO0Oo = false;
        OooOOOO.OooO0O0 oooO0O0 = oooOOOO.f34554OooO0O0;
        if (oooO0O0 != null) {
            oooO0O0.unregister();
            OooOOOO.OooO oooO = oooOOOO.f34555OooO0OO;
            oooO.getClass();
            oooO.f34572OooO0o0.sendEmptyMessage(2);
        }
        oooOOOO.OooO0O0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation Oooo0OO(androidx.media3.exoplayer.mediacodec.OooO0o oooO0o, androidx.media3.common.OooOO0 oooOO1, androidx.media3.common.OooOO0 oooOO2) {
        DecoderReuseEvaluation decoderReuseEvaluationOooO0O0 = oooO0o.OooO0O0(oooOO1, oooOO2);
        OooO0O0 oooO0O0 = this.f34480o0000;
        int i = oooO0O0.f34513OooO00o;
        int i2 = oooOO2.f6419OooOo00;
        int i3 = decoderReuseEvaluationOooO0O0.f7104OooO0o0;
        if (i2 > i || oooOO2.f6418OooOo0 > oooO0O0.f34514OooO0O0) {
            i3 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (o000000o(oooOO2, oooO0o) > this.f34480o0000.f34515OooO0OO) {
            i3 |= 64;
        }
        int i4 = i3;
        return new DecoderReuseEvaluation(oooO0o.f7754OooO00o, oooOO1, oooOO2, i4 != 0 ? 0 : decoderReuseEvaluationOooO0O0.f7103OooO0Oo, i4);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final MediaCodecDecoderException Oooo0o0(IllegalStateException illegalStateException, @Nullable androidx.media3.exoplayer.mediacodec.OooO0o oooO0o) {
        return new MediaCodecVideoDecoderException(illegalStateException, oooO0o, this.f34503o0000oO);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean OoooO() {
        return this.f34509o0000ooO && o00.f34910OooO00o < 23;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float OoooOO0(float f, androidx.media3.common.OooOO0[] oooOO0Arr) {
        float fMax = -1.0f;
        for (androidx.media3.common.OooOO0 oooOO1 : oooOO0Arr) {
            float f2 = oooOO1.f6420OooOo0O;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @TargetApi(17)
    public final androidx.media3.exoplayer.mediacodec.OooO0OO.OooO00o OoooOOO(androidx.media3.exoplayer.mediacodec.OooO0o oooO0o, androidx.media3.common.OooOO0 oooOO1, @Nullable MediaCrypto mediaCrypto, float f) {
        androidx.media3.common.OooO0o oooO0o2;
        String str;
        int i;
        int i2;
        OooO0O0 oooO0O0;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z;
        Pair<Integer, Integer> pairOooO0Oo;
        int iO000000;
        PlaceholderSurface placeholderSurface = this.f34488o0000O0;
        if (placeholderSurface != null && placeholderSurface.f8273OooO0Oo != oooO0o.f7758OooO0o) {
            if (this.f34503o0000oO == placeholderSurface) {
                this.f34503o0000oO = null;
            }
            placeholderSurface.release();
            this.f34488o0000O0 = null;
        }
        String str2 = oooO0o.f7756OooO0OO;
        androidx.media3.common.OooOO0[] oooOO0Arr = this.f7203OooOO0o;
        oooOO0Arr.getClass();
        int iMax = oooOO1.f6419OooOo00;
        int iO000000o = o000000o(oooOO1, oooO0o);
        int length = oooOO0Arr.length;
        float f2 = oooOO1.f6420OooOo0O;
        int i3 = oooOO1.f6419OooOo00;
        androidx.media3.common.OooO0o oooO0o3 = oooOO1.f6424OooOoOO;
        int i4 = oooOO1.f6418OooOo0;
        if (length == 1) {
            if (iO000000o != -1 && (iO000000 = o000000(oooOO1, oooO0o)) != -1) {
                iO000000o = Math.min((int) (iO000000o * 1.5f), iO000000);
            }
            oooO0O0 = new OooO0O0(iMax, i4, iO000000o);
            str = str2;
            i = i3;
            oooO0o2 = oooO0o3;
            i2 = i4;
        } else {
            int length2 = oooOO0Arr.length;
            int i5 = 0;
            boolean z2 = false;
            int iMax2 = i4;
            while (i5 < length2) {
                int i6 = length2;
                androidx.media3.common.OooOO0 oooOO2 = oooOO0Arr[i5];
                androidx.media3.common.OooOO0[] oooOO0Arr2 = oooOO0Arr;
                if (oooO0o3 != null && oooOO2.f6424OooOoOO == null) {
                    androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o(oooOO2);
                    oooO00o.f6458OooOo0o = oooO0o3;
                    oooOO2 = new androidx.media3.common.OooOO0(oooO00o);
                }
                if (oooO0o.OooO0O0(oooOO1, oooOO2).f7103OooO0Oo != 0) {
                    int i7 = oooOO2.f6418OooOo0;
                    int i8 = oooOO2.f6419OooOo00;
                    z2 |= i8 == -1 || i7 == -1;
                    int iMax3 = Math.max(iMax, i8);
                    iMax2 = Math.max(iMax2, i7);
                    iMax = iMax3;
                    iO000000o = Math.max(iO000000o, o000000o(oooOO2, oooO0o));
                }
                i5++;
                length2 = i6;
                oooOO0Arr = oooOO0Arr2;
                oooO0o3 = oooO0o3;
            }
            oooO0o2 = oooO0o3;
            if (z2) {
                Log.OooO0o("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z3 = i4 > i3;
                int i9 = z3 ? i4 : i3;
                int i10 = z3 ? i3 : i4;
                i2 = i4;
                float f3 = i10 / i9;
                int[] iArr = f34477o000O0o;
                i = i3;
                int i11 = 0;
                str = str2;
                while (true) {
                    if (i11 < 9) {
                        int i12 = iArr[i11];
                        int[] iArr2 = iArr;
                        int i13 = (int) (i12 * f3);
                        if (i12 > i9 && i13 > i10) {
                            int i14 = i9;
                            int i15 = i10;
                            if (o00.f34910OooO00o < 21) {
                                f3 = f3;
                                try {
                                    int i16 = (((i12 + 16) - 1) / 16) * 16;
                                    int i17 = (((i13 + 16) - 1) / 16) * 16;
                                    if (i16 * i17 <= MediaCodecUtil.OooO()) {
                                        int i18 = z3 ? i17 : i16;
                                        if (!z3) {
                                            i16 = i17;
                                        }
                                        point = new Point(i18, i16);
                                        break;
                                    }
                                    i11++;
                                    iArr = iArr2;
                                    i9 = i14;
                                    i10 = i15;
                                    f3 = f3;
                                } catch (MediaCodecUtil.DecoderQueryException unused) {
                                    point = null;
                                    break;
                                }
                            } else {
                                int i19 = z3 ? i13 : i12;
                                if (!z3) {
                                    i12 = i13;
                                }
                                MediaCodecInfo.CodecCapabilities codecCapabilities = oooO0o.f7757OooO0Oo;
                                if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                    point = null;
                                } else {
                                    int widthAlignment = videoCapabilities.getWidthAlignment();
                                    int heightAlignment = videoCapabilities.getHeightAlignment();
                                    point = new Point((((i19 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i12 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
                                }
                                if (oooO0o.OooO0o(f2, point.x, point.y)) {
                                    break;
                                }
                                i11++;
                                iArr = iArr2;
                                i9 = i14;
                                i10 = i15;
                                f3 = f3;
                            }
                        }
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    androidx.media3.common.OooOO0.OooO00o oooO00o2 = new androidx.media3.common.OooOO0.OooO00o(oooOO1);
                    oooO00o2.f6450OooOOOo = iMax;
                    oooO00o2.f6452OooOOo0 = iMax2;
                    iO000000o = Math.max(iO000000o, o000000(new androidx.media3.common.OooOO0(oooO00o2), oooO0o));
                    Log.OooO0o("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                str = str2;
                i = i3;
                i2 = i4;
            }
            oooO0O0 = new OooO0O0(iMax, iMax2, iO000000o);
        }
        this.f34480o0000 = oooO0O0;
        int i20 = this.f34509o0000ooO ? this.f34479o000 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i2);
        p080o000OoO.o00000OO.OooO0O0(mediaFormat, oooOO1.f6415OooOOo0);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        p080o000OoO.o00000OO.OooO00o(mediaFormat, "rotation-degrees", oooOO1.f6421OooOo0o);
        if (oooO0o2 != null) {
            androidx.media3.common.OooO0o oooO0o4 = oooO0o2;
            p080o000OoO.o00000OO.OooO00o(mediaFormat, "color-transfer", oooO0o4.f6363OooO0o);
            p080o000OoO.o00000OO.OooO00o(mediaFormat, "color-standard", oooO0o4.f6362OooO0Oo);
            p080o000OoO.o00000OO.OooO00o(mediaFormat, "color-range", oooO0o4.f6364OooO0o0);
            byte[] bArr = oooO0o4.f6365OooO0oO;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(oooOO1.f6412OooOOOO) && (pairOooO0Oo = MediaCodecUtil.OooO0Oo(oooOO1)) != null) {
            p080o000OoO.o00000OO.OooO00o(mediaFormat, Scopes.PROFILE, ((Integer) pairOooO0Oo.first).intValue());
        }
        mediaFormat.setInteger("max-width", oooO0O0.f34513OooO00o);
        mediaFormat.setInteger("max-height", oooO0O0.f34514OooO0O0);
        p080o000OoO.o00000OO.OooO00o(mediaFormat, "max-input-size", oooO0O0.f34515OooO0OO);
        int i21 = o00.f34910OooO00o;
        if (i21 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.f34486o00000oo) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i20 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i20);
        }
        if (this.f34503o0000oO == null) {
            if (!o00000oo(oooO0o)) {
                throw new IllegalStateException();
            }
            if (this.f34488o0000O0 == null) {
                this.f34488o0000O0 = PlaceholderSurface.OooO0OO(this.f34481o00000O, oooO0o.f7758OooO0o);
            }
            this.f34503o0000oO = this.f34488o0000O0;
        }
        OooO0o oooO0o5 = this.f34484o00000o0;
        if (oooO0o5.OooO0O0() && i21 >= 29 && oooO0o5.f34520OooO0O0.f34481o00000O.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        if (!oooO0o5.OooO0O0()) {
            return new androidx.media3.exoplayer.mediacodec.OooO0OO.OooO00o(oooO0o, mediaFormat, oooOO1, this.f34503o0000oO, mediaCrypto);
        }
        oooO0o5.getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    public final void OoooOOo(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.f34507o0000oo) {
            ByteBuffer byteBuffer = decoderInputBuffer.f7083OooO;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        androidx.media3.exoplayer.mediacodec.OooO0OO oooO0OO = this.f7677Oooo0o;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        oooO0OO.OooO0oo(bundle);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Ooooo00(Exception exc) {
        Log.OooO0Oo("MediaCodecVideoRenderer", "Video codec error", exc);
        o0OoOo0.OooO00o oooO00o = this.f34483o00000Oo;
        Handler handler = oooO00o.f34593OooO00o;
        if (handler != null) {
            handler.post(new o0O0ooO(oooO00o, exc, 1));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Ooooo0o(final String str, final long j, final long j2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        final o0OoOo0.OooO00o oooO00o = this.f34483o00000Oo;
        Handler handler = oooO00o.f34593OooO00o;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o000OOO.Oooo0
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    long j3 = j;
                    long j4 = j2;
                    o0OoOo0 o0oooo1 = oooO00o.f34594OooO0O0;
                    int i = o00.f34910OooO00o;
                    o0oooo1.OooOo00(j3, j4, str2);
                }
            });
        }
        this.f34489o0000O00 = o0O0O00(str);
        androidx.media3.exoplayer.mediacodec.OooO0o oooO0o = this.f7681OoooO;
        oooO0o.getClass();
        boolean z = false;
        int i = 1;
        if (o00.f34910OooO00o >= 29 && "video/x-vnd.on2.vp9".equals(oooO0o.f7755OooO0O0)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = oooO0o.f7757OooO0Oo;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.f34507o0000oo = z;
        int i2 = o00.f34910OooO00o;
        if (i2 >= 23 && this.f34509o0000ooO) {
            androidx.media3.exoplayer.mediacodec.OooO0OO oooO0OO = this.f7677Oooo0o;
            oooO0OO.getClass();
            this.f34510o000O000 = new OooO0OO(oooO0OO);
        }
        OooO0o oooO0o2 = this.f34484o00000o0;
        Context context = oooO0o2.f34520OooO0O0.f34481o00000O;
        if (i2 >= 29 && context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            i = 5;
        }
        oooO0o2.f34518OooO = i;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void OooooO0(String str) {
        o0OoOo0.OooO00o oooO00o = this.f34483o00000Oo;
        Handler handler = oooO00o.f34593OooO00o;
        if (handler != null) {
            handler.post(new OooOOOO.OooO0o(3, oooO00o, str));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @Nullable
    public final DecoderReuseEvaluation OooooOO(o00O0000 o00o0001) throws ExoPlaybackException {
        final DecoderReuseEvaluation decoderReuseEvaluationOooooOO = super.OooooOO(o00o0001);
        final androidx.media3.common.OooOO0 oooOO1 = o00o0001.f34055OooO0O0;
        final o0OoOo0.OooO00o oooO00o = this.f34483o00000Oo;
        Handler handler = oooO00o.f34593OooO00o;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o000OOO.o000oOoO
                @Override // java.lang.Runnable
                public final void run() {
                    o0OoOo0.OooO00o oooO00o2 = oooO00o;
                    oooO00o2.getClass();
                    int i = o00.f34910OooO00o;
                    o0OoOo0 o0oooo1 = oooO00o2.f34594OooO0O0;
                    o0oooo1.OooOOoo();
                    o0oooo1.OooOOo0(oooOO1, decoderReuseEvaluationOooooOO);
                }
            });
        }
        return decoderReuseEvaluationOooooOO;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void OooooOo(androidx.media3.common.OooOO0 oooOO1, @Nullable MediaFormat mediaFormat) {
        int integer;
        int i;
        androidx.media3.exoplayer.mediacodec.OooO0OO oooO0OO = this.f7677Oooo0o;
        if (oooO0OO != null) {
            oooO0OO.OooO0OO(this.f34511o000OO);
        }
        if (this.f34509o0000ooO) {
            i = oooOO1.f6419OooOo00;
            integer = oooOO1.f6418OooOo0;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
            i = integer2;
        }
        float f = oooOO1.f6417OooOo;
        boolean z2 = o00.f34910OooO00o >= 21;
        OooO0o oooO0o = this.f34484o00000o0;
        int i2 = oooOO1.f6421OooOo0o;
        if (z2) {
            if (i2 == 90 || i2 == 270) {
                f = 1.0f / f;
                i2 = 0;
                int i3 = integer;
                integer = i;
                i = i3;
            } else {
                i2 = 0;
            }
        } else if (oooO0o.OooO0O0()) {
            i2 = 0;
        }
        this.f34506o0000oOo = new o00Ooo(i, f, integer, i2);
        float f2 = oooOO1.f6420OooOo0O;
        OooOOOO oooOOOO = this.f34482o00000OO;
        oooOOOO.f34557OooO0o = f2;
        o000OOO.OooO00o oooO00o = oooOOOO.f34553OooO00o;
        oooO00o.f34538OooO00o.OooO0OO();
        oooO00o.f34539OooO0O0.OooO0OO();
        oooO00o.f34540OooO0OO = false;
        oooO00o.f34541OooO0Oo = -9223372036854775807L;
        oooO00o.f34542OooO0o0 = 0;
        oooOOOO.OooO0Oo();
        if (oooO0o.OooO0O0()) {
            androidx.media3.common.OooOO0.OooO00o oooO00o2 = new androidx.media3.common.OooOO0.OooO00o(oooOO1);
            oooO00o2.f6450OooOOOo = i;
            oooO00o2.f6452OooOOo0 = integer;
            oooO00o2.f6453OooOOoo = i2;
            oooO00o2.f6456OooOo00 = f;
            oooO0o.OooO0oO(new androidx.media3.common.OooOO0(oooO00o2));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public final void Oooooo(long j) {
        super.Oooooo(j);
        if (this.f34509o0000ooO) {
            return;
        }
        this.f34500o0000o0--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void OoooooO() {
        oo0o0Oo();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public final void Ooooooo(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        boolean z = this.f34509o0000ooO;
        if (!z) {
            this.f34500o0000o0++;
        }
        if (o00.f34910OooO00o >= 23 || !z) {
            return;
        }
        long j = decoderInputBuffer.f7087OooO0oo;
        o0OO00O(j);
        o00000O(this.f34506o0000oOo);
        this.f7701o000000.f33964OooO0o0++;
        o00000O0();
        Oooooo(j);
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    public final void o0000(androidx.media3.exoplayer.mediacodec.OooO0OO oooO0OO, int i) {
        o000OO0O.OooO00o("skipVideoBuffer");
        oooO0OO.OooOOO0(i, false);
        o000OO0O.OooO0O0();
        this.f7701o000000.f33963OooO0o++;
    }

    public final void o00000() {
        if (this.f34495o0000Oo > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            final long j = jElapsedRealtime - this.f34496o0000Oo0;
            final int i = this.f34495o0000Oo;
            final o0OoOo0.OooO00o oooO00o = this.f34483o00000Oo;
            Handler handler = oooO00o.f34593OooO00o;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o000OOO.OooOo00
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0OoOo0.OooO00o oooO00o2 = oooO00o;
                        oooO00o2.getClass();
                        int i2 = o00.f34910OooO00o;
                        oooO00o2.f34594OooO0O0.OooOOOo(i, j);
                    }
                });
            }
            this.f34495o0000Oo = 0;
            this.f34496o0000Oo0 = jElapsedRealtime;
        }
    }

    public final void o00000O(o00Ooo o00ooo2) {
        if (o00ooo2.equals(o00Ooo.f6864OooO0oo) || o00ooo2.equals(this.f34508o0000oo0)) {
            return;
        }
        this.f34508o0000oo0 = o00ooo2;
        this.f34483o00000Oo.OooO0O0(o00ooo2);
    }

    public final void o00000O0() {
        this.f34491o0000OO = true;
        if (this.f34487o0000O) {
            return;
        }
        this.f34487o0000O = true;
        Surface surface = this.f34503o0000oO;
        o0OoOo0.OooO00o oooO00o = this.f34483o00000Oo;
        Handler handler = oooO00o.f34593OooO00o;
        if (handler != null) {
            handler.post(new OooOo(oooO00o, surface, SystemClock.elapsedRealtime()));
        }
        this.f34490o0000O0O = true;
    }

    public final void o00000OO(long j, long j2, androidx.media3.common.OooOO0 oooOO1) {
        OooOO0O oooOO0O = this.f34512o000OoO;
        if (oooOO0O != null) {
            oooOO0O.OooO0OO(j, j2, oooOO1, this.f7680Oooo0oo);
        }
    }

    public final void o00000Oo(androidx.media3.exoplayer.mediacodec.OooO0OO oooO0OO, int i) {
        o000OO0O.OooO00o("releaseOutputBuffer");
        oooO0OO.OooOOO0(i, true);
        o000OO0O.OooO0O0();
        this.f7701o000000.f33964OooO0o0++;
        this.f34497o0000OoO = 0;
        if (this.f34484o00000o0.OooO0O0()) {
            return;
        }
        this.f34502o0000o0o = SystemClock.elapsedRealtime() * 1000;
        o00000O(this.f34506o0000oOo);
        o00000O0();
    }

    public final void o00000o0(androidx.media3.exoplayer.mediacodec.OooO0OO oooO0OO, androidx.media3.common.OooOO0 oooOO1, int i, long j, boolean z) {
        long jNanoTime;
        OooO0o oooO0o = this.f34484o00000o0;
        if (oooO0o.OooO0O0()) {
            long j2 = this.f7702o000000O.f7730OooO0O0;
            o00Oo0.OooO0Oo(oooO0o.f34532OooOOOO != -9223372036854775807L);
            jNanoTime = ((j2 + j) - oooO0o.f34532OooOOOO) * 1000;
        } else {
            jNanoTime = System.nanoTime();
        }
        if (z) {
            o00000OO(j, jNanoTime, oooOO1);
        }
        if (o00.f34910OooO00o >= 21) {
            o0000Ooo(oooO0OO, i, jNanoTime);
        } else {
            o00000Oo(oooO0OO, i);
        }
    }

    public final boolean o00000oO(long j, long j2) {
        boolean z = this.f7201OooOO0 == 2;
        boolean z2 = this.f34491o0000OO ? !this.f34487o0000O : z || this.f34492o0000OO0;
        long jElapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.f34502o0000o0o;
        if (this.f34494o0000OOo == -9223372036854775807L && j >= this.f7702o000000O.f7730OooO0O0) {
            if (z2) {
                return true;
            }
            if (z) {
                if (((j2 > (-30000L) ? 1 : (j2 == (-30000L) ? 0 : -1)) < 0) && jElapsedRealtime > 100000) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o00000oo(androidx.media3.exoplayer.mediacodec.OooO0o oooO0o) {
        return o00.f34910OooO00o >= 23 && !this.f34509o0000ooO && !o0O0O00(oooO0o.f7754OooO00o) && (!oooO0o.f7758OooO0o || PlaceholderSurface.OooO0O0(this.f34481o00000O));
    }

    public final void o0000O00(int i, int i2) {
        o000O00O.OooOo oooOo = this.f7701o000000;
        oooOo.f33966OooO0oo += i;
        int i3 = i + i2;
        oooOo.f33965OooO0oO += i3;
        this.f34495o0000Oo += i3;
        int i4 = this.f34497o0000OoO + i3;
        this.f34497o0000OoO = i4;
        oooOo.f33958OooO = Math.max(i4, oooOo.f33958OooO);
        int i5 = this.f34485o00000oO;
        if (i5 <= 0 || this.f34495o0000Oo < i5) {
            return;
        }
        o00000();
    }

    @RequiresApi(21)
    public final void o0000Ooo(androidx.media3.exoplayer.mediacodec.OooO0OO oooO0OO, int i, long j) {
        o000OO0O.OooO00o("releaseOutputBuffer");
        oooO0OO.OooOO0(i, j);
        o000OO0O.OooO0O0();
        this.f7701o000000.f33964OooO0o0++;
        this.f34497o0000OoO = 0;
        if (this.f34484o00000o0.OooO0O0()) {
            return;
        }
        this.f34502o0000o0o = SystemClock.elapsedRealtime() * 1000;
        o00000O(this.f34506o0000oOo);
        o00000O0();
    }

    public final void o0000oo(long j) {
        o000O00O.OooOo oooOo = this.f7701o000000;
        oooOo.f33968OooOO0O += j;
        oooOo.f33969OooOO0o++;
        this.f34499o0000o += j;
        this.f34504o0000oO0++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final ArrayList o000oOoO(androidx.media3.exoplayer.mediacodec.OooO oooO, androidx.media3.common.OooOO0 oooOO1, boolean z) throws MediaCodecUtil.DecoderQueryException {
        List<androidx.media3.exoplayer.mediacodec.OooO0o> listO000000O = o000000O(this.f34481o00000O, oooO, oooOO1, z, this.f34509o0000ooO);
        Pattern pattern = MediaCodecUtil.f7732OooO00o;
        ArrayList arrayList = new ArrayList(listO000000O);
        Collections.sort(arrayList, new o000O0O0.o0OoOo0(new o000O0O0.Oooo0(oooOO1, 0)));
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean o00O0O(long j, long j2, @Nullable androidx.media3.exoplayer.mediacodec.OooO0OO oooO0OO, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.OooOO0 oooOO1) throws ExoPlaybackException {
        long j4;
        boolean z3;
        boolean z4;
        boolean z5;
        oooO0OO.getClass();
        if (this.f34493o0000OOO == -9223372036854775807L) {
            this.f34493o0000OOO = j;
        }
        long j5 = this.f34501o0000o0O;
        OooOOOO oooOOOO = this.f34482o00000OO;
        OooO0o oooO0o = this.f34484o00000o0;
        if (j3 != j5) {
            if (!oooO0o.OooO0O0()) {
                oooOOOO.OooO0OO(j3);
            }
            this.f34501o0000o0O = j3;
        }
        long j6 = j3 - this.f7702o000000O.f7730OooO0O0;
        if (z && !z2) {
            o0000(oooO0OO, i);
            return true;
        }
        boolean z6 = this.f7201OooOO0 == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j7 = (long) ((j3 - j) / ((double) this.f7676Oooo0OO));
        if (z6) {
            j7 -= jElapsedRealtime - j2;
        }
        long j8 = j7;
        if (this.f34503o0000oO == this.f34488o0000O0) {
            if (!(j8 < -30000)) {
                return false;
            }
            o0000(oooO0OO, i);
            o0000oo(j8);
            return true;
        }
        if (o00000oO(j, j8)) {
            if (!oooO0o.OooO0O0()) {
                z5 = true;
            } else {
                if (!oooO0o.OooO0OO(oooOO1, j6, z2)) {
                    return false;
                }
                z5 = false;
            }
            o00000o0(oooO0OO, oooOO1, i, j6, z5);
            o0000oo(j8);
            return true;
        }
        if (!z6 || j == this.f34493o0000OOO) {
            return false;
        }
        long jNanoTime = System.nanoTime();
        long jOooO00o = oooOOOO.OooO00o((j8 * 1000) + jNanoTime);
        long j9 = !oooO0o.OooO0O0() ? (jOooO00o - jNanoTime) / 1000 : j8;
        boolean z7 = this.f34494o0000OOo != -9223372036854775807L;
        if (((j9 > (-500000L) ? 1 : (j9 == (-500000L) ? 0 : -1)) < 0) && !z2) {
            SampleStream sampleStream = this.f7202OooOO0O;
            sampleStream.getClass();
            int iOooO0OO = sampleStream.OooO0OO(j - this.f7205OooOOO0);
            if (iOooO0OO == 0) {
                z4 = false;
            } else {
                if (z7) {
                    o000O00O.OooOo oooOo = this.f7701o000000;
                    oooOo.f33962OooO0Oo += iOooO0OO;
                    oooOo.f33963OooO0o += this.f34500o0000o0;
                } else {
                    this.f7701o000000.f33967OooOO0++;
                    o0000O00(iOooO0OO, this.f34500o0000o0);
                }
                if (OoooO0()) {
                    OoooOoO();
                }
                if (oooO0o.OooO0O0()) {
                    oooO0o.OooO00o();
                }
                z4 = true;
            }
            if (z4) {
                return false;
            }
        }
        if (((j9 > (-30000L) ? 1 : (j9 == (-30000L) ? 0 : -1)) < 0) && !z2) {
            if (z7) {
                o0000(oooO0OO, i);
                z3 = true;
            } else {
                o000OO0O.OooO00o("dropVideoBuffer");
                oooO0OO.OooOOO0(i, false);
                o000OO0O.OooO0O0();
                z3 = true;
                o0000O00(0, 1);
            }
            o0000oo(j9);
            return z3;
        }
        if (oooO0o.OooO0O0()) {
            oooO0o.OooO0o0(j, j2);
            if (!oooO0o.OooO0OO(oooOO1, j6, z2)) {
                return false;
            }
            o00000o0(oooO0OO, oooOO1, i, j6, false);
            return true;
        }
        if (o00.f34910OooO00o >= 21) {
            if (j9 < 50000) {
                if (jOooO00o == this.f34505o0000oOO) {
                    o0000(oooO0OO, i);
                    j4 = jOooO00o;
                } else {
                    o00000OO(j6, jOooO00o, oooOO1);
                    j4 = jOooO00o;
                    o0000Ooo(oooO0OO, i, j4);
                }
                o0000oo(j9);
                this.f34505o0000oOO = j4;
                return true;
            }
        } else if (j9 < 30000) {
            if (j9 > 11000) {
                try {
                    Thread.sleep((j9 - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            o00000OO(j6, jOooO00o, oooOO1);
            o00000Oo(oooO0OO, i);
            o0000oo(j9);
            return true;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public final void o00ooo() {
        super.o00ooo();
        this.f34500o0000o0 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00da  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public final void o0OoOo0(androidx.media3.common.OooOO0 oooOO1) throws ExoPlaybackException {
        boolean z;
        Pair pairCreate;
        boolean z2;
        Pair<Surface, o000Oo0> pair;
        int i;
        OooO0o oooO0o = this.f34484o00000o0;
        if (oooO0o.OooO0O0()) {
            return;
        }
        long j = this.f7702o000000O.f7730OooO0O0;
        o00Oo0.OooO0Oo(!oooO0o.OooO0O0());
        if (!oooO0o.f34527OooOO0) {
            return;
        }
        if (oooO0o.f34523OooO0o == null) {
            oooO0o.f34527OooOO0 = false;
            return;
        }
        oooO0o.f34524OooO0o0 = o00.OooOO0o(null);
        androidx.media3.common.OooO0o oooO0o2 = oooOO1.f6424OooOoOO;
        OooO oooO = oooO0o.f34520OooO0O0;
        oooO.getClass();
        try {
            if (oooO0o2 != null) {
                int i2 = oooO0o2.f6363OooO0o;
                if (i2 == 7 || i2 == 6) {
                    z = true;
                }
                if (!z) {
                    androidx.media3.common.OooO0o oooO0o3 = androidx.media3.common.OooO0o.f6356OooO;
                    pairCreate = Pair.create(oooO0o3, oooO0o3);
                } else if (oooO0o2.f6363OooO0o == 7) {
                    pairCreate = Pair.create(oooO0o2, new androidx.media3.common.OooO0o(oooO0o2.f6362OooO0Oo, oooO0o2.f6365OooO0oO, oooO0o2.f6364OooO0o0, 6));
                } else {
                    pairCreate = Pair.create(oooO0o2, oooO0o2);
                }
                if (o00.f34910OooO00o >= 21) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && (i = oooOO1.f6421OooOo0o) != 0) {
                    CopyOnWriteArrayList<o00000OO> copyOnWriteArrayList = oooO0o.f34523OooO0o;
                    OooO0o.OooO00o.OooO00o();
                    Object objNewInstance = OooO0o.OooO00o.f34533OooO00o.newInstance(new Object[0]);
                    OooO0o.OooO00o.f34534OooO0O0.invoke(objNewInstance, Float.valueOf(i));
                    Object objInvoke = OooO0o.OooO00o.f34535OooO0OO.invoke(objNewInstance, new Object[0]);
                    objInvoke.getClass();
                    copyOnWriteArrayList.add(0, (o00000OO) objInvoke);
                }
                OooO0o.OooO00o.OooO00o();
                Object objInvoke2 = OooO0o.OooO00o.f34537OooO0o0.invoke(OooO0o.OooO00o.f34536OooO0Oo.newInstance(new Object[0]), new Object[0]);
                objInvoke2.getClass();
                oooO0o.f34523OooO0o.getClass();
                Objects.requireNonNull(oooO0o.f34524OooO0o0);
                VideoFrameProcessor videoFrameProcessorOooO00o = ((VideoFrameProcessor.OooO00o) objInvoke2).OooO00o();
                oooO0o.getClass();
                videoFrameProcessorOooO00o.OooO0o();
                oooO0o.f34532OooOOOO = j;
                pair = oooO0o.f34526OooO0oo;
                if (pair == null) {
                    oooO0o.OooO0oO(oooOO1);
                    return;
                }
                o000Oo0 o000oo1 = (o000Oo0) pair.second;
                oooO0o.getClass();
                int i3 = o000oo1.f34985OooO00o;
                throw null;
            }
            androidx.media3.common.OooO0o oooO0o4 = androidx.media3.common.OooO0o.f6356OooO;
            if (o00.f34910OooO00o >= 21) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                CopyOnWriteArrayList<o00000OO> copyOnWriteArrayList2 = oooO0o.f34523OooO0o;
                OooO0o.OooO00o.OooO00o();
                Object objNewInstance2 = OooO0o.OooO00o.f34533OooO00o.newInstance(new Object[0]);
                OooO0o.OooO00o.f34534OooO0O0.invoke(objNewInstance2, Float.valueOf(i));
                Object objInvoke3 = OooO0o.OooO00o.f34535OooO0OO.invoke(objNewInstance2, new Object[0]);
                objInvoke3.getClass();
                copyOnWriteArrayList2.add(0, (o00000OO) objInvoke3);
            }
            OooO0o.OooO00o.OooO00o();
            Object objInvoke4 = OooO0o.OooO00o.f34537OooO0o0.invoke(OooO0o.OooO00o.f34536OooO0Oo.newInstance(new Object[0]), new Object[0]);
            objInvoke4.getClass();
            oooO0o.f34523OooO0o.getClass();
            Objects.requireNonNull(oooO0o.f34524OooO0o0);
            VideoFrameProcessor videoFrameProcessorOooO00o2 = ((VideoFrameProcessor.OooO00o) objInvoke4).OooO00o();
            oooO0o.getClass();
            videoFrameProcessorOooO00o2.OooO0o();
            oooO0o.f34532OooOOOO = j;
            pair = oooO0o.f34526OooO0oo;
            if (pair == null) {
                oooO0o.OooO0oO(oooOO1);
                return;
            }
            o000Oo0 o000oo2 = (o000Oo0) pair.second;
            oooO0o.getClass();
            int i4 = o000oo2.f34985OooO00o;
            throw null;
        } catch (Exception e) {
            throw oooO.OooOoO0(7000, oooOO1, e, false);
        }
        z = false;
        if (!z) {
            androidx.media3.common.OooO0o oooO0o5 = androidx.media3.common.OooO0o.f6356OooO;
            pairCreate = Pair.create(oooO0o5, oooO0o5);
        } else if (oooO0o2.f6363OooO0o == 7) {
            pairCreate = Pair.create(oooO0o2, new androidx.media3.common.OooO0o(oooO0o2.f6362OooO0Oo, oooO0o2.f6365OooO0oO, oooO0o2.f6364OooO0o0, 6));
        } else {
            pairCreate = Pair.create(oooO0o2, oooO0o2);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean o0ooOO0(androidx.media3.exoplayer.mediacodec.OooO0o oooO0o) {
        return this.f34503o0000oO != null || o00000oo(oooO0o);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int o0ooOoO(androidx.media3.exoplayer.mediacodec.OooO oooO, androidx.media3.common.OooOO0 oooOO1) throws MediaCodecUtil.DecoderQueryException {
        boolean z;
        int i = 0;
        if (!o0000oo.OooOO0(oooOO1.f6412OooOOOO)) {
            return o00O.OooO00o(0, 0, 0);
        }
        boolean z2 = oooOO1.f6414OooOOo != null;
        Context context = this.f34481o00000O;
        List<androidx.media3.exoplayer.mediacodec.OooO0o> listO000000O = o000000O(context, oooO, oooOO1, z2, false);
        if (z2 && listO000000O.isEmpty()) {
            listO000000O = o000000O(context, oooO, oooOO1, false, false);
        }
        if (listO000000O.isEmpty()) {
            return o00O.OooO00o(1, 0, 0);
        }
        int i2 = oooOO1.f6433Oooo0O0;
        if (!(i2 == 0 || i2 == 2)) {
            return o00O.OooO00o(2, 0, 0);
        }
        androidx.media3.exoplayer.mediacodec.OooO0o oooO0o = listO000000O.get(0);
        boolean zOooO0Oo = oooO0o.OooO0Oo(oooOO1);
        if (!zOooO0Oo) {
            int i3 = 1;
            while (true) {
                if (i3 >= listO000000O.size()) {
                    z = true;
                    break;
                }
                androidx.media3.exoplayer.mediacodec.OooO0o oooO0o2 = listO000000O.get(i3);
                if (oooO0o2.OooO0Oo(oooOO1)) {
                    z = false;
                    zOooO0Oo = true;
                    oooO0o = oooO0o2;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            break;
        }
        int i4 = zOooO0Oo ? 4 : 3;
        int i5 = oooO0o.OooO0o0(oooOO1) ? 16 : 8;
        int i6 = oooO0o.f7760OooO0oO ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (o00.f34910OooO00o >= 26 && "video/dolby-vision".equals(oooOO1.f6412OooOOOO) && !OooO00o.OooO00o(context)) {
            i7 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (zOooO0Oo) {
            List<androidx.media3.exoplayer.mediacodec.OooO0o> listO000000O2 = o000000O(context, oooO, oooOO1, z2, true);
            if (!listO000000O2.isEmpty()) {
                Pattern pattern = MediaCodecUtil.f7732OooO00o;
                ArrayList arrayList = new ArrayList(listO000000O2);
                Collections.sort(arrayList, new o000O0O0.o0OoOo0(new o000O0O0.Oooo0(oooOO1, 0)));
                androidx.media3.exoplayer.mediacodec.OooO0o oooO0o3 = (androidx.media3.exoplayer.mediacodec.OooO0o) arrayList.get(0);
                if (oooO0o3.OooO0Oo(oooOO1) && oooO0o3.OooO0o0(oooOO1)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    public final void oo0o0Oo() {
        androidx.media3.exoplayer.mediacodec.OooO0OO oooO0OO;
        this.f34487o0000O = false;
        if (o00.f34910OooO00o < 23 || !this.f34509o0000ooO || (oooO0OO = this.f7677Oooo0o) == null) {
            return;
        }
        this.f34510o000O000 = new OooO0OO(oooO0OO);
    }
}
