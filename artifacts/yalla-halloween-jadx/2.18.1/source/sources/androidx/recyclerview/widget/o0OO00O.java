package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O extends o0O0O00 {
    public o0OO00O(RecyclerView.Oooo000 oooo000) {
        super(oooo000);
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO() {
        return this.f9196OooO00o.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0O0(View view) {
        return this.f9196OooO00o.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0OO(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f9196OooO00o.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0Oo(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f9196OooO00o.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0o() {
        return this.f9196OooO00o.getWidth();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0o0(View view) {
        return this.f9196OooO00o.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0oO() {
        return this.f9196OooO00o.getWidth() - this.f9196OooO00o.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0oo() {
        return this.f9196OooO00o.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooOO0() {
        return this.f9196OooO00o.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooOO0O() {
        return this.f9196OooO00o.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooOO0o() {
        return (this.f9196OooO00o.getWidth() - this.f9196OooO00o.getPaddingLeft()) - this.f9196OooO00o.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooOOO(View view) {
        this.f9196OooO00o.getTransformedBoundingBox(view, true, this.f9198OooO0OO);
        return this.f9198OooO0OO.right;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooOOOO(View view) {
        this.f9196OooO00o.getTransformedBoundingBox(view, true, this.f9198OooO0OO);
        return this.f9198OooO0OO.left;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final void OooOOOo(int i) {
        this.f9196OooO00o.offsetChildrenHorizontal(i);
    }
}
