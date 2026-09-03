package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MonthsPagerAdapter f16942OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f16943OooO0o0;

    public o00O0O(OooOo00 oooOo00, MonthsPagerAdapter monthsPagerAdapter) {
        this.f16943OooO0o0 = oooOo00;
        this.f16942OooO0Oo = monthsPagerAdapter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OooOo00 oooOo00 = this.f16943OooO0o0;
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) oooOo00.f16910OooOOO0.getLayoutManager()).findFirstVisibleItemPosition() + 1;
        if (iFindFirstVisibleItemPosition < oooOo00.f16910OooOOO0.getAdapter().getItemCount()) {
            Calendar calendarOooO0Oo = o0000.OooO0Oo(this.f16942OooO0Oo.f16864OooO00o.f16805OooO0Oo.f16858OooO0Oo);
            calendarOooO0Oo.add(2, iFindFirstVisibleItemPosition);
            oooOo00.OooO0OO(new Month(calendarOooO0Oo));
        }
    }
}
