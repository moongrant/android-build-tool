package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f13621OooO = 150000;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f13622OooOO0 = 20000;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final short f13623OooOO0O = 1024;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f13624OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public byte[] f13625OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f13626OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public byte[] f13627OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f13628OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f13629OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f13630OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f13631OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f13632OooOo00;

    public OooOOO0() {
        byte[] bArr = o000OOo0.f36744OooO0o;
        this.f13625OooOOO = bArr;
        this.f13627OooOOOO = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.OooO0OO
    public final void OooO() {
        int i = this.f13630OooOOo0;
        if (i > 0) {
            OooOOO0(this.f13625OooOOO, i);
        }
        if (this.f13631OooOOoo) {
            return;
        }
        this.f13632OooOo00 += (long) (this.f13629OooOOo / this.f13624OooOO0o);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO0OO(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f13591OooO0oO.hasRemaining()) {
            int i = this.f13628OooOOOo;
            if (i == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f13625OooOOO.length));
                int iLimit2 = byteBuffer.limit();
                while (true) {
                    iLimit2 -= 2;
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.f13623OooOO0O) {
                        int i2 = this.f13624OooOO0o;
                        iPosition = ((iLimit2 / i2) * i2) + i2;
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f13628OooOOOo = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    OooOO0O(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f13631OooOOoo = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i == 1) {
                int iLimit3 = byteBuffer.limit();
                int iOooOO0o = OooOO0o(byteBuffer);
                int iPosition2 = iOooOO0o - byteBuffer.position();
                byte[] bArr = this.f13625OooOOO;
                int length = bArr.length;
                int i3 = this.f13630OooOOo0;
                int i4 = length - i3;
                if (iOooOO0o >= iLimit3 || iPosition2 >= i4) {
                    int iMin = Math.min(iPosition2, i4);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f13625OooOOO, this.f13630OooOOo0, iMin);
                    int i5 = this.f13630OooOOo0 + iMin;
                    this.f13630OooOOo0 = i5;
                    byte[] bArr2 = this.f13625OooOOO;
                    if (i5 == bArr2.length) {
                        if (this.f13631OooOOoo) {
                            OooOOO0(bArr2, this.f13629OooOOo);
                            this.f13632OooOo00 += (long) ((this.f13630OooOOo0 - (this.f13629OooOOo * 2)) / this.f13624OooOO0o);
                        } else {
                            this.f13632OooOo00 += (long) ((i5 - this.f13629OooOOo) / this.f13624OooOO0o);
                        }
                        OooOOO(byteBuffer, this.f13625OooOOO, this.f13630OooOOo0);
                        this.f13630OooOOo0 = 0;
                        this.f13628OooOOOo = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    OooOOO0(bArr, i3);
                    this.f13630OooOOo0 = 0;
                    this.f13628OooOOOo = 0;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iOooOO0o2 = OooOO0o(byteBuffer);
                byteBuffer.limit(iOooOO0o2);
                this.f13632OooOo00 += (long) (byteBuffer.remaining() / this.f13624OooOO0o);
                OooOOO(byteBuffer, this.f13627OooOOOO, this.f13629OooOOo);
                if (iOooOO0o2 < iLimit4) {
                    OooOOO0(this.f13627OooOOOO, this.f13629OooOOo);
                    this.f13628OooOOOo = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.OooO0OO
    public final AudioProcessor.OooO00o OooO0oO(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        if (oooO00o.f13476OooO0OO == 2) {
            return this.f13626OooOOO0 ? oooO00o : AudioProcessor.OooO00o.f13473OooO0o0;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
    }

    @Override // com.google.android.exoplayer2.audio.OooO0OO
    public final void OooO0oo() {
        if (this.f13626OooOOO0) {
            AudioProcessor.OooO00o oooO00o = this.f13586OooO0O0;
            int i = oooO00o.f13477OooO0Oo;
            this.f13624OooOO0o = i;
            long j = this.f13621OooO;
            int i2 = oooO00o.f13474OooO00o;
            int i3 = ((int) ((j * ((long) i2)) / 1000000)) * i;
            if (this.f13625OooOOO.length != i3) {
                this.f13625OooOOO = new byte[i3];
            }
            int i4 = ((int) ((this.f13622OooOO0 * ((long) i2)) / 1000000)) * i;
            this.f13629OooOOo = i4;
            if (this.f13627OooOOOO.length != i4) {
                this.f13627OooOOOO = new byte[i4];
            }
        }
        this.f13628OooOOOo = 0;
        this.f13632OooOo00 = 0L;
        this.f13630OooOOo0 = 0;
        this.f13631OooOOoo = false;
    }

    @Override // com.google.android.exoplayer2.audio.OooO0OO
    public final void OooOO0() {
        this.f13626OooOOO0 = false;
        this.f13629OooOOo = 0;
        byte[] bArr = o000OOo0.f36744OooO0o;
        this.f13625OooOOO = bArr;
        this.f13627OooOOOO = bArr;
    }

    public final int OooOO0o(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f13623OooOO0O) {
                int i = this.f13624OooOO0o;
                return (iPosition / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    public final void OooOOO(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.f13629OooOOo);
        int i2 = this.f13629OooOOo - iMin;
        System.arraycopy(bArr, i - i2, this.f13627OooOOOO, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f13627OooOOOO, i2, iMin);
    }

    public final void OooOOO0(byte[] bArr, int i) {
        OooOO0O(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f13631OooOOoo = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.OooO0OO, com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean isActive() {
        return this.f13626OooOOO0;
    }
}
