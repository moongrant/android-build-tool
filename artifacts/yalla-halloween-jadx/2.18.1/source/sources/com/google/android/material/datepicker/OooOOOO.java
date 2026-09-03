package com.google.android.material.datepicker;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends RecyclerView.o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oo000o f16968OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f16969OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f16970OooO0OO;

    public OooOOOO(OooOO0O oooOO0O, oo000o oo000oVar, MaterialButton materialButton) {
        this.f16970OooO0OO = oooOO0O;
        this.f16968OooO00o = oo000oVar;
        this.f16969OooO0O0 = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f16969OooO0O0.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    public final void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        int iFindFirstVisibleItemPosition = i < 0 ? this.f16970OooO0OO.OooO0O0().findFirstVisibleItemPosition() : this.f16970OooO0OO.OooO0O0().findLastVisibleItemPosition();
        this.f16970OooO0OO.f16954OoooO00 = this.f16968OooO00o.OooO00o(iFindFirstVisibleItemPosition);
        this.f16969OooO0O0.setText(this.f16968OooO00o.OooO00o(iFindFirstVisibleItemPosition).OooO0oO());
    }
}
