package com.google.android.material.internal;

import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOo00 extends androidx.appcompat.view.menu.OooO {
    @Override // androidx.appcompat.view.menu.OooO, android.view.Menu
    @NonNull
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        androidx.appcompat.view.menu.OooOO0O oooOO0OOooO00o = OooO00o(i, i2, i3, charSequence);
        Oooo000 oooo000 = new Oooo000(this.f2570OooO00o, this, oooOO0OOooO00o);
        oooOO0OOooO00o.f2638OooOOOO = oooo000;
        oooo000.setHeaderTitle(oooOO0OOooO00o.f2630OooO0o0);
        return oooo000;
    }
}
