package p039OoooOoo;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements o00O000.OooO0OO, DoubleFunction {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1644OooO0Oo;

    public /* synthetic */ o0(Object obj) {
        this.f1644OooO0Oo = obj;
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        o0O000Oo o0o000oo2 = (o0O000Oo) this.f1644OooO0Oo;
        o0o000oo2.f1738OooOO0O = oooO00o;
        return "ReleasedFuture " + o0o000oo2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb.eotfFunc$lambda$1((Rgb) this.f1644OooO0Oo, d);
    }
}
