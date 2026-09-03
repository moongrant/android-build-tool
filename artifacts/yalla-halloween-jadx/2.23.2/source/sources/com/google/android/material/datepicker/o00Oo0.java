package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 implements androidx.core.view.o000000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f16471OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f16472OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View f16473OooO0o0;

    public o00Oo0(int i, View view, int i2) {
        this.f16471OooO0Oo = i;
        this.f16473OooO0o0 = view;
        this.f16472OooO0o = i2;
    }

    @Override // androidx.core.view.o000000O
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = windowInsetsCompat.OooO00o(7).f33478OooO0O0;
        View view2 = this.f16473OooO0o0;
        int i2 = this.f16471OooO0Oo;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f16472OooO0o + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return windowInsetsCompat;
    }
}
