package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.android.billingclient.api.o0OO00O;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.OooO0o;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.source.SampleStream;
import com.umeng.analytics.pro.bz;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.UByte;
import p293o0O0Oo0O.o0ooOOo;
import p294o0O0Oo0o.o0O0O00;
import p301o0O0Oooo.o00;
import p303o0O0o00o.OooOO0;
import p303o0O0o00o.OooOOO;
import p303o0O0o00o.OooOOO0;
import p303o0O0o00o.OooOOOO;
import p303o0O0o00o.o000oOoO;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000O;
import p318o0O0oOo.o0000oo;
import p318o0O0oOo.o000O;
import p318o0O0oOo.o000OO0O;
import p318o0O0oOo.o000OOo0;
import p466o0OooO0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MediaCodecRenderer extends OooO0o {

    /* JADX INFO: renamed from: o000OoO, reason: collision with root package name */
    public static final byte[] f14352o000OoO = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, bz.m, 19, 32, 0, 0, 1, 101, -120, -124, bz.k, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final OooO0O0 f14353OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final boolean f14354OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final float f14355OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final DecoderInputBuffer f14356OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final DecoderInputBuffer f14357Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final OooOOO0 f14358Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final o000OO0O<Format> f14359OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final ArrayList<Long> f14360OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final MediaCodec.BufferInfo f14361OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public final long[] f14362Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final long[] f14363Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public final long[] f14364OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @Nullable
    public Format f14365Ooooooo;

    /* JADX INFO: renamed from: o000, reason: collision with root package name */
    public long f14366o000;

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public int f14367o0000;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public boolean f14368o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public boolean f14369o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public boolean f14370o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public boolean f14371o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public boolean f14372o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public boolean f14373o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public boolean f14374o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public boolean f14375o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    @Nullable
    public OooOOO f14376o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public ByteBuffer[] f14377o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public long f14378o00000oo;

    /* JADX INFO: renamed from: o0000O, reason: collision with root package name */
    public boolean f14379o0000O;

    /* JADX INFO: renamed from: o0000O0, reason: collision with root package name */
    public boolean f14380o0000O0;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public int f14381o0000O00;

    /* JADX INFO: renamed from: o0000O0O, reason: collision with root package name */
    public boolean f14382o0000O0O;

    /* JADX INFO: renamed from: o0000OO, reason: collision with root package name */
    public int f14383o0000OO;

    /* JADX INFO: renamed from: o0000OO0, reason: collision with root package name */
    public int f14384o0000OO0;

    /* JADX INFO: renamed from: o0000OOO, reason: collision with root package name */
    public int f14385o0000OOO;

    /* JADX INFO: renamed from: o0000OOo, reason: collision with root package name */
    public boolean f14386o0000OOo;

    /* JADX INFO: renamed from: o0000Oo, reason: collision with root package name */
    public boolean f14387o0000Oo;

    /* JADX INFO: renamed from: o0000Oo0, reason: collision with root package name */
    public boolean f14388o0000Oo0;

    /* JADX INFO: renamed from: o0000OoO, reason: collision with root package name */
    public long f14389o0000OoO;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public ByteBuffer[] f14390o0000Ooo;

    /* JADX INFO: renamed from: o0000o, reason: collision with root package name */
    public boolean f14391o0000o;

    /* JADX INFO: renamed from: o0000o0, reason: collision with root package name */
    public long f14392o0000o0;

    /* JADX INFO: renamed from: o0000o0O, reason: collision with root package name */
    public boolean f14393o0000o0O;

    /* JADX INFO: renamed from: o0000o0o, reason: collision with root package name */
    public boolean f14394o0000o0o;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public boolean f14395o0000oO;

    /* JADX INFO: renamed from: o0000oO0, reason: collision with root package name */
    public boolean f14396o0000oO0;

    /* JADX INFO: renamed from: o0000oOO, reason: collision with root package name */
    public int f14397o0000oOO;

    /* JADX INFO: renamed from: o0000oOo, reason: collision with root package name */
    @Nullable
    public ExoPlaybackException f14398o0000oOo;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    @Nullable
    public ByteBuffer f14399o0000oo;

    /* JADX INFO: renamed from: o0000oo0, reason: collision with root package name */
    public o0O0O00 f14400o0000oo0;

    /* JADX INFO: renamed from: o0000ooO, reason: collision with root package name */
    public long f14401o0000ooO;

    /* JADX INFO: renamed from: o000O000, reason: collision with root package name */
    public int f14402o000O000;

    /* JADX INFO: renamed from: o000OO, reason: collision with root package name */
    public boolean f14403o000OO;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f14404o000OOo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @Nullable
    public DrmSession f14405o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @Nullable
    public MediaCrypto f14406o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f14407o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public long f14408o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    @Nullable
    public Format f14409o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @Nullable
    public OooOOOO f14410o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public float f14411o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public boolean f14412o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    @Nullable
    public OooO00o f14413o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    @Nullable
    public ArrayDeque<OooO00o> f14414o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    @Nullable
    public DecoderInitializationException f14415o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @Nullable
    public Format f14416o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @Nullable
    public MediaFormat f14417o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public boolean f14418o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public float f14419o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @Nullable
    public MediaCodec f14420oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public int f14421oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @Nullable
    public DrmSession f14422ooOO;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaCodecOperationMode {
    }

    public MediaCodecRenderer(int i, OooO0O0 oooO0O0, float f) {
        super(i);
        Objects.requireNonNull(oooO0O0);
        this.f14353OoooOOo = oooO0O0;
        this.f14354OoooOo0 = false;
        this.f14355OoooOoO = f;
        this.f14356OoooOoo = new DecoderInputBuffer(0);
        this.f14357Ooooo00 = new DecoderInputBuffer(0);
        this.f14359OooooO0 = new o000OO0O<>();
        this.f14360OooooOO = new ArrayList<>();
        this.f14361OooooOo = new MediaCodec.BufferInfo();
        this.f14411o00ooo = 1.0f;
        this.f14397o0000oOO = 0;
        this.f14408o00o0O = -9223372036854775807L;
        this.f14363Oooooo0 = new long[10];
        this.f14362Oooooo = new long[10];
        this.f14364OoooooO = new long[10];
        this.f14401o0000ooO = -9223372036854775807L;
        this.f14366o000 = -9223372036854775807L;
        this.f14358Ooooo0o = new OooOOO0();
        o00o0O();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean OooO0O0() {
        boolean zOooO0O0;
        if (this.f14365Ooooooo != null) {
            if (OooO0oo()) {
                zOooO0O0 = this.f13210o000oOoO;
            } else {
                SampleStream sampleStream = this.f13205OoooO0;
                Objects.requireNonNull(sampleStream);
                zOooO0O0 = sampleStream.OooO0O0();
            }
            if (zOooO0O0) {
                return true;
            }
            if (this.f14381o0000O00 >= 0) {
                return true;
            }
            if (this.f14378o00000oo != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f14378o00000oo) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int OooO0OO(Format format) throws ExoPlaybackException {
        try {
            return o0ooOoO(this.f14353OoooOOo, format);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw OooOoO0(e, format);
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean OooO0Oo() {
        return this.f14394o0000o0o;
    }

    @Override // com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.RendererCapabilities
    public final int OooOOO() {
        return 8;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooOOOO(long j, long j2) throws ExoPlaybackException {
        boolean z = false;
        if (this.f14396o0000oO0) {
            this.f14396o0000oO0 = false;
            OoooooO();
        }
        ExoPlaybackException exoPlaybackException = this.f14398o0000oOo;
        if (exoPlaybackException != null) {
            this.f14398o0000oOo = null;
            throw exoPlaybackException;
        }
        boolean z2 = true;
        try {
            if (this.f14394o0000o0o) {
                o00Oo0();
                return;
            }
            if (this.f14365Ooooooo != null || o0OoOo0(true)) {
                OoooOoo();
                if (this.f14382o0000O0O) {
                    o000O.OooO00o("bypassRender");
                    while (Oooo0(j, j2)) {
                    }
                    o000O.OooO0O0();
                } else if (this.f14420oo000o != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    o000O.OooO00o("drainAndFeed");
                    while (Oooo(j, j2) && o00oO0O(jElapsedRealtime)) {
                    }
                    while (OoooO00() && o00oO0O(jElapsedRealtime)) {
                    }
                    o000O.OooO0O0();
                } else {
                    Objects.requireNonNull(this.f14400o0000oo0);
                    SampleStream sampleStream = this.f13205OoooO0;
                    Objects.requireNonNull(sampleStream);
                    sampleStream.OooO0OO(j - this.f13204OoooO);
                    o0OoOo0(false);
                }
                synchronized (this.f14400o0000oo0) {
                }
            }
        } catch (IllegalStateException e) {
            if (o000OOo0.f36740OooO00o < 21 || !(e instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                if (stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    z = true;
                }
                z2 = z;
            }
            if (!z2) {
                throw e;
            }
            throw OooOoO0(Oooo0o0(e, this.f14413o0OO00O), this.f14365Ooooooo);
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.Renderer
    public void OooOOo(float f) throws ExoPlaybackException {
        this.f14411o00ooo = f;
        if (this.f14420oo000o == null || this.f14385o0000OOO == 3 || this.f13206OoooO00 == 0) {
            return;
        }
        o0OOO0o();
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public void OooOoOO() {
        this.f14365Ooooooo = null;
        this.f14401o0000ooO = -9223372036854775807L;
        this.f14366o000 = -9223372036854775807L;
        this.f14402o000O000 = 0;
        if (this.f14405o00O0O == null && this.f14422ooOO == null) {
            OoooO0O();
        } else {
            OooOooO();
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public void OooOoo(long j, boolean z) throws ExoPlaybackException {
        int i;
        this.f14393o0000o0O = false;
        this.f14394o0000o0o = false;
        this.f14396o0000oO0 = false;
        if (this.f14382o0000O0O) {
            this.f14358Ooooo0o.OooOO0O();
        } else {
            OoooO0();
        }
        o000OO0O<Format> o000oo0o2 = this.f14359OooooO0;
        synchronized (o000oo0o2) {
            i = o000oo0o2.f36738OooO0Oo;
        }
        if (i > 0) {
            this.f14391o0000o = true;
        }
        o000OO0O<Format> o000oo0o3 = this.f14359OooooO0;
        synchronized (o000oo0o3) {
            o000oo0o3.f36737OooO0OO = 0;
            o000oo0o3.f36738OooO0Oo = 0;
            Arrays.fill(o000oo0o3.f36736OooO0O0, (Object) null);
        }
        int i2 = this.f14402o000O000;
        if (i2 != 0) {
            this.f14366o000 = this.f14362Oooooo[i2 - 1];
            this.f14401o0000ooO = this.f14363Oooooo0[i2 - 1];
            this.f14402o000O000 = 0;
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public abstract void OooOooO();

    public final boolean Oooo(long j, long j2) throws ExoPlaybackException {
        boolean z;
        boolean z2;
        boolean zOoooooo;
        int iOooO0o;
        boolean z3;
        if (!(this.f14381o0000O00 >= 0)) {
            if (this.f14368o00000 && this.f14388o0000Oo0) {
                try {
                    iOooO0o = this.f14410o00oO0o.OooO0o(this.f14361OooooOo);
                } catch (IllegalStateException unused) {
                    OoooooO();
                    if (this.f14394o0000o0o) {
                        o00O0O();
                    }
                    return false;
                }
            } else {
                iOooO0o = this.f14410o00oO0o.OooO0o(this.f14361OooooOo);
            }
            if (iOooO0o < 0) {
                if (iOooO0o != -2) {
                    if (iOooO0o == -3) {
                        if (o000OOo0.f36740OooO00o < 21) {
                            this.f14377o00000oO = this.f14420oo000o.getOutputBuffers();
                        }
                        return true;
                    }
                    if (this.f14375o00000Oo && (this.f14393o0000o0O || this.f14383o0000OO == 2)) {
                        OoooooO();
                    }
                    return false;
                }
                this.f14387o0000Oo = true;
                MediaFormat mediaFormatOooO0OO = this.f14410o00oO0o.OooO0OO();
                if (this.f14421oo0o0Oo != 0 && mediaFormatOooO0OO.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) == 32 && mediaFormatOooO0OO.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY) == 32) {
                    this.f14374o00000OO = true;
                } else {
                    if (this.f14373o00000O0) {
                        mediaFormatOooO0OO.setInteger("channel-count", 1);
                    }
                    this.f14417o0ooOO0 = mediaFormatOooO0OO;
                    this.f14418o0ooOOo = true;
                }
                return true;
            }
            if (this.f14374o00000OO) {
                this.f14374o00000OO = false;
                this.f14420oo000o.releaseOutputBuffer(iOooO0o, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f14361OooooOo;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                OoooooO();
                return false;
            }
            this.f14381o0000O00 = iOooO0o;
            ByteBuffer outputBuffer = o000OOo0.f36740OooO00o >= 21 ? this.f14420oo000o.getOutputBuffer(iOooO0o) : this.f14377o00000oO[iOooO0o];
            this.f14399o0000oo = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.f14361OooooOo.offset);
                ByteBuffer byteBuffer = this.f14399o0000oo;
                MediaCodec.BufferInfo bufferInfo2 = this.f14361OooooOo;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j3 = this.f14361OooooOo.presentationTimeUs;
            int size = this.f14360OooooOO.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z3 = false;
                    break;
                }
                if (this.f14360OooooOO.get(i).longValue() == j3) {
                    this.f14360OooooOO.remove(i);
                    z3 = true;
                    break;
                }
                i++;
            }
            this.f14395o0000oO = z3;
            long j4 = this.f14392o0000o0;
            long j5 = this.f14361OooooOo.presentationTimeUs;
            this.f14380o0000O0 = j4 == j5;
            o0OO00O(j5);
        }
        if (this.f14368o00000 && this.f14388o0000Oo0) {
            try {
                MediaCodec mediaCodec = this.f14420oo000o;
                ByteBuffer byteBuffer2 = this.f14399o0000oo;
                int i2 = this.f14381o0000O00;
                MediaCodec.BufferInfo bufferInfo3 = this.f14361OooooOo;
                z2 = false;
                z = true;
                try {
                    zOoooooo = Ooooooo(j, j2, mediaCodec, byteBuffer2, i2, bufferInfo3.flags, 1, bufferInfo3.presentationTimeUs, this.f14395o0000oO, this.f14380o0000O0, this.f14416o0OoOo0);
                } catch (IllegalStateException unused2) {
                    OoooooO();
                    if (this.f14394o0000o0o) {
                        o00O0O();
                    }
                    return z2;
                }
            } catch (IllegalStateException unused3) {
                z2 = false;
            }
        } else {
            z = true;
            z2 = false;
            MediaCodec mediaCodec2 = this.f14420oo000o;
            ByteBuffer byteBuffer3 = this.f14399o0000oo;
            int i3 = this.f14381o0000O00;
            MediaCodec.BufferInfo bufferInfo4 = this.f14361OooooOo;
            zOoooooo = Ooooooo(j, j2, mediaCodec2, byteBuffer3, i3, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f14395o0000oO, this.f14380o0000O0, this.f14416o0OoOo0);
        }
        if (zOoooooo) {
            OooooOo(this.f14361OooooOo.presentationTimeUs);
            boolean z4 = (this.f14361OooooOo.flags & 4) != 0;
            this.f14381o0000O00 = -1;
            this.f14399o0000oo = null;
            if (!z4) {
                return z;
            }
            OoooooO();
        }
        return z2;
    }

    public final boolean Oooo0(long j, long j2) throws ExoPlaybackException {
        OooOOO0 oooOOO0;
        MediaCodecRenderer mediaCodecRenderer;
        boolean z;
        boolean z2;
        ByteBuffer byteBuffer;
        OooOOO0 oooOOO1 = this.f14358Ooooo0o;
        o00000O0.OooO0Oo(!this.f14394o0000o0o);
        if (oooOOO1.OooOO0o()) {
            oooOOO0 = oooOOO1;
            mediaCodecRenderer = this;
        } else {
            if (!Ooooooo(j, j2, null, oooOOO1.f13642Oooo0oO, this.f14381o0000O00, 0, oooOOO1.f36230OoooOOO, oooOOO1.f36232o000oOoO, oooOOO1.isDecodeOnly(), oooOOO1.isEndOfStream(), this.f14416o0OoOo0)) {
                return false;
            }
            mediaCodecRenderer = this;
            oooOOO0 = oooOOO1;
            mediaCodecRenderer.OooooOo(oooOOO1.f13640Oooo);
        }
        if (oooOOO0.isEndOfStream()) {
            mediaCodecRenderer.f14394o0000o0o = true;
            return false;
        }
        oooOOO0.OooOO0();
        if (mediaCodecRenderer.f14403o000OO) {
            if (!oooOOO0.OooOO0o()) {
                return true;
            }
            Oooo0o();
            mediaCodecRenderer.f14403o000OO = false;
            OoooOoo();
            if (!mediaCodecRenderer.f14382o0000O0O) {
                return false;
            }
        }
        o00000O0.OooO0Oo(!mediaCodecRenderer.f14393o0000o0O);
        o0000O0O o0000o0oOooOoO = OooOoO();
        while (true) {
            if (!oooOOO0.OooOOO0() && !oooOOO0.isEndOfStream()) {
                int iOooo00o = mediaCodecRenderer.Oooo00o(o0000o0oOooOoO, oooOOO0.f36228OoooO, false);
                if (iOooo00o == -5) {
                    z = true;
                    break;
                }
                if (iOooo00o == -4) {
                    DecoderInputBuffer decoderInputBuffer = oooOOO0.f36228OoooO;
                    o00000O0.OooO0Oo((oooOOO0.OooOOO0() || oooOOO0.isEndOfStream()) ? false : true);
                    o00000O0.OooO00o((decoderInputBuffer.OooO() || decoderInputBuffer.hasSupplementalData()) ? false : true);
                    if (oooOOO0.OooOO0o()) {
                        z2 = true;
                    } else {
                        if (decoderInputBuffer.isDecodeOnly() == oooOOO0.isDecodeOnly()) {
                            ByteBuffer byteBuffer2 = decoderInputBuffer.f13642Oooo0oO;
                            if (byteBuffer2 != null && (byteBuffer = oooOOO0.f13642Oooo0oO) != null) {
                                if (byteBuffer2.limit() + byteBuffer.position() >= 3072000) {
                                }
                            }
                            z2 = true;
                        }
                        z2 = false;
                    }
                    if (z2) {
                        oooOOO0.OooOOO(decoderInputBuffer);
                    } else {
                        oooOOO0.f36229OoooOO0 = true;
                    }
                } else if (iOooo00o != -3) {
                    throw new IllegalStateException();
                }
            }
            z = false;
            break;
        }
        if (!oooOOO0.OooOO0o() && mediaCodecRenderer.f14391o0000o) {
            Format format = mediaCodecRenderer.f14365Ooooooo;
            Objects.requireNonNull(format);
            mediaCodecRenderer.f14416o0OoOo0 = format;
            mediaCodecRenderer.OooooOO(format, null);
            mediaCodecRenderer.f14391o0000o = false;
        }
        if (z) {
            mediaCodecRenderer.OooooO0(o0000o0oOooOoO);
        }
        if (oooOOO0.isEndOfStream()) {
            mediaCodecRenderer.f14393o0000o0O = true;
        }
        if (oooOOO0.OooOO0o()) {
            return false;
        }
        oooOOO0.OooO0oo();
        oooOOO0.f13642Oooo0oO.order(ByteOrder.nativeOrder());
        return true;
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void Oooo00O(Format[] formatArr, long j, long j2) throws ExoPlaybackException {
        if (this.f14366o000 == -9223372036854775807L) {
            o00000O0.OooO0Oo(this.f14401o0000ooO == -9223372036854775807L);
            this.f14401o0000ooO = j;
            this.f14366o000 = j2;
            return;
        }
        int i = this.f14402o000O000;
        long[] jArr = this.f14362Oooooo;
        if (i == jArr.length) {
            long j3 = jArr[i - 1];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.f14402o000O000 = i + 1;
        }
        long[] jArr2 = this.f14363Oooooo0;
        int i2 = this.f14402o000O000;
        int i3 = i2 - 1;
        jArr2[i3] = j;
        this.f14362Oooooo[i3] = j2;
        this.f14364OoooooO[i2 - 1] = this.f14389o0000OoO;
    }

    public abstract int Oooo0O0(OooO00o oooO00o, Format format, Format format2);

    public abstract void Oooo0OO(OooO00o oooO00o, OooOOOO oooOOOO, Format format, @Nullable MediaCrypto mediaCrypto, float f);

    public final void Oooo0o() {
        this.f14403o000OO = false;
        this.f14358Ooooo0o.clear();
        this.f14382o0000O0O = false;
    }

    public MediaCodecDecoderException Oooo0o0(Throwable th, @Nullable OooO00o oooO00o) {
        return new MediaCodecDecoderException(th, oooO00o);
    }

    public final void Oooo0oO() throws ExoPlaybackException {
        if (!this.f14386o0000OOo) {
            ooOO();
        } else {
            this.f14383o0000OO = 1;
            this.f14385o0000OOO = 3;
        }
    }

    public final void Oooo0oo() throws ExoPlaybackException {
        if (o000OOo0.f36740OooO00o < 23) {
            Oooo0oO();
        } else if (!this.f14386o0000OOo) {
            o0Oo0oo();
        } else {
            this.f14383o0000OO = 1;
            this.f14385o0000OOO = 2;
        }
    }

    public final List<OooO00o> OoooO(boolean z) throws MediaCodecUtil.DecoderQueryException {
        List<OooO00o> listOoooOOO = OoooOOO(this.f14353OoooOOo, this.f14365Ooooooo, z);
        if (listOoooOOO.isEmpty() && z) {
            listOoooOOO = OoooOOO(this.f14353OoooOOo, this.f14365Ooooooo, false);
            if (!listOoooOOO.isEmpty()) {
                String str = this.f14365Ooooooo.f13131OoooOOo;
                String strValueOf = String.valueOf(listOoooOOO);
                StringBuilder sb = new StringBuilder(strValueOf.length() + o0OO00O.OooO00o(str, 99));
                sb.append("Drm session requires secure decoder for ");
                sb.append(str);
                sb.append(", but no secure decoder available. Trying to proceed with ");
                sb.append(strValueOf);
                sb.append(".");
                Log.w("MediaCodecRenderer", sb.toString());
            }
        }
        return listOoooOOO;
    }

    public final boolean OoooO0() throws ExoPlaybackException {
        boolean zOoooO0O = OoooO0O();
        if (zOoooO0O) {
            OoooOoo();
        }
        return zOoooO0O;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x01f7 A[PHI: r4
      0x01f7: PHI (r4v5 long) = (r4v4 long), (r4v4 long), (r4v18 long), (r4v22 long) binds: [B:108:0x01a1, B:110:0x01a7, B:122:0x01e7, B:118:0x01c7] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean OoooO00() throws ExoPlaybackException {
        long j;
        if (this.f14420oo000o == null || this.f14383o0000OO == 2 || this.f14393o0000o0O) {
            return false;
        }
        if (this.f14367o0000 < 0) {
            int iOooO0o0 = this.f14410o00oO0o.OooO0o0();
            this.f14367o0000 = iOooO0o0;
            if (iOooO0o0 < 0) {
                return false;
            }
            this.f14356OoooOoo.f13642Oooo0oO = o000OOo0.f36740OooO00o >= 21 ? this.f14420oo000o.getInputBuffer(iOooO0o0) : this.f14390o0000Ooo[iOooO0o0];
            this.f14356OoooOoo.clear();
        }
        if (this.f14383o0000OO == 1) {
            if (!this.f14375o00000Oo) {
                this.f14388o0000Oo0 = true;
                this.f14410o00oO0o.OooO0O0(this.f14367o0000, 0, 0L, 4);
                o00ooo();
            }
            this.f14383o0000OO = 2;
            return false;
        }
        if (this.f14372o00000O) {
            this.f14372o00000O = false;
            this.f14356OoooOoo.f13642Oooo0oO.put(f14352o000OoO);
            this.f14410o00oO0o.OooO0O0(this.f14367o0000, 38, 0L, 0);
            o00ooo();
            this.f14386o0000OOo = true;
            return true;
        }
        if (this.f14384o0000OO0 == 1) {
            for (int i = 0; i < this.f14409o00oO0O.f13133OoooOoO.size(); i++) {
                this.f14356OoooOoo.f13642Oooo0oO.put(this.f14409o00oO0O.f13133OoooOoO.get(i));
            }
            this.f14384o0000OO0 = 2;
        }
        int iPosition = this.f14356OoooOoo.f13642Oooo0oO.position();
        o0000O0O o0000o0oOooOoO = OooOoO();
        int iOooo00o = Oooo00o(o0000o0oOooOoO, this.f14356OoooOoo, false);
        if (OooO0oo()) {
            this.f14392o0000o0 = this.f14389o0000OoO;
        }
        if (iOooo00o == -3) {
            return false;
        }
        if (iOooo00o == -5) {
            if (this.f14384o0000OO0 == 2) {
                this.f14356OoooOoo.clear();
                this.f14384o0000OO0 = 1;
            }
            OooooO0(o0000o0oOooOoO);
            return true;
        }
        if (this.f14356OoooOoo.isEndOfStream()) {
            if (this.f14384o0000OO0 == 2) {
                this.f14356OoooOoo.clear();
                this.f14384o0000OO0 = 1;
            }
            this.f14393o0000o0O = true;
            if (!this.f14386o0000OOo) {
                OoooooO();
                return false;
            }
            try {
                if (!this.f14375o00000Oo) {
                    this.f14388o0000Oo0 = true;
                    this.f14410o00oO0o.OooO0O0(this.f14367o0000, 0, 0L, 4);
                    o00ooo();
                }
                return false;
            } catch (MediaCodec.CryptoException e) {
                throw OooOoO0(e, this.f14365Ooooooo);
            }
        }
        if (!this.f14386o0000OOo && !this.f14356OoooOoo.isKeyFrame()) {
            this.f14356OoooOoo.clear();
            if (this.f14384o0000OO0 == 2) {
                this.f14384o0000OO0 = 1;
            }
            return true;
        }
        boolean zOooO = this.f14356OoooOoo.OooO();
        if (zOooO) {
            p294o0O0Oo0o.o0OO00O o0oo00o2 = this.f14356OoooOoo.f13641Oooo0o;
            Objects.requireNonNull(o0oo00o2);
            if (iPosition != 0) {
                if (o0oo00o2.f35841OooO0Oo == null) {
                    int[] iArr = new int[1];
                    o0oo00o2.f35841OooO0Oo = iArr;
                    o0oo00o2.f35837OooO.numBytesOfClearData = iArr;
                }
                int[] iArr2 = o0oo00o2.f35841OooO0Oo;
                iArr2[0] = iArr2[0] + iPosition;
            }
        }
        if (this.f14404o000OOo && !zOooO) {
            ByteBuffer byteBuffer = this.f14356OoooOoo.f13642Oooo0oO;
            byte[] bArr = o0000O.f36673OooO00o;
            int iPosition2 = byteBuffer.position();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i2 + 1;
                if (i4 >= iPosition2) {
                    byteBuffer.clear();
                    break;
                }
                int i5 = byteBuffer.get(i2) & UByte.MAX_VALUE;
                if (i3 == 3) {
                    if (i5 == 1 && (byteBuffer.get(i4) & 31) == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                        byteBufferDuplicate.position(i2 - 3);
                        byteBufferDuplicate.limit(iPosition2);
                        byteBuffer.position(0);
                        byteBuffer.put(byteBufferDuplicate);
                        break;
                    }
                } else if (i5 == 0) {
                    i3++;
                }
                if (i5 != 0) {
                    i3 = 0;
                }
                i2 = i4;
            }
            if (this.f14356OoooOoo.f13642Oooo0oO.position() == 0) {
                return true;
            }
            this.f14404o000OOo = false;
        }
        DecoderInputBuffer decoderInputBuffer = this.f14356OoooOoo;
        long j2 = decoderInputBuffer.f13640Oooo;
        OooOOO oooOOO = this.f14376o00000o0;
        if (oooOOO != null) {
            Format format = this.f14365Ooooooo;
            if (oooOOO.f36227OooO0OO) {
                j = j2;
            } else {
                ByteBuffer byteBuffer2 = decoderInputBuffer.f13642Oooo0oO;
                Objects.requireNonNull(byteBuffer2);
                int i6 = 0;
                for (int i7 = 0; i7 < 4; i7++) {
                    i6 = (i6 << 8) | (byteBuffer2.get(i7) & UByte.MAX_VALUE);
                }
                int iOooO0Oo = o0ooOOo.OooO0Oo(i6);
                if (iOooO0Oo == -1) {
                    oooOOO.f36227OooO0OO = true;
                    Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                    j2 = decoderInputBuffer.f13640Oooo;
                } else {
                    long j3 = oooOOO.f36225OooO00o;
                    if (j3 == 0) {
                        long j4 = decoderInputBuffer.f13640Oooo;
                        oooOOO.f36226OooO0O0 = j4;
                        oooOOO.f36225OooO00o = ((long) iOooO0Oo) - 529;
                        j = j4;
                    } else {
                        long j5 = (1000000 * j3) / ((long) format.f13152ooOO);
                        oooOOO.f36225OooO00o = j3 + ((long) iOooO0Oo);
                        j2 = oooOOO.f36226OooO0O0 + j5;
                    }
                }
                j = j2;
            }
        } else {
            j = j2;
        }
        if (this.f14356OoooOoo.isDecodeOnly()) {
            this.f14360OooooOO.add(Long.valueOf(j));
        }
        if (this.f14391o0000o) {
            o000OO0O<Format> o000oo0o2 = this.f14359OooooO0;
            Format format2 = this.f14365Ooooooo;
            synchronized (o000oo0o2) {
                o000oo0o2.OooO00o(j);
                o000oo0o2.OooO0O0();
                int i8 = o000oo0o2.f36737OooO0OO;
                int i9 = o000oo0o2.f36738OooO0Oo;
                Format[] formatArr = o000oo0o2.f36736OooO0O0;
                int length = (i8 + i9) % formatArr.length;
                o000oo0o2.f36735OooO00o[length] = j;
                formatArr[length] = format2;
                o000oo0o2.f36738OooO0Oo = i9 + 1;
            }
            this.f14391o0000o = false;
        }
        if (this.f14376o00000o0 != null) {
            this.f14389o0000OoO = Math.max(this.f14389o0000OoO, this.f14356OoooOoo.f13640Oooo);
        } else {
            this.f14389o0000OoO = Math.max(this.f14389o0000OoO, j);
        }
        this.f14356OoooOoo.OooO0oo();
        if (this.f14356OoooOoo.hasSupplementalData()) {
            OoooOo0(this.f14356OoooOoo);
        }
        Oooooo(this.f14356OoooOoo);
        try {
            if (zOooO) {
                this.f14410o00oO0o.OooO00o(this.f14367o0000, this.f14356OoooOoo.f13641Oooo0o, j);
            } else {
                this.f14410o00oO0o.OooO0O0(this.f14367o0000, this.f14356OoooOoo.f13642Oooo0oO.limit(), j, 0);
            }
            o00ooo();
            this.f14386o0000OOo = true;
            this.f14384o0000OO0 = 0;
            Objects.requireNonNull(this.f14400o0000oo0);
            return true;
        } catch (MediaCodec.CryptoException e2) {
            throw OooOoO0(e2, this.f14365Ooooooo);
        }
    }

    public final boolean OoooO0O() {
        if (this.f14420oo000o == null) {
            return false;
        }
        if (this.f14385o0000OOO == 3 || this.f14369o000000 || ((this.f14370o000000O && !this.f14387o0000Oo) || (this.f14371o000000o && this.f14388o0000Oo0))) {
            o00O0O();
            return true;
        }
        try {
            this.f14410o00oO0o.flush();
            return false;
        } finally {
            o00Ooo();
        }
    }

    public boolean OoooOO0() {
        return false;
    }

    public abstract List<OooO00o> OoooOOO(OooO0O0 oooO0O0, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException;

    @Nullable
    public final o00 OoooOOo(DrmSession drmSession) throws ExoPlaybackException {
        p301o0O0Oooo.o000OOo0 o000ooo0OooO0Oo = drmSession.OooO0Oo();
        if (o000ooo0OooO0Oo == null || (o000ooo0OooO0Oo instanceof o00)) {
            return (o00) o000ooo0OooO0Oo;
        }
        String strValueOf = String.valueOf(o000ooo0OooO0Oo);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 42);
        sb.append("Expecting FrameworkMediaCrypto but found: ");
        sb.append(strValueOf);
        throw OooOoO0(new IllegalArgumentException(sb.toString()), this.f14365Ooooooo);
    }

    public void OoooOo0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:132:0x0208  */
    /* JADX WARN: Code duplicated, block: B:136:0x0210  */
    /* JADX WARN: Code duplicated, block: B:138:0x0218  */
    /* JADX WARN: Code duplicated, block: B:156:0x0251  */
    /* JADX WARN: Code duplicated, block: B:162:0x0265  */
    /* JADX WARN: Code duplicated, block: B:165:0x0271  */
    /* JADX WARN: Code duplicated, block: B:179:0x0299  */
    /* JADX WARN: Code duplicated, block: B:181:0x029e  */
    /* JADX WARN: Code duplicated, block: B:183:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:188:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0101  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:66:0x0139  */
    /* JADX WARN: Code duplicated, block: B:72:0x0150  */
    /* JADX WARN: Code duplicated, block: B:80:0x0169  */
    /* JADX WARN: Code duplicated, block: B:97:0x019f  */
    public final void OoooOoO(OooO00o oooO00o, MediaCrypto mediaCrypto) throws Exception {
        float fO000oOoO;
        MediaCodec mediaCodecCreateByCodecName;
        OooOOOO oooOOOO;
        OooOOOO o000oooo2;
        MediaCodec mediaCodec;
        int i;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Format format;
        boolean z7;
        boolean z8;
        String str2;
        String str3 = oooO00o.f14435OooO00o;
        int i2 = o000OOo0.f36740OooO00o;
        if (i2 < 23) {
            fO000oOoO = -1.0f;
        } else {
            float f = this.f14411o00ooo;
            Format[] formatArr = this.f13207OoooO0O;
            Objects.requireNonNull(formatArr);
            fO000oOoO = o000oOoO(f, formatArr);
        }
        float f2 = fO000oOoO <= this.f14355OoooOoO ? -1.0f : fO000oOoO;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            String strValueOf = String.valueOf(str3);
            o000O.OooO00o(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str3);
            try {
                int i3 = this.f14397o0000oOO;
                try {
                    try {
                        try {
                            if (i3 != 2 || i2 < 23) {
                                if (i3 != 4 || i2 < 23) {
                                    o000oooo2 = new o000oOoO(mediaCodecCreateByCodecName);
                                } else {
                                    int i4 = this.f13201Oooo0o;
                                    o000oooo2 = new OooOO0(mediaCodecCreateByCodecName, true, i4, new HandlerThread(OooOO0.OooO0oo(i4)));
                                }
                                oooOOOO = o000oooo2;
                                o000O.OooO0O0();
                                o000O.OooO00o("configureCodec");
                                Oooo0OO(oooO00o, oooOOOO, this.f14365Ooooooo, mediaCrypto, f2);
                                o000O.OooO0O0();
                                o000O.OooO00o("startCodec");
                                oooOOOO.start();
                                o000O.OooO0O0();
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                if (i2 < 21) {
                                    try {
                                        this.f14390o0000Ooo = mediaCodecCreateByCodecName.getInputBuffers();
                                        this.f14377o00000oO = mediaCodecCreateByCodecName.getOutputBuffers();
                                    } catch (Exception e) {
                                        e = e;
                                        mediaCodecCreateByCodecName = mediaCodecCreateByCodecName;
                                        if (oooOOOO != null) {
                                            oooOOOO.shutdown();
                                        }
                                        if (mediaCodecCreateByCodecName != null) {
                                            if (o000OOo0.f36740OooO00o < 21) {
                                                this.f14390o0000Ooo = null;
                                                this.f14377o00000oO = null;
                                            }
                                            mediaCodecCreateByCodecName.release();
                                        }
                                        throw e;
                                    }
                                }
                                this.f14420oo000o = mediaCodecCreateByCodecName;
                                this.f14410o00oO0o = oooOOOO;
                                this.f14413o0OO00O = oooO00o;
                                this.f14419o0ooOoO = f2;
                                this.f14409o00oO0O = this.f14365Ooooooo;
                                if (i2 > 25 && "OMX.Exynos.avc.dec.secure".equals(str3)) {
                                    String str4 = o000OOo0.f36743OooO0Oo;
                                    if (str4.startsWith("SM-T585") || str4.startsWith("SM-A510") || str4.startsWith("SM-A520") || str4.startsWith("SM-J700")) {
                                        i = 2;
                                    } else if (i2 < 24) {
                                        i = 0;
                                    } else {
                                        i = 0;
                                    }
                                } else if (i2 < 24 || !("OMX.Nvidia.h264.decode".equals(str3) || "OMX.Nvidia.h264.decode.secure".equals(str3))) {
                                    i = 0;
                                } else {
                                    String str5 = o000OOo0.f36741OooO0O0;
                                    if ("flounder".equals(str5) || "flounder_lte".equals(str5) || "grouper".equals(str5) || "tilapia".equals(str5)) {
                                        i = 1;
                                    } else {
                                        i = 0;
                                    }
                                }
                                this.f14421oo0o0Oo = i;
                                str = o000OOo0.f36743OooO0Oo;
                                if (str.startsWith("SM-T230") || !"OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                this.f14412o0O0O00 = z;
                                Format format2 = this.f14409o00oO0O;
                                if (i2 >= 21 && format2.f13133OoooOoO.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str3)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                this.f14404o000OOo = z2;
                                if (i2 >= 18 || ((i2 == 18 && ("OMX.SEC.avc.dec".equals(str3) || "OMX.SEC.avc.dec.secure".equals(str3))) || (i2 == 19 && str.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str3) || "OMX.Exynos.avc.dec.secure".equals(str3))))) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                this.f14369o000000 = z3;
                                if (i2 == 29 || !"c2.android.aac.decoder".equals(str3)) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                this.f14370o000000O = z4;
                                if (i2 <= 23 || !"OMX.google.vorbis.decoder".equals(str3)) {
                                    if (i2 <= 19) {
                                        String str6 = o000OOo0.f36741OooO0O0;
                                        z5 = (!"hb2000".equals(str6) || "stvm8".equals(str6)) && ("OMX.amlogic.avc.decoder.awesome".equals(str3) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str3));
                                    }
                                }
                                this.f14371o000000o = z5;
                                if (i2 == 21 || !"OMX.google.aac.decoder".equals(str3)) {
                                    z6 = false;
                                } else {
                                    z6 = true;
                                }
                                this.f14368o00000 = z6;
                                format = this.f14409o00oO0O;
                                if (i2 <= 18) {
                                    z7 = true;
                                    if (format.f13150o0OoOo0 != 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str3)) {
                                        z8 = true;
                                    }
                                    this.f14373o00000O0 = z8;
                                    str2 = oooO00o.f14435OooO00o;
                                    if (!((i2 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (i2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2))) || ("Amazon".equals(o000OOo0.f36742OooO0OO) && "AFTS".equals(str) && oooO00o.f14439OooO0o))) && !OoooOO0()) {
                                        z7 = false;
                                    }
                                    this.f14375o00000Oo = z7;
                                    if ("c2.android.mp3.decoder".equals(oooO00o.f14435OooO00o)) {
                                        this.f14376o00000o0 = new OooOOO();
                                    }
                                    if (this.f13206OoooO00 == 2) {
                                        this.f14378o00000oo = SystemClock.elapsedRealtime() + 1000;
                                    }
                                    Objects.requireNonNull(this.f14400o0000oo0);
                                    Ooooo0o(str3, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                                    return;
                                }
                                z7 = true;
                                z8 = false;
                                this.f14373o00000O0 = z8;
                                str2 = oooO00o.f14435OooO00o;
                                if (!((i2 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (i2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2))) || ("Amazon".equals(o000OOo0.f36742OooO0OO) && "AFTS".equals(str) && oooO00o.f14439OooO0o)))) {
                                    z7 = false;
                                }
                                this.f14375o00000Oo = z7;
                                if ("c2.android.mp3.decoder".equals(oooO00o.f14435OooO00o)) {
                                    this.f14376o00000o0 = new OooOOO();
                                }
                                if (this.f13206OoooO00 == 2) {
                                    this.f14378o00000oo = SystemClock.elapsedRealtime() + 1000;
                                }
                                Objects.requireNonNull(this.f14400o0000oo0);
                                Ooooo0o(str3, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                                return;
                            }
                            int i5 = this.f13201Oooo0o;
                            o000oooo2 = new OooOO0(mediaCodecCreateByCodecName, false, i5, new HandlerThread(OooOO0.OooO0oo(i5)));
                            Oooo0OO(oooO00o, oooOOOO, this.f14365Ooooooo, mediaCrypto, f2);
                            o000O.OooO0O0();
                            o000O.OooO00o("startCodec");
                            oooOOOO.start();
                            o000O.OooO0O0();
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                            if (i2 < 21) {
                                this.f14390o0000Ooo = mediaCodecCreateByCodecName.getInputBuffers();
                                this.f14377o00000oO = mediaCodecCreateByCodecName.getOutputBuffers();
                            }
                            this.f14420oo000o = mediaCodecCreateByCodecName;
                            this.f14410o00oO0o = oooOOOO;
                            this.f14413o0OO00O = oooO00o;
                            this.f14419o0ooOoO = f2;
                            this.f14409o00oO0O = this.f14365Ooooooo;
                            if (i2 > 25) {
                                if (i2 < 24) {
                                    i = 0;
                                } else {
                                    i = 0;
                                }
                            } else if (i2 < 24) {
                                i = 0;
                            } else {
                                i = 0;
                            }
                            this.f14421oo0o0Oo = i;
                            str = o000OOo0.f36743OooO0Oo;
                            if (str.startsWith("SM-T230")) {
                                z = false;
                            } else {
                                z = false;
                            }
                            this.f14412o0O0O00 = z;
                            Format format3 = this.f14409o00oO0O;
                            if (i2 >= 21) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            this.f14404o000OOo = z2;
                            if (i2 >= 18) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.f14369o000000 = z3;
                            if (i2 == 29) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            this.f14370o000000O = z4;
                            if (i2 <= 23) {
                                if (i2 <= 19) {
                                    String str7 = o000OOo0.f36741OooO0O0;
                                    if ("hb2000".equals(str7)) {
                                    }
                                }
                            } else {
                                if (i2 <= 19) {
                                    String str8 = o000OOo0.f36741OooO0O0;
                                    if ("hb2000".equals(str8)) {
                                    }
                                }
                            }
                            this.f14371o000000o = z5;
                            if (i2 == 21) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            this.f14368o00000 = z6;
                            format = this.f14409o00oO0O;
                            if (i2 <= 18) {
                                z7 = true;
                                if (format.f13150o0OoOo0 != 1) {
                                }
                                this.f14373o00000O0 = z8;
                                str2 = oooO00o.f14435OooO00o;
                                if (!((i2 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (i2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2))) || ("Amazon".equals(o000OOo0.f36742OooO0OO) && "AFTS".equals(str) && oooO00o.f14439OooO0o)))) {
                                    z7 = false;
                                }
                                this.f14375o00000Oo = z7;
                                if ("c2.android.mp3.decoder".equals(oooO00o.f14435OooO00o)) {
                                    this.f14376o00000o0 = new OooOOO();
                                }
                                if (this.f13206OoooO00 == 2) {
                                    this.f14378o00000oo = SystemClock.elapsedRealtime() + 1000;
                                }
                                Objects.requireNonNull(this.f14400o0000oo0);
                                Ooooo0o(str3, jElapsedRealtime3, jElapsedRealtime3 - jElapsedRealtime);
                                return;
                            }
                            z7 = true;
                            z8 = false;
                            this.f14373o00000O0 = z8;
                            str2 = oooO00o.f14435OooO00o;
                            if (!((i2 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (i2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2))) || ("Amazon".equals(o000OOo0.f36742OooO0OO) && "AFTS".equals(str) && oooO00o.f14439OooO0o)))) {
                                z7 = false;
                            }
                            this.f14375o00000Oo = z7;
                            if ("c2.android.mp3.decoder".equals(oooO00o.f14435OooO00o)) {
                                this.f14376o00000o0 = new OooOOO();
                            }
                            if (this.f13206OoooO00 == 2) {
                                this.f14378o00000oo = SystemClock.elapsedRealtime() + 1000;
                            }
                            Objects.requireNonNull(this.f14400o0000oo0);
                            Ooooo0o(str3, jElapsedRealtime3, jElapsedRealtime3 - jElapsedRealtime);
                            return;
                        } catch (Exception e2) {
                            e = e2;
                            mediaCodec = mediaCodecCreateByCodecName;
                            mediaCodecCreateByCodecName = mediaCodec;
                            if (oooOOOO != null) {
                                oooOOOO.shutdown();
                            }
                            if (mediaCodecCreateByCodecName != null) {
                                if (o000OOo0.f36740OooO00o < 21) {
                                    this.f14390o0000Ooo = null;
                                    this.f14377o00000oO = null;
                                }
                                mediaCodecCreateByCodecName.release();
                            }
                            throw e;
                        }
                        o000O.OooO0O0();
                        o000O.OooO00o("configureCodec");
                    } catch (Exception e3) {
                        e = e3;
                        mediaCodec = mediaCodecCreateByCodecName;
                    }
                    oooOOOO = o000oooo2;
                } catch (Exception e4) {
                    e = e4;
                    oooOOOO = null;
                    if (oooOOOO != null) {
                        oooOOOO.shutdown();
                    }
                    if (mediaCodecCreateByCodecName != null) {
                        if (o000OOo0.f36740OooO00o < 21) {
                            this.f14390o0000Ooo = null;
                            this.f14377o00000oO = null;
                        }
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e5) {
                e = e5;
                mediaCodecCreateByCodecName = mediaCodecCreateByCodecName;
            }
        } catch (Exception e6) {
            e = e6;
            mediaCodecCreateByCodecName = null;
        }
    }

    public final void OoooOoo() throws ExoPlaybackException {
        Format format;
        if (this.f14420oo000o != null || this.f14382o0000O0O || (format = this.f14365Ooooooo) == null) {
            return;
        }
        if (this.f14405o00O0O == null && o0ooOOo(format)) {
            Format format2 = this.f14365Ooooooo;
            Oooo0o();
            String str = format2.f13131OoooOOo;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                OooOOO0 oooOOO0 = this.f14358Ooooo0o;
                Objects.requireNonNull(oooOOO0);
                oooOOO0.f36231OoooOOo = 32;
            } else {
                OooOOO0 oooOOO1 = this.f14358Ooooo0o;
                Objects.requireNonNull(oooOOO1);
                oooOOO1.f36231OoooOOo = 1;
            }
            this.f14382o0000O0O = true;
            return;
        }
        oo000o(this.f14405o00O0O);
        String str2 = this.f14365Ooooooo.f13131OoooOOo;
        DrmSession drmSession = this.f14422ooOO;
        if (drmSession != null) {
            if (this.f14406o00Oo0 == null) {
                o00 o00VarOoooOOo = OoooOOo(drmSession);
                if (o00VarOoooOOo != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(o00VarOoooOOo.f36039OooO00o, o00VarOoooOOo.f36040OooO0O0);
                        this.f14406o00Oo0 = mediaCrypto;
                        this.f14407o00Ooo = !o00VarOoooOOo.f36041OooO0OO && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e) {
                        throw OooOoO0(e, this.f14365Ooooooo);
                    }
                } else if (this.f14422ooOO.OooO0o0() == null) {
                    return;
                }
            }
            if (o00.f36038OooO0Oo) {
                int state = this.f14422ooOO.getState();
                if (state == 1) {
                    throw OooOoO0(this.f14422ooOO.OooO0o0(), this.f14365Ooooooo);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            Ooooo00(this.f14406o00Oo0, this.f14407o00Ooo);
        } catch (DecoderInitializationException e2) {
            throw OooOoO0(e2, this.f14365Ooooooo);
        }
    }

    public final void Ooooo00(MediaCrypto mediaCrypto, boolean z) throws DecoderInitializationException {
        if (this.f14414o0OOO0o == null) {
            try {
                List<OooO00o> listOoooO = OoooO(z);
                ArrayDeque<OooO00o> arrayDeque = new ArrayDeque<>();
                this.f14414o0OOO0o = arrayDeque;
                if (this.f14354OoooOo0) {
                    arrayDeque.addAll(listOoooO);
                } else if (!listOoooO.isEmpty()) {
                    this.f14414o0OOO0o.add(listOoooO.get(0));
                }
                this.f14415o0Oo0oo = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(this.f14365Ooooooo, e, z, -49998);
            }
        }
        if (this.f14414o0OOO0o.isEmpty()) {
            throw new DecoderInitializationException(this.f14365Ooooooo, null, z, -49999);
        }
        while (this.f14420oo000o == null) {
            OooO00o oooO00oPeekFirst = this.f14414o0OOO0o.peekFirst();
            if (!o0ooOO0(oooO00oPeekFirst)) {
                return;
            }
            try {
                OoooOoO(oooO00oPeekFirst, mediaCrypto);
            } catch (Exception e2) {
                String strValueOf = String.valueOf(oooO00oPeekFirst);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 30);
                sb.append("Failed to initialize decoder: ");
                sb.append(strValueOf);
                o0000oo.OooO0OO("MediaCodecRenderer", sb.toString(), e2);
                this.f14414o0OOO0o.removeFirst();
                Format format = this.f14365Ooooooo;
                String str = oooO00oPeekFirst.f14435OooO00o;
                String strValueOf2 = String.valueOf(format);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + o0OO00O.OooO00o(str, 23));
                sb2.append("Decoder init failed: ");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(strValueOf2);
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(sb2.toString(), e2, format.f13131OoooOOo, z, oooO00oPeekFirst, (o000OOo0.f36740OooO00o < 21 || !(e2 instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) e2).getDiagnosticInfo());
                DecoderInitializationException decoderInitializationException2 = this.f14415o0Oo0oo;
                if (decoderInitializationException2 == null) {
                    this.f14415o0Oo0oo = decoderInitializationException;
                } else {
                    this.f14415o0Oo0oo = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.f14424Oooo0o, decoderInitializationException2.f14425Oooo0oO, decoderInitializationException2.f14426Oooo0oo, decoderInitializationException2.f14423Oooo);
                }
                if (this.f14414o0OOO0o.isEmpty()) {
                    throw this.f14415o0Oo0oo;
                }
            }
        }
        this.f14414o0OOO0o = null;
    }

    public abstract void Ooooo0o(String str, long j, long j2);

    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00df  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    @CallSuper
    public void OooooO0(o0000O0O o0000o0o2) throws ExoPlaybackException {
        int iOooo0O0;
        int i;
        int i2;
        Format format;
        boolean zRequiresSecureDecoderComponent;
        boolean z = true;
        this.f14391o0000o = true;
        Format format2 = o0000o0o2.f40508OooO0O0;
        Objects.requireNonNull(format2);
        o00oO0o(o0000o0o2.f40507OooO00o);
        this.f14365Ooooooo = format2;
        if (this.f14382o0000O0O) {
            this.f14403o000OO = true;
            return;
        }
        if (this.f14420oo000o == null) {
            this.f14414o0OOO0o = null;
            OoooOoo();
            return;
        }
        DrmSession drmSession = this.f14405o00O0O;
        if ((drmSession != null || this.f14422ooOO == null) && (drmSession == null || this.f14422ooOO != null)) {
            if (drmSession != this.f14422ooOO && !this.f14413o0OO00O.f14439OooO0o) {
                o00 o00VarOoooOOo = OoooOOo(drmSession);
                if (o00VarOoooOOo == null) {
                    zRequiresSecureDecoderComponent = true;
                } else if (o00VarOoooOOo.f36041OooO0OO) {
                    zRequiresSecureDecoderComponent = false;
                } else {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(o00VarOoooOOo.f36039OooO00o, o00VarOoooOOo.f36040OooO0O0);
                        try {
                            zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(format2.f13131OoooOOo);
                            mediaCrypto.release();
                        } catch (Throwable th) {
                            mediaCrypto.release();
                            throw th;
                        }
                    } catch (MediaCryptoException unused) {
                        zRequiresSecureDecoderComponent = true;
                    }
                }
                if (!zRequiresSecureDecoderComponent) {
                    if (o000OOo0.f36740OooO00o < 23) {
                    }
                    iOooo0O0 = Oooo0O0(this.f14413o0OO00O, this.f14409o00oO0O, format2);
                    if (iOooo0O0 != 0) {
                        Oooo0oO();
                        return;
                    }
                    if (iOooo0O0 != 1) {
                        this.f14409o00oO0O = format2;
                        o0OOO0o();
                        if (this.f14405o00O0O != this.f14422ooOO) {
                            Oooo0oo();
                            return;
                        } else {
                            if (this.f14386o0000OOo) {
                                this.f14383o0000OO = 1;
                                this.f14385o0000OOO = 1;
                                return;
                            }
                            return;
                        }
                    }
                    if (iOooo0O0 != 2) {
                        if (iOooo0O0 == 3) {
                            throw new IllegalStateException();
                        }
                        this.f14409o00oO0O = format2;
                        o0OOO0o();
                        if (this.f14405o00O0O != this.f14422ooOO) {
                            Oooo0oo();
                            return;
                        }
                        return;
                    }
                    if (this.f14412o0O0O00) {
                        Oooo0oO();
                        return;
                    }
                    this.f14379o0000O = true;
                    this.f14384o0000OO0 = 1;
                    i = this.f14421oo0o0Oo;
                    if (i != 2) {
                        if (i == 1) {
                            i2 = format2.f13136Ooooo0o;
                            format = this.f14409o00oO0O;
                            if (i2 == format.f13136Ooooo0o) {
                                z = false;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                    }
                    this.f14372o00000O = z;
                    this.f14409o00oO0O = format2;
                    o0OOO0o();
                    if (this.f14405o00O0O != this.f14422ooOO) {
                        Oooo0oo();
                        return;
                    }
                    return;
                }
            } else if (o000OOo0.f36740OooO00o < 23 || this.f14405o00O0O == this.f14422ooOO) {
                iOooo0O0 = Oooo0O0(this.f14413o0OO00O, this.f14409o00oO0O, format2);
                if (iOooo0O0 != 0) {
                    Oooo0oO();
                    return;
                }
                if (iOooo0O0 != 1) {
                    this.f14409o00oO0O = format2;
                    o0OOO0o();
                    if (this.f14405o00O0O != this.f14422ooOO) {
                        Oooo0oo();
                        return;
                    } else {
                        if (this.f14386o0000OOo) {
                            this.f14383o0000OO = 1;
                            this.f14385o0000OOO = 1;
                            return;
                        }
                        return;
                    }
                }
                if (iOooo0O0 != 2) {
                    if (iOooo0O0 == 3) {
                        throw new IllegalStateException();
                    }
                    this.f14409o00oO0O = format2;
                    o0OOO0o();
                    if (this.f14405o00O0O != this.f14422ooOO) {
                        Oooo0oo();
                        return;
                    }
                    return;
                }
                if (this.f14412o0O0O00) {
                    Oooo0oO();
                    return;
                }
                this.f14379o0000O = true;
                this.f14384o0000OO0 = 1;
                i = this.f14421oo0o0Oo;
                if (i != 2) {
                    if (i == 1) {
                        i2 = format2.f13136Ooooo0o;
                        format = this.f14409o00oO0O;
                        if (i2 == format.f13136Ooooo0o || format2.f13137OooooO0 != format.f13137OooooO0) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                this.f14372o00000O = z;
                this.f14409o00oO0O = format2;
                o0OOO0o();
                if (this.f14405o00O0O != this.f14422ooOO) {
                    Oooo0oo();
                    return;
                }
                return;
            }
        }
        Oooo0oO();
    }

    public abstract void OooooOO(Format format, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException;

    @CallSuper
    public void OooooOo(long j) {
        while (true) {
            int i = this.f14402o000O000;
            if (i == 0 || j < this.f14364OoooooO[0]) {
                return;
            }
            long[] jArr = this.f14363Oooooo0;
            this.f14401o0000ooO = jArr[0];
            this.f14366o000 = this.f14362Oooooo[0];
            int i2 = i - 1;
            this.f14402o000O000 = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.f14362Oooooo;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f14402o000O000);
            long[] jArr3 = this.f14364OoooooO;
            System.arraycopy(jArr3, 1, jArr3, 0, this.f14402o000O000);
            Oooooo0();
        }
    }

    public abstract void Oooooo(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException;

    public abstract void Oooooo0();

    @TargetApi(23)
    public final void OoooooO() throws ExoPlaybackException {
        int i = this.f14385o0000OOO;
        if (i == 1) {
            OoooO0();
            return;
        }
        if (i == 2) {
            o0Oo0oo();
        } else if (i == 3) {
            ooOO();
        } else {
            this.f14394o0000o0o = true;
            o00Oo0();
        }
    }

    public abstract boolean Ooooooo(long j, long j2, @Nullable MediaCodec mediaCodec, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException;

    public abstract float o000oOoO(float f, Format[] formatArr);

    /* JADX WARN: Multi-variable type inference failed */
    public final void o00O0O() {
        try {
            OooOOOO oooOOOO = this.f14410o00oO0o;
            if (oooOOOO != null) {
                oooOOOO.shutdown();
            }
            MediaCodec mediaCodec = this.f14420oo000o;
            if (mediaCodec != null) {
                Objects.requireNonNull(this.f14400o0000oo0);
                mediaCodec.release();
            }
            this.f14420oo000o = null;
            this.f14410o00oO0o = null;
            try {
                MediaCrypto mediaCrypto = this.f14406o00Oo0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f14406o00Oo0 = null;
                oo000o(null);
                o00o0O();
            }
        } catch (Throwable th) {
            this.f14420oo000o = null;
            this.f14410o00oO0o = null;
            try {
                MediaCrypto mediaCrypto2 = this.f14406o00Oo0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f14406o00Oo0 = null;
                oo000o(null);
                o00o0O();
            }
        }
    }

    public void o00Oo0() throws ExoPlaybackException {
    }

    @CallSuper
    public void o00Ooo() {
        o00ooo();
        this.f14381o0000O00 = -1;
        this.f14399o0000oo = null;
        this.f14378o00000oo = -9223372036854775807L;
        this.f14388o0000Oo0 = false;
        this.f14386o0000OOo = false;
        this.f14372o00000O = false;
        this.f14374o00000OO = false;
        this.f14395o0000oO = false;
        this.f14380o0000O0 = false;
        this.f14360OooooOO.clear();
        this.f14389o0000OoO = -9223372036854775807L;
        this.f14392o0000o0 = -9223372036854775807L;
        OooOOO oooOOO = this.f14376o00000o0;
        if (oooOOO != null) {
            oooOOO.f36225OooO00o = 0L;
            oooOOO.f36226OooO0O0 = 0L;
            oooOOO.f36227OooO0OO = false;
        }
        this.f14383o0000OO = 0;
        this.f14385o0000OOO = 0;
        this.f14384o0000OO0 = this.f14379o0000O ? 1 : 0;
    }

    @CallSuper
    public final void o00o0O() {
        o00Ooo();
        this.f14398o0000oOo = null;
        this.f14376o00000o0 = null;
        this.f14414o0OOO0o = null;
        this.f14413o0OO00O = null;
        this.f14409o00oO0O = null;
        this.f14417o0ooOO0 = null;
        this.f14418o0ooOOo = false;
        this.f14387o0000Oo = false;
        this.f14419o0ooOoO = -1.0f;
        this.f14421oo0o0Oo = 0;
        this.f14412o0O0O00 = false;
        this.f14404o000OOo = false;
        this.f14369o000000 = false;
        this.f14370o000000O = false;
        this.f14371o000000o = false;
        this.f14368o00000 = false;
        this.f14373o00000O0 = false;
        this.f14375o00000Oo = false;
        this.f14379o0000O = false;
        this.f14384o0000OO0 = 0;
        if (o000OOo0.f36740OooO00o < 21) {
            this.f14390o0000Ooo = null;
            this.f14377o00000oO = null;
        }
        this.f14407o00Ooo = false;
    }

    public final boolean o00oO0O(long j) {
        return this.f14408o00o0O == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.f14408o00o0O;
    }

    public final void o00oO0o(@Nullable DrmSession drmSession) {
        DrmSession drmSession2 = this.f14405o00O0O;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.OooO00o(null);
            }
            if (drmSession2 != null) {
                drmSession2.OooO0O0(null);
            }
        }
        this.f14405o00O0O = drmSession;
    }

    public final void o00ooo() {
        this.f14367o0000 = -1;
        this.f14356OoooOoo.f13642Oooo0oO = null;
    }

    public final void o0OO00O(long j) throws ExoPlaybackException {
        Format formatOooO0OO;
        Format formatOooO0OO2;
        boolean z;
        o000OO0O<Format> o000oo0o2 = this.f14359OooooO0;
        synchronized (o000oo0o2) {
            formatOooO0OO = null;
            formatOooO0OO2 = null;
            while (o000oo0o2.f36738OooO0Oo > 0 && j - o000oo0o2.f36735OooO00o[o000oo0o2.f36737OooO0OO] >= 0) {
                formatOooO0OO2 = o000oo0o2.OooO0OO();
            }
        }
        Format format = formatOooO0OO2;
        if (format == null && this.f14418o0ooOOo) {
            o000OO0O<Format> o000oo0o3 = this.f14359OooooO0;
            synchronized (o000oo0o3) {
                if (o000oo0o3.f36738OooO0Oo != 0) {
                    formatOooO0OO = o000oo0o3.OooO0OO();
                }
            }
            format = formatOooO0OO;
        }
        if (format != null) {
            this.f14416o0OoOo0 = format;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.f14418o0ooOOo && this.f14416o0OoOo0 != null)) {
            OooooOO(this.f14416o0OoOo0, this.f14417o0ooOO0);
            this.f14418o0ooOOo = false;
        }
    }

    public final void o0OOO0o() throws ExoPlaybackException {
        if (o000OOo0.f36740OooO00o < 23) {
            return;
        }
        float f = this.f14411o00ooo;
        Format[] formatArr = this.f13207OoooO0O;
        Objects.requireNonNull(formatArr);
        float fO000oOoO = o000oOoO(f, formatArr);
        float f2 = this.f14419o0ooOoO;
        if (f2 == fO000oOoO) {
            return;
        }
        if (fO000oOoO == -1.0f) {
            Oooo0oO();
            return;
        }
        if (f2 != -1.0f || fO000oOoO > this.f14355OoooOoO) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fO000oOoO);
            this.f14420oo000o.setParameters(bundle);
            this.f14419o0ooOoO = fO000oOoO;
        }
    }

    @RequiresApi(23)
    public final void o0Oo0oo() throws ExoPlaybackException {
        o00 o00VarOoooOOo = OoooOOo(this.f14405o00O0O);
        if (o00VarOoooOOo == null) {
            ooOO();
            return;
        }
        if (C.f13109OooO0o0.equals(o00VarOoooOOo.f36039OooO00o)) {
            ooOO();
            return;
        }
        if (OoooO0()) {
            return;
        }
        try {
            this.f14406o00Oo0.setMediaDrmSession(o00VarOoooOOo.f36040OooO0O0);
            oo000o(this.f14405o00O0O);
            this.f14383o0000OO = 0;
            this.f14385o0000OOO = 0;
        } catch (MediaCryptoException e) {
            throw OooOoO0(e, this.f14365Ooooooo);
        }
    }

    public final boolean o0OoOo0(boolean z) throws ExoPlaybackException {
        o0000O0O o0000o0oOooOoO = OooOoO();
        this.f14357Ooooo00.clear();
        int iOooo00o = Oooo00o(o0000o0oOooOoO, this.f14357Ooooo00, z);
        if (iOooo00o == -5) {
            OooooO0(o0000o0oOooOoO);
            return true;
        }
        if (iOooo00o != -4 || !this.f14357Ooooo00.isEndOfStream()) {
            return false;
        }
        this.f14393o0000o0O = true;
        OoooooO();
        return false;
    }

    public boolean o0ooOO0(OooO00o oooO00o) {
        return true;
    }

    public boolean o0ooOOo(Format format) {
        return false;
    }

    public abstract int o0ooOoO(OooO0O0 oooO0O0, Format format) throws MediaCodecUtil.DecoderQueryException;

    public final void oo000o(@Nullable DrmSession drmSession) {
        DrmSession drmSession2 = this.f14422ooOO;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.OooO00o(null);
            }
            if (drmSession2 != null) {
                drmSession2.OooO0O0(null);
            }
        }
        this.f14422ooOO = drmSession;
    }

    public final void ooOO() throws ExoPlaybackException {
        o00O0O();
        OoooOoo();
    }

    public static class DecoderInitializationException extends Exception {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @Nullable
        public final String f14423Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final String f14424Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final boolean f14425Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @Nullable
        public final OooO00o f14426Oooo0oo;

        public DecoderInitializationException(Format format, @Nullable Throwable th, boolean z, int i) {
            String strValueOf = String.valueOf(format);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
            sb.append("Decoder init failed: [");
            sb.append(i);
            sb.append("], ");
            sb.append(strValueOf);
            String string = sb.toString();
            String str = format.f13131OoooOOo;
            String str2 = i < 0 ? "neg_" : "";
            int iAbs = Math.abs(i);
            StringBuilder sb2 = new StringBuilder(str2.length() + 71);
            sb2.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
            sb2.append(str2);
            sb2.append(iAbs);
            this(string, th, str, z, null, sb2.toString());
        }

        public DecoderInitializationException(String str, @Nullable Throwable th, String str2, boolean z, @Nullable OooO00o oooO00o, @Nullable String str3) {
            super(str, th);
            this.f14424Oooo0o = str2;
            this.f14425Oooo0oO = z;
            this.f14426Oooo0oo = oooO00o;
            this.f14423Oooo = str3;
        }
    }
}
