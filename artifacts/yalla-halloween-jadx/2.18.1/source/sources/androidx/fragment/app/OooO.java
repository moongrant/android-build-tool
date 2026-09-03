package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000O0o.OooO0OO f8364OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f8365OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ View f8366OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0.OooO0OO f8367OooO0Oo;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO oooO = OooO.this;
            oooO.f8365OooO0O0.endViewTransition(oooO.f8366OooO0OO);
            OooO.this.f8367OooO0Oo.OooO00o();
        }
    }

    public OooO(o000O0o.OooO0OO oooO0OO, ViewGroup viewGroup, View view, OooO0O0.OooO0OO oooO0OO2) {
        this.f8364OooO00o = oooO0OO;
        this.f8365OooO0O0 = viewGroup;
        this.f8366OooO0OO = view;
        this.f8367OooO0Oo = oooO0OO2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f8365OooO0O0.post(new OooO00o());
        if (FragmentManager.Oooo0oO(2)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Animation from operation ");
            sbOooO0o0.append(this.f8364OooO00o);
            sbOooO0o0.append(" has ended.");
            Log.v("FragmentManager", sbOooO0o0.toString());
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (FragmentManager.Oooo0oO(2)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Animation from operation ");
            sbOooO0o0.append(this.f8364OooO00o);
            sbOooO0o0.append(" has reached onAnimationStart.");
            Log.v("FragmentManager", sbOooO0o0.toString());
        }
    }
}
