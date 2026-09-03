package p079o000Oo0o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OOo0 f34986OooO0Oo;

    public o00(o000OOo0 o000ooo1) {
        this.f34986OooO0Oo = o000ooo1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o000OOo0 o000ooo1 = this.f34986OooO0Oo;
        ArrayList arrayList = new ArrayList(o000ooo1.f35005OooO0oo);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o000OO00) arrayList.get(i)).OooO00o(o000ooo1);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        o000OOo0 o000ooo1 = this.f34986OooO0Oo;
        ArrayList arrayList = new ArrayList(o000ooo1.f35005OooO0oo);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o000OO00) arrayList.get(i)).OooO0O0(o000ooo1);
        }
    }
}
