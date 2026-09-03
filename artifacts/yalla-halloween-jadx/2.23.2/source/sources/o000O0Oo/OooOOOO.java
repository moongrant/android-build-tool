package o000O0Oo;

import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioProcessor;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends androidx.media3.common.audio.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public int[] f34269OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public int[] f34270OooOO0;

    @Override // androidx.media3.common.audio.OooO0O0
    @CanIgnoreReturnValue
    public final AudioProcessor.OooO00o OooO00o(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f34269OooO;
        if (iArr == null) {
            return AudioProcessor.OooO00o.f6731OooO0o0;
        }
        if (oooO00o.f6734OooO0OO != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
        }
        int length = iArr.length;
        int i = oooO00o.f6733OooO0O0;
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
        return z ? new AudioProcessor.OooO00o(oooO00o.f6732OooO00o, iArr.length, 2) : AudioProcessor.OooO00o.f6731OooO0o0;
    }

    @Override // androidx.media3.common.audio.OooO0O0
    public final void OooO0O0() {
        this.f34270OooOO0 = this.f34269OooO;
    }

    @Override // androidx.media3.common.audio.OooO0O0
    public final void OooO0Oo() {
        this.f34270OooOO0 = null;
        this.f34269OooO = null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void OooO0oO(ByteBuffer byteBuffer) {
        int[] iArr = this.f34270OooOO0;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferOooOO0 = OooOO0(((iLimit - iPosition) / this.f6740OooO0O0.f6735OooO0Oo) * this.f6741OooO0OO.f6735OooO0Oo);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferOooOO0.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f6740OooO0O0.f6735OooO0Oo;
        }
        byteBuffer.position(iLimit);
        byteBufferOooOO0.flip();
    }
}
