package o000OOo0;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.nio.ByteBuffer;
import o000O00O.o00O;
import o000O00O.o00O0000;
import p080o000OoO.o00;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0O0 extends androidx.media3.exoplayer.OooO0O0 {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final DecoderInputBuffer f34609OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final o000O000 f34610OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public OooO00o f34611OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f34612OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f34613OooOo0O;

    public OooO0O0() {
        super(6);
        this.f34609OooOOo = new DecoderInputBuffer(1);
        this.f34610OooOOoo = new o000O000();
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int OooO0OO(androidx.media3.common.OooOO0 oooOO1) {
        return "application/x-camera-motion".equals(oooOO1.f6412OooOOOO) ? o00O.OooO00o(4, 0, 0) : o00O.OooO00o(0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean OooO0Oo() {
        return true;
    }

    @Override // androidx.media3.exoplayer.OooO0O0, androidx.media3.exoplayer.OooOOO.OooO0O0
    public final void OooOO0o(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 8) {
            this.f34611OooOo0 = (OooO00o) obj;
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void OooOo00(long j, long j2) {
        float[] fArr;
        while (!OooO0oo() && this.f34613OooOo0O < 100000 + j) {
            DecoderInputBuffer decoderInputBuffer = this.f34609OooOOo;
            decoderInputBuffer.OooO0oo();
            o00O0000 o00o0001 = this.f7197OooO0o;
            o00o0001.OooO00o();
            if (Oooo0(o00o0001, decoderInputBuffer, 0) != -4 || decoderInputBuffer.OooO0o(4)) {
                return;
            }
            this.f34613OooOo0O = decoderInputBuffer.f7087OooO0oo;
            if (this.f34611OooOo0 != null && !decoderInputBuffer.OooO0oO()) {
                decoderInputBuffer.OooOO0O();
                ByteBuffer byteBuffer = decoderInputBuffer.f7084OooO0o;
                int i = o00.f34910OooO00o;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    o000O000 o000o001 = this.f34610OooOOoo;
                    o000o001.OooOooo(iLimit, bArrArray);
                    o000o001.Oooo00O(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(o000o001.OooO());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f34611OooOo0.OooO00o(fArr, this.f34613OooOo0O - this.f34612OooOo00);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void OooOoOO() {
        OooO00o oooO00o = this.f34611OooOo0;
        if (oooO00o != null) {
            oooO00o.OooO0O0();
        }
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void OooOoo(long j, boolean z) {
        this.f34613OooOo0O = Long.MIN_VALUE;
        OooO00o oooO00o = this.f34611OooOo0;
        if (oooO00o != null) {
            oooO00o.OooO0O0();
        }
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void Oooo00o(androidx.media3.common.OooOO0[] oooOO0Arr, long j, long j2) {
        this.f34612OooOo00 = j2;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "CameraMotionRenderer";
    }
}
