package com.google.android.material.floatingactionbutton;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements ExtendedFloatingActionButton.OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton.OooOOO f16570OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f16571OooO0O0;

    public OooO0O0(ExtendedFloatingActionButton extendedFloatingActionButton, OooO00o oooO00o) {
        this.f16571OooO0O0 = extendedFloatingActionButton;
        this.f16570OooO00o = oooO00o;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
    public final ViewGroup.LayoutParams OooO00o() {
        int i = this.f16571OooO0O0.f16533Oooo0o0;
        if (i == 0) {
            i = -2;
        }
        return new ViewGroup.LayoutParams(-1, i);
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
    public final int getHeight() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f16571OooO0O0;
        int i = extendedFloatingActionButton.f16533Oooo0o0;
        ExtendedFloatingActionButton.OooOOO oooOOO = this.f16570OooO00o;
        if (i != -1) {
            return (i == 0 || i == -2) ? oooOOO.getHeight() : i;
        }
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return oooOOO.getHeight();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.height == -2) {
            return oooOOO.getHeight();
        }
        int i2 = 0;
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop() + 0;
        if ((extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) != null) {
            i2 = 0 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return (view.getHeight() - i2) - paddingBottom;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
    public final int getPaddingEnd() {
        return this.f16571OooO0O0.f16526OooOooo;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
    public final int getPaddingStart() {
        return this.f16571OooO0O0.f16525OooOooO;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
    public final int getWidth() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f16571OooO0O0;
        boolean z = extendedFloatingActionButton.getParent() instanceof View;
        ExtendedFloatingActionButton.OooOOO oooOOO = this.f16570OooO00o;
        if (!z) {
            return oooOOO.getWidth();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width == -2) {
            return oooOOO.getWidth();
        }
        int i = 0;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft() + 0;
        if ((extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) != null) {
            i = 0 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return (view.getWidth() - i) - paddingRight;
    }
}
