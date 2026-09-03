package p547o0oO0Ooo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import o00O00OO.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class w4 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x4 f55837OooO0Oo;

    public w4(x4 x4Var) {
        this.f55837OooO0Oo = x4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        x4 x4Var = this.f55837OooO0Oo;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        ArrayList arrayList = x4Var.f55839OooO;
        if (arrayList == null || x4Var.f55845OooOO0) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((OooO0OO) it.next()).OooO00o(x4Var);
        }
    }
}
