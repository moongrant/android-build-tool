package o000O0;

import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements o000OoO.o00000O0.OooO00o {
    public /* synthetic */ o000oOoO(AnalyticsListener.OooO00o oooO00o, boolean z) {
    }

    public static List OooO00o(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).OooOooo();
    }
}
