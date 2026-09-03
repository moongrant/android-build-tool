package p200o00o0o;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.OooO0o;
import p245o00oo0o.o00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O000 implements o00O.OooO00o, MediaCodecUtil.OooO {
    public /* synthetic */ o000O000(AnalyticsListener.OooO00o oooO00o, int i) {
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.OooO
    public int OooO0O0(Object obj) {
        return ((OooO0o) obj).f12519OooO00o.startsWith("OMX.google") ? 1 : 0;
    }

    @Override // o00oo0o.o00O.OooO00o
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        analyticsListener.OooOO0O();
        analyticsListener.OooOoo();
    }
}
