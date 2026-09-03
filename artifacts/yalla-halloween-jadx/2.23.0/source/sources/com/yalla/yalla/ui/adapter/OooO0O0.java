package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooO0O0<T> extends BaseAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f27411OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f27412OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<T> f27413OooO0o0;

    public OooO0O0(int i, Context context, List list) {
        this.f27411OooO0Oo = context;
        this.f27413OooO0o0 = list;
        this.f27412OooO0o = i;
    }

    public abstract void OooO0O0(o00O00OO o00o00oo2, Object obj);

    @Override // android.widget.Adapter
    public final int getCount() {
        List<T> list = this.f27413OooO0o0;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public final T getItem(int i) {
        List<T> list = this.f27413OooO0o0;
        int size = list.size();
        if (i >= list.size()) {
            return list.get(i == 0 ? 0 : size - 1);
        }
        return list.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        o00O00OO o00o00oo2 = view == null ? new o00O00OO(this.f27411OooO0Oo, viewGroup, this.f27412OooO0o) : (o00O00OO) view.getTag();
        OooO0O0(o00o00oo2, getItem(i));
        return o00o00oo2.f27616OooO0O0;
    }
}
