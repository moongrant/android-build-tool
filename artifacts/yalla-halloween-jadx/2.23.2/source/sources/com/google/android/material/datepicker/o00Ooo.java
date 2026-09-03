package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MaterialDatePicker f16474OooO0Oo;

    public o00Ooo(MaterialDatePicker materialDatePicker) {
        this.f16474OooO0Oo = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialDatePicker materialDatePicker = this.f16474OooO0Oo;
        materialDatePicker.f16375OooOoO.setEnabled(materialDatePicker.OooO0O0().o00000o0());
        materialDatePicker.f16370OooOo.toggle();
        materialDatePicker.OooO0oO(materialDatePicker.f16370OooOo);
        materialDatePicker.OooO0o();
    }
}
