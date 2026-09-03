package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SparseArray<View> f27132OooO00o = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final View f27133OooO0O0;

    public o00O00o0(Context context, ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.f27133OooO0O0 = viewInflate;
        viewInflate.setTag(this);
    }

    public final <T extends View> T OooO00o(int i) {
        SparseArray<View> sparseArray = this.f27132OooO00o;
        T t = (T) sparseArray.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.f27133OooO0O0.findViewById(i);
        sparseArray.put(i, t2);
        return t2;
    }

    public final void OooO0O0(int i, CharSequence charSequence) {
        TextView textView = (TextView) OooO00o(i);
        if (charSequence == null) {
            charSequence = "";
        }
        textView.setText(charSequence);
    }
}
