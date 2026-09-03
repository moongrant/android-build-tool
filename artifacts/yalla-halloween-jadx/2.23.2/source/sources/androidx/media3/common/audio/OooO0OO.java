package androidx.media3.common.audio;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooO0OO implements AudioProcessor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f6747OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f6748OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f6749OooO0OO = 1.0f;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f6750OooO0Oo = 1.0f;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public AudioProcessor.OooO00o f6751OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public AudioProcessor.OooO00o f6752OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public AudioProcessor.OooO00o f6753OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public AudioProcessor.OooO00o f6754OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o000.OooO0O0 f6755OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ByteBuffer f6756OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ShortBuffer f6757OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f6758OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ByteBuffer f6759OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f6760OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f6761OooOOOo;

    public OooO0OO() {
        AudioProcessor.OooO00o oooO00o = AudioProcessor.OooO00o.f6731OooO0o0;
        this.f6752OooO0o0 = oooO00o;
        this.f6751OooO0o = oooO00o;
        this.f6753OooO0oO = oooO00o;
        this.f6754OooO0oo = oooO00o;
        ByteBuffer byteBuffer = AudioProcessor.f6730OooO00o;
        this.f6756OooOO0O = byteBuffer;
        this.f6757OooOO0o = byteBuffer.asShortBuffer();
        this.f6759OooOOO0 = byteBuffer;
        this.f6748OooO0O0 = -1;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    @CanIgnoreReturnValue
    public final AudioProcessor.OooO00o OooO(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        if (oooO00o.f6734OooO0OO != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(oooO00o);
        }
        int i = this.f6748OooO0O0;
        if (i == -1) {
            i = oooO00o.f6732OooO00o;
        }
        this.f6752OooO0o0 = oooO00o;
        AudioProcessor.OooO00o oooO00o2 = new AudioProcessor.OooO00o(i, oooO00o.f6733OooO0O0, 2);
        this.f6751OooO0o = oooO00o2;
        this.f6747OooO = true;
        return oooO00o2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer OooO0o() {
        o000.OooO0O0 oooO0O0 = this.f6755OooOO0;
        if (oooO0O0 != null) {
            int i = oooO0O0.f33205OooOOO0;
            int i2 = oooO0O0.f33194OooO0O0;
            int i3 = i * i2 * 2;
            if (i3 > 0) {
                if (this.f6756OooOO0O.capacity() < i3) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                    this.f6756OooOO0O = byteBufferOrder;
                    this.f6757OooOO0o = byteBufferOrder.asShortBuffer();
                } else {
                    this.f6756OooOO0O.clear();
                    this.f6757OooOO0o.clear();
                }
                ShortBuffer shortBuffer = this.f6757OooOO0o;
                int iMin = Math.min(shortBuffer.remaining() / i2, oooO0O0.f33205OooOOO0);
                int i4 = iMin * i2;
                shortBuffer.put(oooO0O0.f33203OooOO0o, 0, i4);
                int i5 = oooO0O0.f33205OooOOO0 - iMin;
                oooO0O0.f33205OooOOO0 = i5;
                short[] sArr = oooO0O0.f33203OooOO0o;
                System.arraycopy(sArr, i4, sArr, 0, i5 * i2);
                this.f6760OooOOOO += (long) i3;
                this.f6756OooOO0O.limit(i3);
                this.f6759OooOOO0 = this.f6756OooOO0O;
            }
        }
        ByteBuffer byteBuffer = this.f6759OooOOO0;
        this.f6759OooOOO0 = AudioProcessor.f6730OooO00o;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean OooO0o0() {
        o000.OooO0O0 oooO0O0;
        return this.f6761OooOOOo && ((oooO0O0 = this.f6755OooOO0) == null || (oooO0O0.f33205OooOOO0 * oooO0O0.f33194OooO0O0) * 2 == 0);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void OooO0oO(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            o000.OooO0O0 oooO0O0 = this.f6755OooOO0;
            oooO0O0.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f6758OooOOO += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = oooO0O0.f33194OooO0O0;
            int i2 = iRemaining2 / i;
            short[] sArrOooO0O0 = oooO0O0.OooO0O0(oooO0O0.f33201OooOO0, oooO0O0.f33202OooOO0O, i2);
            oooO0O0.f33201OooOO0 = sArrOooO0O0;
            shortBufferAsShortBuffer.get(sArrOooO0O0, oooO0O0.f33202OooOO0O * i, ((i2 * i) * 2) / 2);
            oooO0O0.f33202OooOO0O += i2;
            oooO0O0.OooO0o0();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void OooO0oo() {
        o000.OooO0O0 oooO0O0 = this.f6755OooOO0;
        if (oooO0O0 != null) {
            int i = oooO0O0.f33202OooOO0O;
            float f = oooO0O0.f33195OooO0OO;
            float f2 = oooO0O0.f33196OooO0Oo;
            int i2 = oooO0O0.f33205OooOOO0 + ((int) ((((i / (f / f2)) + oooO0O0.f33206OooOOOO) / (oooO0O0.f33198OooO0o0 * f2)) + 0.5f));
            short[] sArr = oooO0O0.f33201OooOO0;
            int i3 = oooO0O0.f33200OooO0oo * 2;
            oooO0O0.f33201OooOO0 = oooO0O0.OooO0O0(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = oooO0O0.f33194OooO0O0;
                if (i4 >= i3 * i5) {
                    break;
                }
                oooO0O0.f33201OooOO0[(i5 * i) + i4] = 0;
                i4++;
            }
            oooO0O0.f33202OooOO0O = i3 + oooO0O0.f33202OooOO0O;
            oooO0O0.OooO0o0();
            if (oooO0O0.f33205OooOOO0 > i2) {
                oooO0O0.f33205OooOOO0 = i2;
            }
            oooO0O0.f33202OooOO0O = 0;
            oooO0O0.f33208OooOOo = 0;
            oooO0O0.f33206OooOOOO = 0;
        }
        this.f6761OooOOOo = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.OooO00o oooO00o = this.f6752OooO0o0;
            this.f6753OooO0oO = oooO00o;
            AudioProcessor.OooO00o oooO00o2 = this.f6751OooO0o;
            this.f6754OooO0oo = oooO00o2;
            if (this.f6747OooO) {
                this.f6755OooOO0 = new o000.OooO0O0(this.f6749OooO0OO, this.f6750OooO0Oo, oooO00o.f6732OooO00o, oooO00o.f6733OooO0O0, oooO00o2.f6732OooO00o);
            } else {
                o000.OooO0O0 oooO0O0 = this.f6755OooOO0;
                if (oooO0O0 != null) {
                    oooO0O0.f33202OooOO0O = 0;
                    oooO0O0.f33205OooOOO0 = 0;
                    oooO0O0.f33206OooOOOO = 0;
                    oooO0O0.f33207OooOOOo = 0;
                    oooO0O0.f33209OooOOo0 = 0;
                    oooO0O0.f33208OooOOo = 0;
                    oooO0O0.f33210OooOOoo = 0;
                    oooO0O0.f33212OooOo00 = 0;
                    oooO0O0.f33211OooOo0 = 0;
                    oooO0O0.f33213OooOo0O = 0;
                }
            }
        }
        this.f6759OooOOO0 = AudioProcessor.f6730OooO00o;
        this.f6758OooOOO = 0L;
        this.f6760OooOOOO = 0L;
        this.f6761OooOOOo = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        return this.f6751OooO0o.f6732OooO00o != -1 && (Math.abs(this.f6749OooO0OO - 1.0f) >= 1.0E-4f || Math.abs(this.f6750OooO0Oo - 1.0f) >= 1.0E-4f || this.f6751OooO0o.f6732OooO00o != this.f6752OooO0o0.f6732OooO00o);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.f6749OooO0OO = 1.0f;
        this.f6750OooO0Oo = 1.0f;
        AudioProcessor.OooO00o oooO00o = AudioProcessor.OooO00o.f6731OooO0o0;
        this.f6752OooO0o0 = oooO00o;
        this.f6751OooO0o = oooO00o;
        this.f6753OooO0oO = oooO00o;
        this.f6754OooO0oo = oooO00o;
        ByteBuffer byteBuffer = AudioProcessor.f6730OooO00o;
        this.f6756OooOO0O = byteBuffer;
        this.f6757OooOO0o = byteBuffer.asShortBuffer();
        this.f6759OooOOO0 = byteBuffer;
        this.f6748OooO0O0 = -1;
        this.f6747OooO = false;
        this.f6755OooOO0 = null;
        this.f6758OooOOO = 0L;
        this.f6760OooOOOO = 0L;
        this.f6761OooOOOo = false;
    }
}
