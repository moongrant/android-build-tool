package com.google.android.exoplayer2.audio;

import androidx.annotation.CallSuper;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class OooOO0 implements AudioProcessor {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public AudioProcessor.OooO00o f11612OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AudioProcessor.OooO00o f11613OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public AudioProcessor.OooO00o f11614OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ByteBuffer f11615OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public AudioProcessor.OooO00o f11616OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ByteBuffer f11617OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f11618OooO0oo;

    public OooOO0() {
        ByteBuffer byteBuffer = AudioProcessor.f11442OooO00o;
        this.f11615OooO0o = byteBuffer;
        this.f11617OooO0oO = byteBuffer;
        AudioProcessor.OooO00o oooO00o = AudioProcessor.OooO00o.f11443OooO0o0;
        this.f11614OooO0Oo = oooO00o;
        this.f11616OooO0o0 = oooO00o;
        this.f11612OooO0O0 = oooO00o;
        this.f11613OooO0OO = oooO00o;
    }

    public void OooO() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    public ByteBuffer OooO00o() {
        ByteBuffer byteBuffer = this.f11617OooO0oO;
        this.f11617OooO0oO = AudioProcessor.f11442OooO00o;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CanIgnoreReturnValue
    public final AudioProcessor.OooO00o OooO0OO(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        this.f11614OooO0Oo = oooO00o;
        this.f11616OooO0o0 = OooO0o(oooO00o);
        return isActive() ? this.f11616OooO0o0 : AudioProcessor.OooO00o.f11443OooO0o0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    public boolean OooO0Oo() {
        return this.f11618OooO0oo && this.f11617OooO0oO == AudioProcessor.f11442OooO00o;
    }

    @CanIgnoreReturnValue
    public abstract AudioProcessor.OooO00o OooO0o(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException;

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO0o0() {
        this.f11618OooO0oo = true;
        OooO0oo();
    }

    public void OooO0oO() {
    }

    public void OooO0oo() {
    }

    public final ByteBuffer OooOO0(int i) {
        if (this.f11615OooO0o.capacity() < i) {
            this.f11615OooO0o = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f11615OooO0o.clear();
        }
        ByteBuffer byteBuffer = this.f11615OooO0o;
        this.f11617OooO0oO = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f11617OooO0oO = AudioProcessor.f11442OooO00o;
        this.f11618OooO0oo = false;
        this.f11612OooO0O0 = this.f11614OooO0Oo;
        this.f11613OooO0OO = this.f11616OooO0o0;
        OooO0oO();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f11616OooO0o0 != AudioProcessor.OooO00o.f11443OooO0o0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f11615OooO0o = AudioProcessor.f11442OooO00o;
        AudioProcessor.OooO00o oooO00o = AudioProcessor.OooO00o.f11443OooO0o0;
        this.f11614OooO0Oo = oooO00o;
        this.f11616OooO0o0 = oooO00o;
        this.f11612OooO0O0 = oooO00o;
        this.f11613OooO0OO = oooO00o;
        OooO();
    }
}
