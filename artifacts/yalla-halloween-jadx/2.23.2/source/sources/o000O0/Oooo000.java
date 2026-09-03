package o000O0;

import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo000 implements o000OoO.o00000O0.OooO00o {
    public /* synthetic */ Oooo000(AnalyticsListener.OooO00o oooO00o, o000O00O.OooOo oooOo) {
    }

    public static PathBuilder OooO00o(float f, float f2) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        return pathBuilder;
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).OoooOoo();
    }
}
