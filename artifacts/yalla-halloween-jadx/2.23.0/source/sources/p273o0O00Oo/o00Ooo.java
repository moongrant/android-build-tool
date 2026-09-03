package p273o0O00Oo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p079o000Oo0o.o000OO00;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo000o f41763OooO0Oo;

    public o00Ooo(oo000o oo000oVar) {
        this.f41763OooO0Oo = oo000oVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        oo000o oo000oVar = this.f41763OooO0Oo;
        oo000oVar.OooO00o();
        o000OO00 o000oo01 = oo000oVar.f41775OooOO0O;
        if (o000oo01 != null) {
            o000oo01.OooO00o(oo000oVar.f41748OooO00o);
        }
    }
}
