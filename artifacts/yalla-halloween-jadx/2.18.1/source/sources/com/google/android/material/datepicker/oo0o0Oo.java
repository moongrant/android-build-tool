package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class oo0o0Oo extends LinearLayoutManager {

    public class OooO00o extends androidx.recyclerview.widget.oo000o {
        public OooO00o(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.oo000o
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public oo0o0Oo(Context context, int i) {
        super(context, i, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2, int i) {
        OooO00o oooO00o = new OooO00o(recyclerView.getContext());
        oooO00o.setTargetPosition(i);
        startSmoothScroll(oooO00o);
    }
}
