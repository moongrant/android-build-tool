package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f16985Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000000O f16986Oooo0oO;

    public o000000(o000000O o000000o2, int i) {
        this.f16986Oooo0oO = o000000o2;
        this.f16985Oooo0o = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Month monthOooO0O0 = Month.OooO0O0(this.f16985Oooo0o, this.f16986Oooo0oO.f16987OooO00o.f16954OoooO00.f16915Oooo0oO);
        CalendarConstraints calendarConstraints = this.f16986Oooo0oO.f16987OooO00o.f16949Oooo;
        if (monthOooO0O0.compareTo(calendarConstraints.f16868Oooo0o) < 0) {
            monthOooO0O0 = calendarConstraints.f16868Oooo0o;
        } else if (monthOooO0O0.compareTo(calendarConstraints.f16869Oooo0oO) > 0) {
            monthOooO0O0 = calendarConstraints.f16869Oooo0oO;
        }
        this.f16986Oooo0oO.f16987OooO00o.OooO0Oo(monthOooO0O0);
        this.f16986Oooo0oO.f16987OooO00o.OooO0o0(1);
    }
}
