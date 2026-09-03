package p411o0Oo0Ooo;

import com.google.android.material.appbar.AppBarLayout;
import p408o0Oo0Oo.OooO0o;
import p417o0Oo0oOo.oO00O0oO;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00O0o implements AppBarLayout.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oO00O0oO f39169OooO00o;

    public oO00O0o(oO00O0oO oo00o0oo) {
        this.f39169OooO00o = oo00o0oo;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
    public final void OooO00o(AppBarLayout appBarLayout, int i) {
        oO00O0oO oo00o0oo = this.f39169OooO00o;
        boolean z = i >= 0;
        boolean z2 = appBarLayout.getTotalScrollRange() + i <= 0;
        OooO0o oooO0o = (OooO0o) oo00o0oo;
        oooO0o.f39142OoooO0O = z;
        oooO0o.f39139OoooO = z2;
    }
}
