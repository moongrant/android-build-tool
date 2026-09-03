package o000O0;

import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0O implements o000OoO.o00000O0.OooO00o {
    public /* synthetic */ o00O0O(AnalyticsListener.OooO00o oooO00o, int i) {
    }

    public static void OooO00o(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).OoooO00();
    }
}
