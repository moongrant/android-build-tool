package com.google.android.material.datepicker;

import android.view.View;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f16461OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ YearGridAdapter f16462OooO0o0;

    public o0000O00(YearGridAdapter yearGridAdapter, int i) {
        this.f16462OooO0o0 = yearGridAdapter;
        this.f16461OooO0Oo = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        YearGridAdapter yearGridAdapter = this.f16462OooO0o0;
        Month monthOooO00o = Month.OooO00o(this.f16461OooO0Oo, yearGridAdapter.f16456OooO00o.f16428OooO.f16387OooO0o0);
        OooOo00<?> oooOo00 = yearGridAdapter.f16456OooO00o;
        CalendarConstraints calendarConstraints = oooOo00.f16431OooO0oO;
        Month month = calendarConstraints.f16332OooO0Oo;
        Calendar calendar = month.f16385OooO0Oo;
        Calendar calendar2 = monthOooO00o.f16385OooO0Oo;
        if (calendar2.compareTo(calendar) < 0) {
            monthOooO00o = month;
        } else {
            Month month2 = calendarConstraints.f16334OooO0o0;
            if (calendar2.compareTo(month2.f16385OooO0Oo) > 0) {
                monthOooO00o = month2;
            }
        }
        oooOo00.OooO0OO(monthOooO00o);
        oooOo00.OooO0Oo(OooOo00.OooO0o.DAY);
    }
}
