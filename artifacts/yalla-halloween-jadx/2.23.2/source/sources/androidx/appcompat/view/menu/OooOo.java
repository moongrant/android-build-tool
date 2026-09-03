package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class OooOo extends OooO implements SubMenu {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooO f2667OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooOO0O f2668OooOoOO;

    public OooOo(Context context, OooO oooO, OooOO0O oooOO0O) {
        super(context);
        this.f2667OooOoO = oooO;
        this.f2668OooOoOO = oooOO0O;
    }

    @Override // androidx.appcompat.view.menu.OooO
    public final boolean OooO0Oo(OooOO0O oooOO0O) {
        return this.f2667OooOoO.OooO0Oo(oooOO0O);
    }

    @Override // androidx.appcompat.view.menu.OooO
    public final boolean OooO0o(OooOO0O oooOO0O) {
        return this.f2667OooOoO.OooO0o(oooOO0O);
    }

    @Override // androidx.appcompat.view.menu.OooO
    public final boolean OooO0o0(@NonNull OooO oooO, @NonNull MenuItem menuItem) {
        return super.OooO0o0(oooO, menuItem) || this.f2667OooOoO.OooO0o0(oooO, menuItem);
    }

    @Override // androidx.appcompat.view.menu.OooO
    public final String OooOO0() {
        OooOO0O oooOO0O = this.f2668OooOoOO;
        int i = oooOO0O != null ? oooOO0O.f2625OooO00o : 0;
        if (i == 0) {
            return null;
        }
        return android.support.v4.media.OooO00o.OooO00o("android:menu:actionviewstates:", i);
    }

    @Override // androidx.appcompat.view.menu.OooO
    public final OooO OooOO0O() {
        return this.f2667OooOoO.OooOO0O();
    }

    @Override // androidx.appcompat.view.menu.OooO
    public final boolean OooOOO() {
        return this.f2667OooOoO.OooOOO();
    }

    @Override // androidx.appcompat.view.menu.OooO
    public final boolean OooOOO0() {
        return this.f2667OooOoO.OooOOO0();
    }

    @Override // androidx.appcompat.view.menu.OooO
    public final boolean OooOOOO() {
        return this.f2667OooOoO.OooOOOO();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2668OooOoOO;
    }

    @Override // androidx.appcompat.view.menu.OooO, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f2667OooOoO.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        OooOo0o(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        OooOo0o(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        OooOo0o(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f2668OooOoOO.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.OooO, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f2667OooOoO.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        OooOo0o(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        OooOo0o(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f2668OooOoOO.setIcon(i);
        return this;
    }
}
