package p022Oooo00O;

import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p036OoooOOo.o0000O00;
import p080o000OoO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OOO0 implements o0000O00, o00000O0.OooO00o {
    public /* synthetic */ o0OOO0(int i, AnalyticsListener.OooO00o oooO00o, boolean z) {
    }

    public static PathBuilder OooO00o(float f, float f2, float f3, float f4) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineTo(f3, f4);
        return pathBuilder;
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).OooOo0();
    }
}
