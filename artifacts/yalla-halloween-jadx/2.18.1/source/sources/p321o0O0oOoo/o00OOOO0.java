package p321o0O0oOoo;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.OooO0o;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import p318o0O0oOo.o000;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOOO0 extends OooO0o {

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final DecoderInputBuffer f36881OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final o000 f36882OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public long f36883OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public o0o0Oo f36884OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public long f36885Ooooo00;

    public o00OOOO0() {
        super(5);
        this.f36881OoooOOo = new DecoderInputBuffer(1);
        this.f36882OoooOo0 = new o000();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean OooO0O0() {
        return true;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int OooO0OO(Format format) {
        return "application/x-camera-motion".equals(format.f13131OoooOOo) ? 4 : 0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean OooO0Oo() {
        return OooO0oo();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooOOOO(long j, long j2) {
        float[] fArr;
        while (!OooO0oo() && this.f36885Ooooo00 < 100000 + j) {
            this.f36881OoooOOo.clear();
            if (Oooo00o(OooOoO(), this.f36881OoooOOo, false) != -4 || this.f36881OoooOOo.isEndOfStream()) {
                return;
            }
            DecoderInputBuffer decoderInputBuffer = this.f36881OoooOOo;
            this.f36885Ooooo00 = decoderInputBuffer.f13640Oooo;
            if (this.f36884OoooOoo != null && !decoderInputBuffer.isDecodeOnly()) {
                this.f36881OoooOOo.OooO0oo();
                ByteBuffer byteBuffer = this.f36881OoooOOo.f13642Oooo0oO;
                int i = o000OOo0.f36740OooO00o;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    this.f36882OoooOo0.OooOoO0(byteBuffer.array(), byteBuffer.limit());
                    this.f36882OoooOo0.OooOoOO(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(this.f36882OoooOo0.OooO0o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f36884OoooOoo.OooO00o();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.OooOo.OooO0O0
    public final void OooOOOo(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 7) {
            this.f36884OoooOoo = (o0o0Oo) obj;
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoOO() {
        o0o0Oo o0o0oo = this.f36884OoooOoo;
        if (o0o0oo != null) {
            o0o0oo.OooO0O0();
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoo(long j, boolean z) {
        this.f36885Ooooo00 = Long.MIN_VALUE;
        o0o0Oo o0o0oo = this.f36884OoooOoo;
        if (o0o0oo != null) {
            o0o0oo.OooO0O0();
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void Oooo00O(Format[] formatArr, long j, long j2) {
        this.f36883OoooOoO = j2;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "CameraMotionRenderer";
    }
}
