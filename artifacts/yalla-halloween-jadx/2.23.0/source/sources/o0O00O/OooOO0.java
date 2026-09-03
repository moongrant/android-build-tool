package o0O00O;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.OooOO0O f41694OooO0Oo;

    public OooOO0(com.google.android.material.floatingactionbutton.OooOO0O oooOO0O) {
        this.f41694OooO0Oo = oooOO0O;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        com.google.android.material.floatingactionbutton.OooOO0O oooOO0O = this.f41694OooO0Oo;
        float rotation = oooOO0O.f17086OooOo0O.getRotation();
        if (oooOO0O.f17078OooOOOO == rotation) {
            return true;
        }
        oooOO0O.f17078OooOOOO = rotation;
        oooOO0O.OooOOOo();
        return true;
    }
}
