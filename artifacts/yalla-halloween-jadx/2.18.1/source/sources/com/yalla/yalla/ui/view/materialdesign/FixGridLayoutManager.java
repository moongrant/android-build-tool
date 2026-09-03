package com.yalla.yalla.ui.view.materialdesign;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class FixGridLayoutManager extends GridLayoutManager {
    public FixGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onLayoutChildren(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        try {
            super.onLayoutChildren(o00ooo2, o0ooo0o2);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public FixGridLayoutManager(Context context, int i) {
        super(context, i);
    }
}
