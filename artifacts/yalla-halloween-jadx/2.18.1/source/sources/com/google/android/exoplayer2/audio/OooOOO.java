package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;
import p293o0O0Oo0O.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO implements AudioProcessor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f13606OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f13607OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f13608OooO0OO = 1.0f;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f13609OooO0Oo = 1.0f;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public AudioProcessor.OooO00o f13610OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public AudioProcessor.OooO00o f13611OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public AudioProcessor.OooO00o f13612OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public AudioProcessor.OooO00o f13613OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o0OOO0o f13614OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ByteBuffer f13615OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ShortBuffer f13616OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f13617OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ByteBuffer f13618OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f13619OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f13620OooOOOo;

    public OooOOO() {
        AudioProcessor.OooO00o oooO00o = AudioProcessor.OooO00o.f13473OooO0o0;
        this.f13611OooO0o0 = oooO00o;
        this.f13610OooO0o = oooO00o;
        this.f13612OooO0oO = oooO00o;
        this.f13613OooO0oo = oooO00o;
        ByteBuffer byteBuffer = AudioProcessor.f13472OooO00o;
        this.f13615OooOO0O = byteBuffer;
        this.f13616OooOO0o = byteBuffer.asShortBuffer();
        this.f13618OooOOO0 = byteBuffer;
        this.f13607OooO0O0 = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO00o() {
        this.f13608OooO0OO = 1.0f;
        this.f13609OooO0Oo = 1.0f;
        AudioProcessor.OooO00o oooO00o = AudioProcessor.OooO00o.f13473OooO0o0;
        this.f13611OooO0o0 = oooO00o;
        this.f13610OooO0o = oooO00o;
        this.f13612OooO0oO = oooO00o;
        this.f13613OooO0oo = oooO00o;
        ByteBuffer byteBuffer = AudioProcessor.f13472OooO00o;
        this.f13615OooOO0O = byteBuffer;
        this.f13616OooOO0o = byteBuffer.asShortBuffer();
        this.f13618OooOOO0 = byteBuffer;
        this.f13607OooO0O0 = -1;
        this.f13606OooO = false;
        this.f13614OooOO0 = null;
        this.f13617OooOOO = 0L;
        this.f13619OooOOOO = 0L;
        this.f13620OooOOOo = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final ByteBuffer OooO0O0() {
        ByteBuffer byteBuffer = this.f13618OooOOO0;
        this.f13618OooOOO0 = AudioProcessor.f13472OooO00o;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO0OO(ByteBuffer byteBuffer) {
        o0OOO0o o0ooo0o2 = this.f13614OooOO0;
        Objects.requireNonNull(o0ooo0o2);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f13617OooOOO += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = o0ooo0o2.f35783OooO0O0;
            int i2 = iRemaining2 / i;
            short[] sArrOooO0OO = o0ooo0o2.OooO0OO(o0ooo0o2.f35790OooOO0, o0ooo0o2.f35791OooOO0O, i2);
            o0ooo0o2.f35790OooOO0 = sArrOooO0OO;
            shortBufferAsShortBuffer.get(sArrOooO0OO, o0ooo0o2.f35791OooOO0O * o0ooo0o2.f35783OooO0O0, ((i * i2) * 2) / 2);
            o0ooo0o2.f35791OooOO0O += i2;
            o0ooo0o2.OooO0o();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int i3 = o0ooo0o2.f35794OooOOO0 * o0ooo0o2.f35783OooO0O0 * 2;
        if (i3 > 0) {
            if (this.f13615OooOO0O.capacity() < i3) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                this.f13615OooOO0O = byteBufferOrder;
                this.f13616OooOO0o = byteBufferOrder.asShortBuffer();
            } else {
                this.f13615OooOO0O.clear();
                this.f13616OooOO0o.clear();
            }
            ShortBuffer shortBuffer = this.f13616OooOO0o;
            int iMin = Math.min(shortBuffer.remaining() / o0ooo0o2.f35783OooO0O0, o0ooo0o2.f35794OooOOO0);
            shortBuffer.put(o0ooo0o2.f35792OooOO0o, 0, o0ooo0o2.f35783OooO0O0 * iMin);
            int i4 = o0ooo0o2.f35794OooOOO0 - iMin;
            o0ooo0o2.f35794OooOOO0 = i4;
            short[] sArr = o0ooo0o2.f35792OooOO0o;
            int i5 = o0ooo0o2.f35783OooO0O0;
            System.arraycopy(sArr, iMin * i5, sArr, 0, i4 * i5);
            this.f13619OooOOOO += (long) i3;
            this.f13615OooOO0O.limit(i3);
            this.f13618OooOOO0 = this.f13615OooOO0O;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean OooO0Oo() {
        o0OOO0o o0ooo0o2;
        return this.f13620OooOOOo && ((o0ooo0o2 = this.f13614OooOO0) == null || (o0ooo0o2.f35794OooOOO0 * o0ooo0o2.f35783OooO0O0) * 2 == 0);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void OooO0o() {
        int i;
        o0OOO0o o0ooo0o2 = this.f13614OooOO0;
        if (o0ooo0o2 != null) {
            int i2 = o0ooo0o2.f35791OooOO0O;
            float f = o0ooo0o2.f35784OooO0OO;
            float f2 = o0ooo0o2.f35785OooO0Oo;
            int i3 = o0ooo0o2.f35794OooOOO0 + ((int) ((((i2 / (f / f2)) + o0ooo0o2.f35795OooOOOO) / (o0ooo0o2.f35787OooO0o0 * f2)) + 0.5f));
            o0ooo0o2.f35790OooOO0 = o0ooo0o2.OooO0OO(o0ooo0o2.f35790OooOO0, i2, (o0ooo0o2.f35789OooO0oo * 2) + i2);
            int i4 = 0;
            while (true) {
                i = o0ooo0o2.f35789OooO0oo * 2;
                int i5 = o0ooo0o2.f35783OooO0O0;
                if (i4 >= i * i5) {
                    break;
                }
                o0ooo0o2.f35790OooOO0[(i5 * i2) + i4] = 0;
                i4++;
            }
            o0ooo0o2.f35791OooOO0O = i + o0ooo0o2.f35791OooOO0O;
            o0ooo0o2.OooO0o();
            if (o0ooo0o2.f35794OooOOO0 > i3) {
                o0ooo0o2.f35794OooOOO0 = i3;
            }
            o0ooo0o2.f35791OooOO0O = 0;
            o0ooo0o2.f35797OooOOo = 0;
            o0ooo0o2.f35795OooOOOO = 0;
        }
        this.f13620OooOOOo = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.OooO00o OooO0o0(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        if (oooO00o.f13476OooO0OO != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
        }
        int i = this.f13607OooO0O0;
        if (i == -1) {
            i = oooO00o.f13474OooO00o;
        }
        this.f13611OooO0o0 = oooO00o;
        AudioProcessor.OooO00o oooO00o2 = new AudioProcessor.OooO00o(i, oooO00o.f13475OooO0O0, 2);
        this.f13610OooO0o = oooO00o2;
        this.f13606OooO = true;
        return oooO00o2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.OooO00o oooO00o = this.f13611OooO0o0;
            this.f13612OooO0oO = oooO00o;
            AudioProcessor.OooO00o oooO00o2 = this.f13610OooO0o;
            this.f13613OooO0oo = oooO00o2;
            if (this.f13606OooO) {
                this.f13614OooOO0 = new o0OOO0o(oooO00o.f13474OooO00o, oooO00o.f13475OooO0O0, this.f13608OooO0OO, this.f13609OooO0Oo, oooO00o2.f13474OooO00o);
            } else {
                o0OOO0o o0ooo0o2 = this.f13614OooOO0;
                if (o0ooo0o2 != null) {
                    o0ooo0o2.f35791OooOO0O = 0;
                    o0ooo0o2.f35794OooOOO0 = 0;
                    o0ooo0o2.f35795OooOOOO = 0;
                    o0ooo0o2.f35796OooOOOo = 0;
                    o0ooo0o2.f35798OooOOo0 = 0;
                    o0ooo0o2.f35797OooOOo = 0;
                    o0ooo0o2.f35799OooOOoo = 0;
                    o0ooo0o2.f35801OooOo00 = 0;
                    o0ooo0o2.f35800OooOo0 = 0;
                    o0ooo0o2.f35802OooOo0O = 0;
                }
            }
        }
        this.f13618OooOOO0 = AudioProcessor.f13472OooO00o;
        this.f13617OooOOO = 0L;
        this.f13619OooOOOO = 0L;
        this.f13620OooOOOo = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean isActive() {
        return this.f13610OooO0o.f13474OooO00o != -1 && (Math.abs(this.f13608OooO0OO - 1.0f) >= 0.01f || Math.abs(this.f13609OooO0Oo - 1.0f) >= 0.01f || this.f13610OooO0o.f13474OooO00o != this.f13611OooO0o0.f13474OooO00o);
    }
}
