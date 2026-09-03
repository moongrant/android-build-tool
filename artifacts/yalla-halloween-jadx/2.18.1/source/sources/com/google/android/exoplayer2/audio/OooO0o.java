package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public int[] f13593OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public int[] f13594OooOO0;

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO0OO(ByteBuffer byteBuffer) {
        int[] iArr = this.f13594OooOO0;
        Objects.requireNonNull(iArr);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferOooOO0O = OooOO0O(((iLimit - iPosition) / this.f13586OooO0O0.f13477OooO0Oo) * this.f13587OooO0OO.f13477OooO0Oo);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferOooOO0O.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f13586OooO0O0.f13477OooO0Oo;
        }
        byteBuffer.position(iLimit);
        byteBufferOooOO0O.flip();
    }

    @Override // com.google.android.exoplayer2.audio.OooO0OO
    public final AudioProcessor.OooO00o OooO0oO(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f13593OooO;
        if (iArr == null) {
            return AudioProcessor.OooO00o.f13473OooO0o0;
        }
        if (oooO00o.f13476OooO0OO != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
        }
        boolean z = oooO00o.f13475OooO0O0 != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= oooO00o.f13475OooO0O0) {
                throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
            }
            z |= i2 != i;
            i++;
        }
        return z ? new AudioProcessor.OooO00o(oooO00o.f13474OooO00o, iArr.length, 2) : AudioProcessor.OooO00o.f13473OooO0o0;
    }

    @Override // com.google.android.exoplayer2.audio.OooO0OO
    public final void OooO0oo() {
        this.f13594OooOO0 = this.f13593OooO;
    }

    @Override // com.google.android.exoplayer2.audio.OooO0OO
    public final void OooOO0() {
        this.f13594OooOO0 = null;
        this.f13593OooO = null;
    }
}
