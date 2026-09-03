package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RecyclerView.Adapter f7501OooO00o;

    public OooO0O0(@NonNull p400o0Oo0OO.OooOO0O oooOO0O) {
        this.f7501OooO00o = oooOO0O;
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO00o(int i, int i2) {
        this.f7501OooO00o.notifyItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO0O0(int i, int i2) {
        this.f7501OooO00o.notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    @SuppressLint({"UnknownNullness"})
    public final void OooO0OO(int i, int i2, Object obj) {
        this.f7501OooO00o.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO0Oo(int i, int i2) {
        this.f7501OooO00o.notifyItemMoved(i, i2);
    }
}
