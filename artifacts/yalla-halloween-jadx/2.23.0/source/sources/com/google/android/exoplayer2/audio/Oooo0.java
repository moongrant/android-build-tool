package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Oooo0 extends OooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f11662OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f11663OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f11664OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f11665OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f11666OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public byte[] f11667OooOOO0 = o0O00.f40599OooO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f11668OooOOOO;

    @Override // com.google.android.exoplayer2.audio.OooOO0
    public final void OooO() {
        this.f11667OooOOO0 = o0O00.f40599OooO0o;
    }

    @Override // com.google.android.exoplayer2.audio.OooOO0, com.google.android.exoplayer2.audio.AudioProcessor
    public final ByteBuffer OooO00o() {
        int i;
        if (super.OooO0Oo() && (i = this.f11666OooOOO) > 0) {
            OooOO0(i).put(this.f11667OooOOO0, 0, this.f11666OooOOO).flip();
            this.f11666OooOOO = 0;
        }
        return super.OooO00o();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO0O0(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f11665OooOO0o);
        this.f11668OooOOOO += (long) (iMin / this.f11612OooO0O0.f11447OooO0Oo);
        this.f11665OooOO0o -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f11665OooOO0o > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f11666OooOOO + i2) - this.f11667OooOOO0.length;
        ByteBuffer byteBufferOooOO0 = OooOO0(length);
        int iOooO = o0O00.OooO(length, 0, this.f11666OooOOO);
        byteBufferOooOO0.put(this.f11667OooOOO0, 0, iOooO);
        int iOooO2 = o0O00.OooO(length - iOooO, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iOooO2);
        byteBufferOooOO0.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iOooO2;
        int i4 = this.f11666OooOOO - iOooO;
        this.f11666OooOOO = i4;
        byte[] bArr = this.f11667OooOOO0;
        System.arraycopy(bArr, iOooO, bArr, 0, i4);
        byteBuffer.get(this.f11667OooOOO0, this.f11666OooOOO, i3);
        this.f11666OooOOO += i3;
        byteBufferOooOO0.flip();
    }

    @Override // com.google.android.exoplayer2.audio.OooOO0, com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean OooO0Oo() {
        return super.OooO0Oo() && this.f11666OooOOO == 0;
    }

    @Override // com.google.android.exoplayer2.audio.OooOO0
    public final AudioProcessor.OooO00o OooO0o(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        if (oooO00o.f11446OooO0OO != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
        }
        this.f11664OooOO0O = true;
        return (this.f11662OooO == 0 && this.f11663OooOO0 == 0) ? AudioProcessor.OooO00o.f11443OooO0o0 : oooO00o;
    }

    @Override // com.google.android.exoplayer2.audio.OooOO0
    public final void OooO0oO() {
        if (this.f11664OooOO0O) {
            this.f11664OooOO0O = false;
            int i = this.f11663OooOO0;
            int i2 = this.f11612OooO0O0.f11447OooO0Oo;
            this.f11667OooOOO0 = new byte[i * i2];
            this.f11665OooOO0o = this.f11662OooO * i2;
        }
        this.f11666OooOOO = 0;
    }

    @Override // com.google.android.exoplayer2.audio.OooOO0
    public final void OooO0oo() {
        if (this.f11664OooOO0O) {
            int i = this.f11666OooOOO;
            if (i > 0) {
                this.f11668OooOOOO += (long) (i / this.f11612OooO0O0.f11447OooO0Oo);
            }
            this.f11666OooOOO = 0;
        }
    }
}
