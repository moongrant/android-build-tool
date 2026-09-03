package androidx.compose.ui.graphics.colorspace;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p080o000OoO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOOO implements DoubleFunction, o00000O0.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f4173OooO0Oo;

    public /* synthetic */ OooOOOO(Object obj) {
        this.f4173OooO0Oo = obj;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$8((TransferParameters) this.f4173OooO0Oo, d);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).OooOoO0();
    }
}
