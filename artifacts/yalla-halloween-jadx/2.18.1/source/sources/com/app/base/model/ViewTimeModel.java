package com.app.base.model;

import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ViewTimeModel {
    public long time;
    public TextView tvTime;

    public ViewTimeModel(TextView textView, long j) {
        this.tvTime = textView;
        this.time = j;
    }
}
