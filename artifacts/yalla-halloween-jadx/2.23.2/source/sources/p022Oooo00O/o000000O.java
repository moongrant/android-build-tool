package p022Oooo00O;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000000O implements o0O000Oo.OooO0OO, DoubleFunction {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f479OooO0Oo;

    public /* synthetic */ o000000O(Object obj) {
        this.f479OooO0Oo = obj;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$9((TransferParameters) this.f479OooO0Oo, d);
    }
}
