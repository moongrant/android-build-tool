package o000O0Oo;

import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0Oo0oo extends androidx.media3.common.audio.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f34280OooO = 150000;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f34281OooOO0 = 20000;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final short f34282OooOO0O = 1024;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f34283OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public byte[] f34284OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f34285OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public byte[] f34286OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f34287OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f34288OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f34289OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f34290OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f34291OooOo00;

    public o0Oo0oo() {
        byte[] bArr = o00.f34914OooO0o;
        this.f34284OooOOO = bArr;
        this.f34286OooOOOO = bArr;
    }

    @Override // androidx.media3.common.audio.OooO0O0
    @CanIgnoreReturnValue
    public final AudioProcessor.OooO00o OooO00o(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        if (oooO00o.f6734OooO0OO == 2) {
            return this.f34285OooOOO0 ? oooO00o : AudioProcessor.OooO00o.f6731OooO0o0;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
    }

    @Override // androidx.media3.common.audio.OooO0O0
    public final void OooO0O0() {
        if (this.f34285OooOOO0) {
            AudioProcessor.OooO00o oooO00o = this.f6740OooO0O0;
            int i = oooO00o.f6735OooO0Oo;
            this.f34283OooOO0o = i;
            int i2 = oooO00o.f6732OooO00o;
            int i3 = ((int) ((this.f34280OooO * ((long) i2)) / AnimationKt.MillisToNanos)) * i;
            if (this.f34284OooOOO.length != i3) {
                this.f34284OooOOO = new byte[i3];
            }
            int i4 = ((int) ((this.f34281OooOO0 * ((long) i2)) / AnimationKt.MillisToNanos)) * i;
            this.f34288OooOOo = i4;
            if (this.f34286OooOOOO.length != i4) {
                this.f34286OooOOOO = new byte[i4];
            }
        }
        this.f34287OooOOOo = 0;
        this.f34291OooOo00 = 0L;
        this.f34289OooOOo0 = 0;
        this.f34290OooOOoo = false;
    }

    @Override // androidx.media3.common.audio.OooO0O0
    public final void OooO0OO() {
        int i = this.f34289OooOOo0;
        if (i > 0) {
            OooOO0o(i, this.f34284OooOOO);
        }
        if (this.f34290OooOOoo) {
            return;
        }
        this.f34291OooOo00 += (long) (this.f34288OooOOo / this.f34283OooOO0o);
    }

    @Override // androidx.media3.common.audio.OooO0O0
    public final void OooO0Oo() {
        this.f34285OooOOO0 = false;
        this.f34288OooOOo = 0;
        byte[] bArr = o00.f34914OooO0o;
        this.f34284OooOOO = bArr;
        this.f34286OooOOOO = bArr;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void OooO0oO(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f6745OooO0oO.hasRemaining()) {
            int i = this.f34287OooOOOo;
            if (i == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f34284OooOOO.length));
                int iLimit2 = byteBuffer.limit();
                while (true) {
                    iLimit2 -= 2;
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.f34282OooOO0O) {
                        int i2 = this.f34283OooOO0o;
                        iPosition = ((iLimit2 / i2) * i2) + i2;
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f34287OooOOOo = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    OooOO0(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f34290OooOOoo = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i == 1) {
                int iLimit3 = byteBuffer.limit();
                int iOooOO0O = OooOO0O(byteBuffer);
                int iPosition2 = iOooOO0O - byteBuffer.position();
                byte[] bArr = this.f34284OooOOO;
                int length = bArr.length;
                int i3 = this.f34289OooOOo0;
                int i4 = length - i3;
                if (iOooOO0O >= iLimit3 || iPosition2 >= i4) {
                    int iMin = Math.min(iPosition2, i4);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f34284OooOOO, this.f34289OooOOo0, iMin);
                    int i5 = this.f34289OooOOo0 + iMin;
                    this.f34289OooOOo0 = i5;
                    byte[] bArr2 = this.f34284OooOOO;
                    if (i5 == bArr2.length) {
                        if (this.f34290OooOOoo) {
                            OooOO0o(this.f34288OooOOo, bArr2);
                            this.f34291OooOo00 += (long) ((this.f34289OooOOo0 - (this.f34288OooOOo * 2)) / this.f34283OooOO0o);
                        } else {
                            this.f34291OooOo00 += (long) ((i5 - this.f34288OooOOo) / this.f34283OooOO0o);
                        }
                        OooOOO0(byteBuffer, this.f34284OooOOO, this.f34289OooOOo0);
                        this.f34289OooOOo0 = 0;
                        this.f34287OooOOOo = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    OooOO0o(i3, bArr);
                    this.f34289OooOOo0 = 0;
                    this.f34287OooOOOo = 0;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iOooOO0O2 = OooOO0O(byteBuffer);
                byteBuffer.limit(iOooOO0O2);
                this.f34291OooOo00 += (long) (byteBuffer.remaining() / this.f34283OooOO0o);
                OooOOO0(byteBuffer, this.f34286OooOOOO, this.f34288OooOOo);
                if (iOooOO0O2 < iLimit4) {
                    OooOO0o(this.f34288OooOOo, this.f34286OooOOOO);
                    this.f34287OooOOOo = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }

    public final int OooOO0O(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f34282OooOO0O) {
                int i = this.f34283OooOO0o;
                return (iPosition / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    public final void OooOO0o(int i, byte[] bArr) {
        OooOO0(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f34290OooOOoo = true;
        }
    }

    public final void OooOOO0(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.f34288OooOOo);
        int i2 = this.f34288OooOOo - iMin;
        System.arraycopy(bArr, i - i2, this.f34286OooOOOO, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f34286OooOOOO, i2, iMin);
    }

    @Override // androidx.media3.common.audio.OooO0O0, androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        return this.f34285OooOOO0;
    }
}
