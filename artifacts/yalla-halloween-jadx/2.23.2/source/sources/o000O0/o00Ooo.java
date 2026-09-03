package o000O0;

import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00Ooo implements o000OoO.o00000O0.OooO00o {
    public /* synthetic */ o00Ooo(AnalyticsListener.OooO00o oooO00o, o000O.OooOo oooOo, o000O.Oooo000 oooo000) {
    }

    public static List OooO00o(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.reflectiveCurveToRelative(f, f2, f3, f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).OooooOo();
    }
}
