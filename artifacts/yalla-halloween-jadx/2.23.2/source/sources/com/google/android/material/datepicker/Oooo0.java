package com.google.android.material.datepicker;

import android.view.View;
import androidx.annotation.NonNull;
import p272o0O0000o.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 extends androidx.core.view.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f16444OooO00o;

    public Oooo0(OooOo00 oooOo00) {
        this.f16444OooO00o = oooOo00;
    }

    @Override // androidx.core.view.OooO00o
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull o0000O.o0O0O00 o0o0o00) {
        super.onInitializeAccessibilityNodeInfo(view, o0o0o00);
        OooOo00 oooOo00 = this.f16444OooO00o;
        o0o0o00.OooOOOO(oooOo00.f16440OooOOo0.getVisibility() == 0 ? oooOo00.getString(o0000O0.mtrl_picker_toggle_to_year_selection) : oooOo00.getString(o0000O0.mtrl_picker_toggle_to_day_selection));
    }
}
