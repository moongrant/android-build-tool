package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements ExtendedFloatingActionButton.OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f17042OooO00o;

    public OooO00o(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.f17042OooO00o = extendedFloatingActionButton;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
    public final ViewGroup.LayoutParams OooO00o() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
    public final int getHeight() {
        return this.f17042OooO00o.getMeasuredHeight();
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
    public final int getPaddingEnd() {
        return this.f17042OooO00o.f16999OooOooo;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
    public final int getPaddingStart() {
        return this.f17042OooO00o.f16998OooOooO;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
    public final int getWidth() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f17042OooO00o;
        return (extendedFloatingActionButton.getMeasuredWidth() - (extendedFloatingActionButton.getCollapsedPadding() * 2)) + extendedFloatingActionButton.f16998OooOooO + extendedFloatingActionButton.f16999OooOooo;
    }
}
