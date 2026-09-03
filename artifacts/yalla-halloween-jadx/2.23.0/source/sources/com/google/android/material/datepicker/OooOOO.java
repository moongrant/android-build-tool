package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MonthsPagerAdapter f16892OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f16893OooO0o0;

    public OooOOO(OooOo00 oooOo00, MonthsPagerAdapter monthsPagerAdapter) {
        this.f16893OooO0o0 = oooOo00;
        this.f16892OooO0Oo = monthsPagerAdapter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OooOo00 oooOo00 = this.f16893OooO0o0;
        int iFindLastVisibleItemPosition = ((LinearLayoutManager) oooOo00.f16910OooOOO0.getLayoutManager()).findLastVisibleItemPosition() - 1;
        if (iFindLastVisibleItemPosition >= 0) {
            Calendar calendarOooO0Oo = o0000.OooO0Oo(this.f16892OooO0Oo.f16864OooO00o.f16805OooO0Oo.f16858OooO0Oo);
            calendarOooO0Oo.add(2, iFindLastVisibleItemPosition);
            oooOo00.OooO0OO(new Month(calendarOooO0Oo));
        }
    }
}
