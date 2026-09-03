package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.source.SampleStream;
import java.io.IOException;
import java.util.Objects;
import p318o0O0oOo.o00000O0;
import p466o0OooO0.o0000O0O;
import p466o0OooO0.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0o implements Renderer, RendererCapabilities {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f13200Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f13201Oooo0o;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public o000O0Oo f13203Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public long f13204OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public SampleStream f13205OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f13206OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public Format[] f13207OoooO0O;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f13209OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f13210o000oOoO;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o0000O0O f13202Oooo0oO = new o0000O0O();

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public long f13208OoooOO0 = Long.MIN_VALUE;

    public OooO0o(int i) {
        this.f13201Oooo0o = i;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooO(o000O0Oo o000o0oo2, Format[] formatArr, SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException {
        o00000O0.OooO0Oo(this.f13206OoooO00 == 0);
        this.f13203Oooo0oo = o000o0oo2;
        this.f13206OoooO00 = 1;
        OooOoo0(z2);
        OooOO0(formatArr, sampleStream, j2, j3);
        OooOoo(j, z);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooO00o() {
        o00000O0.OooO0Oo(this.f13206OoooO00 == 0);
        this.f13202Oooo0oO.OooO00o();
        OooOooO();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooO0o() {
        o00000O0.OooO0Oo(this.f13206OoooO00 == 1);
        this.f13202Oooo0oO.OooO00o();
        this.f13206OoooO00 = 0;
        this.f13205OoooO0 = null;
        this.f13207OoooO0O = null;
        this.f13210o000oOoO = false;
        OooOoOO();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean OooO0oo() {
        return this.f13208OoooOO0 == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooOO0(Format[] formatArr, SampleStream sampleStream, long j, long j2) throws ExoPlaybackException {
        o00000O0.OooO0Oo(!this.f13210o000oOoO);
        this.f13205OoooO0 = sampleStream;
        this.f13208OoooOO0 = j2;
        this.f13207OoooO0O = formatArr;
        this.f13204OoooO = j2;
        Oooo00O(formatArr, j, j2);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooOO0O() {
        this.f13210o000oOoO = true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final RendererCapabilities OooOO0o() {
        return this;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int OooOOO() throws ExoPlaybackException {
        return 0;
    }

    @Override // com.google.android.exoplayer2.OooOo.OooO0O0
    public void OooOOOo(int i, @Nullable Object obj) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public /* synthetic */ void OooOOo(float f) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    public final SampleStream OooOOo0() {
        return this.f13205OoooO0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooOOoo() throws IOException {
        SampleStream sampleStream = this.f13205OoooO0;
        Objects.requireNonNull(sampleStream);
        sampleStream.OooO00o();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final int OooOo() {
        return this.f13201Oooo0o;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooOo0(long j) throws ExoPlaybackException {
        this.f13210o000oOoO = false;
        this.f13208OoooOO0 = j;
        OooOoo(j, false);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final long OooOo00() {
        return this.f13208OoooOO0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean OooOo0O() {
        return this.f13210o000oOoO;
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    public p318o0O0oOo.o0000O0O OooOo0o() {
        return null;
    }

    public final o0000O0O OooOoO() {
        this.f13202Oooo0oO.OooO00o();
        return this.f13202Oooo0oO;
    }

    public final ExoPlaybackException OooOoO0(Exception exc, @Nullable Format format) {
        int iOooO0OO;
        if (format == null || this.f13209OoooOOO) {
            iOooO0OO = 4;
        } else {
            this.f13209OoooOOO = true;
            try {
                iOooO0OO = ((MediaCodecRenderer) this).OooO0OO(format) & 7;
                this.f13209OoooOOO = false;
            } catch (ExoPlaybackException unused) {
                this.f13209OoooOOO = false;
                iOooO0OO = 4;
            } catch (Throwable th) {
                this.f13209OoooOOO = false;
                throw th;
            }
        }
        return new ExoPlaybackException(1, exc, getName(), this.f13200Oooo, format, format == null ? 4 : iOooO0OO, 0);
    }

    public abstract void OooOoOO();

    public abstract void OooOoo(long j, boolean z) throws ExoPlaybackException;

    public void OooOoo0(boolean z) throws ExoPlaybackException {
    }

    public void OooOooO() {
    }

    public void OooOooo() throws ExoPlaybackException {
    }

    public void Oooo000() {
    }

    public abstract void Oooo00O(Format[] formatArr, long j, long j2) throws ExoPlaybackException;

    public final int Oooo00o(o0000O0O o0000o0o2, DecoderInputBuffer decoderInputBuffer, boolean z) {
        SampleStream sampleStream = this.f13205OoooO0;
        Objects.requireNonNull(sampleStream);
        int iOooO0Oo = sampleStream.OooO0Oo(o0000o0o2, decoderInputBuffer, z);
        if (iOooO0Oo == -4) {
            if (decoderInputBuffer.isEndOfStream()) {
                this.f13208OoooOO0 = Long.MIN_VALUE;
                return this.f13210o000oOoO ? -4 : -3;
            }
            long j = decoderInputBuffer.f13640Oooo + this.f13204OoooO;
            decoderInputBuffer.f13640Oooo = j;
            this.f13208OoooOO0 = Math.max(this.f13208OoooOO0, j);
        } else if (iOooO0Oo == -5) {
            Format format = o0000o0o2.f40508OooO0O0;
            Objects.requireNonNull(format);
            if (format.f13135Ooooo00 != Long.MAX_VALUE) {
                Format.OooO0O0 oooO0O0OooO00o = format.OooO00o();
                oooO0O0OooO00o.f13167OooOOOO = format.f13135Ooooo00 + this.f13204OoooO;
                o0000o0o2.f40508OooO0O0 = oooO0O0OooO00o.OooO00o();
            }
        }
        return iOooO0Oo;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final int getState() {
        return this.f13206OoooO00;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void setIndex(int i) {
        this.f13200Oooo = i;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void start() throws ExoPlaybackException {
        o00000O0.OooO0Oo(this.f13206OoooO00 == 1);
        this.f13206OoooO00 = 2;
        OooOooo();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void stop() {
        o00000O0.OooO0Oo(this.f13206OoooO00 == 2);
        this.f13206OoooO00 = 1;
        Oooo000();
    }
}
