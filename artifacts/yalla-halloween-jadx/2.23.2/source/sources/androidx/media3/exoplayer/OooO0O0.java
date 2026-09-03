package androidx.media3.exoplayer;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.SampleStream;
import java.io.IOException;
import kotlin.jvm.internal.LongCompanionObject;
import o000O0.o0oOO;
import o000O00O.o00O000;
import o000O00O.o00O0000;
import o000O00O.o00OO000;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class OooO0O0 implements Renderer, RendererCapabilities {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o0oOO f7195OooO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f7198OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o00OO000 f7199OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f7200OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f7201OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public SampleStream f7202OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public androidx.media3.common.OooOO0[] f7203OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f7205OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f7206OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f7207OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public RendererCapabilities.OooO00o f7208OooOOo0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f7196OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00O0000 f7197OooO0o = new o00O0000();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f7204OooOOO = Long.MIN_VALUE;

    public OooO0O0(int i) {
        this.f7198OooO0o0 = i;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void OooO() {
        this.f7206OooOOOO = true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void OooO0o() {
        o00Oo0.OooO0Oo(this.f7201OooOO0 == 1);
        this.f7197OooO0o.OooO00o();
        this.f7201OooOO0 = 0;
        this.f7202OooOO0O = null;
        this.f7203OooOO0o = null;
        this.f7206OooOOOO = false;
        OooOoOO();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean OooO0o0() {
        return OooO0oo();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void OooO0oO(int i, o0oOO o0ooo2) {
        this.f7200OooO0oo = i;
        this.f7195OooO = o0ooo2;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean OooO0oo() {
        return this.f7204OooOOO == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void OooOO0(androidx.media3.common.OooOO0[] oooOO0Arr, SampleStream sampleStream, long j, long j2) throws ExoPlaybackException {
        o00Oo0.OooO0Oo(!this.f7206OooOOOO);
        this.f7202OooOO0O = sampleStream;
        if (this.f7204OooOOO == Long.MIN_VALUE) {
            this.f7204OooOOO = j;
        }
        this.f7203OooOO0o = oooOO0Arr;
        this.f7205OooOOO0 = j2;
        Oooo00o(oooOO0Arr, j, j2);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void OooOO0O(o00OO000 o00oo001, androidx.media3.common.OooOO0[] oooOO0Arr, SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException {
        o00Oo0.OooO0Oo(this.f7201OooOO0 == 0);
        this.f7199OooO0oO = o00oo001;
        this.f7201OooOO0 = 1;
        OooOoo0(z, z2);
        OooOO0(oooOO0Arr, sampleStream, j2, j3);
        this.f7206OooOOOO = false;
        this.f7204OooOOO = j;
        OooOoo(j, z);
    }

    @Override // androidx.media3.exoplayer.OooOOO.OooO0O0
    public void OooOO0o(int i, @Nullable Object obj) throws ExoPlaybackException {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean OooOOO() {
        return this.f7206OooOOOO;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void OooOOO0() throws IOException {
        SampleStream sampleStream = this.f7202OooOO0O;
        sampleStream.getClass();
        sampleStream.OooO00o();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final int OooOOOO() {
        return this.f7198OooO0o0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final OooO0O0 OooOOOo() {
        return this;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public /* synthetic */ void OooOOo(float f, float f2) {
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int OooOOoo() throws ExoPlaybackException {
        return 0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    @Nullable
    public o00O000 OooOo() {
        return null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    @Nullable
    public final SampleStream OooOo0() {
        return this.f7202OooOO0O;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final long OooOo0O() {
        return this.f7204OooOOO;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void OooOo0o(long j) throws ExoPlaybackException {
        this.f7206OooOOOO = false;
        this.f7204OooOOO = j;
        OooOoo(j, false);
    }

    public final ExoPlaybackException OooOoO(MediaCodecUtil.DecoderQueryException decoderQueryException, @Nullable androidx.media3.common.OooOO0 oooOO1) {
        return OooOoO0(4002, oooOO1, decoderQueryException, false);
    }

    public final ExoPlaybackException OooOoO0(int i, @Nullable androidx.media3.common.OooOO0 oooOO1, Exception exc, boolean z) {
        int iOooO0OO;
        if (oooOO1 == null || this.f7207OooOOOo) {
            iOooO0OO = 4;
        } else {
            this.f7207OooOOOo = true;
            try {
                iOooO0OO = OooO0OO(oooOO1) & 7;
                this.f7207OooOOOo = false;
            } catch (ExoPlaybackException unused) {
                this.f7207OooOOOo = false;
                iOooO0OO = 4;
            } catch (Throwable th) {
                this.f7207OooOOOo = false;
                throw th;
            }
        }
        return new ExoPlaybackException(1, exc, i, getName(), this.f7200OooO0oo, oooOO1, oooOO1 == null ? 4 : iOooO0OO, z);
    }

    public abstract void OooOoOO();

    public abstract void OooOoo(long j, boolean z) throws ExoPlaybackException;

    public void OooOoo0(boolean z, boolean z2) throws ExoPlaybackException {
    }

    public void OooOooO() {
    }

    public void OooOooo() {
    }

    public final int Oooo0(o00O0000 o00o0001, DecoderInputBuffer decoderInputBuffer, int i) {
        SampleStream sampleStream = this.f7202OooOO0O;
        sampleStream.getClass();
        int iOooO0O0 = sampleStream.OooO0O0(o00o0001, decoderInputBuffer, i);
        if (iOooO0O0 == -4) {
            if (decoderInputBuffer.OooO0o(4)) {
                this.f7204OooOOO = Long.MIN_VALUE;
                return this.f7206OooOOOO ? -4 : -3;
            }
            long j = decoderInputBuffer.f7087OooO0oo + this.f7205OooOOO0;
            decoderInputBuffer.f7087OooO0oo = j;
            this.f7204OooOOO = Math.max(this.f7204OooOOO, j);
        } else if (iOooO0O0 == -5) {
            androidx.media3.common.OooOO0 oooOO1 = o00o0001.f34055OooO0O0;
            oooOO1.getClass();
            if (oooOO1.f6416OooOOoo != LongCompanionObject.MAX_VALUE) {
                androidx.media3.common.OooOO0.OooO00o oooO00oOooO0OO = oooOO1.OooO0OO();
                oooO00oOooO0OO.f6449OooOOOO = oooOO1.f6416OooOOoo + this.f7205OooOOO0;
                o00o0001.f34055OooO0O0 = oooO00oOooO0OO.OooO00o();
            }
        }
        return iOooO0O0;
    }

    public void Oooo000() throws ExoPlaybackException {
    }

    public void Oooo00O() {
    }

    public abstract void Oooo00o(androidx.media3.common.OooOO0[] oooOO0Arr, long j, long j2) throws ExoPlaybackException;

    @Override // androidx.media3.exoplayer.Renderer
    public final int getState() {
        return this.f7201OooOO0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void release() {
        o00Oo0.OooO0Oo(this.f7201OooOO0 == 0);
        OooOooO();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void reset() {
        o00Oo0.OooO0Oo(this.f7201OooOO0 == 0);
        this.f7197OooO0o.OooO00o();
        OooOooo();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void start() throws ExoPlaybackException {
        o00Oo0.OooO0Oo(this.f7201OooOO0 == 1);
        this.f7201OooOO0 = 2;
        Oooo000();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void stop() {
        o00Oo0.OooO0Oo(this.f7201OooOO0 == 2);
        this.f7201OooOO0 = 1;
        Oooo00O();
    }
}
