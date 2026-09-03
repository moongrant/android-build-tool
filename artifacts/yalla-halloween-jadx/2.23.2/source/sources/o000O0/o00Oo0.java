package o000O0;

import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00Oo0 implements o000OoO.o00000O0.OooO00o {
    public /* synthetic */ o00Oo0(AnalyticsListener.OooO00o oooO00o, androidx.media3.common.OooOOO0 oooOOO0, int i) {
    }

    public static void OooO00o(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.close();
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).Oooooo();
    }
}
