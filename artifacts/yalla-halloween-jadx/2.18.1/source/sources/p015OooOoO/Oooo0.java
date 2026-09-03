package p015OooOoO;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import o000O0O.OooO0O0;
import o000O0O.OooO0OO;
import p021OooOooo.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public abstract class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f266OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o00oO0o<OooO0O0, MenuItem> f267OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o00oO0o<OooO0OO, SubMenu> f268OooO0OO;

    public Oooo0(Context context) {
        this.f266OooO00o = context;
    }

    public final MenuItem OooO0OO(MenuItem menuItem) {
        if (!(menuItem instanceof OooO0O0)) {
            return menuItem;
        }
        OooO0O0 oooO0O0 = (OooO0O0) menuItem;
        if (this.f267OooO0O0 == null) {
            this.f267OooO0O0 = new o00oO0o<>();
        }
        MenuItem orDefault = this.f267OooO0O0.getOrDefault(oooO0O0, null);
        if (orDefault != null) {
            return orDefault;
        }
        o000oOoO o000oooo2 = new o000oOoO(this.f266OooO00o, oooO0O0);
        this.f267OooO0O0.put(oooO0O0, o000oooo2);
        return o000oooo2;
    }

    public final SubMenu OooO0Oo(SubMenu subMenu) {
        if (!(subMenu instanceof OooO0OO)) {
            return subMenu;
        }
        OooO0OO oooO0OO = (OooO0OO) subMenu;
        if (this.f268OooO0OO == null) {
            this.f268OooO0OO = new o00oO0o<>();
        }
        SubMenu orDefault = this.f268OooO0OO.getOrDefault(oooO0OO, null);
        if (orDefault != null) {
            return orDefault;
        }
        o00Ooo o00ooo2 = new o00Ooo(this.f266OooO00o, oooO0OO);
        this.f268OooO0OO.put(oooO0OO, o00ooo2);
        return o00ooo2;
    }
}
