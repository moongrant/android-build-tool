package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import p069o0000ooO.o0000oo;
import p080o000OoO.o00;
import p080o000OoO.o000OO0O;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0O0 implements OooO0OO.OooO0O0 {
    @Override // androidx.media3.exoplayer.mediacodec.OooO0OO.OooO0O0
    public final OooO0OO OooO00o(OooO0OO.OooO00o oooO00o) throws IOException {
        int i = o00.f34910OooO00o;
        if (i >= 23 && i >= 31) {
            int iOooO0oO = o0000oo.OooO0oO(oooO00o.f7751OooO0OO.f6412OooOOOO);
            Log.OooO0o0("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + o00.OooOoo0(iOooO0oO));
            return new OooO00o.C0148OooO00o(iOooO0oO).OooO00o(oooO00o);
        }
        MediaCodec mediaCodecOooO0O0 = null;
        try {
            mediaCodecOooO0O0 = OooOO0.OooO00o.OooO0O0(oooO00o);
            o000OO0O.OooO00o("configureCodec");
            mediaCodecOooO0O0.configure(oooO00o.f7750OooO0O0, oooO00o.f7752OooO0Oo, oooO00o.f7753OooO0o0, 0);
            o000OO0O.OooO0O0();
            o000OO0O.OooO00o("startCodec");
            mediaCodecOooO0O0.start();
            o000OO0O.OooO0O0();
            return new OooOO0(mediaCodecOooO0O0);
        } catch (IOException | RuntimeException e) {
            if (mediaCodecOooO0O0 != null) {
                mediaCodecOooO0O0.release();
            }
            throw e;
        }
    }
}
