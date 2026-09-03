package androidx.appcompat.view.menu;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CascadingMenuPopup.OooO0o f2604OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO f2605OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MenuItem f2606OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ CascadingMenuPopup.OooO0OO f2607OooO0oO;

    public OooO0O0(CascadingMenuPopup.OooO0OO oooO0OO, CascadingMenuPopup.OooO0o oooO0o, OooOO0O oooOO0O, OooO oooO) {
        this.f2607OooO0oO = oooO0OO;
        this.f2604OooO0Oo = oooO0o;
        this.f2606OooO0o0 = oooOO0O;
        this.f2605OooO0o = oooO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CascadingMenuPopup.OooO0o oooO0o = this.f2604OooO0Oo;
        if (oooO0o != null) {
            CascadingMenuPopup.OooO0OO oooO0OO = this.f2607OooO0oO;
            CascadingMenuPopup.this.f2544OooOooO = true;
            oooO0o.f2549OooO0O0.OooO0OO(false);
            CascadingMenuPopup.this.f2544OooOooO = false;
        }
        MenuItem menuItem = this.f2606OooO0o0;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f2605OooO0o.OooOOo0(menuItem, null, 4);
        }
    }
}
