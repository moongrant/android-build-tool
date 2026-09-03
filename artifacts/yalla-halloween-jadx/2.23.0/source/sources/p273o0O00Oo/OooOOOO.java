package p273o0O00Oo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import p079o000Oo0o.o000OO00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f41732OooO0Oo;

    public OooOOOO(OooOo00 oooOo00) {
        this.f41732OooO0Oo = oooOo00;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        OooOo00 oooOo00 = this.f41732OooO0Oo;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        ArrayList arrayList = oooOo00.f41736OooO;
        if (arrayList == null || oooOo00.f41742OooOO0) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o000OO00) it.next()).OooO00o(oooOo00);
        }
    }
}
