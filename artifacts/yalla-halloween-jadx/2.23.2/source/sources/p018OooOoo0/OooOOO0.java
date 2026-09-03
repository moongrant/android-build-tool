package p018OooOoo0;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import o0000.OooO0O0;
import o0000.OooO0OO;
import p190o00o0O.OooOo;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f373OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOo<OooO0O0, MenuItem> f374OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooOo<OooO0OO, SubMenu> f375OooO0OO;

    public OooOOO0(Context context) {
        this.f373OooO00o = context;
    }

    public final MenuItem OooO0OO(MenuItem menuItem) {
        if (!(menuItem instanceof OooO0O0)) {
            return menuItem;
        }
        OooO0O0 oooO0O0 = (OooO0O0) menuItem;
        if (this.f374OooO0O0 == null) {
            this.f374OooO0O0 = new OooOo<>();
        }
        MenuItem orDefault = this.f374OooO0O0.getOrDefault(oooO0O0, null);
        if (orDefault != null) {
            return orDefault;
        }
        OooOOOO oooOOOO = new OooOOOO(this.f373OooO00o, oooO0O0);
        this.f374OooO0O0.put(oooO0O0, oooOOOO);
        return oooOOOO;
    }

    public final SubMenu OooO0Oo(SubMenu subMenu) {
        if (!(subMenu instanceof OooO0OO)) {
            return subMenu;
        }
        OooO0OO oooO0OO = (OooO0OO) subMenu;
        if (this.f375OooO0OO == null) {
            this.f375OooO0OO = new OooOo<>();
        }
        SubMenu orDefault = this.f375OooO0OO.getOrDefault(oooO0OO, null);
        if (orDefault != null) {
            return orDefault;
        }
        Oooo0 oooo0 = new Oooo0(this.f373OooO00o, oooO0OO);
        this.f375OooO0OO.put(oooO0OO, oooo0);
        return oooo0;
    }
}
