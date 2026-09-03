package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class o000000 extends LinearLayoutManager {

    public class OooO00o extends androidx.recyclerview.widget.o00oO0o {
        @Override // androidx.recyclerview.widget.o00oO0o
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public o000000(Context context, int i) {
        super(context, i, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2, int i) {
        OooO00o oooO00o = new OooO00o(recyclerView.getContext());
        oooO00o.setTargetPosition(i);
        startSmoothScroll(oooO00o);
    }
}
