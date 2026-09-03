package o000O0Oo;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo extends androidx.media3.common.audio.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f34294OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f34295OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f34296OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f34297OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f34298OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public byte[] f34299OooOOO0 = o00.f34914OooO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f34300OooOOOO;

    @Override // androidx.media3.common.audio.OooO0O0
    public final AudioProcessor.OooO00o OooO00o(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        if (oooO00o.f6734OooO0OO != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
        }
        this.f34296OooOO0O = true;
        return (this.f34294OooO == 0 && this.f34295OooOO0 == 0) ? AudioProcessor.OooO00o.f6731OooO0o0 : oooO00o;
    }

    @Override // androidx.media3.common.audio.OooO0O0
    public final void OooO0O0() {
        if (this.f34296OooOO0O) {
            this.f34296OooOO0O = false;
            int i = this.f34295OooOO0;
            int i2 = this.f6740OooO0O0.f6735OooO0Oo;
            this.f34299OooOOO0 = new byte[i * i2];
            this.f34297OooOO0o = this.f34294OooO * i2;
        }
        this.f34298OooOOO = 0;
    }

    @Override // androidx.media3.common.audio.OooO0O0
    public final void OooO0OO() {
        if (this.f34296OooOO0O) {
            int i = this.f34298OooOOO;
            if (i > 0) {
                this.f34300OooOOOO += (long) (i / this.f6740OooO0O0.f6735OooO0Oo);
            }
            this.f34298OooOOO = 0;
        }
    }

    @Override // androidx.media3.common.audio.OooO0O0
    public final void OooO0Oo() {
        this.f34299OooOOO0 = o00.f34914OooO0o;
    }

    @Override // androidx.media3.common.audio.OooO0O0, androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer OooO0o() {
        int i;
        if (super.OooO0o0() && (i = this.f34298OooOOO) > 0) {
            OooOO0(i).put(this.f34299OooOOO0, 0, this.f34298OooOOO).flip();
            this.f34298OooOOO = 0;
        }
        return super.OooO0o();
    }

    @Override // androidx.media3.common.audio.OooO0O0, androidx.media3.common.audio.AudioProcessor
    public final boolean OooO0o0() {
        return super.OooO0o0() && this.f34298OooOOO == 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void OooO0oO(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f34297OooOO0o);
        this.f34300OooOOOO += (long) (iMin / this.f6740OooO0O0.f6735OooO0Oo);
        this.f34297OooOO0o -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f34297OooOO0o > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f34298OooOOO + i2) - this.f34299OooOOO0.length;
        ByteBuffer byteBufferOooOO0 = OooOO0(length);
        int iOooO = o00.OooO(length, 0, this.f34298OooOOO);
        byteBufferOooOO0.put(this.f34299OooOOO0, 0, iOooO);
        int iOooO2 = o00.OooO(length - iOooO, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iOooO2);
        byteBufferOooOO0.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iOooO2;
        int i4 = this.f34298OooOOO - iOooO;
        this.f34298OooOOO = i4;
        byte[] bArr = this.f34299OooOOO0;
        System.arraycopy(bArr, iOooO, bArr, 0, i4);
        byteBuffer.get(this.f34299OooOOO0, this.f34298OooOOO, i3);
        this.f34298OooOOO += i3;
        byteBufferOooOO0.flip();
    }
}
