package com.google.android.material.datepicker;

import android.view.View;
import androidx.annotation.NonNull;
import p270o0O0000o.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 extends androidx.core.view.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f16917OooO00o;

    public Oooo0(OooOo00 oooOo00) {
        this.f16917OooO00o = oooOo00;
    }

    @Override // androidx.core.view.OooO00o
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull o0000O.o0Oo0oo o0oo0oo2) {
        super.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
        OooOo00 oooOo00 = this.f16917OooO00o;
        o0oo0oo2.OooOOO(oooOo00.f16913OooOOo0.getVisibility() == 0 ? oooOo00.getString(o0000O0.mtrl_picker_toggle_to_year_selection) : oooOo00.getString(o0000O0.mtrl_picker_toggle_to_day_selection));
    }
}
