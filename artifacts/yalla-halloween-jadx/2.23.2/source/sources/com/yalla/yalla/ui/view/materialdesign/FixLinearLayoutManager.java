package com.yalla.yalla.ui.view.materialdesign;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class FixLinearLayoutManager extends LinearLayoutManager {
    public FixLinearLayoutManager(Context context, int i) {
        super(context, i, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onLayoutChildren(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        try {
            super.onLayoutChildren(o00ooo2, o0ooo0o2);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public FixLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
