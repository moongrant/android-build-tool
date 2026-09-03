package o000O0Oo;

import androidx.media3.common.audio.AudioProcessor;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O extends androidx.media3.common.audio.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final int f34274OooO = Float.floatToIntBits(Float.NaN);

    @Override // androidx.media3.common.audio.OooO0O0
    @CanIgnoreReturnValue
    public final AudioProcessor.OooO00o OooO00o(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        int i = oooO00o.f6734OooO0OO;
        if (i == 536870912 || i == 805306368 || i == 4) {
            return i != 4 ? new AudioProcessor.OooO00o(oooO00o.f6732OooO00o, oooO00o.f6733OooO0O0, 4) : AudioProcessor.OooO00o.f6731OooO0o0;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void OooO0oO(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOooOO0;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f6740OooO0O0.f6734OooO0OO;
        int i3 = f34274OooO;
        if (i2 == 536870912) {
            byteBufferOooOO0 = OooOO0((i / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits = Float.floatToIntBits((float) (((double) (((byteBuffer.get(iPosition) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 2) & UByte.MAX_VALUE) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits == i3) {
                    iFloatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBufferOooOO0.putInt(iFloatToIntBits);
                iPosition += 3;
            }
        } else {
            if (i2 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferOooOO0 = OooOO0(i);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((double) ((byteBuffer.get(iPosition) & UByte.MAX_VALUE) | ((byteBuffer.get(iPosition + 1) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 2) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 3) & UByte.MAX_VALUE) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == i3) {
                    iFloatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBufferOooOO0.putInt(iFloatToIntBits2);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferOooOO0.flip();
    }
}
