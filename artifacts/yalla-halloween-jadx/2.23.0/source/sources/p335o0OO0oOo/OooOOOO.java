package p335o0OO0oOo;

import com.google.android.material.appbar.AppBarLayout;
import o0OO0oO.OooO00o;
import p389o0OOoooO.o00O0OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO implements AppBarLayout.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00O0OO0 f43254OooO00o;

    public OooOOOO(OooO00o oooO00o) {
        this.f43254OooO00o = oooO00o;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
    public final void OooO00o(AppBarLayout appBarLayout, int i) {
        boolean z = i >= 0;
        boolean z2 = appBarLayout.getTotalScrollRange() + i <= 0;
        OooO00o oooO00o = (OooO00o) this.f43254OooO00o;
        oooO00o.f43223OooOO0 = z;
        oooO00o.f43224OooOO0O = z2;
    }
}
