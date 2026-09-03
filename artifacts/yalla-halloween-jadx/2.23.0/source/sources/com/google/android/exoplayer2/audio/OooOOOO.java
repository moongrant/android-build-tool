package com.google.android.exoplayer2.audio;

import androidx.compose.animation.core.AnimationKt;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOOOO extends OooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f11634OooO = 150000;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f11635OooOO0 = 20000;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final short f11636OooOO0O = 1024;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f11637OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public byte[] f11638OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f11639OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public byte[] f11640OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f11641OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f11642OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f11643OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f11644OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f11645OooOo00;

    public OooOOOO() {
        byte[] bArr = o0O00.f40599OooO0o;
        this.f11638OooOOO = bArr;
        this.f11640OooOOOO = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.OooOO0
    public final void OooO() {
        this.f11639OooOOO0 = false;
        this.f11642OooOOo = 0;
        byte[] bArr = o0O00.f40599OooO0o;
        this.f11638OooOOO = bArr;
        this.f11640OooOOOO = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO0O0(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f11617OooO0oO.hasRemaining()) {
            int i = this.f11641OooOOOo;
            if (i == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f11638OooOOO.length));
                int iLimit2 = byteBuffer.limit();
                while (true) {
                    iLimit2 -= 2;
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.f11636OooOO0O) {
                        int i2 = this.f11637OooOO0o;
                        iPosition = ((iLimit2 / i2) * i2) + i2;
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f11641OooOOOo = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    OooOO0(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f11644OooOOoo = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i == 1) {
                int iLimit3 = byteBuffer.limit();
                int iOooOO0O = OooOO0O(byteBuffer);
                int iPosition2 = iOooOO0O - byteBuffer.position();
                byte[] bArr = this.f11638OooOOO;
                int length = bArr.length;
                int i3 = this.f11643OooOOo0;
                int i4 = length - i3;
                if (iOooOO0O >= iLimit3 || iPosition2 >= i4) {
                    int iMin = Math.min(iPosition2, i4);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f11638OooOOO, this.f11643OooOOo0, iMin);
                    int i5 = this.f11643OooOOo0 + iMin;
                    this.f11643OooOOo0 = i5;
                    byte[] bArr2 = this.f11638OooOOO;
                    if (i5 == bArr2.length) {
                        if (this.f11644OooOOoo) {
                            OooOO0o(this.f11642OooOOo, bArr2);
                            this.f11645OooOo00 += (long) ((this.f11643OooOOo0 - (this.f11642OooOOo * 2)) / this.f11637OooOO0o);
                        } else {
                            this.f11645OooOo00 += (long) ((i5 - this.f11642OooOOo) / this.f11637OooOO0o);
                        }
                        OooOOO0(byteBuffer, this.f11638OooOOO, this.f11643OooOOo0);
                        this.f11643OooOOo0 = 0;
                        this.f11641OooOOOo = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    OooOO0o(i3, bArr);
                    this.f11643OooOOo0 = 0;
                    this.f11641OooOOOo = 0;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iOooOO0O2 = OooOO0O(byteBuffer);
                byteBuffer.limit(iOooOO0O2);
                this.f11645OooOo00 += (long) (byteBuffer.remaining() / this.f11637OooOO0o);
                OooOOO0(byteBuffer, this.f11640OooOOOO, this.f11642OooOOo);
                if (iOooOO0O2 < iLimit4) {
                    OooOO0o(this.f11642OooOOo, this.f11640OooOOOO);
                    this.f11641OooOOOo = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.OooOO0
    @CanIgnoreReturnValue
    public final AudioProcessor.OooO00o OooO0o(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        if (oooO00o.f11446OooO0OO == 2) {
            return this.f11639OooOOO0 ? oooO00o : AudioProcessor.OooO00o.f11443OooO0o0;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
    }

    @Override // com.google.android.exoplayer2.audio.OooOO0
    public final void OooO0oO() {
        if (this.f11639OooOOO0) {
            AudioProcessor.OooO00o oooO00o = this.f11612OooO0O0;
            int i = oooO00o.f11447OooO0Oo;
            this.f11637OooOO0o = i;
            int i2 = oooO00o.f11444OooO00o;
            int i3 = ((int) ((this.f11634OooO * ((long) i2)) / AnimationKt.MillisToNanos)) * i;
            if (this.f11638OooOOO.length != i3) {
                this.f11638OooOOO = new byte[i3];
            }
            int i4 = ((int) ((this.f11635OooOO0 * ((long) i2)) / AnimationKt.MillisToNanos)) * i;
            this.f11642OooOOo = i4;
            if (this.f11640OooOOOO.length != i4) {
                this.f11640OooOOOO = new byte[i4];
            }
        }
        this.f11641OooOOOo = 0;
        this.f11645OooOo00 = 0L;
        this.f11643OooOOo0 = 0;
        this.f11644OooOOoo = false;
    }

    @Override // com.google.android.exoplayer2.audio.OooOO0
    public final void OooO0oo() {
        int i = this.f11643OooOOo0;
        if (i > 0) {
            OooOO0o(i, this.f11638OooOOO);
        }
        if (this.f11644OooOOoo) {
            return;
        }
        this.f11645OooOo00 += (long) (this.f11642OooOOo / this.f11637OooOO0o);
    }

    public final int OooOO0O(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f11636OooOO0O) {
                int i = this.f11637OooOO0o;
                return (iPosition / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    public final void OooOO0o(int i, byte[] bArr) {
        OooOO0(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f11644OooOOoo = true;
        }
    }

    public final void OooOOO0(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.f11642OooOOo);
        int i2 = this.f11642OooOOo - iMin;
        System.arraycopy(bArr, i - i2, this.f11640OooOOOO, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f11640OooOOOO, i2, iMin);
    }

    @Override // com.google.android.exoplayer2.audio.OooOO0, com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean isActive() {
        return this.f11639OooOOO0;
    }
}
