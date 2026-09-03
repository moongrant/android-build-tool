package com.google.android.material.navigation;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.view.menu.OooOO0O;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0OO extends OooO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NonNull
    public final Class<?> f16980OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f16981OooOoOO;

    public OooO0OO(@NonNull Context context, @NonNull Class<?> cls, int i) {
        super(context);
        this.f16980OooOoO = cls;
        this.f16981OooOoOO = i;
    }

    @Override // androidx.appcompat.view.menu.OooO
    @NonNull
    public final OooOO0O OooO00o(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        int size = size() + 1;
        int i4 = this.f16981OooOoOO;
        if (size <= i4) {
            OooOoO0();
            OooOO0O oooOO0OOooO00o = super.OooO00o(i, i2, i3, charSequence);
            oooOO0OOooO00o.OooO0o(true);
            OooOo();
            return oooOO0OOooO00o;
        }
        String simpleName = this.f16980OooOoO.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i4);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(o0oOO.OooO0O0(sb, simpleName, "#getMaxItemCount()"));
    }

    @Override // androidx.appcompat.view.menu.OooO, android.view.Menu
    @NonNull
    public final SubMenu addSubMenu(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f16980OooOoO.getSimpleName().concat(" does not support submenus"));
    }
}
