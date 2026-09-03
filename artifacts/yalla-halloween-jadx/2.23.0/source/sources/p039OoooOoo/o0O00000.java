package p039OoooOoo;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O00000 implements o00O000.OooO0OO, DoubleFunction {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1721OooO0Oo;

    public /* synthetic */ o0O00000(Object obj) {
        this.f1721OooO0Oo = obj;
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        o0O000Oo o0o000oo2 = (o0O000Oo) this.f1721OooO0Oo;
        o0o000oo2.f1740OooOOO0 = oooO00o;
        return "ReadyToReleaseFuture " + o0o000oo2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$6((TransferParameters) this.f1721OooO0Oo, d);
    }
}
