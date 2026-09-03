package com.google.android.material.datepicker;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO extends RecyclerView.o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MonthsPagerAdapter f16939OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f16940OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f16941OooO0OO;

    public o000oOoO(OooOo00 oooOo00, MonthsPagerAdapter monthsPagerAdapter, MaterialButton materialButton) {
        this.f16941OooO0OO = oooOo00;
        this.f16939OooO00o = monthsPagerAdapter;
        this.f16940OooO0O0 = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f16940OooO0O0.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    public final void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        OooOo00 oooOo00 = this.f16941OooO0OO;
        int iFindFirstVisibleItemPosition = i < 0 ? ((LinearLayoutManager) oooOo00.f16910OooOOO0.getLayoutManager()).findFirstVisibleItemPosition() : ((LinearLayoutManager) oooOo00.f16910OooOOO0.getLayoutManager()).findLastVisibleItemPosition();
        MonthsPagerAdapter monthsPagerAdapter = this.f16939OooO00o;
        Calendar calendarOooO0Oo = o0000.OooO0Oo(monthsPagerAdapter.f16864OooO00o.f16805OooO0Oo.f16858OooO0Oo);
        calendarOooO0Oo.add(2, iFindFirstVisibleItemPosition);
        oooOo00.f16901OooO = new Month(calendarOooO0Oo);
        Calendar calendarOooO0Oo2 = o0000.OooO0Oo(monthsPagerAdapter.f16864OooO00o.f16805OooO0Oo.f16858OooO0Oo);
        calendarOooO0Oo2.add(2, iFindFirstVisibleItemPosition);
        this.f16940OooO0O0.setText(new Month(calendarOooO0Oo2).OooO0OO());
    }
}
