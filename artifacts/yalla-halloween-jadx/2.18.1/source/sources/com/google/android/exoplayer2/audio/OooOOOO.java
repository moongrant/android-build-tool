package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f13633OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f13634OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f13635OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f13636OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f13637OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public byte[] f13638OooOOO0 = o000OOo0.f36744OooO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f13639OooOOOO;

    @Override // com.google.android.exoplayer2.audio.OooO0OO
    public final void OooO() {
        if (this.f13635OooOO0O) {
            int i = this.f13637OooOOO;
            if (i > 0) {
                this.f13639OooOOOO += (long) (i / this.f13586OooO0O0.f13477OooO0Oo);
            }
            this.f13637OooOOO = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.OooO0OO, com.google.android.exoplayer2.audio.AudioProcessor
    public final ByteBuffer OooO0O0() {
        int i;
        if (super.OooO0Oo() && (i = this.f13637OooOOO) > 0) {
            OooOO0O(i).put(this.f13638OooOOO0, 0, this.f13637OooOOO).flip();
            this.f13637OooOOO = 0;
        }
        return super.OooO0O0();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO0OO(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f13636OooOO0o);
        this.f13639OooOOOO += (long) (iMin / this.f13586OooO0O0.f13477OooO0Oo);
        this.f13636OooOO0o -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f13636OooOO0o > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f13637OooOOO + i2) - this.f13638OooOOO0.length;
        ByteBuffer byteBufferOooOO0O = OooOO0O(length);
        int iOooO0oo = o000OOo0.OooO0oo(length, 0, this.f13637OooOOO);
        byteBufferOooOO0O.put(this.f13638OooOOO0, 0, iOooO0oo);
        int iOooO0oo2 = o000OOo0.OooO0oo(length - iOooO0oo, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iOooO0oo2);
        byteBufferOooOO0O.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iOooO0oo2;
        int i4 = this.f13637OooOOO - iOooO0oo;
        this.f13637OooOOO = i4;
        byte[] bArr = this.f13638OooOOO0;
        System.arraycopy(bArr, iOooO0oo, bArr, 0, i4);
        byteBuffer.get(this.f13638OooOOO0, this.f13637OooOOO, i3);
        this.f13637OooOOO += i3;
        byteBufferOooOO0O.flip();
    }

    @Override // com.google.android.exoplayer2.audio.OooO0OO, com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean OooO0Oo() {
        return super.OooO0Oo() && this.f13637OooOOO == 0;
    }

    @Override // com.google.android.exoplayer2.audio.OooO0OO
    public final AudioProcessor.OooO00o OooO0oO(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        if (oooO00o.f13476OooO0OO != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
        }
        this.f13635OooOO0O = true;
        return (this.f13633OooO == 0 && this.f13634OooOO0 == 0) ? AudioProcessor.OooO00o.f13473OooO0o0 : oooO00o;
    }

    @Override // com.google.android.exoplayer2.audio.OooO0OO
    public final void OooO0oo() {
        if (this.f13635OooOO0O) {
            this.f13635OooOO0O = false;
            int i = this.f13634OooOO0;
            int i2 = this.f13586OooO0O0.f13477OooO0Oo;
            this.f13638OooOOO0 = new byte[i * i2];
            this.f13636OooOO0o = this.f13633OooO * i2;
        }
        this.f13637OooOOO = 0;
    }

    @Override // com.google.android.exoplayer2.audio.OooO0OO
    public final void OooOO0() {
        this.f13638OooOOO0 = o000OOo0.f36744OooO0o;
    }
}
