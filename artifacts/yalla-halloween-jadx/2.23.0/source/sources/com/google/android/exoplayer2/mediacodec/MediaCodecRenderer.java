package com.google.android.exoplayer2.mediacodec;

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
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Log;
import com.google.common.base.OooOo00;
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
import org.conscrypt.PSKKeyManager;
import org.jctools.util.Pow2;
import p039OoooOoo.o00OO;
import p200o00o0o.o0000O0;
import p200o00o0o.o0O0OOO0;
import p203o00o0o0o.o00OOO0O;
import p205o00o0oO0.o00O000;
import p205o00o0oO0.o00oOoo;
import p206o00o0oOO.o0;
import p206o00o0oOO.o00Oo00;
import p206o00o0oOO.o0oOOo;
import p207o00o0oOo.o0oO0Ooo;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;
import p245o00oo0o.o0O000;
import p245o00oo0o.o0O00000;
import p245o00oo0o.oo0O;
import p247o00oo0oO.o00O0OO;
import p550o0oOOo.o0OO000o;
import p550o0oOOo.oo0oO0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class MediaCodecRenderer extends com.google.android.exoplayer2.OooO0o {

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public static final byte[] f12420o00000O0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final OooO0OO.OooO0O0 f12421OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final OooO f12422OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final DecoderInputBuffer f12423OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final float f12424OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final boolean f12425OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final DecoderInputBuffer f12426OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final DecoderInputBuffer f12427OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ArrayList<Long> f12428OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final o0OO000o f12429OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final MediaCodec.BufferInfo f12430OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final o00O000 f12431OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ArrayDeque<OooO0O0> f12432OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public OooOo f12433OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public OooOo f12434OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f12435Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f12436Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public DrmSession f12437Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public DrmSession f12438Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public MediaCrypto f12439Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final long f12440Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public float f12441Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public OooO0OO f12442Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public float f12443Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public OooOo f12444Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public MediaFormat f12445Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public OooO0o f12446OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public ArrayDeque<OooO0o> f12447OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f12448OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public DecoderInitializationException f12449OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f12450OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f12451OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f12452OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f12453OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f12454OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f12455OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f12456Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f12457Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f12458OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f12459OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public oo0oO0 f12460OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f12461Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public long f12462Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f12463OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @Nullable
    public ByteBuffer f12464Ooooooo;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public boolean f12465o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public o0 f12466o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public OooO0O0 f12467o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public long f12468o000000o;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    @Nullable
    public ExoPlaybackException f12469o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f12470o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f12471o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f12472o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f12473o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f12474o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public boolean f12475o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public int f12476o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public int f12477o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public boolean f12478o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public boolean f12479o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public long f12480o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public boolean f12481o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f12482o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public boolean f12483o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public boolean f12484o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public long f12485o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public int f12486oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f12487oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean f12488ooOO;

    @RequiresApi(31)
    public static final class OooO00o {
        @DoNotInline
        public static void OooO00o(OooO0OO.OooO00o oooO00o, o0O0OOO0 o0o0ooo0) {
            o0O0OOO0.OooO00o oooO00o2 = o0o0ooo0.f39134OooO00o;
            oooO00o2.getClass();
            LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            LogSessionId logSessionId2 = oooO00o2.f39136OooO00o;
            if (logSessionId2.equals(logSessionId)) {
                return;
            }
            oooO00o.f12515OooO0O0.setString("log-session-id", logSessionId2.getStringId());
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f12493OooO0Oo = new OooO0O0(-9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f12494OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f12495OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o0O00000<OooOo> f12496OooO0OO = new o0O00000<>();

        public OooO0O0(long j, long j2) {
            this.f12494OooO00o = j;
            this.f12495OooO0O0 = j2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecRenderer(int i, com.google.android.exoplayer2.mediacodec.OooO0O0 oooO0O0, boolean z, float f) {
        super(i);
        o0000O0 o0000o1 = OooO.f12505OooO00o;
        this.f12421OooOOo = oooO0O0;
        this.f12422OooOOoo = o0000o1;
        this.f12425OooOo00 = z;
        this.f12424OooOo0 = f;
        this.f12426OooOo0O = new DecoderInputBuffer(0);
        this.f12427OooOo0o = new DecoderInputBuffer(0);
        this.f12423OooOo = new DecoderInputBuffer(2);
        o0OO000o o0oo000o = new o0OO000o();
        this.f12429OooOoO0 = o0oo000o;
        this.f12428OooOoO = new ArrayList<>();
        this.f12430OooOoOO = new MediaCodec.BufferInfo();
        this.f12441Oooo0OO = 1.0f;
        this.f12443Oooo0o0 = 1.0f;
        this.f12440Oooo0O0 = -9223372036854775807L;
        this.f12432OooOoo0 = new ArrayDeque<>();
        o00oO0O(OooO0O0.f12493OooO0Oo);
        o0oo000o.OooOO0(0);
        o0oo000o.f11674OooO0o.order(ByteOrder.nativeOrder());
        this.f12431OooOoo = new o00O000();
        this.f12448OoooO00 = -1.0f;
        this.f12450OoooOO0 = 0;
        this.f12477o00ooo = 0;
        this.f12461Oooooo = -1;
        this.f12463OoooooO = -1;
        this.f12462Oooooo0 = -9223372036854775807L;
        this.f12485o0ooOoO = -9223372036854775807L;
        this.f12480o0OOO0o = -9223372036854775807L;
        this.f12468o000000o = -9223372036854775807L;
        this.f12486oo000o = 0;
        this.f12476o00oO0o = 0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean OooO0O0() {
        boolean zOooO0O0;
        if (this.f12433OooOooO == null) {
            return false;
        }
        if (OooO0oO()) {
            zOooO0O0 = this.f11052OooOOOO;
        } else {
            SampleStream sampleStream = this.f11048OooOO0O;
            sampleStream.getClass();
            zOooO0O0 = sampleStream.OooO0O0();
        }
        if (!zOooO0O0) {
            if (!(this.f12463OoooooO >= 0) && (this.f12462Oooooo0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f12462Oooooo0)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int OooO0OO(OooOo oooOo) throws ExoPlaybackException {
        try {
            return o0ooOoO(this.f12422OooOOoo, oooOo);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw OooOoO(e, oooOo);
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.Renderer
    public void OooOOo(float f, float f2) throws ExoPlaybackException {
        this.f12441Oooo0OO = f;
        this.f12443Oooo0o0 = f2;
        o0OOO0o(this.f12444Oooo0oO);
    }

    @Override // com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.RendererCapabilities
    public final int OooOOoo() {
        return 8;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    @Override // com.google.android.exoplayer2.Renderer
    public void OooOo00(long j, long j2) throws ExoPlaybackException {
        boolean z;
        boolean z2 = false;
        if (this.f12478o0O0O00) {
            this.f12478o0O0O00 = false;
            ooOO();
        }
        ExoPlaybackException exoPlaybackException = this.f12469o000OOo;
        if (exoPlaybackException != null) {
            this.f12469o000OOo = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f12479o0OO00O) {
                o00o0O();
                return;
            }
            if (this.f12433OooOooO != null || o00Oo0(2)) {
                OoooOoO();
                if (this.f12471o00O0O) {
                    o0O000.OooO00o("bypassRender");
                    while (Oooo0O0(j, j2)) {
                    }
                    o0O000.OooO0O0();
                } else if (this.f12442Oooo0o != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    o0O000.OooO00o("drainAndFeed");
                    while (Oooo0oo(j, j2)) {
                        long j3 = this.f12440Oooo0O0;
                        if (!(j3 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j3)) {
                            break;
                        }
                    }
                    while (Oooo()) {
                        long j4 = this.f12440Oooo0O0;
                        if (!(j4 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j4)) {
                            break;
                        }
                    }
                    o0O000.OooO0O0();
                } else {
                    o0 o0Var = this.f12466o000000;
                    int i = o0Var.f39402OooO0Oo;
                    SampleStream sampleStream = this.f11048OooOO0O;
                    sampleStream.getClass();
                    o0Var.f39402OooO0Oo = i + sampleStream.OooOOOo(j - this.f11051OooOOO0);
                    o00Oo0(1);
                }
                synchronized (this.f12466o000000) {
                }
            }
        } catch (IllegalStateException e) {
            int i2 = o0O00.f40595OooO00o;
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
            throw OooOoO0(4003, this.f12433OooOooO, Oooo0o0(e, this.f12446OoooO), z2);
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public void OooOoOO() {
        this.f12433OooOooO = null;
        o00oO0O(OooO0O0.f12493OooO0Oo);
        this.f12432OooOoo0.clear();
        OoooO0();
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public void OooOoo(long j, boolean z) throws ExoPlaybackException {
        int i;
        this.f12481o0Oo0oo = false;
        this.f12479o0OO00O = false;
        this.f12478o0O0O00 = false;
        if (this.f12471o00O0O) {
            this.f12429OooOoO0.OooO0oo();
            this.f12423OooOo.OooO0oo();
            this.f12472o00Oo0 = false;
        } else if (OoooO0()) {
            OoooOoO();
        }
        o0O00000<OooOo> o0o00000 = this.f12467o000000O.f12496OooO0OO;
        synchronized (o0o00000) {
            i = o0o00000.f40612OooO0Oo;
        }
        if (i > 0) {
            this.f12487oo0o0Oo = true;
        }
        this.f12467o000000O.f12496OooO0OO.OooO0O0();
        this.f12432OooOoo0.clear();
    }

    public final boolean Oooo() throws ExoPlaybackException {
        OooO0OO oooO0OO = this.f12442Oooo0o;
        if (oooO0OO == null || this.f12486oo000o == 2 || this.f12481o0Oo0oo) {
            return false;
        }
        int i = this.f12461Oooooo;
        DecoderInputBuffer decoderInputBuffer = this.f12427OooOo0o;
        if (i < 0) {
            int iOooOO0 = oooO0OO.OooOO0();
            this.f12461Oooooo = iOooOO0;
            if (iOooOO0 < 0) {
                return false;
            }
            decoderInputBuffer.f11674OooO0o = this.f12442Oooo0o.OooO0Oo(iOooOO0);
            decoderInputBuffer.OooO0oo();
        }
        if (this.f12486oo000o == 1) {
            if (!this.f12459OooooOO) {
                this.f12483o0ooOO0 = true;
                this.f12442Oooo0o.OooO0oo(0L, this.f12461Oooooo, 0, 4);
                this.f12461Oooooo = -1;
                decoderInputBuffer.f11674OooO0o = null;
            }
            this.f12486oo000o = 2;
            return false;
        }
        if (this.f12457Ooooo0o) {
            this.f12457Ooooo0o = false;
            decoderInputBuffer.f11674OooO0o.put(f12420o00000O0);
            this.f12442Oooo0o.OooO0oo(0L, this.f12461Oooooo, 38, 0);
            this.f12461Oooooo = -1;
            decoderInputBuffer.f11674OooO0o = null;
            this.f12475o00oO0O = true;
            return true;
        }
        if (this.f12477o00ooo == 1) {
            for (int i2 = 0; i2 < this.f12444Oooo0oO.f11214OooOOo0.size(); i2++) {
                decoderInputBuffer.f11674OooO0o.put(this.f12444Oooo0oO.f11214OooOOo0.get(i2));
            }
            this.f12477o00ooo = 2;
        }
        int iPosition = decoderInputBuffer.f11674OooO0o.position();
        o00OOO0O o00ooo0o = this.f11043OooO0o;
        o00ooo0o.OooO00o();
        try {
            int iOooo0 = Oooo0(o00ooo0o, decoderInputBuffer, 0);
            if (OooO0oO() || decoderInputBuffer.OooO0o(536870912)) {
                this.f12480o0OOO0o = this.f12485o0ooOoO;
            }
            if (iOooo0 == -3) {
                return false;
            }
            if (iOooo0 == -5) {
                if (this.f12477o00ooo == 2) {
                    decoderInputBuffer.OooO0oo();
                    this.f12477o00ooo = 1;
                }
                OooooOO(o00ooo0o);
                return true;
            }
            if (decoderInputBuffer.OooO0o(4)) {
                if (this.f12477o00ooo == 2) {
                    decoderInputBuffer.OooO0oo();
                    this.f12477o00ooo = 1;
                }
                this.f12481o0Oo0oo = true;
                if (!this.f12475o00oO0O) {
                    ooOO();
                    return false;
                }
                try {
                    if (!this.f12459OooooOO) {
                        this.f12483o0ooOO0 = true;
                        this.f12442Oooo0o.OooO0oo(0L, this.f12461Oooooo, 0, 4);
                        this.f12461Oooooo = -1;
                        decoderInputBuffer.f11674OooO0o = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw OooOoO0(o0O00.OooOOOo(e.getErrorCode()), this.f12433OooOooO, e, false);
                }
            }
            if (!this.f12475o00oO0O && !decoderInputBuffer.OooO0o(1)) {
                decoderInputBuffer.OooO0oo();
                if (this.f12477o00ooo == 2) {
                    this.f12477o00ooo = 1;
                }
                return true;
            }
            boolean zOooO0o = decoderInputBuffer.OooO0o(Pow2.MAX_POW2);
            o0oOOo o0oooo = decoderInputBuffer.f11675OooO0o0;
            if (zOooO0o) {
                if (iPosition == 0) {
                    o0oooo.getClass();
                } else {
                    if (o0oooo.f39429OooO0Oo == null) {
                        int[] iArr = new int[1];
                        o0oooo.f39429OooO0Oo = iArr;
                        o0oooo.f39425OooO.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = o0oooo.f39429OooO0Oo;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            if (this.f12470o000oOoO && !zOooO0o) {
                ByteBuffer byteBuffer = decoderInputBuffer.f11674OooO0o;
                byte[] bArr = oo0O.f40640OooO00o;
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
                if (decoderInputBuffer.f11674OooO0o.position() == 0) {
                    return true;
                }
                this.f12470o000oOoO = false;
            }
            long j = decoderInputBuffer.f11677OooO0oo;
            oo0oO0 oo0oo0 = this.f12460OooooOo;
            if (oo0oo0 != null) {
                OooOo oooOo = this.f12433OooOooO;
                if (oo0oo0.f55944OooO0O0 == 0) {
                    oo0oo0.f55943OooO00o = j;
                }
                if (!oo0oo0.f55945OooO0OO) {
                    ByteBuffer byteBuffer2 = decoderInputBuffer.f11674OooO0o;
                    byteBuffer2.getClass();
                    int i7 = 0;
                    int i8 = 0;
                    for (int i9 = 4; i7 < i9; i9 = 4) {
                        i8 = (i8 << 8) | (byteBuffer2.get(i7) & UByte.MAX_VALUE);
                        i7++;
                    }
                    int iOooO0O0 = o00oOoo.OooO0O0(i8);
                    if (iOooO0O0 == -1) {
                        oo0oo0.f55945OooO0OO = true;
                        oo0oo0.f55944OooO0O0 = 0L;
                        oo0oo0.f55943OooO00o = decoderInputBuffer.f11677OooO0oo;
                        Log.OooO0o("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                        j = decoderInputBuffer.f11677OooO0oo;
                    } else {
                        long jMax = Math.max(0L, ((oo0oo0.f55944OooO0O0 - 529) * AnimationKt.MillisToNanos) / oooOo.f11224OooOoo) + oo0oo0.f55943OooO00o;
                        oo0oo0.f55944OooO0O0 += (long) iOooO0O0;
                        j = jMax;
                    }
                }
                long j2 = this.f12485o0ooOoO;
                oo0oO0 oo0oo1 = this.f12460OooooOo;
                OooOo oooOo2 = this.f12433OooOooO;
                oo0oo1.getClass();
                this.f12485o0ooOoO = Math.max(j2, Math.max(0L, ((oo0oo1.f55944OooO0O0 - 529) * AnimationKt.MillisToNanos) / oooOo2.f11224OooOoo) + oo0oo1.f55943OooO00o);
            } else {
                zOooO0o = zOooO0o;
            }
            if (decoderInputBuffer.OooO0oO()) {
                this.f12428OooOoO.add(Long.valueOf(j));
            }
            if (this.f12487oo0o0Oo) {
                ArrayDeque<OooO0O0> arrayDeque = this.f12432OooOoo0;
                if (arrayDeque.isEmpty()) {
                    this.f12467o000000O.f12496OooO0OO.OooO00o(j, this.f12433OooOooO);
                } else {
                    arrayDeque.peekLast().f12496OooO0OO.OooO00o(j, this.f12433OooOooO);
                }
                this.f12487oo0o0Oo = false;
            }
            this.f12485o0ooOoO = Math.max(this.f12485o0ooOoO, j);
            decoderInputBuffer.OooOO0O();
            if (decoderInputBuffer.OooO0o(SQLiteDatabase.CREATE_IF_NECESSARY)) {
                OoooOOo(decoderInputBuffer);
            }
            Ooooooo(decoderInputBuffer);
            try {
                if (zOooO0o) {
                    this.f12442Oooo0o.OooOO0o(this.f12461Oooooo, o0oooo, j);
                } else {
                    this.f12442Oooo0o.OooO0oo(j, this.f12461Oooooo, decoderInputBuffer.f11674OooO0o.limit(), 0);
                }
                this.f12461Oooooo = -1;
                decoderInputBuffer.f11674OooO0o = null;
                this.f12475o00oO0O = true;
                this.f12477o00ooo = 0;
                this.f12466o000000.f39401OooO0OO++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw OooOoO0(o0O00.OooOOOo(e2.getErrorCode()), this.f12433OooOooO, e2, false);
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
    @Override // com.google.android.exoplayer2.OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo00o(OooOo[] oooOoArr, long j, long j2) throws ExoPlaybackException {
        if (this.f12467o000000O.f12495OooO0O0 == -9223372036854775807L) {
            o00oO0O(new OooO0O0(-9223372036854775807L, j2));
            return;
        }
        ArrayDeque<OooO0O0> arrayDeque = this.f12432OooOoo0;
        if (arrayDeque.isEmpty()) {
            long j3 = this.f12485o0ooOoO;
            if (j3 != -9223372036854775807L) {
                long j4 = this.f12468o000000o;
                if (j4 != -9223372036854775807L) {
                }
            }
            o00oO0O(new OooO0O0(-9223372036854775807L, j2));
            if (this.f12467o000000O.f12495OooO0O0 != -9223372036854775807L) {
                OoooooO();
                return;
            }
            return;
        }
        arrayDeque.add(new OooO0O0(this.f12485o0ooOoO, j2));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5451. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final boolean Oooo0O0(long r23, long r25) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.Oooo0O0(long, long):boolean");
    }

    public abstract DecoderReuseEvaluation Oooo0OO(OooO0o oooO0o, OooOo oooOo, OooOo oooOo2);

    public final void Oooo0o() {
        this.f12473o00Ooo = false;
        this.f12429OooOoO0.OooO0oo();
        this.f12423OooOo.OooO0oo();
        this.f12472o00Oo0 = false;
        this.f12471o00O0O = false;
        o00O000 o00o001 = this.f12431OooOoo;
        o00o001.getClass();
        o00o001.f39377OooO00o = AudioProcessor.f11442OooO00o;
        o00o001.f39379OooO0OO = 0;
        o00o001.f39378OooO0O0 = 2;
    }

    public MediaCodecDecoderException Oooo0o0(IllegalStateException illegalStateException, @Nullable OooO0o oooO0o) {
        return new MediaCodecDecoderException(illegalStateException, oooO0o);
    }

    @TargetApi(23)
    public final boolean Oooo0oO() throws ExoPlaybackException {
        if (this.f12475o00oO0O) {
            this.f12486oo000o = 1;
            if (this.f12451OoooOOO || this.f12453OoooOo0) {
                this.f12476o00oO0o = 3;
                return false;
            }
            this.f12476o00oO0o = 2;
        } else {
            o0Oo0oo();
        }
        return true;
    }

    public final boolean Oooo0oo(long j, long j2) throws ExoPlaybackException {
        boolean z;
        MediaCodec.BufferInfo bufferInfo;
        boolean zO00O0O;
        int iOooOO0O;
        boolean z2;
        boolean z3 = this.f12463OoooooO >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f12430OooOoOO;
        if (!z3) {
            if (this.f12454OoooOoO && this.f12483o0ooOO0) {
                try {
                    iOooOO0O = this.f12442Oooo0o.OooOO0O(bufferInfo2);
                } catch (IllegalStateException unused) {
                    ooOO();
                    if (this.f12479o0OO00O) {
                        o00Ooo();
                    }
                    return false;
                }
            } else {
                iOooOO0O = this.f12442Oooo0o.OooOO0O(bufferInfo2);
            }
            if (iOooOO0O < 0) {
                if (iOooOO0O != -2) {
                    if (this.f12459OooooOO && (this.f12481o0Oo0oo || this.f12486oo000o == 2)) {
                        ooOO();
                    }
                    return false;
                }
                this.f12484o0ooOOo = true;
                MediaFormat mediaFormatOooO00o = this.f12442Oooo0o.OooO00o();
                if (this.f12450OoooOO0 != 0 && mediaFormatOooO00o.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) == 32 && mediaFormatOooO00o.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY) == 32) {
                    this.f12458OooooO0 = true;
                } else {
                    if (this.f12456Ooooo00) {
                        mediaFormatOooO00o.setInteger("channel-count", 1);
                    }
                    this.f12445Oooo0oo = mediaFormatOooO00o;
                    this.f12435Oooo = true;
                }
                return true;
            }
            if (this.f12458OooooO0) {
                this.f12458OooooO0 = false;
                this.f12442Oooo0o.OooOOO0(iOooOO0O, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                ooOO();
                return false;
            }
            this.f12463OoooooO = iOooOO0O;
            ByteBuffer byteBufferOooOOO = this.f12442Oooo0o.OooOOO(iOooOO0O);
            this.f12464Ooooooo = byteBufferOooOOO;
            if (byteBufferOooOOO != null) {
                byteBufferOooOOO.position(bufferInfo2.offset);
                this.f12464Ooooooo.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f12455OoooOoo && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j3 = this.f12485o0ooOoO;
                if (j3 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j3;
                }
            }
            long j4 = bufferInfo2.presentationTimeUs;
            ArrayList<Long> arrayList = this.f12428OooOoO;
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
            this.f12482o0OoOo0 = z2;
            long j5 = this.f12480o0OOO0o;
            long j6 = bufferInfo2.presentationTimeUs;
            this.f12488ooOO = j5 == j6;
            o0OO00O(j6);
        }
        if (this.f12454OoooOoO && this.f12483o0ooOO0) {
            try {
                z = false;
                try {
                    zO00O0O = o00O0O(j, j2, this.f12442Oooo0o, this.f12464Ooooooo, this.f12463OoooooO, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f12482o0OoOo0, this.f12488ooOO, this.f12434OooOooo);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    ooOO();
                    if (this.f12479o0OO00O) {
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
            zO00O0O = o00O0O(j, j2, this.f12442Oooo0o, this.f12464Ooooooo, this.f12463OoooooO, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f12482o0OoOo0, this.f12488ooOO, this.f12434OooOooo);
        }
        if (zO00O0O) {
            Oooooo(bufferInfo.presentationTimeUs);
            boolean z4 = (bufferInfo.flags & 4) != 0 ? true : z;
            this.f12463OoooooO = -1;
            this.f12464Ooooooo = null;
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
        if (this.f12442Oooo0o == null) {
            return false;
        }
        int i = this.f12476o00oO0o;
        if (i == 3 || this.f12451OoooOOO || ((this.f12452OoooOOo && !this.f12484o0ooOOo) || (this.f12453OoooOo0 && this.f12483o0ooOO0))) {
            o00Ooo();
            return true;
        }
        if (i == 2) {
            int i2 = o0O00.f40595OooO00o;
            o00O000o.OooO0Oo(i2 >= 23);
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
            this.f12442Oooo0o.flush();
        } finally {
            o00ooo();
        }
    }

    public final List<OooO0o> OoooO0O(boolean z) throws MediaCodecUtil.DecoderQueryException {
        OooOo oooOo = this.f12433OooOooO;
        OooO oooO = this.f12422OooOOoo;
        ArrayList arrayListO000oOoO = o000oOoO(oooO, oooOo, z);
        if (arrayListO000oOoO.isEmpty() && z) {
            arrayListO000oOoO = o000oOoO(oooO, this.f12433OooOooO, false);
            if (!arrayListO000oOoO.isEmpty()) {
                Log.OooO0o("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f12433OooOooO.f11211OooOOOO + ", but no secure decoder available. Trying to proceed with " + arrayListO000oOoO + ".");
            }
        }
        return arrayListO000oOoO;
    }

    public abstract float OoooOO0(float f, OooOo[] oooOoArr);

    public abstract OooO0OO.OooO00o OoooOOO(OooO0o oooO0o, OooOo oooOo, @Nullable MediaCrypto mediaCrypto, float f);

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
        String strOooOO0o;
        int i;
        String str3 = oooO0o.f12519OooO00o;
        int i2 = o0O00.f40595OooO00o;
        if (i2 < 23) {
            fOoooOO0 = -1.0f;
        } else {
            float f = this.f12443Oooo0o0;
            OooOo[] oooOoArr = this.f11049OooOO0o;
            oooOoArr.getClass();
            fOoooOO0 = OoooOO0(f, oooOoArr);
        }
        if (fOoooOO0 <= this.f12424OooOo0) {
            fOoooOO0 = -1.0f;
        }
        o0OoOo0(this.f12433OooOooO);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        OooO0OO.OooO00o oooO00oOoooOOO = OoooOOO(oooO0o, this.f12433OooOooO, mediaCrypto, fOoooOO0);
        if (i2 >= 31) {
            o0O0OOO0 o0o0ooo0 = this.f11041OooO;
            o0o0ooo0.getClass();
            OooO00o.OooO00o(oooO00oOoooOOO, o0o0ooo0);
        }
        try {
            o0O000.OooO00o("createCodec:" + str3);
            this.f12442Oooo0o = this.f12421OooOOo.OooO00o(oooO00oOoooOOO);
            o0O000.OooO0O0();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (oooO0o.OooO0Oo(this.f12433OooOooO)) {
                z = false;
            } else {
                Object[] objArr = new Object[2];
                OooOo oooOo = this.f12433OooOooO;
                if (oooOo == null) {
                    string = "null";
                } else {
                    StringBuilder sbOooO00o = o00OO.OooO00o("id=");
                    sbOooO00o.append(oooOo.f11201OooO0Oo);
                    sbOooO00o.append(", mimeType=");
                    sbOooO00o.append(oooOo.f11211OooOOOO);
                    int i3 = oooOo.f11207OooOO0O;
                    if (i3 != -1) {
                        sbOooO00o.append(", bitrate=");
                        sbOooO00o.append(i3);
                    }
                    String str4 = oooOo.f11208OooOO0o;
                    if (str4 != null) {
                        sbOooO00o.append(", codecs=");
                        sbOooO00o.append(str4);
                    }
                    DrmInitData drmInitData = oooOo.f11213OooOOo;
                    if (drmInitData != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        int i4 = 0;
                        while (i4 < drmInitData.f11753OooO0oO) {
                            UUID uuid = drmInitData.f11750OooO0Oo[i4].f11756OooO0o0;
                            if (uuid.equals(C.f10897OooO0O0)) {
                                linkedHashSet.add("cenc");
                            } else if (uuid.equals(C.f10898OooO0OO)) {
                                linkedHashSet.add("clearkey");
                            } else if (uuid.equals(C.f10900OooO0o0)) {
                                linkedHashSet.add("playready");
                            } else if (uuid.equals(C.f10899OooO0Oo)) {
                                linkedHashSet.add("widevine");
                            } else {
                                if (uuid.equals(C.f10896OooO00o)) {
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
                        new OooOo00(String.valueOf(',')).OooO00o(sbOooO00o, linkedHashSet.iterator());
                        sbOooO00o.append(']');
                    }
                    int i5 = oooOo.f11218OooOo00;
                    if (i5 != -1 && (i = oooOo.f11217OooOo0) != -1) {
                        sbOooO00o.append(", res=");
                        sbOooO00o.append(i5);
                        sbOooO00o.append("x");
                        sbOooO00o.append(i);
                    }
                    o00O0OO o00o0oo2 = oooOo.f11223OooOoOO;
                    if (o00o0oo2 != null) {
                        int i6 = o00o0oo2.f40746OooO0Oo;
                        int i7 = o00o0oo2.f40747OooO0o;
                        int i8 = o00o0oo2.f40748OooO0o0;
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
                                objArr2[2] = o00O0OO.OooO00o(i7);
                                strOooOO0o = o0O00.OooOO0o("%s/%s/%s", objArr2);
                            } else {
                                strOooOO0o = "NA";
                            }
                            sbOooO00o.append(strOooOO0o);
                        }
                    }
                    float f2 = oooOo.f11219OooOo0O;
                    if (f2 != -1.0f) {
                        sbOooO00o.append(", fps=");
                        sbOooO00o.append(f2);
                    }
                    int i9 = oooOo.f11225OooOoo0;
                    if (i9 != -1) {
                        sbOooO00o.append(", channels=");
                        sbOooO00o.append(i9);
                    }
                    int i10 = oooOo.f11224OooOoo;
                    if (i10 != -1) {
                        sbOooO00o.append(", sample_rate=");
                        sbOooO00o.append(i10);
                    }
                    String str5 = oooOo.f11202OooO0o;
                    if (str5 != null) {
                        sbOooO00o.append(", language=");
                        sbOooO00o.append(str5);
                    }
                    String str6 = oooOo.f11203OooO0o0;
                    if (str6 != null) {
                        sbOooO00o.append(", label=");
                        sbOooO00o.append(str6);
                    }
                    int i11 = oooOo.f11204OooO0oO;
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
                        new OooOo00(String.valueOf(',')).OooO00o(sbOooO00o, arrayList.iterator());
                        sbOooO00o.append("]");
                    }
                    int i12 = oooOo.f11205OooO0oo;
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
                        new OooOo00(String.valueOf(',')).OooO00o(sbOooO00o, arrayList2.iterator());
                        sbOooO00o.append("]");
                    }
                    string = sbOooO00o.toString();
                }
                z = false;
                objArr[0] = string;
                objArr[1] = str3;
                Log.OooO0o("MediaCodecRenderer", o0O00.OooOO0o("Format exceeds selected codec's capabilities [%s, %s]", objArr));
            }
            this.f12446OoooO = oooO0o;
            this.f12448OoooO00 = fOoooOO0;
            this.f12444Oooo0oO = this.f12433OooOooO;
            int i13 = o0O00.f40595OooO00o;
            if (i13 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str3)) {
                String str7 = o0O00.f40598OooO0Oo;
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
                String str8 = o0O00.f40596OooO0O0;
                if ("flounder".equals(str8) || "flounder_lte".equals(str8) || "grouper".equals(str8) || "tilapia".equals(str8)) {
                    r11 = 1;
                } else {
                    r11 = z;
                }
            }
            this.f12450OoooOO0 = r11;
            this.f12470o000oOoO = (i13 < 21 && this.f12444Oooo0oO.f11214OooOOo0.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str3)) ? true : z;
            this.f12451OoooOOO = (i13 < 18 || (i13 == 18 && ("OMX.SEC.avc.dec".equals(str3) || "OMX.SEC.avc.dec.secure".equals(str3))) || (i13 == 19 && o0O00.f40598OooO0Oo.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str3) || "OMX.Exynos.avc.dec.secure".equals(str3)))) ? true : z;
            this.f12452OoooOOo = (i13 == 29 && "c2.android.aac.decoder".equals(str3)) ? true : z;
            if (i13 > 23 || !"OMX.google.vorbis.decoder".equals(str3)) {
                if (i13 <= 19) {
                    String str9 = o0O00.f40596OooO0O0;
                    if (("hb2000".equals(str9) || "stvm8".equals(str9)) && ("OMX.amlogic.avc.decoder.awesome".equals(str3) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str3))) {
                        z2 = true;
                    }
                }
                z2 = z;
            } else {
                z2 = true;
            }
            this.f12453OoooOo0 = z2;
            this.f12454OoooOoO = (i13 == 21 && "OMX.google.aac.decoder".equals(str3)) ? true : z;
            if (i13 < 21 && "OMX.SEC.mp3.dec".equals(str3) && "samsung".equals(o0O00.f40597OooO0OO)) {
                String str10 = o0O00.f40596OooO0O0;
                if (str10.startsWith("baffin") || str10.startsWith("grand") || str10.startsWith("fortuna") || str10.startsWith("gprimelte") || str10.startsWith("j2y18lte") || str10.startsWith("ms01")) {
                    z3 = true;
                } else {
                    z3 = z;
                }
            } else {
                z3 = z;
            }
            this.f12455OoooOoo = z3;
            this.f12456Ooooo00 = (i13 <= 18 && this.f12444Oooo0oO.f11225OooOoo0 == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str3)) ? true : z;
            String str11 = oooO0o.f12519OooO00o;
            if ((((i13 > 25 || !"OMX.rk.video_decoder.avc".equals(str11)) && (i13 > 17 || !"OMX.allwinner.video.decoder.avc".equals(str11)) && ((i13 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str11) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str11) || "OMX.bcm.vdec.avc.tunnel".equals(str11) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str11) || "OMX.bcm.vdec.hevc.tunnel".equals(str11) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str11))) && !("Amazon".equals(o0O00.f40597OooO0OO) && "AFTS".equals(o0O00.f40598OooO0Oo) && oooO0o.f12523OooO0o))) ? z : true) || OoooO()) {
                z = true;
            }
            this.f12459OooooOO = z;
            this.f12442Oooo0o.OooO0o();
            if ("c2.android.mp3.decoder".equals(str11)) {
                this.f12460OooooOo = new oo0oO0();
            }
            if (this.f11047OooOO0 == 2) {
                this.f12462Oooooo0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f12466o000000.f39399OooO00o++;
            Ooooo0o(str3, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            o0O000.OooO0O0();
            throw th;
        }
    }

    public final void OoooOoO() throws ExoPlaybackException {
        OooOo oooOo;
        if (this.f12442Oooo0o != null || this.f12471o00O0O || (oooOo = this.f12433OooOooO) == null) {
            return;
        }
        if (this.f12438Oooo00O == null && o0ooOOo(oooOo)) {
            OooOo oooOo2 = this.f12433OooOooO;
            Oooo0o();
            String str = oooOo2.f11211OooOOOO;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            o0OO000o o0oo000o = this.f12429OooOoO0;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                o0oo000o.getClass();
                o0oo000o.f55936OooOOO = 32;
            } else {
                o0oo000o.getClass();
                o0oo000o.f55936OooOOO = 1;
            }
            this.f12471o00O0O = true;
            return;
        }
        o00oO0o(this.f12438Oooo00O);
        String str2 = this.f12433OooOooO.f11211OooOOOO;
        DrmSession drmSession = this.f12437Oooo000;
        if (drmSession != null) {
            o00Oo00 o00oo00OooO0o0 = drmSession.OooO0o0();
            if (this.f12439Oooo00o == null) {
                if (o00oo00OooO0o0 == null) {
                    if (this.f12437Oooo000.getError() == null) {
                        return;
                    }
                } else if (o00oo00OooO0o0 instanceof o0oO0Ooo) {
                    o0oO0Ooo o0oo0ooo2 = (o0oO0Ooo) o00oo00OooO0o0;
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(o0oo0ooo2.f39450OooO00o, o0oo0ooo2.f39451OooO0O0);
                        this.f12439Oooo00o = mediaCrypto;
                        this.f12436Oooo0 = !o0oo0ooo2.f39452OooO0OO && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e) {
                        throw OooOoO0(6006, this.f12433OooOooO, e, false);
                    }
                }
            }
            if (o0oO0Ooo.f39449OooO0Oo && (o00oo00OooO0o0 instanceof o0oO0Ooo)) {
                int state = this.f12437Oooo000.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException error = this.f12437Oooo000.getError();
                    error.getClass();
                    throw OooOoO0(error.f11759OooO0Oo, this.f12433OooOooO, error, false);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            OoooOoo(this.f12439Oooo00o, this.f12436Oooo0);
        } catch (DecoderInitializationException e2) {
            throw OooOoO0(4001, this.f12433OooOooO, e2, false);
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
        if (this.f12447OoooO0 == null) {
            try {
                List<OooO0o> listOoooO0O = OoooO0O(z);
                ArrayDeque<OooO0o> arrayDeque = new ArrayDeque<>();
                this.f12447OoooO0 = arrayDeque;
                if (this.f12425OooOo00) {
                    arrayDeque.addAll(listOoooO0O);
                } else if (!listOoooO0O.isEmpty()) {
                    this.f12447OoooO0.add(listOoooO0O.get(0));
                }
                this.f12449OoooO0O = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(-49998, this.f12433OooOooO, e, z);
            }
        }
        if (this.f12447OoooO0.isEmpty()) {
            throw new DecoderInitializationException(-49999, this.f12433OooOooO, null, z);
        }
        OooO0o oooO0oPeekFirst = this.f12447OoooO0.peekFirst();
        while (this.f12442Oooo0o == null) {
            OooO0o oooO0oPeekFirst2 = this.f12447OoooO0.peekFirst();
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
                    this.f12447OoooO0.removeFirst();
                    OooOo oooOo = this.f12433OooOooO;
                    String str = "Decoder init failed: " + oooO0oPeekFirst2.f12519OooO00o + ", " + oooOo;
                    String str2 = oooOo.f11211OooOOOO;
                    if (o0O00.f40595OooO00o >= 21 || !(e3 instanceof MediaCodec.CodecException)) {
                        diagnosticInfo = null;
                    } else {
                        diagnosticInfo = ((MediaCodec.CodecException) e3).getDiagnosticInfo();
                    }
                    decoderInitializationException = new DecoderInitializationException(str, e3, str2, z, oooO0oPeekFirst2, diagnosticInfo);
                    Ooooo00(decoderInitializationException);
                    decoderInitializationException2 = this.f12449OoooO0O;
                    if (decoderInitializationException2 == null) {
                        this.f12449OoooO0O = decoderInitializationException;
                    } else {
                        this.f12449OoooO0O = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.f12489OooO0Oo, decoderInitializationException2.f12491OooO0o0, decoderInitializationException2.f12490OooO0o, decoderInitializationException2.f12492OooO0oO);
                    }
                    if (!this.f12447OoooO0.isEmpty()) {
                        throw this.f12449OoooO0O;
                    }
                }
                Log.OooO0oO("MediaCodecRenderer", "Failed to initialize decoder: " + oooO0oPeekFirst2, e3);
                this.f12447OoooO0.removeFirst();
                OooOo oooOo2 = this.f12433OooOooO;
                String str3 = "Decoder init failed: " + oooO0oPeekFirst2.f12519OooO00o + ", " + oooOo2;
                String str4 = oooOo2.f11211OooOOOO;
                if (o0O00.f40595OooO00o >= 21) {
                    diagnosticInfo = null;
                } else {
                    diagnosticInfo = null;
                }
                decoderInitializationException = new DecoderInitializationException(str3, e3, str4, z, oooO0oPeekFirst2, diagnosticInfo);
                Ooooo00(decoderInitializationException);
                decoderInitializationException2 = this.f12449OoooO0O;
                if (decoderInitializationException2 == null) {
                    this.f12449OoooO0O = decoderInitializationException;
                } else {
                    this.f12449OoooO0O = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.f12489OooO0Oo, decoderInitializationException2.f12491OooO0o0, decoderInitializationException2.f12490OooO0o, decoderInitializationException2.f12492OooO0oO);
                }
                if (!this.f12447OoooO0.isEmpty()) {
                    throw this.f12449OoooO0O;
                }
            }
        }
        this.f12447OoooO0 = null;
    }

    public abstract void Ooooo00(Exception exc);

    public abstract void Ooooo0o(String str, long j, long j2);

    public abstract void OooooO0(String str);

    /* JADX WARN: Code duplicated, block: B:102:0x0124  */
    /* JADX WARN: Code duplicated, block: B:110:0x0138  */
    /* JADX WARN: Code duplicated, block: B:126:0x015d  */
    @Nullable
    @CallSuper
    public DecoderReuseEvaluation OooooOO(o00OOO0O o00ooo0o) throws ExoPlaybackException {
        boolean z;
        int i;
        o00Oo00 o00oo00OooO0o0;
        o00Oo00 o00oo00OooO0o1;
        boolean z2 = true;
        this.f12487oo0o0Oo = true;
        OooOo oooOo = o00ooo0o.f39211OooO0O0;
        oooOo.getClass();
        String str = oooOo.f11211OooOOOO;
        if (str == null) {
            throw OooOoO0(4005, oooOo, new IllegalArgumentException(), false);
        }
        DrmSession drmSession = o00ooo0o.f39210OooO00o;
        DrmSession drmSession2 = this.f12438Oooo00O;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.OooO00o(null);
            }
            if (drmSession2 != null) {
                drmSession2.OooO0O0(null);
            }
        }
        this.f12438Oooo00O = drmSession;
        this.f12433OooOooO = oooOo;
        if (this.f12471o00O0O) {
            this.f12473o00Ooo = true;
            return null;
        }
        OooO0OO oooO0OO = this.f12442Oooo0o;
        if (oooO0OO == null) {
            this.f12447OoooO0 = null;
            OoooOoO();
            return null;
        }
        OooO0o oooO0o = this.f12446OoooO;
        OooOo oooOo2 = this.f12444Oooo0oO;
        DrmSession drmSession3 = this.f12437Oooo000;
        if (drmSession3 != drmSession) {
            if (drmSession != null && drmSession3 != null && (o00oo00OooO0o0 = drmSession.OooO0o0()) != null && (o00oo00OooO0o1 = drmSession3.OooO0o0()) != null && o00oo00OooO0o0.getClass().equals(o00oo00OooO0o1.getClass())) {
                if (o00oo00OooO0o0 instanceof o0oO0Ooo) {
                    o0oO0Ooo o0oo0ooo2 = (o0oO0Ooo) o00oo00OooO0o0;
                    if (drmSession.OooO0OO().equals(drmSession3.OooO0OO()) && o0O00.f40595OooO00o >= 23) {
                        UUID uuid = C.f10900OooO0o0;
                        if (!uuid.equals(drmSession3.OooO0OO()) && !uuid.equals(drmSession.OooO0OO())) {
                            boolean zOooO0o = o0oo0ooo2.f39452OooO0OO ? false : drmSession.OooO0o(str);
                            if (oooO0o.f12523OooO0o || !zOooO0o) {
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
            if (this.f12475o00oO0O) {
                this.f12486oo000o = 1;
                this.f12476o00oO0o = 3;
            } else {
                o00Ooo();
                OoooOoO();
            }
            return new DecoderReuseEvaluation(oooO0o.f12519OooO00o, oooOo2, oooOo, 0, 128);
        }
        boolean z3 = this.f12438Oooo00O != this.f12437Oooo000;
        o00O000o.OooO0Oo(!z3 || o0O00.f40595OooO00o >= 23);
        DecoderReuseEvaluation decoderReuseEvaluationOooo0OO = Oooo0OO(oooO0o, oooOo2, oooOo);
        int i2 = decoderReuseEvaluationOooo0OO.f11683OooO0Oo;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    if (o0OOO0o(oooOo)) {
                        this.f12444Oooo0oO = oooOo;
                        if (z3 && !Oooo0oO()) {
                            i = 2;
                        }
                    } else {
                        i = 16;
                    }
                } else if (o0OOO0o(oooOo)) {
                    this.f12474o00o0O = true;
                    this.f12477o00ooo = 1;
                    int i3 = this.f12450OoooOO0;
                    if (i3 != 2) {
                        if (i3 != 1) {
                            z2 = false;
                        } else if (oooOo.f11218OooOo00 != oooOo2.f11218OooOo00 || oooOo.f11217OooOo0 != oooOo2.f11217OooOo0) {
                            z2 = false;
                        }
                    }
                    this.f12457Ooooo0o = z2;
                    this.f12444Oooo0oO = oooOo;
                    if (z3 && !Oooo0oO()) {
                        i = 2;
                    }
                } else {
                    i = 16;
                }
            } else if (o0OOO0o(oooOo)) {
                this.f12444Oooo0oO = oooOo;
                if (!z3) {
                    if (this.f12475o00oO0O) {
                        this.f12486oo000o = 1;
                        if (this.f12451OoooOOO || this.f12453OoooOo0) {
                            this.f12476o00oO0o = 3;
                            z2 = false;
                        } else {
                            this.f12476o00oO0o = 1;
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
            return (decoderReuseEvaluationOooo0OO.f11683OooO0Oo != 0 || (this.f12442Oooo0o == oooO0OO && this.f12476o00oO0o != 3)) ? decoderReuseEvaluationOooo0OO : new DecoderReuseEvaluation(oooO0o.f12519OooO00o, oooOo2, oooOo, 0, i);
        }
        if (this.f12475o00oO0O) {
            this.f12486oo000o = 1;
            this.f12476o00oO0o = 3;
        } else {
            o00Ooo();
            OoooOoO();
        }
        i = 0;
        if (decoderReuseEvaluationOooo0OO.f11683OooO0Oo != 0) {
        }
    }

    public abstract void OooooOo(OooOo oooOo, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException;

    @CallSuper
    public void Oooooo(long j) {
        this.f12468o000000o = j;
        while (true) {
            ArrayDeque<OooO0O0> arrayDeque = this.f12432OooOoo0;
            if (arrayDeque.isEmpty() || j < arrayDeque.peek().f12494OooO00o) {
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

    public abstract ArrayList o000oOoO(OooO oooO, OooOo oooOo, boolean z) throws MediaCodecUtil.DecoderQueryException;

    public abstract boolean o00O0O(long j, long j2, @Nullable OooO0OO oooO0OO, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, OooOo oooOo) throws ExoPlaybackException;

    public final boolean o00Oo0(int i) throws ExoPlaybackException {
        o00OOO0O o00ooo0o = this.f11043OooO0o;
        o00ooo0o.OooO00o();
        DecoderInputBuffer decoderInputBuffer = this.f12426OooOo0O;
        decoderInputBuffer.OooO0oo();
        int iOooo0 = Oooo0(o00ooo0o, decoderInputBuffer, i | 4);
        if (iOooo0 == -5) {
            OooooOO(o00ooo0o);
            return true;
        }
        if (iOooo0 != -4 || !decoderInputBuffer.OooO0o(4)) {
            return false;
        }
        this.f12481o0Oo0oo = true;
        ooOO();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o00Ooo() {
        try {
            OooO0OO oooO0OO = this.f12442Oooo0o;
            if (oooO0OO != null) {
                oooO0OO.release();
                this.f12466o000000.f39400OooO0O0++;
                OooooO0(this.f12446OoooO.f12519OooO00o);
            }
            this.f12442Oooo0o = null;
            try {
                MediaCrypto mediaCrypto = this.f12439Oooo00o;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f12439Oooo00o = null;
                o00oO0o(null);
                oo000o();
            }
        } catch (Throwable th) {
            this.f12442Oooo0o = null;
            try {
                MediaCrypto mediaCrypto2 = this.f12439Oooo00o;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f12439Oooo00o = null;
                o00oO0o(null);
                oo000o();
            }
        }
    }

    public void o00o0O() throws ExoPlaybackException {
    }

    public final void o00oO0O(OooO0O0 oooO0O0) {
        this.f12467o000000O = oooO0O0;
        long j = oooO0O0.f12495OooO0O0;
        if (j != -9223372036854775807L) {
            this.f12465o00000 = true;
            Oooooo0(j);
        }
    }

    public final void o00oO0o(@Nullable DrmSession drmSession) {
        DrmSession drmSession2 = this.f12437Oooo000;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.OooO00o(null);
            }
            if (drmSession2 != null) {
                drmSession2.OooO0O0(null);
            }
        }
        this.f12437Oooo000 = drmSession;
    }

    @CallSuper
    public void o00ooo() {
        this.f12461Oooooo = -1;
        this.f12427OooOo0o.f11674OooO0o = null;
        this.f12463OoooooO = -1;
        this.f12464Ooooooo = null;
        this.f12462Oooooo0 = -9223372036854775807L;
        this.f12483o0ooOO0 = false;
        this.f12475o00oO0O = false;
        this.f12457Ooooo0o = false;
        this.f12458OooooO0 = false;
        this.f12482o0OoOo0 = false;
        this.f12488ooOO = false;
        this.f12428OooOoO.clear();
        this.f12485o0ooOoO = -9223372036854775807L;
        this.f12480o0OOO0o = -9223372036854775807L;
        this.f12468o000000o = -9223372036854775807L;
        oo0oO0 oo0oo0 = this.f12460OooooOo;
        if (oo0oo0 != null) {
            oo0oo0.f55943OooO00o = 0L;
            oo0oo0.f55944OooO0O0 = 0L;
            oo0oo0.f55945OooO0OO = false;
        }
        this.f12486oo000o = 0;
        this.f12476o00oO0o = 0;
        this.f12477o00ooo = this.f12474o00o0O ? 1 : 0;
    }

    public final void o0OO00O(long j) throws ExoPlaybackException {
        boolean z;
        OooOo oooOoOooO0o;
        OooOo oooOoOooO0o0 = this.f12467o000000O.f12496OooO0OO.OooO0o0(j);
        if (oooOoOooO0o0 == null && this.f12465o00000 && this.f12445Oooo0oo != null) {
            o0O00000<OooOo> o0o00000 = this.f12467o000000O.f12496OooO0OO;
            synchronized (o0o00000) {
                oooOoOooO0o = o0o00000.f40612OooO0Oo == 0 ? null : o0o00000.OooO0o();
            }
            oooOoOooO0o0 = oooOoOooO0o;
        }
        if (oooOoOooO0o0 != null) {
            this.f12434OooOooo = oooOoOooO0o0;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.f12435Oooo && this.f12434OooOooo != null)) {
            OooooOo(this.f12434OooOooo, this.f12445Oooo0oo);
            this.f12435Oooo = false;
            this.f12465o00000 = false;
        }
    }

    public final boolean o0OOO0o(OooOo oooOo) throws ExoPlaybackException {
        if (o0O00.f40595OooO00o >= 23 && this.f12442Oooo0o != null && this.f12476o00oO0o != 3 && this.f11047OooOO0 != 0) {
            float f = this.f12443Oooo0o0;
            OooOo[] oooOoArr = this.f11049OooOO0o;
            oooOoArr.getClass();
            float fOoooOO0 = OoooOO0(f, oooOoArr);
            float f2 = this.f12448OoooO00;
            if (f2 == fOoooOO0) {
                return true;
            }
            if (fOoooOO0 == -1.0f) {
                if (this.f12475o00oO0O) {
                    this.f12486oo000o = 1;
                    this.f12476o00oO0o = 3;
                    return false;
                }
                o00Ooo();
                OoooOoO();
                return false;
            }
            if (f2 == -1.0f && fOoooOO0 <= this.f12424OooOo0) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fOoooOO0);
            this.f12442Oooo0o.OooO0oO(bundle);
            this.f12448OoooO00 = fOoooOO0;
        }
        return true;
    }

    @RequiresApi(23)
    public final void o0Oo0oo() throws ExoPlaybackException {
        o00Oo00 o00oo00OooO0o0 = this.f12438Oooo00O.OooO0o0();
        if (o00oo00OooO0o0 instanceof o0oO0Ooo) {
            try {
                this.f12439Oooo00o.setMediaDrmSession(((o0oO0Ooo) o00oo00OooO0o0).f39451OooO0O0);
            } catch (MediaCryptoException e) {
                throw OooOoO0(6006, this.f12433OooOooO, e, false);
            }
        }
        o00oO0o(this.f12438Oooo00O);
        this.f12486oo000o = 0;
        this.f12476o00oO0o = 0;
    }

    public void o0OoOo0(OooOo oooOo) throws ExoPlaybackException {
    }

    public boolean o0ooOO0(OooO0o oooO0o) {
        return true;
    }

    public boolean o0ooOOo(OooOo oooOo) {
        return false;
    }

    public abstract int o0ooOoO(OooO oooO, OooOo oooOo) throws MediaCodecUtil.DecoderQueryException;

    @CallSuper
    public final void oo000o() {
        o00ooo();
        this.f12469o000OOo = null;
        this.f12460OooooOo = null;
        this.f12447OoooO0 = null;
        this.f12446OoooO = null;
        this.f12444Oooo0oO = null;
        this.f12445Oooo0oo = null;
        this.f12435Oooo = false;
        this.f12484o0ooOOo = false;
        this.f12448OoooO00 = -1.0f;
        this.f12450OoooOO0 = 0;
        this.f12470o000oOoO = false;
        this.f12451OoooOOO = false;
        this.f12452OoooOOo = false;
        this.f12453OoooOo0 = false;
        this.f12454OoooOoO = false;
        this.f12455OoooOoo = false;
        this.f12456Ooooo00 = false;
        this.f12459OooooOO = false;
        this.f12474o00o0O = false;
        this.f12477o00ooo = 0;
        this.f12436Oooo0 = false;
    }

    @TargetApi(23)
    public final void ooOO() throws ExoPlaybackException {
        int i = this.f12476o00oO0o;
        if (i == 1) {
            OoooO00();
            return;
        }
        if (i == 2) {
            OoooO00();
            o0Oo0oo();
        } else if (i != 3) {
            this.f12479o0OO00O = true;
            o00o0O();
        } else {
            o00Ooo();
            OoooOoO();
        }
    }

    public static class DecoderInitializationException extends Exception {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f12489OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final OooO0o f12490OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f12491OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public final String f12492OooO0oO;

        public DecoderInitializationException(int i, OooOo oooOo, @Nullable MediaCodecUtil.DecoderQueryException decoderQueryException, boolean z) {
            this("Decoder init failed: [" + i + "], " + oooOo, decoderQueryException, oooOo.f11211OooOOOO, z, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
        }

        public DecoderInitializationException(String str, @Nullable Throwable th, String str2, boolean z, @Nullable OooO0o oooO0o, @Nullable String str3) {
            super(str, th);
            this.f12489OooO0Oo = str2;
            this.f12491OooO0o0 = z;
            this.f12490OooO0o = oooO0o;
            this.f12492OooO0oO = str3;
        }
    }
}
