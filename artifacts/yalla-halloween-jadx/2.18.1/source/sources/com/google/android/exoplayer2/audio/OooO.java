package com.google.android.exoplayer2.audio;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final int f13551OooO = Float.floatToIntBits(Float.NaN);

    public static void OooOO0o(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f13551OooO) {
            iFloatToIntBits = Float.floatToIntBits(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO0OO(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOooOO0O;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f13586OooO0O0.f13476OooO0OO;
        if (i2 == 536870912) {
            byteBufferOooOO0O = OooOO0O((i / 3) * 4);
            while (iPosition < iLimit) {
                OooOO0o(((byteBuffer.get(iPosition) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 2) & UByte.MAX_VALUE) << 24), byteBufferOooOO0O);
                iPosition += 3;
            }
        } else {
            if (i2 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferOooOO0O = OooOO0O(i);
            while (iPosition < iLimit) {
                OooOO0o((byteBuffer.get(iPosition) & UByte.MAX_VALUE) | ((byteBuffer.get(iPosition + 1) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 2) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 3) & UByte.MAX_VALUE) << 24), byteBufferOooOO0O);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferOooOO0O.flip();
    }

    @Override // com.google.android.exoplayer2.audio.OooO0OO
    public final AudioProcessor.OooO00o OooO0oO(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        int i = oooO00o.f13476OooO0OO;
        if (i == 536870912 || i == 805306368 || i == 4) {
            return i != 4 ? new AudioProcessor.OooO00o(oooO00o.f13474OooO00o, oooO00o.f13475OooO0O0, 4) : AudioProcessor.OooO00o.f13473OooO0o0;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
    }
}
