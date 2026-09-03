package p184o00o000o;

import android.view.animation.Animation;
import o00Oo00.OooO0OO;
import p034OoooO0O.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f33003OooO00o;

    public OooOO0O(OooOOO0 oooOOO0) {
        this.f33003OooO00o = oooOOO0;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        OooOo oooOo = this.f33003OooO00o.f33006OooO00o;
        oooOo.f33026Ooooo00 = -1L;
        oooOo.f33025OoooOoo = 0;
        oooOo.f33028OooooO0 = false;
        o0Oo0oo.OooO0o0(567, oooOo.f32163Oooo0oo);
        OooO0OO<Boolean> oooO0OO = this.f33003OooO00o.f33010OooO0o;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(Boolean.FALSE);
        }
        try {
            if (this.f33003OooO00o.OooO0OO().size() > 0) {
                this.f33003OooO00o.OooO0OO().remove(0);
            }
            if (this.f33003OooO00o.OooO0OO().size() > 0) {
                OooOOO0 oooOOO0 = this.f33003OooO00o;
                oooOOO0.OooO0Oo(oooOOO0.OooO0OO().get(0));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
