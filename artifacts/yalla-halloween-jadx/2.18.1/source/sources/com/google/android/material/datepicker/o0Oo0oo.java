package com.google.android.material.datepicker;

import androidx.annotation.Nullable;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo extends OooO0OO {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f17012OoooO;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f17013OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ o00oO0o f17014OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ RangeDateSelector f17015o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(RangeDateSelector rangeDateSelector, String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, o00oO0o o00oo0o2) {
        super(str, dateFormat, textInputLayout, calendarConstraints);
        this.f17015o000oOoO = rangeDateSelector;
        this.f17013OoooO0O = textInputLayout2;
        this.f17012OoooO = textInputLayout3;
        this.f17014OoooOO0 = o00oo0o2;
    }

    @Override // com.google.android.material.datepicker.OooO0OO
    public final void OooO00o() {
        RangeDateSelector rangeDateSelector = this.f17015o000oOoO;
        rangeDateSelector.f16983OoooO00 = null;
        RangeDateSelector.OooO00o(rangeDateSelector, this.f17013OoooO0O, this.f17012OoooO, this.f17014OoooOO0);
    }

    @Override // com.google.android.material.datepicker.OooO0OO
    public final void OooO0O0(@Nullable Long l) {
        RangeDateSelector rangeDateSelector = this.f17015o000oOoO;
        rangeDateSelector.f16983OoooO00 = l;
        RangeDateSelector.OooO00o(rangeDateSelector, this.f17013OoooO0O, this.f17012OoooO, this.f17014OoooOO0);
    }
}
