package o0OOO0O0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f38083Oooo0o;

    public OooOOO0(OooOOOO oooOOOO) {
        this.f38083Oooo0o = oooOOOO;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o000oo00.OooOO0O>] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        OooOOOO oooOOOO = this.f38083Oooo0o;
        ?? r0 = oooOOOO.f38090OoooO0;
        if (r0 == 0 || oooOOOO.f38092OoooO0O) {
            return;
        }
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((p103o000oo00.OooOO0O) it.next()).OooO0O0();
        }
    }
}
