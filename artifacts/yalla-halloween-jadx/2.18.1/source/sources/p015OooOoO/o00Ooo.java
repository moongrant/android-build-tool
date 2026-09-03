package p015OooOoO;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import o000O0O.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o00Ooo extends o00O0O implements SubMenu {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0OO f296OooO0o0;

    public o00Ooo(Context context, OooO0OO oooO0OO) {
        super(context, oooO0OO);
        this.f296OooO0o0 = oooO0OO;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f296OooO0o0.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return OooO0OO(this.f296OooO0o0.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        this.f296OooO0o0.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        this.f296OooO0o0.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f296OooO0o0.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f296OooO0o0.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f296OooO0o0.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f296OooO0o0.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f296OooO0o0.setIcon(drawable);
        return this;
    }
}
