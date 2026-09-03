package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o00000O0 extends RecyclerView.ItemAnimator {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f10831OooO0oO = true;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean OooO00o(@NonNull RecyclerView.o0O0O00 o0o0o00, @Nullable RecyclerView.ItemAnimator.OooO0OO oooO0OO, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO2) {
        int i;
        int i2;
        if (oooO0OO != null && ((i = oooO0OO.f10690OooO00o) != (i2 = oooO0OO2.f10690OooO00o) || oooO0OO.f10691OooO0O0 != oooO0OO2.f10691OooO0O0)) {
            return OooOOOo(o0o0o00, i, oooO0OO.f10691OooO0O0, i2, oooO0OO2.f10691OooO0O0);
        }
        OooOOO(o0o0o00);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean OooO0O0(@NonNull RecyclerView.o0O0O00 o0o0o00, @NonNull RecyclerView.o0O0O00 o0o0o01, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO2) {
        int i;
        int i2;
        int i3 = oooO0OO.f10690OooO00o;
        int i4 = oooO0OO.f10691OooO0O0;
        if (o0o0o01.shouldIgnore()) {
            int i5 = oooO0OO.f10690OooO00o;
            i2 = oooO0OO.f10691OooO0O0;
            i = i5;
        } else {
            i = oooO0OO2.f10690OooO00o;
            i2 = oooO0OO2.f10691OooO0O0;
        }
        return OooOOOO(o0o0o00, o0o0o01, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean OooO0OO(@NonNull RecyclerView.o0O0O00 o0o0o00, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO, @Nullable RecyclerView.ItemAnimator.OooO0OO oooO0OO2) {
        int i = oooO0OO.f10690OooO00o;
        int i2 = oooO0OO.f10691OooO0O0;
        View view = o0o0o00.itemView;
        int left = oooO0OO2 == null ? view.getLeft() : oooO0OO2.f10690OooO00o;
        int top = oooO0OO2 == null ? view.getTop() : oooO0OO2.f10691OooO0O0;
        if (o0o0o00.isRemoved() || (i == left && i2 == top)) {
            OooOOo0(o0o0o00);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return OooOOOo(o0o0o00, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean OooO0Oo(@NonNull RecyclerView.o0O0O00 o0o0o00, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO2) {
        int i = oooO0OO.f10690OooO00o;
        int i2 = oooO0OO2.f10690OooO00o;
        if (i != i2 || oooO0OO.f10691OooO0O0 != oooO0OO2.f10691OooO0O0) {
            return OooOOOo(o0o0o00, i, oooO0OO.f10691OooO0O0, i2, oooO0OO2.f10691OooO0O0);
        }
        OooO0oo(o0o0o00);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean OooO0o(@NonNull RecyclerView.o0O0O00 o0o0o00) {
        return !this.f10831OooO0oO || o0o0o00.isInvalid();
    }

    @SuppressLint({"UnknownNullness"})
    public abstract void OooOOO(RecyclerView.o0O0O00 o0o0o00);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean OooOOOO(RecyclerView.o0O0O00 o0o0o00, RecyclerView.o0O0O00 o0o0o01, int i, int i2, int i3, int i4);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean OooOOOo(RecyclerView.o0O0O00 o0o0o00, int i, int i2, int i3, int i4);

    @SuppressLint({"UnknownNullness"})
    public abstract void OooOOo0(RecyclerView.o0O0O00 o0o0o00);
}
