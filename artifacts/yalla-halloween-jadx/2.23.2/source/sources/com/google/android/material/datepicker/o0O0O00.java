package com.google.android.material.datepicker;

import androidx.annotation.Nullable;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00 extends OooO0o {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f16479OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f16480OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f16481OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ RangeDateSelector f16482OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, o00oO0o.OooO00o oooO00o) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f16482OooOOO0 = rangeDateSelector;
        this.f16479OooOO0 = textInputLayout2;
        this.f16480OooOO0O = textInputLayout3;
        this.f16481OooOO0o = oooO00o;
    }

    @Override // com.google.android.material.datepicker.OooO0o
    public final void OooO00o() {
        RangeDateSelector rangeDateSelector = this.f16482OooOOO0;
        rangeDateSelector.f16448OooO = null;
        RangeDateSelector.OooO00o(rangeDateSelector, this.f16479OooOO0, this.f16480OooOO0O, this.f16481OooOO0o);
    }

    @Override // com.google.android.material.datepicker.OooO0o
    public final void OooO0O0(@Nullable Long l) {
        RangeDateSelector rangeDateSelector = this.f16482OooOOO0;
        rangeDateSelector.f16448OooO = l;
        RangeDateSelector.OooO00o(rangeDateSelector, this.f16479OooOO0, this.f16480OooOO0O, this.f16481OooOO0o);
    }
}
