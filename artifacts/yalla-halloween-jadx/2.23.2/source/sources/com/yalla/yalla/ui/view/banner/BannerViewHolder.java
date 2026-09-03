package com.yalla.yalla.ui.view.banner;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class BannerViewHolder extends RecyclerView.o0O0O00 {
    private final Context mContext;
    private final View mConvertView;
    private final SparseArray<View> mViews;
    private int position;

    public BannerViewHolder(Context context, View view, ViewGroup viewGroup) {
        super(view);
        this.mContext = context;
        this.mConvertView = view;
        this.mViews = new SparseArray<>();
    }

    public static BannerViewHolder create(Context context, ViewGroup viewGroup, int i) {
        return new BannerViewHolder(context, LayoutInflater.from(context).inflate(i, viewGroup, false), viewGroup);
    }

    public <T extends View> T getView(int i) {
        T t = (T) this.mViews.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.mConvertView.findViewById(i);
        this.mViews.put(i, t2);
        return t2;
    }

    public void updatePosition(int i) {
        this.position = i;
    }
}
