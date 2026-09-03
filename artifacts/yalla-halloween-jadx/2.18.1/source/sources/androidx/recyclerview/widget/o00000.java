package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00000 extends RecyclerView.ItemAnimator {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f9140OooO0oO = true;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean OooO00o(@NonNull RecyclerView.oo0o0Oo oo0o0oo, @Nullable RecyclerView.ItemAnimator.OooO0OO oooO0OO, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO2) {
        int i;
        int i2;
        if (oooO0OO != null && ((i = oooO0OO.f9014OooO00o) != (i2 = oooO0OO2.f9014OooO00o) || oooO0OO.f9015OooO0O0 != oooO0OO2.f9015OooO0O0)) {
            return OooOOOo(oo0o0oo, i, oooO0OO.f9015OooO0O0, i2, oooO0OO2.f9015OooO0O0);
        }
        OooOOO(oo0o0oo);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean OooO0O0(@NonNull RecyclerView.oo0o0Oo oo0o0oo, @NonNull RecyclerView.oo0o0Oo oo0o0oo2, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO2) {
        int i;
        int i2;
        int i3 = oooO0OO.f9014OooO00o;
        int i4 = oooO0OO.f9015OooO0O0;
        if (oo0o0oo2.shouldIgnore()) {
            int i5 = oooO0OO.f9014OooO00o;
            i2 = oooO0OO.f9015OooO0O0;
            i = i5;
        } else {
            i = oooO0OO2.f9014OooO00o;
            i2 = oooO0OO2.f9015OooO0O0;
        }
        return OooOOOO(oo0o0oo, oo0o0oo2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean OooO0OO(@NonNull RecyclerView.oo0o0Oo oo0o0oo, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO, @Nullable RecyclerView.ItemAnimator.OooO0OO oooO0OO2) {
        int i = oooO0OO.f9014OooO00o;
        int i2 = oooO0OO.f9015OooO0O0;
        View view = oo0o0oo.itemView;
        int left = oooO0OO2 == null ? view.getLeft() : oooO0OO2.f9014OooO00o;
        int top = oooO0OO2 == null ? view.getTop() : oooO0OO2.f9015OooO0O0;
        if (oo0o0oo.isRemoved() || (i == left && i2 == top)) {
            OooOOo0(oo0o0oo);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return OooOOOo(oo0o0oo, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean OooO0Oo(@NonNull RecyclerView.oo0o0Oo oo0o0oo, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO2) {
        int i = oooO0OO.f9014OooO00o;
        int i2 = oooO0OO2.f9014OooO00o;
        if (i != i2 || oooO0OO.f9015OooO0O0 != oooO0OO2.f9015OooO0O0) {
            return OooOOOo(oo0o0oo, i, oooO0OO.f9015OooO0O0, i2, oooO0OO2.f9015OooO0O0);
        }
        OooO0oo(oo0o0oo);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean OooO0o(@NonNull RecyclerView.oo0o0Oo oo0o0oo) {
        return !this.f9140OooO0oO || oo0o0oo.isInvalid();
    }

    public abstract void OooOOO(RecyclerView.oo0o0Oo oo0o0oo);

    public abstract boolean OooOOOO(RecyclerView.oo0o0Oo oo0o0oo, RecyclerView.oo0o0Oo oo0o0oo2, int i, int i2, int i3, int i4);

    public abstract boolean OooOOOo(RecyclerView.oo0o0Oo oo0o0oo, int i, int i2, int i3, int i4);

    public abstract void OooOOo0(RecyclerView.oo0o0Oo oo0o0oo);
}
