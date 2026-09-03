package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MaterialDatePicker f16990Oooo0o;

    public o000oOoO(MaterialDatePicker materialDatePicker) {
        this.f16990Oooo0o = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialDatePicker materialDatePicker = this.f16990Oooo0o;
        materialDatePicker.f16908Oooooo0.setEnabled(materialDatePicker.OooO00o().o00oO0O());
        this.f16990Oooo0o.f16905OooooOO.toggle();
        MaterialDatePicker materialDatePicker2 = this.f16990Oooo0o;
        materialDatePicker2.OooO0oO(materialDatePicker2.f16905OooooOO);
        this.f16990Oooo0o.OooO0o0();
    }
}
