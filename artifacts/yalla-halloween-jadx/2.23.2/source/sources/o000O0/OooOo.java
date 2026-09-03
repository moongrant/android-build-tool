package o000O0;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo implements o000OoO.o00000O0.OooO00o {
    public /* synthetic */ OooOo(AnalyticsListener.OooO00o oooO00o, String str, long j, long j2) {
    }

    public static Object OooO00o(MomentDetailActivity momentDetailActivity) {
        return momentDetailActivity.OooOooO().getMPostDetailModel().getValue();
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        analyticsListener.o000oOoO();
        analyticsListener.Oooo0();
    }
}
