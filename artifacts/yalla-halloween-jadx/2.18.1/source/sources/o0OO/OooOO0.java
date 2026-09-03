package o0OO;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.OooO0o f37188Oooo0o;

    public OooOO0(com.google.android.material.floatingactionbutton.OooO0o oooO0o) {
        this.f37188Oooo0o = oooO0o;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        com.google.android.material.floatingactionbutton.OooO0o oooO0o = this.f37188Oooo0o;
        float rotation = oooO0o.f17128OooOo0o.getRotation();
        if (oooO0o.f17120OooOOOo == rotation) {
            return true;
        }
        oooO0o.f17120OooOOOo = rotation;
        oooO0o.OooOo0();
        return true;
    }
}
