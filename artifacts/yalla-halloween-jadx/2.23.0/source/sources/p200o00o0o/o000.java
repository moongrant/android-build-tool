package p200o00o0o;

import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.OooO0o;
import p245o00oo0o.o00O;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000 implements o00O.OooO00o, MediaCodecUtil.OooO {
    public /* synthetic */ o000(AnalyticsListener.OooO00o oooO00o, OooOo oooOo, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.OooO
    public int OooO0O0(Object obj) {
        String str = ((OooO0o) obj).f12519OooO00o;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (o0O00.f40595OooO00o >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // o00oo0o.o00O.OooO00o
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        analyticsListener.OooOo00();
        analyticsListener.Oooooo0();
    }
}
