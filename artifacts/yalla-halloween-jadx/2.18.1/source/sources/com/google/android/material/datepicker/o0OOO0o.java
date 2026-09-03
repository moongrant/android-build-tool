package com.google.android.material.datepicker;

import androidx.annotation.Nullable;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o extends OooO0OO {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f17008OoooO;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f17009OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ o00oO0o f17010OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ RangeDateSelector f17011o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(RangeDateSelector rangeDateSelector, String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, o00oO0o o00oo0o2) {
        super(str, dateFormat, textInputLayout, calendarConstraints);
        this.f17011o000oOoO = rangeDateSelector;
        this.f17009OoooO0O = textInputLayout2;
        this.f17008OoooO = textInputLayout3;
        this.f17010OoooOO0 = o00oo0o2;
    }

    @Override // com.google.android.material.datepicker.OooO0OO
    public final void OooO00o() {
        RangeDateSelector rangeDateSelector = this.f17011o000oOoO;
        rangeDateSelector.f16979Oooo = null;
        RangeDateSelector.OooO00o(rangeDateSelector, this.f17009OoooO0O, this.f17008OoooO, this.f17010OoooOO0);
    }

    @Override // com.google.android.material.datepicker.OooO0OO
    public final void OooO0O0(@Nullable Long l) {
        RangeDateSelector rangeDateSelector = this.f17011o000oOoO;
        rangeDateSelector.f16979Oooo = l;
        RangeDateSelector.OooO00o(rangeDateSelector, this.f17009OoooO0O, this.f17008OoooO, this.f17010OoooOO0);
    }
}
