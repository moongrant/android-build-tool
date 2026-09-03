package com.google.android.exoplayer2.audio;

import androidx.annotation.CallSuper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0OO implements AudioProcessor {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public AudioProcessor.OooO00o f13586OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AudioProcessor.OooO00o f13587OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public AudioProcessor.OooO00o f13588OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ByteBuffer f13589OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public AudioProcessor.OooO00o f13590OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ByteBuffer f13591OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f13592OooO0oo;

    public OooO0OO() {
        ByteBuffer byteBuffer = AudioProcessor.f13472OooO00o;
        this.f13589OooO0o = byteBuffer;
        this.f13591OooO0oO = byteBuffer;
        AudioProcessor.OooO00o oooO00o = AudioProcessor.OooO00o.f13473OooO0o0;
        this.f13588OooO0Oo = oooO00o;
        this.f13590OooO0o0 = oooO00o;
        this.f13586OooO0O0 = oooO00o;
        this.f13587OooO0OO = oooO00o;
    }

    public void OooO() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO00o() {
        flush();
        this.f13589OooO0o = AudioProcessor.f13472OooO00o;
        AudioProcessor.OooO00o oooO00o = AudioProcessor.OooO00o.f13473OooO0o0;
        this.f13588OooO0Oo = oooO00o;
        this.f13590OooO0o0 = oooO00o;
        this.f13586OooO0O0 = oooO00o;
        this.f13587OooO0OO = oooO00o;
        OooOO0();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    public ByteBuffer OooO0O0() {
        ByteBuffer byteBuffer = this.f13591OooO0oO;
        this.f13591OooO0oO = AudioProcessor.f13472OooO00o;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    public boolean OooO0Oo() {
        return this.f13592OooO0oo && this.f13591OooO0oO == AudioProcessor.f13472OooO00o;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO0o() {
        this.f13592OooO0oo = true;
        OooO();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.OooO00o OooO0o0(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        this.f13588OooO0Oo = oooO00o;
        this.f13590OooO0o0 = OooO0oO(oooO00o);
        return isActive() ? this.f13590OooO0o0 : AudioProcessor.OooO00o.f13473OooO0o0;
    }

    public abstract AudioProcessor.OooO00o OooO0oO(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException;

    public void OooO0oo() {
    }

    public void OooOO0() {
    }

    public final ByteBuffer OooOO0O(int i) {
        if (this.f13589OooO0o.capacity() < i) {
            this.f13589OooO0o = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f13589OooO0o.clear();
        }
        ByteBuffer byteBuffer = this.f13589OooO0o;
        this.f13591OooO0oO = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f13591OooO0oO = AudioProcessor.f13472OooO00o;
        this.f13592OooO0oo = false;
        this.f13586OooO0O0 = this.f13588OooO0Oo;
        this.f13587OooO0OO = this.f13590OooO0o0;
        OooO0oo();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f13590OooO0o0 != AudioProcessor.OooO00o.f13473OooO0o0;
    }
}
