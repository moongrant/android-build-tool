package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.util.Log;
import java.io.IOException;
import p245o00oo0o.o00OO0OO;
import p245o00oo0o.o0O00;
import p245o00oo0o.o0O000;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0O0 implements OooO0OO.OooO0O0 {
    @Override // com.google.android.exoplayer2.mediacodec.OooO0OO.OooO0O0
    public final OooO0OO OooO00o(OooO0OO.OooO00o oooO00o) throws IOException {
        int i = o0O00.f40595OooO00o;
        if (i >= 23 && i >= 31) {
            int iOooO0oo = o00OO0OO.OooO0oo(oooO00o.f12516OooO0OO.f11211OooOOOO);
            Log.OooO0o0("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + o0O00.OooOoOO(iOooO0oo));
            return new OooO00o.C0206OooO00o(iOooO0oo).OooO00o(oooO00o);
        }
        MediaCodec mediaCodecOooO0O0 = null;
        try {
            mediaCodecOooO0O0 = OooOO0.OooO00o.OooO0O0(oooO00o);
            o0O000.OooO00o("configureCodec");
            mediaCodecOooO0O0.configure(oooO00o.f12515OooO0O0, oooO00o.f12517OooO0Oo, oooO00o.f12518OooO0o0, 0);
            o0O000.OooO0O0();
            o0O000.OooO00o("startCodec");
            mediaCodecOooO0O0.start();
            o0O000.OooO0O0();
            return new OooOO0(mediaCodecOooO0O0);
        } catch (IOException | RuntimeException e) {
            if (mediaCodecOooO0O0 != null) {
                mediaCodecOooO0O0.release();
            }
            throw e;
        }
    }
}
