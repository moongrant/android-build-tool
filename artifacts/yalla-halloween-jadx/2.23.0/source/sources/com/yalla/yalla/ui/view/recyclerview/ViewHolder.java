package com.yalla.yalla.ui.view.recyclerview;

import android.view.View;
import android.widget.LinearLayout;
import com.chad.library.adapter.base.BaseViewHolder;

/* JADX INFO: loaded from: classes5.dex */
public class ViewHolder extends BaseViewHolder {
    public ViewHolder(View view) {
        super(view);
    }

    public ViewHolder removeViewOnClickListener(int i) {
        getView(i).setOnClickListener(null);
        return this;
    }

    public ViewHolder setEnable(int i, boolean z) {
        getView(i).setEnabled(z);
        return this;
    }

    public ViewHolder setLinearLayoutGravity(int i, int i2) {
        ((LinearLayout) getView(i)).setGravity(i2);
        return this;
    }

    public ViewHolder setViewOnClickListener(int i, View.OnClickListener onClickListener) {
        getView(i).setOnClickListener(onClickListener);
        return this;
    }

    public ViewHolder setViewOnLongClickListener(int i, View.OnLongClickListener onLongClickListener) {
        getView(i).setOnLongClickListener(onLongClickListener);
        return this;
    }
}
