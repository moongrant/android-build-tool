package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o000O0o.OooO0OO f8384Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f8385Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ View f8386Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f8387Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ OooO0O0.OooO0OO f8388OoooO00;

    public OooO0OO(ViewGroup viewGroup, View view, boolean z, o000O0o.OooO0OO oooO0OO, OooO0O0.OooO0OO oooO0OO2) {
        this.f8385Oooo0o = viewGroup;
        this.f8386Oooo0oO = view;
        this.f8387Oooo0oo = z;
        this.f8384Oooo = oooO0OO;
        this.f8388OoooO00 = oooO0OO2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f8385Oooo0o.endViewTransition(this.f8386Oooo0oO);
        if (this.f8387Oooo0oo) {
            p016OooOoO0.OooOo00.OooO00o(this.f8384Oooo.f8493OooO00o, this.f8386Oooo0oO);
        }
        this.f8388OoooO00.OooO00o();
        if (FragmentManager.Oooo0oO(2)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Animator from operation ");
            sbOooO0o0.append(this.f8384Oooo);
            sbOooO0o0.append(" has ended.");
            Log.v("FragmentManager", sbOooO0o0.toString());
        }
    }
}
