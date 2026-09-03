package com.google.android.exoplayer2.audio;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import kotlin.UByte;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Oooo000 extends OooOO0 {
    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO0O0(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f11612OooO0O0.f11446OooO0OO;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 == 4) {
            i /= 2;
        } else if (i2 != 268435456) {
            if (i2 != 536870912) {
                if (i2 != 805306368) {
                    throw new IllegalStateException();
                }
                i /= 2;
            } else {
                i /= 3;
                i *= 2;
            }
        }
        ByteBuffer byteBufferOooOO0 = OooOO0(i);
        int i3 = this.f11612OooO0O0.f11446OooO0OO;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferOooOO0.put((byte) 0);
                byteBufferOooOO0.put((byte) ((byteBuffer.get(iPosition) & UByte.MAX_VALUE) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sOooO0oo = (short) (o0O00.OooO0oo(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferOooOO0.put((byte) (sOooO0oo & 255));
                byteBufferOooOO0.put((byte) ((sOooO0oo >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferOooOO0.put(byteBuffer.get(iPosition + 1));
                byteBufferOooOO0.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferOooOO0.put(byteBuffer.get(iPosition + 1));
                byteBufferOooOO0.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferOooOO0.put(byteBuffer.get(iPosition + 2));
                byteBufferOooOO0.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferOooOO0.flip();
    }

    @Override // com.google.android.exoplayer2.audio.OooOO0
    @CanIgnoreReturnValue
    public final AudioProcessor.OooO00o OooO0o(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        int i = oooO00o.f11446OooO0OO;
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new AudioProcessor.OooO00o(oooO00o.f11444OooO00o, oooO00o.f11445OooO0O0, 2) : AudioProcessor.OooO00o.f11443OooO0o0;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
    }
}
