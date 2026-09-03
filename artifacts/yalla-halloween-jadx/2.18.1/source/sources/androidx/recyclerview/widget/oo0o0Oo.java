package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo extends o0O0O00 {
    public oo0o0Oo(RecyclerView.Oooo000 oooo000) {
        super(oooo000);
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO() {
        return this.f9196OooO00o.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0O0(View view) {
        return this.f9196OooO00o.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0OO(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f9196OooO00o.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0Oo(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f9196OooO00o.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0o() {
        return this.f9196OooO00o.getHeight();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0o0(View view) {
        return this.f9196OooO00o.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0oO() {
        return this.f9196OooO00o.getHeight() - this.f9196OooO00o.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0oo() {
        return this.f9196OooO00o.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooOO0() {
        return this.f9196OooO00o.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooOO0O() {
        return this.f9196OooO00o.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooOO0o() {
        return (this.f9196OooO00o.getHeight() - this.f9196OooO00o.getPaddingTop()) - this.f9196OooO00o.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooOOO(View view) {
        this.f9196OooO00o.getTransformedBoundingBox(view, true, this.f9198OooO0OO);
        return this.f9198OooO0OO.bottom;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooOOOO(View view) {
        this.f9196OooO00o.getTransformedBoundingBox(view, true, this.f9198OooO0OO);
        return this.f9198OooO0OO.top;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final void OooOOOo(int i) {
        this.f9196OooO00o.offsetChildrenVertical(i);
    }
}
