package androidx.fragment.app;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0.OooO f8402Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000O0o.OooO0OO f8403Oooo0oO;

    public OooOOOO(OooO0O0.OooO oooO, o000O0o.OooO0OO oooO0OO) {
        this.f8402Oooo0o = oooO;
        this.f8403Oooo0oO = oooO0OO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8402Oooo0o.OooO00o();
        if (FragmentManager.Oooo0oO(2)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Transition for operation ");
            sbOooO0o0.append(this.f8403Oooo0oO);
            sbOooO0o0.append("has completed");
            Log.v("FragmentManager", sbOooO0o0.toString());
        }
    }
}
