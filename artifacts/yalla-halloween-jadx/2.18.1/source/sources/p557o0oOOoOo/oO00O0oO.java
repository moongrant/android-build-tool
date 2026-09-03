package p557o0oOOoOo;

import android.app.Activity;
import android.view.View;
import java.util.concurrent.Executors;
import p137o00OO0oo.OooOO0O;
import p181o00o000.OooO0o;
import p184o00o000o.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00O0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO0o f44675OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOOO0 f44676OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooOOO0 f44677OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f44678OooO0Oo = false;

    public oO00O0oO(Activity activity) {
        OooO0o oooO0o = new OooO0o(activity);
        this.f44675OooO00o = oooO0o;
        OooOOO0 oooOOO0 = new OooOOO0(activity, oooO0o.f32957OoooO0, new oO00O0o(this));
        this.f44676OooO0O0 = oooOOO0;
        if (OooOO0O.f31656OooO0OO == null) {
            OooOO0O.f31656OooO0OO = Executors.newSingleThreadExecutor();
        }
        oooOOO0.f33011OooO0o0 = OooOO0O.f31656OooO0OO;
        OooOOO0 oooOOO1 = new OooOOO0(activity, this.f44675OooO00o.f32958OoooO0O, new oOo00OO0(this));
        this.f44677OooO0OO = oooOOO1;
        if (OooOO0O.f31657OooO0Oo == null) {
            OooOO0O.f31657OooO0Oo = Executors.newSingleThreadExecutor();
        }
        oooOOO1.f33011OooO0o0 = OooOO0O.f31657OooO0Oo;
        View view = this.f44675OooO00o.f32161Oooo0o;
        if (view != null) {
            view.setFocusable(false);
            view.setClickable(false);
        }
        OooO0o oooO0o2 = this.f44675OooO00o;
        if (oooO0o2 != null) {
            oooO0o2.f32957OoooO0.OooO0O0();
            this.f44675OooO00o.f32958OoooO0O.OooO0O0();
        }
    }

    public final void OooO00o() {
        if (this.f44676OooO0O0.f33008OooO0OO || this.f44677OooO0OO.f33008OooO0OO) {
            return;
        }
        OooO0o oooO0o = this.f44675OooO00o;
        if (oooO0o != null) {
            oooO0o.OooO0Oo(8);
        }
        this.f44678OooO0Oo = false;
    }
}
