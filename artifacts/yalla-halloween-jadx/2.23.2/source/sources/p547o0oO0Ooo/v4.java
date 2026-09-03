package p547o0oO0Ooo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import o00O00OO.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class v4 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x4 f55836OooO0Oo;

    public v4(x4 x4Var) {
        this.f55836OooO0Oo = x4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        x4 x4Var = this.f55836OooO0Oo;
        ArrayList arrayList = x4Var.f55839OooO;
        if (arrayList == null || x4Var.f55845OooOO0) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((OooO0OO) it.next()).OooO0O0(x4Var);
        }
    }
}
