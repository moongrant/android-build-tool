package com.chad.library.adapter.base;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import o00OOOO.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o<T extends o00OOOO.OooO00o, K extends BaseViewHolder> extends BaseQuickAdapter<T, K> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public SparseIntArray f10121OooOo;

    public OooO00o(ArrayList arrayList) {
        super(0, arrayList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final int OooO(int i) {
        T t = this.f10111OooOOoo.get(i);
        if (t instanceof o00OOOO.OooO00o) {
            return t.OooO00o();
        }
        return -255;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final K OooOOo0(ViewGroup viewGroup, int i) {
        return OooO0oo(this.f10109OooOOo.inflate(this.f10121OooOo.get(i, -404), viewGroup, false));
    }
}
