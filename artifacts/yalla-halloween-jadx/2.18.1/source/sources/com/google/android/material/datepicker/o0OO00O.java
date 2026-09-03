package com.google.android.material.datepicker;

import androidx.annotation.Nullable;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O extends OooO0OO {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ SingleDateSelector f17006OoooO;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ o00oO0o f17007OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(SingleDateSelector singleDateSelector, String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, o00oO0o o00oo0o2) {
        super(str, dateFormat, textInputLayout, calendarConstraints);
        this.f17006OoooO = singleDateSelector;
        this.f17007OoooO0O = o00oo0o2;
    }

    @Override // com.google.android.material.datepicker.OooO0OO
    public final void OooO00o() {
        this.f17007OoooO0O.OooO00o();
    }

    @Override // com.google.android.material.datepicker.OooO0OO
    public final void OooO0O0(@Nullable Long l) {
        if (l == null) {
            this.f17006OoooO.f16984Oooo0o = null;
        } else {
            this.f17006OoooO.f16984Oooo0o = Long.valueOf(l.longValue());
        }
        this.f17007OoooO0O.OooO0O0(this.f17006OoooO.f16984Oooo0o);
    }
}
