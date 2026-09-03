package p558o0oOOoo;

import com.yalla.yalla.common.ui.view.BaseWebView;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0o0Oo;
import p254o00ooO0O.oOO00O;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oO0Ooo implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO f44823OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0O00OO f44824OooO0O0;

    public o0oO0Ooo(o0O00OO o0o00oo2, o0O00OO o0o00oo3) {
        this.f44823OooO00o = o0o00oo2;
        this.f44824OooO0O0 = o0o00oo3;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        o0O00OO o0o00oo2 = this.f44823OooO00o;
        this.f44824OooO0O0.setValue("");
        o00O.OooOOO0 oooOOO0 = o00O.OooOOO0.f43257OooO00o;
        o00O.OooOOO0.f43258OooO0O0.setValue(Boolean.FALSE);
        BaseWebView baseWebView = (BaseWebView) o0o00oo2.getValue();
        if (baseWebView != null) {
            baseWebView.OooO0OO();
        }
        BaseWebView baseWebView2 = (BaseWebView) o0o00oo2.getValue();
        if (baseWebView2 != null) {
            oOO00O.OooO00o(baseWebView2);
        }
        BaseWebView baseWebView3 = (BaseWebView) o0o00oo2.getValue();
        if (baseWebView3 != null) {
            oOO00O.OooO0o0(baseWebView3);
        }
        o0o00oo2.setValue(null);
    }
}
