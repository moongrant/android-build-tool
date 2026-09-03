package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.facebook.internal.security.CertificateUtil;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class OooOo00 extends OooO0o implements SubMenu {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public OooO0o f4795OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public OooOO0 f4796OooOoOO;

    public OooOo00(Context context, OooO0o oooO0o, OooOO0 oooOO1) {
        super(context);
        this.f4795OooOoO = oooO0o;
        this.f4796OooOoOO = oooOO1;
    }

    @Override // androidx.appcompat.view.menu.OooO0o
    public final boolean OooO0o(@NonNull OooO0o oooO0o, @NonNull MenuItem menuItem) {
        return super.OooO0o(oooO0o, menuItem) || this.f4795OooOoO.OooO0o(oooO0o, menuItem);
    }

    @Override // androidx.appcompat.view.menu.OooO0o
    public final boolean OooO0o0(OooOO0 oooOO1) {
        return this.f4795OooOoO.OooO0o0(oooOO1);
    }

    @Override // androidx.appcompat.view.menu.OooO0o
    public final boolean OooO0oO(OooOO0 oooOO1) {
        return this.f4795OooOoO.OooO0oO(oooOO1);
    }

    @Override // androidx.appcompat.view.menu.OooO0o
    public final String OooOO0O() {
        OooOO0 oooOO1 = this.f4796OooOoOO;
        int i = oooOO1 != null ? oooOO1.f4730OooO00o : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates" + CertificateUtil.DELIMITER + i;
    }

    @Override // androidx.appcompat.view.menu.OooO0o
    public final OooO0o OooOO0o() {
        return this.f4795OooOoO.OooOO0o();
    }

    @Override // androidx.appcompat.view.menu.OooO0o
    public final boolean OooOOO() {
        return this.f4795OooOoO.OooOOO();
    }

    @Override // androidx.appcompat.view.menu.OooO0o
    public final boolean OooOOOO() {
        return this.f4795OooOoO.OooOOOO();
    }

    @Override // androidx.appcompat.view.menu.OooO0o
    public final boolean OooOOOo() {
        return this.f4795OooOoO.OooOOOo();
    }

    @Override // androidx.appcompat.view.menu.OooO0o
    public final void OooOoOO(OooO0o.OooO00o oooO00o) {
        this.f4795OooOoO.OooOoOO(oooO00o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f4796OooOoOO;
    }

    @Override // androidx.appcompat.view.menu.OooO0o, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f4795OooOoO.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        OooOoo0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        OooOoo0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        OooOoo0(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f4796OooOoOO.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.OooO0o, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f4795OooOoO.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        OooOoo0(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        OooOoo0(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f4796OooOoOO.setIcon(i);
        return this;
    }
}
