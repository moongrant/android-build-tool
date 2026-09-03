package com.google.android.exoplayer2;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.source.SampleStream;
import java.io.IOException;
import kotlin.jvm.internal.LongCompanionObject;
import p200o00o0o.o0O0OOO0;
import p203o00o0o0o.o00OOO0O;
import p203o00o0o0o.o0O00O0o;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class OooO0o implements Renderer, RendererCapabilities {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o0O0OOO0 f11041OooO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f11044OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o0O00O0o f11045OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f11046OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f11047OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public SampleStream f11048OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public OooOo[] f11049OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f11051OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f11052OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f11053OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public RendererCapabilities.OooO00o f11054OooOOo0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f11042OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00OOO0O f11043OooO0o = new o00OOO0O();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f11050OooOOO = Long.MIN_VALUE;

    public OooO0o(int i) {
        this.f11044OooO0o0 = i;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooO(o0O00O0o o0o00o0o, OooOo[] oooOoArr, SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException {
        o00O000o.OooO0Oo(this.f11047OooOO0 == 0);
        this.f11045OooO0oO = o0o00o0o;
        this.f11047OooOO0 = 1;
        OooOoo0(z, z2);
        OooOOOO(oooOoArr, sampleStream, j2, j3);
        this.f11052OooOOOO = false;
        this.f11050OooOOO = j;
        OooOoo(j, z);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean OooO0Oo() {
        return OooO0oO();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooO0o() {
        o00O000o.OooO0Oo(this.f11047OooOO0 == 1);
        this.f11043OooO0o.OooO00o();
        this.f11047OooOO0 = 0;
        this.f11048OooOO0O = null;
        this.f11049OooOO0o = null;
        this.f11052OooOOOO = false;
        OooOoOO();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean OooO0oO() {
        return this.f11050OooOOO == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooO0oo() {
        this.f11052OooOOOO = true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooOO0(int i, o0O0OOO0 o0o0ooo0) {
        this.f11046OooO0oo = i;
        this.f11041OooO = o0o0ooo0;
    }

    @Override // com.google.android.exoplayer2.oo000o.OooO0O0
    public void OooOO0O(int i, @Nullable Object obj) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooOO0o() throws IOException {
        SampleStream sampleStream = this.f11048OooOO0O;
        sampleStream.getClass();
        sampleStream.OooO00o();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final int OooOOO() {
        return this.f11044OooO0o0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean OooOOO0() {
        return this.f11052OooOOOO;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooOOOO(OooOo[] oooOoArr, SampleStream sampleStream, long j, long j2) throws ExoPlaybackException {
        o00O000o.OooO0Oo(!this.f11052OooOOOO);
        this.f11048OooOO0O = sampleStream;
        if (this.f11050OooOOO == Long.MIN_VALUE) {
            this.f11050OooOOO = j;
        }
        this.f11049OooOO0o = oooOoArr;
        this.f11051OooOOO0 = j2;
        Oooo00o(oooOoArr, j, j2);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final OooO0o OooOOOo() {
        return this;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public /* synthetic */ void OooOOo(float f, float f2) {
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int OooOOoo() throws ExoPlaybackException {
        return 0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    public o00OO00O OooOo() {
        return null;
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    public final SampleStream OooOo0() {
        return this.f11048OooOO0O;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final long OooOo0O() {
        return this.f11050OooOOO;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooOo0o(long j) throws ExoPlaybackException {
        this.f11052OooOOOO = false;
        this.f11050OooOOO = j;
        OooOoo(j, false);
    }

    public final ExoPlaybackException OooOoO(MediaCodecUtil.DecoderQueryException decoderQueryException, @Nullable OooOo oooOo) {
        return OooOoO0(4002, oooOo, decoderQueryException, false);
    }

    public final ExoPlaybackException OooOoO0(int i, @Nullable OooOo oooOo, Exception exc, boolean z) {
        int iOooO0OO;
        if (oooOo == null || this.f11053OooOOOo) {
            iOooO0OO = 4;
        } else {
            this.f11053OooOOOo = true;
            try {
                iOooO0OO = OooO0OO(oooOo) & 7;
                this.f11053OooOOOo = false;
            } catch (ExoPlaybackException unused) {
                this.f11053OooOOOo = false;
                iOooO0OO = 4;
            } catch (Throwable th) {
                this.f11053OooOOOo = false;
                throw th;
            }
        }
        return new ExoPlaybackException(1, exc, i, getName(), this.f11046OooO0oo, oooOo, oooOo == null ? 4 : iOooO0OO, z);
    }

    public abstract void OooOoOO();

    public abstract void OooOoo(long j, boolean z) throws ExoPlaybackException;

    public void OooOoo0(boolean z, boolean z2) throws ExoPlaybackException {
    }

    public void OooOooO() {
    }

    public void OooOooo() {
    }

    public final int Oooo0(o00OOO0O o00ooo0o, DecoderInputBuffer decoderInputBuffer, int i) {
        SampleStream sampleStream = this.f11048OooOO0O;
        sampleStream.getClass();
        int iOooOOO = sampleStream.OooOOO(o00ooo0o, decoderInputBuffer, i);
        if (iOooOOO == -4) {
            if (decoderInputBuffer.OooO0o(4)) {
                this.f11050OooOOO = Long.MIN_VALUE;
                return this.f11052OooOOOO ? -4 : -3;
            }
            long j = decoderInputBuffer.f11677OooO0oo + this.f11051OooOOO0;
            decoderInputBuffer.f11677OooO0oo = j;
            this.f11050OooOOO = Math.max(this.f11050OooOOO, j);
        } else if (iOooOOO == -5) {
            OooOo oooOo = o00ooo0o.f39211OooO0O0;
            oooOo.getClass();
            if (oooOo.f11215OooOOoo != LongCompanionObject.MAX_VALUE) {
                OooOo.OooO00o OooO00o2 = oooOo.OooO00o();
                OooO00o2.f11248OooOOOO = oooOo.f11215OooOOoo + this.f11051OooOOO0;
                o00ooo0o.f39211OooO0O0 = OooO00o2.OooO00o();
            }
        }
        return iOooOOO;
    }

    public void Oooo000() throws ExoPlaybackException {
    }

    public void Oooo00O() {
    }

    public abstract void Oooo00o(OooOo[] oooOoArr, long j, long j2) throws ExoPlaybackException;

    @Override // com.google.android.exoplayer2.Renderer
    public final int getState() {
        return this.f11047OooOO0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void release() {
        o00O000o.OooO0Oo(this.f11047OooOO0 == 0);
        OooOooO();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void reset() {
        o00O000o.OooO0Oo(this.f11047OooOO0 == 0);
        this.f11043OooO0o.OooO00o();
        OooOooo();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void start() throws ExoPlaybackException {
        o00O000o.OooO0Oo(this.f11047OooOO0 == 1);
        this.f11047OooOO0 = 2;
        Oooo000();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void stop() {
        o00O000o.OooO0Oo(this.f11047OooOO0 == 2);
        this.f11047OooOO0 = 1;
        Oooo00O();
    }
}
