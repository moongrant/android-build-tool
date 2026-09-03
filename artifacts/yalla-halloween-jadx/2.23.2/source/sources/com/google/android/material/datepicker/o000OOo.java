package com.google.android.material.datepicker;

import androidx.annotation.Nullable;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo extends OooO0o {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f16463OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f16464OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ SingleDateSelector f16465OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, o00oO0o.OooO00o oooO00o, TextInputLayout textInputLayout2) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f16465OooOO0o = singleDateSelector;
        this.f16463OooOO0 = oooO00o;
        this.f16464OooOO0O = textInputLayout2;
    }

    @Override // com.google.android.material.datepicker.OooO0o
    public final void OooO00o() {
        this.f16465OooOO0o.f16454OooO0Oo = this.f16464OooOO0O.getError();
        this.f16463OooOO0.OooO00o();
    }

    @Override // com.google.android.material.datepicker.OooO0o
    public final void OooO0O0(@Nullable Long l) {
        SingleDateSelector singleDateSelector = this.f16465OooOO0o;
        if (l == null) {
            singleDateSelector.f16455OooO0o0 = null;
        } else {
            singleDateSelector.o0000OOO(l.longValue());
        }
        singleDateSelector.f16454OooO0Oo = null;
        this.f16463OooOO0.OooO0O0(singleDateSelector.f16455OooO0o0);
    }
}
