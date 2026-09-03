package androidx.media3.exoplayer.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.SampleStream;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.common.base.o0OoOo0;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import o000O0.o0oOO;
import o000O00O.OooOo;
import o000O00O.o00O0000;
import o000O0O0.OooOOO;
import o000O0O0.OooOOOO;
import o000O0O0.Oooo000;
import o000O0Oo.o0OOO0o;
import o000OO0O.OooOo00;
import o000OOoO.o0O0O00;
import o000OOoO.oo0o0Oo;
import org.conscrypt.PSKKeyManager;
import org.jctools.util.Pow2;
import p039OoooOoo.o0o0Oo;
import p070o000O0o.Oooo0;
import p080o000OoO.o00;
import p080o000OoO.o000O0;
import p080o000OoO.o000OO0O;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public abstract class MediaCodecRenderer extends androidx.media3.exoplayer.OooO0O0 {

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public static final byte[] f7655o00000O0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final OooO0OO.OooO0O0 f7656OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final OooO f7657OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final DecoderInputBuffer f7658OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final float f7659OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final boolean f7660OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final DecoderInputBuffer f7661OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final DecoderInputBuffer f7662OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ArrayList<Long> f7663OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooOOO f7664OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final MediaCodec.BufferInfo f7665OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final o0OOO0o f7666OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ArrayDeque<OooO0O0> f7667OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public androidx.media3.common.OooOO0 f7668OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public androidx.media3.common.OooOO0 f7669OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f7670Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f7671Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public DrmSession f7672Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public DrmSession f7673Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public MediaCrypto f7674Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final long f7675Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public float f7676Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public OooO0OO f7677Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public float f7678Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public androidx.media3.common.OooOO0 f7679Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public MediaFormat f7680Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public OooO0o f7681OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public ArrayDeque<OooO0o> f7682OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f7683OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public DecoderInitializationException f7684OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f7685OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f7686OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f7687OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f7688OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f7689OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f7690OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f7691Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f7692Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f7693OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f7694OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public OooOOOO f7695OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f7696Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public long f7697Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f7698OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @Nullable
    public ByteBuffer f7699Ooooooo;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public boolean f7700o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public OooOo f7701o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public OooO0O0 f7702o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public long f7703o000000o;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    @Nullable
    public ExoPlaybackException f7704o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f7705o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f7706o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f7707o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f7708o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f7709o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public boolean f7710o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public int f7711o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public int f7712o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public boolean f7713o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public boolean f7714o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public long f7715o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public boolean f7716o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f7717o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public boolean f7718o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public boolean f7719o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public long f7720o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public int f7721oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f7722oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean f7723ooOO;

    @RequiresApi(31)
    public static final class OooO00o {
        @DoNotInline
        public static void OooO00o(OooO0OO.OooO00o oooO00o, o0oOO o0ooo2) {
            o0oOO.OooO00o oooO00o2 = o0ooo2.f33916OooO00o;
            oooO00o2.getClass();
            LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            LogSessionId logSessionId2 = oooO00o2.f33918OooO00o;
            if (logSessionId2.equals(logSessionId)) {
                return;
            }
            oooO00o.f7750OooO0O0.setString("log-session-id", logSessionId2.getStringId());
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f7728OooO0Oo = new OooO0O0(-9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f7729OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f7730OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o000O0<androidx.media3.common.OooOO0> f7731OooO0OO = new o000O0<>();

        public OooO0O0(long j, long j2) {
            this.f7729OooO00o = j;
            this.f7730OooO0O0 = j2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecRenderer(int i, androidx.media3.exoplayer.mediacodec.OooO0O0 oooO0O0, boolean z, float f) {
        super(i);
        Oooo000 oooo000 = OooO.f7740OooO00o;
        this.f7656OooOOo = oooO0O0;
        this.f7657OooOOoo = oooo000;
        this.f7660OooOo00 = z;
        this.f7659OooOo0 = f;
        this.f7661OooOo0O = new DecoderInputBuffer(0);
        this.f7662OooOo0o = new DecoderInputBuffer(0);
        this.f7658OooOo = new DecoderInputBuffer(2);
        OooOOO oooOOO = new OooOOO();
        this.f7664OooOoO0 = oooOOO;
        this.f7663OooOoO = new ArrayList<>();
        this.f7665OooOoOO = new MediaCodec.BufferInfo();
        this.f7676Oooo0OO = 1.0f;
        this.f7678Oooo0o0 = 1.0f;
        this.f7675Oooo0O0 = -9223372036854775807L;
        this.f7667OooOoo0 = new ArrayDeque<>();
        o00oO0O(OooO0O0.f7728OooO0Oo);
        oooOOO.OooOO0(0);
        oooOOO.f7084OooO0o.order(ByteOrder.nativeOrder());
        this.f7666OooOoo = new o0OOO0o();
        this.f7683OoooO00 = -1.0f;
        this.f7685OoooOO0 = 0;
        this.f7712o00ooo = 0;
        this.f7696Oooooo = -1;
        this.f7698OoooooO = -1;
        this.f7697Oooooo0 = -9223372036854775807L;
        this.f7720o0ooOoO = -9223372036854775807L;
        this.f7715o0OOO0o = -9223372036854775807L;
        this.f7703o000000o = -9223372036854775807L;
        this.f7721oo000o = 0;
        this.f7711o00oO0o = 0;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int OooO0OO(androidx.media3.common.OooOO0 oooOO1) throws ExoPlaybackException {
        try {
            return o0ooOoO(this.f7657OooOOoo, oooOO1);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw OooOoO(e, oooOO1);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean OooO0Oo() {
        boolean zOooO0Oo;
        if (this.f7668OooOooO == null) {
            return false;
        }
        if (OooO0oo()) {
            zOooO0Oo = this.f7206OooOOOO;
        } else {
            SampleStream sampleStream = this.f7202OooOO0O;
            sampleStream.getClass();
            zOooO0Oo = sampleStream.OooO0Oo();
        }
        if (!zOooO0Oo) {
            if (!(this.f7698OoooooO >= 0) && (this.f7697Oooooo0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f7697Oooooo0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.OooO0O0, androidx.media3.exoplayer.Renderer
    public void OooOOo(float f, float f2) throws ExoPlaybackException {
        this.f7676Oooo0OO = f;
        this.f7678Oooo0o0 = f2;
        o0OOO0o(this.f7679Oooo0oO);
    }

    @Override // androidx.media3.exoplayer.OooO0O0, androidx.media3.exoplayer.RendererCapabilities
    public final int OooOOoo() {
        return 8;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    @Override // androidx.media3.exoplayer.Renderer
    public void OooOo00(long j, long j2) throws ExoPlaybackException {
        boolean z;
        boolean z2 = false;
        if (this.f7713o0O0O00) {
            this.f7713o0O0O00 = false;
            ooOO();
        }
        ExoPlaybackException exoPlaybackException = this.f7704o000OOo;
        if (exoPlaybackException != null) {
            this.f7704o000OOo = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f7714o0OO00O) {
                o00o0O();
                return;
            }
            if (this.f7668OooOooO != null || o00Oo0(2)) {
                OoooOoO();
                if (this.f7706o00O0O) {
                    o000OO0O.OooO00o("bypassRender");
                    while (Oooo0O0(j, j2)) {
                    }
                    o000OO0O.OooO0O0();
                } else if (this.f7677Oooo0o != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    o000OO0O.OooO00o("drainAndFeed");
                    while (Oooo0oo(j, j2)) {
                        long j3 = this.f7675Oooo0O0;
                        if (!(j3 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j3)) {
                            break;
                        }
                    }
                    while (Oooo()) {
                        long j4 = this.f7675Oooo0O0;
                        if (!(j4 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j4)) {
                            break;
                        }
                    }
                    o000OO0O.OooO0O0();
                } else {
                    OooOo oooOo = this.f7701o000000;
                    int i = oooOo.f33962OooO0Oo;
                    SampleStream sampleStream = this.f7202OooOO0O;
                    sampleStream.getClass();
                    oooOo.f33962OooO0Oo = i + sampleStream.OooO0OO(j - this.f7205OooOOO0);
                    o00Oo0(1);
                }
                synchronized (this.f7701o000000) {
                }
            }
        } catch (IllegalStateException e) {
            int i2 = o00.f34910OooO00o;
            if (i2 < 21 || !(e instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            if (!z) {
                throw e;
            }
            Ooooo00(e);
            if (i2 >= 21) {
                if (e instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e).isRecoverable() : false) {
                    z2 = true;
                }
            }
            if (z2) {
                o00Ooo();
            }
            throw OooOoO0(4003, this.f7668OooOooO, Oooo0o0(e, this.f7681OoooO), z2);
        }
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public void OooOoOO() {
        this.f7668OooOooO = null;
        o00oO0O(OooO0O0.f7728OooO0Oo);
        this.f7667OooOoo0.clear();
        OoooO0();
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public void OooOoo(long j, boolean z) throws ExoPlaybackException {
        int i;
        this.f7716o0Oo0oo = false;
        this.f7714o0OO00O = false;
        this.f7713o0O0O00 = false;
        if (this.f7706o00O0O) {
            this.f7664OooOoO0.OooO0oo();
            this.f7658OooOo.OooO0oo();
            this.f7707o00Oo0 = false;
            o0OOO0o o0ooo0o2 = this.f7666OooOoo;
            o0ooo0o2.getClass();
            o0ooo0o2.f34277OooO00o = AudioProcessor.f6730OooO00o;
            o0ooo0o2.f34279OooO0OO = 0;
            o0ooo0o2.f34278OooO0O0 = 2;
        } else if (OoooO0()) {
            OoooOoO();
        }
        o000O0<androidx.media3.common.OooOO0> o000o0 = this.f7702o000000O.f7731OooO0OO;
        synchronized (o000o0) {
            i = o000o0.f34958OooO0Oo;
        }
        if (i > 0) {
            this.f7722oo0o0Oo = true;
        }
        this.f7702o000000O.f7731OooO0OO.OooO0O0();
        this.f7667OooOoo0.clear();
    }

    public final boolean Oooo() throws ExoPlaybackException {
        OooO0OO oooO0OO = this.f7677Oooo0o;
        if (oooO0OO == null || this.f7721oo000o == 2 || this.f7716o0Oo0oo) {
            return false;
        }
        int i = this.f7696Oooooo;
        DecoderInputBuffer decoderInputBuffer = this.f7662OooOo0o;
        if (i < 0) {
            int iOooOO0O = oooO0OO.OooOO0O();
            this.f7696Oooooo = iOooOO0O;
            if (iOooOO0O < 0) {
                return false;
            }
            decoderInputBuffer.f7084OooO0o = this.f7677Oooo0o.OooO0Oo(iOooOO0O);
            decoderInputBuffer.OooO0oo();
        }
        if (this.f7721oo000o == 1) {
            if (!this.f7694OooooOO) {
                this.f7718o0ooOO0 = true;
                this.f7677Oooo0o.OooO(0L, this.f7696Oooooo, 0, 4);
                this.f7696Oooooo = -1;
                decoderInputBuffer.f7084OooO0o = null;
            }
            this.f7721oo000o = 2;
            return false;
        }
        if (this.f7692Ooooo0o) {
            this.f7692Ooooo0o = false;
            decoderInputBuffer.f7084OooO0o.put(f7655o00000O0);
            this.f7677Oooo0o.OooO(0L, this.f7696Oooooo, 38, 0);
            this.f7696Oooooo = -1;
            decoderInputBuffer.f7084OooO0o = null;
            this.f7710o00oO0O = true;
            return true;
        }
        if (this.f7712o00ooo == 1) {
            for (int i2 = 0; i2 < this.f7679Oooo0oO.f6415OooOOo0.size(); i2++) {
                decoderInputBuffer.f7084OooO0o.put(this.f7679Oooo0oO.f6415OooOOo0.get(i2));
            }
            this.f7712o00ooo = 2;
        }
        int iPosition = decoderInputBuffer.f7084OooO0o.position();
        o00O0000 o00o0001 = this.f7197OooO0o;
        o00o0001.OooO00o();
        try {
            int iOooo0 = Oooo0(o00o0001, decoderInputBuffer, 0);
            if (OooO0oo() || decoderInputBuffer.OooO0o(536870912)) {
                this.f7715o0OOO0o = this.f7720o0ooOoO;
            }
            if (iOooo0 == -3) {
                return false;
            }
            if (iOooo0 == -5) {
                if (this.f7712o00ooo == 2) {
                    decoderInputBuffer.OooO0oo();
                    this.f7712o00ooo = 1;
                }
                OooooOO(o00o0001);
                return true;
            }
            if (decoderInputBuffer.OooO0o(4)) {
                if (this.f7712o00ooo == 2) {
                    decoderInputBuffer.OooO0oo();
                    this.f7712o00ooo = 1;
                }
                this.f7716o0Oo0oo = true;
                if (!this.f7710o00oO0O) {
                    ooOO();
                    return false;
                }
                try {
                    if (!this.f7694OooooOO) {
                        this.f7718o0ooOO0 = true;
                        this.f7677Oooo0o.OooO(0L, this.f7696Oooooo, 0, 4);
                        this.f7696Oooooo = -1;
                        decoderInputBuffer.f7084OooO0o = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw OooOoO0(o00.OooOOo(e.getErrorCode()), this.f7668OooOooO, e, false);
                }
            }
            if (!this.f7710o00oO0O && !decoderInputBuffer.OooO0o(1)) {
                decoderInputBuffer.OooO0oo();
                if (this.f7712o00ooo == 2) {
                    this.f7712o00ooo = 1;
                }
                return true;
            }
            boolean zOooO0o = decoderInputBuffer.OooO0o(Pow2.MAX_POW2);
            o000O00.OooO oooO = decoderInputBuffer.f7085OooO0o0;
            if (zOooO0o) {
                if (iPosition == 0) {
                    oooO.getClass();
                } else {
                    if (oooO.f33923OooO0Oo == null) {
                        int[] iArr = new int[1];
                        oooO.f33923OooO0Oo = iArr;
                        oooO.f33919OooO.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = oooO.f33923OooO0Oo;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            if (this.f7705o000oOoO && !zOooO0o) {
                ByteBuffer byteBuffer = decoderInputBuffer.f7084OooO0o;
                byte[] bArr = Oooo0.f34301OooO00o;
                int iPosition2 = byteBuffer.position();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = i3 + 1;
                    if (i5 >= iPosition2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i6 = byteBuffer.get(i3) & UByte.MAX_VALUE;
                    if (i4 == 3) {
                        if (i6 == 1 && (byteBuffer.get(i5) & 31) == 7) {
                            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                            byteBufferDuplicate.position(i3 - 3);
                            byteBufferDuplicate.limit(iPosition2);
                            byteBuffer.position(0);
                            byteBuffer.put(byteBufferDuplicate);
                            break;
                        }
                    } else if (i6 == 0) {
                        i4++;
                    }
                    if (i6 != 0) {
                        i4 = 0;
                    }
                    i3 = i5;
                }
                if (decoderInputBuffer.f7084OooO0o.position() == 0) {
                    return true;
                }
                this.f7705o000oOoO = false;
            }
            long j = decoderInputBuffer.f7087OooO0oo;
            OooOOOO oooOOOO = this.f7695OooooOo;
            if (oooOOOO != null) {
                androidx.media3.common.OooOO0 oooOO1 = this.f7668OooOooO;
                if (oooOOOO.f34225OooO0O0 == 0) {
                    oooOOOO.f34224OooO00o = j;
                }
                if (!oooOOOO.f34226OooO0OO) {
                    ByteBuffer byteBuffer2 = decoderInputBuffer.f7084OooO0o;
                    byteBuffer2.getClass();
                    int i7 = 0;
                    int i8 = 0;
                    for (int i9 = 4; i7 < i9; i9 = 4) {
                        i8 = (i8 << 8) | (byteBuffer2.get(i7) & UByte.MAX_VALUE);
                        i7++;
                    }
                    int iOooO0O0 = oo0o0Oo.OooO0O0(i8);
                    if (iOooO0O0 == -1) {
                        oooOOOO.f34226OooO0OO = true;
                        oooOOOO.f34225OooO0O0 = 0L;
                        oooOOOO.f34224OooO00o = decoderInputBuffer.f7087OooO0oo;
                        Log.OooO0o("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                        j = decoderInputBuffer.f7087OooO0oo;
                    } else {
                        long jMax = Math.max(0L, ((oooOOOO.f34225OooO0O0 - 529) * AnimationKt.MillisToNanos) / oooOO1.f6425OooOoo) + oooOOOO.f34224OooO00o;
                        oooOOOO.f34225OooO0O0 += (long) iOooO0O0;
                        j = jMax;
                    }
                }
                long j2 = this.f7720o0ooOoO;
                OooOOOO oooOOOO2 = this.f7695OooooOo;
                androidx.media3.common.OooOO0 oooOO2 = this.f7668OooOooO;
                oooOOOO2.getClass();
                this.f7720o0ooOoO = Math.max(j2, Math.max(0L, ((oooOOOO2.f34225OooO0O0 - 529) * AnimationKt.MillisToNanos) / oooOO2.f6425OooOoo) + oooOOOO2.f34224OooO00o);
            } else {
                zOooO0o = zOooO0o;
            }
            if (decoderInputBuffer.OooO0oO()) {
                this.f7663OooOoO.add(Long.valueOf(j));
            }
            if (this.f7722oo0o0Oo) {
                ArrayDeque<OooO0O0> arrayDeque = this.f7667OooOoo0;
                if (arrayDeque.isEmpty()) {
                    this.f7702o000000O.f7731OooO0OO.OooO00o(j, this.f7668OooOooO);
                } else {
                    arrayDeque.peekLast().f7731OooO0OO.OooO00o(j, this.f7668OooOooO);
                }
                this.f7722oo0o0Oo = false;
            }
            this.f7720o0ooOoO = Math.max(this.f7720o0ooOoO, j);
            decoderInputBuffer.OooOO0O();
            if (decoderInputBuffer.OooO0o(SQLiteDatabase.CREATE_IF_NECESSARY)) {
                OoooOOo(decoderInputBuffer);
            }
            Ooooooo(decoderInputBuffer);
            try {
                if (zOooO0o) {
                    this.f7677Oooo0o.OooO0oO(this.f7696Oooooo, oooO, j);
                } else {
                    this.f7677Oooo0o.OooO(j, this.f7696Oooooo, decoderInputBuffer.f7084OooO0o.limit(), 0);
                }
                this.f7696Oooooo = -1;
                decoderInputBuffer.f7084OooO0o = null;
                this.f7710o00oO0O = true;
                this.f7712o00ooo = 0;
                this.f7701o000000.f33961OooO0OO++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw OooOoO0(o00.OooOOo(e2.getErrorCode()), this.f7668OooOooO, e2, false);
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e3) {
            Ooooo00(e3);
            o00Oo0(0);
            OoooO00();
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r2 >= r7) goto L13;
     */
    @Override // androidx.media3.exoplayer.OooO0O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo00o(androidx.media3.common.OooOO0[] oooOO0Arr, long j, long j2) throws ExoPlaybackException {
        if (this.f7702o000000O.f7730OooO0O0 == -9223372036854775807L) {
            o00oO0O(new OooO0O0(-9223372036854775807L, j2));
            return;
        }
        ArrayDeque<OooO0O0> arrayDeque = this.f7667OooOoo0;
        if (arrayDeque.isEmpty()) {
            long j3 = this.f7720o0ooOoO;
            if (j3 != -9223372036854775807L) {
                long j4 = this.f7703o000000o;
                if (j4 != -9223372036854775807L) {
                }
            }
            o00oO0O(new OooO0O0(-9223372036854775807L, j2));
            if (this.f7702o000000O.f7730OooO0O0 != -9223372036854775807L) {
                OoooooO();
                return;
            }
            return;
        }
        arrayDeque.add(new OooO0O0(this.f7720o0ooOoO, j2));
    }

    /* JADX WARN: Code duplicated, block: B:106:0x027a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r23v0, types: [androidx.media3.exoplayer.OooO0O0, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v13, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final boolean Oooo0O0(long j, long j2) throws ExoPlaybackException {
        boolean z;
        OooOOO oooOOO;
        ?? r9;
        boolean z2;
        ?? r10;
        String str;
        ?? r5;
        boolean z3;
        o00Oo0.OooO0Oo(!this.f7714o0OO00O);
        OooOOO oooOOO2 = this.f7664OooOoO0;
        int i = oooOOO2.f34210OooOOO0;
        if (!(i > 0)) {
            z = false;
            oooOOO = oooOOO2;
        } else {
            if (!o00O0O(j, j2, null, oooOOO2.f7084OooO0o, this.f7698OoooooO, 0, i, oooOOO2.f7087OooO0oo, oooOOO2.OooO0oO(), oooOOO2.OooO0o(4), this.f7669OooOooo)) {
                return false;
            }
            oooOOO = oooOOO2;
            Oooooo(oooOOO.f34208OooOO0o);
            oooOOO.OooO0oo();
            z = false;
        }
        if (this.f7716o0Oo0oo) {
            this.f7714o0OO00O = true;
            return z;
        }
        boolean z4 = true;
        boolean z5 = this.f7707o00Oo0;
        DecoderInputBuffer decoderInputBuffer = this.f7658OooOo;
        if (z5) {
            o00Oo0.OooO0Oo(oooOOO.OooOO0o(decoderInputBuffer));
            this.f7707o00Oo0 = z;
        }
        if (this.f7708o00Ooo) {
            if (oooOOO.f34210OooOOO0 > 0 ? true : z ? 1 : 0) {
                return true;
            }
            Oooo0o();
            this.f7708o00Ooo = z;
            OoooOoO();
            if (!this.f7706o00O0O) {
                return z;
            }
        }
        o00Oo0.OooO0Oo(!this.f7716o0Oo0oo);
        o00O0000 o00o0001 = this.f7197OooO0o;
        o00o0001.OooO00o();
        decoderInputBuffer.OooO0oo();
        ?? r1 = z;
        while (true) {
            decoderInputBuffer.OooO0oo();
            int iOooo0 = Oooo0(o00o0001, decoderInputBuffer, r1);
            if (iOooo0 == -5) {
                r9 = r1;
                z2 = z4;
                OooooOO(o00o0001);
                break;
            }
            if (iOooo0 != -4) {
                if (iOooo0 != -3) {
                    throw new IllegalStateException();
                }
            } else if (decoderInputBuffer.OooO0o(4)) {
                this.f7716o0Oo0oo = z4;
            } else {
                byte[] bArr = null;
                if (this.f7722oo0o0Oo) {
                    androidx.media3.common.OooOO0 oooOO1 = this.f7668OooOooO;
                    oooOO1.getClass();
                    this.f7669OooOooo = oooOO1;
                    OooooOo(oooOO1, null);
                    this.f7722oo0o0Oo = r1;
                }
                decoderInputBuffer.OooOO0O();
                androidx.media3.common.OooOO0 oooOO2 = this.f7668OooOooO;
                if (oooOO2 == null || (str = oooOO2.f6412OooOOOO) == null || !str.equals("audio/opus")) {
                    r10 = r1;
                } else {
                    List<byte[]> list = this.f7668OooOooO.f6415OooOOo0;
                    o0OOO0o o0ooo0o2 = this.f7666OooOoo;
                    o0ooo0o2.getClass();
                    decoderInputBuffer.f7084OooO0o.getClass();
                    if (decoderInputBuffer.f7084OooO0o.limit() - decoderInputBuffer.f7084OooO0o.position() == 0) {
                        r10 = r1;
                    } else {
                        if (o0ooo0o2.f34278OooO0O0 == 2 && (list.size() == z4 || list.size() == 3)) {
                            bArr = list.get(r1);
                        }
                        ByteBuffer byteBuffer = decoderInputBuffer.f7084OooO0o;
                        int iPosition = byteBuffer.position();
                        int iLimit = byteBuffer.limit();
                        int i2 = iLimit - iPosition;
                        int i3 = (i2 + 255) / 255;
                        int i4 = i3 + 27 + i2;
                        if (o0ooo0o2.f34278OooO0O0 == 2) {
                            int length = bArr != null ? bArr.length + 28 : 47;
                            i4 = (length == true ? 1 : 0) + 44 + i4;
                            r5 = length;
                        } else {
                            r5 = r1;
                        }
                        int i5 = i4;
                        if (o0ooo0o2.f34277OooO00o.capacity() < i5) {
                            o0ooo0o2.f34277OooO00o = ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
                        } else {
                            o0ooo0o2.f34277OooO00o.clear();
                        }
                        ByteBuffer byteBuffer2 = o0ooo0o2.f34277OooO00o;
                        if (o0ooo0o2.f34278OooO0O0 == 2) {
                            if (bArr != null) {
                                o0OOO0o.OooO00o(0, byteBuffer2, 1, true, 0L);
                                long length2 = bArr.length;
                                o0OoOo0.OooO0O0(length2, "out of range: %s", (length2 >> 8) == 0);
                                byteBuffer2.put((byte) length2);
                                byteBuffer2.put(bArr);
                                byteBuffer2.putInt(22, o00.OooOO0O(byteBuffer2.arrayOffset(), byteBuffer2.array(), bArr.length + 28, 0));
                                byteBuffer2.position(bArr.length + 28);
                            } else {
                                byteBuffer2.put(o0OOO0o.f34275OooO0Oo);
                            }
                            byteBuffer2.put(o0OOO0o.f34276OooO0o0);
                        } else {
                            iLimit = iLimit;
                        }
                        int iOooO0O0 = o0ooo0o2.f34279OooO0OO + ((int) ((o0O0O00.OooO0O0(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / AnimationKt.MillisToNanos));
                        o0ooo0o2.f34279OooO0OO = iOooO0O0;
                        o0OOO0o.OooO00o(o0ooo0o2.f34278OooO0O0, byteBuffer2, i3, false, iOooO0O0);
                        int i6 = i2;
                        for (int i7 = 0; i7 < i3; i7++) {
                            if (i6 >= 255) {
                                byteBuffer2.put((byte) -1);
                                i6 -= 255;
                            } else {
                                byteBuffer2.put((byte) i6);
                                i6 = 0;
                            }
                        }
                        int i8 = iLimit;
                        while (iPosition < i8) {
                            byteBuffer2.put(byteBuffer.get(iPosition));
                            iPosition++;
                        }
                        byteBuffer.position(byteBuffer.limit());
                        byteBuffer2.flip();
                        if (o0ooo0o2.f34278OooO0O0 == 2) {
                            z3 = false;
                            byteBuffer2.putInt(r5 + 44 + 22, o00.OooOO0O(byteBuffer2.arrayOffset() + r5 + 44, byteBuffer2.array(), byteBuffer2.limit() - byteBuffer2.position(), 0));
                        } else {
                            z3 = false;
                            byteBuffer2.putInt(22, o00.OooOO0O(byteBuffer2.arrayOffset(), byteBuffer2.array(), byteBuffer2.limit() - byteBuffer2.position(), 0));
                        }
                        o0ooo0o2.f34278OooO0O0++;
                        o0ooo0o2.f34277OooO00o = byteBuffer2;
                        decoderInputBuffer.OooO0oo();
                        decoderInputBuffer.OooOO0(o0ooo0o2.f34277OooO00o.remaining());
                        decoderInputBuffer.f7084OooO0o.put(o0ooo0o2.f34277OooO00o);
                        decoderInputBuffer.OooOO0O();
                        r10 = z3;
                    }
                }
                if (!oooOOO.OooOO0o(decoderInputBuffer)) {
                    z2 = true;
                    this.f7707o00Oo0 = true;
                    r9 = r10;
                    break;
                }
                r1 = r10 == true ? 1 : 0;
                z4 = true;
            }
            r9 = r1;
            z2 = z4;
            break;
        }
        if ((oooOOO.f34210OooOOO0 > 0 ? z2 : r9) != 0) {
            oooOOO.OooOO0O();
        }
        return ((oooOOO.f34210OooOOO0 > 0 ? z2 : r9) != 0 || this.f7716o0Oo0oo || this.f7708o00Ooo) ? z2 : r9;
    }

    public abstract DecoderReuseEvaluation Oooo0OO(OooO0o oooO0o, androidx.media3.common.OooOO0 oooOO1, androidx.media3.common.OooOO0 oooOO2);

    public final void Oooo0o() {
        this.f7708o00Ooo = false;
        this.f7664OooOoO0.OooO0oo();
        this.f7658OooOo.OooO0oo();
        this.f7707o00Oo0 = false;
        this.f7706o00O0O = false;
        o0OOO0o o0ooo0o2 = this.f7666OooOoo;
        o0ooo0o2.getClass();
        o0ooo0o2.f34277OooO00o = AudioProcessor.f6730OooO00o;
        o0ooo0o2.f34279OooO0OO = 0;
        o0ooo0o2.f34278OooO0O0 = 2;
    }

    public MediaCodecDecoderException Oooo0o0(IllegalStateException illegalStateException, @Nullable OooO0o oooO0o) {
        return new MediaCodecDecoderException(illegalStateException, oooO0o);
    }

    @TargetApi(23)
    public final boolean Oooo0oO() throws ExoPlaybackException {
        if (this.f7710o00oO0O) {
            this.f7721oo000o = 1;
            if (this.f7686OoooOOO || this.f7688OoooOo0) {
                this.f7711o00oO0o = 3;
                return false;
            }
            this.f7711o00oO0o = 2;
        } else {
            o0Oo0oo();
        }
        return true;
    }

    public final boolean Oooo0oo(long j, long j2) throws ExoPlaybackException {
        boolean z;
        MediaCodec.BufferInfo bufferInfo;
        boolean zO00O0O;
        int iOooOO0o;
        boolean z2;
        boolean z3 = this.f7698OoooooO >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f7665OooOoOO;
        if (!z3) {
            if (this.f7689OoooOoO && this.f7718o0ooOO0) {
                try {
                    iOooOO0o = this.f7677Oooo0o.OooOO0o(bufferInfo2);
                } catch (IllegalStateException unused) {
                    ooOO();
                    if (this.f7714o0OO00O) {
                        o00Ooo();
                    }
                    return false;
                }
            } else {
                iOooOO0o = this.f7677Oooo0o.OooOO0o(bufferInfo2);
            }
            if (iOooOO0o < 0) {
                if (iOooOO0o != -2) {
                    if (this.f7694OooooOO && (this.f7716o0Oo0oo || this.f7721oo000o == 2)) {
                        ooOO();
                    }
                    return false;
                }
                this.f7719o0ooOOo = true;
                MediaFormat mediaFormatOooO0O0 = this.f7677Oooo0o.OooO0O0();
                if (this.f7685OoooOO0 != 0 && mediaFormatOooO0O0.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) == 32 && mediaFormatOooO0O0.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY) == 32) {
                    this.f7693OooooO0 = true;
                } else {
                    if (this.f7691Ooooo00) {
                        mediaFormatOooO0O0.setInteger("channel-count", 1);
                    }
                    this.f7680Oooo0oo = mediaFormatOooO0O0;
                    this.f7670Oooo = true;
                }
                return true;
            }
            if (this.f7693OooooO0) {
                this.f7693OooooO0 = false;
                this.f7677Oooo0o.OooOOO0(iOooOO0o, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                ooOO();
                return false;
            }
            this.f7698OoooooO = iOooOO0o;
            ByteBuffer byteBufferOooOOO = this.f7677Oooo0o.OooOOO(iOooOO0o);
            this.f7699Ooooooo = byteBufferOooOOO;
            if (byteBufferOooOOO != null) {
                byteBufferOooOOO.position(bufferInfo2.offset);
                this.f7699Ooooooo.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f7690OoooOoo && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j3 = this.f7720o0ooOoO;
                if (j3 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j3;
                }
            }
            long j4 = bufferInfo2.presentationTimeUs;
            ArrayList<Long> arrayList = this.f7663OooOoO;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z2 = false;
                    break;
                }
                if (arrayList.get(i).longValue() == j4) {
                    arrayList.remove(i);
                    z2 = true;
                    break;
                }
                i++;
            }
            this.f7717o0OoOo0 = z2;
            long j5 = this.f7715o0OOO0o;
            long j6 = bufferInfo2.presentationTimeUs;
            this.f7723ooOO = j5 == j6;
            o0OO00O(j6);
        }
        if (this.f7689OoooOoO && this.f7718o0ooOO0) {
            try {
                z = false;
                try {
                    zO00O0O = o00O0O(j, j2, this.f7677Oooo0o, this.f7699Ooooooo, this.f7698OoooooO, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f7717o0OoOo0, this.f7723ooOO, this.f7669OooOooo);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    ooOO();
                    if (this.f7714o0OO00O) {
                        o00Ooo();
                    }
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            bufferInfo = bufferInfo2;
            zO00O0O = o00O0O(j, j2, this.f7677Oooo0o, this.f7699Ooooooo, this.f7698OoooooO, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f7717o0OoOo0, this.f7723ooOO, this.f7669OooOooo);
        }
        if (zO00O0O) {
            Oooooo(bufferInfo.presentationTimeUs);
            boolean z4 = (bufferInfo.flags & 4) != 0 ? true : z;
            this.f7698OoooooO = -1;
            this.f7699Ooooooo = null;
            if (!z4) {
                return r13;
            }
            ooOO();
        }
        return z;
    }

    public boolean OoooO() {
        return false;
    }

    public final boolean OoooO0() {
        if (this.f7677Oooo0o == null) {
            return false;
        }
        int i = this.f7711o00oO0o;
        if (i == 3 || this.f7686OoooOOO || ((this.f7687OoooOOo && !this.f7719o0ooOOo) || (this.f7688OoooOo0 && this.f7718o0ooOO0))) {
            o00Ooo();
            return true;
        }
        if (i == 2) {
            int i2 = o00.f34910OooO00o;
            o00Oo0.OooO0Oo(i2 >= 23);
            if (i2 >= 23) {
                try {
                    o0Oo0oo();
                } catch (ExoPlaybackException e) {
                    Log.OooO0oO("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    o00Ooo();
                    return true;
                }
            }
        }
        OoooO00();
        return false;
    }

    public final void OoooO00() {
        try {
            this.f7677Oooo0o.flush();
        } finally {
            o00ooo();
        }
    }

    public final List<OooO0o> OoooO0O(boolean z) throws MediaCodecUtil.DecoderQueryException {
        androidx.media3.common.OooOO0 oooOO1 = this.f7668OooOooO;
        OooO oooO = this.f7657OooOOoo;
        ArrayList arrayListO000oOoO = o000oOoO(oooO, oooOO1, z);
        if (arrayListO000oOoO.isEmpty() && z) {
            arrayListO000oOoO = o000oOoO(oooO, this.f7668OooOooO, false);
            if (!arrayListO000oOoO.isEmpty()) {
                Log.OooO0o("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f7668OooOooO.f6412OooOOOO + ", but no secure decoder available. Trying to proceed with " + arrayListO000oOoO + ".");
            }
        }
        return arrayListO000oOoO;
    }

    public abstract float OoooOO0(float f, androidx.media3.common.OooOO0[] oooOO0Arr);

    public abstract OooO0OO.OooO00o OoooOOO(OooO0o oooO0o, androidx.media3.common.OooOO0 oooOO1, @Nullable MediaCrypto mediaCrypto, float f);

    public void OoooOOo(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    /* JADX WARN: Code duplicated, block: B:186:0x033b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0373  */
    /* JADX WARN: Code duplicated, block: B:246:0x040a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0466  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v9, types: [int] */
    public final void OoooOo0(OooO0o oooO0o, @Nullable MediaCrypto mediaCrypto) throws Exception {
        float fOoooOO0;
        boolean z;
        ?? r11;
        boolean z2;
        boolean z3;
        String string;
        String str;
        String str2;
        String strOooOOO;
        int i;
        String str3 = oooO0o.f7754OooO00o;
        int i2 = o00.f34910OooO00o;
        if (i2 < 23) {
            fOoooOO0 = -1.0f;
        } else {
            float f = this.f7678Oooo0o0;
            androidx.media3.common.OooOO0[] oooOO0Arr = this.f7203OooOO0o;
            oooOO0Arr.getClass();
            fOoooOO0 = OoooOO0(f, oooOO0Arr);
        }
        if (fOoooOO0 <= this.f7659OooOo0) {
            fOoooOO0 = -1.0f;
        }
        o0OoOo0(this.f7668OooOooO);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        OooO0OO.OooO00o oooO00oOoooOOO = OoooOOO(oooO0o, this.f7668OooOooO, mediaCrypto, fOoooOO0);
        if (i2 >= 31) {
            o0oOO o0ooo2 = this.f7195OooO;
            o0ooo2.getClass();
            OooO00o.OooO00o(oooO00oOoooOOO, o0ooo2);
        }
        try {
            o000OO0O.OooO00o("createCodec:" + str3);
            this.f7677Oooo0o = this.f7656OooOOo.OooO00o(oooO00oOoooOOO);
            o000OO0O.OooO0O0();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (oooO0o.OooO0Oo(this.f7668OooOooO)) {
                z = false;
            } else {
                Object[] objArr = new Object[2];
                androidx.media3.common.OooOO0 oooOO1 = this.f7668OooOooO;
                if (oooOO1 == null) {
                    string = "null";
                } else {
                    StringBuilder sbOooO00o = o0o0Oo.OooO00o("id=");
                    sbOooO00o.append(oooOO1.f6402OooO0Oo);
                    sbOooO00o.append(", mimeType=");
                    sbOooO00o.append(oooOO1.f6412OooOOOO);
                    int i3 = oooOO1.f6408OooOO0O;
                    if (i3 != -1) {
                        sbOooO00o.append(", bitrate=");
                        sbOooO00o.append(i3);
                    }
                    String str4 = oooOO1.f6409OooOO0o;
                    if (str4 != null) {
                        sbOooO00o.append(", codecs=");
                        sbOooO00o.append(str4);
                    }
                    DrmInitData drmInitData = oooOO1.f6414OooOOo;
                    if (drmInitData != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        int i4 = 0;
                        while (i4 < drmInitData.f6228OooO0oO) {
                            UUID uuid = drmInitData.f6225OooO0Oo[i4].f6231OooO0o0;
                            if (uuid.equals(C.f6207OooO0O0)) {
                                linkedHashSet.add("cenc");
                            } else if (uuid.equals(C.f6208OooO0OO)) {
                                linkedHashSet.add("clearkey");
                            } else if (uuid.equals(C.f6210OooO0o0)) {
                                linkedHashSet.add("playready");
                            } else if (uuid.equals(C.f6209OooO0Oo)) {
                                linkedHashSet.add("widevine");
                            } else {
                                if (uuid.equals(C.f6206OooO00o)) {
                                    linkedHashSet.add("universal");
                                } else {
                                    linkedHashSet.add("unknown (" + uuid + ")");
                                }
                                i4++;
                                drmInitData = drmInitData;
                            }
                            i4++;
                            drmInitData = drmInitData;
                        }
                        sbOooO00o.append(", drm=[");
                        new com.google.common.base.OooOo(String.valueOf(',')).OooO00o(sbOooO00o, linkedHashSet.iterator());
                        sbOooO00o.append(']');
                    }
                    int i5 = oooOO1.f6419OooOo00;
                    if (i5 != -1 && (i = oooOO1.f6418OooOo0) != -1) {
                        sbOooO00o.append(", res=");
                        sbOooO00o.append(i5);
                        sbOooO00o.append("x");
                        sbOooO00o.append(i);
                    }
                    androidx.media3.common.OooO0o oooO0o2 = oooOO1.f6424OooOoOO;
                    if (oooO0o2 != null) {
                        int i6 = oooO0o2.f6362OooO0Oo;
                        int i7 = oooO0o2.f6363OooO0o;
                        int i8 = oooO0o2.f6364OooO0o0;
                        if ((i6 == -1 || i8 == -1 || i7 == -1) ? false : true) {
                            sbOooO00o.append(", color=");
                            if ((i6 == -1 || i8 == -1 || i7 == -1) ? false : true) {
                                Object[] objArr2 = new Object[3];
                                if (i6 == -1) {
                                    str = "Unset color space";
                                } else if (i6 == 6) {
                                    str = "BT2020";
                                } else if (i6 != 1) {
                                    str = i6 != 2 ? "Undefined color space" : "BT601";
                                } else {
                                    str = "BT709";
                                }
                                objArr2[0] = str;
                                if (i8 == -1) {
                                    str2 = "Unset color range";
                                } else if (i8 != 1) {
                                    str2 = i8 != 2 ? "Undefined color range" : "Limited range";
                                } else {
                                    str2 = "Full range";
                                }
                                objArr2[1] = str2;
                                objArr2[2] = androidx.media3.common.OooO0o.OooO0OO(i7);
                                strOooOOO = o00.OooOOO("%s/%s/%s", objArr2);
                            } else {
                                strOooOOO = "NA";
                            }
                            sbOooO00o.append(strOooOOO);
                        }
                    }
                    float f2 = oooOO1.f6420OooOo0O;
                    if (f2 != -1.0f) {
                        sbOooO00o.append(", fps=");
                        sbOooO00o.append(f2);
                    }
                    int i9 = oooOO1.f6426OooOoo0;
                    if (i9 != -1) {
                        sbOooO00o.append(", channels=");
                        sbOooO00o.append(i9);
                    }
                    int i10 = oooOO1.f6425OooOoo;
                    if (i10 != -1) {
                        sbOooO00o.append(", sample_rate=");
                        sbOooO00o.append(i10);
                    }
                    String str5 = oooOO1.f6403OooO0o;
                    if (str5 != null) {
                        sbOooO00o.append(", language=");
                        sbOooO00o.append(str5);
                    }
                    String str6 = oooOO1.f6404OooO0o0;
                    if (str6 != null) {
                        sbOooO00o.append(", label=");
                        sbOooO00o.append(str6);
                    }
                    int i11 = oooOO1.f6405OooO0oO;
                    if (i11 != 0) {
                        ArrayList arrayList = new ArrayList();
                        if ((i11 & 4) != 0) {
                            arrayList.add(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                        }
                        if ((i11 & 1) != 0) {
                            arrayList.add(NewFriendsOld.State_Default);
                        }
                        if ((i11 & 2) != 0) {
                            arrayList.add("forced");
                        }
                        sbOooO00o.append(", selectionFlags=[");
                        new com.google.common.base.OooOo(String.valueOf(',')).OooO00o(sbOooO00o, arrayList.iterator());
                        sbOooO00o.append("]");
                    }
                    int i12 = oooOO1.f6406OooO0oo;
                    if (i12 != 0) {
                        ArrayList arrayList2 = new ArrayList();
                        if ((i12 & 1) != 0) {
                            arrayList2.add("main");
                        }
                        if ((i12 & 2) != 0) {
                            arrayList2.add("alt");
                        }
                        if ((i12 & 4) != 0) {
                            arrayList2.add("supplementary");
                        }
                        if ((i12 & 8) != 0) {
                            arrayList2.add("commentary");
                        }
                        if ((i12 & 16) != 0) {
                            arrayList2.add("dub");
                        }
                        if ((i12 & 32) != 0) {
                            arrayList2.add("emergency");
                        }
                        if ((i12 & 64) != 0) {
                            arrayList2.add(ShareConstants.FEED_CAPTION_PARAM);
                        }
                        if ((i12 & 128) != 0) {
                            arrayList2.add("subtitle");
                        }
                        if ((i12 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            arrayList2.add("sign");
                        }
                        if ((i12 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            arrayList2.add("describes-video");
                        }
                        if ((i12 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            arrayList2.add("describes-music");
                        }
                        if ((i12 & 2048) != 0) {
                            arrayList2.add("enhanced-intelligibility");
                        }
                        if ((i12 & 4096) != 0) {
                            arrayList2.add("transcribes-dialog");
                        }
                        if ((i12 & 8192) != 0) {
                            arrayList2.add("easy-read");
                        }
                        if ((i12 & 16384) != 0) {
                            arrayList2.add("trick-play");
                        }
                        sbOooO00o.append(", roleFlags=[");
                        new com.google.common.base.OooOo(String.valueOf(',')).OooO00o(sbOooO00o, arrayList2.iterator());
                        sbOooO00o.append("]");
                    }
                    string = sbOooO00o.toString();
                }
                z = false;
                objArr[0] = string;
                objArr[1] = str3;
                Log.OooO0o("MediaCodecRenderer", o00.OooOOO("Format exceeds selected codec's capabilities [%s, %s]", objArr));
            }
            this.f7681OoooO = oooO0o;
            this.f7683OoooO00 = fOoooOO0;
            this.f7679Oooo0oO = this.f7668OooOooO;
            int i13 = o00.f34910OooO00o;
            if (i13 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str3)) {
                String str7 = o00.f34913OooO0Oo;
                if (str7.startsWith("SM-T585") || str7.startsWith("SM-A510") || str7.startsWith("SM-A520") || str7.startsWith("SM-J700")) {
                    r11 = 2;
                } else if (i13 < 24) {
                    r11 = z;
                } else {
                    r11 = z;
                }
            } else if (i13 < 24 || !("OMX.Nvidia.h264.decode".equals(str3) || "OMX.Nvidia.h264.decode.secure".equals(str3))) {
                r11 = z;
            } else {
                String str8 = o00.f34911OooO0O0;
                if ("flounder".equals(str8) || "flounder_lte".equals(str8) || "grouper".equals(str8) || "tilapia".equals(str8)) {
                    r11 = 1;
                } else {
                    r11 = z;
                }
            }
            this.f7685OoooOO0 = r11;
            this.f7705o000oOoO = (i13 < 21 && this.f7679Oooo0oO.f6415OooOOo0.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str3)) ? true : z;
            this.f7686OoooOOO = (i13 < 18 || (i13 == 18 && ("OMX.SEC.avc.dec".equals(str3) || "OMX.SEC.avc.dec.secure".equals(str3))) || (i13 == 19 && o00.f34913OooO0Oo.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str3) || "OMX.Exynos.avc.dec.secure".equals(str3)))) ? true : z;
            this.f7687OoooOOo = (i13 == 29 && "c2.android.aac.decoder".equals(str3)) ? true : z;
            if (i13 > 23 || !"OMX.google.vorbis.decoder".equals(str3)) {
                if (i13 <= 19) {
                    String str9 = o00.f34911OooO0O0;
                    if (("hb2000".equals(str9) || "stvm8".equals(str9)) && ("OMX.amlogic.avc.decoder.awesome".equals(str3) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str3))) {
                        z2 = true;
                    }
                }
                z2 = z;
            } else {
                z2 = true;
            }
            this.f7688OoooOo0 = z2;
            this.f7689OoooOoO = (i13 == 21 && "OMX.google.aac.decoder".equals(str3)) ? true : z;
            if (i13 < 21 && "OMX.SEC.mp3.dec".equals(str3) && "samsung".equals(o00.f34912OooO0OO)) {
                String str10 = o00.f34911OooO0O0;
                if (str10.startsWith("baffin") || str10.startsWith("grand") || str10.startsWith("fortuna") || str10.startsWith("gprimelte") || str10.startsWith("j2y18lte") || str10.startsWith("ms01")) {
                    z3 = true;
                } else {
                    z3 = z;
                }
            } else {
                z3 = z;
            }
            this.f7690OoooOoo = z3;
            this.f7691Ooooo00 = (i13 <= 18 && this.f7679Oooo0oO.f6426OooOoo0 == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str3)) ? true : z;
            String str11 = oooO0o.f7754OooO00o;
            if ((((i13 > 25 || !"OMX.rk.video_decoder.avc".equals(str11)) && (i13 > 17 || !"OMX.allwinner.video.decoder.avc".equals(str11)) && ((i13 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str11) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str11) || "OMX.bcm.vdec.avc.tunnel".equals(str11) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str11) || "OMX.bcm.vdec.hevc.tunnel".equals(str11) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str11))) && !("Amazon".equals(o00.f34912OooO0OO) && "AFTS".equals(o00.f34913OooO0Oo) && oooO0o.f7758OooO0o))) ? z : true) || OoooO()) {
                z = true;
            }
            this.f7694OooooOO = z;
            this.f7677Oooo0o.OooO0o();
            if ("c2.android.mp3.decoder".equals(str11)) {
                this.f7695OooooOo = new OooOOOO();
            }
            if (this.f7201OooOO0 == 2) {
                this.f7697Oooooo0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f7701o000000.f33959OooO00o++;
            Ooooo0o(str3, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            o000OO0O.OooO0O0();
            throw th;
        }
    }

    public final void OoooOoO() throws ExoPlaybackException {
        androidx.media3.common.OooOO0 oooOO1;
        if (this.f7677Oooo0o != null || this.f7706o00O0O || (oooOO1 = this.f7668OooOooO) == null) {
            return;
        }
        if (this.f7673Oooo00O == null && o0ooOOo(oooOO1)) {
            androidx.media3.common.OooOO0 oooOO2 = this.f7668OooOooO;
            Oooo0o();
            String str = oooOO2.f6412OooOOOO;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            OooOOO oooOOO = this.f7664OooOoO0;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                oooOOO.getClass();
                oooOOO.f34209OooOOO = 32;
            } else {
                oooOOO.getClass();
                oooOOO.f34209OooOOO = 1;
            }
            this.f7706o00O0O = true;
            return;
        }
        o00oO0o(this.f7673Oooo00O);
        String str2 = this.f7668OooOooO.f6412OooOOOO;
        DrmSession drmSession = this.f7672Oooo000;
        if (drmSession != null) {
            o000O00.OooO0O0 oooO0O0OooO0OO = drmSession.OooO0OO();
            if (this.f7674Oooo00o == null) {
                if (oooO0O0OooO0OO == null) {
                    if (this.f7672Oooo000.getError() == null) {
                        return;
                    }
                } else if (oooO0O0OooO0OO instanceof OooOo00) {
                    OooOo00 oooOo00 = (OooOo00) oooO0O0OooO0OO;
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(oooOo00.f34417OooO00o, oooOo00.f34418OooO0O0);
                        this.f7674Oooo00o = mediaCrypto;
                        this.f7671Oooo0 = !oooOo00.f34419OooO0OO && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e) {
                        throw OooOoO0(6006, this.f7668OooOooO, e, false);
                    }
                }
            }
            if (OooOo00.f34416OooO0Oo && (oooO0O0OooO0OO instanceof OooOo00)) {
                int state = this.f7672Oooo000.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException error = this.f7672Oooo000.getError();
                    error.getClass();
                    throw OooOoO0(error.f7629OooO0Oo, this.f7668OooOooO, error, false);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            OoooOoo(this.f7674Oooo00o, this.f7671Oooo0);
        } catch (DecoderInitializationException e2) {
            throw OooOoO0(4001, this.f7668OooOooO, e2, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0049 A[SYNTHETIC] */
    public final void OoooOoo(@Nullable MediaCrypto mediaCrypto, boolean z) throws DecoderInitializationException {
        DecoderInitializationException decoderInitializationException;
        String diagnosticInfo;
        DecoderInitializationException decoderInitializationException2;
        if (this.f7682OoooO0 == null) {
            try {
                List<OooO0o> listOoooO0O = OoooO0O(z);
                ArrayDeque<OooO0o> arrayDeque = new ArrayDeque<>();
                this.f7682OoooO0 = arrayDeque;
                if (this.f7660OooOo00) {
                    arrayDeque.addAll(listOoooO0O);
                } else if (!listOoooO0O.isEmpty()) {
                    this.f7682OoooO0.add(listOoooO0O.get(0));
                }
                this.f7684OoooO0O = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(-49998, this.f7668OooOooO, e, z);
            }
        }
        if (this.f7682OoooO0.isEmpty()) {
            throw new DecoderInitializationException(-49999, this.f7668OooOooO, null, z);
        }
        OooO0o oooO0oPeekFirst = this.f7682OoooO0.peekFirst();
        while (this.f7677Oooo0o == null) {
            OooO0o oooO0oPeekFirst2 = this.f7682OoooO0.peekFirst();
            if (!o0ooOO0(oooO0oPeekFirst2)) {
                return;
            }
            try {
                OoooOo0(oooO0oPeekFirst2, mediaCrypto);
            } catch (Exception e2) {
                if (oooO0oPeekFirst2 != oooO0oPeekFirst) {
                    throw e2;
                }
                try {
                    Log.OooO0o("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    OoooOo0(oooO0oPeekFirst2, mediaCrypto);
                } catch (Exception e3) {
                    Log.OooO0oO("MediaCodecRenderer", "Failed to initialize decoder: " + oooO0oPeekFirst2, e3);
                    this.f7682OoooO0.removeFirst();
                    androidx.media3.common.OooOO0 oooOO1 = this.f7668OooOooO;
                    String str = "Decoder init failed: " + oooO0oPeekFirst2.f7754OooO00o + ", " + oooOO1;
                    String str2 = oooOO1.f6412OooOOOO;
                    if (o00.f34910OooO00o >= 21 || !(e3 instanceof MediaCodec.CodecException)) {
                        diagnosticInfo = null;
                    } else {
                        diagnosticInfo = ((MediaCodec.CodecException) e3).getDiagnosticInfo();
                    }
                    decoderInitializationException = new DecoderInitializationException(str, e3, str2, z, oooO0oPeekFirst2, diagnosticInfo);
                    Ooooo00(decoderInitializationException);
                    decoderInitializationException2 = this.f7684OoooO0O;
                    if (decoderInitializationException2 == null) {
                        this.f7684OoooO0O = decoderInitializationException;
                    } else {
                        this.f7684OoooO0O = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.f7724OooO0Oo, decoderInitializationException2.f7726OooO0o0, decoderInitializationException2.f7725OooO0o, decoderInitializationException2.f7727OooO0oO);
                    }
                    if (!this.f7682OoooO0.isEmpty()) {
                        throw this.f7684OoooO0O;
                    }
                }
                Log.OooO0oO("MediaCodecRenderer", "Failed to initialize decoder: " + oooO0oPeekFirst2, e3);
                this.f7682OoooO0.removeFirst();
                androidx.media3.common.OooOO0 oooOO2 = this.f7668OooOooO;
                String str3 = "Decoder init failed: " + oooO0oPeekFirst2.f7754OooO00o + ", " + oooOO2;
                String str4 = oooOO2.f6412OooOOOO;
                if (o00.f34910OooO00o >= 21) {
                    diagnosticInfo = null;
                } else {
                    diagnosticInfo = null;
                }
                decoderInitializationException = new DecoderInitializationException(str3, e3, str4, z, oooO0oPeekFirst2, diagnosticInfo);
                Ooooo00(decoderInitializationException);
                decoderInitializationException2 = this.f7684OoooO0O;
                if (decoderInitializationException2 == null) {
                    this.f7684OoooO0O = decoderInitializationException;
                } else {
                    this.f7684OoooO0O = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.f7724OooO0Oo, decoderInitializationException2.f7726OooO0o0, decoderInitializationException2.f7725OooO0o, decoderInitializationException2.f7727OooO0oO);
                }
                if (!this.f7682OoooO0.isEmpty()) {
                    throw this.f7684OoooO0O;
                }
            }
        }
        this.f7682OoooO0 = null;
    }

    public abstract void Ooooo00(Exception exc);

    public abstract void Ooooo0o(String str, long j, long j2);

    public abstract void OooooO0(String str);

    /* JADX WARN: Code duplicated, block: B:102:0x0124  */
    /* JADX WARN: Code duplicated, block: B:110:0x0138  */
    /* JADX WARN: Code duplicated, block: B:126:0x015d  */
    @Nullable
    @CallSuper
    public DecoderReuseEvaluation OooooOO(o00O0000 o00o0001) throws ExoPlaybackException {
        boolean z;
        int i;
        o000O00.OooO0O0 oooO0O0OooO0OO;
        o000O00.OooO0O0 oooO0O0OooO0OO2;
        boolean z2 = true;
        this.f7722oo0o0Oo = true;
        androidx.media3.common.OooOO0 oooOO1 = o00o0001.f34055OooO0O0;
        oooOO1.getClass();
        String str = oooOO1.f6412OooOOOO;
        if (str == null) {
            throw OooOoO0(4005, oooOO1, new IllegalArgumentException(), false);
        }
        DrmSession drmSession = o00o0001.f34054OooO00o;
        DrmSession drmSession2 = this.f7673Oooo00O;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.OooO0Oo(null);
            }
            if (drmSession2 != null) {
                drmSession2.OooO0o0(null);
            }
        }
        this.f7673Oooo00O = drmSession;
        this.f7668OooOooO = oooOO1;
        if (this.f7706o00O0O) {
            this.f7708o00Ooo = true;
            return null;
        }
        OooO0OO oooO0OO = this.f7677Oooo0o;
        if (oooO0OO == null) {
            this.f7682OoooO0 = null;
            OoooOoO();
            return null;
        }
        OooO0o oooO0o = this.f7681OoooO;
        androidx.media3.common.OooOO0 oooOO2 = this.f7679Oooo0oO;
        DrmSession drmSession3 = this.f7672Oooo000;
        if (drmSession3 != drmSession) {
            if (drmSession != null && drmSession3 != null && (oooO0O0OooO0OO = drmSession.OooO0OO()) != null && (oooO0O0OooO0OO2 = drmSession3.OooO0OO()) != null && oooO0O0OooO0OO.getClass().equals(oooO0O0OooO0OO2.getClass())) {
                if (oooO0O0OooO0OO instanceof OooOo00) {
                    OooOo00 oooOo00 = (OooOo00) oooO0O0OooO0OO;
                    if (drmSession.OooO00o().equals(drmSession3.OooO00o()) && o00.f34910OooO00o >= 23) {
                        UUID uuid = C.f6210OooO0o0;
                        if (!uuid.equals(drmSession3.OooO00o()) && !uuid.equals(drmSession.OooO00o())) {
                            boolean zOooO0o = oooOo00.f34419OooO0OO ? false : drmSession.OooO0o(str);
                            if (oooO0o.f7758OooO0o || !zOooO0o) {
                            }
                        }
                    }
                }
                z = false;
            }
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f7710o00oO0O) {
                this.f7721oo000o = 1;
                this.f7711o00oO0o = 3;
            } else {
                o00Ooo();
                OoooOoO();
            }
            return new DecoderReuseEvaluation(oooO0o.f7754OooO00o, oooOO2, oooOO1, 0, 128);
        }
        boolean z3 = this.f7673Oooo00O != this.f7672Oooo000;
        o00Oo0.OooO0Oo(!z3 || o00.f34910OooO00o >= 23);
        DecoderReuseEvaluation decoderReuseEvaluationOooo0OO = Oooo0OO(oooO0o, oooOO2, oooOO1);
        int i2 = decoderReuseEvaluationOooo0OO.f7103OooO0Oo;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    if (o0OOO0o(oooOO1)) {
                        this.f7679Oooo0oO = oooOO1;
                        if (z3 && !Oooo0oO()) {
                            i = 2;
                        }
                    } else {
                        i = 16;
                    }
                } else if (o0OOO0o(oooOO1)) {
                    this.f7709o00o0O = true;
                    this.f7712o00ooo = 1;
                    int i3 = this.f7685OoooOO0;
                    if (i3 != 2) {
                        if (i3 != 1) {
                            z2 = false;
                        } else if (oooOO1.f6419OooOo00 != oooOO2.f6419OooOo00 || oooOO1.f6418OooOo0 != oooOO2.f6418OooOo0) {
                            z2 = false;
                        }
                    }
                    this.f7692Ooooo0o = z2;
                    this.f7679Oooo0oO = oooOO1;
                    if (z3 && !Oooo0oO()) {
                        i = 2;
                    }
                } else {
                    i = 16;
                }
            } else if (o0OOO0o(oooOO1)) {
                this.f7679Oooo0oO = oooOO1;
                if (!z3) {
                    if (this.f7710o00oO0O) {
                        this.f7721oo000o = 1;
                        if (this.f7686OoooOOO || this.f7688OoooOo0) {
                            this.f7711o00oO0o = 3;
                            z2 = false;
                        } else {
                            this.f7711o00oO0o = 1;
                        }
                    }
                    if (!z2) {
                        i = 2;
                    }
                } else if (!Oooo0oO()) {
                    i = 2;
                }
            } else {
                i = 16;
            }
            return (decoderReuseEvaluationOooo0OO.f7103OooO0Oo != 0 || (this.f7677Oooo0o == oooO0OO && this.f7711o00oO0o != 3)) ? decoderReuseEvaluationOooo0OO : new DecoderReuseEvaluation(oooO0o.f7754OooO00o, oooOO2, oooOO1, 0, i);
        }
        if (this.f7710o00oO0O) {
            this.f7721oo000o = 1;
            this.f7711o00oO0o = 3;
        } else {
            o00Ooo();
            OoooOoO();
        }
        i = 0;
        if (decoderReuseEvaluationOooo0OO.f7103OooO0Oo != 0) {
        }
    }

    public abstract void OooooOo(androidx.media3.common.OooOO0 oooOO1, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException;

    @CallSuper
    public void Oooooo(long j) {
        this.f7703o000000o = j;
        while (true) {
            ArrayDeque<OooO0O0> arrayDeque = this.f7667OooOoo0;
            if (arrayDeque.isEmpty() || j < arrayDeque.peek().f7729OooO00o) {
                return;
            }
            o00oO0O(arrayDeque.poll());
            OoooooO();
        }
    }

    public void Oooooo0(long j) {
    }

    public abstract void OoooooO();

    public abstract void Ooooooo(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException;

    public abstract ArrayList o000oOoO(OooO oooO, androidx.media3.common.OooOO0 oooOO1, boolean z) throws MediaCodecUtil.DecoderQueryException;

    public abstract boolean o00O0O(long j, long j2, @Nullable OooO0OO oooO0OO, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.OooOO0 oooOO1) throws ExoPlaybackException;

    public final boolean o00Oo0(int i) throws ExoPlaybackException {
        o00O0000 o00o0001 = this.f7197OooO0o;
        o00o0001.OooO00o();
        DecoderInputBuffer decoderInputBuffer = this.f7661OooOo0O;
        decoderInputBuffer.OooO0oo();
        int iOooo0 = Oooo0(o00o0001, decoderInputBuffer, i | 4);
        if (iOooo0 == -5) {
            OooooOO(o00o0001);
            return true;
        }
        if (iOooo0 != -4 || !decoderInputBuffer.OooO0o(4)) {
            return false;
        }
        this.f7716o0Oo0oo = true;
        ooOO();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o00Ooo() {
        try {
            OooO0OO oooO0OO = this.f7677Oooo0o;
            if (oooO0OO != null) {
                oooO0OO.release();
                this.f7701o000000.f33960OooO0O0++;
                OooooO0(this.f7681OoooO.f7754OooO00o);
            }
            this.f7677Oooo0o = null;
            try {
                MediaCrypto mediaCrypto = this.f7674Oooo00o;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f7674Oooo00o = null;
                o00oO0o(null);
                oo000o();
            }
        } catch (Throwable th) {
            this.f7677Oooo0o = null;
            try {
                MediaCrypto mediaCrypto2 = this.f7674Oooo00o;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f7674Oooo00o = null;
                o00oO0o(null);
                oo000o();
            }
        }
    }

    public void o00o0O() throws ExoPlaybackException {
    }

    public final void o00oO0O(OooO0O0 oooO0O0) {
        this.f7702o000000O = oooO0O0;
        long j = oooO0O0.f7730OooO0O0;
        if (j != -9223372036854775807L) {
            this.f7700o00000 = true;
            Oooooo0(j);
        }
    }

    public final void o00oO0o(@Nullable DrmSession drmSession) {
        DrmSession drmSession2 = this.f7672Oooo000;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.OooO0Oo(null);
            }
            if (drmSession2 != null) {
                drmSession2.OooO0o0(null);
            }
        }
        this.f7672Oooo000 = drmSession;
    }

    @CallSuper
    public void o00ooo() {
        this.f7696Oooooo = -1;
        this.f7662OooOo0o.f7084OooO0o = null;
        this.f7698OoooooO = -1;
        this.f7699Ooooooo = null;
        this.f7697Oooooo0 = -9223372036854775807L;
        this.f7718o0ooOO0 = false;
        this.f7710o00oO0O = false;
        this.f7692Ooooo0o = false;
        this.f7693OooooO0 = false;
        this.f7717o0OoOo0 = false;
        this.f7723ooOO = false;
        this.f7663OooOoO.clear();
        this.f7720o0ooOoO = -9223372036854775807L;
        this.f7715o0OOO0o = -9223372036854775807L;
        this.f7703o000000o = -9223372036854775807L;
        OooOOOO oooOOOO = this.f7695OooooOo;
        if (oooOOOO != null) {
            oooOOOO.f34224OooO00o = 0L;
            oooOOOO.f34225OooO0O0 = 0L;
            oooOOOO.f34226OooO0OO = false;
        }
        this.f7721oo000o = 0;
        this.f7711o00oO0o = 0;
        this.f7712o00ooo = this.f7709o00o0O ? 1 : 0;
    }

    public final void o0OO00O(long j) throws ExoPlaybackException {
        boolean z;
        androidx.media3.common.OooOO0 oooOO0OooO0o;
        androidx.media3.common.OooOO0 oooOO0OooO0o0 = this.f7702o000000O.f7731OooO0OO.OooO0o0(j);
        if (oooOO0OooO0o0 == null && this.f7700o00000 && this.f7680Oooo0oo != null) {
            o000O0<androidx.media3.common.OooOO0> o000o0 = this.f7702o000000O.f7731OooO0OO;
            synchronized (o000o0) {
                oooOO0OooO0o = o000o0.f34958OooO0Oo == 0 ? null : o000o0.OooO0o();
            }
            oooOO0OooO0o0 = oooOO0OooO0o;
        }
        if (oooOO0OooO0o0 != null) {
            this.f7669OooOooo = oooOO0OooO0o0;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.f7670Oooo && this.f7669OooOooo != null)) {
            OooooOo(this.f7669OooOooo, this.f7680Oooo0oo);
            this.f7670Oooo = false;
            this.f7700o00000 = false;
        }
    }

    public final boolean o0OOO0o(androidx.media3.common.OooOO0 oooOO1) throws ExoPlaybackException {
        if (o00.f34910OooO00o >= 23 && this.f7677Oooo0o != null && this.f7711o00oO0o != 3 && this.f7201OooOO0 != 0) {
            float f = this.f7678Oooo0o0;
            androidx.media3.common.OooOO0[] oooOO0Arr = this.f7203OooOO0o;
            oooOO0Arr.getClass();
            float fOoooOO0 = OoooOO0(f, oooOO0Arr);
            float f2 = this.f7683OoooO00;
            if (f2 == fOoooOO0) {
                return true;
            }
            if (fOoooOO0 == -1.0f) {
                if (this.f7710o00oO0O) {
                    this.f7721oo000o = 1;
                    this.f7711o00oO0o = 3;
                    return false;
                }
                o00Ooo();
                OoooOoO();
                return false;
            }
            if (f2 == -1.0f && fOoooOO0 <= this.f7659OooOo0) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fOoooOO0);
            this.f7677Oooo0o.OooO0oo(bundle);
            this.f7683OoooO00 = fOoooOO0;
        }
        return true;
    }

    @RequiresApi(23)
    public final void o0Oo0oo() throws ExoPlaybackException {
        o000O00.OooO0O0 oooO0O0OooO0OO = this.f7673Oooo00O.OooO0OO();
        if (oooO0O0OooO0OO instanceof OooOo00) {
            try {
                this.f7674Oooo00o.setMediaDrmSession(((OooOo00) oooO0O0OooO0OO).f34418OooO0O0);
            } catch (MediaCryptoException e) {
                throw OooOoO0(6006, this.f7668OooOooO, e, false);
            }
        }
        o00oO0o(this.f7673Oooo00O);
        this.f7721oo000o = 0;
        this.f7711o00oO0o = 0;
    }

    public void o0OoOo0(androidx.media3.common.OooOO0 oooOO1) throws ExoPlaybackException {
    }

    public boolean o0ooOO0(OooO0o oooO0o) {
        return true;
    }

    public boolean o0ooOOo(androidx.media3.common.OooOO0 oooOO1) {
        return false;
    }

    public abstract int o0ooOoO(OooO oooO, androidx.media3.common.OooOO0 oooOO1) throws MediaCodecUtil.DecoderQueryException;

    @CallSuper
    public final void oo000o() {
        o00ooo();
        this.f7704o000OOo = null;
        this.f7695OooooOo = null;
        this.f7682OoooO0 = null;
        this.f7681OoooO = null;
        this.f7679Oooo0oO = null;
        this.f7680Oooo0oo = null;
        this.f7670Oooo = false;
        this.f7719o0ooOOo = false;
        this.f7683OoooO00 = -1.0f;
        this.f7685OoooOO0 = 0;
        this.f7705o000oOoO = false;
        this.f7686OoooOOO = false;
        this.f7687OoooOOo = false;
        this.f7688OoooOo0 = false;
        this.f7689OoooOoO = false;
        this.f7690OoooOoo = false;
        this.f7691Ooooo00 = false;
        this.f7694OooooOO = false;
        this.f7709o00o0O = false;
        this.f7712o00ooo = 0;
        this.f7671Oooo0 = false;
    }

    @TargetApi(23)
    public final void ooOO() throws ExoPlaybackException {
        int i = this.f7711o00oO0o;
        if (i == 1) {
            OoooO00();
            return;
        }
        if (i == 2) {
            OoooO00();
            o0Oo0oo();
        } else if (i != 3) {
            this.f7714o0OO00O = true;
            o00o0O();
        } else {
            o00Ooo();
            OoooOoO();
        }
    }

    public static class DecoderInitializationException extends Exception {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f7724OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final OooO0o f7725OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f7726OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public final String f7727OooO0oO;

        public DecoderInitializationException(int i, androidx.media3.common.OooOO0 oooOO1, @Nullable MediaCodecUtil.DecoderQueryException decoderQueryException, boolean z) {
            this("Decoder init failed: [" + i + "], " + oooOO1, decoderQueryException, oooOO1.f6412OooOOOO, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
        }

        public DecoderInitializationException(String str, @Nullable Throwable th, String str2, boolean z, @Nullable OooO0o oooO0o, @Nullable String str3) {
            super(str, th);
            this.f7724OooO0Oo = str2;
            this.f7726OooO0o0 = z;
            this.f7725OooO0o = oooO0o;
            this.f7727OooO0oO = str3;
        }
    }
}
