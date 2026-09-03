package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOO0O extends androidx.appcompat.view.menu.OooO0o {
    public OooOO0O(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.OooO0o, android.view.Menu
    @NonNull
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        androidx.appcompat.view.menu.OooOO0 oooOO1 = (androidx.appcompat.view.menu.OooOO0) OooO00o(i, i2, i3, charSequence);
        OooOOO oooOOO = new OooOOO(this.f4706OooO00o, this, oooOO1);
        oooOO1.OooOOO0(oooOOO);
        return oooOOO;
    }
}
