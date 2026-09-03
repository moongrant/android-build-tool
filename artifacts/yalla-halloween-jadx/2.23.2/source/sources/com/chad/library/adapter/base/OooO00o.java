package com.chad.library.adapter.base;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import p176o00Ooooo.o00OO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o<T extends o00OO, K extends BaseViewHolder> extends BaseQuickAdapter<T, K> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public SparseIntArray f13199OooOo;

    public OooO00o(ArrayList arrayList) {
        super(0, arrayList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final int OooO(int i) {
        T t = this.f13189OooOOoo.get(i);
        if (t instanceof o00OO) {
            return t.OooO00o();
        }
        return -255;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final K OooOOo0(ViewGroup viewGroup, int i) {
        return OooO0oo(this.f13187OooOOo.inflate(this.f13199OooOo.get(i, -404), viewGroup, false));
    }
}
