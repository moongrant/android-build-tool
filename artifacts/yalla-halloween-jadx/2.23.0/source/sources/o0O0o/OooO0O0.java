package o0O0o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import p203o00o0o0o.o00OOO0O;
import p203o00o0o0o.o0OoO00O;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0O0 extends com.google.android.exoplayer2.OooO0o {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final DecoderInputBuffer f42362OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final o00Oo00 f42363OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public OooO00o f42364OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f42365OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f42366OooOo0O;

    public OooO0O0() {
        super(6);
        this.f42362OooOOo = new DecoderInputBuffer(1);
        this.f42363OooOOoo = new o00Oo00();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean OooO0O0() {
        return true;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int OooO0OO(OooOo oooOo) {
        return "application/x-camera-motion".equals(oooOo.f11211OooOOOO) ? o0OoO00O.OooO00o(4, 0, 0) : o0OoO00O.OooO00o(0, 0, 0);
    }

    @Override // com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.oo000o.OooO0O0
    public final void OooOO0O(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 8) {
            this.f42364OooOo0 = (OooO00o) obj;
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void OooOo00(long j, long j2) {
        float[] fArr;
        while (!OooO0oO() && this.f42366OooOo0O < 100000 + j) {
            DecoderInputBuffer decoderInputBuffer = this.f42362OooOOo;
            decoderInputBuffer.OooO0oo();
            o00OOO0O o00ooo0o = this.f11043OooO0o;
            o00ooo0o.OooO00o();
            if (Oooo0(o00ooo0o, decoderInputBuffer, 0) != -4 || decoderInputBuffer.OooO0o(4)) {
                return;
            }
            this.f42366OooOo0O = decoderInputBuffer.f11677OooO0oo;
            if (this.f42364OooOo0 != null && !decoderInputBuffer.OooO0oO()) {
                decoderInputBuffer.OooOO0O();
                ByteBuffer byteBuffer = decoderInputBuffer.f11674OooO0o;
                int i = o0O00.f40595OooO00o;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    o00Oo00 o00oo00 = this.f42363OooOOoo;
                    o00oo00.OooOooo(iLimit, bArrArray);
                    o00oo00.Oooo00O(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(o00oo00.OooO());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f42364OooOo0.OooO00o(fArr, this.f42366OooOo0O - this.f42365OooOo00);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoOO() {
        OooO00o oooO00o = this.f42364OooOo0;
        if (oooO00o != null) {
            oooO00o.OooO0o0();
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoo(long j, boolean z) {
        this.f42366OooOo0O = Long.MIN_VALUE;
        OooO00o oooO00o = this.f42364OooOo0;
        if (oooO00o != null) {
            oooO00o.OooO0o0();
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void Oooo00o(OooOo[] oooOoArr, long j, long j2) {
        this.f42365OooOo00 = j2;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "CameraMotionRenderer";
    }
}
