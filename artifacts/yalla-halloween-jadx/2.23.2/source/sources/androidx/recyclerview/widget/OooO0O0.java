package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RecyclerView.Adapter f10589OooO00o;

    public OooO0O0(@NonNull h3 h3Var) {
        this.f10589OooO00o = h3Var;
    }

    @Override // androidx.recyclerview.widget.o0OOO0o
    public final void OooO00o(int i, int i2) {
        this.f10589OooO00o.notifyItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.o0OOO0o
    public final void OooO0O0(int i, int i2) {
        this.f10589OooO00o.notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.o0OOO0o
    @SuppressLint({"UnknownNullness"})
    public final void OooO0OO(int i, int i2, Object obj) {
        this.f10589OooO00o.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // androidx.recyclerview.widget.o0OOO0o
    public final void OooO0Oo(int i, int i2) {
        this.f10589OooO00o.notifyItemMoved(i, i2);
    }
}
