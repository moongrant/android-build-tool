package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements o000O00O.OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ View f8391OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f8392OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooO0O0.OooO0OO f8393OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0o.OooO0OO f8394OooO0Oo;

    public OooOO0(View view, ViewGroup viewGroup, OooO0O0.OooO0OO oooO0OO, o000O0o.OooO0OO oooO0OO2) {
        this.f8391OooO00o = view;
        this.f8392OooO0O0 = viewGroup;
        this.f8393OooO0OO = oooO0OO;
        this.f8394OooO0Oo = oooO0OO2;
    }

    @Override // o000O00O.OooO0o.OooO00o
    public final void onCancel() {
        this.f8391OooO00o.clearAnimation();
        this.f8392OooO0O0.endViewTransition(this.f8391OooO00o);
        this.f8393OooO0OO.OooO00o();
        if (FragmentManager.Oooo0oO(2)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Animation from operation ");
            sbOooO0o0.append(this.f8394OooO0Oo);
            sbOooO0o0.append(" has been cancelled.");
            Log.v("FragmentManager", sbOooO0o0.toString());
        }
    }
}
