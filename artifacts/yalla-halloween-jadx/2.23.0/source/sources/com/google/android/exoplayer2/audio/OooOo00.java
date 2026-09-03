package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p205o00o0oO0.o00O00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 implements AudioProcessor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f11647OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f11648OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f11649OooO0OO = 1.0f;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f11650OooO0Oo = 1.0f;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public AudioProcessor.OooO00o f11651OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public AudioProcessor.OooO00o f11652OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public AudioProcessor.OooO00o f11653OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public AudioProcessor.OooO00o f11654OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o00O00 f11655OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ByteBuffer f11656OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ShortBuffer f11657OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f11658OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ByteBuffer f11659OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f11660OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f11661OooOOOo;

    public OooOo00() {
        AudioProcessor.OooO00o oooO00o = AudioProcessor.OooO00o.f11443OooO0o0;
        this.f11652OooO0o0 = oooO00o;
        this.f11651OooO0o = oooO00o;
        this.f11653OooO0oO = oooO00o;
        this.f11654OooO0oo = oooO00o;
        ByteBuffer byteBuffer = AudioProcessor.f11442OooO00o;
        this.f11656OooOO0O = byteBuffer;
        this.f11657OooOO0o = byteBuffer.asShortBuffer();
        this.f11659OooOOO0 = byteBuffer;
        this.f11648OooO0O0 = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final ByteBuffer OooO00o() {
        o00O00 o00o01 = this.f11655OooOO0;
        if (o00o01 != null) {
            int i = o00o01.f39368OooOOO0;
            int i2 = o00o01.f39357OooO0O0;
            int i3 = i * i2 * 2;
            if (i3 > 0) {
                if (this.f11656OooOO0O.capacity() < i3) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                    this.f11656OooOO0O = byteBufferOrder;
                    this.f11657OooOO0o = byteBufferOrder.asShortBuffer();
                } else {
                    this.f11656OooOO0O.clear();
                    this.f11657OooOO0o.clear();
                }
                ShortBuffer shortBuffer = this.f11657OooOO0o;
                int iMin = Math.min(shortBuffer.remaining() / i2, o00o01.f39368OooOOO0);
                int i4 = iMin * i2;
                shortBuffer.put(o00o01.f39366OooOO0o, 0, i4);
                int i5 = o00o01.f39368OooOOO0 - iMin;
                o00o01.f39368OooOOO0 = i5;
                short[] sArr = o00o01.f39366OooOO0o;
                System.arraycopy(sArr, i4, sArr, 0, i5 * i2);
                this.f11660OooOOOO += (long) i3;
                this.f11656OooOO0O.limit(i3);
                this.f11659OooOOO0 = this.f11656OooOO0O;
            }
        }
        ByteBuffer byteBuffer = this.f11659OooOOO0;
        this.f11659OooOOO0 = AudioProcessor.f11442OooO00o;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO0O0(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            o00O00 o00o01 = this.f11655OooOO0;
            o00o01.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f11658OooOOO += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = o00o01.f39357OooO0O0;
            int i2 = iRemaining2 / i;
            short[] sArrOooO0O0 = o00o01.OooO0O0(o00o01.f39364OooOO0, o00o01.f39365OooOO0O, i2);
            o00o01.f39364OooOO0 = sArrOooO0O0;
            shortBufferAsShortBuffer.get(sArrOooO0O0, o00o01.f39365OooOO0O * i, ((i2 * i) * 2) / 2);
            o00o01.f39365OooOO0O += i2;
            o00o01.OooO0o0();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CanIgnoreReturnValue
    public final AudioProcessor.OooO00o OooO0OO(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        if (oooO00o.f11446OooO0OO != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
        }
        int i = this.f11648OooO0O0;
        if (i == -1) {
            i = oooO00o.f11444OooO00o;
        }
        this.f11652OooO0o0 = oooO00o;
        AudioProcessor.OooO00o oooO00o2 = new AudioProcessor.OooO00o(i, oooO00o.f11445OooO0O0, 2);
        this.f11651OooO0o = oooO00o2;
        this.f11647OooO = true;
        return oooO00o2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean OooO0Oo() {
        o00O00 o00o01;
        return this.f11661OooOOOo && ((o00o01 = this.f11655OooOO0) == null || (o00o01.f39368OooOOO0 * o00o01.f39357OooO0O0) * 2 == 0);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO0o0() {
        o00O00 o00o01 = this.f11655OooOO0;
        if (o00o01 != null) {
            int i = o00o01.f39365OooOO0O;
            float f = o00o01.f39358OooO0OO;
            float f2 = o00o01.f39359OooO0Oo;
            int i2 = o00o01.f39368OooOOO0 + ((int) ((((i / (f / f2)) + o00o01.f39369OooOOOO) / (o00o01.f39361OooO0o0 * f2)) + 0.5f));
            short[] sArr = o00o01.f39364OooOO0;
            int i3 = o00o01.f39363OooO0oo * 2;
            o00o01.f39364OooOO0 = o00o01.OooO0O0(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = o00o01.f39357OooO0O0;
                if (i4 >= i3 * i5) {
                    break;
                }
                o00o01.f39364OooOO0[(i5 * i) + i4] = 0;
                i4++;
            }
            o00o01.f39365OooOO0O = i3 + o00o01.f39365OooOO0O;
            o00o01.OooO0o0();
            if (o00o01.f39368OooOOO0 > i2) {
                o00o01.f39368OooOOO0 = i2;
            }
            o00o01.f39365OooOO0O = 0;
            o00o01.f39371OooOOo = 0;
            o00o01.f39369OooOOOO = 0;
        }
        this.f11661OooOOOo = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.OooO00o oooO00o = this.f11652OooO0o0;
            this.f11653OooO0oO = oooO00o;
            AudioProcessor.OooO00o oooO00o2 = this.f11651OooO0o;
            this.f11654OooO0oo = oooO00o2;
            if (this.f11647OooO) {
                this.f11655OooOO0 = new o00O00(this.f11649OooO0OO, this.f11650OooO0Oo, oooO00o.f11444OooO00o, oooO00o.f11445OooO0O0, oooO00o2.f11444OooO00o);
            } else {
                o00O00 o00o01 = this.f11655OooOO0;
                if (o00o01 != null) {
                    o00o01.f39365OooOO0O = 0;
                    o00o01.f39368OooOOO0 = 0;
                    o00o01.f39369OooOOOO = 0;
                    o00o01.f39370OooOOOo = 0;
                    o00o01.f39372OooOOo0 = 0;
                    o00o01.f39371OooOOo = 0;
                    o00o01.f39373OooOOoo = 0;
                    o00o01.f39375OooOo00 = 0;
                    o00o01.f39374OooOo0 = 0;
                    o00o01.f39376OooOo0O = 0;
                }
            }
        }
        this.f11659OooOOO0 = AudioProcessor.f11442OooO00o;
        this.f11658OooOOO = 0L;
        this.f11660OooOOOO = 0L;
        this.f11661OooOOOo = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean isActive() {
        return this.f11651OooO0o.f11444OooO00o != -1 && (Math.abs(this.f11649OooO0OO - 1.0f) >= 1.0E-4f || Math.abs(this.f11650OooO0Oo - 1.0f) >= 1.0E-4f || this.f11651OooO0o.f11444OooO00o != this.f11652OooO0o0.f11444OooO00o);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        this.f11649OooO0OO = 1.0f;
        this.f11650OooO0Oo = 1.0f;
        AudioProcessor.OooO00o oooO00o = AudioProcessor.OooO00o.f11443OooO0o0;
        this.f11652OooO0o0 = oooO00o;
        this.f11651OooO0o = oooO00o;
        this.f11653OooO0oO = oooO00o;
        this.f11654OooO0oo = oooO00o;
        ByteBuffer byteBuffer = AudioProcessor.f11442OooO00o;
        this.f11656OooOO0O = byteBuffer;
        this.f11657OooOO0o = byteBuffer.asShortBuffer();
        this.f11659OooOOO0 = byteBuffer;
        this.f11648OooO0O0 = -1;
        this.f11647OooO = false;
        this.f11655OooOO0 = null;
        this.f11658OooOOO = 0L;
        this.f11660OooOOOO = 0L;
        this.f11661OooOOOo = false;
    }
}
