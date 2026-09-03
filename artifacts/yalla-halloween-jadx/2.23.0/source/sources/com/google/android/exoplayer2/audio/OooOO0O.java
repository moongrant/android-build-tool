package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOO0O extends OooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public int[] f11619OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public int[] f11620OooOO0;

    @Override // com.google.android.exoplayer2.audio.OooOO0
    public final void OooO() {
        this.f11620OooOO0 = null;
        this.f11619OooO = null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO0O0(ByteBuffer byteBuffer) {
        int[] iArr = this.f11620OooOO0;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferOooOO0 = OooOO0(((iLimit - iPosition) / this.f11612OooO0O0.f11447OooO0Oo) * this.f11613OooO0OO.f11447OooO0Oo);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferOooOO0.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f11612OooO0O0.f11447OooO0Oo;
        }
        byteBuffer.position(iLimit);
        byteBufferOooOO0.flip();
    }

    @Override // com.google.android.exoplayer2.audio.OooOO0
    @CanIgnoreReturnValue
    public final AudioProcessor.OooO00o OooO0o(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f11619OooO;
        if (iArr == null) {
            return AudioProcessor.OooO00o.f11443OooO0o0;
        }
        if (oooO00o.f11446OooO0OO != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
        }
        int length = iArr.length;
        int i = oooO00o.f11445OooO0O0;
        boolean z = i != length;
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            if (i3 >= i) {
                throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
            }
            z |= i3 != i2;
            i2++;
        }
        return z ? new AudioProcessor.OooO00o(oooO00o.f11444OooO00o, iArr.length, 2) : AudioProcessor.OooO00o.f11443OooO0o0;
    }

    @Override // com.google.android.exoplayer2.audio.OooOO0
    public final void OooO0oO() {
        this.f11620OooOO0 = this.f11619OooO;
    }
}
