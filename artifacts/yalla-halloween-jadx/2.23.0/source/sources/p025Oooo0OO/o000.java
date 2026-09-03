package p025Oooo0OO;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import o0OO0o.OooOOO0;
import p389o0OOoooO.oo0o0O0;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000 implements o00O000.OooO0OO, DoubleFunction, oo0o0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1040OooO0Oo;

    public /* synthetic */ o000(Object obj) {
        this.f1040OooO0Oo = obj;
    }

    @Override // p389o0OOoooO.oo0o0O0
    public final void OooO00o(OooOOO0 oooOOO0) {
        MainSearchUserFragment.initView$lambda$0((MainSearchUserFragment) this.f1040OooO0Oo, oooOOO0);
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        o000O0o o000o0o2 = (o000O0o) this.f1040OooO0Oo;
        o000o0o2.f1063OooO0Oo = oooO00o;
        return "WaitForRepeatingRequestStart[" + o000o0o2 + "]";
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb.oetfFunc$lambda$0((Rgb) this.f1040OooO0Oo, d);
    }
}
