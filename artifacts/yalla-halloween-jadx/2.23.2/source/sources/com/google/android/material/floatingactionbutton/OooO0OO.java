package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO implements ExtendedFloatingActionButton.OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton.OooOOO f16572OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton.OooOOO f16573OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f16574OooO0OO;

    public OooO0OO(ExtendedFloatingActionButton extendedFloatingActionButton, OooO0O0 oooO0O0, OooO00o oooO00o) {
        this.f16574OooO0OO = extendedFloatingActionButton;
        this.f16572OooO00o = oooO0O0;
        this.f16573OooO0O0 = oooO00o;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
    public final ViewGroup.LayoutParams OooO00o() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f16574OooO0OO;
        int i = extendedFloatingActionButton.f16532Oooo0OO;
        if (i == 0) {
            i = -2;
        }
        int i2 = extendedFloatingActionButton.f16533Oooo0o0;
        return new ViewGroup.LayoutParams(i, i2 != 0 ? i2 : -2);
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
    public final int getHeight() {
        int i = this.f16574OooO0OO.f16533Oooo0o0;
        if (i == -1) {
            return this.f16572OooO00o.getHeight();
        }
        return (i == 0 || i == -2) ? this.f16573OooO0O0.getHeight() : i;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
    public final int getPaddingEnd() {
        return this.f16574OooO0OO.f16526OooOooo;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
    public final int getPaddingStart() {
        return this.f16574OooO0OO.f16525OooOooO;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
    public final int getWidth() {
        int i = this.f16574OooO0OO.f16532Oooo0OO;
        if (i == -1) {
            return this.f16572OooO00o.getWidth();
        }
        return (i == 0 || i == -2) ? this.f16573OooO0O0.getWidth() : i;
    }
}
