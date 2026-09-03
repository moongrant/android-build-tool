package androidx.fragment.app;

import android.animation.Animator;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements o000O00O.OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Animator f8389OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o000O0o.OooO0OO f8390OooO0O0;

    public OooO0o(Animator animator, o000O0o.OooO0OO oooO0OO) {
        this.f8389OooO00o = animator;
        this.f8390OooO0O0 = oooO0OO;
    }

    @Override // o000O00O.OooO0o.OooO00o
    public final void onCancel() {
        this.f8389OooO00o.end();
        if (FragmentManager.Oooo0oO(2)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Animator from operation ");
            sbOooO0o0.append(this.f8390OooO0O0);
            sbOooO0o0.append(" has been canceled.");
            Log.v("FragmentManager", sbOooO0o0.toString());
        }
    }
}
