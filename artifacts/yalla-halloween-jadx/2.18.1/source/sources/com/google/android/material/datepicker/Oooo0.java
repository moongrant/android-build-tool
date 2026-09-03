package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements o000O0O0.oo000o {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f16974Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ View f16975Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f16976Oooo0oo;

    public Oooo0(int i, View view, int i2) {
        this.f16974Oooo0o = i;
        this.f16975Oooo0oO = view;
        this.f16976Oooo0oo = i2;
    }

    @Override // o000O0O0.oo000o
    public final WindowInsetsCompat OooO00o(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = windowInsetsCompat.OooO0Oo(7).f28163OooO0O0;
        if (this.f16974Oooo0o >= 0) {
            this.f16975Oooo0oO.getLayoutParams().height = this.f16974Oooo0o + i;
            View view2 = this.f16975Oooo0oO;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.f16975Oooo0oO;
        view3.setPadding(view3.getPaddingLeft(), this.f16976Oooo0oo + i, this.f16975Oooo0oO.getPaddingRight(), this.f16975Oooo0oO.getPaddingBottom());
        return windowInsetsCompat;
    }
}
