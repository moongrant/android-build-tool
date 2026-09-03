package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.OooO0o;
import androidx.appcompat.view.menu.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0O0 extends OooO0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NonNull
    public final Class<?> f17469OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f17470OooOoOO;

    public OooO0O0(@NonNull Context context, @NonNull Class<?> cls, int i) {
        super(context);
        this.f17469OooOoO = cls;
        this.f17470OooOoOO = i;
    }

    @Override // androidx.appcompat.view.menu.OooO0o
    @NonNull
    public final MenuItem OooO00o(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        if (size() + 1 <= this.f17470OooOoOO) {
            OooOooO();
            MenuItem menuItemOooO00o = super.OooO00o(i, i2, i3, charSequence);
            ((OooOO0) menuItemOooO00o).OooOO0O(true);
            OooOoo();
            return menuItemOooO00o;
        }
        String simpleName = this.f17469OooOoO.getSimpleName();
        StringBuilder sbOooO0OO = OooO0o.OooO0o.OooO0OO("Maximum number of items supported by ", simpleName, " is ");
        sbOooO0OO.append(this.f17470OooOoOO);
        sbOooO0OO.append(". Limit can be checked with ");
        sbOooO0OO.append(simpleName);
        sbOooO0OO.append("#getMaxItemCount()");
        throw new IllegalArgumentException(sbOooO0OO.toString());
    }

    @Override // androidx.appcompat.view.menu.OooO0o, android.view.Menu
    @NonNull
    public final SubMenu addSubMenu(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f17469OooOoO.getSimpleName() + " does not support submenus");
    }
}
