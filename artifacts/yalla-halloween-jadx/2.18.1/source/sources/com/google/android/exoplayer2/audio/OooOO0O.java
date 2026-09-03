package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import kotlin.KotlinVersion;
import kotlin.UByte;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends OooO0OO {
    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO0OO(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f13586OooO0O0.f13476OooO0OO;
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
        ByteBuffer byteBufferOooOO0O = OooOO0O(i);
        int i3 = this.f13586OooO0O0.f13476OooO0OO;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferOooOO0O.put((byte) 0);
                byteBufferOooOO0O.put((byte) ((byteBuffer.get(iPosition) & UByte.MAX_VALUE) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sOooO0oO = (short) (o000OOo0.OooO0oO(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferOooOO0O.put((byte) (sOooO0oO & 255));
                byteBufferOooOO0O.put((byte) ((sOooO0oO >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferOooOO0O.put(byteBuffer.get(iPosition + 1));
                byteBufferOooOO0O.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferOooOO0O.put(byteBuffer.get(iPosition + 1));
                byteBufferOooOO0O.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferOooOO0O.put(byteBuffer.get(iPosition + 2));
                byteBufferOooOO0O.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferOooOO0O.flip();
    }

    @Override // com.google.android.exoplayer2.audio.OooO0OO
    public final AudioProcessor.OooO00o OooO0oO(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        int i = oooO00o.f13476OooO0OO;
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new AudioProcessor.OooO00o(oooO00o.f13474OooO00o, oooO00o.f13475OooO0O0, 2) : AudioProcessor.OooO00o.f13473OooO0o0;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
    }
}
