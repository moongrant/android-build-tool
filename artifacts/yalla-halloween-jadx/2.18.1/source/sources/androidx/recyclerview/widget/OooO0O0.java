package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RecyclerView.Adapter f8883OooO00o;

    public OooO0O0(@NonNull RecyclerView.Adapter adapter) {
        this.f8883OooO00o = adapter;
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO00o(int i, int i2) {
        this.f8883OooO00o.notifyItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO0O0(int i, int i2) {
        this.f8883OooO00o.notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO0OO(int i, int i2) {
        this.f8883OooO00o.notifyItemMoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO0Oo(int i, int i2, Object obj) {
        this.f8883OooO00o.notifyItemRangeChanged(i, i2, obj);
    }
}
