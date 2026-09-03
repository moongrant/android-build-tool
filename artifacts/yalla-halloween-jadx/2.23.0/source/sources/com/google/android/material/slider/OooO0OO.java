package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.o0OOO0o;
import com.google.android.material.internal.oo0o0Oo;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseSlider f17778OooO0Oo;

    public OooO0OO(BaseSlider baseSlider) {
        this.f17778OooO0Oo = baseSlider;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        BaseSlider baseSlider = this.f17778OooO0Oo;
        o0OOO0o o0ooo0oOooO0Oo = oo0o0Oo.OooO0Oo(baseSlider);
        Iterator it = baseSlider.f17720OooOOO.iterator();
        while (it.hasNext()) {
            o0ooo0oOooO0Oo.f17327OooO00o.remove((o0O0O0O.OooO00o) it.next());
        }
    }
}
