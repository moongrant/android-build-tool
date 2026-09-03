package p339o0OO0oo0;

import com.google.android.material.appbar.AppBarLayout;
import p337o0OO0oOO.OooOOOO;
import p338o0OO0oOo.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO implements AppBarLayout.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOo f42524OooO00o;

    public OooOOO(OooOOOO oooOOOO) {
        this.f42524OooO00o = oooOOOO;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
    public final void OooO00o(AppBarLayout appBarLayout, int i) {
        boolean z = i >= 0;
        boolean z2 = appBarLayout.getTotalScrollRange() + i <= 0;
        OooOOOO oooOOOO = (OooOOOO) this.f42524OooO00o;
        oooOOOO.f42518OooOO0 = z;
        oooOOOO.f42519OooOO0O = z2;
    }
}
