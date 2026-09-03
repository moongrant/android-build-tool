package androidx.compose.ui.graphics.colorspace;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import p080o000OoO.o00000O0;
import p338o0OO0oOo.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements DoubleFunction, o00000O0.OooO00o, Oooo000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f4172OooO0Oo;

    public /* synthetic */ OooOOO0(Object obj) {
        this.f4172OooO0Oo = obj;
    }

    @Override // p338o0OO0oOo.Oooo000
    public final void OooO00o(o0OO0oO0.OooOOO0 oooOOO0) {
        MainSearchUserFragment.initView$lambda$1((MainSearchUserFragment) this.f4172OooO0Oo, oooOOO0);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb.eotfFunc$lambda$1((Rgb) this.f4172OooO0Oo, d);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).OoooO();
    }
}
