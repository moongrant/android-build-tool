package o00O00OO;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0o f36026OooO0Oo;

    public OooO(OooO0o oooO0o) {
        this.f36026OooO0Oo = oooO0o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        OooO0o oooO0o = this.f36026OooO0Oo;
        ArrayList arrayList = new ArrayList(oooO0o.f36045OooO0oo);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((OooO0OO) arrayList.get(i)).OooO00o(oooO0o);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        OooO0o oooO0o = this.f36026OooO0Oo;
        ArrayList arrayList = new ArrayList(oooO0o.f36045OooO0oo);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((OooO0OO) arrayList.get(i)).OooO0O0(oooO0o);
        }
    }
}
