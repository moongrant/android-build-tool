package o0OOO0O0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f38082Oooo0o;

    public OooOOO(OooOOOO oooOOOO) {
        this.f38082Oooo0o = oooOOOO;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o000oo00.OooOO0O>] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        OooOOOO oooOOOO = this.f38082Oooo0o;
        ?? r0 = oooOOOO.f38090OoooO0;
        if (r0 == 0 || oooOOOO.f38092OoooO0O) {
            return;
        }
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((p103o000oo00.OooOO0O) it.next()).OooO00o();
        }
    }
}
