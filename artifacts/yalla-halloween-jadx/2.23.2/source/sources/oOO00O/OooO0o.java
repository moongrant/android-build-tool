package oOO00O;

import androidx.transition.Transition;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements o0000oO.o0OoOo0.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Transition f60121OooO0Oo;

    public OooO0o(Transition transition) {
        this.f60121OooO0Oo = transition;
    }

    @Override // o0000oO.o0OoOo0.OooO00o
    public final void onCancel() {
        this.f60121OooO0Oo.cancel();
    }
}
